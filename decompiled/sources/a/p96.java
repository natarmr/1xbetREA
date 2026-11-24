package a;

import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class p96 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f26593a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof p96);
    }

    public final int hashCode() {
        return 66665700;
    }

    public final String toString() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f26593a;
        if (copyOnWriteArrayList.size() <= 0) {
            return "FATAL";
        }
        Iterator it = copyOnWriteArrayList.iterator();
        StringBuilder sb = new StringBuilder("FATAL [ ");
        while (it.hasNext()) {
            ((p96) it.next()).getClass();
            sb.append("FATAL");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
