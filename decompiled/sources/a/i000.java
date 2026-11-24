package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i000 implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13928a;
    public final String b;

    public i000(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13928a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i000)) {
            return false;
        }
        i000 i000Var = (i000) obj;
        return Intrinsics.d(this.f13928a, i000Var.f13928a) && Intrinsics.d(this.b, i000Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13928a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LimitsNeHeaderWithDescriptionUiModel(title=", this.f13928a, ", description=", this.b, Separators.RPAREN);
    }
}
