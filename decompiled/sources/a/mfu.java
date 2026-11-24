package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f21712a;
    public final k7u b;
    public final pru c;
    public final ywu d;
    public final es e;
    public final nr f;
    public final abu g;
    public final wgu h;
    public final htt i;

    public mfu(mii0 mii0Var, k7u k7uVar, pru pruVar, ywu ywuVar, es esVar, nr nrVar, abu abuVar, wgu wguVar, htt httVar) {
        k7uVar.getClass();
        wguVar.getClass();
        this.f21712a = mii0Var;
        this.b = k7uVar;
        this.c = pruVar;
        this.d = ywuVar;
        this.e = esVar;
        this.f = nrVar;
        this.g = abuVar;
        this.h = wguVar;
        this.i = httVar;
    }

    public static int a(List list) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h0w) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(xnm0.k((h0w) it.next())));
        }
        if (arrayList2.size() != 1 || (num = (Integer) CollectionsKt.firstOrNull(arrayList2)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final lhf0 b(xa7 xa7Var) {
        return new lhf0(new gst(), new u47((Object) this.f21712a, (Object) xa7Var, (yje) null, (byte) 0));
    }
}
