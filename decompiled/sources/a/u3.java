package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u3 extends g4 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean e(Map.Entry entry);

    public /* bridge */ boolean f(Map.Entry entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}
