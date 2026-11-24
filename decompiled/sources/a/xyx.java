package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xyx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41727a;
    public final String b;

    public xyx(String str, String str2) {
        str2.getClass();
        this.f41727a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyx)) {
            return false;
        }
        xyx xyxVar = (xyx) obj;
        return this.f41727a.equals(xyxVar.f41727a) && Intrinsics.d(this.b, xyxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41727a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ItemUiModel(image=", this.f41727a, ", info=", this.b, Separators.RPAREN);
    }
}
