package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gjs implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11416a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public gjs(int i, int i2, int i3, boolean z) {
        this.f11416a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        list.getClass();
        int i = this.f11416a;
        int i2 = this.b;
        long jA = p4e.a(i, i, i2, i2);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        int iE = 0;
        while (iE < size) {
            iE = w6x.e((pj30) list.get(iE), jA, arrayList, iE, 1);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i3 += ((pu90) it.next()).f27604a;
        }
        int size2 = arrayList.size() - 1;
        int i4 = this.c;
        int i5 = (size2 * i4) + i3;
        return vj30.x(vj30Var, i5, i2, new fjs(this.d, i5, arrayList, i4));
    }
}
