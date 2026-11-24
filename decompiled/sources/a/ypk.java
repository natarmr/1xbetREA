package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class ypk extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f43034a;
    public final /* synthetic */ lwf b;
    public final /* synthetic */ nie0 c;
    public final /* synthetic */ msk d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypk(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, msk mskVar, l7m0 l7m0Var, Function1 function1, l7m0 l7m0Var2, Function0 function0, Function0 function2) {
        super(3);
        this.f43034a = pz40Var;
        this.b = lwfVar;
        this.c = nie0Var;
        this.d = mskVar;
        this.e = l7m0Var;
        this.f = function1;
        this.g = l7m0Var2;
        this.h = function0;
        this.i = function2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        Unit unit = Unit.f46060a;
        this.f43034a.setValue(unit);
        this.b.getClass();
        nie0 nie0Var = this.c;
        if (nie0Var.f23583a == cmd.f4598a) {
            nie0Var.f23583a = cmd.b;
        }
        fetVar.e0(166855114);
        mm40 mm40VarK0 = mrv.k0(o7k0.d(jm40.b, 1.0f), gt40.f11864a);
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
        msk mskVar = this.d;
        String str = mskVar.f22324a;
        ppk ppkVar = mskVar.d;
        xf0.o(mskVar.b, 0, fetVar, str);
        n0q n0qVar = o7k0.c;
        l7m0 l7m0Var = this.g;
        boolean zG = fetVar.g(l7m0Var);
        Object objP = fetVar.P();
        byte b = 1;
        if (zG || objP == ukd.f35823a) {
            objP = new eb3(l7m0Var, b);
            fetVar.o0(objP);
        }
        zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
        xf0.s(this.d, this.g, this.e, this.h, this.i, fetVar, 384);
        fetVar.r(true);
        xf0.E(mskVar.c, fetVar, 0);
        if ((ppkVar instanceof npk) && ((Boolean) this.e.getValue()).booleanValue()) {
            fetVar.e0(167857436);
            xf0.i((npk) ppkVar, this.f, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(167991015);
            fetVar.r(false);
        }
        fetVar.r(false);
        return unit;
    }
}
