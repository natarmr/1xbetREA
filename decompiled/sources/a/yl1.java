package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yl1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42818a;
    public final String b;

    public yl1(String str, String str2) {
        str.getClass();
        this.f42818a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl1)) {
            return false;
        }
        yl1 yl1Var = (yl1) obj;
        return Intrinsics.d(this.f42818a, yl1Var.f42818a) && this.b.equals(yl1Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(this.f42818a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b1j.k("BrandInfoScreen(title=", this.f42818a, ", description=", this.b, ", showNavBar=true)");
    }
}
