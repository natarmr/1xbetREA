package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oin0 implements lin0, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25321a;

    public oin0(Object obj) {
        this.f25321a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oin0) {
            return this.f25321a.equals(((oin0) obj).f25321a);
        }
        return false;
    }

    @Override // a.lin0
    public final Object get() {
        return this.f25321a;
    }

    public final int hashCode() {
        return Objects.hash(this.f25321a);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f25321a + Separators.RPAREN;
    }
}
