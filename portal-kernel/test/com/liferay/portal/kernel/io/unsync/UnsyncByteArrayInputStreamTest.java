/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.kernel.io.unsync;

import com.liferay.portal.kernel.test.TestCase;

/**
 * <a href="UnsyncByteArrayInputStreamTest.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Shuyang Zhou
 */
public class UnsyncByteArrayInputStreamTest extends TestCase {

	public void testBlockRead() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		int bufferSize = _BUFFER_SIZE * 2 / 3;

		byte[] buffer = new byte[bufferSize];

		int number = ubais.read(buffer);

		assertEquals(bufferSize, number);

		for (int i = 0; i < number; i++) {
			assertEquals(i, buffer[i]);
		}

		number = ubais.read(buffer);

		assertEquals(_BUFFER_SIZE - bufferSize, number);

		for (int i = 0; i < number; i++) {
			assertEquals(i + bufferSize, buffer[i]);
		}
	}

	public void testConstructor() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		assertEquals(_BUFFER_SIZE, ubais.available());

		ubais = new UnsyncByteArrayInputStream(
			_BUFFER, _BUFFER_SIZE / 2, _BUFFER_SIZE / 2);

		assertEquals(_BUFFER_SIZE / 2, ubais.available());
	}

	public void testMarkAndReset() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		assertEquals(0, ubais.read());
		assertEquals(1, ubais.read());

		ubais.mark(-1);

		assertEquals(_BUFFER_SIZE - 2, ubais.available());
		assertEquals(2, ubais.read());
		assertEquals(3, ubais.read());
		assertEquals(_BUFFER_SIZE - 4, ubais.available());

		ubais.reset();

		assertEquals(_BUFFER_SIZE - 2, ubais.available());
		assertEquals(2, ubais.read());
		assertEquals(3, ubais.read());

		assertEquals(_BUFFER_SIZE - 4, ubais.available());
	}

	public void testMarkSupported() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		assertTrue(ubais.markSupported());
	}

	public void testRead() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		for (int i = 0; i < _BUFFER_SIZE; i++) {
			assertEquals(i, ubais.read());
		}

		assertEquals(-1, ubais.read());
	}

	public void testSkip() {
		UnsyncByteArrayInputStream ubais = new UnsyncByteArrayInputStream(
			_BUFFER);

		long bufferSize = _BUFFER_SIZE * 2 / 3;

		assertEquals(bufferSize, ubais.skip(bufferSize));
		assertEquals(_BUFFER_SIZE - bufferSize, ubais.available());
		assertEquals(_BUFFER_SIZE - bufferSize, ubais.skip(bufferSize));
		assertEquals(0, ubais.available());
	}

	private static final int _BUFFER_SIZE = 10;

	private static final byte[] _BUFFER = new byte[_BUFFER_SIZE];

	static {
		for (int i = 0; i < _BUFFER_SIZE; i++) {
			_BUFFER[i] = (byte)i;
		}
	}

}