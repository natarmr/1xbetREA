package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pn70 extends qn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27273a;

    public pn70(boolean z) {
        this.f27273a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn70) && this.f27273a == ((pn70) obj).f27273a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27273a);
    }

    public final String toString() {
        return defpackage.c.d("StartGameCommand(autoSpin=", Separators.RPAREN, this.f27273a);
    }
}
