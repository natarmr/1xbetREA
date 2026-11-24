package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.localtimedif.impl.presentation.localtimediffworker.LocalTimeDiffWorker;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes4.dex */
public final class slx extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ slx(Object obj, yje yjeVar, byte b) {
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
                return new slx((vj50) obj2, yjeVar, (byte) 0);
            case 1:
                slx slxVar = new slx((d4y) obj2, yjeVar, (byte) 1);
                slxVar.j = ((Boolean) obj).booleanValue();
                return slxVar;
            case 2:
                slx slxVar2 = new slx((c5y) obj2, yjeVar, (byte) 2);
                slxVar2.j = ((Boolean) obj).booleanValue();
                return slxVar2;
            case 3:
                return new slx((e7y) obj2, yjeVar, (byte) 3);
            case 4:
                return new slx((egk0) obj2, yjeVar, (byte) 4);
            case 5:
                slx slxVar3 = new slx((f8y) obj2, yjeVar, (byte) 5);
                slxVar3.j = ((Boolean) obj).booleanValue();
                return slxVar3;
            case 6:
                return new slx((s8y) obj2, yjeVar, (byte) 6);
            case 7:
                slx slxVar4 = new slx((ryy) obj2, yjeVar, (byte) 7);
                slxVar4.j = ((Boolean) obj).booleanValue();
                return slxVar4;
            case 8:
                slx slxVar5 = new slx((wzy) obj2, yjeVar, (byte) 8);
                slxVar5.j = ((Boolean) obj).booleanValue();
                return slxVar5;
            case 9:
                return new slx((ieu) obj2, yjeVar, (byte) 9);
            case 10:
                slx slxVar6 = new slx((eiz) obj2, yjeVar, (byte) 10);
                slxVar6.j = ((Boolean) obj).booleanValue();
                return slxVar6;
            case 11:
                return new slx((irz) obj2, yjeVar, (byte) 11);
            case 12:
                slx slxVar7 = new slx((cxz) obj2, yjeVar, (byte) 12);
                slxVar7.j = ((Boolean) obj).booleanValue();
                return slxVar7;
            case 13:
                return new slx((j400) obj2, yjeVar, (byte) 13);
            case 14:
                slx slxVar8 = new slx((w400) obj2, yjeVar, (byte) 14);
                slxVar8.j = ((Boolean) obj).booleanValue();
                return slxVar8;
            case 15:
                slx slxVar9 = new slx((gb00) obj2, yjeVar, (byte) 15);
                slxVar9.j = ((Boolean) obj).booleanValue();
                return slxVar9;
            case 16:
                return new slx((ef00) obj2, yjeVar, (byte) 16);
            case 17:
                slx slxVar10 = new slx((qi00) obj2, yjeVar, (byte) 17);
                slxVar10.j = ((Boolean) obj).booleanValue();
                return slxVar10;
            case 18:
                slx slxVar11 = new slx((bq00) obj2, yjeVar, (byte) 18);
                slxVar11.j = ((Boolean) obj).booleanValue();
                return slxVar11;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new slx((LocalTimeDiffWorker) obj2, yjeVar, (byte) 19);
            case 20:
                return new slx((nt00) obj2, yjeVar, (byte) 20);
            case 21:
                return new slx((ywu) obj2, yjeVar, (byte) 21);
            case 22:
                return new slx((wx00) obj2, yjeVar, (byte) 22);
            case 23:
                return new slx((b310) obj2, yjeVar, (byte) 23);
            case 24:
                slx slxVar12 = new slx((sf10) obj2, yjeVar, (byte) 24);
                slxVar12.j = ((Boolean) obj).booleanValue();
                return slxVar12;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                slx slxVar13 = new slx((ph10) obj2, yjeVar, (byte) 25);
                slxVar13.j = ((Boolean) obj).booleanValue();
                return slxVar13;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new slx((uj10) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                slx slxVar14 = new slx((bo10) obj2, yjeVar, (byte) 27);
                slxVar14.j = ((Boolean) obj).booleanValue();
                return slxVar14;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                slx slxVar15 = new slx((hv10) obj2, yjeVar, (byte) 28);
                slxVar15.j = ((Boolean) obj).booleanValue();
                return slxVar15;
            default:
                return new slx((l020) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((slx) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((slx) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((slx) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((slx) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((slx) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((slx) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((slx) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((slx) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((slx) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((slx) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((slx) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((slx) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool13 = (Boolean) obj;
                bool13.booleanValue();
                return ((slx) create(bool13, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                return ((slx) create(bool14, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                return ((slx) create(bool15, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((slx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object objA;
        j7y j7yVar;
        Object objM;
        Object value3;
        Object objB;
        Object value4;
        Object value5;
        Object objV;
        Object value6;
        Object value7;
        lak0 lak0Var;
        Object objA2;
        Object objA3;
        Object objI;
        Object value8;
        byte b = this.i;
        byte b2 = 0;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (((vj50) obj2).g(0L, 0L, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = d4y.F;
                p7m0 p7m0Var = ((d4y) obj2).i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, x3y.a((x3y) value, null, null, z2, 15)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = c5y.F;
                p7m0 p7m0Var2 = ((c5y) obj2).i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, zzx.a((zzx) value2, null, null, z3, 15)));
                return Unit.f46060a;
            case 3:
                e7y e7yVar = (e7y) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ieu ieuVar = e7yVar.f7347a;
                    knf0 knf0Var = e7yVar.d;
                    String strA = e7yVar.b.a();
                    knf0Var.getClass();
                    String strC = knf0Var.c();
                    this.j = true;
                    objA = ((qzx) ((y2x) ieuVar.c).invoke()).a(strA, 22, strC, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                k7y k7yVar = (k7y) ((u2t) objA).a();
                Long l = k7yVar.f;
                if (l == null || l.longValue() <= 0 || (j7yVar = k7yVar.e) == null) {
                    jf4.k(null);
                    return null;
                }
                String str = j7yVar.f16061a;
                if (str == null) {
                    str = "0";
                }
                String str2 = j7yVar.b;
                if (str2 == null) {
                    str2 = "0";
                }
                String str3 = j7yVar.c;
                if (str3 == null) {
                    str3 = "0";
                }
                String str4 = j7yVar.d;
                return new Pair(new f6y(str, str2, str3, str4 != null ? str4 : "0"), l);
            case 4:
                egk0 egk0Var = (egk0) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (egk0Var.l() > 0) {
                        this.j = true;
                        if (qcc.O(1000L, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                egk0Var.m(egk0Var.l() - 1000);
                return Unit.f46060a;
            case 5:
                f8y f8yVar = (f8y) obj2;
                boolean z6 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z6 && (((u7y) f8yVar.D()).f35208a instanceof m7y)) {
                    f8yVar.M(3);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    gmq data = ((s8y) obj2).c.getData();
                    this.j = true;
                    objM = ntb.M(data, this);
                    if (objM == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                az40 az40Var = (az40) objM;
                if (az40Var != null) {
                    return az40Var.a();
                }
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return lunVar;
            case 7:
                boolean z8 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ryy ryyVar = (ryy) obj2;
                int i3 = ryy.z;
                p7m0 p7m0Var3 = ryyVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, pyy.a((pyy) value3, z8, null, null, null, 126)));
                if (z8) {
                    bby bbyVar = ryyVar.y;
                    if (bbyVar != null) {
                        e3c.n(bbyVar);
                    }
                    ryyVar.y = i3t0.K(ryyVar, null, null, new hr(ryyVar, yjeVar, (byte) 19), 3);
                }
                return Unit.f46060a;
            case 8:
                wzy wzyVar = (wzy) obj2;
                boolean z9 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                boolean z10 = !z9 && ((rzy) wzyVar.D()).f31384a;
                if (z9 && (((rzy) wzyVar.D()).b || ((rzy) wzyVar.D()).c)) {
                    b2 = 1;
                }
                if (z10 || b2 != 0) {
                    int i4 = wzy.v;
                    wzyVar.M();
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    l73 l73Var = (l73) ((ieu) obj2).c;
                    Float f = new Float(0.0f);
                    nul0 nul0VarG0 = ro4.g0(0.0f, 400.0f, new Float(0.5f), 1);
                    this.j = true;
                    if (hhm0.q(l73Var, f, nul0VarG0, true, null, this, 8) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                eiz eizVar = (eiz) obj2;
                boolean z12 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (z12) {
                    int i5 = eiz.E;
                    int iOrdinal = eizVar.o.c.ordinal();
                    byte b3 = 2;
                    if (iOrdinal == 0) {
                        bby bbyVar2 = eizVar.B;
                        if (bbyVar2 != null) {
                            e3c.n(bbyVar2);
                        }
                        eizVar.B = i3t0.K(eizVar, null, null, new ciz(eizVar, yjeVar, b3), 3);
                        eizVar.O();
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        bby bbyVar3 = eizVar.B;
                        if (bbyVar3 != null) {
                            e3c.n(bbyVar3);
                        }
                        eizVar.B = i3t0.K(eizVar, null, null, new ciz(eizVar, yjeVar, b3), 3);
                        eizVar.N();
                    }
                    eizVar.P();
                }
                int i6 = eiz.E;
                p7m0 p7m0Var4 = eizVar.i.f25029a;
                while (true) {
                    Object value9 = p7m0Var4.getValue();
                    value9.getClass();
                    boolean z13 = z12;
                    if (p7m0Var4.m(value9, ihz.a((ihz) value9, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, false, z13, false, 98303))) {
                        return Unit.f46060a;
                    }
                    z12 = z13;
                }
                break;
            case 11:
                irz irzVar = (irz) obj2;
                ocj ocjVar = irzVar.i;
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    htu htuVar = irzVar.s;
                    this.j = true;
                    objB = htuVar.f13652a.b(this);
                    if (objB == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                List list = (List) objB;
                if (list.isEmpty()) {
                    int i7 = irz.t;
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var5.getValue();
                        value4.getClass();
                    } while (!p7m0Var5.m(value4, erz.a((erz) value4, null, null, false, true, 3)));
                } else {
                    int i8 = irz.t;
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    while (true) {
                        Object value10 = p7m0Var6.getValue();
                        value10.getClass();
                        List list2 = list;
                        if (!p7m0Var6.m(value10, erz.a((erz) value10, list, null, false, false, 2))) {
                            list = list2;
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                boolean z15 = this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                cxz cxzVar = (cxz) obj2;
                if (z15) {
                    int i9 = cxz.x;
                    cxzVar.M();
                } else {
                    int i10 = cxz.x;
                    p7m0 p7m0Var7 = cxzVar.i.f25029a;
                    do {
                        value5 = p7m0Var7.getValue();
                        value5.getClass();
                    } while (!p7m0Var7.m(value5, uwz.a((uwz) value5, null, null, 0, false, true, 4079)));
                }
                return Unit.f46060a;
            case 13:
                j400 j400Var = (j400) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    wen.b.getClass();
                    j400Var.i = 0L;
                    qlq0.f28947a.getClass();
                    rq40.f30914a.getClass();
                    j400Var.k = new plq0(rq40.b());
                    String strA2 = j400Var.e.a();
                    this.j = true;
                    if (j400Var.a(strA2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                w400 w400Var = (w400) obj2;
                boolean z17 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (z17 && ((l400) w400Var.D()).e) {
                    w400Var.M();
                }
                return Unit.f46060a;
            case 15:
                gb00 gb00Var = (gb00) obj2;
                boolean z18 = this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (z18 && (((ma00) gb00Var.D()).f21437a || ((ma00) gb00Var.D()).b)) {
                    gb00Var.M(false);
                }
                return Unit.f46060a;
            case 16:
                ef00 ef00Var = (ef00) obj2;
                wne wneVar17 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    u8u u8uVar = ef00Var.X;
                    this.j = true;
                    objV = u8uVar.v(this);
                    if (objV == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                ef00Var.Q.d(new u400(ef00Var, (gx10) objV, (byte) 9));
                return Unit.f46060a;
            case 17:
                boolean z20 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                qi00 qi00Var = (qi00) obj2;
                if (z20) {
                    int i11 = qi00.I;
                    qi00Var.M(false);
                    e3c.n(qi00Var.G);
                    qi00Var.G = i3t0.F(qi00Var, qi00Var.q, null, null, new kyz((byte) 13), 119);
                } else if (((nj00) qi00Var.D()).c.isEmpty()) {
                    p7m0 p7m0Var8 = qi00Var.i.f25029a;
                    do {
                        value6 = p7m0Var8.getValue();
                        value6.getClass();
                    } while (!p7m0Var8.m(value6, nj00.a((nj00) value6, null, null, null, ais.b, null, false, null, false, 471)));
                } else {
                    e3c.n(qi00Var.D);
                }
                return Unit.f46060a;
            case 18:
                boolean z21 = this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                if (z21) {
                    bq00 bq00Var = (bq00) obj2;
                    int i12 = bq00.n0;
                    g8d g8dVar = (g8d) bq00Var.m0.get(kh3.RESOLVE);
                    if (g8dVar != null) {
                        bq00Var.O(g8dVar, new up00(bq00Var, b2));
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LocalTimeDiffWorker localTimeDiffWorker = (LocalTimeDiffWorker) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    drm0 drm0Var = localTimeDiffWorker.g;
                    if (drm0Var == null) {
                        Intrinsics.h("updateLocalTimeDiffUseCase");
                        throw null;
                    }
                    this.j = true;
                    Object objR = ((ieu) drm0Var.f6568a).r(System.currentTimeMillis() / 1000, this);
                    if (objR != wneVar20) {
                        objR = Unit.f46060a;
                    }
                    if (objR == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dpi0 dpi0Var = localTimeDiffWorker.h;
                if (dpi0Var != null) {
                    ((es00) ((ieu) dpi0Var.f6468a).c).f8306a = System.currentTimeMillis();
                    return Unit.f46060a;
                }
                Intrinsics.h("setLastTimeUpdatedUseCase");
                throw null;
            case 20:
                nt00 nt00Var = (nt00) obj2;
                wne wneVar21 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var9 = nt00Var.g;
                do {
                    value7 = p7m0Var9.getValue();
                    lak0Var = lak0.c;
                    ((kt00) value7).getClass();
                    lak0Var.getClass();
                } while (!p7m0Var9.m(value7, new kt00(lak0Var, false)));
                nt00Var.h.f(it00.f15331a);
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    ywu ywuVar = (ywu) obj2;
                    nr00 nr00Var = (nr00) ywuVar.b;
                    String strC2 = ((knf0) ywuVar.c).c();
                    this.j = true;
                    objA2 = ((jw00) ((tpv) nr00Var.f23980a).invoke()).a(strC2, this);
                    if (objA2 == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                return ((q16) objA2).a();
            case 22:
                wx00 wx00Var = (wx00) obj2;
                wne wneVar23 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    woc wocVar = wx00Var.q;
                    this.j = true;
                    if (wocVar.a(true, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                wx00Var.u.a();
                wx00Var.w.b(false);
                ((kt2) wx00Var.s.b).b("up_user_login", "not_signed_in");
                wx00Var.G(yx00.f43399a);
                return Unit.f46060a;
            case 23:
                b310 b310Var = (b310) obj2;
                wne wneVar24 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    h3c h3cVar = b310Var.q;
                    this.j = true;
                    objA3 = h3cVar.a(40L, 2L, this);
                    if (objA3 == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                b310Var.p.c().d(new u400(b310Var, (String) objA3, (byte) 14));
                return Unit.f46060a;
            case 24:
                sf10 sf10Var = (sf10) obj2;
                boolean z27 = this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                if (z27 && (((lf10) sf10Var.D()).d instanceof te10)) {
                    sf10Var.M();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ph10 ph10Var = (ph10) obj2;
                boolean z28 = this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                if (z28 && (((gh10) ph10Var.D()).d instanceof gg10)) {
                    ph10Var.M();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    fq fqVar = ((uj10) obj2).b;
                    this.j = true;
                    if (fqVar.f(ry5.f31296a, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean z30 = this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                bo10 bo10Var = (bo10) obj2;
                bo10Var.N = z30;
                if (z30 && bo10Var.H == null) {
                    bo10Var.A(c8h0.f3914a, false);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                boolean z31 = this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                atz atzVar = hv10.X1;
                DsTabBar dsTabBar = ((hv10) obj2).H0().b;
                dsTabBar.h.put("HISTORY_TAG", Boolean.valueOf(z31));
                kao0 kao0Var = dsTabBar.m;
                if (kao0Var != null) {
                    kao0Var.a("HISTORY_TAG", z31);
                }
                return Unit.f46060a;
            default:
                l020 l020Var = (l020) obj2;
                wne wneVar30 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    ieu ieuVar2 = l020Var.o;
                    this.j = true;
                    objI = ieuVar2.i(this);
                    if (objI == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                String strO = i4w0.O((elt) objI, l020Var.p.l(), l020Var.q.f6956a.a(), l020Var.r);
                p7m0 p7m0Var10 = l020Var.s;
                do {
                    value8 = p7m0Var10.getValue();
                } while (!p7m0Var10.m(value8, d020.a((d020) value8, false, 0, strO, 3)));
                p7m0 p7m0Var11 = l020Var.t;
                vz10 vz10Var = new vz10(strO);
                p7m0Var11.getClass();
                p7m0Var11.o(null, vz10Var);
                return Unit.f46060a;
        }
    }
}
