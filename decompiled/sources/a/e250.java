package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7069a;
    public final tzc0 b;

    public e250(String str, tzc0 tzc0Var) {
        str.getClass();
        this.f7069a = str;
        this.b = tzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e250)) {
            return false;
        }
        e250 e250Var = (e250) obj;
        return Intrinsics.d(this.f7069a, e250Var.f7069a) && this.b.equals(e250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f7069a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7069a.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionsCarousel(key=" + this.f7069a + ", model=" + this.b + Separators.RPAREN;
    }
}
