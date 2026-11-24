package a;

import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;
import org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class tg3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 10;
    public boolean j;
    public /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(lr lrVar, clz clzVar, i8 i8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = lrVar;
        this.k = clzVar;
        this.m = i8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                lr lrVar = (lr) this.l;
                clz clzVar = (clz) this.k;
                lkz lkzVar = lkz.f20223a;
                return new tg3(lrVar, clzVar, (i8) obj2, yjeVar);
            case 1:
                zh3 zh3Var = (zh3) this.l;
                clz clzVar2 = (clz) this.k;
                lkz lkzVar2 = lkz.f20223a;
                return new tg3(zh3Var, clzVar2, (sg3) obj2, yjeVar);
            case 2:
                ji3 ji3Var = (ji3) this.l;
                clz clzVar3 = (clz) this.k;
                lkz lkzVar3 = lkz.f20223a;
                return new tg3(ji3Var, clzVar3, (sg3) obj2, yjeVar);
            case 3:
                zh3 zh3Var2 = (zh3) this.l;
                clz clzVar4 = (clz) this.k;
                lkz lkzVar4 = lkz.f20223a;
                return new tg3(zh3Var2, clzVar4, (i8) obj2, yjeVar);
            case 4:
                gmq gmqVar = (gmq) this.l;
                clz clzVar5 = (clz) this.k;
                lkz lkzVar5 = lkz.f20223a;
                return new tg3(gmqVar, clzVar5, (i8) obj2, yjeVar);
            case 5:
                ji3 ji3Var2 = (ji3) this.l;
                clz clzVar6 = (clz) this.k;
                lkz lkzVar6 = lkz.f20223a;
                return new tg3(ji3Var2, clzVar6, (pa) obj2, yjeVar);
            case 6:
                tg3 tg3Var = new tg3((uj3) this.k, (ArrayList) obj2, yjeVar);
                tg3Var.l = obj;
                return tg3Var;
            case 7:
                return new tg3((mii0) this.l, (String) this.k, (String) obj2, yjeVar);
            case 8:
                lr lrVar2 = (lr) this.l;
                AppUpdateDownloadApkService appUpdateDownloadApkService = (AppUpdateDownloadApkService) this.k;
                lkz lkzVar7 = lkz.f20223a;
                return new tg3(lrVar2, appUpdateDownloadApkService, (i8) obj2, yjeVar);
            case 9:
                lr lrVar3 = (lr) this.l;
                clz clzVar7 = (clz) this.k;
                lkz lkzVar8 = lkz.f20223a;
                return new tg3(lrVar3, clzVar7, (i8) obj2, yjeVar, (byte) 0);
            case 10:
                c00 c00Var = (c00) this.l;
                clz clzVar8 = (clz) this.k;
                lkz lkzVar9 = lkz.f20223a;
                return new tg3(c00Var, clzVar8, (cm3) obj2, yjeVar);
            case 11:
                c00 c00Var2 = (c00) this.l;
                clz clzVar9 = (clz) this.k;
                lkz lkzVar10 = lkz.f20223a;
                return new tg3(c00Var2, clzVar9, (i8) obj2, yjeVar);
            case 12:
                ji3 ji3Var3 = (ji3) this.l;
                clz clzVar10 = (clz) this.k;
                lkz lkzVar11 = lkz.f20223a;
                return new tg3(ji3Var3, clzVar10, (pa) obj2, yjeVar, (byte) 0);
            case 13:
                tg3 tg3Var2 = new tg3((on3) obj2, yjeVar);
                tg3Var2.k = obj;
                return tg3Var2;
            case 14:
                c00 c00Var3 = (c00) this.l;
                clz clzVar11 = (clz) this.k;
                lkz lkzVar12 = lkz.f20223a;
                return new tg3(c00Var3, clzVar11, (i8) obj2, yjeVar, (byte) 0);
            case 15:
                lr lrVar4 = (lr) this.l;
                clz clzVar12 = (clz) this.k;
                lkz lkzVar13 = lkz.f20223a;
                return new tg3(lrVar4, clzVar12, (i8) obj2, yjeVar, (char) 0);
            case 16:
                gmq gmqVar2 = (gmq) this.l;
                clz clzVar13 = (clz) this.k;
                lkz lkzVar14 = lkz.f20223a;
                return new tg3(gmqVar2, clzVar13, (vp3) obj2, yjeVar);
            case 17:
                gmq gmqVar3 = (gmq) this.l;
                clz clzVar14 = (clz) this.k;
                lkz lkzVar15 = lkz.f20223a;
                return new tg3(gmqVar3, clzVar14, (vp3) obj2, yjeVar, (byte) 0);
            case 18:
                p7m0 p7m0Var = (p7m0) this.l;
                ApplicationActivity applicationActivity = (ApplicationActivity) this.k;
                lkz lkzVar16 = lkz.f20223a;
                return new tg3(p7m0Var, applicationActivity, (wr3) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                c00 c00Var4 = (c00) this.l;
                ApplicationActivity applicationActivity2 = (ApplicationActivity) this.k;
                lkz lkzVar17 = lkz.f20223a;
                return new tg3(c00Var4, applicationActivity2, (wr3) obj2, yjeVar);
            case 20:
                gmq gmqVar4 = (gmq) this.l;
                ApplicationActivity applicationActivity3 = (ApplicationActivity) this.k;
                lkz lkzVar18 = lkz.f20223a;
                return new tg3(gmqVar4, applicationActivity3, (vp3) obj2, yjeVar);
            case 21:
                gmq gmqVar5 = (gmq) this.l;
                ApplicationActivity applicationActivity4 = (ApplicationActivity) this.k;
                lkz lkzVar19 = lkz.f20223a;
                return new tg3(gmqVar5, applicationActivity4, (vp3) obj2, yjeVar, (byte) 0);
            case 22:
                gmq gmqVar6 = (gmq) this.l;
                ApplicationActivity applicationActivity5 = (ApplicationActivity) this.k;
                lkz lkzVar20 = lkz.f20223a;
                return new tg3(gmqVar6, applicationActivity5, (vp3) obj2, yjeVar, (char) 0);
            case 23:
                gmq gmqVar7 = (gmq) this.l;
                ApplicationActivity applicationActivity6 = (ApplicationActivity) this.k;
                lkz lkzVar21 = lkz.f20223a;
                return new tg3(gmqVar7, applicationActivity6, (vp3) obj2, yjeVar, 0);
            case 24:
                tg3 tg3Var3 = new tg3((gmq) this.k, yjeVar, (f04) obj2);
                tg3Var3.l = obj;
                return tg3Var3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i89 i89Var = (i89) this.l;
                clz clzVar15 = (clz) this.k;
                lkz lkzVar22 = lkz.f20223a;
                return new tg3(i89Var, clzVar15, (df2) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                c00 c00Var5 = (c00) this.l;
                clz clzVar16 = (clz) this.k;
                lkz lkzVar23 = lkz.f20223a;
                return new tg3(c00Var5, clzVar16, (z54) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lr lrVar5 = (lr) this.l;
                clz clzVar17 = (clz) this.k;
                lkz lkzVar24 = lkz.f20223a;
                return new tg3(lrVar5, clzVar17, (z54) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var2 = (i89) this.l;
                clz clzVar18 = (clz) this.k;
                lkz lkzVar25 = lkz.f20223a;
                return new tg3(i89Var2, clzVar18, (df2) obj2, yjeVar, (byte) 0);
            default:
                i89 i89Var3 = (i89) this.l;
                clz clzVar19 = (clz) this.k;
                lkz lkzVar26 = lkz.f20223a;
                return new tg3(i89Var3, clzVar19, (df2) obj2, yjeVar, (char) 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((tg3) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((tg3) create((arq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((tg3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        iy3 iy3VarK0;
        Object objG;
        iy3 iy3Var;
        an3 an3Var;
        Object value;
        byte b = this.i;
        byte b2 = 29;
        byte b3 = 9;
        Object obj2 = this.m;
        byte b4 = 1;
        an3 an3VarM = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((lr) this.l, ((clz) this.k).x(), lkz.c);
                    mn1 mn1Var = new mn1((i8) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB.c(mn1Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((zh3) this.l, ((clz) this.k).x(), lkz.c);
                    mn1 mn1Var2 = new mn1((sg3) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB2.c(mn1Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((ji3) this.l, ((clz) this.k).x(), lkz.c);
                    mn1 mn1Var3 = new mn1((sg3) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB3.c(mn1Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((zh3) this.l, ((clz) this.k).x(), lkz.c);
                    mn1 mn1Var4 = new mn1((i8) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB4.c(mn1Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.c);
                    mn1 mn1Var5 = new mn1((i8) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB5.c(mn1Var5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((ji3) this.l, ((clz) this.k).x(), lkz.d);
                    mn1 mn1Var6 = new mn1((pa) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB6.c(mn1Var6, this) == wneVar6) {
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
                qpg0 qpg0Var = (qpg0) this.l;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    this.l = null;
                    this.j = true;
                    if (((uj3) this.k).b.k0(qpg0Var, (ArrayList) obj2) == wneVar7) {
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
                    mii0 mii0Var = (mii0) this.l;
                    psc pscVar = (psc) mii0Var.c;
                    String str = (String) this.k;
                    long length = ((hk3) mii0Var.e).a((String) obj2).length() - 8192;
                    if (length <= 0) {
                        length = 0;
                    }
                    this.j = true;
                    objB = ((lm3) ((azj0) pscVar.b).b(sre0.f32672a.b(lm3.class), length)).b(str, this);
                    if (objB == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ResponseBody responseBody = (ResponseBody) objB;
                return new yk3(responseBody.a(), responseBody.getC());
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((lr) this.l, (glz) ((AppUpdateDownloadApkService) this.k).f22014a.f5196a, lkz.d);
                    mn1 mn1Var7 = new mn1((i8) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB7.c(mn1Var7, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((lr) this.l, ((clz) this.k).x(), lkz.e);
                    mn1 mn1Var8 = new mn1((i8) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB8.c(mn1Var8, this) == wneVar10) {
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
                    bq9 bq9VarB9 = hkb.B((c00) this.l, ((clz) this.k).x(), lkz.d);
                    mn1 mn1Var9 = new mn1((cm3) obj2, b2);
                    this.j = true;
                    if (bq9VarB9.c(mn1Var9, this) == wneVar11) {
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
                    bq9 bq9VarB10 = hkb.B((c00) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var = new bm3((i8) obj2, (byte) 0);
                    this.j = true;
                    if (bq9VarB10.c(bm3Var, this) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((ji3) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var2 = new bm3((pa) obj2, b4);
                    this.j = true;
                    if (bq9VarB11.c(bm3Var2, this) == wneVar13) {
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
                on3 on3Var = (on3) obj2;
                p7m0 p7m0Var = on3Var.r;
                arq arqVar = (arq) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    iy3VarK0 = jd8.k0(arqVar.a());
                    if (!((um3) p7m0Var.getValue()).f35902a.equals(iy3VarK0)) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            nmo nmoVar = on3Var.g;
                            this.k = null;
                            this.l = iy3VarK0;
                            this.j = true;
                            objG = nmoVar.g(this);
                            if (objG == wneVar14) {
                                return wneVar14;
                            }
                        }
                        iy3Var = iy3VarK0;
                        an3Var = an3VarM;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, um3.a((um3) value, iy3Var, an3Var, null, null, false, false, false, false, false, 131066)));
                    }
                    return Unit.f46060a;
                }
                if (!z14) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iy3 iy3Var2 = (iy3) this.l;
                z1x.P(obj);
                iy3VarK0 = iy3Var2;
                objG = obj;
                an3VarM = wb.M((ne5) objG, on3Var.q);
                iy3Var = iy3VarK0;
                an3Var = an3VarM;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, um3.a((um3) value, iy3Var, an3Var, null, null, false, false, false, false, false, 131066)));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((c00) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var3 = new bm3((i8) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB12.c(bm3Var3, this) == wneVar15) {
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
                    bq9 bq9VarB13 = hkb.B((lr) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var4 = new bm3((i8) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB13.c(bm3Var4, this) == wneVar16) {
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
                    bm3 bm3Var5 = new bm3((vp3) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB14.c(bm3Var5, this) == wneVar17) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var6 = new bm3((vp3) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB15.c(bm3Var6, this) == wneVar18) {
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
                    bq9 bq9VarB16 = hkb.B((p7m0) this.l, ((ApplicationActivity) this.k).f44297a, lkz.d);
                    bm3 bm3Var7 = new bm3((wr3) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB16.c(bm3Var7, this) == wneVar19) {
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
                    bq9 bq9VarB17 = hkb.B((c00) this.l, ((ApplicationActivity) this.k).f44297a, lkz.c);
                    bm3 bm3Var8 = new bm3((wr3) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB17.c(bm3Var8, this) == wneVar20) {
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
                    bq9 bq9VarB18 = hkb.B((gmq) this.l, ((ApplicationActivity) this.k).f44297a, lkz.e);
                    bm3 bm3Var9 = new bm3((vp3) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB18.c(bm3Var9, this) == wneVar21) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.l, ((ApplicationActivity) this.k).f44297a, lkz.c);
                    bm3 bm3Var10 = new bm3((vp3) obj2, b3);
                    this.j = true;
                    if (bq9VarB19.c(bm3Var10, this) == wneVar22) {
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
                    bq9 bq9VarB20 = hkb.B((gmq) this.l, ((ApplicationActivity) this.k).f44297a, lkz.c);
                    bm3 bm3Var11 = new bm3((vp3) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB20.c(bm3Var11, this) == wneVar23) {
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
                    bq9 bq9VarB21 = hkb.B((gmq) this.l, ((ApplicationActivity) this.k).f44297a, lkz.d);
                    bm3 bm3Var12 = new bm3((vp3) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB21.c(bm3Var12, this) == wneVar24) {
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
                    kmq kmqVar = (kmq) this.l;
                    gmq gmqVar = (gmq) this.k;
                    na naVar = new na(kmqVar, (f04) obj2, b3);
                    this.j = true;
                    if (gmqVar.c(naVar, this) == wneVar25) {
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
                    bq9 bq9VarB22 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var13 = new bm3((df2) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB22.c(bm3Var13, this) == wneVar26) {
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
                    bq9 bq9VarB23 = hkb.B((c00) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var14 = new bm3((z54) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB23.c(bm3Var14, this) == wneVar27) {
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
                    bq9 bq9VarB24 = hkb.B((lr) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var15 = new bm3((z54) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB24.c(bm3Var15, this) == wneVar28) {
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
                    bm3 bm3Var16 = new bm3((df2) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB25.c(bm3Var16, this) == wneVar29) {
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
                    bq9 bq9VarB26 = hkb.B((i89) this.l, ((clz) this.k).x(), lkz.d);
                    bm3 bm3Var17 = new bm3((df2) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB26.c(bm3Var17, this) == wneVar30) {
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
    public tg3(lr lrVar, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = lrVar;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(lr lrVar, clz clzVar, i8 i8Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = lrVar;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(lr lrVar, clz clzVar, z54 z54Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = lrVar;
        this.k = clzVar;
        this.m = z54Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(lr lrVar, AppUpdateDownloadApkService appUpdateDownloadApkService, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = lrVar;
        this.k = appUpdateDownloadApkService;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(c00 c00Var, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = c00Var;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(c00 c00Var, clz clzVar, i8 i8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = c00Var;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(c00 c00Var, clz clzVar, cm3 cm3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = c00Var;
        this.k = clzVar;
        this.m = cm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(c00 c00Var, clz clzVar, z54 z54Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = c00Var;
        this.k = clzVar;
        this.m = z54Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(c00 c00Var, ApplicationActivity applicationActivity, wr3 wr3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = c00Var;
        this.k = applicationActivity;
        this.m = wr3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(zh3 zh3Var, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = zh3Var;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(zh3 zh3Var, clz clzVar, sg3 sg3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = zh3Var;
        this.k = clzVar;
        this.m = sg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(ji3 ji3Var, clz clzVar, pa paVar, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = ji3Var;
        this.k = clzVar;
        this.m = paVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(ji3 ji3Var, clz clzVar, pa paVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = ji3Var;
        this.k = clzVar;
        this.m = paVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(ji3 ji3Var, clz clzVar, sg3 sg3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = ji3Var;
        this.k = clzVar;
        this.m = sg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(uj3 uj3Var, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.k = uj3Var;
        this.m = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(on3 on3Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = on3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, yje yjeVar, f04 f04Var) {
        super(2, yjeVar);
        this.k = gmqVar;
        this.m = f04Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, clz clzVar, i8 i8Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, clz clzVar, vp3 vp3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, ApplicationActivity applicationActivity, vp3 vp3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = applicationActivity;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, ApplicationActivity applicationActivity, vp3 vp3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = applicationActivity;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, ApplicationActivity applicationActivity, vp3 vp3Var, yje yjeVar, char c) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = applicationActivity;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(gmq gmqVar, ApplicationActivity applicationActivity, vp3 vp3Var, yje yjeVar, int i) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = applicationActivity;
        this.m = vp3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(mii0 mii0Var, String str, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.l = mii0Var;
        this.k = str;
        this.m = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(p7m0 p7m0Var, ApplicationActivity applicationActivity, wr3 wr3Var, yje yjeVar) {
        super(2, yjeVar);
        lkz lkzVar = lkz.f20223a;
        this.l = p7m0Var;
        this.k = applicationActivity;
        this.m = wr3Var;
    }
}
