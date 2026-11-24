package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class uvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvj0 f36352a;
    public final q4f b;
    public final boolean c;

    public uvj0(pvj0 pvj0Var, q4f q4fVar, boolean z) {
        q4fVar.getClass();
        this.f36352a = pvj0Var;
        this.b = q4fVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvj0)) {
            return false;
        }
        uvj0 uvj0Var = (uvj0) obj;
        return this.f36352a.equals(uvj0Var.f36352a) && this.b == uvj0Var.b && this.c == uvj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + vqd.b(this.b, this.f36352a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBetTabKeyModel(simpleBetState=");
        sb.append(this.f36352a);
        sb.append(", couponTypeModel=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
