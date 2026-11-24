package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v09 implements y09 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzb0 f36570a;

    public v09(uzb0 uzb0Var) {
        this.f36570a = uzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v09) && this.f36570a == ((v09) obj).f36570a;
    }

    public final int hashCode() {
        return this.f36570a.hashCode();
    }

    public final String toString() {
        return "OnSortTypeSelect(sortType=" + this.f36570a + Separators.RPAREN;
    }
}
