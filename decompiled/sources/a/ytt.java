package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ytt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oue0 f43236a;

    public ytt(oue0 oue0Var, byte b) {
        oue0Var.getClass();
        switch (b) {
            case 1:
                this.f43236a = oue0Var;
                break;
            default:
                this.f43236a = oue0Var;
                break;
        }
    }

    public Object a(aue0 aue0Var, yje yjeVar) {
        Object objB = this.f43236a.f.b(aue0Var, yjeVar);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }
}
