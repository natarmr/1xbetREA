package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xs8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41404a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xs8(et8 et8Var, vne vneVar, boolean z, float f) {
        this.d = et8Var;
        this.e = vneVar;
        this.b = z;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer numValueOf;
        int i;
        byte b = this.f41404a;
        float f = this.c;
        boolean z = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                et8 et8Var = (et8) obj3;
                vne vneVar = (vne) obj2;
                g6u0 g6u0Var = (g6u0) obj;
                int iB = (int) g6u0.b(g6u0Var.f10786a);
                zr8 zr8Var = et8Var.b;
                yje yjeVar = null;
                if (zr8Var != null) {
                    zr8Var.J = false;
                    if (iB < -900) {
                        i = zr8Var.x + 1;
                    } else if (iB > 900) {
                        i = zr8Var.x - 1;
                    } else {
                        double d = zr8Var.K % 1.0f;
                        int i2 = zr8Var.L;
                        i = d > 0.5d ? i2 + 1 : i2;
                    }
                    int size = zr8Var.h.size() - 1;
                    if (i > size) {
                        i = size;
                    }
                    numValueOf = Integer.valueOf(zr8Var.h(i > 0 ? i : 0));
                } else {
                    numValueOf = null;
                }
                boolean z2 = this.b;
                if (numValueOf != null) {
                    qjj.W(vneVar, null, null, new ys8((Object) et8Var, (Object) numValueOf, z2, yjeVar, (byte) 0), 3);
                } else {
                    qjj.W(vneVar, null, null, new zs8(iB, this.c, g6u0Var, et8Var, z2, null), 3);
                }
                break;
            case 1:
                a4x a4xVar = (a4x) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new d2p(new s3t((byte) 11), a4xVar, (byte) 17), new far(a4xVar, (byte) 12), new ugd(2039820996, true, new tiv(a4xVar, z, (String) obj2, f)));
                break;
            default:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = ((o1e0) obj3).f24475a;
                hczVar2.f(a4xVar2.size(), new d1c0(xdx.E(a4xVar2, new bod0((byte) 13)), (byte) 7), new d1c0(a4xVar2, (byte) 8), new ugd(-1311333631, true, new tiv(a4xVar2, z, f, (Function1) obj2)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xs8(a4x a4xVar, boolean z, String str, float f) {
        this.d = a4xVar;
        this.b = z;
        this.e = str;
        this.c = f;
    }

    public /* synthetic */ xs8(o1e0 o1e0Var, boolean z, float f, Function1 function1) {
        this.d = o1e0Var;
        this.b = z;
        this.c = f;
        this.e = function1;
    }
}
