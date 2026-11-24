package a;

import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class upp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f36078a = q3d.j(new ima0(24, R.string.players), new hma0(25, R.string.lol_statistic_kills));

    public static final boolean a(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f8h f8hVar = (f8h) it.next();
            if (f8hVar.d.c.length() == 0 || f8hVar.j.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
