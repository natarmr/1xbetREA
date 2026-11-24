package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class reu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30354a;
    public final Object b;

    public reu(b3c0 b3c0Var) {
        this.f30354a = (byte) 11;
        b3c0Var.getClass();
        this.b = b3c0Var;
    }

    public eu4 a() {
        return new eu4(((qj9) this.b).b(), (byte) 15);
    }

    public p7m0 b() {
        return ((n730) this.b).f23022a.f17290a;
    }

    public nwo0 c() {
        nwo0 nwo0Var = ((ovo0) ((dgu) this.b).b).b;
        return nwo0Var == null ? new nwo0("", false, true) : nwo0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(q7f0 q7f0Var, zje zjeVar) {
        fru fruVar;
        if (zjeVar instanceof fru) {
            fruVar = (fru) zjeVar;
            int i = fruVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fruVar.l = i - Integer.MIN_VALUE;
            } else {
                fruVar = new fru(this, zjeVar);
            }
        } else {
            fruVar = new fru(this, zjeVar);
        }
        Object objD = fruVar.j;
        wne wneVar = wne.f39444a;
        int i2 = fruVar.l;
        if (i2 == 0) {
            z1x.P(objD);
            hru hruVar = (hru) this.b;
            fruVar.i = q7f0Var;
            fruVar.l = 1;
            objD = hruVar.d(q7f0Var, fruVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q7f0Var = fruVar.i;
            z1x.P(objD);
        }
        List list = (List) objD;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.addAll(list);
        if (q7f0Var == q7f0.REGULATOR) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof p0f0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                lc00VarB.add(new p0f0(true, true));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof j0f0) {
                arrayList2.add(obj2);
            }
        }
        if (((j0f0) CollectionsKt.firstOrNull(arrayList2)) == null) {
            lc00VarB.add(new hze0(true, false));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(int i, zje zjeVar, String str, boolean z) {
        dlu dluVar;
        if (zjeVar instanceof dlu) {
            dluVar = (dlu) zjeVar;
            int i2 = dluVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dluVar.k = i2 - Integer.MIN_VALUE;
            } else {
                dluVar = new dlu(this, zjeVar);
            }
        } else {
            dluVar = new dlu(this, zjeVar);
        }
        Object objK = dluVar.i;
        wne wneVar = wne.f39444a;
        int i3 = dluVar.k;
        if (i3 == 0) {
            z1x.P(objK);
            z220 z220Var = (z220) this.b;
            dluVar.k = 1;
            objK = z220Var.k(i, dluVar, str, z);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        return l8x.v0((kgb) objK);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(zje zjeVar) {
        dmu dmuVar;
        if (zjeVar instanceof dmu) {
            dmuVar = (dmu) zjeVar;
            int i = dmuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmuVar.k = i - Integer.MIN_VALUE;
            } else {
                dmuVar = new dmu(this, zjeVar);
            }
        } else {
            dmuVar = new dmu(this, zjeVar);
        }
        Object objB = dmuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dmuVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            r200 r200Var = (r200) this.b;
            dmuVar.k = 1;
            objB = r200Var.b(true, dmuVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        jzz jzzVar = (jzz) objB;
        LinkedHashMap linkedHashMap = jzzVar.f17437a;
        LinkedHashMap linkedHashMap2 = jzzVar.b;
        List list = (List) linkedHashMap.get(LimitNeGroupEnum.BET_LIMITS);
        List list2 = (List) linkedHashMap.get(LimitNeGroupEnum.DEPOSIT_LIMITS);
        List list3 = (List) linkedHashMap2.get(LimitNeGroupEnum.SESSION_TIME_LIMITS);
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((sn40) it.next()).h) {
                    arrayList.add(LimitNeGroupEnum.BET_LIMITS);
                    break;
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((sn40) it2.next()).h) {
                    arrayList.add(LimitNeGroupEnum.DEPOSIT_LIMITS);
                    break;
                }
            }
        }
        if (list3 != null && !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (((riq0) it3.next()).h) {
                    arrayList.add(LimitNeGroupEnum.SESSION_TIME_LIMITS);
                    break;
                }
            }
        }
        return CollectionsKt.L0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, zje zjeVar) {
        o6v o6vVar;
        if (zjeVar instanceof o6v) {
            o6vVar = (o6v) zjeVar;
            int i = o6vVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6vVar.l = i - Integer.MIN_VALUE;
            } else {
                o6vVar = new o6v(this, zjeVar);
            }
        } else {
            o6vVar = new o6v(this, zjeVar);
        }
        Object objE = o6vVar.j;
        wne wneVar = wne.f39444a;
        int i2 = o6vVar.l;
        if (i2 == 0) {
            z1x.P(objE);
            a6u a6uVar = (a6u) this.b;
            o6vVar.i = str;
            o6vVar.l = 1;
            objE = a6uVar.E(true, o6vVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = o6vVar.i;
            z1x.P(objE);
        }
        if (StringsKt.W(str)) {
            throw new ss3();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(objE);
        sb.append((Object) str);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public Object h(String str, zje zjeVar) {
        qeu qeuVar;
        f3v f3vVar;
        byte b = this.f30354a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (zjeVar instanceof qeu) {
                    qeuVar = (qeu) zjeVar;
                    int i = qeuVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qeuVar.k = i - Integer.MIN_VALUE;
                    } else {
                        qeuVar = new qeu(this, zjeVar);
                    }
                } else {
                    qeuVar = new qeu(this, zjeVar);
                }
                Object obj2 = qeuVar.i;
                wne wneVar = wne.f39444a;
                int i2 = qeuVar.k;
                if (i2 == 0) {
                    z1x.P(obj2);
                    qeuVar.k = 1;
                    Object objA = ((nov) obj).a(str, qeuVar);
                    return objA == wneVar ? wneVar : objA;
                }
                if (i2 == 1) {
                    z1x.P(obj2);
                    return ((j0g0) obj2).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (zjeVar instanceof f3v) {
                    f3vVar = (f3v) zjeVar;
                    int i3 = f3vVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f3vVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        f3vVar = new f3v(this, zjeVar);
                    }
                } else {
                    f3vVar = new f3v(this, zjeVar);
                }
                Object obj3 = f3vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = f3vVar.k;
                if (i4 == 0) {
                    z1x.P(obj3);
                    f3vVar.k = 1;
                    Object objA2 = ((p5t0) obj).a(str, f3vVar);
                    return objA2 == wneVar2 ? wneVar2 : objA2;
                }
                if (i4 == 1) {
                    z1x.P(obj3);
                    return ((j0g0) obj3).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public reu(njg njgVar) {
        this.f30354a = (byte) 3;
        njgVar.getClass();
        this.b = njgVar;
    }

    public reu(nov novVar) {
        this.f30354a = (byte) 0;
        novVar.getClass();
        this.b = novVar;
    }

    public /* synthetic */ reu(Object obj, byte b) {
        this.f30354a = b;
        this.b = obj;
    }

    public reu(p5t0 p5t0Var) {
        this.f30354a = (byte) 23;
        p5t0Var.getClass();
        this.b = p5t0Var;
    }

    public reu(r200 r200Var) {
        this.f30354a = (byte) 6;
        r200Var.getClass();
        this.b = r200Var;
    }

    public reu(d5m0 d5m0Var) {
        this.f30354a = (byte) 17;
        d5m0Var.getClass();
        this.b = d5m0Var;
    }

    public reu(n730 n730Var) {
        this.f30354a = (byte) 4;
        n730Var.getClass();
        this.b = n730Var;
    }

    public reu(qj9 qj9Var) {
        this.f30354a = (byte) 24;
        qj9Var.getClass();
        this.b = qj9Var;
    }
}
