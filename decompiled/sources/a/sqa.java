package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32618a;

    public sqa(boolean z) {
        this.f32618a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqa) && this.f32618a == ((sqa) obj).f32618a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32618a);
    }

    public final String toString() {
        return defpackage.c.d("WindSpeedVisibilityChanged(visibility=", Separators.RPAREN, this.f32618a);
    }
}
