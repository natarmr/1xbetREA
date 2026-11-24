package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jcd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16270a;
    public final /* synthetic */ o3w b;

    public /* synthetic */ jcd(o3w o3wVar, byte b) {
        this.f16270a = b;
        this.b = o3wVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f16270a;
        pcy pcyVar = e7z.u1;
        o3w o3wVar = this.b;
        u63 u63Var = (u63) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                u63Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.b0(714778937, o3wVar.f24605a + "TAX_COLUMN_REMEMBER_ID");
                    fetVar.e0(714783476);
                    for (f3w f3wVar : o3wVar.c) {
                        zcl zclVar = qmk.f28987a;
                        jcb.a(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), f3wVar, fetVar, 0, 0);
                    }
                    ohs0.x(fetVar, false, false, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                u63Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1, gqw0.v);
                    fetVar.b0(-171641322, o3wVar.f24605a + "FULL_TAX_COLUMN_REMEMBER_ID");
                    fetVar.e0(-171636783);
                    for (f3w f3wVar2 : o3wVar.c) {
                        zcl zclVar2 = qmk.f28987a;
                        hp4.c(s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13), f3wVar2, fetVar, 0);
                    }
                    ohs0.x(fetVar, false, false, true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
