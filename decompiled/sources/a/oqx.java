package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class oqx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rou f25710a;
    public final iqt b;
    public final pqx c;
    public final yri0 d;

    public oqx(rou rouVar, iqt iqtVar, pqx pqxVar, yri0 yri0Var) {
        pqxVar.getClass();
        yri0Var.getClass();
        this.f25710a = rouVar;
        this.b = iqtVar;
        this.c = pqxVar;
        this.d = yri0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List list, zje zjeVar) {
        nqx nqxVar;
        List list2;
        Object objA;
        Long lT0;
        long jLongValue;
        Iterator it;
        Object objA2;
        wne wneVar;
        Object objU;
        if (zjeVar instanceof nqx) {
            nqxVar = (nqx) zjeVar;
            int i = nqxVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqxVar.l = i - Integer.MIN_VALUE;
            } else {
                nqxVar = new nqx(this, zjeVar);
            }
        } else {
            nqxVar = new nqx(this, zjeVar);
        }
        Object obj = nqxVar.j;
        wne wneVar2 = wne.f39444a;
        int i2 = nqxVar.l;
        yri0 yri0Var = this.d;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                List list3 = nqxVar.i;
                z1x.P(obj);
                objA = obj;
                list2 = list3;
                lT0 = StringsKt.t0(((m2c0) objA).c);
                if (lT0 != null) {
                    jLongValue = lT0.longValue();
                } else {
                    jLongValue = 0;
                }
                if (list2 == null || !list2.isEmpty()) {
                    it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                    } while (((Number) it.next()).longValue() != jLongValue);
                } else {
                    z = false;
                    break;
                }
                nqxVar.i = null;
                nqxVar.l = 2;
                objA2 = yri0Var.f43123a.g.A(z, nqxVar);
                wneVar = wne.f39444a;
                if (objA2 != wneVar) {
                    objA2 = Unit.f46060a;
                }
                if (objA2 != wneVar) {
                    objA2 = Unit.f46060a;
                }
                if (objA2 != wneVar2) {
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            nqxVar.i = null;
            nqxVar.l = 4;
            objU = this.c.f27438a.g.u(nqxVar);
            if (objU != wneVar2) {
                return objU;
            }
        } else {
            z1x.P(obj);
            if (this.b.f15225a.a()) {
                list2 = list;
                nqxVar.i = list2;
                nqxVar.l = 1;
                objA = this.f25710a.a(false, nqxVar);
                if (objA != wneVar2) {
                    lT0 = StringsKt.t0(((m2c0) objA).c);
                    if (lT0 != null) {
                        jLongValue = lT0.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (list2 == null) {
                        it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                        } while (((Number) it.next()).longValue() != jLongValue);
                    } else {
                        it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                        } while (((Number) it.next()).longValue() != jLongValue);
                    }
                    nqxVar.i = null;
                    nqxVar.l = 2;
                    objA2 = yri0Var.f43123a.g.A(z, nqxVar);
                    wneVar = wne.f39444a;
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar2) {
                        nqxVar.i = null;
                        nqxVar.l = 4;
                        objU = this.c.f27438a.g.u(nqxVar);
                        if (objU != wneVar2) {
                            return objU;
                        }
                    }
                }
            } else {
                nqxVar.i = null;
                nqxVar.l = 3;
                Object objA3 = yri0Var.f43123a.g.A(false, nqxVar);
                if (objA3 != wneVar2) {
                    objA3 = Unit.f46060a;
                }
                if (objA3 != wneVar2) {
                    objA3 = Unit.f46060a;
                }
                if (objA3 != wneVar2) {
                    nqxVar.i = null;
                    nqxVar.l = 4;
                    objU = this.c.f27438a.g.u(nqxVar);
                    if (objU != wneVar2) {
                        return objU;
                    }
                }
            }
        }
        return wneVar2;
    }
}
