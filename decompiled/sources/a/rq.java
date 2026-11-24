package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f30909a;
    public final chf0 b;

    public /* synthetic */ rq(g45 g45Var, chf0 chf0Var) {
        this.f30909a = g45Var;
        this.b = chf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, zje zjeVar) {
        rtt rttVar;
        hf6 hf6Var;
        float fFloatValue;
        double dDoubleValue;
        float f;
        if (zjeVar instanceof rtt) {
            rttVar = (rtt) zjeVar;
            int i2 = rttVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rttVar.n = i2 - Integer.MIN_VALUE;
            } else {
                rttVar = new rtt(this, zjeVar);
            }
        } else {
            rttVar = new rtt(this, zjeVar);
        }
        Object objC = rttVar.l;
        Object obj = wne.f39444a;
        int i3 = rttVar.n;
        double dQ = 0.0d;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                i = rttVar.i;
                hf6Var = rttVar.j;
                z1x.P(objC);
            } else {
                if (i3 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f = rttVar.k;
                z1x.P(objC);
            }
            dDoubleValue = ((Number) objC).doubleValue();
            fFloatValue = f;
            pn40 pn40Var = pn40.f27267a;
            dQ = pn40.q(dDoubleValue * ((double) fFloatValue));
            return new Double(dQ);
        }
        z1x.P(objC);
        g45 g45Var = this.f30909a;
        q4f q4fVar = ((ave) g45Var.c).f1521a;
        if (q4fVar != q4f.m) {
            g0f g0fVar = ((lye) g45Var.f10647a).f20858a;
            if (i == 0 || q4fVar != q4f.h) {
                dQ = g0fVar.e;
            } else {
                hf6Var = (hf6) CollectionsKt.W(i - 1, g0fVar.b);
                if (hf6Var != null) {
                    List list = hf6Var.c;
                    rttVar.j = hf6Var;
                    rttVar.i = i;
                    rttVar.n = 1;
                    objC = this.b.C(list, rttVar);
                    if (objC != obj) {
                    }
                    return obj;
                }
            }
        } else {
            loop2: for (Object obj3 : ((m0f) g45Var.b).f20951a) {
                List list2 = ((g0f) obj3).b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((hf6) it.next()).f12958a == i) {
                            obj2 = obj3;
                            break loop2;
                        }
                    }
                }
            }
            g0f g0fVar2 = (g0f) obj2;
            if (g0fVar2 != null) {
                dQ = g0fVar2.e / (g0fVar2.t ? 2.0d : 1.0d);
            }
        }
        return new Double(dQ);
        Iterable iterable = (Iterable) objC;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Float fJ = kotlin.text.b.j(((qu6) it2.next()).s);
            arrayList.add(new Float(fJ != null ? fJ.floatValue() : 0.0f));
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            v4i0.p("Empty collection can't be reduced.");
            return null;
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = new Float(((Number) next).floatValue() * ((Number) it3.next()).floatValue());
        }
        fFloatValue = ((Number) next).floatValue();
        dDoubleValue = hf6Var.d;
        if (dDoubleValue <= 0.0d) {
            rttVar.j = null;
            rttVar.i = i;
            rttVar.k = fFloatValue;
            rttVar.n = 2;
            Object objA = a(i - 1, rttVar);
            if (objA != obj) {
                objC = objA;
                f = fFloatValue;
                dDoubleValue = ((Number) objC).doubleValue();
                fFloatValue = f;
            }
            return obj;
        }
        pn40 pn40Var2 = pn40.f27267a;
        dQ = pn40.q(dDoubleValue * ((double) fFloatValue));
        return new Double(dQ);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object b(long j, zje zjeVar) {
        qq qqVar;
        long j2;
        Object next;
        tg7 tg7Var;
        chf0 chf0Var;
        Object objR;
        long j3;
        long j4;
        String str;
        String strConcat;
        qu6 qu6Var;
        yje yjeVar;
        ou6 ou6Var;
        if (zjeVar instanceof qq) {
            qqVar = (qq) zjeVar;
            int i = qqVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqVar.n = i - Integer.MIN_VALUE;
            } else {
                qqVar = new qq(this, zjeVar);
            }
        } else {
            qqVar = new qq(this, zjeVar);
        }
        qq qqVar2 = qqVar;
        Object objD = qqVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = qqVar2.n;
        chf0 chf0Var2 = this.b;
        if (i2 == 0) {
            z1x.P(objD);
            j2 = j;
            qqVar2.i = j2;
            qqVar2.n = 1;
            objD = chf0Var2.D(qqVar2);
            if (objD != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            j2 = qqVar2.i;
            z1x.P(objD);
        } else if (i2 == 2) {
            j4 = qqVar2.j;
            j3 = qqVar2.i;
            tg7Var = qqVar2.k;
            z1x.P(objD);
            chf0Var = chf0Var2;
            objR = objD;
            if (!((Boolean) objR).booleanValue()) {
                tg7Var.getClass();
                str = tg7Var.k;
                String str2 = tg7Var.h;
                long j5 = tg7Var.f33895a;
                long j6 = tg7Var.b;
                long j7 = tg7Var.v;
                long j8 = tg7Var.c;
                String str3 = tg7Var.w;
                strConcat = " - ".concat(str);
                if (str.length() <= 0) {
                    strConcat = null;
                }
                if (strConcat == null) {
                    strConcat = "";
                }
                qu6Var = new qu6(0L, j5, j6, j7, j8, str3, str2.concat(strConcat), tg7Var.f, tg7Var.g, str2, tg7Var.i, tg7Var.j, str, "", "", tg7Var.l, tg7Var.m, 0L, String.valueOf(tg7Var.o), tg7Var.u, new tv6("", tg7Var.e, tg7Var.n, "", tg7Var.q), tg7Var.r, tg7Var.s, tg7Var.t, yfa0.INSTANCE, gwe.COUPON_FAVORITE, 0, tg7Var.x, 0.0d, "", q4f.b.a(), new ic9(0, 0, 0, uyc.IDLE));
                yjeVar = null;
                qqVar2.k = null;
                qqVar2.i = j3;
                qqVar2.j = j4;
                qqVar2.n = 3;
                ou6Var = (ou6) chf0Var.c;
                if (sj3.w0(qqVar2, ou6Var.f25862a, new mu6(ou6Var, i120.f0(qu6Var, (vby) chf0Var.b), yjeVar, (byte) 0), false, true) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return Unit.f46060a;
        long jLongValue = ((Number) objD).longValue();
        if (jLongValue <= 1) {
            lye lyeVar = (lye) this.f30909a.f10647a;
            Iterator it = CollectionsKt.q0(lyeVar.e, lyeVar.f).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((tg7) next).f33895a != j2);
            tg7Var = (tg7) next;
            if (tg7Var != null) {
                long j9 = tg7Var.f33895a;
                byte b = tg7Var.s.f36034a;
                double d = tg7Var.u;
                long j10 = tg7Var.v;
                chf0Var = chf0Var2;
                long j11 = tg7Var.t;
                qqVar2.k = tg7Var;
                qqVar2.i = j2;
                qqVar2.j = jLongValue;
                qqVar2.n = 2;
                long j12 = j2;
                objR = chf0Var.r(j9, b, d, j10, j11, qqVar2);
                if (objR != wneVar) {
                    j3 = j12;
                    j4 = jLongValue;
                    if (!((Boolean) objR).booleanValue()) {
                        tg7Var.getClass();
                        str = tg7Var.k;
                        String str4 = tg7Var.h;
                        long j13 = tg7Var.f33895a;
                        long j14 = tg7Var.b;
                        long j15 = tg7Var.v;
                        long j16 = tg7Var.c;
                        String str5 = tg7Var.w;
                        strConcat = " - ".concat(str);
                        if (str.length() <= 0) {
                            strConcat = null;
                        }
                        if (strConcat == null) {
                            strConcat = "";
                        }
                        qu6Var = new qu6(0L, j13, j14, j15, j16, str5, str4.concat(strConcat), tg7Var.f, tg7Var.g, str4, tg7Var.i, tg7Var.j, str, "", "", tg7Var.l, tg7Var.m, 0L, String.valueOf(tg7Var.o), tg7Var.u, new tv6("", tg7Var.e, tg7Var.n, "", tg7Var.q), tg7Var.r, tg7Var.s, tg7Var.t, yfa0.INSTANCE, gwe.COUPON_FAVORITE, 0, tg7Var.x, 0.0d, "", q4f.b.a(), new ic9(0, 0, 0, uyc.IDLE));
                        yjeVar = null;
                        qqVar2.k = null;
                        qqVar2.i = j3;
                        qqVar2.j = j4;
                        qqVar2.n = 3;
                        ou6Var = (ou6) chf0Var.c;
                        if (sj3.w0(qqVar2, ou6Var.f25862a, new mu6(ou6Var, i120.f0(qu6Var, (vby) chf0Var.b), yjeVar, (byte) 0), false, true) == wneVar) {
                            return wneVar;
                        }
                    }
                }
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
