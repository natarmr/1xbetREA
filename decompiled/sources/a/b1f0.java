package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class b1f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7f0 f1803a;
    public final ArrayList b;

    public b1f0(q7f0 q7f0Var, ArrayList arrayList) {
        this.f1803a = q7f0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1f0)) {
            return false;
        }
        b1f0 b1f0Var = (b1f0) obj;
        return this.f1803a == b1f0Var.f1803a && this.b.equals(b1f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1803a.hashCode() * 31);
    }

    public final String toString() {
        return "RegistrationFieldsByType(regType=" + this.f1803a + ", regFields=" + this.b + Separators.RPAREN;
    }
}
