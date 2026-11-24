package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34182a;
    public final Object b;

    public tm80(Object obj, Object obj2) {
        this.f34182a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tm80)) {
            return false;
        }
        tm80 tm80Var = (tm80) obj;
        return Objects.equals(tm80Var.f34182a, this.f34182a) && Objects.equals(tm80Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.f34182a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f34182a + Separators.SP + this.b + "}";
    }
}
