package a;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r5 implements iys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29861a;
    public final yt00 b;

    public r5(eu00 eu00Var) {
        eu00Var.getClass();
        this.b = new yt00(eu00Var, new o5(this, (byte) 1), new w0((Object) this, (byte) 4));
    }

    public abstract Collection a();

    public wsy d() {
        return f2o.c(c2o.g, new String[0]);
    }

    public gfk0 e() {
        return gfk0.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iys0) && obj.hashCode() == hashCode()) {
            iys0 iys0Var = (iys0) obj;
            if (iys0Var.getParameters().size() == getParameters().size()) {
                foc focVarN = n();
                foc focVarN2 = iys0Var.n();
                if (focVarN2 == null || f2o.f(focVarN) || oek.n(focVarN) || f2o.f(focVarN2) || oek.n(focVarN2)) {
                    return false;
                }
                return h(focVarN2);
            }
        }
        return false;
    }

    @Override // a.iys0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List b() {
        return ((q5) this.b.invoke()).b;
    }

    public abstract boolean h(foc focVar);

    public final int hashCode() {
        int i = this.f29861a;
        if (i != 0) {
            return i;
        }
        foc focVarN = n();
        int iIdentityHashCode = (f2o.f(focVarN) || oek.n(focVarN)) ? System.identityHashCode(this) : oek.f(focVarN).f34663a.hashCode();
        this.f29861a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List i(List list) {
        list.getClass();
        return list;
    }
}
