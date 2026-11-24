package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lh90 extends g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20043a;
    public final hh90 b;

    public /* synthetic */ lh90(hh90 hh90Var, byte b) {
        this.f20043a = b;
        this.b = hh90Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f20043a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // a.g4
    public final int b() {
        byte b = this.f20043a;
        hh90 hh90Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return hh90Var.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f20043a;
        hh90 hh90Var = this.b;
        switch (b) {
            case 0:
                hh90Var.clear();
                break;
            default:
                hh90Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f20043a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    hh90 hh90Var = this.b;
                    Object obj2 = hh90Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && hh90Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f20043a;
        hh90 hh90Var = this.b;
        switch (b) {
            case 0:
                return new s3d(hh90Var);
            default:
                pqs0[] pqs0VarArr = new pqs0[8];
                for (int i = 0; i < 8; i++) {
                    pqs0VarArr[i] = new rqs0((byte) 1);
                }
                return new nh90(hh90Var, pqs0VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f20043a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                hh90 hh90Var = this.b;
                if (!hh90Var.containsKey(obj)) {
                    return false;
                }
                hh90Var.remove(obj);
                return true;
        }
    }
}
