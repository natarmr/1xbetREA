package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.registration.api.domain.models.BonusInfoModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class a8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f399a;
    public final Object b;
    public final Object c;

    public /* synthetic */ a8(Object obj, Object obj2, byte b) {
        this.f399a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.f399a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 6;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                return (pgv) ((ahd) obj4).F((x8z) obj, Integer.valueOf(iIntValue), ((List) obj3).get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj2).intValue();
                return (pgv) ((ahd) obj4).F((x8z) obj, Integer.valueOf(iIntValue2), ((List) obj3).get(iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj2).intValue();
                return (pgv) ((ahd) obj4).F((x8z) obj, Integer.valueOf(iIntValue3), ((a4x) obj3).get(iIntValue3));
            case 3:
                int iIntValue4 = ((Number) obj2).intValue();
                return (pgv) ((cl2) obj4).F((x8z) obj, Integer.valueOf(iIntValue4), ((a4x) obj3).get(iIntValue4));
            case 4:
                return (pgv) ((ma2) obj4).invoke((x8z) obj, ((List) obj3).get(((Number) obj2).intValue()));
            case 5:
                fet fetVar = (fet) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                String str = (String) obj4;
                if (fetVar.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG = fetVar.g(str);
                    Object objP = fetVar.P();
                    Object obj5 = objP;
                    if (zG || objP == cl5Var) {
                        ka6 ka6Var = new ka6(str, false ? (byte) 1 : (byte) 0);
                        fetVar.o0(ka6Var);
                        obj5 = ka6Var;
                    }
                    mm40 mm40VarA = pai0.a(jm40Var, false, (Function1) obj5);
                    ugd ugdVar = (ugd) obj3;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iX = e3c.x(fetVar);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar, iX, shdVar);
                    }
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    twn.v(0, ugdVar, fetVar, true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar2 = (fet) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((xdr) obj4).F(((bq8) obj3).b, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar3 = (fet) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (fetVar3.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarI = s5x0.I(o7k0.a(jm40Var, ee9.b, ee9.c), (hh80) obj4);
                    ugd ugdVar2 = (ugd) obj3;
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
                    int iX2 = e3c.x(fetVar3);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarI);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    shd shdVar2 = gqw0.y;
                    if (fetVar3.S || !Intrinsics.d(fetVar3.P(), Integer.valueOf(iX2))) {
                        rw2.t(iX2, fetVar3, iX2, shdVar2);
                    }
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    h97.p(6, ugdVar2, zhg0.f44392a, fetVar3, true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                return Boolean.valueOf(Intrinsics.d((vjj) obj, (kp9) obj4) && Intrinsics.d((vjj) obj2, (kp9) obj3));
            case 9:
                fet fetVar4 = (fet) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (fetVar4.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lqk lqkVar = ((nsk) obj4).b.f22228a;
                    if (lqkVar instanceof iqk) {
                        fetVar4.e0(-284495425);
                        v8q0.a(((iqk) lqkVar).f15213a, epv0.N(jm40Var, ((Number) ((l7m0) obj3).getValue()).floatValue()), ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar4, 0, 0, 131064);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1256092007);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 10:
                fet fetVar5 = (fet) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                psk pskVar = (psk) obj3;
                if (fetVar5.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(epv0.N(jm40Var, ((Number) ((l7m0) obj4).getValue()).floatValue()), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(pskVar.d, o2e.e0(s5x0.N(mm40VarD, 8.0f, 0.0f, pskVar.e instanceof ot20 ? 8.0f : 64.0f, 0.0f, 10), "DISCIPLINE_DETAILS_ICON_FOCUS_TOOLBAR_COLLAPSED_TITLE"), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar5, 0, 24960, 109560);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 11:
                x8z x8zVar = (x8z) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x8zVar.getClass();
                return (pgv) ((f4m) obj4).invoke(x8zVar, ((a4x) obj3).get(iIntValue10));
            case 12:
                int iIntValue11 = ((Number) obj2).intValue();
                return (pgv) ((cl2) obj4).F((x8z) obj, Integer.valueOf(iIntValue11), ((List) obj3).get(iIntValue11));
            case 13:
                int iIntValue12 = ((Number) obj2).intValue();
                return (pgv) ((cl2) obj4).F((x8z) obj, Integer.valueOf(iIntValue12), ((List) obj3).get(iIntValue12));
            case 14:
                String str2 = (String) obj2;
                sit sitVar = (sit) obj3;
                oyg0 oyg0Var = sitVar.f;
                ocj ocjVar = sitVar.i;
                ((Throwable) obj).getClass();
                str2.getClass();
                if (!agc.M((Throwable) obj4)) {
                    int i = sit.G;
                    sac.V(jiu0.a(sitVar), rit.f30560a, null, sitVar.q.f22085a, new j0s(sitVar, str2, null, (byte) 12), 10);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, zht.a((zht) value2, null, null, false, null, null, false, false, null, null, 991)));
                }
                int i2 = sit.G;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, zht.a((zht) value, null, null, false, null, null, false, true, null, null, 927)));
                return Unit.f46060a;
            case 15:
                fet fetVar6 = (fet) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                if (fetVar6.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                    boolean zG2 = fetVar6.g(function0);
                    Object objP2 = fetVar6.P();
                    Object obj6 = objP2;
                    if (zG2 || objP2 == cl5Var) {
                        lfk lfkVar = new lfk(function0, b2);
                        fetVar6.o0(lfkVar);
                        obj6 = lfkVar;
                    }
                    mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) obj6, 28);
                    pz40 pz40Var = (pz40) obj3;
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM3 = fetVar6.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar6, mm40VarW);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC2, gqw0.v);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar6);
                    zfn zfnVar = m8m0.f21378a;
                    dww.c(pm80VarF, null, s5x0.J(i120.Q(o7k0.n(lgb.J(jm40Var, vgg0.f37379a), 36.0f), y3d.c(((Number) pz40Var.getValue()).floatValue(), ((StaticColors) fetVar6.k(zfnVar)).m73getBlack400d7_KjU()), jd8.n), 6.0f), ((StaticColors) fetVar6.k(zfnVar)).m123getWhite0d7_KjU(), fetVar6, 56, 0);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 16:
                fet fetVar7 = (fet) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (fetVar7.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    v8q0.a(((xew) ((l7m0) obj3).getValue()).f40763a, epv0.N(s5x0.N(jm40.b, xfn.a(fetVar7).e, 0.0f, 0.0f, 0.0f, 14), ((Number) ((l7m0) obj4).getValue()).floatValue()), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.w, null, j1t0.b, 0L, null, 0, 0, qmk.I, 16646109), fetVar7, 0, 24960, 110584);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 17:
                BonusInfoModel bonusInfoModel = (BonusInfoModel) obj3;
                p650 p650Var = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var.getClass();
                List<jge> list = p650Var.h;
                String str3 = (String) obj4;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                boolean z = false;
                for (jge egeVar : list) {
                    if (f140.w(egeVar, str3) && (egeVar instanceof ege)) {
                        ha8 ha8Var = ((ege) egeVar).f7760a;
                        egeVar = bonusInfoModel != null ? new ege(new da8(ha8Var.a(), bonusInfoModel, false)) : new ege(new y98(ha8Var.a()));
                        z = true;
                    }
                    arrayList.add(egeVar);
                    z = z;
                }
                return z ? p650.a(p650Var, null, arrayList, null, false, 262015) : p650Var;
            case 18:
                int iIntValue15 = ((Number) obj2).intValue();
                return (pgv) ((cl2) obj4).F((x8z) obj, Integer.valueOf(iIntValue15), ((List) obj3).get(iIntValue15));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iIntValue16 = ((Number) obj2).intValue();
                return (pgv) ((cl2) obj4).F((x8z) obj, Integer.valueOf(iIntValue16), ((List) obj3).get(iIntValue16));
            case 20:
                int iIntValue17 = ((Number) obj2).intValue();
                return (pgv) ((t330) obj4).F((x8z) obj, Integer.valueOf(iIntValue17), ((List) obj3).get(iIntValue17));
            case 21:
                fet fetVar8 = (fet) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                if (fetVar8.U(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ugd ugdVar3 = (ugd) obj4;
                    f1h0 f1h0Var = (f1h0) obj3;
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iX3 = e3c.x(fetVar8);
                    bh90 bh90VarM4 = fetVar8.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar8, jm40Var);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM4, gqw0.w);
                    shd shdVar3 = gqw0.y;
                    if (fetVar8.S || !Intrinsics.d(fetVar8.P(), Integer.valueOf(iX3))) {
                        rw2.t(iX3, fetVar8, iX3, shdVar3);
                    }
                    jpm0.o(fetVar8, mm40VarC3, gqw0.v);
                    ugdVar3.F(f1h0Var, fetVar8, 6);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 22:
                int iIntValue19 = ((Number) obj2).intValue();
                return (pgv) ((t330) obj4).F((x8z) obj, Integer.valueOf(iIntValue19), ((List) obj3).get(iIntValue19));
            case 23:
                fet fetVar9 = (fet) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                if (fetVar9.U(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ((ugd) obj4).F((odo0) obj3, fetVar9, 6);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 24:
                fet fetVar10 = (fet) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                if (fetVar10.U(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ((ugd) obj4).F((ArrayList) obj3, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue22 = ((Number) obj2).intValue();
                return (pgv) ((t330) obj4).F((x8z) obj, Integer.valueOf(iIntValue22), ((List) obj3).get(iIntValue22));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar11 = (fet) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                if (fetVar11.U(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    pz40 pz40Var2 = (pz40) obj4;
                    Object objP3 = fetVar11.P();
                    if (objP3 == cl5Var) {
                        objP3 = new dbo0(pz40Var2, (byte) 5);
                        fetVar11.o0(objP3);
                    }
                    mm40 mm40VarD0 = ro4.d0(jm40Var, (Function1) objP3);
                    ugd ugdVar4 = (ugd) obj3;
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iX4 = e3c.x(fetVar11);
                    bh90 bh90VarM5 = fetVar11.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar11, mm40VarD0);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM5, gqw0.w);
                    shd shdVar4 = gqw0.y;
                    if (fetVar11.S || !Intrinsics.d(fetVar11.P(), Integer.valueOf(iX4))) {
                        rw2.t(iX4, fetVar11, iX4, shdVar4);
                    }
                    jpm0.o(fetVar11, mm40VarC4, gqw0.v);
                    twn.v(0, ugdVar4, fetVar11, true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            default:
                ncv0 ncv0Var = (ncv0) obj2;
                ArrayList arrayList2 = (ArrayList) obj4;
                ((oyg0) obj).getClass();
                ncv0Var.getClass();
                vcv0 vcv0Var = (vcv0) obj3;
                return ncv0.a(ncv0Var, arrayList2, (((ncv0) vcv0Var.D()).b == null || !CollectionsKt.L(arrayList2, ((ncv0) vcv0Var.D()).b)) ? (i3m0) CollectionsKt.firstOrNull(arrayList2) : ((ncv0) vcv0Var.D()).b, false, false, false, 120);
        }
    }
}
