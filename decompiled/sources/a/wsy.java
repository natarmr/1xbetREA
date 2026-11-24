package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wsy implements e83, aty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39714a;

    public List J() {
        return iun.f15405a;
    }

    public ays0 K() {
        ays0.b.getClass();
        return ays0.c;
    }

    public abstract iys0 S();

    public abstract boolean U();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsy)) {
            return false;
        }
        wsy wsyVar = (wsy) obj;
        if (U() == wsyVar.U()) {
            return y9a.S(gqw0.C1, j0(), wsyVar.j0());
        }
        return false;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return k93.a(K());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f39714a;
        if (i != 0) {
            return i;
        }
        if (bdx.k0(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (U() ? 1 : 0) + ((J().hashCode() + (S().hashCode() * 31)) * 31);
        }
        this.f39714a = iHashCode;
        return iHashCode;
    }

    public abstract tft0 j0();

    public cr30 y() {
        return f2o.a(u1o.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public wsy f0(cty ctyVar) {
        return this;
    }
}
