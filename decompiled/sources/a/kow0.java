package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kow0 extends how0 {
    public final /* synthetic */ mow0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kow0(mow0 mow0Var) {
        super((byte) 2);
        this.g = mow0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.g.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // a.how0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return jtm0.v(this.g.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // a.hdw0
    public final eet0 j() {
        return m().listIterator(0);
    }

    @Override // a.how0
    public final cow0 o() {
        return new jow0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.d.size();
    }
}
