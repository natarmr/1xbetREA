package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w7f0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 18;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new w7f0(i89Var, clzVar, (due0) obj2, yjeVar);
            case 1:
                i89 i89Var2 = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new w7f0(i89Var2, clzVar2, (due0) obj2, yjeVar, (byte) 0);
            case 2:
                w7f0 w7f0Var = new w7f0((vff0) this.l, (rhi0) obj2, this.j, yjeVar);
                w7f0Var.k = obj;
                return w7f0Var;
            case 3:
                i89 i89Var3 = (i89) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new w7f0(i89Var3, clzVar3, (due0) obj2, yjeVar, (char) 0);
            case 4:
                gmq gmqVar = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new w7f0(gmqVar, clzVar4, (uif0) obj2, yjeVar);
            case 5:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new w7f0(gmqVar2, clzVar5, (uif0) obj2, yjeVar, (byte) 0);
            case 6:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new w7f0(gmqVar3, clzVar6, (sof0) obj2, yjeVar);
            case 7:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new w7f0(gmqVar4, clzVar7, (tof0) obj2, yjeVar);
            case 8:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new w7f0(gmqVar5, clzVar8, (sof0) obj2, yjeVar, (byte) 0);
            case 9:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new w7f0(gmqVar6, clzVar9, (sof0) obj2, yjeVar, (char) 0);
            case 10:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new w7f0(gmqVar7, clzVar10, (tof0) obj2, yjeVar, (byte) 0);
            case 11:
                return new w7f0((psf0) obj2, yjeVar);
            case 12:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new w7f0(gmqVar8, clzVar11, (jjc0) obj2, yjeVar);
            case 13:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new w7f0(gmqVar9, clzVar12, (jjc0) obj2, yjeVar, (byte) 0);
            case 14:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new w7f0(gmqVar10, clzVar13, (jjc0) obj2, yjeVar, (char) 0);
            case 15:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new w7f0(gmqVar11, clzVar14, (jjc0) obj2, yjeVar, 0);
            case 16:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new w7f0(gmqVar12, clzVar15, (tye0) obj2, yjeVar);
            case 17:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new w7f0(gmqVar13, clzVar16, (exf0) obj2, yjeVar);
            case 18:
                gmq gmqVar14 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new w7f0(gmqVar14, clzVar17, (coc0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar15 = (gmq) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new w7f0(gmqVar15, clzVar18, (exf0) obj2, yjeVar, (byte) 0);
            case 20:
                gmq gmqVar16 = (gmq) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new w7f0(gmqVar16, clzVar19, (xxf0) obj2, yjeVar);
            case 21:
                gmq gmqVar17 = (gmq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new w7f0(gmqVar17, clzVar20, (coc0) obj2, yjeVar, (byte) 0);
            case 22:
                gmq gmqVar18 = (gmq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new w7f0(gmqVar18, clzVar21, (xxf0) obj2, yjeVar, (byte) 0);
            case 23:
                gmq gmqVar19 = (gmq) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new w7f0(gmqVar19, clzVar22, (xxf0) obj2, yjeVar, (char) 0);
            case 24:
                i89 i89Var4 = (i89) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new w7f0(i89Var4, clzVar23, (due0) obj2, yjeVar, 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var5 = (i89) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new w7f0(i89Var5, clzVar24, (due0) obj2, yjeVar, (short) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gmq gmqVar20 = (gmq) this.k;
                clz clzVar25 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new w7f0(gmqVar20, clzVar25, (jjc0) obj2, yjeVar, (short) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var6 = (i89) this.k;
                clz clzVar26 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new w7f0(i89Var6, clzVar26, (due0) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar21 = (gmq) this.k;
                clz clzVar27 = (clz) this.l;
                lkz lkzVar27 = lkz.f20223a;
                return new w7f0(gmqVar21, clzVar27, (zlg0) obj2, yjeVar);
            default:
                gmq gmqVar22 = (gmq) this.k;
                clz clzVar28 = (clz) this.l;
                lkz lkzVar28 = lkz.f20223a;
                return new w7f0(gmqVar22, clzVar28, (zlg0) obj2, yjeVar, (byte) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((w7f0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        Function2 function2;
        Boolean bool;
        boolean z = false;
        z = false;
        z = false;
        byte b = 6;
        byte b2 = 1;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var = new npe0((due0) this.m, (byte) 6);
                    this.j = true;
                    if (bq9VarB.c(npe0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var2 = new npe0((due0) this.m, (byte) 7);
                    this.j = true;
                    if (bq9VarB2.c(npe0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                List list = ((vff0) this.l).o;
                if (list != null) {
                    return list;
                }
                vff0 vff0Var = (vff0) this.l;
                rhi0 rhi0Var = (rhi0) this.m;
                boolean z4 = this.j;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    yff0 yff0VarB = vff0Var.b(rhi0Var);
                    vff0Var.c(yff0VarB, z4);
                    g0g0Var = vff0.i(yff0VarB);
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                Object objI = g0g0Var;
                if (thA != null) {
                    if (!(thA instanceof FileNotFoundException) && !(thA instanceof roe)) {
                        throw thA;
                    }
                    yff0 yff0VarF = vff0Var.f(rhi0Var, z4);
                    vff0Var.c(yff0VarF, z4);
                    objI = vff0.i(yff0VarF);
                }
                List list2 = (List) objI;
                vff0Var.o = list2;
                return list2;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var3 = new npe0((due0) this.m, (byte) 9);
                    this.j = true;
                    if (bq9VarB3.c(npe0Var3, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var4 = new npe0((uif0) this.m, (byte) 10);
                    this.j = true;
                    if (bq9VarB4.c(npe0Var4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var5 = new npe0((uif0) this.m, (byte) 11);
                    this.j = true;
                    if (bq9VarB5.c(npe0Var5, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var6 = new npe0((sof0) this.m, (byte) 13);
                    this.j = true;
                    if (bq9VarB6.c(npe0Var6, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var7 = new npe0((tof0) this.m, (byte) 14);
                    this.j = true;
                    if (bq9VarB7.c(npe0Var7, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var8 = new npe0((sof0) this.m, (byte) 15);
                    this.j = true;
                    if (bq9VarB8.c(npe0Var8, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var9 = new npe0((sof0) this.m, (byte) 16);
                    this.j = true;
                    if (bq9VarB9.c(npe0Var9, this) == wneVar10) {
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
                wne wneVar11 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var10 = new npe0((tof0) this.m, (byte) 17);
                    this.j = true;
                    if (bq9VarB10.c(npe0Var10, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                psf0 psf0Var = (psf0) this.m;
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    Function2 function3 = psf0Var.s;
                    if (function3 != null) {
                        try {
                            sff0 sff0VarA = psf0Var.i.a();
                            if (sff0VarA.N.i && !sff0VarA.G1) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                            psf0Var.j.a();
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        o8f o8fVar = psf0Var.d;
                        this.k = function3;
                        this.l = boolValueOf;
                        this.j = true;
                        Object objB = o8fVar.b(this);
                        if (objB == wneVar12) {
                            return wneVar12;
                        }
                        obj = objB;
                        function2 = function3;
                        bool = boolValueOf;
                    }
                    return Unit.f46060a;
                }
                if (!z13) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bool = (Boolean) this.l;
                function2 = (Function2) this.k;
                z1x.P(obj);
                function2.invoke(bool, obj);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var11 = new npe0((jjc0) this.m, (byte) 19);
                    this.j = true;
                    if (bq9VarB11.c(npe0Var11, this) == wneVar13) {
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
                    npe0 npe0Var12 = new npe0((jjc0) this.m, (byte) 20);
                    this.j = true;
                    if (bq9VarB12.c(npe0Var12, this) == wneVar14) {
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
                    npe0 npe0Var13 = new npe0((jjc0) this.m, (byte) 21);
                    this.j = true;
                    if (bq9VarB13.c(npe0Var13, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var14 = new npe0((jjc0) this.m, (byte) 22);
                    this.j = true;
                    if (bq9VarB14.c(npe0Var14, this) == wneVar16) {
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
                    npe0 npe0Var15 = new npe0((tye0) this.m, (byte) 23);
                    this.j = true;
                    if (bq9VarB15.c(npe0Var15, this) == wneVar17) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var16 = new npe0((exf0) this.m, (byte) 24);
                    this.j = true;
                    if (bq9VarB16.c(npe0Var16, this) == wneVar18) {
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
                wne wneVar19 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var17 = new npe0((coc0) this.m, (byte) 25);
                    this.j = true;
                    if (bq9VarB17.c(npe0Var17, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var18 = new npe0((exf0) this.m, (byte) 26);
                    this.j = true;
                    if (bq9VarB18.c(npe0Var18, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var19 = new npe0((xxf0) this.m, (byte) 27);
                    this.j = true;
                    if (bq9VarB19.c(npe0Var19, this) == wneVar21) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var20 = new npe0((coc0) this.m, (byte) 28);
                    this.j = true;
                    if (bq9VarB20.c(npe0Var20, this) == wneVar22) {
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
                wne wneVar23 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    npe0 npe0Var21 = new npe0((xxf0) this.m, (byte) 29);
                    this.j = true;
                    if (bq9VarB21.c(npe0Var21, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var = new wxf0((xxf0) this.m, z ? (byte) 1 : (byte) 0);
                    this.j = true;
                    if (bq9VarB22.c(wxf0Var, this) == wneVar24) {
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
                wne wneVar25 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var2 = new wxf0((due0) this.m, b2);
                    this.j = true;
                    if (bq9VarB23.c(wxf0Var2, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var3 = new wxf0((due0) this.m, (byte) 2);
                    this.j = true;
                    if (bq9VarB24.c(wxf0Var3, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var4 = new wxf0((jjc0) this.m, (byte) 3);
                    this.j = true;
                    if (bq9VarB25.c(wxf0Var4, this) == wneVar27) {
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
                wne wneVar28 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB26 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var5 = new wxf0((due0) this.m, (byte) 4);
                    this.j = true;
                    if (bq9VarB26.c(wxf0Var5, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB27 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var6 = new wxf0((zlg0) this.m, (byte) 5);
                    this.j = true;
                    if (bq9VarB27.c(wxf0Var6, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    bq9 bq9VarB28 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    wxf0 wxf0Var7 = new wxf0((zlg0) this.m, b);
                    this.j = true;
                    if (bq9VarB28.c(wxf0Var7, this) == wneVar30) {
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
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, coc0 coc0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = coc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, coc0 coc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = coc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, tye0 tye0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, uif0 uif0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = uif0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, uif0 uif0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = uif0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, sof0 sof0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = sof0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, sof0 sof0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = sof0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, sof0 sof0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = sof0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, tof0 tof0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tof0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, tof0 tof0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tof0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, exf0 exf0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = exf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, exf0 exf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = exf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, xxf0 xxf0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xxf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, xxf0 xxf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xxf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, xxf0 xxf0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = xxf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, zlg0 zlg0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = zlg0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(gmq gmqVar, clz clzVar, zlg0 zlg0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = zlg0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(vff0 vff0Var, rhi0 rhi0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.l = vff0Var;
        this.m = rhi0Var;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7f0(psf0 psf0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = psf0Var;
    }
}
