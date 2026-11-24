package a;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class udq implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((sdq) obj).c, ((sdq) obj2).c);
    }
}
