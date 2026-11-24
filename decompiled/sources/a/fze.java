package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fze extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(i89 i89Var, clz clzVar, mhc mhcVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = mhcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                gmq gmqVar = (gmq) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new fze(gmqVar, clzVar, (dze) obj2, yjeVar);
            case 1:
                xae0 xae0Var = (xae0) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new fze(xae0Var, clzVar2, (dze) obj2, yjeVar);
            case 2:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new fze(gmqVar2, clzVar3, (dze) obj2, yjeVar, (byte) 0);
            case 3:
                xae0 xae0Var2 = (xae0) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new fze(xae0Var2, clzVar4, (dze) obj2, yjeVar, (byte) 0);
            case 4:
                xae0 xae0Var3 = (xae0) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new fze(xae0Var3, clzVar5, (dze) obj2, yjeVar, (char) 0);
            case 5:
                vae0 vae0Var = (vae0) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new fze(vae0Var, clzVar6, (eze) obj2, yjeVar);
            case 6:
                p6d p6dVar = (p6d) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new fze(p6dVar, clzVar7, (dze) obj2, yjeVar);
            case 7:
                xae0 xae0Var4 = (xae0) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new fze(xae0Var4, clzVar8, (dze) obj2, yjeVar, 0);
            case 8:
                return new fze(this.k, obj2, yjeVar, (byte) 8);
            case 9:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new fze(gmqVar3, clzVar9, (maf) obj2, yjeVar);
            case 10:
                dnq dnqVar = (dnq) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new fze(dnqVar, clzVar10, (maf) obj2, yjeVar);
            case 11:
                itb itbVar = (itb) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new fze(itbVar, clzVar11, (fob) obj2, yjeVar);
            case 12:
                return new fze((wff) obj2, yjeVar);
            case 13:
                i89 i89Var = (i89) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new fze(i89Var, clzVar12, (mhc) obj2, yjeVar);
            case 14:
                fze fzeVar = new fze(this.k, obj2, yjeVar, (byte) 14);
                fzeVar.l = obj;
                return fzeVar;
            case 15:
                vae0 vae0Var2 = (vae0) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new fze(vae0Var2, clzVar13, (n0g) obj2, yjeVar);
            case 16:
                gmq gmqVar4 = (gmq) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new fze(gmqVar4, clzVar14, (n0g) obj2, yjeVar);
            case 17:
                return new fze((pz40) this.l, (x3m) this.k, (upj0) obj2, yjeVar);
            case 18:
                gmq gmqVar5 = (gmq) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new fze(gmqVar5, clzVar15, (fob) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar6 = (gmq) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new fze(gmqVar6, clzVar16, (ee0) obj2, yjeVar);
            case 20:
                gmq gmqVar7 = (gmq) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new fze(gmqVar7, clzVar17, (m5g) obj2, yjeVar);
            case 21:
                gmq gmqVar8 = (gmq) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new fze(gmqVar8, clzVar18, (m5g) obj2, yjeVar, (byte) 0);
            case 22:
                i89 i89Var2 = (i89) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new fze(i89Var2, clzVar19, (k6g) obj2, yjeVar);
            case 23:
                gmq gmqVar9 = (gmq) this.l;
                clz clzVar20 = (clz) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new fze(gmqVar9, clzVar20, (k6g) obj2, yjeVar);
            case 24:
                gmq gmqVar10 = (gmq) this.l;
                clz clzVar21 = (clz) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new fze(gmqVar10, clzVar21, (e7g) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar11 = (gmq) this.l;
                clz clzVar22 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new fze(gmqVar11, clzVar22, (e7g) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar12 = (gmq) this.l;
                clz clzVar23 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new fze(gmqVar12, clzVar23, (p7g) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar13 = (gmq) this.l;
                clz clzVar24 = (clz) this.k;
                lkz lkzVar24 = lkz.f20223a;
                return new fze(gmqVar13, clzVar24, (p7g) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var3 = (i89) this.l;
                clz clzVar25 = (clz) this.k;
                lkz lkzVar25 = lkz.f20223a;
                return new fze(i89Var3, clzVar25, (w7g) obj2, yjeVar);
            default:
                gmq gmqVar14 = (gmq) this.l;
                clz clzVar26 = (clz) this.k;
                lkz lkzVar26 = lkz.f20223a;
                return new fze(gmqVar14, clzVar26, (w7g) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fze) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fze) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object objD;
        lgf lgfVar;
        byte b = this.i;
        byte b2 = 22;
        byte b3 = 0;
        Object obj2 = this.m;
        byte b4 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar = new qye((dze) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB.c(qyeVar, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar2 = new qye((dze) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB2.c(qyeVar2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar3 = new qye((dze) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB3.c(qyeVar3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar4 = new qye((dze) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB4.c(qyeVar4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.e);
                    qye qyeVar5 = new qye((dze) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB5.c(qyeVar5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((vae0) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar6 = new qye((eze) obj2, b2);
                    this.j = true;
                    if (bq9VarB6.c(qyeVar6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((p6d) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar7 = new qye((dze) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB7.c(qyeVar7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((xae0) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar8 = new qye((dze) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB8.c(qyeVar8, this) == wneVar8) {
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
                    function1 = (Function1) this.k;
                    h9c h9cVar = ((r7f) obj2).f;
                    this.l = function1;
                    this.j = true;
                    objD = h9cVar.f12667a.D(this);
                    if (objD == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function2 = (Function1) this.l;
                    z1x.P(obj);
                    function1 = function2;
                    objD = obj;
                }
                function1.invoke(objD);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar9 = new qye((maf) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB9.c(qyeVar9, this) == wneVar10) {
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
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((dnq) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar10 = new qye((maf) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB10.c(qyeVar10, this) == wneVar11) {
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
                    bq9 bq9VarB11 = hkb.B((itb) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar11 = new qye((fob) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB11.c(qyeVar11, this) == wneVar12) {
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
                wff wffVar = (wff) obj2;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    lgf lgfVar2 = wffVar.c.f45104a.c.f9489a;
                    fq fqVar = wffVar.e;
                    ly5 ly5Var = new ly5(lgfVar2.d, lgfVar2.g, false, lgfVar2.b, lgfVar2.f, lgfVar2.c.f4905a.f3145a, lgfVar2.f20006a);
                    this.l = wffVar;
                    this.k = lgfVar2;
                    this.j = true;
                    if (fqVar.f(ly5Var, this) == wneVar13) {
                        return wneVar13;
                    }
                    lgfVar = lgfVar2;
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lgfVar = (lgf) this.k;
                    wffVar = (wff) this.l;
                    z1x.P(obj);
                }
                wffVar.x(new sff(lgfVar.d));
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar12 = new qye((mhc) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB12.c(qyeVar12, this) == wneVar14) {
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
                qpg0 qpg0Var = (qpg0) this.l;
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    this.l = null;
                    this.j = true;
                    if (((ruf) this.k).b.k0(qpg0Var, (ArrayList) obj2) == wneVar15) {
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
                    bq9 bq9VarB13 = hkb.B((vae0) this.l, ((clz) this.k).x(), lkz.d);
                    qye qyeVar13 = new qye((n0g) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB13.c(qyeVar13, this) == wneVar16) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar = new m0g((n0g) obj2, b3);
                    this.j = true;
                    if (bq9VarB14.c(m0gVar, this) == wneVar17) {
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
                    pz40 pz40Var = (pz40) this.l;
                    v0h0 v0h0Var = e3g.f7133a;
                    if (((y3m) pz40Var.getValue()) == null) {
                        return Unit.f46060a;
                    }
                    gmq gmqVarW = i120.W(new i89(ydx.V(null, new y2g((x3m) this.k, (byte) 0)), (byte) 22));
                    m0g m0gVar2 = new m0g((upj0) obj2, b4);
                    this.j = true;
                    if (gmqVarW.c(m0gVar2, this) == wneVar18) {
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
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.e);
                    m0g m0gVar3 = new m0g((fob) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB15.c(m0gVar3, this) == wneVar19) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar4 = new m0g((ee0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB16.c(m0gVar4, this) == wneVar20) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.e);
                    m0g m0gVar5 = new m0g((m5g) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB17.c(m0gVar5, this) == wneVar21) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.e);
                    m0g m0gVar6 = new m0g((m5g) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB18.c(m0gVar6, this) == wneVar22) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar7 = new m0g((k6g) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB19.c(m0gVar7, this) == wneVar23) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar8 = new m0g((k6g) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB20.c(m0gVar8, this) == wneVar24) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar9 = new m0g((e7g) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB21.c(m0gVar9, this) == wneVar25) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar10 = new m0g((e7g) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB22.c(m0gVar10, this) == wneVar26) {
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
                    bq9 bq9VarB23 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar11 = new m0g((p7g) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB23.c(m0gVar11, this) == wneVar27) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar12 = new m0g((p7g) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB24.c(m0gVar12, this) == wneVar28) {
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
                    bq9 bq9VarB25 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar13 = new m0g((w7g) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB25.c(m0gVar13, this) == wneVar29) {
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
                    bq9 bq9VarB26 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    m0g m0gVar14 = new m0g((w7g) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB26.c(m0gVar14, this) == wneVar30) {
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
    public fze(i89 i89Var, clz clzVar, k6g k6gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = k6gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(i89 i89Var, clz clzVar, w7g w7gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = w7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(itb itbVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.l = itbVar;
        this.k = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(p6d p6dVar, clz clzVar, dze dzeVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = p6dVar;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(wff wffVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        this.m = wffVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, ee0 ee0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = ee0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, fob fobVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = fobVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, dze dzeVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, dze dzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, maf mafVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = mafVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, n0g n0gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = n0gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, m5g m5gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = m5gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, m5g m5gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = m5gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, k6g k6gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = k6gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, e7g e7gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = e7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, e7g e7gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = e7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, p7g p7gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = p7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, p7g p7gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = p7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(gmq gmqVar, clz clzVar, w7g w7gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = w7gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(dnq dnqVar, clz clzVar, maf mafVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = mafVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(pz40 pz40Var, x3m x3mVar, upj0 upj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        this.l = pz40Var;
        this.k = x3mVar;
        this.m = upj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(vae0 vae0Var, clz clzVar, eze ezeVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = vae0Var;
        this.k = clzVar;
        this.m = ezeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(vae0 vae0Var, clz clzVar, n0g n0gVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = vae0Var;
        this.k = clzVar;
        this.m = n0gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(xae0 xae0Var, clz clzVar, dze dzeVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = dzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
    }
}
