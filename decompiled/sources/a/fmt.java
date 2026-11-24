package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fmt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmu f9802a;
    public final pmi b;
    public final cdu c;
    public final ntu d;
    public final kqc e;
    public final epc f;
    public final n0o0 g;

    public fmt(jmu jmuVar, pmi pmiVar, pru pruVar, cdu cduVar, ntu ntuVar, kqc kqcVar, epc epcVar) {
        this.f9802a = jmuVar;
        this.b = pmiVar;
        this.c = cduVar;
        this.d = ntuVar;
        this.e = kqcVar;
        this.f = epcVar;
        this.g = maz.b(new hc0(pruVar, (byte) 24));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0 A[LOOP:1: B:26:0x00aa->B:31:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:39:0x00e6->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4 A[EDGE_INSN: B:54:0x00c4->B:33:0x00c4 BREAK  A[LOOP:1: B:26:0x00aa->B:31:0x00c0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        emt emtVar;
        jmu jmuVar;
        ArrayList arrayListN0;
        Iterator it;
        int i;
        Serializable serializableC;
        List list;
        int i2;
        int i3;
        if (zjeVar instanceof emt) {
            emtVar = (emt) zjeVar;
            int i4 = emtVar.m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                emtVar.m = i4 - Integer.MIN_VALUE;
            } else {
                emtVar = new emt(this, zjeVar);
            }
        } else {
            emtVar = new emt(this, zjeVar);
        }
        emt emtVar2 = emtVar;
        Object objX = emtVar2.k;
        wne wneVar = wne.f39444a;
        int i5 = emtVar2.m;
        Object obj = null;
        if (i5 == 0) {
            z1x.P(objX);
            jmuVar = this.f9802a;
            emtVar2.i = jmuVar;
            emtVar2.m = 1;
            objX = this.b.x(emtVar2);
            if (objX != wneVar) {
            }
            return wneVar;
        }
        if (i5 == 1) {
            jmuVar = (jmu) emtVar2.i;
            z1x.P(objX);
        } else {
            if (i5 == 2) {
                z1x.P(objX);
                arrayListN0 = CollectionsKt.N0((Collection) objX);
                it = arrayListN0.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    i3 = ((kr5) it.next()).b;
                    us5[] us5VarArr = us5.f36194a;
                    if (i3 == 4225) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    return arrayListN0;
                }
                emtVar2.i = arrayListN0;
                emtVar2.j = i;
                emtVar2.m = 3;
                serializableC = cdu.c(this.c, 0, this.d.a(), emtVar2, 8);
                if (serializableC != wneVar) {
                    list = arrayListN0;
                    objX = serializableC;
                    i2 = i;
                }
                return wneVar;
            }
            if (i5 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = emtVar2.j;
            list = (List) emtVar2.i;
            z1x.P(objX);
        }
        for (Object obj2 : (Iterable) objX) {
            if (((pbv) obj2).f26728a == 371) {
                obj = obj2;
                break;
            }
        }
        if (obj == null) {
            list.remove(i2);
            return list;
        }
        list.add(0, list.remove(i2));
        return list;
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.f.a().f13512a;
        boolean z2 = ((sff0) this.g.getValue()).d.b;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.e.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        emtVar2.i = null;
        emtVar2.m = 2;
        jmu jmuVar2 = jmuVar;
        objX = jmuVar2.f16782a.o(iIntValue, emtVar2, ujn.h, z, jmuVar2.b.f15748a.i(), z2, zJ);
        if (objX != wneVar) {
            arrayListN0 = CollectionsKt.N0((Collection) objX);
            it = arrayListN0.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                i3 = ((kr5) it.next()).b;
                us5[] us5VarArr2 = us5.f36194a;
                if (i3 == 4225) {
                    break;
                    break;
                }
                i++;
            }
            if (i != -1) {
                return arrayListN0;
            }
            emtVar2.i = arrayListN0;
            emtVar2.j = i;
            emtVar2.m = 3;
            serializableC = cdu.c(this.c, 0, this.d.a(), emtVar2, 8);
            if (serializableC != wneVar) {
                list = arrayListN0;
                objX = serializableC;
                i2 = i;
                while (r13.hasNext()) {
                    if (((pbv) obj2).f26728a == 371) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj == null) {
                    list.remove(i2);
                    return list;
                }
                list.add(0, list.remove(i2));
                return list;
            }
        }
        return wneVar;
    }
}
