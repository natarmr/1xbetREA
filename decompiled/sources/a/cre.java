package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cre {
    public static final cre d = new cre(0, "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4842a;
    public final String b;
    public final String c;

    public cre(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f4842a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cre)) {
            return false;
        }
        cre creVar = (cre) obj;
        return this.f4842a == creVar.f4842a && Intrinsics.d(this.b, creVar.b) && Intrinsics.d(this.c, creVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f4842a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f4842a, "CountryModel(countryId=", ", countryName=", this.b, ", countryCode="), this.c, Separators.RPAREN);
    }
}
