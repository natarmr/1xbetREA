package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2990a;
    public final String b;
    public final String c;

    public bpl(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f2990a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpl)) {
            return false;
        }
        bpl bplVar = (bpl) obj;
        return Intrinsics.d(this.f2990a, bplVar.f2990a) && this.b.equals(bplVar.b) && Intrinsics.d(this.c, bplVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f2990a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("DsAggregatorSocialNetworksItemUiModel(link=", this.f2990a, ", title=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
