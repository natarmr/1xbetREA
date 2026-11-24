package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t3k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33272a;
    public final /* synthetic */ v3k b;

    public /* synthetic */ t3k(v3k v3kVar, byte b) {
        this.f33272a = b;
        this.b = v3kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hcg0 hcg0Var;
        byte b = this.f33272a;
        v3k v3kVar = this.b;
        switch (b) {
            case 0:
                icg0 icg0Var = (icg0) mbc.R(v3kVar, lcg0.f19798a);
                p13 p13Var = v3kVar.u;
                if (icg0Var == null) {
                    if (p13Var != null) {
                        v3kVar.a1(p13Var);
                    }
                    v3kVar.u = null;
                } else if (p13Var == null) {
                    u3k u3kVar = new u3k(v3kVar, (byte) 0);
                    t3k t3kVar = new t3k(v3kVar, (byte) 1);
                    gy40 gy40Var = v3kVar.q;
                    boolean z = v3kVar.r;
                    float f = v3kVar.s;
                    uts0 uts0Var = mcg0.f21550a;
                    p13 p13Var2 = new p13(gy40Var, z, f, u3kVar, t3kVar);
                    v3kVar.Z0(p13Var2);
                    v3kVar.u = p13Var2;
                }
                return Unit.f46060a;
            default:
                icg0 icg0Var2 = (icg0) mbc.R(v3kVar, lcg0.f19798a);
                return (icg0Var2 == null || (hcg0Var = icg0Var2.b) == null) ? i120.k : hcg0Var;
        }
    }
}
