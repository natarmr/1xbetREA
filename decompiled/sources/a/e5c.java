package a;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dhu f7227a;
    public final wsf0 b;

    public e5c(dhu dhuVar, wsf0 wsf0Var) {
        this.f7227a = dhuVar;
        this.b = wsf0Var;
    }

    public final boolean a(List list) {
        list.getClass();
        long j = ((SharedPreferences) this.f7227a.f6108a.b.f20589a).getLong("OneXGamesBalanceLocalDataSource.BALANCE_ID_KEY", 0L);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ql5) it.next()).f28916a));
        }
        if (j <= 0 || arrayList.contains(Long.valueOf(j))) {
            return false;
        }
        return !arrayList.contains(Long.valueOf(((g45) this.b.b).F().f41388a.p(bm5.d)));
    }
}
