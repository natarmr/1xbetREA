package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d4m implements e4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5462a;
    public final String b;

    public d4m(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5462a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4m)) {
            return false;
        }
        d4m d4mVar = (d4m) obj;
        return Intrinsics.d(this.f5462a, d4mVar.f5462a) && Intrinsics.d(this.b, d4mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5462a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TitleWithSubtitle(subtitle=", this.f5462a, ", title=", this.b, Separators.RPAREN);
    }
}
