package a;

import android.webkit.WebView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(zw0 zw0Var, String str, boolean z, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.k = zw0Var;
        this.l = str;
        this.j = z;
        this.m = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                c00 c00Var = (c00) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new kz(c00Var, clzVar, (pa) obj2, yjeVar);
            case 1:
                return new kz((g00) obj2, yjeVar);
            case 2:
                i89 i89Var = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new kz(i89Var, clzVar2, (oc) obj2, yjeVar);
            case 3:
                gmq gmqVar = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new kz(gmqVar, clzVar3, (i8) obj2, yjeVar);
            case 4:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new kz(gmqVar2, clzVar4, (i8) obj2, yjeVar, (byte) 0);
            case 5:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new kz(gmqVar3, clzVar5, (k80) obj2, yjeVar);
            case 6:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new kz(gmqVar4, clzVar6, (k80) obj2, yjeVar, (byte) 0);
            case 7:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new kz(gmqVar5, clzVar7, (k80) obj2, yjeVar, (char) 0);
            case 8:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new kz(gmqVar6, clzVar8, (k80) obj2, yjeVar, 0);
            case 9:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new kz(gmqVar7, clzVar9, (k80) obj2, yjeVar, (short) 0);
            case 10:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new kz(gmqVar8, clzVar10, (k80) obj2, yjeVar, (byte) 0, false);
            case 11:
                i89 i89Var2 = (i89) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new kz(i89Var2, clzVar11, (oc) obj2, yjeVar, (byte) 0);
            case 12:
                i89 i89Var3 = (i89) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new kz(i89Var3, clzVar12, (oc) obj2, yjeVar, (char) 0);
            case 13:
                i89 i89Var4 = (i89) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new kz(i89Var4, clzVar13, (oc) obj2, yjeVar, 0);
            case 14:
                i89 i89Var5 = (i89) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new kz(i89Var5, clzVar14, (oc) obj2, yjeVar, (short) 0);
            case 15:
                i89 i89Var6 = (i89) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new kz(i89Var6, clzVar15, (oc) obj2, yjeVar, (byte) 0, false);
            case 16:
                i89 i89Var7 = (i89) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new kz(i89Var7, clzVar16, (oc) obj2, yjeVar, (byte) 0, (byte) 0);
            case 17:
                i89 i89Var8 = (i89) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new kz(i89Var8, clzVar17, (oc) obj2, yjeVar, (byte) 0, (char) 0);
            case 18:
                return new kz((zw0) this.k, (String) this.l, this.j, (String) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i89 i89Var9 = (i89) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new kz(i89Var9, clzVar18, (oc) obj2, yjeVar, (byte) 0, 0);
            case 20:
                i89 i89Var10 = (i89) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new kz(i89Var10, clzVar19, (oc) obj2, yjeVar, (byte) 0, (short) 0);
            case 21:
                return new kz((s11) this.k, (xcz) this.l, (Function1) obj2, yjeVar);
            case 22:
                utb utbVar = (utb) this.k;
                q21 q21Var = (q21) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new kz(utbVar, q21Var, (i8) obj2, yjeVar);
            case 23:
                kz kzVar = new kz((nr) this.l, (oc0) obj2, yjeVar);
                kzVar.k = obj;
                return kzVar;
            case 24:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new kz(gmqVar9, clzVar20, (pa) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gmq gmqVar10 = (gmq) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar22 = lkz.f20223a;
                return new kz(gmqVar10, clzVar21, (r51) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                vae0 vae0Var = (vae0) this.k;
                clz clzVar22 = (clz) this.l;
                lkz lkzVar23 = lkz.f20223a;
                return new kz(vae0Var, clzVar22, (r51) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gmq gmqVar11 = (gmq) this.k;
                clz clzVar23 = (clz) this.l;
                lkz lkzVar24 = lkz.f20223a;
                return new kz(gmqVar11, clzVar23, (r51) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gmq gmqVar12 = (gmq) this.k;
                clz clzVar24 = (clz) this.l;
                lkz lkzVar25 = lkz.f20223a;
                return new kz(gmqVar12, clzVar24, (r51) obj2, yjeVar, (char) 0);
            default:
                gmq gmqVar13 = (gmq) this.k;
                clz clzVar25 = (clz) this.l;
                lkz lkzVar26 = lkz.f20223a;
                return new kz(gmqVar13, clzVar25, (r51) obj2, yjeVar, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((kz) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        gnu gnuVar;
        String strA;
        Object objY;
        Integer num;
        Object objA;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 5;
        byte b4 = 10;
        Object obj2 = this.m;
        byte b5 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((c00) this.k, ((clz) this.l).x(), lkz.d);
                    h8 h8Var = new h8((pa) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB.c(h8Var, this) == wneVar) {
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
                g00 g00Var = (g00) obj2;
                vzg0 vzg0Var = g00Var.b;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gnuVar = g00Var.k;
                    strA = g00Var.r.a();
                    pmi pmiVar = g00Var.w;
                    this.k = gnuVar;
                    this.l = strA;
                    this.j = true;
                    objY = pmiVar.y(this);
                    if (objY == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strA = (String) this.l;
                    gnuVar = (gnu) this.k;
                    z1x.P(obj);
                    objY = obj;
                }
                gnuVar.b(strA, (List) objY);
                boolean z3 = g00Var.g.a().N.c;
                ol60 ol60Var = g00Var.z;
                if (z3) {
                    Integer num2 = (Integer) vzg0Var.a("SAVED_SELECTED_COUNTY_CODE");
                    ol60Var.f(new sz(num2 != null ? num2.intValue() : 0));
                } else {
                    Integer num3 = (Integer) vzg0Var.a("SAVED_SELECTED_COUNTY_CODE");
                    ol60Var.f(new wz(num3 != null ? num3.intValue() : 0));
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    h8 h8Var2 = new h8((oc) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB2.c(h8Var2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    h8 h8Var3 = new h8((i8) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB3.c(h8Var3, this) == wneVar4) {
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
                    h8 h8Var4 = new h8((i8) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB4.c(h8Var4, this) == wneVar5) {
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
                    h8 h8Var5 = new h8((k80) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB5.c(h8Var5, this) == wneVar6) {
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
                    h8 h8Var6 = new h8((k80) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB6.c(h8Var6, this) == wneVar7) {
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
                    l80 l80Var = new l80((k80) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB7.c(l80Var, this) == wneVar8) {
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
                    l80 l80Var2 = new l80((k80) obj2, b5);
                    this.j = true;
                    if (bq9VarB8.c(l80Var2, this) == wneVar9) {
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
                    l80 l80Var3 = new l80((k80) obj2, b2);
                    this.j = true;
                    if (bq9VarB9.c(l80Var3, this) == wneVar10) {
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
                    l80 l80Var4 = new l80((k80) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB10.c(l80Var4, this) == wneVar11) {
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
                wne wneVar12 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var5 = new l80((oc) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB11.c(l80Var5, this) == wneVar12) {
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
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var6 = new l80((oc) obj2, b3);
                    this.j = true;
                    if (bq9VarB12.c(l80Var6, this) == wneVar13) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var7 = new l80((oc) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB13.c(l80Var7, this) == wneVar14) {
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
                    bq9 bq9VarB14 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var8 = new l80((oc) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB14.c(l80Var8, this) == wneVar15) {
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
                    bq9 bq9VarB15 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var9 = new l80((oc) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB15.c(l80Var9, this) == wneVar16) {
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
                    bq9 bq9VarB16 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var10 = new l80((oc) obj2, b4);
                    this.j = true;
                    if (bq9VarB16.c(l80Var10, this) == wneVar17) {
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
                    bq9 bq9VarB17 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var11 = new l80((oc) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB17.c(l80Var11, this) == wneVar18) {
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
                z1x.P(obj);
                zw0 zw0Var = (zw0) this.k;
                zw0Var.b();
                String str = (String) this.l;
                WebView webViewC = zw0Var.c(this.j, new vw0(str, new yw0(zw0Var, (byte) 0), new yw0(zw0Var, b5)), new uw0(new t90(1, zw0Var, zw0.class, "updateCurrentFullScreenView", "updateCurrentFullScreenView(Landroid/view/View;)V", 0, (byte) 20), new ec30(zw0Var, str, b3), new yw0(zw0Var, b2)));
                if (webViewC == null) {
                    return null;
                }
                String str2 = (String) obj2;
                ax0 ax0Var = new ax0(webViewC, null);
                zw0Var.d.add(ax0Var);
                Function1 function1 = zw0Var.k;
                if (function1 != null) {
                    function1.invoke(ax0Var);
                }
                webViewC.loadUrl(str2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var12 = new l80((oc) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB18.c(l80Var12, this) == wneVar20) {
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
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var13 = new l80((oc) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB19.c(l80Var13, this) == wneVar21) {
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
                    if (((s11) this.k).c) {
                        xcz xczVar = (xcz) this.l;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.f(0, 0, this) == wneVar22) {
                            return wneVar22;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z22) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ((Function1) obj2).invoke(k01.f17441a);
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((utb) this.k, ((q21) this.l).u1, lkz.c);
                    l80 l80Var14 = new l80((i8) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB20.c(l80Var14, this) == wneVar23) {
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
                nr nrVar = (nr) this.l;
                v1z v1zVar = (v1z) this.k;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    chf0 chf0Var = (chf0) nrVar.b;
                    String strA2 = ((btt0) nrVar.d).a();
                    String strA3 = ((knf0) nrVar.c).a();
                    oc0 oc0Var = (oc0) obj2;
                    long j = oc0Var.f25004a;
                    long j2 = oc0Var.b;
                    int i = oc0Var.c;
                    Long l = v1zVar.f36657a;
                    int i2 = oc0Var.e;
                    this.k = null;
                    this.j = true;
                    num = null;
                    objA = ((sa0) ((nc) chf0Var.c).invoke()).a(strA2, strA3, j, j2, i, l, 15, 0, i2, this);
                    if (objA == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                    num = null;
                }
                i31 i31Var = (i31) objA;
                Integer num4 = i31Var.b;
                int iIntValue = num4 != null ? num4.intValue() : 0;
                String str3 = i31Var.c;
                if (str3 == null) {
                    str3 = "";
                }
                Iterable<nd7> iterable = i31Var.f14074a;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                if (iIntValue != 0) {
                    throw new zhi0(str3, iIntValue, num, 12);
                }
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (nd7 nd7Var : iterable) {
                    nd7Var.getClass();
                    Double d = nd7Var.f;
                    double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                    Long l2 = nd7Var.c;
                    Object objValueOf = l2 != null ? String.valueOf(l2.longValue()) : num;
                    String str4 = objValueOf == null ? "" : objValueOf;
                    nwd nwdVar = q4f.f28094a;
                    Long l3 = nd7Var.f23326a;
                    long jLongValue = l3 != null ? l3.longValue() : 0L;
                    Double d2 = nd7Var.d;
                    double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                    i0w i0wVar = dDoubleValue > 0.0d ? i0w.d : i0w.c;
                    Long l4 = nd7Var.l;
                    long jLongValue2 = l4 != null ? l4.longValue() : 0L;
                    String str5 = nd7Var.k;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = nd7Var.n;
                    arrayList.add(new y21(str4, dDoubleValue, jLongValue, dDoubleValue2, i0wVar, jLongValue2, str6, str7 == null ? "" : str7));
                }
                return arrayList;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var15 = new l80((pa) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB21.c(l80Var15, this) == wneVar25) {
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
                    bq9 bq9VarB22 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var16 = new l80((r51) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB22.c(l80Var16, this) == wneVar26) {
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
                    bq9 bq9VarB23 = hkb.B((vae0) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var17 = new l80((r51) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB23.c(l80Var17, this) == wneVar27) {
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
                    bq9 bq9VarB24 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var18 = new l80((r51) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB24.c(l80Var18, this) == wneVar28) {
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
                    bq9 bq9VarB25 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var19 = new l80((r51) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB25.c(l80Var19, this) == wneVar29) {
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
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    l80 l80Var20 = new l80((r51) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB26.c(l80Var20, this) == wneVar30) {
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
    public kz(c00 c00Var, clz clzVar, pa paVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = c00Var;
        this.l = clzVar;
        this.m = paVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(g00 g00Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = g00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(nr nrVar, oc0 oc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = nrVar;
        this.m = oc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(s11 s11Var, xcz xczVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.k = s11Var;
        this.l = xczVar;
        this.m = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(i89 i89Var, clz clzVar, oc ocVar, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = ocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(utb utbVar, q21 q21Var, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = utbVar;
        this.l = q21Var;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, i8 i8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, pa paVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = paVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, k80 k80Var, yje yjeVar, short s) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = k80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, r51 r51Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, r51 r51Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, r51 r51Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(gmq gmqVar, clz clzVar, r51 r51Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = r51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(vae0 vae0Var, clz clzVar, r51 r51Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = r51Var;
    }
}
