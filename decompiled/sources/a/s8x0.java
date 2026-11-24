package a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s8x0 extends j9x0 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31825a;

    public s8x0(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f31825a = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f31825a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                hny.b();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.f31825a.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
        }
        return i;
    }

    @Override // a.j9x0, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.f31825a.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.f31825a.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
        }
        return i3;
    }
}
