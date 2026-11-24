package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kxu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hru f19075a;
    public final gs b;
    public final hsj c;
    public final j9c d;
    public final pmi e;
    public final rou f;

    public kxu(hru hruVar, gs gsVar, hsj hsjVar, j9c j9cVar, pmi pmiVar, rou rouVar) {
        this.f19075a = hruVar;
        this.b = gsVar;
        this.c = hsjVar;
        this.d = j9cVar;
        this.e = pmiVar;
        this.f = rouVar;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x0249 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public final Object a(double d, q4f q4fVar, long j, Double d2, ozc ozcVar, zje zjeVar) throws Throwable {
        ixu ixuVar;
        ozc ozcVar2;
        Object d3;
        double d4;
        hru hruVar;
        q4f q4fVar2;
        boolean z;
        kxu kxuVar;
        kxu kxuVar2;
        long j2;
        double d5;
        wne wneVar;
        Object next;
        qvo0 qvo0Var;
        wne wneVar2;
        qvo0 qvo0Var2;
        double d6;
        long j3;
        double d7;
        double d8;
        long j4;
        int iIntValue;
        double d9;
        long j5;
        Object objA;
        long j6;
        long j7;
        Object obj;
        qvo0 qvo0Var3;
        wne wneVar3;
        int i;
        double d10;
        hru hruVar2;
        double d11;
        double d12;
        wne wneVar4;
        Serializable serializableC;
        if (zjeVar instanceof ixu) {
            ixuVar = (ixu) zjeVar;
            int i2 = ixuVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ixuVar.w = i2 - Integer.MIN_VALUE;
            } else {
                ixuVar = new ixu(this, zjeVar);
            }
        } else {
            ixuVar = new ixu(this, zjeVar);
        }
        ixu ixuVar2 = ixuVar;
        Object obj2 = ixuVar2.u;
        wne wneVar5 = wne.f39444a;
        int i3 = ixuVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                d4 = ixuVar2.j;
                z = ixuVar2.s;
                j2 = ixuVar2.q;
                d5 = ixuVar2.i;
                kxuVar = ixuVar2.p;
                kxuVar2 = (kxu) ixuVar2.o;
                hruVar = ixuVar2.n;
                ozcVar2 = ixuVar2.m;
                q4fVar2 = ixuVar2.l;
                z1x.P(obj2);
            } else {
                if (i3 == 2) {
                    long j8 = ixuVar2.r;
                    double d13 = ixuVar2.k;
                    double d14 = ixuVar2.j;
                    z = ixuVar2.s;
                    long j9 = ixuVar2.q;
                    double d15 = ixuVar2.i;
                    qvo0 qvo0Var4 = (qvo0) ixuVar2.o;
                    hru hruVar3 = ixuVar2.n;
                    z1x.P(obj2);
                    wneVar2 = wneVar5;
                    d6 = d13;
                    qvo0Var2 = qvo0Var4;
                    hruVar = hruVar3;
                    j3 = j8;
                    d8 = d15;
                    j4 = j9;
                    d7 = d14;
                    iIntValue = ((Number) obj2).intValue();
                    ixuVar2.l = null;
                    ixuVar2.m = null;
                    ixuVar2.n = hruVar;
                    ixuVar2.o = qvo0Var2;
                    ixuVar2.i = d8;
                    ixuVar2.q = j4;
                    ixuVar2.s = z;
                    ixuVar2.j = d7;
                    ixuVar2.k = d6;
                    d9 = d8;
                    j5 = j3;
                    ixuVar2.r = j5;
                    ixuVar2.t = iIntValue;
                    ixuVar2.w = 3;
                    objA = this.f.a(false, ixuVar2);
                    if (objA != wneVar2) {
                        j6 = j5;
                        j7 = j4;
                        obj = objA;
                        qvo0Var3 = qvo0Var2;
                        wneVar3 = wneVar2;
                        i = iIntValue;
                        d10 = d6;
                        hruVar2 = hruVar;
                        d11 = d7;
                        d12 = d9;
                    }
                    return wneVar2;
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        z1x.P(obj2);
                        return obj2;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = ixuVar2.t;
                long j10 = ixuVar2.r;
                double d16 = ixuVar2.k;
                double d17 = ixuVar2.j;
                z = ixuVar2.s;
                long j11 = ixuVar2.q;
                double d18 = ixuVar2.i;
                qvo0 qvo0Var5 = (qvo0) ixuVar2.o;
                hru hruVar4 = ixuVar2.n;
                z1x.P(obj2);
                obj = obj2;
                wneVar3 = wneVar5;
                d12 = d18;
                j6 = j10;
                hruVar2 = hruVar4;
                d11 = d17;
                j7 = j11;
                i = i4;
                d10 = d16;
                qvo0Var3 = qvo0Var5;
            }
            int i5 = ((m2c0) obj).F;
            ixuVar2.l = null;
            ixuVar2.m = null;
            ixuVar2.n = null;
            ixuVar2.o = null;
            ixuVar2.i = d12;
            ixuVar2.q = j7;
            ixuVar2.s = z;
            ixuVar2.w = 4;
            wneVar4 = wneVar3;
            serializableC = hruVar2.c(d11, d10, i, i5, j6, ixuVar2, qvo0Var3);
            if (serializableC == wneVar4) {
                return wneVar4;
            }
            return serializableC;
        }
        z1x.P(obj2);
        boolean z2 = this.d.c().f0 && q4fVar == q4f.c;
        double d19 = (z2 ? 2.0d : 1.0d) * d;
        ixuVar2.l = q4fVar;
        ozcVar2 = ozcVar;
        ixuVar2.m = ozcVar2;
        hru hruVar5 = this.f19075a;
        ixuVar2.n = hruVar5;
        ixuVar2.o = this;
        ixuVar2.p = this;
        ixuVar2.i = d;
        ixuVar2.q = j;
        ixuVar2.s = z2;
        ixuVar2.j = d19;
        ixuVar2.w = 1;
        if (q3d.j(q4f.f, q4f.g, q4f.j, q4f.k, q4f.m, q4f.h).contains(q4fVar)) {
            d3 = new Double(0.0d);
        } else {
            double dDoubleValue = d2 != null ? d2.doubleValue() : this.c.i();
            gs gsVar = this.b;
            int iOrdinal = ((ave) gsVar.f11805a.c).f1521a.ordinal();
            d3 = (iOrdinal == 3 || iOrdinal == 5) ? gsVar.a(dDoubleValue, ixuVar2) : new Double(dDoubleValue);
        }
        if (d3 == wneVar5) {
            return wneVar5;
        }
        boolean z3 = z2;
        obj2 = d3;
        d4 = d19;
        hruVar = hruVar5;
        q4fVar2 = q4fVar;
        z = z3;
        kxuVar = this;
        kxuVar2 = kxuVar;
        j2 = j;
        d5 = d;
        double dDoubleValue2 = ((Number) obj2).doubleValue();
        if (z) {
            wneVar = wneVar5;
            double d20 = kxuVar.d.c().e0;
            Double dValueOf = Double.valueOf(d20);
            if (d20 == 0.0d) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                dDoubleValue2 = dValueOf.doubleValue();
            }
        } else {
            wneVar = wneVar5;
            kxuVar.getClass();
        }
        kxuVar2.getClass();
        if (z) {
            dDoubleValue2 /= 2.0d;
        }
        double d21 = dDoubleValue2;
        int iOrdinal2 = q4fVar2.ordinal();
        if (iOrdinal2 == 3 || iOrdinal2 == 5) {
            c0o c0oVar = qvo0.d;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            while (true) {
                if (!y2VarH.hasNext()) {
                    next = null;
                    break;
                }
                next = y2VarH.next();
                y2 y2Var = y2VarH;
                byte b = ozcVar2.f26097a;
                Integer num = ((qvo0) next).f29396a;
                if (num != null && b == num.intValue()) {
                    break;
                }
                y2VarH = y2Var;
            }
            qvo0Var = (qvo0) next;
            if (qvo0Var == null) {
                qvo0Var = qvo0.b;
            }
        } else {
            qvo0Var = qvo0.b;
        }
        ixuVar2.l = null;
        ixuVar2.m = null;
        ixuVar2.n = hruVar;
        ixuVar2.o = qvo0Var;
        ixuVar2.p = null;
        ixuVar2.i = d5;
        ixuVar2.q = j2;
        ixuVar2.s = z;
        ixuVar2.j = d4;
        ixuVar2.k = d21;
        ixuVar2.r = j2;
        ixuVar2.w = 2;
        Serializable serializableX = this.e.x(ixuVar2);
        wneVar2 = wneVar;
        if (serializableX != wneVar2) {
            qvo0Var2 = qvo0Var;
            d6 = d21;
            obj2 = serializableX;
            j3 = j2;
            d7 = d4;
            d8 = d5;
            j4 = j3;
            iIntValue = ((Number) obj2).intValue();
            ixuVar2.l = null;
            ixuVar2.m = null;
            ixuVar2.n = hruVar;
            ixuVar2.o = qvo0Var2;
            ixuVar2.i = d8;
            ixuVar2.q = j4;
            ixuVar2.s = z;
            ixuVar2.j = d7;
            ixuVar2.k = d6;
            d9 = d8;
            j5 = j3;
            ixuVar2.r = j5;
            ixuVar2.t = iIntValue;
            ixuVar2.w = 3;
            objA = this.f.a(false, ixuVar2);
            if (objA != wneVar2) {
                j6 = j5;
                j7 = j4;
                obj = objA;
                qvo0Var3 = qvo0Var2;
                wneVar3 = wneVar2;
                i = iIntValue;
                d10 = d6;
                hruVar2 = hruVar;
                d11 = d7;
                d12 = d9;
                int i6 = ((m2c0) obj).F;
                ixuVar2.l = null;
                ixuVar2.m = null;
                ixuVar2.n = null;
                ixuVar2.o = null;
                ixuVar2.i = d12;
                ixuVar2.q = j7;
                ixuVar2.s = z;
                ixuVar2.w = 4;
                wneVar4 = wneVar3;
                serializableC = hruVar2.c(d11, d10, i, i6, j6, ixuVar2, qvo0Var3);
                if (serializableC == wneVar4) {
                    return wneVar4;
                }
                return serializableC;
            }
        }
        return wneVar2;
    }
}
