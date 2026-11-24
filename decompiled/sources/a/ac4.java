package a;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authreminder.impl.data.AuthReminderBroadcastReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class ac4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(lr lrVar, clz clzVar, ok4 ok4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = lrVar;
        this.l = clzVar;
        this.m = ok4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ac4 ac4Var = new ac4(this.l, obj2, yjeVar, (byte) 0);
                ac4Var.k = obj;
                return ac4Var;
            case 1:
                ac4 ac4Var2 = new ac4(this.l, obj2, yjeVar, (byte) 1);
                ac4Var2.k = obj;
                return ac4Var2;
            case 2:
                i89 i89Var = (i89) this.k;
                clz clzVar = (clz) this.l;
                lkz lkzVar = lkz.f20223a;
                return new ac4(i89Var, clzVar, (df2) obj2, yjeVar);
            case 3:
                ac4 ac4Var3 = new ac4(this.l, obj2, yjeVar, (byte) 3);
                ac4Var3.k = obj;
                return ac4Var3;
            case 4:
                ac4 ac4Var4 = new ac4(this.l, obj2, yjeVar, (byte) 4);
                ac4Var4.k = obj;
                return ac4Var4;
            case 5:
                i89 i89Var2 = (i89) this.k;
                clz clzVar2 = (clz) this.l;
                lkz lkzVar2 = lkz.f20223a;
                return new ac4(i89Var2, clzVar2, (df2) obj2, yjeVar, (byte) 0);
            case 6:
                ac4 ac4Var5 = new ac4(this.l, obj2, yjeVar, (byte) 6);
                ac4Var5.k = obj;
                return ac4Var5;
            case 7:
                ac4 ac4Var6 = new ac4(this.l, obj2, yjeVar, (byte) 7);
                ac4Var6.k = obj;
                return ac4Var6;
            case 8:
                gmq gmqVar = (gmq) this.k;
                clz clzVar3 = (clz) this.l;
                lkz lkzVar3 = lkz.f20223a;
                return new ac4(gmqVar, clzVar3, (nk4) obj2, yjeVar);
            case 9:
                lr lrVar = (lr) this.k;
                clz clzVar4 = (clz) this.l;
                lkz lkzVar4 = lkz.f20223a;
                return new ac4(lrVar, clzVar4, (ok4) obj2, yjeVar);
            case 10:
                gmq gmqVar2 = (gmq) this.k;
                clz clzVar5 = (clz) this.l;
                lkz lkzVar5 = lkz.f20223a;
                return new ac4(gmqVar2, clzVar5, (nk4) obj2, yjeVar, (byte) 0);
            case 11:
                gmq gmqVar3 = (gmq) this.k;
                clz clzVar6 = (clz) this.l;
                lkz lkzVar6 = lkz.f20223a;
                return new ac4(gmqVar3, clzVar6, (ok4) obj2, yjeVar);
            case 12:
                return new ac4(this.k, this.l, obj2, yjeVar, (byte) 12);
            case 13:
                i89 i89Var3 = (i89) this.k;
                clz clzVar7 = (clz) this.l;
                lkz lkzVar7 = lkz.f20223a;
                return new ac4(i89Var3, clzVar7, (df2) obj2, yjeVar, (char) 0);
            case 14:
                gmq gmqVar4 = (gmq) this.k;
                clz clzVar8 = (clz) this.l;
                lkz lkzVar8 = lkz.f20223a;
                return new ac4(gmqVar4, clzVar8, (cm3) obj2, yjeVar);
            case 15:
                gmq gmqVar5 = (gmq) this.k;
                clz clzVar9 = (clz) this.l;
                lkz lkzVar9 = lkz.f20223a;
                return new ac4(gmqVar5, clzVar9, (cm3) obj2, yjeVar, (byte) 0);
            case 16:
                i89 i89Var4 = (i89) this.k;
                clz clzVar10 = (clz) this.l;
                lkz lkzVar10 = lkz.f20223a;
                return new ac4(i89Var4, clzVar10, (df2) obj2, yjeVar, 0);
            case 17:
                xae0 xae0Var = (xae0) this.k;
                clz clzVar11 = (clz) this.l;
                lkz lkzVar11 = lkz.f20223a;
                return new ac4(xae0Var, clzVar11, (ow4) obj2, yjeVar);
            case 18:
                xae0 xae0Var2 = (xae0) this.k;
                clz clzVar12 = (clz) this.l;
                lkz lkzVar12 = lkz.f20223a;
                return new ac4(xae0Var2, clzVar12, (ow4) obj2, yjeVar, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gmq gmqVar6 = (gmq) this.k;
                clz clzVar13 = (clz) this.l;
                lkz lkzVar13 = lkz.f20223a;
                return new ac4(gmqVar6, clzVar13, (ow4) obj2, yjeVar);
            case 20:
                gmq gmqVar7 = (gmq) this.k;
                clz clzVar14 = (clz) this.l;
                lkz lkzVar14 = lkz.f20223a;
                return new ac4(gmqVar7, clzVar14, (ow4) obj2, yjeVar, (byte) 0);
            case 21:
                gmq gmqVar8 = (gmq) this.k;
                clz clzVar15 = (clz) this.l;
                lkz lkzVar15 = lkz.f20223a;
                return new ac4(gmqVar8, clzVar15, (ow4) obj2, yjeVar, (char) 0);
            case 22:
                gmq gmqVar9 = (gmq) this.k;
                clz clzVar16 = (clz) this.l;
                lkz lkzVar16 = lkz.f20223a;
                return new ac4(gmqVar9, clzVar16, (ow4) obj2, yjeVar, 0);
            case 23:
                xae0 xae0Var3 = (xae0) this.k;
                clz clzVar17 = (clz) this.l;
                lkz lkzVar17 = lkz.f20223a;
                return new ac4(xae0Var3, clzVar17, (ow4) obj2, yjeVar, (char) 0);
            case 24:
                xae0 xae0Var4 = (xae0) this.k;
                clz clzVar18 = (clz) this.l;
                lkz lkzVar18 = lkz.f20223a;
                return new ac4(xae0Var4, clzVar18, (qv3) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p6d p6dVar = (p6d) this.k;
                clz clzVar19 = (clz) this.l;
                lkz lkzVar19 = lkz.f20223a;
                return new ac4(p6dVar, clzVar19, (ow4) obj2, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xae0 xae0Var5 = (xae0) this.k;
                clz clzVar20 = (clz) this.l;
                lkz lkzVar20 = lkz.f20223a;
                return new ac4(xae0Var5, clzVar20, (ow4) obj2, yjeVar, 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ac4((fy4) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i89 i89Var5 = (i89) this.k;
                clz clzVar21 = (clz) this.l;
                lkz lkzVar21 = lkz.f20223a;
                return new ac4(i89Var5, clzVar21, (df2) obj2, yjeVar, (short) 0);
            default:
                return new ac4(this.k, this.l, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ac4) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ac4) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ac4) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ac4) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ac4) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ac4) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ac4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:274:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c0  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        z660 z660Var;
        z660 z660Var2;
        fn4 fn4Var;
        sr00 sr00Var;
        v88 v88Var;
        Object objG;
        i1w0 i1w0Var;
        String str;
        Object objA;
        Object g0g0Var;
        bd5 bd5Var;
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 7;
        byte b4 = 2;
        Object obj2 = this.m;
        byte b5 = 1;
        switch (b) {
            case 0:
                e7a e7aVar = (e7a) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (e7aVar != null) {
                        if (e7aVar instanceof c7a) {
                            ac4 ac4Var = (ac4) this.l;
                            this.k = null;
                            this.j = true;
                            if (ac4Var.invoke(e7aVar, this) == wneVar) {
                                return wneVar;
                            }
                        } else if (e7aVar instanceof d7a) {
                            ((sb4) obj2).invoke(e7aVar);
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 1:
                c7a c7aVar = (c7a) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kc4 kc4Var = (kc4) this.l;
                    im4 im4Var = kc4Var.p;
                    nl4 nl4Var = new nl4((uu4) obj2, c7aVar.f3852a, kc4Var.I.g());
                    this.k = null;
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(nl4Var, this) == wneVar2) {
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
                    bq9 bq9VarB = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var = new bm3((df2) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB.c(bm3Var, this) == wneVar3) {
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
                e7a e7aVar2 = (e7a) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (e7aVar2 != null) {
                        if (e7aVar2 instanceof c7a) {
                            ac4 ac4Var2 = (ac4) this.l;
                            this.k = null;
                            this.j = true;
                            if (ac4Var2.invoke(e7aVar2, this) == wneVar4) {
                                return wneVar4;
                            }
                        } else if (e7aVar2 instanceof d7a) {
                            ((rg4) obj2).invoke(e7aVar2);
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 4:
                c7a c7aVar2 = (c7a) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    fh4 fh4Var = (fh4) this.l;
                    im4 im4Var2 = fh4Var.p;
                    nl4 nl4Var2 = new nl4((uu4) obj2, c7aVar2.f3852a, fh4Var.J.g());
                    this.k = null;
                    this.j = true;
                    im4Var2.getClass();
                    if (im4Var2.a(nl4Var2, this) == wneVar5) {
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
                    bq9 bq9VarB2 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var2 = new bm3((df2) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB2.c(bm3Var2, this) == wneVar6) {
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
                e7a e7aVar3 = (e7a) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (e7aVar3 != null) {
                        if (e7aVar3 instanceof c7a) {
                            ac4 ac4Var3 = (ac4) this.l;
                            this.k = null;
                            this.j = true;
                            if (ac4Var3.invoke(e7aVar3, this) == wneVar7) {
                                return wneVar7;
                            }
                        } else if (e7aVar3 instanceof d7a) {
                            ((wj4) obj2).invoke(e7aVar3);
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 7:
                c7a c7aVar3 = (c7a) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    hk4 hk4Var = (hk4) this.l;
                    im4 im4Var3 = hk4Var.p;
                    nl4 nl4Var3 = new nl4((uu4) obj2, c7aVar3.f3852a, hk4Var.H.g());
                    this.k = null;
                    this.j = true;
                    im4Var3.getClass();
                    if (im4Var3.a(nl4Var3, this) == wneVar8) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var3 = new bm3((nk4) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB3.c(bm3Var3, this) == wneVar9) {
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
                    bq9 bq9VarB4 = hkb.B((lr) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var4 = new bm3((ok4) obj2, (byte) 22);
                    this.j = true;
                    if (bq9VarB4.c(bm3Var4, this) == wneVar10) {
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
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var5 = new bm3((nk4) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB5.c(bm3Var5, this) == wneVar11) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var6 = new bm3((ok4) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB6.c(bm3Var6, this) == wneVar12) {
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
                fzs0 fzs0Var = (fzs0) obj2;
                AuthReminderBroadcastReceiver authReminderBroadcastReceiver = (AuthReminderBroadcastReceiver) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    Application application = (Application) this.l;
                    int i = AuthReminderBroadcastReceiver.g;
                    if (sj3.L(application)) {
                        ctf0 ctf0Var = authReminderBroadcastReceiver.d;
                        if (ctf0Var == null) {
                            Intrinsics.h("resourceManager");
                            throw null;
                        }
                        int iOrdinal = fzs0Var.ordinal();
                        if (iOrdinal == 0) {
                            fn4Var = new fn4(R.drawable.auth_notification_24h, ctf0Var.f(R.string.notification_reminder_registration_one_day_title, new Object[0]), R.drawable.auth_notification_24h_big, ctf0Var.f(R.string.notification_reminder_registration_one_day_message, new Object[0]));
                        } else if (iOrdinal == 1) {
                            fn4Var = new fn4(R.drawable.auth_notification_72h, ctf0Var.f(R.string.notification_reminder_registration_three_day_title, new Object[0]), R.drawable.auth_notification_72h_big, ctf0Var.f(R.string.notification_reminder_registration_three_day_message, new Object[0]));
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            fn4Var = new fn4(R.drawable.auth_notification_120h, ctf0Var.f(R.string.notification_reminder_registration_week_title, new Object[0]), R.drawable.auth_notification_120h_big, ctf0Var.f(R.string.notification_reminder_registration_week_message_v2, ctf0Var.f(application.getApplicationInfo().labelRes, new Object[0])));
                        }
                        Drawable drawable = application.getDrawable(fn4Var.c);
                        Drawable drawable2 = application.getDrawable(fn4Var.d);
                        if ((drawable != null ? drawable.getIntrinsicWidth() : 0) <= 0) {
                            drawable = null;
                        } else {
                            if ((drawable != null ? drawable.getIntrinsicHeight() : 0) <= 0) {
                                drawable = null;
                            }
                        }
                        if ((drawable2 != null ? drawable2.getIntrinsicWidth() : 0) <= 0) {
                            drawable2 = null;
                        } else {
                            if ((drawable2 != null ? drawable2.getIntrinsicHeight() : 0) <= 0) {
                                drawable2 = null;
                            }
                        }
                        Intent intentPutExtra = new Intent(j120.Q(application)).putExtra("OPEN_SCREEN", "LOGIN").putExtra("AUTH_NOTIFICATION_TYPE", fzs0Var.a());
                        intentPutExtra.getClass();
                        int iOrdinal2 = fzs0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            sr00Var = sr00.h;
                        } else if (iOrdinal2 == 1) {
                            sr00Var = sr00.i;
                        } else {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return null;
                            }
                            sr00Var = sr00.j;
                        }
                        intentPutExtra.putExtra("LOCAL_NOTIFICATION_TYPE", sr00Var);
                        h760 h760Var = authReminderBroadcastReceiver.c;
                        if (h760Var == null) {
                            Intrinsics.h("notificationFeature");
                            throw null;
                        }
                        t760 t760VarA = h760Var.a();
                        Bitmap bitmapD = drawable != null ? hic.D(drawable, 0, 0, 7) : null;
                        Bitmap bitmapD2 = drawable2 != null ? hic.D(drawable2, 0, 0, 7) : null;
                        gle0 gle0Var = k9h0.f17916a;
                        t760.a(t760VarA, intentPutExtra, fn4Var.f9814a, fn4Var.b, 67108864, bitmapD, bitmapD2, "REGISTRATION", 1257, null, 768);
                    }
                    nhf0 nhf0Var = authReminderBroadcastReceiver.b;
                    if (nhf0Var == null) {
                        Intrinsics.h("completeAuthReminderNotificationScenario");
                        throw null;
                    }
                    nhf0Var.x(fzs0Var);
                    this.j = true;
                    qu quVar = authReminderBroadcastReceiver.e;
                    if (quVar == null) {
                        Intrinsics.h("notificationAnalytics");
                        throw null;
                    }
                    int iOrdinal3 = fzs0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        z660Var = z660.UNAUTHORIZED_24H;
                    } else if (iOrdinal3 == 1) {
                        z660Var = z660.UNAUTHORIZED_72H;
                    } else {
                        if (iOrdinal3 != 2) {
                            t9f.b();
                            return null;
                        }
                        z660Var = z660.UNAUTHORIZED_120H;
                    }
                    quVar.d(z660Var);
                    s64 s64Var = authReminderBroadcastReceiver.f;
                    if (s64Var == null) {
                        Intrinsics.h("notificationFatmanLogger");
                        throw null;
                    }
                    int iOrdinal4 = fzs0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        z660Var2 = z660.UNAUTHORIZED_24H;
                    } else if (iOrdinal4 == 1) {
                        z660Var2 = z660.UNAUTHORIZED_72H;
                    } else {
                        if (iOrdinal4 != 2) {
                            t9f.b();
                            return null;
                        }
                        z660Var2 = z660.UNAUTHORIZED_120H;
                    }
                    Object objB = s64Var.b(z660Var2.f43851a, this);
                    if (objB != wneVar13) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar13) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var7 = new bm3((df2) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB7.c(bm3Var7, this) == wneVar14) {
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
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var8 = new bm3((cm3) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB8.c(bm3Var8, this) == wneVar15) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var9 = new bm3((cm3) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB9.c(bm3Var9, this) == wneVar16) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    bm3 bm3Var10 = new bm3((df2) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB10.c(bm3Var10, this) == wneVar17) {
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
                    bq9 bq9VarB11 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var = new nw4((ow4) obj2, b2);
                    this.j = true;
                    if (bq9VarB11.c(nw4Var, this) == wneVar18) {
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
                    bq9 bq9VarB12 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var2 = new nw4((ow4) obj2, b5);
                    this.j = true;
                    if (bq9VarB12.c(nw4Var2, this) == wneVar19) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var3 = new nw4((ow4) obj2, b4);
                    this.j = true;
                    if (bq9VarB13.c(nw4Var3, this) == wneVar20) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var4 = new nw4((ow4) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB14.c(nw4Var4, this) == wneVar21) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var5 = new nw4((ow4) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB15.c(nw4Var5, this) == wneVar22) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var6 = new nw4((ow4) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB16.c(nw4Var6, this) == wneVar23) {
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
                    bq9 bq9VarB17 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var7 = new nw4((ow4) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB17.c(nw4Var7, this) == wneVar24) {
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
                    bq9 bq9VarB18 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var8 = new nw4((qv3) obj2, b3);
                    this.j = true;
                    if (bq9VarB18.c(nw4Var8, this) == wneVar25) {
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
                    bq9 bq9VarB19 = hkb.B((p6d) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var9 = new nw4((ow4) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB19.c(nw4Var9, this) == wneVar26) {
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
                    bq9 bq9VarB20 = hkb.B((xae0) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var10 = new nw4((ow4) obj2, (byte) 9);
                    this.j = true;
                    if (bq9VarB20.c(nw4Var10, this) == wneVar27) {
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
                fy4 fy4Var = (fy4) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    v88Var = fy4Var.c;
                    i1w0 i1w0Var2 = fy4Var.h;
                    khf0 khf0Var = fy4Var.e;
                    bm5 bm5Var = bm5.b;
                    this.k = v88Var;
                    this.l = i1w0Var2;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar28) {
                        return wneVar28;
                    }
                    i1w0Var = i1w0Var2;
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i1w0Var = (i1w0) this.l;
                    v88 v88Var2 = (v88) this.k;
                    z1x.P(obj);
                    v88Var = v88Var2;
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                fy4Var.f.a(bm5.b, ql5Var);
                v88.b(v88Var, i1w0Var, ql5Var.f28916a, 2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) this.l).x(), lkz.d);
                    nw4 nw4Var11 = new nw4((df2) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB21.c(nw4Var11, this) == wneVar29) {
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
                gr00 gr00Var = (gr00) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    yk50 yk50Var = (yk50) gr00Var.f11760a;
                    ed5 ed5Var = (ed5) this.l;
                    ((knf0) gr00Var.c).getClass();
                    this.j = true;
                    cd5 cd5Var = (cd5) ((zm) yk50Var.b).invoke();
                    int iOrdinal5 = ed5Var.ordinal();
                    if (iOrdinal5 == 0) {
                        str = "load_screen_resources_p1357";
                    } else {
                        if (iOrdinal5 != 1) {
                            t9f.b();
                            return null;
                        }
                        str = "update_screen_resources_p1357";
                    }
                    objA = cd5Var.a(str, this);
                    if (objA == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                yc5 yc5Var = (yc5) objA;
                vby vbyVar = (vby) gr00Var.e;
                String lowerCase = ((String) obj2).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                yc5Var.getClass();
                vbyVar.getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    List list = yc5Var.b;
                    String str2 = (list == null || (bd5Var = (bd5) CollectionsKt.firstOrNull(list)) == null) ? null : bd5Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Map map = (Map) vbyVar.a(new inv(ysm0.f43175a, vc5.Companion.serializer(), (byte) 1), (mcy) xp20.d(ncy.i(vbyVar.e(str2)), "geo"));
                    vc5 vc5Var = (vc5) map.get(lowerCase);
                    if (vc5Var == null) {
                        vc5Var = (vc5) xp20.d(map, "default");
                    }
                    String str3 = vc5Var.f37171a;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = vc5Var.b;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = vc5Var.c;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = vc5Var.d;
                    String str10 = str9 == null ? "" : str9;
                    String str11 = vc5Var.e;
                    String str12 = str11 == null ? "" : str11;
                    String str13 = vc5Var.f;
                    String str14 = str13 == null ? "" : str13;
                    String str15 = vc5Var.g;
                    String str16 = str15 == null ? "" : str15;
                    String str17 = vc5Var.h;
                    String str18 = str17 == null ? "" : str17;
                    String str19 = vc5Var.i;
                    String str20 = str19 == null ? "" : str19;
                    String str21 = vc5Var.j;
                    String str22 = str21 == null ? "" : str21;
                    String str23 = vc5Var.k;
                    g0g0Var = new dd5(str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, str23 == null ? "" : str23);
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (j0g0.a(g0g0Var) == null) {
                    return (dd5) g0g0Var;
                }
                jf4.k(null);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(fy4 fy4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        this.m = fy4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(p6d p6dVar, clz clzVar, ow4 ow4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = p6dVar;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, cm3 cm3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = cm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, cm3 cm3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = cm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, nk4 nk4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nk4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, nk4 nk4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = nk4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, ok4 ok4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ok4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, ow4 ow4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, ow4 ow4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, ow4 ow4Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(gmq gmqVar, clz clzVar, ow4 ow4Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(xae0 xae0Var, clz clzVar, qv3 qv3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = qv3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(xae0 xae0Var, clz clzVar, ow4 ow4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(xae0 xae0Var, clz clzVar, ow4 ow4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(xae0 xae0Var, clz clzVar, ow4 ow4Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac4(xae0 xae0Var, clz clzVar, ow4 ow4Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ow4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac4(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac4(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
