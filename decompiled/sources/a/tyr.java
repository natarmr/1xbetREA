package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34770a;

    public tyr(boolean z) {
        this.f34770a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyr) && this.f34770a == ((tyr) obj).f34770a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34770a);
    }

    public final String toString() {
        return defpackage.c.d("BetGroup(visible=", Separators.RPAREN, this.f34770a);
    }
}
