package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ez20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8653a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ez20(l7m0 l7m0Var, l7m0 l7m0Var2, float f, float f2) {
        this.f8653a = (byte) 2;
        this.b = l7m0Var;
        this.e = l7m0Var2;
        this.c = f;
        this.d = f2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f8653a;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                kz20 kz20Var = (kz20) obj5;
                Function1 function1 = (Function1) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (zBooleanValue) {
                    fetVar.e0(-480399931);
                    bsr0.j(6, 0, fetVar, o7k0.c);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-480210366);
                    j2e.l(o7k0.c, kz20Var, this.c, this.d, function1, b34.j, b34.k, fetVar, 1769478);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                kz20 kz20Var2 = (kz20) obj5;
                Function1 function2 = (Function1) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var) ? 4 : 2;
                }
                int i = iIntValue2;
                if (fetVar2.U(i & 1, (i & 19) != 18)) {
                    jwb.e(Boolean.valueOf(kz20Var2.f), mm40Var, ro4.m0(Response.OK, 0, null, 6), null, u1c.M(1645828142, new ez20(kz20Var2, this.c, this.d, function2, (byte) 0), fetVar2), fetVar2, ((i << 3) & 112) | 24960, 8);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                l7m0 l7m0Var = (l7m0) obj4;
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                int iT = vj30Var.T(l7x.O(this.c, this.d, ((Boolean) ((l7m0) obj5).getValue()).booleanValue() ? 0.0f : ((Number) l7m0Var.getValue()).floatValue()));
                if (iT < 0) {
                    iT = 0;
                }
                long j = p4eVar.f26347a;
                int iJ = p4e.j(j) - iT;
                int i2 = iJ < 0 ? 0 : iJ;
                int iH = p4e.h(p4eVar.f26347a) - iT;
                pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, 0, i2, iH < 0 ? 0 : iH, 3));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b + iT, new n7(pu90VarS, iT, (byte) 2));
        }
    }

    public /* synthetic */ ez20(kz20 kz20Var, float f, float f2, Function1 function1, byte b) {
        this.f8653a = b;
        this.b = kz20Var;
        this.c = f;
        this.d = f2;
        this.e = function1;
    }
}
