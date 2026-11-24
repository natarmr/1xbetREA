package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ai2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f904a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ bch0 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ ai2(mm40 mm40Var, boolean z, float f, bch0 bch0Var, pz40 pz40Var, Function1 function1, byte b) {
        this.f904a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = f;
        this.e = bch0Var;
        this.f = pz40Var;
        this.g = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f904a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.g;
        pz40 pz40Var = this.f;
        bch0 bch0Var = this.e;
        float f = this.d;
        boolean z = this.c;
        mm40 mm40Var = this.b;
        byte b2 = 1;
        boolean z2 = false;
        switch (b) {
            case 0:
                xcz xczVar = (xcz) bch0Var;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE0 = o2e.e0(mm40Var.e(o7k0.c), "ALT_FAVORITE_SPORT_TEAMS_LAZY_ROW");
                    boolean z3 = !z;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(xfn.a(fetVar).d, f, xfn.a(fetVar).d, 24.0f, fetVar);
                    boolean zG = fetVar.g(pz40Var) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new jg2(pz40Var, function1, b2);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarE0, xczVar, ch80VarF, null, null, null, z3, null, (Function1) objP, fetVar, 0, 376);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                xcz xczVar2 = (xcz) bch0Var;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    boolean z4 = !z;
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarF2 = h97.f(xfn.a(fetVar2).d, f, xfn.a(fetVar2).d, 24.0f, fetVar2);
                    boolean zG2 = fetVar2.g(pz40Var) | fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new jg2(pz40Var, function1, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    b8k0.e(mm40VarE, xczVar2, ch80VarF2, null, null, null, z4, null, (Function1) objP2, fetVar2, 0, 376);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                d9z d9zVar = (d9z) bch0Var;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarE2 = mm40Var.e(o7k0.c);
                    boolean z5 = !z;
                    ngv ngvVar = new ngv(2);
                    zcl zclVar3 = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    ch80 ch80VarF3 = h97.f(xfn.a(fetVar3).d, f, xfn.a(fetVar3).d, 24.0f, fetVar3);
                    boolean zG3 = fetVar3.g(pz40Var) | fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new jg2(pz40Var, function1, z2 ? (byte) 1 : (byte) 0);
                        fetVar3.o0(objP3);
                    }
                    g8x.i(ngvVar, mm40VarE2, d9zVar, ch80VarF3, null, qw3Var, null, z5, null, (Function1) objP3, fetVar3, 0, 688);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
