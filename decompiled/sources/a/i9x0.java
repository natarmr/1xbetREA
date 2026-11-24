package a;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i9x0 extends k9x0 implements e9x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f14411a;
    public final File b;

    public i9x0(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f14411a = fileOutputStream;
        this.b = file;
    }

    @Override // a.e9x0
    public final File zza() {
        return this.b;
    }
}
