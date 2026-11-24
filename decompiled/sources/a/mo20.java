package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mo20 extends d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22115a;
    public final Object b;

    public /* synthetic */ mo20(Object obj, byte b) {
        this.f22115a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f22115a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f22115a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // a.d4
    public final int b() {
        byte b = this.f22115a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((jo20) obj).i;
            case 1:
                return ((gh90) obj).g;
            case 2:
                return ((hh90) obj).f;
            default:
                return ((vh90) obj).d.c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.f22115a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jo20) obj).clear();
                break;
            case 1:
                ((gh90) obj).clear();
                break;
            case 2:
                ((hh90) obj).clear();
                break;
            default:
                ((vh90) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f22115a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((jo20) obj2).containsValue(obj);
            case 1:
                return ((gh90) obj2).containsValue(obj);
            case 2:
                return ((hh90) obj2).containsValue(obj);
            default:
                return ((vh90) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f22115a) {
            case 0:
                return ((jo20) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f22115a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new go20((jo20) obj, (byte) 2);
            case 1:
                gh90 gh90Var = (gh90) obj;
                pqs0[] pqs0VarArr = new pqs0[8];
                while (i < 8) {
                    pqs0VarArr[i] = new qqs0((byte) 2);
                    i++;
                }
                return new mh90(gh90Var, pqs0VarArr);
            case 2:
                hh90 hh90Var = (hh90) obj;
                pqs0[] pqs0VarArr2 = new pqs0[8];
                while (i < 8) {
                    pqs0VarArr2[i] = new rqs0((byte) 2);
                    i++;
                }
                return new nh90(hh90Var, pqs0VarArr2);
            default:
                return new wh90((vh90) obj, (byte) 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f22115a) {
            case 0:
                jo20 jo20Var = (jo20) this.b;
                jo20Var.d();
                int iJ = jo20Var.j(obj);
                if (iJ < 0) {
                    return false;
                }
                jo20Var.m(iJ);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f22115a) {
            case 0:
                collection.getClass();
                ((jo20) this.b).d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f22115a) {
            case 0:
                collection.getClass();
                ((jo20) this.b).d();
                break;
        }
        return super.retainAll(collection);
    }
}
