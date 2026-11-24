package a;

import java.io.FilterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j9x0 extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
