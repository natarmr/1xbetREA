package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class uou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nou f36030a;
    public final pru b;
    public final qgd c;

    public uou(nou nouVar, pru pruVar, qgd qgdVar) {
        this.f36030a = nouVar;
        this.b = pruVar;
        this.c = qgdVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[LOOP:0: B:30:0x00a3->B:32:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        tou touVar;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        List listD0;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objJ;
        int i3;
        boolean z7;
        boolean z8;
        boolean z9;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof tou) {
            touVar = (tou) zjeVar;
            int i4 = touVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                touVar.o = i4 - Integer.MIN_VALUE;
            } else {
                touVar = new tou(this, zjeVar);
            }
        } else {
            touVar = new tou(this, zjeVar);
        }
        Object obj = touVar.m;
        wne wneVar = wne.f39444a;
        int i5 = touVar.o;
        if (i5 != 0) {
            if (i5 == 1) {
                z2 = touVar.k;
                z3 = touVar.j;
                z = touVar.i;
                z1x.P(obj);
            } else {
                if (i5 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = touVar.l;
                z7 = touVar.k;
                z8 = touVar.j;
                z9 = touVar.i;
                z1x.P(obj);
            }
            Iterable iterable = (Iterable) obj;
            arrayList = new ArrayList(r3d.q(iterable, 10));
            it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((asc0) it.next()).c);
            }
            i2 = i3;
            listD0 = CollectionsKt.D0(r3d.r(arrayList), 6);
            z6 = z9;
            z4 = z7;
            z5 = z8;
            return new dic0(i2, listD0, z6, z5, z4);
        }
        z1x.P(obj);
        toc0 toc0Var = this.b.a().l;
        z = toc0Var.c;
        boolean z10 = toc0Var.e;
        boolean z11 = toc0Var.f;
        if (!z) {
            z2 = z11;
            i = 0;
            z3 = z10;
            if (z2) {
                touVar.i = z;
                touVar.j = z3;
                touVar.k = z2;
                touVar.l = i;
                touVar.o = 2;
                objJ = this.c.J((2 & 1) != 0, null, touVar);
                if (objJ != wneVar) {
                    int i6 = i;
                    obj = objJ;
                    i3 = i6;
                    z7 = z2;
                    z8 = z3;
                    z9 = z;
                    Iterable iterable2 = (Iterable) obj;
                    arrayList = new ArrayList(r3d.q(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((asc0) it.next()).c);
                    }
                    i2 = i3;
                    listD0 = CollectionsKt.D0(r3d.r(arrayList), 6);
                    z6 = z9;
                    z4 = z7;
                    z5 = z8;
                }
            } else {
                listD0 = iun.f15405a;
                i2 = i;
                z4 = z2;
                z5 = z3;
                z6 = z;
            }
            return new dic0(i2, listD0, z6, z5, z4);
        }
        touVar.i = z;
        touVar.j = z10;
        touVar.k = z11;
        touVar.o = 1;
        Serializable serializableA = this.f36030a.a(tl5.c, touVar);
        if (serializableA != wneVar) {
            z2 = z11;
            obj = serializableA;
            z3 = z10;
        }
        return wneVar;
        i = ((ql5) obj).h;
        if (z2) {
            touVar.i = z;
            touVar.j = z3;
            touVar.k = z2;
            touVar.l = i;
            touVar.o = 2;
            objJ = this.c.J((2 & 1) != 0, null, touVar);
            if (objJ != wneVar) {
                int i7 = i;
                obj = objJ;
                i3 = i7;
                z7 = z2;
                z8 = z3;
                z9 = z;
                Iterable iterable3 = (Iterable) obj;
                arrayList = new ArrayList(r3d.q(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((asc0) it.next()).c);
                }
                i2 = i3;
                listD0 = CollectionsKt.D0(r3d.r(arrayList), 6);
                z6 = z9;
                z4 = z7;
                z5 = z8;
            }
            return wneVar;
        }
        listD0 = iun.f15405a;
        i2 = i;
        z4 = z2;
        z5 = z3;
        z6 = z;
        return new dic0(i2, listD0, z6, z5, z4);
    }
}
