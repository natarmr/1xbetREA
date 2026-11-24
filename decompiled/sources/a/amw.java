package a;

import android.widget.HorizontalScrollView;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class amw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1126a = new HashMap();

    public final void a(String str, HorizontalScrollView horizontalScrollView) {
        horizontalScrollView.getClass();
        HashMap map = this.f1126a;
        boolean zContainsKey = map.containsKey(str);
        boolean z = map.get(str) != null;
        if (!zContainsKey) {
            map.put(str, null);
        } else if (z) {
            Pair pair = (Pair) map.get(str);
            if (pair == null) {
                pair = new Pair(0, 0);
            }
            tl60.a(horizontalScrollView, new zlw(horizontalScrollView, horizontalScrollView, ((Number) pair.f46059a).intValue(), ((Number) pair.b).intValue()));
        }
    }

    public final void b(String str, HorizontalScrollView horizontalScrollView) {
        horizontalScrollView.getClass();
        HashMap map = this.f1126a;
        if (map.containsKey(str)) {
            map.put(str, new Pair(Integer.valueOf(horizontalScrollView.getScrollX()), Integer.valueOf(horizontalScrollView.getScrollY())));
        }
    }
}
