package a;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class mko extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21952a;
    public final /* synthetic */ rko b;

    public mko(rko rkoVar) {
        this.b = rkoVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        rko rkoVar = this.b;
        DataInputStream dataInputStream = rkoVar.f23690a;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.f21952a;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        rkoVar.c(j);
                        this.f21952a = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = rkoVar.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f21952a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f21952a = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
