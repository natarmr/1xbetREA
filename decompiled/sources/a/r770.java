package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r770 implements a870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29966a;

    public r770(boolean z) {
        this.f29966a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r770) && this.f29966a == ((r770) obj).f29966a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29966a);
    }

    public final String toString() {
        return defpackage.c.d("OnGameNotFinishedDialogExitClick(doNotShowAgainChecked=", Separators.RPAREN, this.f29966a);
    }
}
