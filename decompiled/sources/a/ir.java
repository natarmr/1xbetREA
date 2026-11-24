package a;

import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ir extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(long j, egk0 egk0Var, egk0 egk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.k = j;
        this.l = egk0Var;
        this.m = egk0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ir irVar = new ir(this.l, obj2, yjeVar, (byte) 0);
                irVar.k = ((Number) obj).longValue();
                return irVar;
            case 1:
                ir irVar2 = new ir(this.l, obj2, yjeVar, (byte) 1);
                irVar2.k = ((Number) obj).longValue();
                return irVar2;
            case 2:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 2);
            case 3:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new ir(this.l, obj2, yjeVar, (byte) 4);
            case 5:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 5);
            case 6:
                ir irVar3 = new ir(this.k, (r9a) obj2, yjeVar);
                irVar3.l = obj;
                return irVar3;
            case 7:
                return new ir(this.k, (egk0) this.l, (egk0) obj2, yjeVar);
            case 8:
                ir irVar4 = new ir(obj2, this.k, yjeVar, (byte) 8);
                irVar4.l = obj;
                return irVar4;
            case 9:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 9);
            case 10:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 10);
            case 11:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 12);
            case 13:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 13);
            case 14:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 14);
            case 15:
                ir irVar5 = new ir(obj2, this.k, yjeVar, (byte) 15);
                irVar5.l = obj;
                return irVar5;
            case 16:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 20);
            case 21:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new ir(this.l, obj2, this.k, yjeVar, (byte) 23);
            case 24:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ir irVar6 = new ir(this.l, obj2, yjeVar, (byte) 26);
                irVar6.k = ((Number) obj).longValue();
                return irVar6;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ir irVar7 = new ir(this.l, obj2, yjeVar, (byte) 27);
                irVar7.k = ((Number) obj).longValue();
                return irVar7;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 28);
            default:
                return new ir(this.l, this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ir) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ir) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 8:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ir) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ir) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ir) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ir) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ir) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        long j;
        long j2;
        Object g0g0Var;
        Object objD;
        Object objA;
        Object objA2;
        Object objC;
        long j3;
        Object objD2;
        Object objR;
        Object objA3;
        byte b = this.i;
        int i = 0;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                long j4 = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    m0o0 m0o0Var = (m0o0) ((nr) this.l).b;
                    long jB = ((sgb) obj2).b();
                    this.k = j4;
                    this.j = true;
                    Object objF = m0o0Var.b.f(jB, j4, this);
                    if (objF != wneVar) {
                        objF = Unit.f46060a;
                    }
                    if (objF == wneVar) {
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
                long j5 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    m0o0 m0o0Var2 = (m0o0) ((es) this.l).f8305a;
                    long jA = ((tnp0) obj2).a();
                    this.k = j5;
                    this.j = true;
                    Object objH = m0o0Var2.b.h(jA, j5, this);
                    if (objH != wneVar2) {
                        objH = Unit.f46060a;
                    }
                    if (objH == wneVar2) {
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
                    this.j = true;
                    if (pw70.b((pw70) ((nc0) this.l).f, mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), this.k, 0L, 0L, null, false, false, false, 262142), (String) obj2, 8120, false, false, this, 98) == wneVar3) {
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
                    this.j = true;
                    String str = eh0.e0;
                    if (((eh0) this.l).S(mlr.a(new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200), this.k, 0L, 0L, null, false, false, false, 262142), 8120, this.k, "carousel", (q91) obj2, this) == wneVar4) {
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
                kd7 kd7Var = (kd7) obj2;
                i1w0 i1w0Var = kd7Var.g0;
                z0w z0wVar = (z0w) this.l;
                String str2 = z0wVar.L;
                long j6 = z0wVar.t;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    long j7 = z0wVar.h;
                    if (j7 <= 0) {
                        j7 = z0wVar.i;
                    }
                    fvt0 fvt0Var = kd7Var.S;
                    this.k = j7;
                    this.j = true;
                    objV = fvt0Var.v(j6, this);
                    if (objV == wneVar5) {
                        return wneVar5;
                    }
                    j = j7;
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.k;
                    z1x.P(obj);
                    objV = obj;
                }
                if (((Boolean) objV).booleanValue()) {
                    return Unit.f46060a;
                }
                if (axq.y(z0wVar.I, gql0.b())) {
                    i1w0Var.d(new mz0((Object) kd7Var, j, (Object) z0wVar, (byte) 7));
                } else if (str2.length() > 0) {
                    pv00 pv00Var = kd7Var.V;
                    String strValueOf = String.valueOf(j);
                    strValueOf.getClass();
                    long j8 = z0wVar.t;
                    long j9 = z0wVar.f;
                    String str3 = z0wVar.s;
                    String strValueOf2 = String.valueOf(z0wVar.n);
                    String str4 = z0wVar.m;
                    String str5 = (String) CollectionsKt.firstOrNull(z0wVar.o);
                    if (str5 == null) {
                        str5 = "";
                    }
                    iun iunVar = iun.f15405a;
                    y6p0 y6p0Var = new y6p0(iunVar, strValueOf2, str4, str5);
                    String strValueOf3 = String.valueOf(z0wVar.q);
                    String str6 = z0wVar.p;
                    String str7 = (String) CollectionsKt.firstOrNull(z0wVar.r);
                    if (str7 == null) {
                        str7 = "";
                    }
                    pv00Var.n(new vcm0(strValueOf, j8, "", j9, str3, "0", "0", y6p0Var, new y6p0(iunVar, strValueOf3, str6, str7), 0, 0, true, "", true, false, "0", "0"));
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    k0w0Var.h(((zfm0) kd7Var.U).a(j6, str2));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 5:
                long[] jArr = (long[]) obj2;
                mii0 mii0Var = (mii0) this.l;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    r7v r7vVar = (r7v) mii0Var.c;
                    String strA = ((btt0) mii0Var.e).a();
                    wp wpVar = new wp(this.k, tx3.f0(jArr));
                    this.j = true;
                    Object objA4 = ((ym7) ((zm) r7vVar.f29996a).invoke()).a(strA, wpVar, this);
                    if (objA4 != wneVar6) {
                        objA4 = Unit.f46060a;
                    }
                    if (objA4 == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int length = jArr.length;
                while (i < length) {
                    ((ev7) mii0Var.d).f8454a.add(Long.valueOf(jArr[i]));
                    i++;
                }
                return Unit.f46060a;
            case 6:
                long j10 = this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    Log.d("CXCP", "Finalizing " + ((vne) this.l) + " in " + j10 + " ms");
                    this.j = true;
                    if (qcc.O(j10, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((r9a) obj2).m(0L);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (z8 && !z8) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                do {
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS);
                    bfn bfnVar = bfn.SECONDS;
                    long jL = wen.l(jW0, bfnVar);
                    egk0 egk0Var = (egk0) this.l;
                    int i2 = yhh.b;
                    ((egk0) obj2).m(wen.l(this.k, bfnVar) * (jL - egk0Var.l()));
                    j2 = yhh.f42636a;
                    this.j = true;
                } while (qcc.P(j2, this) != wneVar8);
                return wneVar8;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    vne vneVar = (vne) this.l;
                    xdr xdrVar = ((vel) obj2).m1;
                    ne60 ne60Var = new ne60(this.k);
                    this.j = true;
                    if (xdrVar.F(vneVar, ne60Var, this) == wneVar9) {
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
                    s1p s1pVar = (s1p) this.l;
                    qoj0 qoj0Var = s1pVar.i;
                    long j11 = this.k;
                    long micros = TimeUnit.MILLISECONDS.toMicros(s1pVar.g.a());
                    Set set = (Set) obj2;
                    set.getClass();
                    l1p l1pVar = new l1p(set, j11, micros);
                    this.j = true;
                    if (qoj0Var.a(l1pVar, this) == wneVar10) {
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
                if (z11) {
                    if (z11) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                reu reuVar = (reu) ((uii) this.l).f35730a;
                String strValueOf4 = (String) obj2;
                long j12 = this.k;
                if (strValueOf4.length() == 0) {
                    strValueOf4 = String.valueOf(j12);
                }
                this.j = true;
                Object objA5 = ((njg) reuVar.b).a(strValueOf4, this);
                return objA5 == wneVar11 ? wneVar11 : objA5;
            case 11:
                spr sprVar = (spr) obj2;
                q5z q5zVar = (q5z) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    if (q5zVar instanceof m5z) {
                        qnr qnrVar = (qnr) sprVar.D();
                        long j13 = qnrVar.f29044a;
                        sprVar.P(new u3z(((m5z) q5zVar).f21240a, qnrVar.i, qnrVar.e), null);
                    }
                    nc0 nc0Var = sprVar.Q;
                    long j14 = this.k;
                    this.j = true;
                    if (nc0Var.w(j14, q5zVar, this) == wneVar12) {
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
                    this.j = true;
                    if (((g9s) this.l).S.w(this.k, (q5z) obj2, this) == wneVar13) {
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
                    this.j = true;
                    if (((yks) this.l).S.w(this.k, (q5z) obj2, this) == wneVar14) {
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
                try {
                    if (!z15) {
                        z1x.P(obj);
                        u8u u8uVar = (u8u) this.l;
                        long j15 = this.k;
                        String str8 = (String) obj2;
                        e0g0 e0g0Var = j0g0.b;
                        hnu hnuVar = (hnu) u8uVar.c;
                        this.j = true;
                        objD = ((iw20) hnuVar.f13365a).d(j15, this, str8);
                        if (objD == wneVar15) {
                            return wneVar15;
                        }
                    } else {
                        if (!z15) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objD = obj;
                    }
                    g0g0Var = (jda0) objD;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return new j0g0(g0g0Var);
            case 15:
                f7u f7uVar = (f7u) obj2;
                kmq kmqVar = (kmq) this.l;
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    utb utbVarC = aoq.c(((uzc) f7uVar.c).c(), new kqu(this.k, f7uVar, null, (byte) 0));
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, utbVarC, this) == wneVar16) {
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
                if (z17) {
                    if (z17) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                cu cuVar = (cu) this.l;
                mii0 mii0Var2 = (mii0) cuVar.c;
                this.j = true;
                Object objD0 = qjj.d0(((mne) mii0Var2.b).b, new x0f(((gst0) cuVar.d).f11847a.a().f18785a, this.k, (String) obj2, mii0Var2, (yje) null), this);
                return objD0 == wneVar17 ? wneVar17 : objD0;
            case 17:
                z4w z4wVar = (z4w) this.l;
                wne wneVar18 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    nrt nrtVar = z4wVar.q;
                    long j16 = this.k;
                    this.j = true;
                    objA = nrt.a(nrtVar, j16, this);
                    if (objA == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                z4wVar.u.f(new o4w((n3w) obj2, ((ql5) objA).i.a()));
                return Unit.f46060a;
            case 18:
                rrd rrdVar = (rrd) this.l;
                wne wneVar19 = wne.f39444a;
                boolean z19 = this.j;
                if (z19) {
                    if (z19) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pyu pyuVar = (pyu) rrdVar.c;
                String strA2 = ((btt0) rrdVar.i).a();
                Calendar calendar = Calendar.getInstance();
                int iOrdinal = ((vlq0) obj2).ordinal();
                if (iOrdinal == 0) {
                    calendar.add(10, -1);
                } else if (iOrdinal == 1) {
                    calendar.add(10, -6);
                } else if (iOrdinal == 2) {
                    calendar.add(10, -12);
                } else if (iOrdinal == 3) {
                    calendar.add(10, -24);
                } else if (iOrdinal == 4) {
                    calendar.add(4, -1);
                } else {
                    if (iOrdinal != 5) {
                        t9f.b();
                        return null;
                    }
                    calendar.add(1, -1);
                }
                zs7 zs7Var = new zs7(new Long((y2m0.c() - calendar.getTimeInMillis()) / 1000), new Long(this.k), null);
                this.j = true;
                Object objB = ((r37) ((tpv) pyuVar.f27815a).invoke()).b(strA2, zs7Var, this);
                return objB == wneVar19 ? wneVar19 : objB;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z20 = this.j;
                if (z20) {
                    if (z20) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                rrd rrdVar2 = (rrd) this.l;
                pyu pyuVar2 = (pyu) rrdVar2.c;
                String strA3 = ((btt0) rrdVar2.i).a();
                zs7 zs7Var2 = new zs7(null, new Long(this.k), (String) obj2);
                this.j = true;
                Object objB2 = ((r37) ((tpv) pyuVar2.f27815a).invoke()).b(strA3, zs7Var2, this);
                return objB2 == wneVar20 ? wneVar20 : objB2;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    lrc lrcVar = (lrc) ((y3v) this.l).b;
                    long j17 = this.k;
                    this.j = true;
                    objA2 = ((hd5) ((azj0) lrcVar.b).b(sre0.f32672a.b(hd5.class), j17)).a((String) obj2, this);
                    if (objA2 == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                ResponseBody responseBody = (ResponseBody) objA2;
                return new gc5(responseBody.a(), responseBody.getC());
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    this.j = true;
                    if (((bo10) this.l).F(this.k, (csr) obj2, true, this) == wneVar22) {
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
                x4t x4tVar = (x4t) obj2;
                d650 d650Var = (d650) this.l;
                wne wneVar23 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    long j18 = this.k;
                    int i3 = d650.k1;
                    mlr mlrVarA = d650Var.A(j18, x4tVar);
                    if (mlrVarA != null) {
                        d650Var.U(mlrVarA, x4tVar, d650.C(x4tVar));
                        int i4 = 8114;
                        if (d650Var.c1) {
                            if (!(x4tVar instanceof v4t)) {
                                i4 = i;
                            }
                        } else if (!(x4tVar instanceof v4t)) {
                            if (x4tVar instanceof p4t) {
                                i = 8124;
                            } else if (x4tVar instanceof l4t) {
                                i = 8118;
                            } else if (x4tVar instanceof i4t) {
                                i = 8119;
                            } else if (x4tVar instanceof s4t) {
                                i = 8116;
                            }
                            i4 = i;
                        }
                        pw70 pw70Var = d650Var.F;
                        String strA0 = d650Var.a0(mlrVarA.f22006a, x4tVar);
                        this.j = true;
                        if (pw70.b(pw70Var, mlrVarA, strA0, i4, false, false, this, 114) == wneVar23) {
                            return wneVar23;
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
            case 23:
                sp70 sp70Var = (sp70) this.l;
                wne wneVar24 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    long j19 = this.k;
                    this.j = true;
                    objC = sp70Var.C(j19, this, (csr) obj2);
                    if (objC == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                m7h0 m7h0Var = (m7h0) objC;
                if (m7h0Var != null) {
                    i1w0 i1w0Var2 = sp70Var.b;
                    i1w0Var2.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var2);
                    k0w0Var2.g();
                    k0w0Var2.h(m7h0Var);
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 24:
                gz80 gz80Var = (gz80) this.l;
                wne wneVar25 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    reu reuVar2 = gz80Var.z;
                    j3 = 0;
                    long j20 = this.k;
                    String str9 = ((by80) obj2).f3405a;
                    this.j = true;
                    objD2 = ((epi0) reuVar2.b).d(j20, this, str9);
                    if (objD2 == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD2 = obj;
                    j3 = 0;
                }
                o9p0 o9p0Var = (o9p0) objD2;
                List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    axq.t(((yxg) it.next()).f43419a, arrayList);
                }
                long j21 = o9p0Var.c;
                long j22 = o9p0Var.c;
                if (!arrayList.contains(new Long(j21)) || o9p0Var.f24891a == j3) {
                    gz80Var.G(new xy80(gz80Var.B.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
                } else {
                    gz80Var.D.p(r1g.CYBERSPORT_PARTNERS, j22);
                    gz80Var.E.z(j22, "cybersport_partners");
                    ((uzg) gz80Var.r).n(o9p0Var.c, o9p0Var.f24891a, o9p0Var.d, k1g.OPEN_REGULAR);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                long j23 = this.k;
                f1b0 f1b0Var = (f1b0) this.l;
                ctf0 ctf0Var = f1b0Var.t;
                wne wneVar26 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    es esVar = f1b0Var.G;
                    this.j = true;
                    objR = esVar.r(j23, this);
                    if (objR == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objR = obj;
                }
                mlr mlrVar = (mlr) objR;
                if (mlrVar == null) {
                    f1b0Var.G(new vza0(f1b0Var.t.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.game_not_available_now, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    f1b0.T(f1b0Var, j23, 8120, 56);
                    f1b0Var.V(8120, mlrVar, f1b0Var.X.k(new lu0(0L, null, "popular_new_aggregator", kotlin.collections.a.c(new g3z(((lr5) obj2).f20512a, "carousel")))), false);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                long j24 = this.k;
                wne wneVar27 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    m0o0 m0o0Var3 = (m0o0) ((khf0) this.l).b;
                    long jB2 = ((sgb) obj2).b();
                    this.k = j24;
                    this.j = true;
                    Object objF2 = m0o0Var3.b.f(jB2, j24, this);
                    if (objF2 != wneVar27) {
                        objF2 = Unit.f46060a;
                    }
                    if (objF2 == wneVar27) {
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
                long j25 = this.k;
                wne wneVar28 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    m0o0 m0o0Var4 = (m0o0) ((phf0) this.l).b;
                    long jA2 = ((tnp0) obj2).a();
                    this.k = j25;
                    this.j = true;
                    Object objH2 = m0o0Var4.b.h(jA2, j25, this);
                    if (objH2 != wneVar28) {
                        objH2 = Unit.f46060a;
                    }
                    if (objH2 == wneVar28) {
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
                l7k0 l7k0Var = (l7k0) obj2;
                j7k0 j7k0Var = (j7k0) this.l;
                wne wneVar29 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    t33 t33Var = j7k0Var.f16045a;
                    qkx qkxVar = new qkx(this.k);
                    nul0 nul0Var = l7k0Var.p;
                    this.j = true;
                    objA3 = t33.a(t33Var, qkxVar, nul0Var, null, null, this, 12);
                    if (objA3 == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                b73 b73Var = ((h73) objA3).b;
                b73 b73Var2 = b73.f2083a;
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    this.j = true;
                    if (((ncl0) this.l).D.w(this.k, (q5z) obj2, this) == wneVar30) {
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
    public ir(long j, r9a r9aVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.k = j;
        this.m = r9aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = j;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(Object obj, Object obj2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
