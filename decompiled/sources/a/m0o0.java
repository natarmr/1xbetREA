package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m0o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wti f20964a;
    public final abp b;
    public final btt0 c;
    public final mne d;
    public final knf0 e;

    public m0o0(wti wtiVar, abp abpVar, btt0 btt0Var, mne mneVar, knf0 knf0Var) {
        abpVar.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f20964a = wtiVar;
        this.b = abpVar;
        this.c = btt0Var;
        this.d = mneVar;
        this.e = knf0Var;
    }

    public final void a(dbp dbpVar) {
        String str = dbpVar.e;
        abp abpVar = this.b;
        abpVar.getClass();
        abpVar.e.o(null, str);
        abpVar.f590a.o(null, new iap(dbpVar.d));
        List list = dbpVar.b;
        list.getClass();
        abpVar.b.o(null, new iap(list));
        List list2 = dbpVar.f5817a;
        list2.getClass();
        abpVar.c.o(null, new iap(list2));
        List list3 = dbpVar.c;
        list3.getClass();
        abpVar.d.o(null, new iap(list3));
    }

    public final gmq b() {
        abp abpVar = this.b;
        return i120.W(new p6d(new ji3(abp.d(abpVar.d), (byte) 4), new h2c(abpVar.h, (byte) 5), new y8p(3, null, (byte) 11), (byte) 1));
    }

    public final j7p c() throws i7p {
        List listD = this.b.f590a.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (obj instanceof iap) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((j7p) ((iap) it.next()).f14449a);
        }
        j7p j7pVar = (j7p) CollectionsKt.firstOrNull(arrayList2);
        if (j7pVar != null) {
            return j7pVar;
        }
        throw new i7p();
    }

    public final gmq d() {
        abp abpVar = this.b;
        return i120.W(new p6d(new ji3(abp.d(abpVar.b), (byte) 5), new h2c(abpVar.f, (byte) 6), new y8p(3, null, (byte) 12), (byte) 1));
    }

    public final gmq e() {
        abp abpVar = this.b;
        return i120.W(new p6d(new ji3(abp.d(abpVar.c), (byte) 6), new h2c(abpVar.g, (byte) 7), new y8p(3, null, (byte) 13), (byte) 1));
    }

    public final Object f(yje yjeVar) {
        Object objD0 = qjj.d0(this.d.b, new agn0((Object) this, (yje) null, (byte) 22), yjeVar);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
