package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18570a;

    public kn70(boolean z) {
        this.f18570a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn70) && this.f18570a == ((kn70) obj).f18570a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18570a);
    }

    public final String toString() {
        return defpackage.c.d("UiState(showMenu=", Separators.RPAREN, this.f18570a);
    }
}
