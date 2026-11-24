package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class g8g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (fob) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (fob) obj2, yjeVar, (byte) 0);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new g8g((s6n0) this.k, (clz) obj3, (e9g) obj2, yjeVar);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (d7e) obj2, yjeVar);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (e9g) obj2, yjeVar);
            case 5:
                lkz lkzVar6 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar);
            case 6:
                lkz lkzVar7 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (byte) 0);
            case 7:
                lkz lkzVar8 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (char) 0);
            case 8:
                lkz lkzVar9 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, 0);
            case 9:
                g8g g8gVar = new g8g(obj3, obj2, yjeVar, (byte) 9);
                g8gVar.k = obj;
                return g8gVar;
            case 10:
                lkz lkzVar10 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (tpg) obj2, yjeVar);
            case 11:
                lkz lkzVar11 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (tpg) obj2, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar12 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (tpg) obj2, yjeVar, (char) 0);
            case 13:
                lkz lkzVar13 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (w4h) obj2, yjeVar);
            case 14:
                lkz lkzVar14 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (w4h) obj2, yjeVar, (byte) 0);
            case 15:
                lkz lkzVar15 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (w4h) obj2, yjeVar, (char) 0);
            case 16:
                lkz lkzVar16 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (short) 0);
            case 17:
                return new g8g(this.k, (pz40) obj3, (pz40) obj2, yjeVar, (byte) 17);
            case 18:
                lkz lkzVar17 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (csh) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar18 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (csh) obj2, yjeVar, (byte) 0);
            case 20:
                lkz lkzVar19 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (byte) 0, false);
            case 21:
                lkz lkzVar20 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (byte) 0, (byte) 0);
            case 22:
                lkz lkzVar21 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (byte) 0, (char) 0);
            case 23:
                lkz lkzVar22 = lkz.f20223a;
                return new g8g((i89) this.k, (clz) obj3, (mhc) obj2, yjeVar, (byte) 0, 0);
            case 24:
                g8g g8gVar2 = new g8g(obj3, obj2, yjeVar, (byte) 24);
                g8gVar2.k = obj;
                return g8gVar2;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar23 = lkz.f20223a;
                return new g8g((gmq) this.k, (ngj) obj3, (mgj) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar24 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (mgj) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar25 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (mgj) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar26 = lkz.f20223a;
                return new g8g((gmq) this.k, (clz) obj3, (jv0) obj2, yjeVar);
            default:
                return new g8g(this.k, (pz40) obj3, (pz40) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((g8g) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g8g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        byte b = this.i;
        byte b2 = 27;
        byte b3 = 14;
        byte b4 = 15;
        byte b5 = 16;
        Object obj2 = this.m;
        Object obj3 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar = new m0g((fob) obj2, b3);
                    this.j = true;
                    if (bq9VarB.c(m0gVar, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.e);
                    m0g m0gVar2 = new m0g((fob) obj2, b4);
                    this.j = true;
                    if (bq9VarB2.c(m0gVar2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((s6n0) this.k, ((clz) obj3).x(), lkz.e);
                    m0g m0gVar3 = new m0g((e9g) obj2, b5);
                    this.j = true;
                    if (bq9VarB3.c(m0gVar3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar4 = new m0g((d7e) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB4.c(m0gVar4, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar5 = new m0g((e9g) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB5.c(m0gVar5, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar6 = new m0g((mhc) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB6.c(m0gVar6, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar7 = new m0g((mhc) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB7.c(m0gVar7, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar8 = new m0g((mhc) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB8.c(m0gVar8, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar9 = new m0g((mhc) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB9.c(m0gVar9, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                kmq kmqVar = (kmq) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    CyberGamesPage cyberGamesPage = (CyberGamesPage) obj2;
                    LinkedHashMap linkedHashMap = ((img) obj3).b.f19707a;
                    Object or30Var = linkedHashMap.get(cyberGamesPage);
                    if (or30Var == null) {
                        or30Var = new or30();
                        linkedHashMap.put(cyberGamesPage, or30Var);
                    }
                    List list = (List) ((or30) or30Var).b();
                    if (list != null) {
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(list, this) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar10 = new m0g((tpg) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB10.c(m0gVar10, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar11 = new m0g((tpg) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB11.c(m0gVar11, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar12 = new m0g((tpg) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB12.c(m0gVar12, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar13 = new m0g((w4h) obj2, b2);
                    this.j = true;
                    if (bq9VarB13.c(m0gVar13, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar14 = new m0g((w4h) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB14.c(m0gVar14, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    m0g m0gVar15 = new m0g((w4h) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB15.c(m0gVar15, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar = new b5h((mhc) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB16.c(b5hVar, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                egk0 egk0Var = (egk0) obj3;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (z18 && !z18) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                do {
                    int i = yhh.b;
                    if (egk0Var.l() <= 0) {
                        return Unit.f46060a;
                    }
                    egk0Var.m(yhh.d((Long) this.k, ((egk0) obj2).l()));
                    j = yhh.f42636a;
                    this.j = true;
                } while (qcc.P(j, this) != wneVar18);
                return wneVar18;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar2 = new b5h((csh) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB17.c(b5hVar2, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar3 = new b5h((csh) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB18.c(b5hVar3, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar4 = new b5h((mhc) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB19.c(b5hVar4, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar5 = new b5h((mhc) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB20.c(b5hVar5, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar6 = new b5h((mhc) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB21.c(b5hVar6, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar7 = new b5h((mhc) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB22.c(b5hVar7, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                ncj ncjVar = (ncj) obj3;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    vne vneVar = (vne) this.k;
                    odd oddVar = new odd();
                    g7m0 g7m0VarA = ncjVar.h.a();
                    if (g7m0VarA instanceof naj) {
                        g7m0VarA = new l460(((naj) g7m0VarA).f10823a);
                    }
                    u340 u340Var = new u340((Function2) obj2, oddVar, g7m0VarA, vneVar.getCoroutineContext());
                    z220 z220Var = ncjVar.l;
                    Object objF = ((q99) z220Var.d).f(u340Var);
                    if (objF instanceof xtb) {
                        Throwable thA = ztb.a(objF);
                        if (thA == null) {
                            throw new gvc("Channel was closed normally");
                        }
                        throw thA;
                    }
                    if (!(objF instanceof ytb)) {
                        if (((AtomicInteger) ((ok50) z220Var.e).f25390a).getAndIncrement() == 0) {
                            qjj.W((vne) z220Var.b, null, null, new zye0(z220Var, yjeVar, b2), 3);
                        }
                        this.j = true;
                        Object objQ = oddVar.q(this);
                        return objQ == wneVar25 ? wneVar25 : objQ;
                    }
                    jf4.n("Check failed.");
                } else {
                    if (z25) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((gmq) this.k, ((ngj) obj3).u1, lkz.c);
                    b5h b5hVar8 = new b5h((mgj) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB23.c(b5hVar8, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar9 = new b5h((mgj) obj2, b3);
                    this.j = true;
                    if (bq9VarB24.c(b5hVar9, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar10 = new b5h((mgj) obj2, b4);
                    this.j = true;
                    if (bq9VarB25.c(b5hVar10, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    b5h b5hVar11 = new b5h((jv0) obj2, b5);
                    this.j = true;
                    if (bq9VarB26.c(b5hVar11, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                pz40 pz40Var = (pz40) obj3;
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    pz40 pz40Var2 = (pz40) this.k;
                    float f = jjj.b;
                    if (((Number) pz40Var2.getValue()).longValue() > 0 && ((Number) pz40Var.getValue()).intValue() == 1) {
                        long j2 = jjj.f16620a;
                        this.j = true;
                        if (qcc.P(j2, this) == wneVar30) {
                            return wneVar30;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z30) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pz40 pz40Var3 = (pz40) obj2;
                float f2 = jjj.b;
                pz40Var3.setValue(Boolean.valueOf(((Number) pz40Var.getValue()).intValue() == 1));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = mhcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, ngj ngjVar, mgj mgjVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = ngjVar;
        this.m = mgjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, jv0 jv0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jv0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, d7e d7eVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = d7eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, e9g e9gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, tpg tpgVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tpgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, tpg tpgVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tpgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, tpg tpgVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tpgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, w4h w4hVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = w4hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, w4h w4hVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = w4hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, w4h w4hVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = w4hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, csh cshVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = cshVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, csh cshVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = cshVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, mgj mgjVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = mgjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(gmq gmqVar, clz clzVar, mgj mgjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = mgjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8g(s6n0 s6n0Var, clz clzVar, e9g e9gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = s6n0Var;
        this.l = clzVar;
        this.m = e9gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8g(Object obj, pz40 pz40Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = pz40Var;
        this.m = pz40Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8g(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
