package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y6s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42114a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ y6s(mie0 mie0Var, Object obj, z63 z63Var, t73 t73Var, l73 l73Var, float f, Function1 function1) {
        this.d = mie0Var;
        this.e = obj;
        this.f = z63Var;
        this.g = t73Var;
        this.h = l73Var;
        this.b = f;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42114a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj5;
                l7m0 l7m0Var = (l7m0) this.e;
                xak xakVar = (xak) obj3;
                nek nekVar = (nek) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                tre0 tre0Var = sre0.f32672a;
                String strJ = tre0Var.b(asr.class).J();
                sgy sgyVarB = tre0Var.b(asr.class);
                Function1 function2 = this.c;
                float f = this.b;
                hczVar.d(strJ, sgyVarB, new ugd(-1583873522, true, new tp7(function2, function1, f, l7m0Var)));
                a4x a4xVar = (a4x) ((l7m0) obj4).getValue();
                hczVar.f(a4xVar.size(), new d2p(new t4s((byte) 1), a4xVar, (byte) 13), new ubn(a4xVar, (byte) 4), new ugd(2039820996, true, new d7s(a4xVar, function1, xakVar, nekVar, f)));
                break;
            default:
                z63 z63Var = (z63) obj4;
                l73 l73Var = (l73) obj2;
                long jLongValue = ((Long) obj).longValue();
                lxs0 lxs0VarE = z63Var.e();
                Object objG = z63Var.g();
                xmn0 xmn0Var = new xmn0(l73Var, (byte) 1);
                i73 i73Var = new i73(this.e, lxs0VarE, (t73) obj3, jLongValue, objG, jLongValue, xmn0Var);
                hhm0.t(i73Var, jLongValue, this.b, z63Var, l73Var, this.c);
                ((mie0) obj5).f21842a = i73Var;
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ y6s(Function1 function1, Function1 function2, float f, l7m0 l7m0Var, l7m0 l7m0Var2, xak xakVar, nek nekVar) {
        this.c = function1;
        this.d = function2;
        this.b = f;
        this.e = l7m0Var;
        this.f = l7m0Var2;
        this.g = xakVar;
        this.h = nekVar;
    }
}
