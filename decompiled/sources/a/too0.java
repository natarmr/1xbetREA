package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class too0 implements uoo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34295a;
    public final String b;

    public too0(String str, String str2) {
        str2.getClass();
        this.f34295a = str;
        this.b = str2;
    }

    @Override // a.uoo0
    public final String a() {
        return this.f34295a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof too0)) {
            return false;
        }
        too0 too0Var = (too0) obj;
        return this.f34295a.equals(too0Var.f34295a) && Intrinsics.d(this.b, too0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34295a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Title(tagKey=", this.f34295a, ", title=", this.b, Separators.RPAREN);
    }
}
