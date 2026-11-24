package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class kpt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqe f18690a;

    public /* synthetic */ kpt(uqe uqeVar) {
        this.f18690a = uqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i, int i2, zje zjeVar) {
        cyt cytVar;
        if (zjeVar instanceof cyt) {
            cytVar = (cyt) zjeVar;
            int i3 = cytVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cytVar.l = i3 - Integer.MIN_VALUE;
            } else {
                cytVar = new cyt(this, zjeVar);
            }
        } else {
            cytVar = new cyt(this, zjeVar);
        }
        Object objC = cytVar.j;
        wne wneVar = wne.f39444a;
        int i4 = cytVar.l;
        if (i4 == 0) {
            z1x.P(objC);
            cytVar.i = i2;
            cytVar.l = 1;
            objC = this.f18690a.c(i, cytVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = cytVar.i;
            z1x.P(objC);
        }
        Iterable iterable = (Iterable) objC;
        ArrayList<rue0> arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x1x.T((glt) it.next(), uue0.c, i2));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (rue0 rue0VarA : arrayList) {
            if (rue0VarA.c) {
                rue0VarA = rue0.a(rue0VarA);
            }
            arrayList2.add(rue0VarA);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (arrayList3.size() > 1) {
            v3d.t(new vvt((byte) 4), arrayList3);
        }
        if (arrayList3.size() > 1) {
            v3d.t(new vvt((byte) 5), arrayList3);
        }
        if (arrayList3.isEmpty()) {
            return arrayList3;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (((rue0) it2.next()).e) {
                Iterator it3 = arrayList3.iterator();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    if (((rue0) it3.next()).e) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1) {
                    arrayList3.add(i6, new rue0(0L, null, false, null, true, 207));
                }
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (!((rue0) it4.next()).e) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1) {
                    arrayList3.add(i5, new rue0(0L, null, false, null, false, 207));
                }
                return CollectionsKt.L0(arrayList3);
            }
        }
        return arrayList3;
    }
}
