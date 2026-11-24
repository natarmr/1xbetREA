package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ule extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35868a;

    public ule(boolean z) {
        this.f35868a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ule) && this.f35868a == ((ule) obj).f35868a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35868a);
    }

    public final String toString() {
        return defpackage.c.d("ShowChangeAccountToPrimaryDialogCommand(bonusAccount=", Separators.RPAREN, this.f35868a);
    }
}
