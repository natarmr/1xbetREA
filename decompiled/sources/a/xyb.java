package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f41699a;

    public xyb(pbt pbtVar) {
        pbtVar.getClass();
        this.f41699a = pbtVar;
    }

    public final boolean a() {
        pbt pbtVar = this.f41699a;
        ql5 ql5Var = pbtVar.f26724a.q;
        Long lValueOf = ql5Var != null ? Long.valueOf(ql5Var.f28916a) : null;
        ql5 ql5Var2 = pbtVar.f26724a.r;
        return !Intrinsics.d(lValueOf, ql5Var2 != null ? Long.valueOf(ql5Var2.f28916a) : null);
    }
}
