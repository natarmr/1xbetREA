package a;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class krv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18787a;
    public boolean b;
    public final p7m0 c = q7m0.a(null);

    public final void a(File file, BufferedInputStream bufferedInputStream, long j, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            byte[] bArr2 = new byte[8192];
            int i = 0;
            while (i != -1) {
                if (!this.b) {
                    if (this.f18787a) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, i);
                    i = bufferedInputStream.read(bArr2);
                    this.c.o(null, Integer.valueOf(si30.b((file.length() * 100.0f) / j)));
                } else {
                    this.b = false;
                    bufferedInputStream.read(bArr2);
                    if (!Arrays.equals(bArr2, bArr)) {
                        throw new qoe();
                    }
                }
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
