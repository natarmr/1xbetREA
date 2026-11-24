package a;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class d9x0 implements p9x0 {
    @Override // a.p9x0
    public final h9x0 a(Uri uri) throws l52 {
        File fileR = zcm0.r(uri);
        return new h9x0(new FileInputStream(fileR), fileR);
    }

    @Override // a.p9x0
    public final OutputStream b(Uri uri) throws IOException {
        File fileR = zcm0.r(uri);
        kbc.P(fileR);
        return new i9x0(new FileOutputStream(fileR), fileR);
    }

    @Override // a.p9x0
    public final void c(Uri uri) throws IOException {
        File fileR = zcm0.r(uri);
        if (fileR.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileR.delete()) {
            return;
        }
        if (!fileR.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // a.p9x0
    public final void d(Uri uri, Uri uri2) throws IOException {
        File fileR = zcm0.r(uri);
        File fileR2 = zcm0.r(uri2);
        kbc.P(fileR2);
        if (!fileR.renameTo(fileR2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // a.p9x0
    public final String zzc() {
        return "file";
    }
}
