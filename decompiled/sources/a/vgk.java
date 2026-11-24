package a;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class vgk {
    public static final Set b = tx3.l0(new Integer[]{4, 6});
    public static final List c = q3d.j("fold", "hinge");
    public static final List d = q3d.j("felix", "sm-f9", "sm-f7", "razr", "v fold", "magic v", "pixel fold");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f37384a;

    public vgk(us00 us00Var) {
        this.f37384a = us00Var;
    }

    public static boolean a(String str) {
        List list = c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.O(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
