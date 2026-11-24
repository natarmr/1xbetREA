package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lo20 extends g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20371a;
    public final Object b;

    public /* synthetic */ lo20(Object obj, byte b) {
        this.f20371a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f20371a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f20371a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // a.g4
    public final int b() {
        byte b = this.f20371a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((jo20) obj).i;
            case 1:
                return ((gh90) obj).g;
            default:
                return ((vh90) obj).d.c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f20371a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jo20) obj).clear();
                break;
            case 1:
                ((gh90) obj).clear();
                break;
            default:
                ((vh90) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.f20371a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((jo20) obj2).containsKey(obj);
            case 1:
                return ((gh90) obj2).containsKey(obj);
            default:
                return ((vh90) obj2).d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f20371a) {
            case 0:
                return ((jo20) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f20371a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new go20((jo20) obj, (byte) 1);
            case 1:
                gh90 gh90Var = (gh90) obj;
                pqs0[] pqs0VarArr = new pqs0[8];
                for (int i = 0; i < 8; i++) {
                    pqs0VarArr[i] = new qqs0((byte) 1);
                }
                return new mh90(gh90Var, pqs0VarArr);
            default:
                return new wh90((vh90) obj, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.f20371a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jo20 jo20Var = (jo20) obj2;
                jo20Var.d();
                int iH = jo20Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                jo20Var.m(iH);
                return true;
            case 1:
                gh90 gh90Var = (gh90) obj2;
                if (!gh90Var.containsKey(obj)) {
                    return false;
                }
                gh90Var.remove(obj);
                return true;
            default:
                vh90 vh90Var = (vh90) obj2;
                if (!vh90Var.d.containsKey(obj)) {
                    return false;
                }
                vh90Var.remove(obj);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f20371a) {
            case 0:
                collection.getClass();
                ((jo20) this.b).d();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f20371a) {
            case 0:
                collection.getClass();
                ((jo20) this.b).d();
                break;
        }
        return super.retainAll(collection);
    }
}
