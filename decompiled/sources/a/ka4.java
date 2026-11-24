package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ka4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17946a;

    public final boolean equals(Object obj) {
        if (obj instanceof ka4) {
            return this.f17946a.equals(((ka4) obj).f17946a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17946a.hashCode();
    }

    public final String toString() {
        return "OnLoginValueChanged(value=" + ((Object) this.f17946a) + Separators.RPAREN;
    }
}
