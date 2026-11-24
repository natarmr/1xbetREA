package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zol0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
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
                return new zol0(i89Var, clzVar, (nfj0) obj2, yjeVar);
            case 1:
                i89 i89Var2 = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new zol0(i89Var2, clzVar2, (nfj0) obj2, yjeVar, (byte) 0);
            case 2:
                return new zol0(this.k, this.l, obj2, yjeVar, (byte) 2);
            case 3:
                return new zol0(this.k, this.l, obj2, yjeVar, (byte) 3);
            case 4:
                utb utbVar = (utb) this.k;
                ysl0 ysl0Var = (ysl0) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new zol0(utbVar, ysl0Var, (bdl0) obj2, yjeVar);
            case 5:
                gmq gmqVar = (gmq) this.k;
                mtl0 mtl0Var = (mtl0) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new zol0(gmqVar, mtl0Var, (bdl0) obj2, yjeVar);
            case 6:
                i89 i89Var3 = (i89) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new zol0(i89Var3, clzVar3, (ssl0) obj2, yjeVar);
            case 7:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new zol0(gmqVar2, clzVar4, (ssl0) obj2, yjeVar);
            case 8:
                i89 i89Var4 = (i89) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new zol0(i89Var4, clzVar5, (ssl0) obj2, yjeVar, (byte) 0);
            case 9:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new zol0(gmqVar3, clzVar6, (ssl0) obj2, yjeVar, (byte) 0);
            case 10:
                return new zol0(this.k, this.l, obj2, yjeVar, (byte) 10);
            case 11:
                return new zol0(this.k, this.l, obj2, yjeVar, (byte) 11);
            case 12:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new zol0(gmqVar4, clzVar7, (ah0) obj2, yjeVar);
            case 13:
                dnq dnqVar = (dnq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new zol0(dnqVar, clzVar8, (ah0) obj2, yjeVar);
            case 14:
                i89 i89Var5 = (i89) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new zol0(i89Var5, clzVar9, (nfj0) obj2, yjeVar, (char) 0);
            case 15:
                zol0 zol0Var = new zol0((rcm0) this.l, (Collection) obj2, yjeVar);
                zol0Var.k = obj;
                return zol0Var;
            case 16:
                return new zol0((aqm0) obj2, yjeVar);
            case 17:
                fnq fnqVar = (fnq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new zol0(fnqVar, clzVar10, (gqm0) obj2, yjeVar);
            case 18:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new zol0(gmqVar5, clzVar11, (gqm0) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new zol0(gmqVar6, clzVar12, (gvm0) obj2, yjeVar);
            case 20:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new zol0(gmqVar7, clzVar13, (gvm0) obj2, yjeVar, (byte) 0);
            case 21:
                i89 i89Var6 = (i89) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new zol0(i89Var6, clzVar14, (nfj0) obj2, yjeVar, 0);
            case 22:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new zol0(gmqVar8, clzVar15, (dym0) obj2, yjeVar, (byte) 0);
            case 23:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new zol0(gmqVar9, clzVar16, (dym0) obj2, yjeVar);
            case 24:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new zol0(gmqVar10, clzVar17, (dym0) obj2, yjeVar, (char) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var7 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new zol0(i89Var7, clzVar18, (nfj0) obj2, yjeVar, (short) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i89 i89Var8 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new zol0(i89Var8, clzVar19, (nfj0) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new zol0(i89Var9, clzVar20, (nfj0) obj2, yjeVar, (byte) 0, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var10 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new zol0(i89Var10, clzVar21, (nfj0) obj2, yjeVar, (byte) 0, (char) 0);
            default:
                i89 i89Var11 = (i89) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new zol0(i89Var11, clzVar22, (nfj0) obj2, yjeVar, (byte) 0, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((zol0) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zol0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        aqm0 aqm0Var;
        k050 k050Var;
        byte b = this.i;
        byte b2 = 3;
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
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    i6k0 i6k0Var = new i6k0((nfj0) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB.c(i6k0Var, this) == wneVar) {
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
                    i6k0 i6k0Var2 = new i6k0((nfj0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB2.c(i6k0Var2, this) == wneVar2) {
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
                    if (((nsl0) this.k).b) {
                        xcz xczVar = (xcz) this.l;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.f(0, 0, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ((Function1) ((pz40) obj2).getValue()).invoke(nrl0.f24007a);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    ekf0 ekf0Var = (ekf0) this.k;
                    Long l = new Long(((msl0) this.l).f22327a);
                    long j = ((l2l0) ((m2l0) obj2)).f19315a;
                    this.j = true;
                    if (ekf0Var.h(l, j, this) == wneVar4) {
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
                    bq9 bq9VarB3 = hkb.B((utb) this.k, ((ysl0) this.l).u1, lkz.c);
                    i6k0 i6k0Var3 = new i6k0((bdl0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB3.c(i6k0Var3, this) == wneVar5) {
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
                    bq9 bq9VarB4 = hkb.B((gmq) this.k, ((mtl0) this.l).u1, lkz.d);
                    i6k0 i6k0Var4 = new i6k0((bdl0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB4.c(i6k0Var4, this) == wneVar6) {
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
                    bq9 bq9VarB5 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.c);
                    i6k0 i6k0Var5 = new i6k0((ssl0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB5.c(i6k0Var5, this) == wneVar7) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.c);
                    i6k0 i6k0Var6 = new i6k0((ssl0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB6.c(i6k0Var6, this) == wneVar8) {
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
                    i6k0 i6k0Var7 = new i6k0((ssl0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB7.c(i6k0Var7, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.c);
                    r0m0 r0m0Var = new r0m0((ssl0) obj2, b4);
                    this.j = true;
                    if (bq9VarB8.c(r0m0Var, this) == wneVar10) {
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
                    t33 t33Var = (t33) this.k;
                    Float f = new Float(((p5m0) this.l).f26411a);
                    uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, (zsf) obj2, 2);
                    this.j = true;
                    if (t33.a(t33Var, f, uts0VarM0, null, null, this, 12) == wneVar11) {
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
                    t33 t33Var2 = (t33) this.k;
                    Float f2 = new Float(((q5m0) this.l).c);
                    uts0 uts0VarM1 = ro4.m0(Response.BUSY_EVERYWHERE, 0, (zsf) obj2, 2);
                    this.j = true;
                    if (t33.a(t33Var2, f2, uts0VarM1, null, null, this, 12) == wneVar12) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var2 = new r0m0((ah0) obj2, b5);
                    this.j = true;
                    if (bq9VarB9.c(r0m0Var2, this) == wneVar13) {
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
                    bq9 bq9VarB10 = hkb.B((dnq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var3 = new r0m0((ah0) obj2, b3);
                    this.j = true;
                    if (bq9VarB10.c(r0m0Var3, this) == wneVar14) {
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
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var4 = new r0m0((nfj0) obj2, b2);
                    this.j = true;
                    if (bq9VarB11.c(r0m0Var4, this) == wneVar15) {
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
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((rcm0) this.l).b.k0(qpg0Var, (Collection) obj2) == wneVar16) {
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
                    aqm0 aqm0Var2 = (aqm0) obj2;
                    k050 k050Var2 = aqm0Var2.c;
                    this.k = k050Var2;
                    this.l = aqm0Var2;
                    this.j = true;
                    if (k050Var2.d(this) == wneVar17) {
                        return wneVar17;
                    }
                    aqm0Var = aqm0Var2;
                    k050Var = k050Var2;
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aqm0Var = (aqm0) this.l;
                    k050Var = (k050) this.k;
                    z1x.P(obj);
                }
                while (!aqm0Var.e.isEmpty()) {
                    try {
                        xpm0 xpm0Var = (xpm0) aqm0Var.e.poll();
                        if (xpm0Var != null) {
                            xpm0Var.d.b0(new ozw(3, "Capture request is cancelled due to a reset", null));
                        }
                    } finally {
                        k050Var.c(null);
                    }
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((fnq) this.k, ((clz) this.l).x(), lkz.e);
                    r0m0 r0m0Var5 = new r0m0((gqm0) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB12.c(r0m0Var5, this) == wneVar18) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var6 = new r0m0((gqm0) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB13.c(r0m0Var6, this) == wneVar19) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var7 = new r0m0((gvm0) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB14.c(r0m0Var7, this) == wneVar20) {
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
                    r0m0 r0m0Var8 = new r0m0((gvm0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB15.c(r0m0Var8, this) == wneVar21) {
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
                    r0m0 r0m0Var9 = new r0m0((nfj0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB16.c(r0m0Var9, this) == wneVar22) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.e);
                    r0m0 r0m0Var10 = new r0m0((dym0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB17.c(r0m0Var10, this) == wneVar23) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var11 = new r0m0((dym0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB18.c(r0m0Var11, this) == wneVar24) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var12 = new r0m0((dym0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB19.c(r0m0Var12, this) == wneVar25) {
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
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    r0m0 r0m0Var13 = new r0m0((nfj0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB20.c(r0m0Var13, this) == wneVar26) {
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
                    r0m0 r0m0Var14 = new r0m0((nfj0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB21.c(r0m0Var14, this) == wneVar27) {
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
                    r0m0 r0m0Var15 = new r0m0((nfj0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB22.c(r0m0Var15, this) == wneVar28) {
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
                    r0m0 r0m0Var16 = new r0m0((nfj0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB23.c(r0m0Var16, this) == wneVar29) {
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
                    r0m0 r0m0Var17 = new r0m0((nfj0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB24.c(r0m0Var17, this) == wneVar30) {
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
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, nfj0 nfj0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = nfj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(i89 i89Var, clz clzVar, ssl0 ssl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(utb utbVar, ysl0 ysl0Var, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = utbVar;
        this.l = ysl0Var;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, ah0 ah0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ah0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, ssl0 ssl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, ssl0 ssl0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ssl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, gqm0 gqm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = gqm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, gvm0 gvm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = gvm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, gvm0 gvm0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = gvm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, dym0 dym0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dym0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, dym0 dym0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dym0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, clz clzVar, dym0 dym0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dym0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(gmq gmqVar, mtl0 mtl0Var, bdl0 bdl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = mtl0Var;
        this.m = bdl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(dnq dnqVar, clz clzVar, ah0 ah0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = ah0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(fnq fnqVar, clz clzVar, gqm0 gqm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = fnqVar;
        this.l = clzVar;
        this.m = gqm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(rcm0 rcm0Var, Collection collection, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        this.l = rcm0Var;
        this.m = collection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol0(aqm0 aqm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        this.m = aqm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zol0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
