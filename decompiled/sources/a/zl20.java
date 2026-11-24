package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zl20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44561a;
    public final /* synthetic */ cit0 b;

    public /* synthetic */ zl20(cit0 cit0Var, byte b) {
        this.f44561a = b;
        this.b = cit0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44561a;
        cit0 cit0Var = this.b;
        switch (b) {
            case 0:
                b820 b820Var = (b820) obj2;
                czc0 czc0Var = b820Var.e;
                return b820.a(b820Var, null, null, null, null, czc0Var != null ? czc0.a(czc0Var, tyc0.a(czc0Var.f5218a, null, false, !cit0Var.O.isEmpty(), 31), null, false, false, 30) : null, null, null, false, false, false, false, false, 8175);
            default:
                a820 a820Var = (a820) obj2;
                dzc0 dzc0Var = a820Var.f;
                return a820.a(a820Var, null, null, null, null, dzc0.a(dzc0Var, syc0.a(dzc0Var.f6938a, null, false, !cit0Var.O.isEmpty(), 31), null, false, false, false, 62), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111);
        }
    }
}
