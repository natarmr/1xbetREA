package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ar10 extends br10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1322a;

    public ar10(boolean z) {
        this.f1322a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar10) && this.f1322a == ((ar10) obj).f1322a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1322a);
    }

    public final String toString() {
        return defpackage.c.d("SwitchCheckedStateChange(checked=", Separators.RPAREN, this.f1322a);
    }
}
