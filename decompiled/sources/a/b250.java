package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1840a;
    public final hkl b;

    public b250(String str, hkl hklVar) {
        str.getClass();
        this.f1840a = str;
        this.b = hklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b250)) {
            return false;
        }
        b250 b250Var = (b250) obj;
        return Intrinsics.d(this.f1840a, b250Var.f1840a) && this.b.equals(b250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f1840a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1840a.hashCode() * 31);
    }

    public final String toString() {
        return "JackpotWidget(key=" + this.f1840a + ", model=" + this.b + Separators.RPAREN;
    }
}
