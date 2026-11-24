package a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class m8c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final biu f21363a;
    public final syu b;

    public m8c(biu biuVar, syu syuVar) {
        this.f21363a = biuVar;
        this.b = syuVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(double d, zje zjeVar) {
        e8c e8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        double d3;
        Double d4;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof e8c) {
            e8cVar = (e8c) zjeVar;
            int i = e8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e8cVar.l = i - Integer.MIN_VALUE;
            } else {
                e8cVar = new e8c(this, zjeVar);
            }
        } else {
            e8cVar = new e8c(this, zjeVar);
        }
        e8c e8cVar2 = e8cVar;
        Object objA = e8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = e8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            e8cVar2.i = d2;
            e8cVar2.l = 1;
            objA = this.f21363a.a(false, true, false, false, false, e8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = e8cVar2.i;
            z1x.P(objA);
            d2 = d5;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.BET_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != ge7.BET_LIMIT_7_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        ge7 ge7Var = ge7.BET_LIMIT_7_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(ge7Var);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MAX_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MAX_VALUE : l2.longValue();
        Double d6 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d6, 0.0d)) {
            d6 = null;
        }
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : Double.MAX_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != ge7.BET_LIMIT_30_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(ge7.BET_LIMIT_30_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MAX_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MAX_VALUE : l.longValue();
        if (sn40Var2 != null) {
            d4 = new Double(sn40Var2.g);
            d3 = 0.0d;
        } else {
            d3 = 0.0d;
            d4 = null;
        }
        if (Intrinsics.c(d4, d3)) {
            d4 = null;
        }
        return Boolean.valueOf(d2 < dDoubleValue && d2 < dLongValue && d2 < dDoubleValue2 && d2 < dDoubleValue3 && d2 < dLongValue2 && d2 < (d4 != null ? d4.doubleValue() : Double.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(double d, zje zjeVar) {
        f8c f8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        double d3;
        Double d4;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof f8c) {
            f8cVar = (f8c) zjeVar;
            int i = f8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f8cVar.l = i - Integer.MIN_VALUE;
            } else {
                f8cVar = new f8c(this, zjeVar);
            }
        } else {
            f8cVar = new f8c(this, zjeVar);
        }
        f8c f8cVar2 = f8cVar;
        Object objA = f8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = f8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            f8cVar2.i = d2;
            f8cVar2.l = 1;
            objA = this.f21363a.a(false, true, false, false, false, f8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = f8cVar2.i;
            z1x.P(objA);
            d2 = d5;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.BET_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != ge7.BET_LIMIT_1_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        ge7 ge7Var = ge7.BET_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(ge7Var);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d6 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d6, 0.0d)) {
            d6 = null;
        }
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != ge7.BET_LIMIT_7_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(ge7.BET_LIMIT_7_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MIN_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MIN_VALUE : l.longValue();
        if (sn40Var2 != null) {
            d4 = new Double(sn40Var2.g);
            d3 = 0.0d;
        } else {
            d3 = 0.0d;
            d4 = null;
        }
        if (Intrinsics.c(d4, d3)) {
            d4 = null;
        }
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 > dDoubleValue3 && d2 > dLongValue2 && d2 > (d4 != null ? d4.doubleValue() : Double.MIN_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(double d, zje zjeVar) {
        g8c g8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof g8c) {
            g8cVar = (g8c) zjeVar;
            int i = g8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8cVar.l = i - Integer.MIN_VALUE;
            } else {
                g8cVar = new g8c(this, zjeVar);
            }
        } else {
            g8cVar = new g8c(this, zjeVar);
        }
        g8c g8cVar2 = g8cVar;
        Object objA = g8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = g8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            g8cVar2.i = d2;
            g8cVar2.l = 1;
            objA = this.f21363a.a(false, true, false, false, false, g8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d3 = g8cVar2.i;
            z1x.P(objA);
            d2 = d3;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.BET_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != ge7.BET_LIMIT_1_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        ge7 ge7Var = ge7.BET_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(ge7Var);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d4 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d4, 0.0d)) {
            d4 = null;
        }
        double dDoubleValue2 = d4 != null ? d4.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != ge7.BET_LIMIT_30_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(ge7.BET_LIMIT_30_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MAX_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MAX_VALUE : l.longValue();
        Double d5 = sn40Var2 != null ? new Double(sn40Var2.g) : null;
        if (Intrinsics.c(d5, 0.0d)) {
            d5 = null;
        }
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 < dDoubleValue3 && d2 < dLongValue2 && d2 < (d5 != null ? d5.doubleValue() : Double.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(double d, zje zjeVar) {
        h8c h8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        double d3;
        Double d4;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof h8c) {
            h8cVar = (h8c) zjeVar;
            int i = h8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8cVar.l = i - Integer.MIN_VALUE;
            } else {
                h8cVar = new h8c(this, zjeVar);
            }
        } else {
            h8cVar = new h8c(this, zjeVar);
        }
        h8c h8cVar2 = h8cVar;
        Object objA = h8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = h8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            h8cVar2.i = d2;
            h8cVar2.l = 1;
            objA = this.f21363a.a(false, false, true, false, false, h8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = h8cVar2.i;
            z1x.P(objA);
            d2 = d5;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.DEPOSIT_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != o7k.DEPOSIT_LIMIT_7_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        o7k o7kVar = o7k.DEPOSIT_LIMIT_7_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(o7kVar);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MAX_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MAX_VALUE : l2.longValue();
        Double d6 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d6, 0.0d)) {
            d6 = null;
        }
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : Double.MAX_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != o7k.DEPOSIT_LIMIT_30_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(o7k.DEPOSIT_LIMIT_30_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MAX_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MAX_VALUE : l.longValue();
        if (sn40Var2 != null) {
            d4 = new Double(sn40Var2.g);
            d3 = 0.0d;
        } else {
            d3 = 0.0d;
            d4 = null;
        }
        if (Intrinsics.c(d4, d3)) {
            d4 = null;
        }
        return Boolean.valueOf(d2 < dDoubleValue && d2 < dLongValue && d2 < dDoubleValue2 && d2 < dDoubleValue3 && d2 < dLongValue2 && d2 < (d4 != null ? d4.doubleValue() : Double.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(double d, zje zjeVar) {
        i8c i8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        double d3;
        Double d4;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof i8c) {
            i8cVar = (i8c) zjeVar;
            int i = i8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8cVar.l = i - Integer.MIN_VALUE;
            } else {
                i8cVar = new i8c(this, zjeVar);
            }
        } else {
            i8cVar = new i8c(this, zjeVar);
        }
        i8c i8cVar2 = i8cVar;
        Object objA = i8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = i8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            i8cVar2.i = d2;
            i8cVar2.l = 1;
            objA = this.f21363a.a(false, false, true, false, false, i8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = i8cVar2.i;
            z1x.P(objA);
            d2 = d5;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.DEPOSIT_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != o7k.DEPOSIT_LIMIT_1_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        o7k o7kVar = o7k.DEPOSIT_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(o7kVar);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d6 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d6, 0.0d)) {
            d6 = null;
        }
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != o7k.DEPOSIT_LIMIT_7_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(o7k.DEPOSIT_LIMIT_7_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MIN_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MIN_VALUE : l.longValue();
        if (sn40Var2 != null) {
            d4 = new Double(sn40Var2.g);
            d3 = 0.0d;
        } else {
            d3 = 0.0d;
            d4 = null;
        }
        if (Intrinsics.c(d4, d3)) {
            d4 = null;
        }
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 > dDoubleValue3 && d2 > dLongValue2 && d2 > (d4 != null ? d4.doubleValue() : Double.MIN_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object f(double d, zje zjeVar) {
        j8c j8cVar;
        double d2;
        sn40 sn40Var;
        sn40 sn40Var2;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof j8c) {
            j8cVar = (j8c) zjeVar;
            int i = j8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                j8cVar.l = i - Integer.MIN_VALUE;
            } else {
                j8cVar = new j8c(this, zjeVar);
            }
        } else {
            j8cVar = new j8c(this, zjeVar);
        }
        j8c j8cVar2 = j8cVar;
        Object objA = j8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = j8cVar2.l;
        if (i2 == 0) {
            z1x.P(objA);
            d2 = d;
            j8cVar2.i = d2;
            j8cVar2.l = 1;
            objA = this.f21363a.a(false, false, true, false, false, j8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d3 = j8cVar2.i;
            z1x.P(objA);
            d2 = d3;
        }
        List list = (List) ((jzz) objA).f17437a.get(LimitNeGroupEnum.DEPOSIT_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sn40) next2).b != o7k.DEPOSIT_LIMIT_1_DAY);
            sn40Var = (sn40) next2;
        } else {
            sn40Var = null;
        }
        o7k o7kVar = o7k.DEPOSIT_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(o7kVar);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (sn40Var == null || (l2 = sn40Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d4 = sn40Var != null ? new Double(sn40Var.g) : null;
        if (Intrinsics.c(d4, 0.0d)) {
            d4 = null;
        }
        double dDoubleValue2 = d4 != null ? d4.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((sn40) next).b != o7k.DEPOSIT_LIMIT_30_DAY);
            sn40Var2 = (sn40) next;
        } else {
            sn40Var2 = null;
        }
        Double dA2 = syuVar.a(o7k.DEPOSIT_LIMIT_30_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() : Double.MAX_VALUE;
        double dLongValue2 = (sn40Var2 == null || (l = sn40Var2.i) == null) ? Double.MAX_VALUE : l.longValue();
        Double d5 = sn40Var2 != null ? new Double(sn40Var2.g) : null;
        if (Intrinsics.c(d5, 0.0d)) {
            d5 = null;
        }
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 < dDoubleValue3 && d2 < dLongValue2 && d2 < (d5 != null ? d5.doubleValue() : Double.MAX_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object g(double d, zje zjeVar) {
        k8c k8cVar;
        double d2;
        riq0 riq0Var;
        double d3;
        riq0 riq0Var2;
        double d4;
        Double d5;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof k8c) {
            k8cVar = (k8c) zjeVar;
            int i = k8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8cVar.l = i - Integer.MIN_VALUE;
            } else {
                k8cVar = new k8c(this, zjeVar);
            }
        } else {
            k8cVar = new k8c(this, zjeVar);
        }
        k8c k8cVar2 = k8cVar;
        Object objA = k8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = k8cVar2.l;
        double d6 = 24.0d;
        if (i2 == 0) {
            z1x.P(objA);
            double d7 = d * 24.0d;
            k8cVar2.i = d7;
            k8cVar2.l = 1;
            objA = this.f21363a.a(false, false, false, false, true, k8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
            d2 = d7;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = k8cVar2.i;
            z1x.P(objA);
        }
        List list = (List) ((jzz) objA).b.get(LimitNeGroupEnum.SESSION_TIME_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((riq0) next2).b != oki0.SESSION_TIME_LIMIT_1_DAY);
            riq0Var = (riq0) next2;
        } else {
            riq0Var = null;
        }
        oki0 oki0Var = oki0.SESSION_TIME_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(oki0Var);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (riq0Var == null || (l2 = riq0Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d8 = riq0Var != null ? new Double(riq0Var.g) : null;
        if (Intrinsics.c(d8, 0.0d)) {
            d8 = null;
        }
        double dDoubleValue2 = d8 != null ? d8.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    d3 = d6;
                    next = null;
                    break;
                }
                next = it2.next();
                d3 = d6;
                if (((riq0) next).b == oki0.SESSION_TIME_LIMIT_7_DAY) {
                    break;
                }
                d6 = d3;
            }
            riq0Var2 = (riq0) next;
        } else {
            d3 = 24.0d;
            riq0Var2 = null;
        }
        Double dA2 = syuVar.a(oki0.SESSION_TIME_LIMIT_7_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() * d3 : Double.MIN_VALUE;
        double dLongValue2 = (riq0Var2 == null || (l = riq0Var2.i) == null) ? Double.MIN_VALUE : l.longValue();
        if (riq0Var2 != null) {
            d5 = new Double(riq0Var2.g);
            d4 = 0.0d;
        } else {
            d4 = 0.0d;
            d5 = null;
        }
        if (Intrinsics.c(d5, d4)) {
            d5 = null;
        }
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 > dDoubleValue3 && d2 > dLongValue2 && d2 > (d5 != null ? d5.doubleValue() : Double.MIN_VALUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object h(double d, zje zjeVar) {
        l8c l8cVar;
        double d2;
        riq0 riq0Var;
        double d3;
        riq0 riq0Var2;
        Long l;
        Object next;
        Long l2;
        Object next2;
        if (zjeVar instanceof l8c) {
            l8cVar = (l8c) zjeVar;
            int i = l8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8cVar.l = i - Integer.MIN_VALUE;
            } else {
                l8cVar = new l8c(this, zjeVar);
            }
        } else {
            l8cVar = new l8c(this, zjeVar);
        }
        l8c l8cVar2 = l8cVar;
        Object objA = l8cVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = l8cVar2.l;
        double d4 = 24.0d;
        if (i2 == 0) {
            z1x.P(objA);
            double d5 = d * 24.0d;
            l8cVar2.i = d5;
            l8cVar2.l = 1;
            objA = this.f21363a.a(false, false, false, false, true, l8cVar2);
            if (objA == wneVar) {
                return wneVar;
            }
            d2 = d5;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = l8cVar2.i;
            z1x.P(objA);
        }
        List list = (List) ((jzz) objA).b.get(LimitNeGroupEnum.SESSION_TIME_LIMITS);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((riq0) next2).b != oki0.SESSION_TIME_LIMIT_1_DAY);
            riq0Var = (riq0) next2;
        } else {
            riq0Var = null;
        }
        oki0 oki0Var = oki0.SESSION_TIME_LIMIT_1_DAY;
        syu syuVar = this.b;
        Double dA = syuVar.a(oki0Var);
        double dDoubleValue = dA != null ? dA.doubleValue() : Double.MIN_VALUE;
        double dLongValue = (riq0Var == null || (l2 = riq0Var.i) == null) ? Double.MIN_VALUE : l2.longValue();
        Double d6 = riq0Var != null ? new Double(riq0Var.g) : null;
        if (Intrinsics.c(d6, 0.0d)) {
            d6 = null;
        }
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : Double.MIN_VALUE;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    d3 = d4;
                    next = null;
                    break;
                }
                next = it2.next();
                d3 = d4;
                if (((riq0) next).b == oki0.SESSION_TIME_LIMIT_30_DAY) {
                    break;
                }
                d4 = d3;
            }
            riq0Var2 = (riq0) next;
        } else {
            d3 = 24.0d;
            riq0Var2 = null;
        }
        Double dA2 = syuVar.a(oki0.SESSION_TIME_LIMIT_30_DAY);
        double dDoubleValue3 = dA2 != null ? dA2.doubleValue() * d3 : Double.MAX_VALUE;
        double dLongValue2 = (riq0Var2 == null || (l = riq0Var2.i) == null) ? Double.MAX_VALUE : l.longValue();
        Double d7 = riq0Var2 != null ? new Double(riq0Var2.g) : null;
        Double d8 = Intrinsics.c(d7, 0.0d) ? null : d7;
        return Boolean.valueOf(d2 > dDoubleValue && d2 > dLongValue && d2 > dDoubleValue2 && d2 < dDoubleValue3 && d2 < dLongValue2 && d2 < (d8 != null ? d8.doubleValue() : Double.MAX_VALUE));
    }
}
