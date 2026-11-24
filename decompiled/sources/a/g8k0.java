package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10868a;
    public final String b;

    public g8k0(int i, String str, String str2) {
        str2 = (i & 2) != 0 ? null : str2;
        str.getClass();
        this.f10868a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8k0)) {
            return false;
        }
        g8k0 g8k0Var = (g8k0) obj;
        return Intrinsics.d(this.f10868a, g8k0Var.f10868a) && Intrinsics.d(this.b, g8k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10868a.hashCode() * 31;
        String str = this.b;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return b1j.k("SliderLabel(text=", this.f10868a, ", currency=", this.b, ", icon=null)");
    }
}
