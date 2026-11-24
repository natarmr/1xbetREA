package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qzs0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29593a;

    public /* synthetic */ qzs0(szs0 szs0Var) {
        this.f29593a = (byte) 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lui0 lui0Var;
        List listC;
        int i = 0;
        Object obj2 = null;
        switch (this.f29593a) {
            case 0:
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                kTypeProjection.getClass();
                uiy uiyVar = kTypeProjection.f46069a;
                if (uiyVar == null) {
                    return Separators.STAR;
                }
                kiy kiyVar = kTypeProjection.b;
                szs0 szs0Var = kiyVar instanceof szs0 ? (szs0) kiyVar : null;
                String strC = szs0Var != null ? szs0Var.c(true) : String.valueOf(kiyVar);
                int iOrdinal = uiyVar.ordinal();
                if (iOrdinal == 0) {
                    return strC;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strC);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strC);
                }
                t9f.b();
                return null;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 2:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                n5t0 n5t0Var = (n5t0) feeVar.c();
                n5t0Var.getClass();
                int iOrdinal2 = n5t0Var.ordinal();
                if (iOrdinal2 == 0) {
                    lui0Var = lui0.b;
                } else if (iOrdinal2 == 1) {
                    lui0Var = lui0.f20675a;
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    lui0Var = lui0.c;
                }
                return new t5t0(lui0Var);
            case 3:
                j0g0 j0g0Var = (j0g0) obj;
                if (j0g0Var != null) {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    fn9 fn9Var = (fn9) obj3;
                    if (fn9Var != null) {
                        List list = fn9Var.j;
                        ArrayList<hn9> arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (((hn9) obj4).b >= 0) {
                                arrayList.add(obj4);
                            }
                        }
                        if (arrayList.isEmpty() || arrayList.isEmpty()) {
                            obj2 = iun.f15405a;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((hn9) it.next()).b != 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (hn9 hn9Var : arrayList) {
                                        long j = hn9Var.b;
                                        String str = hn9Var.f13339a;
                                        List<po9> list2 = hn9Var.c;
                                        String strA0 = zvw.a0(j, fn9Var.s ? "$%,d" : "%,d$");
                                        if (list2.isEmpty()) {
                                            listC = kotlin.collections.a.c(new a3s0(new n0x(""), "", str, strA0));
                                        } else {
                                            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                                            for (po9 po9Var : list2) {
                                                arrayList3.add(new a3s0(new n0x(po9Var.c), po9Var.b, str, strA0));
                                            }
                                            listC = arrayList3;
                                        }
                                        w3d.u(arrayList2, listC);
                                    }
                                    List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList2));
                                    ArrayList arrayList4 = new ArrayList(r3d.q(listL0, 10));
                                    for (Object obj5 : listL0) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            q3d.p();
                                            throw null;
                                        }
                                        a3s0 a3s0Var = (a3s0) obj5;
                                        arrayList4.add(new pat0(twn.m(i, "PRIZE_POOL"), new o8m(new m8m(i, new w8m(a3s0Var.f189a, a3s0Var.c, v8m.f36992a), a3s0Var.b, new t8m(a3s0Var.d)))));
                                        i = i2;
                                    }
                                    obj2 = arrayList4;
                                }
                            }
                            obj2 = iun.f15405a;
                        }
                    }
                }
                return obj2 == null ? iun.f15405a : obj2;
            case 4:
                ubt0 ubt0Var = (ubt0) obj;
                ubt0Var.getClass();
                j0g0 j0g0Var2 = ubt0Var.c;
                if (j0g0Var2 != null) {
                    return aem0.n(j0g0Var2.f15681a, ubt0Var.b, ubt0Var.d);
                }
                vcg0 vcg0Var = vcg0.f37186a;
                return new x8t0("UniversalChampCalendarUiModelShimmer", new bpm());
            case 5:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new bct0(sjdVar);
            case 6:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kzi0(cpVar, (byte) 28));
                return Unit.f46060a;
            case 7:
                fot0 fot0Var = (fot0) obj;
                fot0Var.getClass();
                return fot0Var.i;
            case 8:
                return Unit.f46060a;
            case 9:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                return xnm0.h(mbp0Var.c, mbp0Var.d, mbp0Var.b, mbp0Var.e, mbp0Var.g, mbp0Var.f21520a);
            case 10:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                return qim0.k(mbp0Var2.h, ucx.X(mbp0Var2.f), mbp0Var2.f21520a, mbp0Var2.k, mbp0Var2.l);
            case 11:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                return kpb.o0((bqr) feeVar2.c(), false);
            case 12:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new xzt0(wusVar);
            case 13:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 14:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new wzt0(xa30Var);
            case 15:
                return new p73(((Float) obj).floatValue());
            case 16:
                return new p73(((Integer) obj).intValue());
            case 17:
                return Integer.valueOf((int) ((p73) obj).f26486a);
            case 18:
                return new p73(((ycl) obj).f42389a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ycl(((p73) obj).f26486a);
            case 20:
                adl adlVar = (adl) obj;
                return new q73(adl.a(adlVar.f685a), adl.b(adlVar.f685a));
            case 21:
                q73 q73Var = (q73) obj;
                return new adl((((long) Float.floatToRawIntBits(q73Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(q73Var.f28229a)) << 32));
            case 22:
                h7k0 h7k0Var = (h7k0) obj;
                return new q73(Float.intBitsToFloat((int) (h7k0Var.f12579a >> 32)), Float.intBitsToFloat((int) (h7k0Var.f12579a & 4294967295L)));
            case 23:
                q73 q73Var2 = (q73) obj;
                return new h7k0((((long) Float.floatToRawIntBits(q73Var2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(q73Var2.f28229a)) << 32));
            case 24:
                ne60 ne60Var = (ne60) obj;
                return new q73(Float.intBitsToFloat((int) (ne60Var.f23370a >> 32)), Float.intBitsToFloat((int) (ne60Var.f23370a & 4294967295L)));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                q73 q73Var3 = (q73) obj;
                return new ne60((((long) Float.floatToRawIntBits(q73Var3.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(q73Var3.f28229a)) << 32));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                long j2 = ((ikx) obj).f14950a;
                return new q73((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                q73 q73Var4 = (q73) obj;
                return new ikx((((long) Math.round(q73Var4.b)) & 4294967295L) | (((long) Math.round(q73Var4.f28229a)) << 32));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                long j3 = ((qkx) obj).f28908a;
                return new q73((int) (j3 >> 32), (int) (j3 & 4294967295L));
            default:
                q73 q73Var5 = (q73) obj;
                int iRound = Math.round(q73Var5.f28229a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(q73Var5.b);
                return new qkx((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
        }
    }

    public /* synthetic */ qzs0(byte b) {
        this.f29593a = b;
    }
}
