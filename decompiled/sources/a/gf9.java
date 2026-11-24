package a;

import android.content.res.Resources;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gf9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11197a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gf9(gdp0 gdp0Var, mm40 mm40Var, l7m0 l7m0Var, Function2 function2, int i) {
        this.f11197a = (byte) 2;
        this.c = gdp0Var;
        this.b = mm40Var;
        this.d = l7m0Var;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        float f2;
        byte b = this.f11197a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ay3.k((mm40) obj6, (qdz) obj5, (jf9) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ju70.i((mm40) obj6, (kf9) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                nnw0.z((gdp0) obj5, (mm40) obj6, (l7m0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                s5x0.l((mm40) obj6, (zja) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                cfx0.e((mm40) obj6, (aka) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                i120.m((mm40) obj6, (p9r0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                p8a.l((mm40) obj6, (bra) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                o2e.m((mm40) obj6, (q5b) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ahy.m((String) obj6, (String) obj5, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                o050.j((mm40) obj6, (pnc) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                feb.f((mm40) obj6, (String) obj5, (pz40) obj4, (pz40) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 11:
                mm40 mm40Var = (mm40) obj6;
                pz40 pz40Var = (pz40) obj5;
                pz40 pz40Var2 = (pz40) obj4;
                pz40 pz40Var3 = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                        f2 = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                        f2 = Float.MAX_VALUE;
                    }
                    x7z x7zVar = new x7z(f, true);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarG = o7k0.g(x7zVar, 28.0f, 0.0f, 2);
                    tj30 tj30VarC = zq8.c(gqw0.f, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarG);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    String str = (String) pz40Var2.getValue();
                    zfn zfnVar = j1t0.e;
                    ((g1t0) fetVar.k(zfnVar)).getClass();
                    y9q0 y9q0VarD = g1t0.d();
                    zfn zfnVar2 = zaq0.b;
                    v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 109562);
                    fetVar.r(true);
                    mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                    j83 j83Var = (j83) pz40Var.getValue();
                    ((g1t0) fetVar.k(zfnVar)).getClass();
                    v8q0.b(j83Var, mm40VarL, 0L, null, 0L, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, g1t0.a(), fetVar, 0, 0, 261116);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarG2 = o7k0.g(new x7z(1.0f > f2 ? f2 : 1.0f, true), 28.0f, 0.0f, 2);
                    tj30 tj30VarC2 = zq8.c(gqw0.d, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarG2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    String str2 = (String) pz40Var3.getValue();
                    ((g1t0) fetVar.k(zfnVar)).getClass();
                    v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 12:
                mm40 mm40Var2 = (mm40) obj6;
                rod rodVar = (rod) obj5;
                pz40 pz40Var4 = (pz40) obj4;
                Function2 function2 = (Function2) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var2, 72.0f);
                    gdp0 gdp0Var = rodVar.f30831a;
                    gdp0 gdp0Var2 = rodVar.b;
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, gqw0.v);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        fetVar2.o0(objP);
                    }
                    fetVar2.e0(1076996227);
                    fetVar2.r(false);
                    obc.e(new l5d0[]{afp0.f790a.a(w6n.h), dgp0.b.a(gqw0.d), dw9.k(5, dgp0.c), hap.f12735a.a(fetVar2.k(bmd.n))}, u1c.M(-206191743, new ba00((Object) gdp0Var, objP, (Object) pz40Var4, (Object) function2, (Object) gdp0Var2, (byte) 19), fetVar2), fetVar2, 48);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                jcb.b((mm40) obj6, (rv50) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                lmc.e((mm40) obj6, (dye) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                tlb.e((mm40) obj6, (String) obj5, (c280) obj4, (String) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 16:
                hbg hbgVar = (hbg) obj6;
                CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) obj5;
                ujn ujnVar = (ujn) obj4;
                g2v g2vVar = (g2v) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x9g x9gVar = (x9g) gkb.Q(hbgVar.u, null, fetVar3, 0, 7).getValue();
                    boolean zI = fetVar3.i(hbgVar);
                    Object objP2 = fetVar3.P();
                    if (zI || objP2 == cl5Var) {
                        oye oyeVar = new oye(0, hbgVar, hbg.class, "onRefreshClick", "onRefreshClick()V", 0, (byte) 12);
                        fetVar3.o0(oyeVar);
                        objP2 = oyeVar;
                    }
                    ujnVar.e(x9gVar, g2vVar, cyberCalendarParams.d, (Function0) ((jhy) objP2), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                tke.r((vbg) obj6, (Function0) obj5, (Function1) obj3, (ugd) obj4, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                lmc.g((mm40) obj6, (i2r0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                obb.j((mm40) obj6, (k2r0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                jcb.w((mm40) obj6, (kgg) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                bfb.h((mm40) obj6, (o2r0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                obb.k((mm40) obj6, (k7h) obj5, (Function1) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                sac.b((mm40) obj6, (String) obj5, (String) obj4, (m0x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                vtb.j((mm40) obj6, (uyh) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                jwb.i((mm40) obj6, (ozh) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ffb0.o((mm40) obj6, (cql) obj5, (Function2) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                d5c.j((o0x) obj6, (m0x) obj5, (y3d) obj4, (y3d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pz40 pz40Var5 = (pz40) obj5;
                pz40 pz40Var6 = (pz40) obj4;
                pz40 pz40Var7 = (pz40) obj3;
                Integer num = (Integer) obj;
                num.getClass();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                if (!((Boolean) ((pz40) obj6).getValue()).booleanValue()) {
                    return Unit.f46060a;
                }
                int iOrdinal = ((am) pz40Var5.getValue()).ordinal();
                if (iOrdinal == 0) {
                    ((Function2) pz40Var6.getValue()).invoke(num, num2);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    ((Function2) pz40Var7.getValue()).invoke(num, num2);
                }
                return Unit.f46060a;
            default:
                msk mskVar = (msk) obj6;
                Function0 function0 = (Function0) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qt20 qt20Var = mskVar.e;
                    if (qt20Var instanceof ot20) {
                        fetVar4.e0(-1716326474);
                        boolean z = ((ot20) qt20Var).f25811a;
                        int i = R.drawable.ic_glyph_extended;
                        int i2 = z ? R.drawable.ic_glyph_extended : R.drawable.ic_glyph_compressed_inactive;
                        Resources resources = (Resources) fetVar4.k(dy2.c);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                        Object objP3 = fetVar4.P();
                        if (objP3 == cl5Var) {
                            objP3 = dw9.j(fetVar4);
                        }
                        gy40 gy40Var = (gy40) objP3;
                        boolean zG = fetVar4.g(function0);
                        Object objP4 = fetVar4.P();
                        byte b2 = 10;
                        if (zG || objP4 == cl5Var) {
                            objP4 = new b1i(function0, (byte) 10);
                            fetVar4.o0(objP4);
                        }
                        mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP4, 28), "DEFAULT_ITEM_BOX");
                        tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                        int iHashCode5 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM5 = fetVar4.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar4, mm40VarE0);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC3, gqw0.x);
                        jpm0.o(fetVar4, bh90VarM5, gqw0.w);
                        jpm0.o(fetVar4, Integer.valueOf(iHashCode5), gqw0.y);
                        jpm0.n(fetVar4);
                        jpm0.o(fetVar4, mm40VarC4, gqw0.v);
                        if (!z) {
                            i = R.drawable.ic_glyph_compressed_inactive;
                        }
                        pm80 pm80VarF = a8k0.F(i, 0, fetVar4);
                        long j = ((y3d) l7m0Var.getValue()).f41946a;
                        mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.n(lgb.J(jm40Var, vgg0.f37379a), 36.0f), ((y3d) l7m0Var2.getValue()).f41946a, jd8.n), 6.0f);
                        boolean zE = fetVar4.e(i2);
                        Object objP5 = fetVar4.P();
                        if (zE || objP5 == cl5Var) {
                            objP5 = new dx2(i2, b2);
                            fetVar4.o0(objP5);
                        }
                        dww.c(pm80VarF, null, o2e.e0(pai0.a(mm40VarJ, false, (Function1) objP5), "DEFAULT_ITEM_ICON" + resources.getResourceEntryName(i2)), j, fetVar4, 56, 0);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    } else {
                        if (!qt20Var.equals(pt20.f27543a)) {
                            throw b1j.f(-1995031976, fetVar4, false);
                        }
                        fetVar4.e0(-1714403575);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gf9(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f11197a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ gf9(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f11197a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ gf9(Object obj, Object obj2, Function1 function1, wdr wdrVar, int i, byte b) {
        this.f11197a = b;
        this.b = obj;
        this.c = obj2;
        this.e = function1;
        this.d = wdrVar;
    }
}
