package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108a;
    public final bml b;

    public a250(String str, bml bmlVar) {
        str.getClass();
        this.f108a = str;
        this.b = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a250)) {
            return false;
        }
        a250 a250Var = (a250) obj;
        return Intrinsics.d(this.f108a, a250Var.f108a) && this.b.equals(a250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f108a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f108a.hashCode() * 31);
    }

    public final String toString() {
        return "HorizontalGamesCarousel(key=" + this.f108a + ", model=" + this.b + Separators.RPAREN;
    }
}
