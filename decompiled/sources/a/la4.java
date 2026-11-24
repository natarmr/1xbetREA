package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class la4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19689a;

    public final boolean equals(Object obj) {
        if (obj instanceof la4) {
            return this.f19689a.equals(((la4) obj).f19689a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19689a.hashCode();
    }

    public final String toString() {
        return "OnPasswordValueChanged(value=" + ((Object) this.f19689a) + Separators.RPAREN;
    }
}
