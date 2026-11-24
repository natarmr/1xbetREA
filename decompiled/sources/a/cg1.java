package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cg1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final all f4291a;

    public cg1(all allVar) {
        this.f4291a = allVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg1) && this.f4291a.equals(((cg1) obj).f4291a);
    }

    public final int hashCode() {
        return this.f4291a.hashCode();
    }

    public final String toString() {
        return "GiftsBanner(uiModel=" + this.f4291a + Separators.RPAREN;
    }
}
