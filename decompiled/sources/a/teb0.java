package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class teb0 implements web0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4t f33812a;

    public teb0(y4t y4tVar) {
        this.f33812a = y4tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teb0) && this.f33812a == ((teb0) obj).f33812a;
    }

    public final int hashCode() {
        return this.f33812a.hashCode();
    }

    public final String toString() {
        return "Category(categoryType=" + this.f33812a + Separators.RPAREN;
    }
}
