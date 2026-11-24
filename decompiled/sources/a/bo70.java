package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bo70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2919a;

    public bo70(boolean z) {
        this.f2919a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo70) && this.f2919a == ((bo70) obj).f2919a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2919a);
    }

    public final String toString() {
        return defpackage.c.d("ShowChangeAccountToPrimaryDialog(bonusAccount=", Separators.RPAREN, this.f2919a);
    }
}
