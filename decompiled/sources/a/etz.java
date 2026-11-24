package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class etz implements vtz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8393a;
    public final String b;

    public etz(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8393a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etz)) {
            return false;
        }
        etz etzVar = (etz) obj;
        return Intrinsics.d(this.f8393a, etzVar.f8393a) && Intrinsics.d(this.b, etzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8393a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LimitsAfricaHeaderWithDescriptionUiModel(title=", this.f8393a, ", description=", this.b, Separators.RPAREN);
    }
}
