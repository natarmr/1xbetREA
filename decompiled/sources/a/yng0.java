package a;

import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes5.dex */
public final class yng0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yng0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                yng0 yng0Var = new yng0((aog0) obj2, yjeVar, (byte) 0);
                yng0Var.j = ((Boolean) obj).booleanValue();
                return yng0Var;
            case 1:
                yng0 yng0Var2 = new yng0((mog0) obj2, yjeVar, (byte) 1);
                yng0Var2.j = ((Boolean) obj).booleanValue();
                return yng0Var2;
            case 2:
                yng0 yng0Var3 = new yng0((rug0) obj2, yjeVar, (byte) 2);
                yng0Var3.j = ((Boolean) obj).booleanValue();
                return yng0Var3;
            case 3:
                yng0 yng0Var4 = new yng0((dxg0) obj2, yjeVar, (byte) 3);
                yng0Var4.j = ((Boolean) obj).booleanValue();
                return yng0Var4;
            case 4:
                yng0 yng0Var5 = new yng0((sih0) obj2, yjeVar, (byte) 4);
                yng0Var5.j = ((Boolean) obj).booleanValue();
                return yng0Var5;
            case 5:
                yng0 yng0Var6 = new yng0((qmh0) obj2, yjeVar, (byte) 5);
                yng0Var6.j = ((Boolean) obj).booleanValue();
                return yng0Var6;
            case 6:
                yng0 yng0Var7 = new yng0((oph0) obj2, yjeVar, (byte) 6);
                yng0Var7.j = ((Boolean) obj).booleanValue();
                return yng0Var7;
            case 7:
                return new yng0((pvh0) obj2, yjeVar, (byte) 7);
            case 8:
                return new yng0((zzh0) obj2, yjeVar, (byte) 8);
            case 9:
                yng0 yng0Var8 = new yng0((m9i0) obj2, yjeVar, (byte) 9);
                yng0Var8.j = ((Boolean) obj).booleanValue();
                return yng0Var8;
            case 10:
                yng0 yng0Var9 = new yng0((t9i0) obj2, yjeVar, (byte) 10);
                yng0Var9.j = ((Boolean) obj).booleanValue();
                return yng0Var9;
            case 11:
                return new yng0((jai0) obj2, yjeVar, (byte) 11);
            case 12:
                yng0 yng0Var10 = new yng0((wli0) obj2, yjeVar, (byte) 12);
                yng0Var10.j = ((Boolean) obj).booleanValue();
                return yng0Var10;
            case 13:
                yng0 yng0Var11 = new yng0((bri0) obj2, yjeVar, (byte) 13);
                yng0Var11.j = ((Boolean) obj).booleanValue();
                return yng0Var11;
            case 14:
                return new yng0((tti0) obj2, yjeVar, (byte) 14);
            case 15:
                return new yng0((w5j0) obj2, yjeVar, (byte) 15);
            case 16:
                yng0 yng0Var12 = new yng0((jvj0) obj2, yjeVar, (byte) 16);
                yng0Var12.j = ((Boolean) obj).booleanValue();
                return yng0Var12;
            case 17:
                return new yng0((xxj0) obj2, yjeVar, (byte) 17);
            case 18:
                yng0 yng0Var13 = new yng0((l2k0) obj2, yjeVar, (byte) 18);
                yng0Var13.j = ((Boolean) obj).booleanValue();
                return yng0Var13;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yng0 yng0Var14 = new yng0((k5k0) obj2, yjeVar, (byte) 19);
                yng0Var14.j = ((Boolean) obj).booleanValue();
                return yng0Var14;
            case 20:
                return new yng0((cjk0) obj2, yjeVar, (byte) 20);
            case 21:
                return new yng0((yhi) obj2, yjeVar, (byte) 21);
            case 22:
                return new yng0((zql0) obj2, yjeVar, (byte) 22);
            case 23:
                yng0 yng0Var15 = new yng0((zxl0) obj2, yjeVar, (byte) 23);
                yng0Var15.j = ((Boolean) obj).booleanValue();
                return yng0Var15;
            case 24:
                return new yng0((ezl0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                yng0 yng0Var16 = new yng0((w3m0) obj2, yjeVar, (byte) 25);
                yng0Var16.j = ((Boolean) obj).booleanValue();
                return yng0Var16;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                yng0 yng0Var17 = new yng0((ybm0) obj2, yjeVar, (byte) 26);
                yng0Var17.j = ((Boolean) obj).booleanValue();
                return yng0Var17;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new yng0((wnm0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new yng0((ltm0) obj2, yjeVar, (byte) 28);
            default:
                return new yng0((dzm0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yng0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((yng0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((yng0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((yng0) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((yng0) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((yng0) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((yng0) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((yng0) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((yng0) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((yng0) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((yng0) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((yng0) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((yng0) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((yng0) create(bool14, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                return ((yng0) create(bool15, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool16 = (Boolean) obj;
                bool16.booleanValue();
                return ((yng0) create(bool16, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool17 = (Boolean) obj;
                bool17.booleanValue();
                return ((yng0) create(bool17, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yng0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:238:0x0492  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x04ae A[LOOP:3: B:240:0x04ae->B:355:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:243:0x04c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v84 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object objA;
        kzz kzzVar;
        Object value5;
        Object value6;
        Object objC0;
        Object value7;
        c4m0 c4m0Var;
        Object objG;
        Object value8;
        ArrayList arrayList;
        Object objA2;
        byte b = this.i;
        byte b2 = 7;
        byte b3 = 9;
        byte b4 = 13;
        byte b5 = 28;
        int i = 3;
        byte b6 = 12;
        byte b7 = 2;
        ?? r10 = 0;
        int iX = 0;
         = 0;
        ?? r11 = 0;
        z = false;
        boolean z = false;
        r10 = 0;
        Object obj2 = null;
        ?? r12 = 0;
        ?? r13 = 0;
        ?? r14 = 0;
        ?? r15 = 0;
        ?? r16 = 0;
        ?? r17 = 0;
        ?? r18 = 0;
        ?? r19 = 0;
        ?? r110 = 0;
        byte b8 = 1;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                aog0 aog0Var = (aog0) obj3;
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z2 && !((ong0) aog0Var.D()).i) {
                    aog0Var.M();
                }
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    mog0 mog0Var = (mog0) obj3;
                    if (!mog0Var.q) {
                        mog0Var.x();
                    }
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((rug0) obj3).e = z4;
                return Unit.f46060a;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                dxg0 dxg0Var = (dxg0) obj3;
                ocj ocjVar = dxg0Var.i;
                if (!((svg0) dxg0Var.D()).o.equals(wtg0.f39739a)) {
                    xtg0 xtg0Var = ((svg0) dxg0Var.D()).o;
                    vtg0 vtg0Var = vtg0.f38006a;
                    if (xtg0Var.equals(vtg0Var)) {
                        dxg0Var.R();
                    } else if (!((svg0) dxg0Var.D()).n && z5) {
                        dxg0Var.R();
                    } else if (!z5 && ((svg0) dxg0Var.D()).o.equals(vtg0Var)) {
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, svg0.a((svg0) value, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, utg0.f36253a, null, null, null, null, null, 8372223)));
                    }
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value9 = p7m0Var2.getValue();
                    value9.getClass();
                    p7m0 p7m0Var3 = p7m0Var2;
                    boolean z6 = z5;
                    if (p7m0Var3.m(value9, svg0.a((svg0) value9, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, z6, null, null, null, null, null, null, 8380415))) {
                        return Unit.f46060a;
                    }
                    p7m0Var2 = p7m0Var3;
                    z5 = z6;
                }
                break;
            case 4:
                boolean z7 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                sih0 sih0Var = (sih0) obj3;
                oyg0 oyg0Var = sih0Var.f;
                ocj ocjVar2 = sih0Var.i;
                if (z7) {
                    int i2 = sih0.N;
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, uhh0.a((uhh0) value3, null, null, null, null, null, null, null, null, 0L, null, null, null, true, null, 67084287)));
                    bby bbyVar = sih0Var.J;
                    if (bbyVar != null) {
                        v3c.N(bbyVar);
                    }
                    sih0Var.J = i3t0.K(sih0Var, null, null, new mih0(sih0Var, r15 == true ? 1 : 0, b8), 3);
                    c4m0 c4m0Var2 = sih0Var.I;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        if (!((uhh0) sih0Var.D()).b()) {
                            p7m0 p7m0Var5 = ocjVar2.f25029a;
                            do {
                                value4 = p7m0Var5.getValue();
                                value4.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var5.m(value4, uhh0.a((uhh0) value4, null, null, null, null, null, null, null, null, 0L, null, null, null, true, null, 67084287)));
                        }
                        es esVar = sih0Var.C;
                        n0w n0wVar = ((uhh0) sih0Var.D()).w;
                        esVar.getClass();
                        a1g a1gVarF0 = dub.f0(((e1u) esVar.f8305a).a(), ((n4u) esVar.b).d(), ((f4u) esVar.c).a(n0wVar), new fl9(esVar, r14 == true ? 1 : 0, b7));
                        zn00 zn00Var = sih0Var.y.f25799a;
                        sih0Var.I = i3t0.L(sih0Var, new p6d(a1gVarF0, new p6d(sj3.S(((bih0) zn00Var.f44650a).f2660a, 500L), new i89(((tfh0) zn00Var.b).f33866a, (byte) 22), new yno(i, r13 == true ? 1 : 0, b7), b8), new za60(sih0Var, (yje) (r12 == true ? 1 : 0), b3), b8), null, null, 3);
                    }
                } else if (((uhh0) sih0Var.D()).b()) {
                    sih0Var.G(ehh0.f7810a);
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value2 = p7m0Var6.getValue();
                        value2.getClass();
                    } while (!p7m0Var6.m(value2, uhh0.a((uhh0) value2, null, null, null, null, null, null, null, null, 0L, null, null, jfh0.f16426a, false, null, 67084287)));
                }
                return Unit.f46060a;
            case 5:
                boolean z8 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                qmh0 qmh0Var = (qmh0) obj3;
                int i3 = qmh0.y;
                p7m0 p7m0Var7 = qmh0Var.i.f25029a;
                while (true) {
                    Object value10 = p7m0Var7.getValue();
                    value10.getClass();
                    boolean z9 = z8;
                    if (p7m0Var7.m(value10, mmh0.a((mmh0) value10, null, null, false, 0, null, null, null, z8, null, 383))) {
                        qmh0Var.N();
                        return Unit.f46060a;
                    }
                    z8 = z9;
                }
                break;
            case 6:
                boolean z10 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                gle0 gle0Var = oph0.Q1;
                ((oph0) obj3).H0().g.setRefreshing(z10);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    this.j = true;
                    if (((pvh0) obj3).r1(this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                zzh0 zzh0Var = (zzh0) obj3;
                wne wneVar9 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    esg0 esg0Var = zzh0Var.v;
                    this.j = true;
                    if (esg0Var.Y(this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = zzh0.C;
                zzh0Var.G(qzh0.f29578a);
                return Unit.f46060a;
            case 9:
                boolean z13 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                eke0 eke0Var = m9i0.S1;
                ((FrameLayout) ((m9i0) obj3).G0().f.b).setVisibility(z13 ? 0 : 8);
                return Unit.f46060a;
            case 10:
                boolean z14 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr = t9i0.Q1;
                ((FrameLayout) ((t9i0) obj3).G0().f.b).setVisibility(z14 ? 0 : 8);
                return Unit.f46060a;
            case 11:
                jai0 jai0Var = (jai0) obj3;
                p7m0 p7m0Var8 = jai0Var.i;
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    ciu ciuVar = jai0Var.d;
                    this.j = true;
                    objA = ciuVar.a(this);
                    if (objA == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                for (Object obj4 : (Iterable) objA) {
                    if (((kzz) obj4).f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                        obj2 = obj4;
                        kzzVar = (kzz) obj2;
                        value5 = p7m0Var8.getValue();
                        value5.getClass();
                        if (((iai0) value5).f14440a.f10915a != 1) {
                            zie0 zie0Var = g9i0.b;
                            Object value11 = p7m0Var8.getValue();
                            value11.getClass();
                            byte b9 = ((iai0) value11).f14440a.f10915a;
                            zie0Var.getClass();
                            jai0Var.x(zie0.a(b9));
                        } else if (kzzVar == null) {
                            do {
                                value6 = p7m0Var8.getValue();
                                g9i0.b.getClass();
                            } while (!p7m0Var8.m(value6, new iai0(g9i0.DAY)));
                        } else {
                            zie0 zie0Var2 = g9i0.b;
                            int i5 = (int) kzzVar.g;
                            zie0Var2.getClass();
                            jai0Var.x(zie0.a(i5));
                        }
                        return Unit.f46060a;
                    }
                }
                kzzVar = (kzz) obj2;
                value5 = p7m0Var8.getValue();
                value5.getClass();
                if (((iai0) value5).f14440a.f10915a != 1) {
                    zie0 zie0Var3 = g9i0.b;
                    Object value12 = p7m0Var8.getValue();
                    value12.getClass();
                    byte b10 = ((iai0) value12).f14440a.f10915a;
                    zie0Var3.getClass();
                    jai0Var.x(zie0.a(b10));
                } else if (kzzVar == null) {
                    do {
                        value6 = p7m0Var8.getValue();
                        g9i0.b.getClass();
                    } while (!p7m0Var8.m(value6, new iai0(g9i0.DAY)));
                } else {
                    zie0 zie0Var4 = g9i0.b;
                    int i6 = (int) kzzVar.g;
                    zie0Var4.getClass();
                    jai0Var.x(zie0.a(i6));
                }
                return Unit.f46060a;
            case 12:
                wli0 wli0Var = (wli0) obj3;
                boolean z16 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                ?? r1 = !z16 && ((sli0) wli0Var.D()).f32400a;
                if (z16 && (((sli0) wli0Var.D()).c || ((sli0) wli0Var.D()).d)) {
                    r10 = 1;
                }
                if (r1 != false || r10 != 0) {
                    int i7 = wli0.x;
                    sac.V(jiu0.a(wli0Var), new vli0(wli0Var, b8), null, wli0Var.u.b, new tmg0(wli0Var, r16 == true ? 1 : 0, b2), 10);
                }
                return Unit.f46060a;
            case 13:
                boolean z17 = this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                lme0 lme0Var = bri0.V1;
                ((bri0) obj3).G0().b.setFirstButtonEnabled(z17);
                return Unit.f46060a;
            case 14:
                tti0 tti0Var = (tti0) obj3;
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    eu4 eu4Var = new eu4(Boolean.TRUE, b6);
                    this.j = true;
                    objC0 = tlb.c0(eu4Var, new ArrayList(), this);
                    if (objC0 == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC0 = obj;
                }
                ((Boolean) CollectionsKt.d0((List) objC0)).getClass();
                tti0Var.g.o(null, i8d.c);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    w5j0 w5j0Var = (w5j0) obj3;
                    bm5 bm5Var = w5j0Var.C;
                    if (bm5Var != null) {
                        this.j = true;
                        if (w5j0Var.x(bm5Var, this) == wneVar16) {
                            return wneVar16;
                        }
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                boolean z20 = this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                if (z20) {
                    zie0 zie0Var5 = jvj0.W1;
                    xxj0 xxj0VarJ0 = ((jvj0) obj3).J0();
                    mne mneVar = xxj0VarJ0.d;
                    sac.V(jiu0.a(xxj0VarJ0), new iwj0(xxj0VarJ0, b7), null, mneVar.b, new zye0(xxj0VarJ0, (yje) (r18 == true ? 1 : 0), b5), 10);
                    xxj0VarJ0.U();
                    p7m0 p7m0Var9 = xxj0VarJ0.C0;
                    do {
                        value7 = p7m0Var9.getValue();
                    } while (!p7m0Var9.m(value7, StepInputUiModel.a((StepInputUiModel) value7, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, xxj0VarJ0.B(), false, false, false, 122879)));
                    sac.V(jiu0.a(xxj0VarJ0), kwj0.f19005a, null, mneVar.b, new kpb0(xxj0VarJ0, r17 == true ? 1 : 0, b4), 10);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    sd60 sd60Var = ((xxj0) obj3).L;
                    this.j = true;
                    if (sd60Var.h(this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                l2k0 l2k0Var = (l2k0) obj3;
                boolean z22 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (z22 && (((f2k0) l2k0Var.D()).d == ui5.c || ((f2k0) l2k0Var.D()).d == ui5.d || ((f2k0) l2k0Var.D()).d == ui5.f35713a)) {
                    z = true;
                }
                if (z || (c4m0Var = l2k0Var.E) == null || !c4m0Var.isActive()) {
                    int i8 = l2k0.J;
                    l2k0Var.N(z);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k5k0 k5k0Var = (k5k0) obj3;
                boolean z23 = this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                ?? r2 = !z23 && ((b5k0) k5k0Var.D()).e;
                if (z23 && (((b5k0) k5k0Var.D()).f || ((b5k0) k5k0Var.D()).g)) {
                    r11 = 1;
                }
                if (r2 != false || r11 != 0) {
                    int i9 = k5k0.J;
                    k5k0Var.P();
                }
                return Unit.f46060a;
            case 20:
                cjk0 cjk0Var = (cjk0) obj3;
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    jru jruVar = cjk0Var.d;
                    this.j = true;
                    objG = jruVar.g(this);
                    if (objG == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                List list = (List) objG;
                p7m0 p7m0Var10 = cjk0Var.m;
                do {
                    value8 = p7m0Var10.getValue();
                    arrayList = new ArrayList();
                    f3c0 f3c0Var = cjk0Var.l;
                    if (f3c0Var.i) {
                        arrayList.add(cjk0.w(1, list));
                    }
                    if (f3c0Var.j && ((xr) cjk0Var.j.f30901a).i() == rl40.GMS) {
                        arrayList.add(cjk0.w(11, list));
                    }
                    if (f3c0Var.p) {
                        arrayList.add(cjk0.w(13, list));
                    }
                    if (f3c0Var.q) {
                        arrayList.add(cjk0.w(31, list));
                    }
                    if (f3c0Var.l) {
                        arrayList.add(cjk0.w(9, list));
                    }
                    if (f3c0Var.m) {
                        arrayList.add(cjk0.w(7, list));
                    }
                    if (f3c0Var.k) {
                        arrayList.add(cjk0.w(5, list));
                    }
                    if (f3c0Var.n) {
                        arrayList.add(cjk0.w(17, list));
                    }
                    if (f3c0Var.o) {
                        arrayList.add(cjk0.w(19, list));
                    }
                } while (!p7m0Var10.m(value8, new oik0(arrayList)));
                return Unit.f46060a;
            case 21:
                yhi yhiVar = (yhi) obj3;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    if (((iqt) yhiVar.b).f15225a.a()) {
                        rou rouVar = (rou) yhiVar.o;
                        this.j = true;
                        objA2 = rouVar.a(false, this);
                        if (objA2 == wneVar22) {
                            return wneVar22;
                        }
                    }
                    return new Integer(iX);
                }
                if (!z25) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                iX = wvb.X(((m2c0) objA2).c);
                return new Integer(iX);
            case 22:
                zql0 zql0Var = (zql0) obj3;
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    qvu qvuVar = zql0Var.d;
                    this.j = true;
                    if (qvuVar.a(this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                zql0Var.h.o(null, i8d.c);
                return Unit.f46060a;
            case 23:
                boolean z27 = this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                if (z27) {
                    int i10 = zxl0.w;
                    ((zxl0) obj3).M(true);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    ezl0 ezl0Var = (ezl0) obj3;
                    TypeStageId typeStageId = ezl0Var.o;
                    this.j = true;
                    if (ezl0Var.M(typeStageId, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                boolean z29 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                if (z29) {
                    int i11 = w3m0.N;
                    ((w3m0) obj3).N();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ybm0 ybm0Var = (ybm0) obj3;
                boolean z30 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                if (z30 && (((dcm0) ybm0Var.D()).c || ((dcm0) ybm0Var.D()).b)) {
                    ybm0Var.M(false);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    wnm0 wnm0Var = (wnm0) obj3;
                    aau aauVar = wnm0Var.d;
                    sys0 sys0Var = wnm0Var.c;
                    s77 s77Var = wnm0Var.b;
                    ArrayList arrayList2 = wnm0Var.h;
                    this.j = true;
                    if (aauVar.a(sys0Var, s77Var, arrayList2, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ltm0 ltm0Var = (ltm0) obj3;
                wne wneVar29 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    nr nrVar = ltm0Var.d;
                    this.j = true;
                    if (nrVar.v(this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ltm0Var.h.o(null, i8d.c);
                return Unit.f46060a;
            default:
                dzm0 dzm0Var = (dzm0) obj3;
                wne wneVar30 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    dnq dnqVar = new dnq(dub.f0(dzm0Var.g.a(), dzm0Var.f.a(), dzm0Var.e.b(), new fl9(dzm0Var, r110 == true ? 1 : 0, b6)), new pr60(i, r19 == true ? 1 : 0, b5), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
