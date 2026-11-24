package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q770 implements a870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28237a;

    public q770(boolean z) {
        this.f28237a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q770) && this.f28237a == ((q770) obj).f28237a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28237a);
    }

    public final String toString() {
        return defpackage.c.d("OnGameNotFinishedDialogContinueClick(doNotShowAgainChecked=", Separators.RPAREN, this.f28237a);
    }
}
