package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class shh0 implements vhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32212a;
    public final String b;
    public final boolean c;

    public shh0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f32212a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shh0)) {
            return false;
        }
        shh0 shh0Var = (shh0) obj;
        return Intrinsics.d(this.f32212a, shh0Var.f32212a) && Intrinsics.d(this.b, shh0Var.b) && this.c == shh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f32212a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ShowSearch(searchText=", this.f32212a, ", searchHint=", this.b, ", showKeyboardOnStart="), this.c, Separators.RPAREN);
    }
}
