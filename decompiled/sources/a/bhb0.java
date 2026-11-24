package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bhb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhb0 f2597a;
    public final String b;

    public bhb0(jhb0 jhb0Var, String str) {
        jhb0Var.getClass();
        this.f2597a = jhb0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhb0)) {
            return false;
        }
        bhb0 bhb0Var = (bhb0) obj;
        return this.f2597a == bhb0Var.f2597a && this.b.equals(bhb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2597a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularPersonalizationModel(type=" + this.f2597a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
