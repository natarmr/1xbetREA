package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class vpu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o470 f37824a;

    public /* synthetic */ vpu(o470 o470Var) {
        this.f37824a = o470Var;
    }

    public fnq a() {
        fnd0 fnd0Var = (fnd0) this.f37824a.f24619a;
        return new fnq(fnd0Var.b, new k6d0(fnd0Var, null, (byte) 5));
    }

    public Object b(boolean z, yje yjeVar) {
        Object objB = ((fnd0) this.f37824a.f24619a).b(z, yjeVar);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }
}
