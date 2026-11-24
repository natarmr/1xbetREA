package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41691a;

    public xy5(boolean z) {
        this.f41691a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy5) && this.f41691a == ((xy5) obj).f41691a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41691a);
    }

    public final String toString() {
        return defpackage.c.d("ShowUnfinishedGameDialogCommand(show=", Separators.RPAREN, this.f41691a);
    }
}
