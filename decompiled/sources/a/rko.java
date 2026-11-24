package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class rko extends nko {
    public rko(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f23690a.mark(Integer.MAX_VALUE);
        } else {
            jf4.o("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void c(long j) throws IOException {
        int i = this.b;
        if (i > j) {
            this.b = 0;
            this.f23690a.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public rko(byte[] bArr) {
        super(bArr);
        this.f23690a.mark(Integer.MAX_VALUE);
    }
}
