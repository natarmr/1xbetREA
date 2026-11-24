package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class yfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42558a;

    public yfu(btt0 btt0Var) {
        btt0Var.getClass();
        this.f42558a = btt0Var;
    }

    public p6d a() {
        v8l0 v8l0Var = (v8l0) ((ani0) this.f42558a).f1155a;
        byte b = 6;
        return new p6d(new qaf0(v8l0Var.f, b), v8l0Var.e, new qos(3, (yje) null, b), (byte) 1);
    }

    public gmq b() {
        y9n0 y9n0Var = (y9n0) ((y3v) this.f42558a).b;
        return i120.W(new p6d(vtb.N(y9n0Var.f42258a), new h2c(y9n0Var.b, (byte) 22), new jgb0(3, (yje) null, (byte) 20), (byte) 1));
    }

    public nk10 c() {
        go10 go10Var = (go10) this.f42558a;
        Long lValueOf = go10Var.d;
        j5t j5tVar = go10Var.c;
        Double dValueOf = null;
        if (lValueOf == null) {
            ql5 ql5Var = j5tVar.q;
            lValueOf = ql5Var != null ? Long.valueOf(ql5Var.f28916a) : null;
        }
        if (lValueOf == null) {
            throw new ss3();
        }
        long jLongValue = lValueOf.longValue();
        Double d = go10Var.e;
        if (d == null) {
            ql5 ql5Var2 = j5tVar.q;
            if (ql5Var2 != null) {
                dValueOf = Double.valueOf(ql5Var2.b);
            }
        } else {
            dValueOf = d;
        }
        if (dValueOf != null) {
            return new nk10(dValueOf.doubleValue(), jLongValue);
        }
        throw new ss3();
    }

    public vae0 d() {
        return vtb.M(((so6) this.f42558a).b.d);
    }

    public omi0 e() {
        pmi0 pmi0Var = (pmi0) this.f42558a;
        return new omi0((qz40) ((lmi0) pmi0Var.f27236a).c.getValue(), pmi0Var, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable f(zje zjeVar) {
        jvu jvuVar;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object next;
        boolean z;
        hpn0 hpn0Var;
        z220 z220Var = (z220) this.f42558a;
        if (zjeVar instanceof jvu) {
            jvuVar = (jvu) zjeVar;
            int i = jvuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvuVar.l = i - Integer.MIN_VALUE;
            } else {
                jvuVar = new jvu(this, zjeVar);
            }
        } else {
            jvuVar = new jvu(this, zjeVar);
        }
        Object objV = jvuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jvuVar.l;
        if (i2 == 0) {
            z1x.P(objV);
            jvuVar.l = 1;
            objV = z220Var.v(jvuVar);
            if (objV != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objV);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = jvuVar.i;
            z1x.P(objV);
        }
        Iterable<hpn0> iterable = (Iterable) objV;
        arrayList = new ArrayList(r3d.q(iterable, 10));
        for (hpn0 hpn0Var2 : iterable) {
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                hpn0Var = (hpn0) next;
                if (hpn0Var.f13452a != hpn0Var2.f13452a && hpn0Var.c == hpn0Var2.c) {
                    break;
                }
            }
            if (next != null) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(hpn0.a(hpn0Var2, z));
        }
        return arrayList;
        List list2 = (List) objV;
        jvuVar.i = list2;
        jvuVar.l = 2;
        List list3 = (List) ((yvn0) z220Var.d).c.getValue();
        if (list3 != wneVar) {
            list = list2;
            objV = list3;
            Iterable<hpn0> iterable2 = (Iterable) objV;
            arrayList = new ArrayList(r3d.q(iterable2, 10));
            while (r11.hasNext()) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    hpn0Var = (hpn0) next;
                    if (hpn0Var.f13452a != hpn0Var2.f13452a) {
                    }
                }
                if (next != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(hpn0.a(hpn0Var2, z));
            }
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(LimitTypeEnum limitTypeEnum, zje zjeVar) {
        ihu ihuVar;
        if (zjeVar instanceof ihu) {
            ihuVar = (ihu) zjeVar;
            int i = ihuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ihuVar.l = i - Integer.MIN_VALUE;
            } else {
                ihuVar = new ihu(this, zjeVar);
            }
        } else {
            ihuVar = new ihu(this, zjeVar);
        }
        Object objK = ihuVar.j;
        Object obj = wne.f39444a;
        int i2 = ihuVar.l;
        if (i2 == 0) {
            z1x.P(objK);
            pzu pzuVar = (pzu) this.f42558a;
            ihuVar.i = limitTypeEnum;
            ihuVar.l = 1;
            objK = pzuVar.K(ihuVar);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            limitTypeEnum = ihuVar.i;
            z1x.P(objK);
        }
        for (Object obj2 : (Iterable) objK) {
            if (((kzz) obj2).f19172a == limitTypeEnum) {
                return obj2;
            }
        }
        v4i0.o("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(boolean z, zje zjeVar) {
        cmu cmuVar;
        if (zjeVar instanceof cmu) {
            cmuVar = (cmu) zjeVar;
            int i = cmuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmuVar.k = i - Integer.MIN_VALUE;
            } else {
                cmuVar = new cmu(this, zjeVar);
            }
        } else {
            cmuVar = new cmu(this, zjeVar);
        }
        Object objA = cmuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cmuVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            q200 q200Var = (q200) this.f42558a;
            cmuVar.k = 1;
            objA = q200Var.a(z, cmuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        LinkedHashMap linkedHashMap = ((izz) objA).f15656a;
        List list = (List) linkedHashMap.get(LimitKenyaGroupEnum.f46749a);
        List list2 = (List) linkedHashMap.get(LimitKenyaGroupEnum.b);
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((rn40) it.next()).m) {
                    arrayList.add(LimitKenyaGroupEnum.f46749a);
                    break;
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((rn40) it2.next()).m) {
                    arrayList.add(LimitKenyaGroupEnum.b);
                    break;
                }
            }
        }
        return CollectionsKt.L0(arrayList);
    }

    public List i(sff0 sff0Var) {
        List list;
        sff0Var.getClass();
        ArrayList arrayList = new ArrayList();
        hl1 hl1Var = sff0Var.b;
        if (!hl1Var.f13233a.f8987a || !hl1Var.b) {
            arrayList.add(nev0.AGGREGATOR);
        }
        q1w0 q1w0Var = sff0Var.d;
        if (!q1w0Var.f27973a.f6914a || !q1w0Var.b) {
            arrayList.add(nev0.XGAMES);
        }
        if (!sff0Var.c.b) {
            arrayList.add(nev0.CYBER);
        }
        if (!sff0Var.V) {
            arrayList.add(nev0.SEARCH);
        }
        if (!sff0Var.A) {
            arrayList.add(nev0.RESULTS);
        }
        y3v y3vVar = (y3v) ((iw20) this.f42558a).f15470a;
        try {
            String strC = ((vwb0) y3vVar.b).c("saved_section_quick_available", "");
            if (strC.length() == 0) {
                list = iun.f15405a;
            } else {
                vby vbyVar = (vby) y3vVar.c;
                vbyVar.getClass();
                list = (List) vbyVar.b(new zw3(okx.f25427a, (byte) 0), strC);
            }
        } catch (Exception unused) {
            list = iun.f15405a;
        }
        if (list.isEmpty()) {
            return CollectionsKt.D0(CollectionsKt.n0((List) y3vVar.d, CollectionsKt.P0(arrayList)), 4);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            nev0.b.getClass();
            nev0 nev0VarC = kys0.c(iIntValue);
            if (nev0VarC != null) {
                arrayList2.add(nev0VarC);
            }
        }
        return arrayList2;
    }

    public void j() {
        ((knf0) ((yk50) this.f42558a).b).getClass();
    }

    public /* synthetic */ yfu(Object obj) {
        this.f42558a = obj;
    }

    public yfu(k41 k41Var) {
        k41Var.getClass();
        this.f42558a = k41Var;
    }

    public yfu(ino inoVar) {
        inoVar.getClass();
        this.f42558a = inoVar;
    }

    public yfu(ux80 ux80Var) {
        ux80Var.getClass();
        this.f42558a = ux80Var;
    }

    public yfu(twz twzVar) {
        twzVar.getClass();
        this.f42558a = twzVar;
    }

    public yfu(q200 q200Var) {
        q200Var.getClass();
        this.f42558a = q200Var;
    }

    public yfu(go10 go10Var) {
        go10Var.getClass();
        this.f42558a = go10Var;
    }
}
