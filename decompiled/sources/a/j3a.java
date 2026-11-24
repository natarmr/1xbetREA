package a;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class j3a {
    public static final z04 d = o2e.Y(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15821a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final i3a a(Surface surface) {
        i3a i3aVar;
        List listL0;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.f15821a) {
            try {
                i3aVar = new i3a(this, surface);
                Integer num = (Integer) this.b.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.b.put(surface, Integer.valueOf(iIntValue));
                listL0 = iIntValue == 1 ? CollectionsKt.L0(this.c) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listL0 != null) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                ((spt0) it.next()).c(surface);
            }
        }
        return i3aVar;
    }
}
