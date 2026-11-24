package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11056a;
    public final ra10 b;
    public final boolean c;
    public final boolean d;

    public gce(String str, ra10 ra10Var, boolean z, boolean z2) {
        this.f11056a = str;
        this.b = ra10Var;
        this.c = z;
        this.d = z2;
    }

    public static gce a(gce gceVar, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = gceVar.f11056a;
        }
        ra10 ra10Var = gceVar.b;
        if ((i & 8) != 0) {
            z2 = gceVar.d;
        }
        gceVar.getClass();
        str.getClass();
        return new gce(str, ra10Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gce)) {
            return false;
        }
        gce gceVar = (gce) obj;
        return this.f11056a.equals(gceVar.f11056a) && this.b.equals(gceVar.b) && this.c == gceVar.c && this.d == gceVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f11056a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsStateModel(htmlText=");
        sb.append(this.f11056a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return ohs0.p(", isError=", Separators.RPAREN, sb, this.c, this.d);
    }
}
