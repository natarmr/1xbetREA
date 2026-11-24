package a;

import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationEmptyFragmentScreen;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationOptionsFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class w090 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (y090) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new w090((dnq) this.l, (clz) obj3, (x090) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new w090((xae0) this.l, (clz) obj3, (u590) obj2, yjeVar);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new w090((xae0) this.l, (clz) obj3, (u590) obj2, yjeVar, (byte) 0);
            case 5:
                lkz lkzVar6 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (u590) obj2, yjeVar);
            case 6:
                lkz lkzVar7 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (byte) 0);
            case 7:
                lkz lkzVar8 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, (char) 0);
            case 8:
                lkz lkzVar9 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (hi70) obj2, yjeVar);
            case 9:
                lkz lkzVar10 = lkz.f20223a;
                return new w090((gmq) this.l, (n6r) obj3, (s980) obj2, yjeVar);
            case 10:
                return new w090(obj3, (Serializable) obj2, yjeVar, (byte) 10);
            case 11:
                return new w090(obj3, (Serializable) obj2, yjeVar, (byte) 11);
            case 12:
                return new w090(this.l, obj3, obj2, yjeVar, (byte) 12);
            case 13:
                lkz lkzVar11 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (hi70) obj2, yjeVar, (byte) 0);
            case 14:
                lkz lkzVar12 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (hi70) obj2, yjeVar, (char) 0);
            case 15:
                lkz lkzVar13 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (hi70) obj2, yjeVar, 0);
            case 16:
                lkz lkzVar14 = lkz.f20223a;
                return new w090((gmq) this.l, (clz) obj3, (hi70) obj2, yjeVar, (short) 0);
            case 17:
                lkz lkzVar15 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (gq50) obj2, yjeVar, 0);
            case 18:
                lkz lkzVar16 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (yn90) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar17 = lkz.f20223a;
                return new w090((m430) this.l, (clz) obj3, (hi70) obj2, yjeVar);
            case 20:
                lkz lkzVar18 = lkz.f20223a;
                return new w090((wk30) this.l, (clz) obj3, (hi70) obj2, yjeVar);
            case 21:
                lkz lkzVar19 = lkz.f20223a;
                return new w090((qoj0) this.l, (clz) obj3, (dt90) obj2, yjeVar);
            case 22:
                lkz lkzVar20 = lkz.f20223a;
                return new w090((qoj0) this.l, (clz) obj3, (dt90) obj2, yjeVar, (byte) 0);
            case 23:
                lkz lkzVar21 = lkz.f20223a;
                return new w090((p7m0) this.l, (clz) obj3, (dt90) obj2, yjeVar);
            case 24:
                w090 w090Var = new w090(obj3, (Serializable) obj2, yjeVar, (byte) 24);
                w090Var.l = obj;
                return w090Var;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new w090(this.l, obj3, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new w090(this.l, obj3, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar22 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (yn90) obj2, yjeVar, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar23 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (yn90) obj2, yjeVar, (char) 0);
            default:
                lkz lkzVar24 = lkz.f20223a;
                return new w090((i89) this.l, (clz) obj3, (yn90) obj2, yjeVar, 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((w090) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w090) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        List list;
        Object objA;
        List list2;
        Object objA2;
        Object objA3;
        byte b = this.i;
        wt30 wt30Var = wt30.f39720a;
        byte b2 = 0;
        Object obj2 = this.m;
        Object obj3 = this.k;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var = new mi80((y090) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB.c(mi80Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((dnq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var2 = new mi80((x090) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB2.c(mi80Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var3 = new mi80((gq50) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB3.c(mi80Var3, this) == wneVar3) {
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
                    bq9 bq9VarB4 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var4 = new mi80((u590) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB4.c(mi80Var4, this) == wneVar4) {
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
                    bq9 bq9VarB5 = hkb.B((xae0) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var5 = new mi80((u590) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB5.c(mi80Var5, this) == wneVar5) {
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
                    bq9 bq9VarB6 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var6 = new mi80((u590) obj2, (byte) 17);
                    this.j = true;
                    if (bq9VarB6.c(mi80Var6, this) == wneVar6) {
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
                    bq9 bq9VarB7 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var7 = new mi80((gq50) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB7.c(mi80Var7, this) == wneVar7) {
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
                    bq9 bq9VarB8 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var8 = new mi80((gq50) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB8.c(mi80Var8, this) == wneVar8) {
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
                    bq9 bq9VarB9 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var9 = new mi80((hi70) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB9.c(mi80Var9, this) == wneVar9) {
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
                    gmq gmqVar = (gmq) this.l;
                    n6r n6rVar = (n6r) obj3;
                    n6rVar.b();
                    bq9 bq9VarB10 = hkb.B(gmqVar, n6rVar.c, lkz.d);
                    mi80 mi80Var10 = new mi80((s980) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB10.c(mi80Var10, this) == wneVar10) {
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
                p990 p990Var = (p990) obj3;
                z7z z7zVar = p990Var.n;
                i1w0 i1w0Var = p990Var.b;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    list = p990Var.w.a().p1;
                    rou rouVar = p990Var.t;
                    this.l = list;
                    this.j = true;
                    objA = rouVar.a(false, this);
                    if (objA == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = (List) this.l;
                    z1x.P(obj);
                    list = list3;
                    objA = obj;
                }
                Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
                boolean zC = rz4.C(intOrNull != null ? intOrNull.intValue() : 0, list);
                if (list.isEmpty() || zC) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new f1w0(new VerificationOptionsScreens$VerificationOptionsFragmentScreen(((mbu0) obj2).f21524a, ((l9u0) z7zVar.get()).f19674a))), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    ((i7u0) p990Var.u.get()).f14311a.c("verification_error");
                    ((q7u0) p990Var.v.get()).f28268a.a(xun.f41520a, 11057L);
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    ((l9u0) z7zVar.get()).getClass();
                    k0w0Var.h(new VerificationOptionsScreens$VerificationEmptyFragmentScreen());
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 11:
                db90 db90Var = (db90) obj3;
                z7z z7zVar2 = db90Var.B;
                i1w0 i1w0Var2 = db90Var.p;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    list2 = db90Var.K.a().p1;
                    rou rouVar2 = db90Var.H;
                    this.l = list2;
                    this.j = true;
                    objA2 = rouVar2.a(false, this);
                    if (objA2 == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list4 = (List) this.l;
                    z1x.P(obj);
                    list2 = list4;
                    objA2 = obj;
                }
                Integer intOrNull2 = StringsKt.toIntOrNull(((m2c0) objA2).c);
                boolean zC2 = rz4.C(intOrNull2 != null ? intOrNull2.intValue() : 0, list2);
                if (list2.isEmpty() || zC2) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new f1w0(new VerificationOptionsScreens$VerificationOptionsFragmentScreen(((mbu0) obj2).f21524a, ((l9u0) z7zVar2.get()).f19674a))), i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP2;
                        if (pawVar3.hasNext()) {
                            i1w0Var2.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    ((i7u0) db90Var.I.get()).f14311a.c("verification_error");
                    ((q7u0) db90Var.J.get()).f28268a.a(xun.f41520a, 11057L);
                    i1w0Var2.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var2);
                    ((l9u0) z7zVar2.get()).getClass();
                    k0w0Var2.h(new VerificationOptionsScreens$VerificationEmptyFragmentScreen());
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO2;
                        if (pawVar4.hasNext()) {
                            i1w0Var2.a((oe50) pawVar4.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                dxk dxkVar = (dxk) obj3;
                n660 n660Var = (n660) this.l;
                knf0 knf0Var = (knf0) n660Var.b;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    rb90 rb90Var = (rb90) ((tpv) n660Var.d).invoke();
                    knf0Var.getClass();
                    int i = dxkVar.f6849a;
                    String strC = knf0Var.c();
                    knf0Var.getClass();
                    knf0Var.getClass();
                    this.j = true;
                    objA3 = rb90Var.a(1357, i, strC, 22, 1, this);
                    if (objA3 == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                InputStream inputStreamA = ((ResponseBody) objA3).a();
                File fileP = n660Var.p((File) obj2, dxkVar);
                FileOutputStream fileOutputStream = new FileOutputStream(fileP);
                try {
                    wha0.J(inputStreamA, fileOutputStream, 8192);
                    fileOutputStream.close();
                    ((vwb0) n660Var.f22981a).g("RULES_UPDATE_TIME", System.currentTimeMillis());
                    return fileP;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(fileOutputStream, th);
                        throw th2;
                    }
                }
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var11 = new mi80((hi70) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB11.c(mi80Var11, this) == wneVar14) {
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
                    bq9 bq9VarB12 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var12 = new mi80((hi70) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB12.c(mi80Var12, this) == wneVar15) {
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
                    bq9 bq9VarB13 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var13 = new mi80((hi70) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB13.c(mi80Var13, this) == wneVar16) {
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
                    bq9 bq9VarB14 = hkb.B((gmq) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var14 = new mi80((hi70) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB14.c(mi80Var14, this) == wneVar17) {
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
                    bq9 bq9VarB15 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    mi80 mi80Var15 = new mi80((gq50) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB15.c(mi80Var15, this) == wneVar18) {
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
                    bq9 bq9VarB16 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var = new zn90((yn90) obj2, b2);
                    this.j = true;
                    if (bq9VarB16.c(zn90Var, this) == wneVar19) {
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
                    bq9 bq9VarB17 = hkb.B((m430) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var2 = new zn90((hi70) obj2, b3);
                    this.j = true;
                    if (bq9VarB17.c(zn90Var2, this) == wneVar20) {
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
                    bq9 bq9VarB18 = hkb.B((wk30) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var3 = new zn90((hi70) obj2, (byte) 2);
                    this.j = true;
                    if (bq9VarB18.c(zn90Var3, this) == wneVar21) {
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
                    bq9 bq9VarB19 = hkb.B((qoj0) this.l, ((clz) obj3).x(), lkz.e);
                    zn90 zn90Var4 = new zn90((dt90) obj2, (byte) 3);
                    this.j = true;
                    if (bq9VarB19.c(zn90Var4, this) == wneVar22) {
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
                    bq9 bq9VarB20 = hkb.B((qoj0) this.l, ((clz) obj3).x(), lkz.e);
                    zn90 zn90Var5 = new zn90((dt90) obj2, (byte) 4);
                    this.j = true;
                    if (bq9VarB20.c(zn90Var5, this) == wneVar23) {
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
                    bq9 bq9VarB21 = hkb.B((p7m0) this.l, ((clz) obj3).x(), lkz.e);
                    zn90 zn90Var6 = new zn90((dt90) obj2, (byte) 5);
                    this.j = true;
                    if (bq9VarB21.c(zn90Var6, this) == wneVar24) {
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
                hie0 hie0Var = (hie0) obj2;
                jrs0 jrs0Var = (jrs0) obj3;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    List list5 = (List) this.l;
                    Log.d("PipePresenceSrc", "Flow emitted new camera set: ".concat(CollectionsKt.b0(list5, null, null, null, null, 63)));
                    if (!((AtomicBoolean) jrs0Var.i).get()) {
                        m0x0.H(Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
                    } else if (hie0Var.f13108a) {
                        Log.i("PipePresenceSrc", "Handling first camera set, triggering fresh query.");
                        ig00 ig00VarF = jrs0Var.f();
                        this.j = true;
                        if (s0x.z(ig00VarF, this) == wneVar25) {
                            return wneVar25;
                        }
                    } else {
                        jrs0Var.m(null, list5);
                    }
                    return Unit.f46060a;
                }
                if (!z25) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                hie0Var.f13108a = false;
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Function1 function1 = (Function1) obj2;
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                try {
                    if (!z26) {
                        z1x.P(obj);
                        if (((vno0) this.l).f37729a) {
                            this.j = true;
                            if (d9z.f((d9z) obj3, this) == wneVar26) {
                                return wneVar26;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function1.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    function1.invoke(wt30Var);
                    throw th3;
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Function1 function2 = (Function1) obj2;
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                try {
                    if (!z27) {
                        z1x.P(obj);
                        if (((wno0) this.l).f39459a) {
                            this.j = true;
                            v0h0 v0h0Var = xcz.y;
                            if (((xcz) obj3).f(0, 0, this) == wneVar27) {
                                return wneVar27;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    function2.invoke(wt30Var);
                    return Unit.f46060a;
                } catch (Throwable th4) {
                    function2.invoke(wt30Var);
                    throw th4;
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var7 = new zn90((yn90) obj2, (byte) 6);
                    this.j = true;
                    if (bq9VarB22.c(zn90Var7, this) == wneVar28) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var8 = new zn90((yn90) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB23.c(zn90Var8, this) == wneVar29) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.l, ((clz) obj3).x(), lkz.d);
                    zn90 zn90Var9 = new zn90((yn90) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB24.c(zn90Var9, this) == wneVar30) {
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
    public w090(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, gq50 gq50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = gq50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(i89 i89Var, clz clzVar, yn90 yn90Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 29;
        lkz lkzVar = lkz.f20223a;
        this.l = i89Var;
        this.k = clzVar;
        this.m = yn90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, n6r n6rVar, s980 s980Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = n6rVar;
        this.m = s980Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, hi70 hi70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, hi70 hi70Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, hi70 hi70Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, hi70 hi70Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, y090 y090Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = y090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(gmq gmqVar, clz clzVar, u590 u590Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.l = gmqVar;
        this.k = clzVar;
        this.m = u590Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(dnq dnqVar, clz clzVar, x090 x090Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.l = dnqVar;
        this.k = clzVar;
        this.m = x090Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(m430 m430Var, clz clzVar, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.l = m430Var;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(wk30 wk30Var, clz clzVar, hi70 hi70Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.l = wk30Var;
        this.k = clzVar;
        this.m = hi70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(xae0 xae0Var, clz clzVar, u590 u590Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = u590Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(xae0 xae0Var, clz clzVar, u590 u590Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.l = xae0Var;
        this.k = clzVar;
        this.m = u590Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(qoj0 qoj0Var, clz clzVar, dt90 dt90Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.l = qoj0Var;
        this.k = clzVar;
        this.m = dt90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(qoj0 qoj0Var, clz clzVar, dt90 dt90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.l = qoj0Var;
        this.k = clzVar;
        this.m = dt90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(p7m0 p7m0Var, clz clzVar, dt90 dt90Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.l = p7m0Var;
        this.k = clzVar;
        this.m = dt90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w090(Object obj, Serializable serializable, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w090(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
        this.m = obj3;
    }
}
