package a;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class how0 extends hdw0 implements Set {
    public static final /* synthetic */ int f = 0;
    public transient cow0 e;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof how0) && (this instanceof kpw0) && (((how0) obj) instanceof kpw0) && ((kpw0) this).h != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return jtm0.v(this);
    }

    public cow0 m() {
        cow0 cow0Var = this.e;
        if (cow0Var != null) {
            return cow0Var;
        }
        cow0 cow0VarO = o();
        this.e = cow0VarO;
        return cow0VarO;
    }

    public cow0 o() {
        Object[] array = toArray(hdw0.d);
        knw0 knw0Var = cow0.e;
        return cow0.q(array.length, array);
    }
}
