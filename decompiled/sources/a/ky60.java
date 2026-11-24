package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ky60 extends ly60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urs f19094a;

    public ky60(urs ursVar) {
        this.f19094a = ursVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky60) && this.f19094a == ((ky60) obj).f19094a;
    }

    public final int hashCode() {
        return this.f19094a.hashCode();
    }

    public final String toString() {
        return "OnSortRadioButtonClicked(sortBy=" + this.f19094a + Separators.RPAREN;
    }
}
