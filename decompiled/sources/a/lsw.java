package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lsw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20601a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ nsw c;

    public /* synthetic */ lsw(mm40 mm40Var, nsw nswVar, int i) {
        this.f20601a = (byte) 1;
        this.b = mm40Var;
        this.c = nswVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20601a;
        byte b2 = 2;
        nsw nswVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    obc.d(hsw.f13604a.a(fetVar.k(bmd.n)), u1c.M(-531994755, new lsw(mm40Var, nswVar, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                vfc.x(mm40Var, nswVar, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    vcc.p(6, fetVar2, o7k0.d(jm40.b, 1.0f), nswVar.f24070a, nswVar.b);
                    boolean zG = fetVar2.g(nswVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new adw(nswVar, (byte) 4);
                        fetVar2.o0(objP);
                    }
                    b8k0.e(null, null, null, null, null, null, false, null, (Function1) objP, fetVar2, 0, 511);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lsw(mm40 mm40Var, nsw nswVar, byte b) {
        this.f20601a = b;
        this.b = mm40Var;
        this.c = nswVar;
    }
}
