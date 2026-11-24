package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tfp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33877a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a5a0 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ tfp(mm40 mm40Var, a5a0 a5a0Var, Function2 function2, int i) {
        this.b = mm40Var;
        this.c = a5a0Var;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33877a;
        Function2 function2 = this.d;
        a5a0 a5a0Var = this.c;
        mm40 mm40Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = a5a0Var.c;
                    boolean zH = fetVar.h(z);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zH || objP == cl5Var) {
                        objP = z ? new x9p(R.drawable.ic_glyph_favourite_active, d4d.STATIC_WHITE, d4d.PRIMARY) : new x9p(R.drawable.ic_glyph_favourite_inactive, d4d.STATIC_WHITE80, d4d.PRIMARY80);
                        fetVar.o0(objP);
                    }
                    x9p x9pVar = (x9p) objP;
                    l7m0 l7m0VarB = m5k0.b(ibc.Y(x9pVar.c, fetVar), null, fetVar, 0, 14);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
                    boolean zG = fetVar.g(l7m0VarB);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new ufp(l7m0VarB, b2);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarJ = lgb.J(rq8.K(mm40VarN, (Function1) objP2), vgg0.f37379a);
                    boolean zG2 = fetVar.g(function2) | fetVar.g(a5a0Var);
                    Object objP3 = fetVar.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new gmo(function2, a5a0Var, (byte) 10);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP3, 28);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    j0x.b(iom0.r(jpm0.t(x9pVar.f40519a, 6, fetVar), fetVar), null, o7k0.n(jm40.b, 14.0f), null, null, 0.0f, null, fetVar, 56, 120);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xkb.t(mm40Var, a5a0Var, function2, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tfp(a5a0 a5a0Var, mm40 mm40Var, Function2 function2) {
        this.c = a5a0Var;
        this.b = mm40Var;
        this.d = function2;
    }
}
