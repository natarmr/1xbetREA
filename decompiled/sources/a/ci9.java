package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ci9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4400a = null;
    public int b = 0;

    public final void a() {
        this.b += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f4400a.iterator();
        while (it.hasNext()) {
            sb.append((di9) it.next());
            sb.append(' ');
        }
        sb.append('[');
        return brm0.n(sb, this.b, ']');
    }
}
