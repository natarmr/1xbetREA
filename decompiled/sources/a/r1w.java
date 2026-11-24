package a;

import com.android.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class r1w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new r1w(xae0Var, clzVar, (q1w) obj2, yjeVar);
            case 1:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new r1w(xae0Var2, clzVar2, (x3w) obj2, yjeVar);
            case 2:
                vae0 vae0Var = (vae0) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new r1w(vae0Var, clzVar3, (x3w) obj2, yjeVar);
            case 3:
                xae0 xae0Var3 = (xae0) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new r1w(xae0Var3, clzVar4, (w6w) obj2, yjeVar);
            case 4:
                xae0 xae0Var4 = (xae0) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new r1w(xae0Var4, clzVar5, (w6w) obj2, yjeVar, (byte) 0);
            case 5:
                vae0 vae0Var2 = (vae0) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new r1w(vae0Var2, clzVar6, (w6w) obj2, yjeVar);
            case 6:
                i89 i89Var = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new r1w(i89Var, clzVar7, (ens) obj2, yjeVar);
            case 7:
                i89 i89Var2 = (i89) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new r1w(i89Var2, clzVar8, (ens) obj2, yjeVar, (byte) 0);
            case 8:
                i89 i89Var3 = (i89) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new r1w(i89Var3, clzVar9, (ens) obj2, yjeVar, (char) 0);
            case 9:
                i89 i89Var4 = (i89) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new r1w(i89Var4, clzVar10, (ens) obj2, yjeVar, 0);
            case 10:
                r1w r1wVar = new r1w((ekw) this.l, (ukw) obj2, this.j, yjeVar);
                r1wVar.k = obj;
                return r1wVar;
            case 11:
                return new r1w((l7m0) this.k, (t33) this.l, (t33) obj2, yjeVar);
            case 12:
                dnq dnqVar = (dnq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new r1w(dnqVar, clzVar11, (u8x) obj2, yjeVar);
            case 13:
                gmq gmqVar = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new r1w(gmqVar, clzVar12, (u8x) obj2, yjeVar);
            case 14:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new r1w(gmqVar2, clzVar13, (u8x) obj2, yjeVar, (byte) 0);
            case 15:
                s6n0 s6n0Var = (s6n0) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new r1w(s6n0Var, clzVar14, (kaw) obj2, yjeVar);
            case 16:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new r1w(gmqVar3, clzVar15, (pfl) obj2, yjeVar);
            case 17:
                i89 i89Var5 = (i89) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new r1w(i89Var5, clzVar16, (khx) obj2, yjeVar);
            case 18:
                r1w r1wVar2 = new r1w((rix) obj2, yjeVar, (byte) 18);
                r1wVar2.l = obj;
                return r1wVar2;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new r1w(gmqVar4, clzVar17, (kaw) obj2, yjeVar);
            case 20:
                i89 i89Var6 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new r1w(i89Var6, clzVar18, (ens) obj2, yjeVar, (short) 0);
            case 21:
                i89 i89Var7 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new r1w(i89Var7, clzVar19, (ens) obj2, yjeVar, (byte) 0, false);
            case 22:
                return new r1w((a2y) obj2, yjeVar, (byte) 22);
            case 23:
                i89 i89Var8 = (i89) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new r1w(i89Var8, clzVar20, (ens) obj2, yjeVar, (byte) 0, (byte) 0);
            case 24:
                return new r1w((d4y) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r1w r1wVar3 = new r1w((i3t0) this.l, (ql5) obj2, yjeVar, (byte) 25);
                r1wVar3.k = obj;
                return r1wVar3;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new r1w(i89Var9, clzVar21, (ens) obj2, yjeVar, (byte) 0, (char) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new r1w((c5y) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                r1w r1wVar4 = new r1w((i3t0) this.l, (ql5) obj2, yjeVar, (byte) 28);
                r1wVar4.k = obj;
                return r1wVar4;
            default:
                i89 i89Var10 = (i89) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new r1w(i89Var10, clzVar22, (ens) obj2, yjeVar, (byte) 0, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((r1w) create((jih) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r1w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List listA;
        List listA2;
        Object objD;
        v88 v88Var;
        Object objG;
        i1w0 i1w0Var;
        v88 v88Var2;
        Object objG2;
        i1w0 i1w0Var2;
        Object g0g0Var;
        Object value;
        x3y x3yVar;
        Object objC;
        v88 v88Var3;
        Object objG3;
        i1w0 i1w0Var3;
        Object g0g0Var2;
        Object value2;
        zzx zzxVar;
        Object objC2;
        byte b = this.i;
        byte b2 = 27;
        byte b3 = 2;
        byte b4 = 0;
        Object obj2 = this.m;
        byte b5 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    ggv ggvVar = new ggv((q1w) obj2, b2);
                    this.j = true;
                    if (bq9VarB.c(ggvVar, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    ggv ggvVar2 = new ggv((x3w) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB2.c(ggvVar2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((vae0) this.k, ((clz) this.l).x(), lkz.d);
                    ggv ggvVar3 = new ggv((x3w) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB3.c(ggvVar3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar = new v6w((w6w) obj2, b4);
                    this.j = true;
                    if (bq9VarB4.c(v6wVar, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar2 = new v6w((w6w) obj2, b5);
                    this.j = true;
                    if (bq9VarB5.c(v6wVar2, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((vae0) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar3 = new v6w((w6w) obj2, b3);
                    this.j = true;
                    if (bq9VarB6.c(v6wVar3, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar4 = new v6w((ens) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB7.c(v6wVar4, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar5 = new v6w((ens) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB8.c(v6wVar5, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar6 = new v6w((ens) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB9.c(v6wVar6, this) == wneVar9) {
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
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar7 = new v6w((ens) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB10.c(v6wVar7, this) == wneVar10) {
                        return wneVar10;
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
                ekw ekwVar = (ekw) this.l;
                CyberGamesPage cyberGamesPage = ekwVar.f7971a;
                ukw ukwVar = (ukw) obj2;
                jih jihVar = (jih) this.k;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                Object obj3 = jihVar.c;
                Object obj4 = jihVar.d;
                e0g0 e0g0Var = j0g0.b;
                List list = (List) (obj3 instanceof g0g0 ? null : obj3);
                if (list == null) {
                    list = iun.f15405a;
                }
                long jH0 = uzb.h0(list, cyberGamesPage, ((zjw) ukwVar.D()).m);
                boolean z11 = obj4 instanceof g0g0;
                List list2 = (List) (z11 ? null : obj4);
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                long jH1 = uzb.h0(list2, cyberGamesPage, ((zjw) ukwVar.D()).n);
                boolean z12 = obj3 instanceof g0g0;
                List list3 = (List) (z12 ? null : obj3);
                if (list3 != null) {
                    List list4 = (List) ((zjw) ukwVar.D()).o.get(cyberGamesPage);
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    listA = vbo.a(list3, cyberGamesPage, list4);
                } else {
                    listA = null;
                }
                if (listA == null) {
                    listA = iun.f15405a;
                }
                List list5 = listA;
                List list6 = (List) (z11 ? null : obj4);
                if (list6 != null) {
                    List list7 = (List) ((zjw) ukwVar.D()).p.get(cyberGamesPage);
                    if (list7 == null) {
                        list7 = iun.f15405a;
                    }
                    listA2 = vbo.a(list6, cyberGamesPage, list7);
                } else {
                    listA2 = null;
                }
                if (listA2 == null) {
                    listA2 = iun.f15405a;
                }
                List list8 = listA2;
                sip sipVar = (sip) ((zjw) ukwVar.D()).l.get(cyberGamesPage);
                if (z12) {
                    obj3 = null;
                }
                List list9 = (List) obj3;
                boolean zIsEmpty = list9 != null ? list9.isEmpty() : true;
                if (z11) {
                    obj4 = null;
                }
                List list10 = (List) obj4;
                boolean zIsEmpty2 = list10 != null ? list10.isEmpty() : true;
                if (zIsEmpty && !zIsEmpty2) {
                    sipVar = sip.b;
                } else if ((!zIsEmpty && zIsEmpty2) || sipVar == null) {
                    sipVar = sip.c;
                }
                sip sipVar2 = sipVar;
                Object obj5 = jihVar.h;
                Collection collection = (List) (obj5 instanceof g0g0 ? null : obj5);
                if (collection == null) {
                    collection = iun.f15405a;
                }
                ukwVar.H(new hw7(ekwVar, this.j, jihVar, jH0, jH1, list5, list8, sipVar2, !collection.isEmpty()));
                if (kih.a(jihVar, cyberGamesPage, ukw.M((zjw) ukwVar.D()))) {
                    e3c.n(ukwVar.R);
                }
                ukwVar.P.g(ukw.X((zjw) ukwVar.D()));
                return Unit.f46060a;
            case 11:
                l7m0 l7m0Var = (l7m0) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    this.j = true;
                    if (dwi0.K(((Boolean) ((Pair) l7m0Var.getValue()).f46059a).booleanValue(), ((Boolean) ((Pair) l7m0Var.getValue()).b).booleanValue(), (t33) this.l, (t33) obj2, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar8 = new v6w((u8x) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB11.c(v6wVar8, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar9 = new v6w((u8x) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB12.c(v6wVar9, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar10 = new v6w((u8x) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB13.c(v6wVar10, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((s6n0) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar11 = new v6w((kaw) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB14.c(v6wVar11, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar12 = new v6w((pfl) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB15.c(v6wVar12, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar13 = new v6w((khx) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB16.c(v6wVar13, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                rix rixVar = (rix) obj2;
                n0o0 n0o0Var = rixVar.e;
                vne vneVar = (vne) this.l;
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                try {
                    if (!z20) {
                        z1x.P(obj);
                        Object value3 = n0o0Var.getValue();
                        value3.getClass();
                        InstallReferrerClient installReferrerClient = (InstallReferrerClient) value3;
                        e0g0 e0g0Var2 = j0g0.b;
                        z8w0 z8w0Var = rixVar.c;
                        String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                        installReferrer.getClass();
                        this.l = vneVar;
                        this.k = rixVar;
                        this.j = true;
                        objD = z8w0Var.d(this, installReferrer, false);
                        if (objD == wneVar19) {
                            return wneVar19;
                        }
                    } else {
                        if (!z20) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rixVar = (rix) this.k;
                        z1x.P(obj);
                        objD = obj;
                    }
                    rixVar.b.e((String) objD);
                    e0g0 e0g0Var3 = j0g0.b;
                    break;
                } catch (Throwable unused) {
                    e0g0 e0g0Var4 = j0g0.b;
                }
                try {
                    Object value4 = n0o0Var.getValue();
                    value4.getClass();
                    ((InstallReferrerClient) value4).endConnection();
                    break;
                } catch (Throwable unused2) {
                    e0g0 e0g0Var5 = j0g0.b;
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.e);
                    v6w v6wVar14 = new v6w((kaw) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB17.c(v6wVar14, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar15 = new v6w((ens) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB18.c(v6wVar15, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar16 = new v6w((ens) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB19.c(v6wVar16, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                a2y a2yVar = (a2y) obj2;
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    v88Var = a2yVar.t;
                    i1w0 i1w0Var4 = a2yVar.C;
                    khf0 khf0Var = a2yVar.s;
                    bm5 bm5Var = bm5.m;
                    this.k = v88Var;
                    this.l = i1w0Var4;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar23) {
                        return wneVar23;
                    }
                    i1w0Var = i1w0Var4;
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.l;
                    v88 v88Var4 = (v88) this.k;
                    z1x.P(obj);
                    v88Var = v88Var4;
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                a2yVar.u.a(bm5.m, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar17 = new v6w((ens) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB20.c(v6wVar17, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                d4y d4yVar = (d4y) obj2;
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    v88Var2 = d4yVar.s;
                    i1w0 i1w0Var5 = d4yVar.C;
                    khf0 khf0Var2 = d4yVar.r;
                    bm5 bm5Var2 = bm5.m;
                    this.k = v88Var2;
                    this.l = i1w0Var5;
                    this.j = true;
                    objG2 = khf0.G(khf0Var2, bm5Var2, this);
                    if (objG2 == wneVar25) {
                        return wneVar25;
                    }
                    i1w0Var2 = i1w0Var5;
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var2 = (i1w0) this.l;
                    v88 v88Var5 = (v88) this.k;
                    z1x.P(obj);
                    v88Var2 = v88Var5;
                    objG2 = obj;
                }
                ql5 ql5Var2 = (ql5) objG2;
                d4yVar.t.a(bm5.m, ql5Var2);
                v88.b(v88Var2, i1w0Var2, ql5Var2.f28916a, 2);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ql5 ql5Var3 = (ql5) obj2;
                d4y d4yVar2 = (d4y) this.l;
                wne wneVar26 = wne.f39444a;
                boolean z27 = this.j;
                try {
                    if (!z27) {
                        z1x.P(obj);
                        e0g0 e0g0Var6 = j0g0.b;
                        m0u m0uVar = d4yVar2.z;
                        long j = ql5Var3.e;
                        this.k = null;
                        this.j = true;
                        objC = m0uVar.f20973a.c(j, this);
                        if (objC == wneVar26) {
                            return wneVar26;
                        }
                    } else {
                        if (!z27) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objC = obj;
                    }
                    g0g0Var = new Double(((xuf) objC).n);
                    e0g0 e0g0Var7 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var8 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Object d = new Double(0.0d);
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = d;
                }
                double dDoubleValue = ((Number) g0g0Var).doubleValue();
                double dDoubleValue2 = d4yVar2.o.h().doubleValue();
                xw6 xw6Var = ((x3y) d4yVar2.D()).c;
                double dDoubleValue3 = d4yVar2.p.b().doubleValue();
                String str = ql5Var3.f;
                str.getClass();
                dpm0 dpm0Var = new dpm0(dDoubleValue2, dDoubleValue, dDoubleValue2, dDoubleValue3, str, false);
                p7m0 p7m0Var = d4yVar2.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    x3yVar = (x3y) value;
                } while (!p7m0Var.m(value, x3y.a(x3yVar, null, new xw6(x3yVar.c.f41594a, dpm0Var), false, 27)));
                d4yVar2.M(dDoubleValue2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar18 = new v6w((ens) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB21.c(v6wVar18, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                c5y c5yVar = (c5y) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    v88Var3 = c5yVar.s;
                    i1w0 i1w0Var6 = c5yVar.C;
                    khf0 khf0Var3 = c5yVar.r;
                    bm5 bm5Var3 = bm5.m;
                    this.k = v88Var3;
                    this.l = i1w0Var6;
                    this.j = true;
                    objG3 = khf0.G(khf0Var3, bm5Var3, this);
                    if (objG3 == wneVar28) {
                        return wneVar28;
                    }
                    i1w0Var3 = i1w0Var6;
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var3 = (i1w0) this.l;
                    v88 v88Var6 = (v88) this.k;
                    z1x.P(obj);
                    v88Var3 = v88Var6;
                    objG3 = obj;
                }
                ql5 ql5Var4 = (ql5) objG3;
                c5yVar.t.a(bm5.m, ql5Var4);
                v88.b(v88Var3, i1w0Var3, ql5Var4.f28916a, 2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ql5 ql5Var5 = (ql5) obj2;
                c5y c5yVar2 = (c5y) this.l;
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                try {
                    if (!z30) {
                        z1x.P(obj);
                        e0g0 e0g0Var9 = j0g0.b;
                        m0u m0uVar2 = c5yVar2.z;
                        long j2 = ql5Var5.e;
                        this.k = null;
                        this.j = true;
                        objC2 = m0uVar2.f20973a.c(j2, this);
                        if (objC2 == wneVar29) {
                            return wneVar29;
                        }
                    } else {
                        if (!z30) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objC2 = obj;
                    }
                    g0g0Var2 = new Double(((xuf) objC2).n);
                    e0g0 e0g0Var10 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var11 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                Object d2 = new Double(0.0d);
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = d2;
                }
                double dDoubleValue4 = ((Number) g0g0Var2).doubleValue();
                double dDoubleValue5 = c5yVar2.o.h().doubleValue();
                yw6 yw6Var = ((zzx) c5yVar2.D()).c;
                double dDoubleValue6 = c5yVar2.p.b().doubleValue();
                String str2 = ql5Var5.f;
                str2.getClass();
                epm0 epm0Var = new epm0(dDoubleValue5, dDoubleValue4, dDoubleValue5, dDoubleValue6, str2, false);
                p7m0 p7m0Var2 = c5yVar2.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    zzxVar = (zzx) value2;
                } while (!p7m0Var2.m(value2, zzx.a(zzxVar, null, new yw6(zzxVar.c.f43355a, epm0Var), false, 27)));
                c5yVar2.M(dDoubleValue5);
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    v6w v6wVar19 = new v6w((ens) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB22.c(v6wVar19, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, ens ensVar, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ensVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(i89 i89Var, clz clzVar, khx khxVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = khxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(gmq gmqVar, clz clzVar, pfl pflVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = pflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(gmq gmqVar, clz clzVar, kaw kawVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(gmq gmqVar, clz clzVar, u8x u8xVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = u8xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(gmq gmqVar, clz clzVar, u8x u8xVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = u8xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(dnq dnqVar, clz clzVar, u8x u8xVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = u8xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(ekw ekwVar, ukw ukwVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.l = ekwVar;
        this.m = ukwVar;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(vae0 vae0Var, clz clzVar, x3w x3wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = x3wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(vae0 vae0Var, clz clzVar, w6w w6wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = w6wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(xae0 xae0Var, clz clzVar, q1w q1wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = q1wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(xae0 xae0Var, clz clzVar, x3w x3wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = x3wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(xae0 xae0Var, clz clzVar, w6w w6wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = w6wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(xae0 xae0Var, clz clzVar, w6w w6wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = w6wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(l7m0 l7m0Var, t33 t33Var, t33 t33Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.k = l7m0Var;
        this.l = t33Var;
        this.m = t33Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1w(s6n0 s6n0Var, clz clzVar, kaw kawVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = s6n0Var;
        this.l = clzVar;
        this.m = kawVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1w(i3t0 i3t0Var, ql5 ql5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = i3t0Var;
        this.m = ql5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1w(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }
}
