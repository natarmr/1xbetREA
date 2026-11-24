package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class g90 extends h90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10889a;

    public g90(boolean z) {
        this.f10889a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g90) && this.f10889a == ((g90) obj).f10889a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10889a);
    }

    public final String toString() {
        return defpackage.c.d("ShowRouletteGameField(show=", Separators.RPAREN, this.f10889a);
    }
}
