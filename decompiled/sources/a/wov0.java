package a;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class wov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fpv0 f39517a;
    public final ezb0 b;
    public final upv0 c;

    static {
        wv00.h("WMFgUpdater");
    }

    public wov0(WorkDatabase workDatabase, ezb0 ezb0Var, fpv0 fpv0Var) {
        this.b = ezb0Var;
        this.f39517a = fpv0Var;
        this.c = workDatabase.y();
    }
}
