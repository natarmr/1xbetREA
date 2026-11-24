package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class irl implements krl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15262a;
    public final String b;

    public irl(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f15262a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irl)) {
            return false;
        }
        irl irlVar = (irl) obj;
        return Intrinsics.d(this.f15262a, irlVar.f15262a) && Intrinsics.d(this.b, irlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15262a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Content(title=", this.f15262a, ", caption=", this.b, Separators.RPAREN);
    }
}
