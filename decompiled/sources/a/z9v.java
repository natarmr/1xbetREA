package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z9v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44040a = 2;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ z9v(float f, Function1 function1, pz40 pz40Var, w6k w6kVar, vz2 vz2Var, vo10 vo10Var, pz40 pz40Var2, pz40 pz40Var3) {
        this.c = f;
        this.d = function1;
        this.e = pz40Var;
        this.f = w6kVar;
        this.g = vz2Var;
        this.h = vo10Var;
        this.b = pz40Var2;
        this.i = pz40Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44040a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ibc.x((th90) obj8, (x9v) obj7, (x9v) obj6, (w9v) obj5, (String) obj4, this.c, this.b, (Function2) obj3, (fet) obj, x8x.L(14155777));
                break;
            case 1:
                ((Integer) obj2).getClass();
                obc.G((gav) obj8, (gav) obj7, this.b, (l7m0) obj6, (v9v) obj5, this.c, (k6z) obj4, (Function0) obj3, (fet) obj, x8x.L(12586369));
                break;
            default:
                Function1 function1 = (Function1) obj8;
                pz40 pz40Var = (pz40) obj7;
                w6k w6kVar = (w6k) obj6;
                vz2 vz2Var = (vz2) obj5;
                vo10 vo10Var = (vo10) obj4;
                pz40 pz40Var2 = (pz40) this.b;
                pz40 pz40Var3 = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zx7 zx7Var = gqw0.b;
                    jr8 jr8Var = jr8.f16991a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarO = ny9.O(1.0f, o7k0.d(s5x0.N(jr8Var.b(jm40Var, zx7Var), 0.0f, this.c * 0.11780322f, 0.0f, 0.0f, 13), 0.81707436f), false);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new y9v(pz40Var, (byte) 15);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarY = fre0.Y(mm40VarO, (Function1) objP);
                    boolean zG = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new lj00(function1, (byte) 11);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarD0 = ro4.d0(mm40VarY, (Function1) objP2);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD0);
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
                    float fS0 = w6kVar.s0(((Number) pz40Var.getValue()).intValue() * 0.07165486f);
                    y0x0.C(((Number) pz40Var2.getValue()).floatValue(), vz2Var, vo10Var.d, fetVar, 6);
                    y0x0.y(((Number) pz40Var2.getValue()).floatValue(), ((Number) pz40Var3.getValue()).floatValue(), fetVar, 6);
                    j0x.b(a8k0.F(R.drawable.ic_wheel_center, 0, fetVar), null, jr8Var.b(ny9.O(1.0f, o7k0.d(jm40Var, 0.2f), false), gqw0.e), null, null, 0.0f, null, fetVar, 56, 120);
                    j0x.b(a8k0.F(R.drawable.ic_wheel_pin, 0, fetVar), null, ffb0.R(jr8Var.b(ny9.O(1.4518518f, o7k0.c(jm40Var, 0.13433346f), true), gqw0.f), fS0, 0.0f, 2), null, gqw0.B, 0.0f, null, fetVar, 24632, 104);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z9v(gav gavVar, gav gavVar2, l7m0 l7m0Var, l7m0 l7m0Var2, v9v v9vVar, float f, k6z k6zVar, Function0 function0, int i) {
        this.d = gavVar;
        this.e = gavVar2;
        this.b = l7m0Var;
        this.f = l7m0Var2;
        this.g = v9vVar;
        this.c = f;
        this.h = k6zVar;
        this.i = function0;
    }

    public /* synthetic */ z9v(th90 th90Var, x9v x9vVar, x9v x9vVar2, w9v w9vVar, String str, float f, l7m0 l7m0Var, Function2 function2, int i) {
        this.d = th90Var;
        this.e = x9vVar;
        this.f = x9vVar2;
        this.g = w9vVar;
        this.h = str;
        this.c = f;
        this.b = l7m0Var;
        this.i = function2;
    }
}
