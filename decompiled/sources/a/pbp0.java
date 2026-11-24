package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class pbp0 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26718a = 1;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ lwf c;
    public final /* synthetic */ nie0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ wdr j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp0(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, qbp0 qbp0Var, float f, float f2, Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2) {
        super(3);
        this.b = pz40Var;
        this.c = lwfVar;
        this.d = nie0Var;
        this.i = qbp0Var;
        this.e = f;
        this.f = f2;
        this.j = function1;
        this.g = l7m0Var;
        this.h = l7m0Var2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f26718a;
        wdr wdrVar = this.j;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        float f = this.f;
        float f2 = this.e;
        cmd cmdVar = cmd.b;
        cmd cmdVar2 = cmd.f4598a;
        nie0 nie0Var = this.d;
        lwf lwfVar = this.c;
        pz40 pz40Var = this.b;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                ((Number) obj3).intValue();
                qbp0 qbp0Var = (qbp0) obj4;
                Function1 function1 = (Function1) wdrVar;
                Unit unit = Unit.f46060a;
                pz40Var.setValue(unit);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar.e0(1365603519);
                rq8.e(qbp0Var, f2, f, fetVar, 0);
                float f3 = xfn.a(fetVar).c;
                float f4 = xfn.a(fetVar).c;
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarK0 = mrv.k0(s5x0.N(jm40Var, f3, 0.0f, f4, 16.0f, 2), jt40.c);
                hcm hcmVar = qbp0Var.b;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new dpl0(function1, (byte) 9);
                    fetVar.o0(objP);
                }
                xbc.m(mm40VarK0, hcmVar, false, (Function1) objP, fetVar, 3456, 0);
                mm40 mm40VarK1 = mrv.k0(o7k0.d(jm40Var, 1.0f), jt40.f17082a);
                tj30 tj30VarC = zq8.c(gqw0.b, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK1);
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
                n0q n0qVar = o7k0.c;
                l7m0 l7m0Var = this.g;
                boolean zG2 = fetVar.g(l7m0Var);
                Object objP2 = fetVar.P();
                byte b2 = 11;
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new eb3(l7m0Var, b2);
                    fetVar.o0(objP2);
                }
                zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
                String str = qbp0Var.f28451a;
                boolean zG3 = fetVar.g(function1);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new t450(function1, (byte) 11);
                    fetVar.o0(objP3);
                }
                rq8.r(str, l7m0Var, this.h, (Function0) objP3, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
                return unit;
            default:
                fet fetVar2 = (fet) obj2;
                ((Number) obj3).intValue();
                edt0 edt0Var = (edt0) obj4;
                Unit unit2 = Unit.f46060a;
                pz40Var.setValue(unit2);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar2.e0(-2109857556);
                aad.c(edt0Var, f2, f, fetVar2, 0);
                jm40 jm40Var2 = jm40.b;
                mm40 mm40VarK2 = mrv.k0(o7k0.d(jm40Var2, 1.0f), ft40.f10093a);
                tj30 tj30VarC2 = zq8.c(gqw0.b, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf, shdVar3);
                jpm0.n(fetVar2);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                n0q n0qVar2 = o7k0.c;
                l7m0 l7m0Var2 = this.g;
                boolean zG4 = fetVar2.g(l7m0Var2);
                Object objP4 = fetVar2.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new eb3(l7m0Var2, (byte) 12);
                    fetVar2.o0(objP4);
                }
                zq8.a(0, fetVar2, i120.Q(i4w0.T(n0qVar2, (Function1) objP4), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n));
                aad.t(edt0Var.f7635a, l7m0Var2, this.h, (Function0) wdrVar, fetVar2, 0);
                fetVar2.r(true);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarK3 = mrv.k0(o7k0.e(jm40Var2, 180.0f), ft40.c);
                tj30 tj30VarC3 = zq8.c(gqw0.h, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarK3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                xbc.m(s5x0.N(jm40Var2, xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 16.0f, 2), edt0Var.b, true, null, fetVar2, 3456, 16);
                fetVar2.r(true);
                fetVar2.r(false);
                return unit2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp0(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, edt0 edt0Var, float f, float f2, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0) {
        super(3);
        this.b = pz40Var;
        this.c = lwfVar;
        this.d = nie0Var;
        this.i = edt0Var;
        this.e = f;
        this.f = f2;
        this.g = l7m0Var;
        this.h = l7m0Var2;
        this.j = function0;
    }
}
