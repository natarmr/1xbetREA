package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u47 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                u47 u47Var = new u47(this.l, obj2, yjeVar, (byte) 0);
                u47Var.k = obj;
                return u47Var;
            case 1:
                return new u47((f97) this.k, (String) this.l, (a5w) obj2, yjeVar);
            case 2:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new u47(i89Var, clzVar, (o47) obj2, yjeVar);
            case 3:
                gmq gmqVar = (gmq) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new u47(gmqVar, clzVar2, (vp3) obj2, yjeVar);
            case 4:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new u47(gmqVar2, clzVar3, (yp6) obj2, yjeVar);
            case 5:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new u47(gmqVar3, clzVar4, (vp3) obj2, yjeVar, (byte) 0);
            case 6:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new u47(gmqVar4, clzVar5, (vp3) obj2, yjeVar, (char) 0);
            case 7:
                i89 i89Var2 = (i89) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new u47(i89Var2, clzVar6, (yp6) obj2, yjeVar);
            case 8:
                i89 i89Var3 = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new u47(i89Var3, clzVar7, (o47) obj2, yjeVar, (byte) 0);
            case 9:
                u47 u47Var2 = new u47(this.l, obj2, yjeVar, (byte) 9);
                u47Var2.k = obj;
                return u47Var2;
            case 10:
                u47 u47Var3 = new u47(this.l, obj2, yjeVar, (byte) 10);
                u47Var3.k = obj;
                return u47Var3;
            case 11:
                i89 i89Var4 = (i89) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new u47(i89Var4, clzVar8, (o47) obj2, yjeVar, (char) 0);
            case 12:
                i89 i89Var5 = (i89) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new u47(i89Var5, clzVar9, (o47) obj2, yjeVar, 0);
            case 13:
                u47 u47Var4 = new u47(this.l, obj2, yjeVar, (byte) 13);
                u47Var4.k = obj;
                return u47Var4;
            case 14:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new u47(gmqVar5, clzVar10, (i28) obj2, yjeVar);
            case 15:
                dnq dnqVar = (dnq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new u47(dnqVar, clzVar11, (i28) obj2, yjeVar);
            case 16:
                dnq dnqVar2 = (dnq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new u47(dnqVar2, clzVar12, (f38) obj2, yjeVar);
            case 17:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new u47(gmqVar6, clzVar13, (f38) obj2, yjeVar);
            case 18:
                return new u47((d48) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new u47(gmqVar7, clzVar14, (c48) obj2, yjeVar);
            case 20:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new u47(gmqVar8, clzVar15, (c48) obj2, yjeVar, (byte) 0);
            case 21:
                i89 i89Var6 = (i89) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new u47(i89Var6, clzVar16, (o47) obj2, yjeVar, (short) 0);
            case 22:
                i89 i89Var7 = (i89) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new u47(i89Var7, clzVar17, (o47) obj2, yjeVar, (byte) 0, false);
            case 23:
                i89 i89Var8 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new u47(i89Var8, clzVar18, (o47) obj2, yjeVar, (byte) 0, (byte) 0);
            case 24:
                i89 i89Var9 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new u47(i89Var9, clzVar19, (o47) obj2, yjeVar, (byte) 0, (char) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new u47(gmqVar9, clzVar20, (yp6) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i89 i89Var10 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new u47(i89Var10, clzVar21, (o47) obj2, yjeVar, (byte) 0, 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var11 = (i89) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new u47(i89Var11, clzVar22, (o47) obj2, yjeVar, (byte) 0, (short) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var12 = (i89) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new u47(i89Var12, clzVar23, (o47) obj2, yjeVar, (char) 0, false);
            default:
                i89 i89Var13 = (i89) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new u47(i89Var13, clzVar24, (o47) obj2, yjeVar, (char) 0, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u47) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((u47) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((u47) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u47) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objD;
        Object obj2;
        Object objJ;
        Object objA;
        Object objB;
        Object value;
        gnu gnuVar;
        Object objR;
        String str;
        Object value2;
        byte b = this.i;
        byte b2 = 13;
        byte b3 = 2;
        byte b4 = 19;
        Object obj3 = this.m;
        yje yjeVar = null;
        switch (b) {
            case 0:
                mii0 mii0Var = (mii0) this.l;
                v1z v1zVar = (v1z) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yzn0 yzn0Var = (yzn0) mii0Var.b;
                    String strA = ((btt0) mii0Var.c).a();
                    xa7 xa7Var = (xa7) obj3;
                    String strC = ((knf0) mii0Var.d).c();
                    Long l = v1zVar.f36657a;
                    List list = xa7Var.g;
                    int i = xa7Var.f40538a;
                    long j = xa7Var.b;
                    long j2 = xa7Var.c;
                    z47 ab7Var = list == null ? new ab7(strC, i, j, j2, xa7Var.d, 15, xa7Var.e, l, true, false, xa7Var.f) : new db7(strC, i, j, j2, xa7Var.d, 15, xa7Var.e, l, xa7Var.f, list);
                    this.k = null;
                    this.j = true;
                    objD = yzn0Var.d(strA, ab7Var, this);
                    obj2 = wneVar;
                    if (objD != wneVar) {
                    }
                    return obj2;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objD = obj;
                c57 c57Var = (c57) objD;
                List listA = c57Var.a();
                hv7 hv7Var = c57Var.f3757a;
                ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(tdc.f0((n97) it.next()));
                }
                obj2 = arrayList;
                if (unh0.n0(hv7Var).f20704a != -1) {
                    t47 t47Var = (t47) mii0Var.e;
                    t47Var.f33305a = null;
                    t47Var.f33305a = new mv7(unh0.n0(hv7Var));
                    obj2 = arrayList;
                }
                return obj2;
            case 1:
                String str2 = (String) this.l;
                f97 f97Var = (f97) this.k;
                fvt0 fvt0Var = f97Var.d0;
                mne mneVar = f97Var.q;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ocl oclVar = f97Var.O;
                    this.j = true;
                    objJ = oclVar.j();
                    if (objJ == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                boolean zY = axq.y(Long.parseLong(str2), (List) objJ);
                if ((((a5w) obj3) instanceof kzv) && zY) {
                    int i2 = f97.R0;
                    sac.V(jiu0.a(f97Var), null, null, mneVar.b, new x87(f97Var, str2, yjeVar, b3), 11);
                } else if (!f97Var.c0.i()) {
                    fvt0Var.x(Long.parseLong(str2));
                    f97Var.G(i67.f14227a);
                } else if (f97Var.J.a()) {
                    sac.V(jiu0.a(f97Var), new c87(f97Var, b4), null, mneVar.b, new ex1(f97Var, str2, yjeVar, b2), 10);
                } else {
                    fvt0Var.x(Long.parseLong(str2));
                    f97Var.G(r67.f29921a);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var = new qt6((o47) obj3, (byte) 5);
                    this.j = true;
                    if (bq9VarB.c(qt6Var, this) == wneVar3) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var2 = new qt6((vp3) obj3, (byte) 6);
                    this.j = true;
                    if (bq9VarB2.c(qt6Var2, this) == wneVar4) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var3 = new qt6((yp6) obj3, (byte) 7);
                    this.j = true;
                    if (bq9VarB3.c(qt6Var3, this) == wneVar5) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var4 = new qt6((vp3) obj3, (byte) 8);
                    this.j = true;
                    if (bq9VarB4.c(qt6Var4, this) == wneVar6) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var5 = new qt6((vp3) obj3, (byte) 9);
                    this.j = true;
                    if (bq9VarB5.c(qt6Var5, this) == wneVar7) {
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
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var6 = new qt6((yp6) obj3, (byte) 10);
                    this.j = true;
                    if (bq9VarB6.c(qt6Var6, this) == wneVar8) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var7 = new qt6((o47) obj3, (byte) 11);
                    this.j = true;
                    if (bq9VarB7.c(qt6Var7, this) == wneVar9) {
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
                cu cuVar = (cu) this.l;
                v1z v1zVar2 = (v1z) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    xex xexVar = (xex) cuVar.c;
                    String strA2 = ((btt0) cuVar.b).a();
                    ub7 ub7Var = (ub7) obj3;
                    hb7 hb7Var = new hb7(((knf0) cuVar.d).c(), ub7Var.f35366a, ub7Var.b, 15, kotlin.collections.a.c(1), v1zVar2.f36657a, false, true, false, ub7Var.c);
                    this.k = null;
                    this.j = true;
                    objA = ((oj7) ((zo4) xexVar.b).invoke()).a(strA2, hb7Var, this);
                    if (objA == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                List listA2 = ((c57) objA).a();
                ArrayList arrayList2 = new ArrayList(r3d.q(listA2, 10));
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(tdc.f0((n97) it2.next()));
                }
                return arrayList2;
            case 10:
                cu cuVar2 = (cu) this.l;
                v1z v1zVar3 = (v1z) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    xex xexVar2 = (xex) cuVar2.c;
                    String strA3 = ((btt0) cuVar2.b).a();
                    vb7 vb7Var = (vb7) obj3;
                    ab7 ab7Var2 = new ab7(((knf0) cuVar2.d).c(), vb7Var.f37127a, vb7Var.b, vb7Var.c, 0L, 15, kotlin.collections.a.c(1), v1zVar3.f36657a, false, true, false);
                    this.k = null;
                    this.j = true;
                    objB = ((oj7) ((zo4) xexVar2.b).invoke()).b(strA3, ab7Var2, this);
                    if (objB == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                List listA3 = ((c57) objB).a();
                ArrayList arrayList3 = new ArrayList(r3d.q(listA3, 10));
                Iterator it3 = listA3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(tdc.f0((n97) it3.next()));
                }
                return arrayList3;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var8 = new qt6((o47) obj3, (byte) 12);
                    this.j = true;
                    if (bq9VarB8.c(qt6Var8, this) == wneVar12) {
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
                    bq9 bq9VarB9 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var9 = new qt6((o47) obj3, b2);
                    this.j = true;
                    if (bq9VarB9.c(qt6Var9, this) == wneVar13) {
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
                vne vneVar = (vne) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    qjj.W(vneVar, null, null, new my7((t33) obj3, yjeVar, b3), 3);
                    t33 t33Var = (t33) this.l;
                    Float f = new Float(0.0f);
                    this.k = null;
                    this.j = true;
                    if (t33Var.f(this, f) == wneVar14) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var10 = new qt6((i28) obj3, (byte) 14);
                    this.j = true;
                    if (bq9VarB10.c(qt6Var10, this) == wneVar15) {
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
                    bq9 bq9VarB11 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var11 = new qt6((i28) obj3, (byte) 15);
                    this.j = true;
                    if (bq9VarB11.c(qt6Var11, this) == wneVar16) {
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
                    bq9 bq9VarB12 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var12 = new qt6((f38) obj3, (byte) 16);
                    this.j = true;
                    if (bq9VarB12.c(qt6Var12, this) == wneVar17) {
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
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var13 = new qt6((f38) obj3, (byte) 17);
                    this.j = true;
                    if (bq9VarB13.c(qt6Var13, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                d48 d48Var = (d48) obj3;
                p7m0 p7m0Var = d48Var.B;
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    if (d48Var.c.f3488a.a().z) {
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, v38.a((v38) value, null, null, true, false, null, 251)));
                        gnuVar = d48Var.z;
                        String strA4 = d48Var.g.a();
                        ali aliVar = d48Var.i;
                        this.k = gnuVar;
                        this.l = strA4;
                        this.j = true;
                        objR = aliVar.r(true, this);
                        if (objR == wneVar19) {
                            return wneVar19;
                        }
                        str = strA4;
                    }
                    return Unit.f46060a;
                }
                if (!z19) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.l;
                gnu gnuVar2 = (gnu) this.k;
                z1x.P(obj);
                gnuVar = gnuVar2;
                objR = obj;
                gnuVar.b(str, (List) objR);
                d48Var.C.f(new p38(d48Var.E));
                do {
                    value2 = p7m0Var.getValue();
                } while (!p7m0Var.m(value2, v38.a((v38) value2, null, null, false, false, null, 251)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.e);
                    qt6 qt6Var14 = new qt6((c48) obj3, (byte) 18);
                    this.j = true;
                    if (bq9VarB14.c(qt6Var14, this) == wneVar20) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var15 = new qt6((c48) obj3, b4);
                    this.j = true;
                    if (bq9VarB15.c(qt6Var15, this) == wneVar21) {
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
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var16 = new qt6((o47) obj3, (byte) 20);
                    this.j = true;
                    if (bq9VarB16.c(qt6Var16, this) == wneVar22) {
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
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var17 = new qt6((o47) obj3, (byte) 21);
                    this.j = true;
                    if (bq9VarB17.c(qt6Var17, this) == wneVar23) {
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
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var18 = new qt6((o47) obj3, (byte) 22);
                    this.j = true;
                    if (bq9VarB18.c(qt6Var18, this) == wneVar24) {
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
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var19 = new qt6((o47) obj3, (byte) 23);
                    this.j = true;
                    if (bq9VarB19.c(qt6Var19, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var20 = new qt6((yp6) obj3, (byte) 24);
                    this.j = true;
                    if (bq9VarB20.c(qt6Var20, this) == wneVar26) {
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
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var21 = new qt6((o47) obj3, (byte) 25);
                    this.j = true;
                    if (bq9VarB21.c(qt6Var21, this) == wneVar27) {
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
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var22 = new qt6((o47) obj3, (byte) 26);
                    this.j = true;
                    if (bq9VarB22.c(qt6Var22, this) == wneVar28) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var23 = new qt6((o47) obj3, (byte) 28);
                    this.j = true;
                    if (bq9VarB23.c(qt6Var23, this) == wneVar29) {
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
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    qt6 qt6Var24 = new qt6((o47) obj3, (byte) 29);
                    this.j = true;
                    if (bq9VarB24.c(qt6Var24, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(d48 d48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        this.m = d48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(f97 f97Var, String str, a5w a5wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = f97Var;
        this.l = str;
        this.m = a5wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c, byte b) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, yp6 yp6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, i28 i28Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i28Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, f38 f38Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = f38Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(dnq dnqVar, clz clzVar, i28 i28Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = i28Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(dnq dnqVar, clz clzVar, f38 f38Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = f38Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u47(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
