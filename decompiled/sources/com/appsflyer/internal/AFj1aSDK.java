package com.appsflyer.internal;

import a.jf4;
import a.twn;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK extends FilterInputStream {
    private static final short registerClient = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFKeystoreWrapper;
    private byte[] AFLogger;
    private int AFLoggerLogLevel;
    private final int afDebugLog;
    private final int afErrorLog;
    private int afInfoLog;
    private int afWarnLog;
    private byte[] d;
    private int e;
    private int force;
    private int getEntries;
    private int i;
    private int unregisterClient;
    private int v;
    private int w;

    private AFj1aSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.force = Integer.MAX_VALUE;
        this.getEntries = 1;
        this.AFLogger = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.d = new byte[8];
        this.unregisterClient = 8;
        this.w = 8;
        this.v = Math.min(Math.max(i2, 5), 16);
        this.i = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i == 0) {
            this.e = (int) j;
            long j2 = j >> 3;
            short s = registerClient;
            this.AFLoggerLogLevel = (int) ((((long) s) * j2) >> 32);
            this.afInfoLog = (int) (j >> 32);
            this.afWarnLog = (int) (j2 + ((long) s));
        } else {
            int i4 = (int) j;
            this.e = i4;
            this.AFLoggerLogLevel = i4 * i;
            this.afInfoLog = i ^ i4;
            this.afWarnLog = (int) (j >> 32);
        }
        this.afErrorLog = 100;
        this.afDebugLog = 100;
    }

    private int AFKeystoreWrapper() throws IOException {
        int i = this.force;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.force = i;
        }
        if (this.unregisterClient == 8) {
            this.AFLogger[0] = (byte) i;
            if (i < 0) {
                jf4.n("unexpected block size");
                return 0;
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.AFLogger, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                jf4.n("unexpected block size");
                return 0;
            }
            int i4 = this.afErrorLog;
            if (i4 == this.afDebugLog) {
                unregisterClient();
            } else {
                if (this.getEntries <= i4) {
                    unregisterClient();
                }
                int i5 = this.getEntries;
                if (i5 < this.afDebugLog) {
                    this.getEntries = i5 + 1;
                } else {
                    this.getEntries = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.force = i6;
            this.unregisterClient = 0;
            this.w = i6 < 0 ? 8 - (this.AFLogger[7] & 255) : 8;
        }
        return this.w;
    }

    private void unregisterClient() {
        if (this.i == 3) {
            byte[] bArr = this.AFLogger;
            System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        }
        byte[] bArr2 = this.AFLogger;
        boolean z = true;
        char c = 2;
        int iB = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int iB2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i = 0;
        while (true) {
            int i2 = this.v;
            if (i >= i2) {
                break;
            }
            short s = registerClient;
            iB2 -= (twn.b(i2, i, s, iB) ^ ((iB << 4) + this.afInfoLog)) ^ ((iB >>> 5) + this.afWarnLog);
            iB -= (twn.b(i2, i, s, iB2) ^ ((iB2 << 4) + this.e)) ^ ((iB2 >>> 5) + this.AFLoggerLogLevel);
            i++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.AFLogger;
        bArr3[0] = (byte) (iB >> 24);
        bArr3[z ? 1 : 0] = (byte) (iB >> 16);
        bArr3[c] = (byte) (iB >> 8);
        bArr3[3] = (byte) iB;
        bArr3[4] = (byte) (iB2 >> 24);
        bArr3[5] = (byte) (iB2 >> 16);
        bArr3[6] = (byte) (iB2 >> 8);
        bArr3[7] = (byte) iB2;
        if (this.i == 3) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.AFLogger;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.AFKeystoreWrapper[i3]);
            }
            byte[] bArr5 = this.d;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.w - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.unregisterClient;
            if (i5 >= this.w) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFLogger;
            this.unregisterClient = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.unregisterClient;
        if (i >= this.w) {
            return -1;
        }
        byte[] bArr = this.AFLogger;
        this.unregisterClient = i + 1;
        return bArr[i] & 255;
    }

    public AFj1aSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }
}
