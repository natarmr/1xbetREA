package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class fb3 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f9237a;
    public final /* synthetic */ lwf b;
    public final /* synthetic */ nie0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb3(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, l7m0 l7m0Var, float f, Function1 function1, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        super(3);
        this.f9237a = pz40Var;
        this.b = lwfVar;
        this.c = nie0Var;
        this.d = l7m0Var;
        this.e = f;
        this.f = function1;
        this.g = l7m0Var2;
        this.h = l7m0Var3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        Unit unit = Unit.f46060a;
        this.f9237a.setValue(unit);
        this.b.getClass();
        nie0 nie0Var = this.c;
        if (nie0Var.f23583a == cmd.f4598a) {
            nie0Var.f23583a = cmd.b;
        }
        fetVar.e0(-1848127492);
        jm40 jm40Var = jm40.b;
        mm40 mm40VarK0 = mrv.k0(o7k0.d(jm40Var, 1.0f), lt40.f20613a);
        byte b = 0;
        tj30 tj30VarC = zq8.c(gqw0.b, false);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
        j47.N(this.g, fetVar, 0);
        n0q n0qVar = o7k0.c;
        l7m0 l7m0Var = this.h;
        boolean zG = fetVar.g(l7m0Var);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = new eb3(l7m0Var, b);
            fetVar.o0(objP);
        }
        zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
        fetVar.r(true);
        l7m0 l7m0Var2 = this.d;
        j47.r0(((t9f0) l7m0Var2.getValue()).f33560a, fetVar, 0);
        if (((t9f0) l7m0Var2.getValue()).d) {
            fetVar.e0(-1847428319);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK1 = mrv.k0(o7k0.e(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), 48.0f), lt40.c);
            vxl vxlVar = vxl.c;
            a4x a4xVar = ((t9f0) l7m0Var2.getValue()).e;
            float f = this.e;
            fyl fylVar = new fyl(a4xVar, null, null, s5x0.u(f, 0.0f, f, 0.0f, 10), null, 6);
            Function1 function1 = this.f;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new qr0(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            ebc.r(mm40VarK1, fylVar, vxlVar, (Function1) objP2, null, fetVar, 384, 40);
            fetVar.r(false);
        } else {
            fetVar.e0(-1846571634);
            fetVar.r(false);
        }
        fetVar.r(false);
        return unit;
    }
}
