package a;

import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;

/* JADX INFO: loaded from: classes3.dex */
public final class l19 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(c00 c00Var, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = c00Var;
        this.l = clzVar;
        this.m = c48Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar);
            case 1:
                return new l19(this.k, obj3, obj2, yjeVar, (byte) 1);
            case 2:
                return new l19(this.k, obj3, obj2, yjeVar, (byte) 2);
            case 3:
                lkz lkzVar2 = lkz.f20223a;
                return new l19((i89) this.k, (r59) obj3, (yp6) obj2, yjeVar);
            case 4:
                lkz lkzVar3 = lkz.f20223a;
                return new l19((i89) this.k, (j79) obj3, (yp6) obj2, yjeVar);
            case 5:
                lkz lkzVar4 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (c48) obj2, yjeVar);
            case 6:
                lkz lkzVar5 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar);
            case 7:
                return new l19(this.j, (pz40) this.k, (pz40) obj3, (c8m0) obj2, yjeVar, (byte) 7);
            case 8:
                return new l19(this.j, (pz40) this.k, (pz40) obj3, (c8m0) obj2, yjeVar, (byte) 8);
            case 9:
                return new l19((GameZoneWebView) this.k, this.j, (y3w0) obj3, (pz40) obj2, yjeVar);
            case 10:
                lkz lkzVar6 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar7 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (char) 0);
            case 12:
                lkz lkzVar8 = lkz.f20223a;
                return new l19((c00) this.k, (clz) obj3, (c48) obj2, yjeVar);
            case 13:
                lkz lkzVar9 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar10 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, 0);
            case 15:
                return new l19(this.k, obj3, obj2, yjeVar, (byte) 15);
            case 16:
                lkz lkzVar11 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar);
            case 17:
                lkz lkzVar12 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, (byte) 0);
            case 18:
                lkz lkzVar13 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, (char) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar14 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, 0);
            case 20:
                lkz lkzVar15 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, (short) 0);
            case 21:
                lkz lkzVar16 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, (byte) 0, false);
            case 22:
                lkz lkzVar17 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (nz9) obj2, yjeVar, (byte) 0, (byte) 0);
            case 23:
                return new l19(this.k, obj3, obj2, yjeVar, (byte) 23);
            case 24:
                l19 l19Var = new l19((dby) obj3, (o3s) obj2, yjeVar);
                l19Var.k = obj;
                return l19Var;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new l19(this.k, obj3, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar18 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (short) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar19 = lkz.f20223a;
                return new l19((i89) this.k, (clz) obj3, (o47) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar20 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, (char) 0);
            default:
                lkz lkzVar21 = lkz.f20223a;
                return new l19((gmq) this.k, (clz) obj3, (c48) obj2, yjeVar, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((l19) create((yyj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l19) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v30, types: [a.tw2, android.hardware.camera2.CameraDevice$StateCallback] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v41, types: [android.hardware.camera2.CameraDevice] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r2v95, types: [a.c5k] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objP;
        o49 o49Var;
        byte b = this.i;
        byte b2 = 6;
        byte b3 = 16;
        byte b4 = 17;
        byte b5 = 2;
        byte b6 = 25;
        byte b7 = 1;
        Object obj2 = this.m;
        Object obj3 = this.l;
        ?? r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var = new k19((o47) obj2, b7);
                    this.j = true;
                    if (bq9VarB.c(k19Var, this) == wneVar) {
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
                g39 g39Var = (g39) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nee neeVar = g39Var.o;
                    f39 f39Var = new f39(g39Var, (s460) obj3, (gj4) obj2);
                    this.j = true;
                    neeVar.getClass();
                    jge0 jge0Var = (jge0) f39Var.invoke();
                    if (jge0Var == null || nee.b1(neeVar, jge0Var, 0L, 0L, 3)) {
                        objP = Unit.f46060a;
                    } else {
                        n5a n5aVar = new n5a(1, pnx.b(this));
                        n5aVar.r();
                        lee leeVar = new lee(f39Var, n5aVar);
                        h03 h03Var = neeVar.t;
                        xz40 xz40Var = (xz40) h03Var.b;
                        jge0 jge0Var2 = (jge0) f39Var.invoke();
                        if (jge0Var2 == null) {
                            e0g0 e0g0Var = j0g0.b;
                            n5aVar.resumeWith(Unit.f46060a);
                        } else {
                            n5aVar.t(new op7(h03Var, leeVar, b3));
                            IntRange intRangeO = l1e0.o(0, xz40Var.c);
                            int i = intRangeO.f46068a;
                            int i2 = intRangeO.b;
                            if (i <= i2) {
                                while (true) {
                                    jge0 jge0Var3 = (jge0) ((lee) xz40Var.f41739a[i2]).f19897a.invoke();
                                    if (jge0Var3 != null) {
                                        jge0 jge0VarI = jge0Var2.i(jge0Var3);
                                        if (jge0VarI.equals(jge0Var2)) {
                                            xz40Var.a(i2 + 1, leeVar);
                                        } else if (!jge0VarI.equals(jge0Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i3 = xz40Var.c - 1;
                                            if (i3 <= i2) {
                                                while (true) {
                                                    ((lee) xz40Var.f41739a[i2]).b.h(cancellationException);
                                                    if (i3 != i2) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != i) {
                                        i2--;
                                    } else {
                                        xz40Var.a(0, leeVar);
                                    }
                                }
                            } else {
                                xz40Var.a(0, leeVar);
                            }
                            if (!neeVar.w) {
                                neeVar.c1(0L);
                            }
                        }
                        objP = n5aVar.p();
                        if (objP != wne.f39444a) {
                            objP = Unit.f46060a;
                        }
                    }
                    if (objP == wneVar2) {
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
                l49 l49Var = (l49) obj3;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xk80 xk80Var = (xk80) this.k;
                    int i4 = ((j49) l49Var).b;
                    this.j = true;
                    if (xk80.g(xk80Var, i4, null, this, 6) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Function1 function1 = (Function1) obj2;
                i49 i49Var = ((j49) l49Var).c;
                if (i49Var != null) {
                    if (i49Var instanceof g49) {
                        o49Var = o49.f24622a;
                    } else if (i49Var instanceof h49) {
                        o49Var = o49.b;
                    }
                    function1.invoke(o49Var);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((r59) obj3).u1, lkz.d);
                    k19 k19Var2 = new k19((yp6) obj2, b5);
                    this.j = true;
                    if (bq9VarB2.c(k19Var2, this) == wneVar4) {
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
                    bq9 bq9VarB3 = hkb.B((i89) this.k, ((j79) obj3).u1, lkz.d);
                    k19 k19Var3 = new k19((yp6) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB3.c(k19Var3, this) == wneVar5) {
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
                    bq9 bq9VarB4 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var4 = new k19((c48) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB4.c(k19Var4, this) == wneVar6) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var5 = new k19((c48) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB5.c(k19Var5, this) == wneVar7) {
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
                pz40 pz40Var = (pz40) obj3;
                pz40 pz40Var2 = (pz40) this.k;
                agk0 agk0Var = (agk0) obj2;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    long j = ((qkx) pz40Var2.getValue()).f28908a;
                    long j2 = ((qkx) pz40Var.getValue()).f28908a;
                    agk0Var.m(qkx.a(j, 0L) ? 1.0f : Math.min(((int) (j2 >> 32)) / ((int) (j >> 32)), ((int) (j2 & 4294967295L)) / ((int) (j & 4294967295L))));
                } else {
                    pz40Var2.setValue(new qkx(aad.T(((qkx) pz40Var.getValue()).f28908a)));
                    agk0Var.m(1.0f);
                }
                return Unit.f46060a;
            case 8:
                cgk0 cgk0Var = (cgk0) obj2;
                pz40 pz40Var3 = (pz40) this.k;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (this.j || !((Boolean) pz40Var3.getValue()).booleanValue()) {
                    return Unit.f46060a;
                }
                pz40Var3.setValue(Boolean.FALSE);
                ((pz40) obj3).setValue(null);
                cgk0Var.m(cgk0Var.l() + 1);
                return Unit.f46060a;
            case 9:
                y3w0 y3w0Var = (y3w0) obj3;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                GameZoneWebView gameZoneWebView = (GameZoneWebView) this.k;
                if (gameZoneWebView == null) {
                    return Unit.f46060a;
                }
                if (this.j) {
                    gameZoneWebView.e();
                    gameZoneWebView.c("");
                } else if (y3w0Var.b) {
                    gameZoneWebView.f();
                    String str = y3w0Var.c;
                    str.getClass();
                    gameZoneWebView.c(str);
                } else {
                    ((pz40) obj2).setValue(Boolean.TRUE);
                    gameZoneWebView.c(y3w0Var.f41973a);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var6 = new k19((o47) obj2, b2);
                    this.j = true;
                    if (bq9VarB6.c(k19Var6, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var7 = new k19((o47) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB7.c(k19Var7, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((c00) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var8 = new k19((c48) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB8.c(k19Var8, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var9 = new k19((c48) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB9.c(k19Var9, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var10 = new k19((o47) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB10.c(k19Var10, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9Var = (bq9) ((mii0) this.k).e;
                    na naVar = new na((String) obj3, (aw9) obj2, b4);
                    this.j = true;
                    if (bq9Var.c(naVar, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var11 = new k19((nz9) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB11.c(k19Var11, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var12 = new k19((nz9) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB12.c(k19Var12, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var13 = new k19((nz9) obj2, b3);
                    this.j = true;
                    if (bq9VarB13.c(k19Var13, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var14 = new k19((nz9) obj2, b4);
                    this.j = true;
                    if (bq9VarB14.c(k19Var14, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var15 = new k19((nz9) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB15.c(k19Var15, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var16 = new k19((nz9) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB16.c(k19Var16, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var17 = new k19((nz9) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB17.c(k19Var17, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                ?? r12 = (tw2) obj2;
                String str2 = (String) obj3;
                wne wneVar24 = wne.f39444a;
                boolean z21 = this.j;
                try {
                    if (z21) {
                        if (z21) {
                            z1x.P(obj);
                        } else {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                        }
                        return r14;
                    }
                    z1x.P(obj);
                    ?? r2 = (c5k) ((rrd) this.k).b;
                    this.j = true;
                    if (r2.r(str2, r12) == wneVar24) {
                        r14 = wneVar24;
                    }
                    break;
                } catch (Exception e) {
                    Log.w("CXCP", "Failed to open " + ((Object) g0a.b(str2)), e);
                    int iK = aad.K(e);
                    if (iK != 0) {
                        r12.b(r14, new sw2(evc.f, new az9(iK), e, 2));
                    }
                    aad.K(e);
                }
                return r14;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    yyj0 yyj0Var = (yyj0) this.k;
                    ((dby) obj3).invokeOnCompletion(new d38(yyj0Var, b6));
                    this.j = true;
                    if (((o3s) obj2).invoke(yyj0Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a4x a4xVar = (a4x) this.k;
                wne wneVar26 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    if (!((Boolean) ((pz40) obj2).getValue()).booleanValue() && !a4xVar.isEmpty()) {
                        int size = a4xVar.size() - 1;
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (((xcz) obj3).l(size, 0, this) == wneVar26) {
                            return wneVar26;
                        }
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var18 = new k19((o47) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB18.c(k19Var18, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var19 = new k19((o47) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB19.c(k19Var19, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var20 = new k19((c48) obj2, b6);
                    this.j = true;
                    if (bq9VarB20.c(k19Var20, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    k19 k19Var21 = new k19((c48) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB21.c(k19Var21, this) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, r59 r59Var, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = r59Var;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, j79 j79Var, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = j79Var;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(i89 i89Var, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, c48 c48Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = c48Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(gmq gmqVar, clz clzVar, nz9 nz9Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nz9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(dby dbyVar, o3s o3sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.l = dbyVar;
        this.m = o3sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l19(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l19(GameZoneWebView gameZoneWebView, boolean z, y3w0 y3w0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.k = gameZoneWebView;
        this.j = z;
        this.l = y3w0Var;
        this.m = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l19(boolean z, pz40 pz40Var, pz40 pz40Var2, c8m0 c8m0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z;
        this.k = pz40Var;
        this.l = pz40Var2;
        this.m = c8m0Var;
    }
}
