package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class e9o extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7430a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ lwf c;
    public final /* synthetic */ nie0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9o(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, Object obj, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, byte b) {
        super(3);
        this.f7430a = b;
        this.b = pz40Var;
        this.c = lwfVar;
        this.d = nie0Var;
        this.h = obj;
        this.e = l7m0Var;
        this.f = l7m0Var2;
        this.g = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f7430a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cmd cmdVar = cmd.b;
        cmd cmdVar2 = cmd.f4598a;
        nie0 nie0Var = this.d;
        lwf lwfVar = this.c;
        pz40 pz40Var = this.b;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                ((Number) obj3).intValue();
                f9o f9oVar = (f9o) obj4;
                Unit unit = Unit.f46060a;
                pz40Var.setValue(unit);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar.e0(-505840637);
                mm40 mm40VarK0 = mrv.k0(o7k0.d(jm40Var, 1.0f), mt40.f22354a);
                tj30 tj30VarC = zq8.c(gqw0.b, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                b34.j(f9oVar.c, 0, fetVar, f9oVar.b);
                n0q n0qVar = o7k0.c;
                l7m0 l7m0Var = this.e;
                boolean zG = fetVar.g(l7m0Var);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new eb3(l7m0Var, (byte) 2);
                    fetVar.o0(objP);
                }
                zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
                b34.E(f9oVar.f9163a, l7m0Var, this.f, this.g, fetVar, 0);
                fetVar.r(true);
                b34.Q(f9oVar.f9163a, fetVar, 0);
                fetVar.r(false);
                return unit;
            default:
                fet fetVar2 = (fet) obj2;
                ((Number) obj3).intValue();
                wpu0 wpu0Var = (wpu0) obj4;
                Unit unit2 = Unit.f46060a;
                pz40Var.setValue(unit2);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar2.e0(1398164324);
                mm40 mm40VarK1 = mrv.k0(o7k0.d(jm40Var, 1.0f), kt40.f18846a);
                tj30 tj30VarC2 = zq8.c(gqw0.b, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK1);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                q8a.r(wpu0Var.b, 0, fetVar2, wpu0Var.f39560a);
                n0q n0qVar2 = o7k0.c;
                l7m0 l7m0Var2 = this.e;
                boolean zG2 = fetVar2.g(l7m0Var2);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new eb3(l7m0Var2, (byte) 13);
                    fetVar2.o0(objP2);
                }
                zq8.a(0, fetVar2, i120.Q(i4w0.T(n0qVar2, (Function1) objP2), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n));
                q8a.y(wpu0Var, l7m0Var2, this.f, this.g, fetVar2, 384);
                fetVar2.r(true);
                q8a.H(wpu0Var.c, fetVar2, 0);
                fetVar2.r(false);
                return unit2;
        }
    }
}
