package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gph implements hph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11684a;
    public final String b;

    public gph(String str, String str2) {
        str.getClass();
        this.f11684a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gph)) {
            return false;
        }
        gph gphVar = (gph) obj;
        return Intrinsics.d(this.f11684a, gphVar.f11684a) && this.b.equals(gphVar.b);
    }

    @Override // a.hph
    public final String getTitle() {
        return this.f11684a;
    }

    @Override // a.hph
    public final String getValue() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11684a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Text(title=", this.f11684a, ", value=", this.b, Separators.RPAREN);
    }
}
