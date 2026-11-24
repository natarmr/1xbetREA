package a;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class nzp implements avc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f24384a;
    public final mhi0 b;
    public final AtomicBoolean c;

    public nzp(File file, mhi0 mhi0Var) {
        mhi0Var.getClass();
        this.f24384a = file;
        this.b = mhi0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // a.avc
    public final void close() {
        this.c.set(true);
    }
}
