package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kmg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, (byte) 0);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (jjc0) obj2, yjeVar, (char) 0);
            case 3:
                return new kmg0(this.k, (String) obj3, (String) obj2, yjeVar, (byte) 3);
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar);
            case 5:
                kmg0 kmg0Var = new kmg0(obj3, obj2, yjeVar, (byte) 5);
                kmg0Var.k = obj;
                return kmg0Var;
            case 6:
                lkz lkzVar5 = lkz.f20223a;
                return new kmg0((xae0) this.k, (clz) obj3, (lug0) obj2, yjeVar);
            case 7:
                lkz lkzVar6 = lkz.f20223a;
                return new kmg0((vae0) this.k, (clz) obj3, (lug0) obj2, yjeVar);
            case 8:
                lkz lkzVar7 = lkz.f20223a;
                return new kmg0((vae0) this.k, (clz) obj3, (wug0) obj2, yjeVar);
            case 9:
                lkz lkzVar8 = lkz.f20223a;
                return new kmg0((xae0) this.k, (clz) obj3, (wug0) obj2, yjeVar);
            case 10:
                lkz lkzVar9 = lkz.f20223a;
                return new kmg0((xae0) this.k, (clz) obj3, (wug0) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar10 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0);
            case 12:
                lkz lkzVar11 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (tye0) obj2, yjeVar);
            case 13:
                kmg0 kmg0Var2 = new kmg0(obj3, obj2, yjeVar, (byte) 13);
                kmg0Var2.k = obj;
                return kmg0Var2;
            case 14:
                kmg0 kmg0Var3 = new kmg0(obj3, obj2, yjeVar, (byte) 14);
                kmg0Var3.k = obj;
                return kmg0Var3;
            case 15:
                return new kmg0(this.k, (String) obj3, (String) obj2, yjeVar, (byte) 15);
            case 16:
                lkz lkzVar12 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (char) 0);
            case 17:
                lkz lkzVar13 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, 0);
            case 18:
                lkz lkzVar14 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (short) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar15 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (tye0) obj2, yjeVar, (byte) 0);
            case 20:
                lkz lkzVar16 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (mph0) obj2, yjeVar);
            case 21:
                lkz lkzVar17 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (yng0) obj2, yjeVar);
            case 22:
                lkz lkzVar18 = lkz.f20223a;
                return new kmg0((dnq) this.k, (clz) obj3, (mph0) obj2, yjeVar);
            case 23:
                lkz lkzVar19 = lkz.f20223a;
                return new kmg0((gmq) this.k, (clz) obj3, (tye0) obj2, yjeVar, (char) 0);
            case 24:
                lkz lkzVar20 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar21 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar22 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0, (char) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar23 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0, 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar24 = lkz.f20223a;
                return new kmg0((i89) this.k, (clz) obj3, (due0) obj2, yjeVar, (byte) 0, (short) 0);
            default:
                kmg0 kmg0Var4 = new kmg0(obj3, obj2, yjeVar, (byte) 29);
                kmg0Var4.k = obj;
                return kmg0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((kmg0) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((kmg0) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ndd nddVar;
        Object objInvoke;
        byte b = this.i;
        byte b2 = 22;
        byte b3 = 17;
        byte b4 = 9;
        byte b5 = 0;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var = new wxf0((jjc0) obj2, (byte) 7);
                    this.j = true;
                    if (bq9VarB.c(wxf0Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var2 = new wxf0((jjc0) obj2, (byte) 8);
                    this.j = true;
                    if (bq9VarB2.c(wxf0Var2, this) == wneVar2) {
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
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var3 = new wxf0((jjc0) obj2, b4);
                    this.j = true;
                    if (bq9VarB3.c(wxf0Var3, this) == wneVar3) {
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
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ljf0 ljf0Var = (ljf0) ((pzu) this.k).b;
                String strB0 = CollectionsKt.b0(kotlin.collections.a.c((String) obj2), Separators.COMMA, null, null, null, 62);
                this.j = true;
                Object objA = ((qlg0) ((rta0) ljf0Var.f20148a).invoke()).a(strB0, (String) obj3, "application/vnd.xenvelop+json", this);
                return objA == wneVar4 ? wneVar4 : objA;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var4 = new wxf0((due0) obj2, (byte) 10);
                    this.j = true;
                    if (bq9VarB4.c(wxf0Var4, this) == wneVar5) {
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
                    vne vneVar = (vne) this.k;
                    odd oddVar = (odd) obj3;
                    Function2 function2 = (Function2) obj2;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        this.k = oddVar;
                        this.j = true;
                        objInvoke = function2.invoke(vneVar, this);
                        if (objInvoke == wneVar6) {
                            return wneVar6;
                        }
                        nddVar = oddVar;
                    } catch (Throwable th) {
                        th = th;
                        nddVar = oddVar;
                        e0g0 e0g0Var2 = j0g0.b;
                        objInvoke = new g0g0(th);
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nddVar = (ndd) this.k;
                    try {
                        z1x.P(obj);
                        objInvoke = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        e0g0 e0g0Var3 = j0g0.b;
                        objInvoke = new g0g0(th);
                    }
                }
                e0g0 e0g0Var4 = j0g0.b;
                Throwable thA = j0g0.a(objInvoke);
                odd oddVar2 = (odd) nddVar;
                if (thA == null) {
                    oddVar2.N(objInvoke);
                } else {
                    oddVar2.b0(thA);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var5 = new wxf0((lug0) obj2, (byte) 11);
                    this.j = true;
                    if (bq9VarB5.c(wxf0Var5, this) == wneVar7) {
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
                    bq9 bq9VarB6 = hkb.B((vae0) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var6 = new wxf0((lug0) obj2, (byte) 12);
                    this.j = true;
                    if (bq9VarB6.c(wxf0Var6, this) == wneVar8) {
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
                    bq9 bq9VarB7 = hkb.B((vae0) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var7 = new wxf0((wug0) obj2, (byte) 13);
                    this.j = true;
                    if (bq9VarB7.c(wxf0Var7, this) == wneVar9) {
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
                    bq9 bq9VarB8 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var8 = new wxf0((wug0) obj2, (byte) 14);
                    this.j = true;
                    if (bq9VarB8.c(wxf0Var8, this) == wneVar10) {
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
                    bq9 bq9VarB9 = hkb.B((xae0) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var9 = new wxf0((wug0) obj2, (byte) 15);
                    this.j = true;
                    if (bq9VarB9.c(wxf0Var9, this) == wneVar11) {
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
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var10 = new wxf0((due0) obj2, (byte) 16);
                    this.j = true;
                    if (bq9VarB10.c(wxf0Var10, this) == wneVar12) {
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
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var11 = new wxf0((tye0) obj2, b3);
                    this.j = true;
                    if (bq9VarB11.c(wxf0Var11, this) == wneVar13) {
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
                    dff0 dff0Var = new dff0((rch0) this.k, (sch0) obj2, b2);
                    this.j = true;
                    if (((ic1) obj3).invoke(dff0Var, this) == wneVar14) {
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
                    sch0 sch0Var = (sch0) obj3;
                    sch0Var.k = (qah0) this.k;
                    rch0 rch0Var = sch0Var.l;
                    this.j = true;
                    if (((Function2) obj2).invoke(rch0Var, this) == wneVar15) {
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
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((s1p) ((cyu) this.k).f5196a).a(tx3.l0(new k1p[]{new j1p((String) obj3, (byte) 0), new j1p((String) obj2, (byte) 1)}), 3072L);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var12 = new wxf0((due0) obj2, (byte) 18);
                    this.j = true;
                    if (bq9VarB12.c(wxf0Var12, this) == wneVar17) {
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
                    bq9 bq9VarB13 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var13 = new wxf0((due0) obj2, (byte) 19);
                    this.j = true;
                    if (bq9VarB13.c(wxf0Var13, this) == wneVar18) {
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
                    bq9 bq9VarB14 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var14 = new wxf0((due0) obj2, (byte) 20);
                    this.j = true;
                    if (bq9VarB14.c(wxf0Var14, this) == wneVar19) {
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
                    bq9 bq9VarB15 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var15 = new wxf0((tye0) obj2, (byte) 21);
                    this.j = true;
                    if (bq9VarB15.c(wxf0Var15, this) == wneVar20) {
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
                    bq9 bq9VarB16 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var16 = new wxf0((mph0) obj2, b2);
                    this.j = true;
                    if (bq9VarB16.c(wxf0Var16, this) == wneVar21) {
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
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var17 = new wxf0((yng0) obj2, (byte) 23);
                    this.j = true;
                    if (bq9VarB17.c(wxf0Var17, this) == wneVar22) {
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
                    bq9 bq9VarB18 = hkb.B((dnq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var18 = new wxf0((mph0) obj2, (byte) 24);
                    this.j = true;
                    if (bq9VarB18.c(wxf0Var18, this) == wneVar23) {
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
                    bq9 bq9VarB19 = hkb.B((gmq) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var19 = new wxf0((tye0) obj2, (byte) 25);
                    this.j = true;
                    if (bq9VarB19.c(wxf0Var19, this) == wneVar24) {
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
                    bq9 bq9VarB20 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var20 = new wxf0((due0) obj2, (byte) 26);
                    this.j = true;
                    if (bq9VarB20.c(wxf0Var20, this) == wneVar25) {
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
                    bq9 bq9VarB21 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var21 = new wxf0((due0) obj2, (byte) 27);
                    this.j = true;
                    if (bq9VarB21.c(wxf0Var21, this) == wneVar26) {
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
                    bq9 bq9VarB22 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var22 = new wxf0((due0) obj2, (byte) 28);
                    this.j = true;
                    if (bq9VarB22.c(wxf0Var22, this) == wneVar27) {
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
                    bq9 bq9VarB23 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    wxf0 wxf0Var23 = new wxf0((due0) obj2, (byte) 29);
                    this.j = true;
                    if (bq9VarB23.c(wxf0Var23, this) == wneVar28) {
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
                    bq9 bq9VarB24 = hkb.B((i89) this.k, ((clz) obj3).x(), lkz.d);
                    x3i0 x3i0Var = new x3i0((due0) obj2, b5);
                    this.j = true;
                    if (bq9VarB24.c(x3i0Var, this) == wneVar29) {
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
                    vne vneVar2 = (vne) this.k;
                    vsg0 vsg0VarV = ydx.V(null, new f7f0((l7m0) obj3, b4));
                    r980 r980Var = new r980((t33) obj2, vneVar2, b3);
                    this.j = true;
                    if (vsg0VarV.c(r980Var, this) == wneVar30) {
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
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, byte b2) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, char c) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, int i) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, short s) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, byte b, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(i89 i89Var, clz clzVar, due0 due0Var, yje yjeVar, short s) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = due0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, jjc0 jjc0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = jjc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, tye0 tye0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, tye0 tye0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, tye0 tye0Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = tye0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, yng0 yng0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yng0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(gmq gmqVar, clz clzVar, mph0 mph0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = mph0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(dnq dnqVar, clz clzVar, mph0 mph0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = dnqVar;
        this.l = clzVar;
        this.m = mph0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(vae0 vae0Var, clz clzVar, lug0 lug0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = lug0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(vae0 vae0Var, clz clzVar, wug0 wug0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = wug0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(xae0 xae0Var, clz clzVar, lug0 lug0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = lug0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(xae0 xae0Var, clz clzVar, wug0 wug0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = wug0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmg0(xae0 xae0Var, clz clzVar, wug0 wug0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = wug0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmg0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmg0(Object obj, String str, String str2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = str;
        this.m = str2;
    }
}
