package a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u8x0 extends k9x0 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35254a;

    public u8x0(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f35254a = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f35254a.iterator();
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

    @Override // a.k9x0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f35254a.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                hny.b();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f35254a.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }

    @Override // a.k9x0, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f35254a.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
    }
}
