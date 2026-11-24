package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class r7i0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 11;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar) {
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
                return new r7i0(i89Var, clzVar, (tye0) obj2, yjeVar);
            case 1:
                i89 i89Var2 = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new r7i0(i89Var2, clzVar2, (tye0) obj2, yjeVar, (byte) 0);
            case 2:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new r7i0(xae0Var, clzVar3, (k9i0) obj2, yjeVar);
            case 3:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new r7i0(xae0Var2, clzVar4, (yng0) obj2, yjeVar);
            case 4:
                gmq gmqVar = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new r7i0(gmqVar, clzVar5, (k9i0) obj2, yjeVar);
            case 5:
                xae0 xae0Var3 = (xae0) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new r7i0(xae0Var3, clzVar6, (r9i0) obj2, yjeVar);
            case 6:
                xae0 xae0Var4 = (xae0) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new r7i0(xae0Var4, clzVar7, (yng0) obj2, yjeVar, (byte) 0);
            case 7:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new r7i0(gmqVar2, clzVar8, (r9i0) obj2, yjeVar);
            case 8:
                dnq dnqVar = (dnq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new r7i0(dnqVar, clzVar9, (qbi0) obj2, yjeVar);
            case 9:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new r7i0(gmqVar3, clzVar10, (qbi0) obj2, yjeVar);
            case 10:
                r7i0 r7i0Var = new r7i0((ldi0) this.l, (Function2) obj2, yjeVar);
                r7i0Var.k = obj;
                return r7i0Var;
            case 11:
                return new r7i0((aei0) this.k, (String) this.l, (Boolean) obj2, yjeVar);
            case 12:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new r7i0(gmqVar4, clzVar11, (wki0) obj2, yjeVar);
            case 13:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new r7i0(gmqVar5, clzVar12, (wki0) obj2, yjeVar, (byte) 0);
            case 14:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new r7i0(gmqVar6, clzVar13, (wki0) obj2, yjeVar, (char) 0);
            case 15:
                i89 i89Var3 = (i89) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new r7i0(i89Var3, clzVar14, (bai0) obj2, yjeVar);
            case 16:
                return new r7i0((imi0) obj2, yjeVar);
            case 17:
                dnq dnqVar2 = (dnq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new r7i0(dnqVar2, clzVar15, (ari0) obj2, yjeVar);
            case 18:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new r7i0(gmqVar7, clzVar16, (ari0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new r7i0(gmqVar8, clzVar17, (yng0) obj2, yjeVar);
            case 20:
                i89 i89Var4 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new r7i0(i89Var4, clzVar18, (due0) obj2, yjeVar);
            case 21:
                i89 i89Var5 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new r7i0(i89Var5, clzVar19, (due0) obj2, yjeVar, (byte) 0);
            case 22:
                fnq fnqVar = (fnq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new r7i0(fnqVar, clzVar20, (qkb0) obj2, yjeVar);
            case 23:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new r7i0(gmqVar9, clzVar21, (bai0) obj2, yjeVar);
            case 24:
                qaf0 qaf0Var = (qaf0) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new r7i0(qaf0Var, clzVar22, (jbh0) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qaf0 qaf0Var2 = (qaf0) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new r7i0(qaf0Var2, clzVar23, (jbh0) obj2, yjeVar, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i89 i89Var6 = (i89) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new r7i0(i89Var6, clzVar24, (due0) obj2, yjeVar, (char) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var7 = (i89) this.k;
                clz clzVar25 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new r7i0(i89Var7, clzVar25, (nfj0) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var8 = (i89) this.k;
                clz clzVar26 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new r7i0(i89Var8, clzVar26, (nfj0) obj2, yjeVar, (byte) 0);
            default:
                i89 i89Var9 = (i89) this.k;
                clz clzVar27 = (clz) this.l;
                lkz lkzVar27 = lkz.f20223a;
                return new r7i0(i89Var9, clzVar27, (nfj0) obj2, yjeVar, (char) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((r7i0) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r7i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        gne0 gne0Var;
        Object objG;
        imi0 imi0Var;
        byte b = this.i;
        Object obj2 = this.m;
        byte b2 = 1;
        String str = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var = new x3i0((tye0) obj2, b2);
                    this.j = true;
                    if (bq9VarB.c(x3i0Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var2 = new x3i0((tye0) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB2.c(x3i0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var3 = new x3i0((k9i0) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB3.c(x3i0Var3, this) == wneVar3) {
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
                    x3i0 x3i0Var4 = new x3i0((yng0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB4.c(x3i0Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var5 = new x3i0((k9i0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB5.c(x3i0Var5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var6 = new x3i0((r9i0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB6.c(x3i0Var6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var7 = new x3i0((yng0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB7.c(x3i0Var7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var8 = new x3i0((r9i0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB8.c(x3i0Var8, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var9 = new x3i0((qbi0) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB9.c(x3i0Var9, this) == wneVar9) {
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
                    bq9 bq9VarB10 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var10 = new x3i0((qbi0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB10.c(x3i0Var10, this) == wneVar10) {
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
                vne vneVar = (vne) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    p7m0 p7m0Var = ((ldi0) this.l).H;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, uci0.a((uci0) value, false, false, false, false, null, false, true, 2047)));
                    this.k = null;
                    this.j = true;
                    if (((Function2) obj2).invoke(vneVar, this) == wneVar11) {
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
                    sd60 sd60Var = ((aei0) this.k).f731a;
                    String str2 = (String) this.l;
                    Boolean bool = (Boolean) obj2;
                    this.j = true;
                    onv onvVar = (onv) sd60Var.e;
                    String strB = sd60Var.b();
                    if (bool != null) {
                        str = bool.booleanValue() ? "Organic" : "NonOrganic";
                    }
                    ((us3) sd60Var.f).getClass();
                    Object objA = ((zme0) ((rta0) onvVar.f25567a).invoke()).a(new oix(str2, strB, str), this);
                    if (objA != wneVar12) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar12) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var11 = new x3i0((wki0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB11.c(x3i0Var11, this) == wneVar13) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var12 = new x3i0((wki0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB12.c(x3i0Var12, this) == wneVar14) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var13 = new x3i0((wki0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB13.c(x3i0Var13, this) == wneVar15) {
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
                    bq9 bq9VarB14 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var14 = new x3i0((bai0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB14.c(x3i0Var14, this) == wneVar16) {
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
                imi0 imi0Var2 = (imi0) obj2;
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    gne0Var = nki0.b;
                    yfu yfuVar = imi0Var2.d;
                    LimitTypeEnum limitTypeEnum = LimitTypeEnum.SESSION_TIME_LIMIT;
                    this.k = imi0Var2;
                    this.l = gne0Var;
                    this.j = true;
                    objG = yfuVar.g(limitTypeEnum, this);
                    if (objG == wneVar17) {
                        return wneVar17;
                    }
                    imi0Var = imi0Var2;
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gne0 gne0Var2 = (gne0) this.l;
                    imi0 imi0Var3 = (imi0) this.k;
                    z1x.P(obj);
                    gne0Var = gne0Var2;
                    imi0Var = imi0Var3;
                    objG = obj;
                }
                int i = (int) ((kzz) objG).g;
                gne0Var.getClass();
                imi0Var.g = gne0.d(i);
                imi0Var2.w();
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var15 = new x3i0((ari0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB15.c(x3i0Var15, this) == wneVar18) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var16 = new x3i0((ari0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB16.c(x3i0Var16, this) == wneVar19) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var17 = new x3i0((yng0) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB17.c(x3i0Var17, this) == wneVar20) {
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
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var18 = new x3i0((due0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB18.c(x3i0Var18, this) == wneVar21) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var19 = new x3i0((due0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB19.c(x3i0Var19, this) == wneVar22) {
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
                    bq9 bq9VarB20 = hkb.B((fnq) this.k, ((clz) this.l).x(), lkz.e);
                    x3i0 x3i0Var20 = new x3i0((qkb0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB20.c(x3i0Var20, this) == wneVar23) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var21 = new x3i0((bai0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB21.c(x3i0Var21, this) == wneVar24) {
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
                    bq9 bq9VarB22 = hkb.B((qaf0) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var22 = new x3i0((jbh0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB22.c(x3i0Var22, this) == wneVar25) {
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
                    bq9 bq9VarB23 = hkb.B((qaf0) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var23 = new x3i0((jbh0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB23.c(x3i0Var23, this) == wneVar26) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var24 = new x3i0((due0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB24.c(x3i0Var24, this) == wneVar27) {
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
                    bq9 bq9VarB25 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var25 = new x3i0((nfj0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB25.c(x3i0Var25, this) == wneVar28) {
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
                    bq9 bq9VarB26 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var26 = new x3i0((nfj0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB26.c(x3i0Var26, this) == wneVar29) {
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
                    bq9 bq9VarB27 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    x3i0 x3i0Var27 = new x3i0((nfj0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB27.c(x3i0Var27, this) == wneVar30) {
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
    public r7i0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, tye0 tye0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, tye0 tye0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, bai0 bai0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = bai0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, yng0 yng0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yng0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, k9i0 k9i0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k9i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, r9i0 r9i0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r9i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, bai0 bai0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = bai0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, qbi0 qbi0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = qbi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, wki0 wki0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wki0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, wki0 wki0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wki0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, wki0 wki0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = wki0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(gmq gmqVar, clz clzVar, ari0 ari0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ari0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(dnq dnqVar, clz clzVar, qbi0 qbi0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = qbi0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(dnq dnqVar, clz clzVar, ari0 ari0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = ari0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(fnq fnqVar, clz clzVar, qkb0 qkb0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = fnqVar;
        this.l = clzVar;
        this.m = qkb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(xae0 xae0Var, clz clzVar, yng0 yng0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yng0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(xae0 xae0Var, clz clzVar, yng0 yng0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yng0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(xae0 xae0Var, clz clzVar, k9i0 k9i0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = k9i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(xae0 xae0Var, clz clzVar, r9i0 r9i0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = r9i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(qaf0 qaf0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = qaf0Var;
        this.l = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(qaf0 qaf0Var, clz clzVar, jbh0 jbh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = qaf0Var;
        this.l = clzVar;
        this.m = jbh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(ldi0 ldi0Var, Function2 function2, yje yjeVar) {
        super(2, yjeVar);
        this.l = ldi0Var;
        this.m = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(aei0 aei0Var, String str, Boolean bool, yje yjeVar) {
        super(2, yjeVar);
        this.k = aei0Var;
        this.l = str;
        this.m = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7i0(imi0 imi0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = imi0Var;
    }
}
