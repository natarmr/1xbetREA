package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class g8d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10858a;
    public final sje b;
    public final gmq c;

    public g8d(List list) {
        list.getClass();
        this.f10858a = list;
        this.b = d5c.a(qem0.e());
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vw5) it.next()).c());
        }
        this.c = i120.W(new c00((gmq[]) CollectionsKt.L0(arrayList).toArray(new gmq[0]), this, (byte) 24));
    }

    public final void a(mne mneVar) {
        mneVar.getClass();
        for (vw5 vw5Var : this.f10858a) {
            if (vw5Var.c().getValue() == i8d.f14333a) {
                List listD = vw5Var.d();
                sje sjeVar = this.b;
                if (listD == null) {
                    vw5Var.a(sjeVar);
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(listD, 10));
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((vw5) it.next()).c());
                    }
                    sac.T(new zj2((gmq[]) CollectionsKt.L0(arrayList).toArray(new gmq[0]), vw5Var, this, (byte) 2), d5c.S(sjeVar, mneVar.c), d8d.h);
                }
            }
        }
    }
}
