package a;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class h9x0 extends j9x0 implements e9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f12699a;

    public h9x0(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f12699a = file;
    }

    @Override // a.e9x0
    public final File zza() {
        return this.f12699a;
    }
}
