package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nvs0 implements rvs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24202a;
    public final String b;

    public nvs0(Class cls, String str) {
        this.f24202a = cls;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvs0)) {
            return false;
        }
        nvs0 nvs0Var = (nvs0) obj;
        return this.f24202a.equals(nvs0Var.f24202a) && this.b.equals(nvs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24202a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(clazz=" + this.f24202a + ", errorMessage=" + this.b + Separators.RPAREN;
    }
}
