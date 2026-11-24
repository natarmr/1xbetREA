package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final class qqk extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29170a = 0;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ lwf c;
    public final /* synthetic */ nie0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqk(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, nsk nskVar, l7m0 l7m0Var, pz40 pz40Var2, Function1 function1, Function1 function2, qge qgeVar, long j, Function0 function0) {
        super(3);
        this.b = pz40Var;
        this.c = lwfVar;
        this.d = nie0Var;
        this.i = nskVar;
        this.e = l7m0Var;
        this.h = pz40Var2;
        this.j = function1;
        this.k = function2;
        this.l = qgeVar;
        this.f = j;
        this.g = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b;
        pcy pcyVar;
        byte b2 = this.f29170a;
        Object obj4 = this.l;
        Function0 function0 = this.g;
        pcy pcyVar2 = e7z.u1;
        jm40 jm40Var = jm40.b;
        cmd cmdVar = cmd.b;
        cmd cmdVar2 = cmd.f4598a;
        nie0 nie0Var = this.d;
        lwf lwfVar = this.c;
        pz40 pz40Var = this.b;
        Object obj5 = this.h;
        l7m0 l7m0Var = this.e;
        Object obj6 = this.i;
        cl5 cl5Var = ukd.f35823a;
        Object obj7 = this.j;
        Object obj8 = this.k;
        switch (b2) {
            case 0:
                fet fetVar = (fet) obj2;
                ((Number) obj3).intValue();
                pz40 pz40Var2 = (pz40) obj5;
                nsk nskVar = (nsk) obj6;
                Unit unit = Unit.f46060a;
                pz40Var.setValue(unit);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar.e0(1270214819);
                mm40 mm40VarK0 = mrv.k0(o7k0.d(jm40Var, 1.0f), ht40.f13615a);
                tj30 tj30VarC = zq8.c(gqw0.b, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar2);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                k7x.b(nskVar.f24053a, null, o7k0.c, a8k0.F(R.drawable.cybergames_tablet_header_placeholder, 0, fetVar), a8k0.F(R.drawable.cybergames_tablet_header_placeholder, 0, fetVar), null, null, null, null, aad.c, (qge) obj4, null, fetVar, 805343664, 6, 31200);
                mm40 mm40VarK1 = mrv.k0(yyw.X(o7k0.d(jm40Var, 1.0f), null, fetVar, 1), ht40.b);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, this.f, false, null);
                    fetVar.o0(objP);
                }
                imm immVar = (imm) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    b = 1;
                    objP2 = new vkm(1);
                    fetVar.o0(objP2);
                } else {
                    b = 1;
                }
                hlm.c(mm40VarK1, immVar, (vkm) objP2, null, null, null, null, null, null, u1c.M(-935897465, new c42(function0, b), fetVar), u1c.M(-2003539499, new a8(nskVar, l7m0Var, (byte) 9), fetVar), null, fetVar, 805309872, 6, 2544);
                fetVar.r(true);
                mm40 mm40VarK2 = mrv.k0(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2), ht40.c);
                mqk mqkVar = nskVar.b;
                Object value = l7m0Var.getValue();
                if (((Number) value).floatValue() != 1.0f) {
                    value = null;
                }
                boolean zBooleanValue = ((Float) value) != null ? false : ((Boolean) pz40Var2.getValue()).booleanValue();
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new v9k(pz40Var2, (byte) 15);
                    fetVar.o0(objP3);
                }
                pzb.h(mm40VarK2, this.e, mqkVar, zBooleanValue, (Function0) objP3, (Function1) obj7, (Function1) obj8, fetVar, 24576);
                fetVar.r(false);
                return unit;
            default:
                fet fetVar2 = (fet) obj2;
                ((Number) obj3).intValue();
                l7m0 l7m0Var2 = (l7m0) obj8;
                l7m0 l7m0Var3 = (l7m0) obj7;
                l7m0 l7m0Var4 = (l7m0) obj6;
                psk pskVar = (psk) obj5;
                Unit unit2 = Unit.f46060a;
                pz40Var.setValue(unit2);
                lwfVar.getClass();
                if (nie0Var.f23583a == cmdVar2) {
                    nie0Var.f23583a = cmdVar;
                }
                fetVar2.e0(-1067652922);
                mm40 mm40VarK3 = mrv.k0(o7k0.d(jm40Var, 1.0f), it40.f15338a);
                zx7 zx7Var = gqw0.b;
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK3);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar2);
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
                pm80 pm80VarF = a8k0.F(pskVar.b, 0, fetVar2);
                n0q n0qVar = o7k0.c;
                mm40 mm40VarE0 = o2e.e0(n0qVar, "DISCIPLINE_DETAILS_DEFAULT_ICON_FOCUS_IMAGE");
                String str = pskVar.f27519a;
                pge pgeVar = gqw0.A;
                k7x.b(str, null, mm40VarE0, pm80VarF, pm80VarF, null, null, null, null, zx7Var, pgeVar, null, fetVar2, 805343664, 6, 31200);
                zq8.a(0, fetVar2, mrv.k0(i120.Q(epv0.N(n0qVar, ((Number) l7m0Var.getValue()).floatValue()), afn0.m(fetVar2).getBackground(), jd8.n), it40.c));
                zq8.a(0, fetVar2, mrv.k0(i120.P(n0qVar, yk5.n(q3d.j(new y3d(afn0.p(fetVar2).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar2).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar2).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar2).m121getTransparent0d7_KjU()), new y3d(afn0.m(fetVar2).getBackground())), 0.0f, 0.0f, 14), null, 6), it40.d));
                mm40 mm40VarX = yyw.X(o7k0.d(jm40Var, 1.0f), null, fetVar2, 1);
                boolean zH = fetVar2.h(((Boolean) l7m0Var4.getValue()).booleanValue());
                Object objP4 = fetVar2.P();
                if (zH || objP4 == cl5Var) {
                    objP4 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, this.f, ((Boolean) l7m0Var4.getValue()).booleanValue(), null);
                    fetVar2.o0(objP4);
                }
                imm immVar2 = (imm) objP4;
                Object objP5 = fetVar2.P();
                if (objP5 == cl5Var) {
                    objP5 = new vkm(1);
                    fetVar2.o0(objP5);
                }
                hlm.c(mm40VarX, immVar2, (vkm) objP5, null, null, null, null, null, null, u1c.M(-194675314, new xrk(function0, l7m0Var3, l7m0Var2, (byte) 0), fetVar2), u1c.M(-1145454884, new a8(l7m0Var, pskVar, (byte) 10), fetVar2), u1c.M(-1127028131, new kh10(pskVar, (Function0) obj4, l7m0Var3, l7m0Var2, (byte) 2), fetVar2), fetVar2, 805309824, 54, 496);
                fetVar2.r(true);
                mm40 mm40VarL = s5x0.L(mrv.k0(o7k0.d(jm40Var, 1.0f), it40.b), xfn.a(fetVar2).e, 0.0f, 2);
                yx7 yx7Var = gqw0.k;
                thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL);
                fetVar2.i0();
                if (fetVar2.S) {
                    pcyVar = pcyVar2;
                    fetVar2.l(pcyVar);
                } else {
                    pcyVar = pcyVar2;
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL2 = twn.l(yx7Var, o7k0.n(jm40Var, 40.0f));
                long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
                zcl zclVar2 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarL2, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                lgb.v(s5x0.J(n0qVar, 6.0f), s5x0.J(n0qVar, 6.0f), pskVar.c, R.drawable.ic_glyph_cyber_gamepad, afn0.m(fetVar2).getPrimary(), pgeVar, fetVar2, 196608, 0);
                fetVar2.r(true);
                v8q0.a(pskVar.d, o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14), "DISCIPLINE_DETAILS_ICON_FOCUS_TOOLBAR_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar2, 0, 24960, 110584);
                fetVar2.r(true);
                fetVar2.r(false);
                return unit2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqk(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, psk pskVar, l7m0 l7m0Var, l7m0 l7m0Var2, long j, Function0 function0, cms0 cms0Var, cms0 cms0Var2, Function0 function1) {
        super(3);
        this.b = pz40Var;
        this.c = lwfVar;
        this.d = nie0Var;
        this.h = pskVar;
        this.e = l7m0Var;
        this.i = l7m0Var2;
        this.f = j;
        this.g = function0;
        this.j = cms0Var;
        this.k = cms0Var2;
        this.l = function1;
    }
}
