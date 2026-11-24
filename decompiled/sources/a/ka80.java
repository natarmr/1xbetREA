package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ka80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17953a;

    public final boolean equals(Object obj) {
        if (obj instanceof ka80) {
            return this.f17953a == ((ka80) obj).f17953a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17953a);
    }

    public final String toString() {
        return defpackage.c.d("OrganicInstallModel(isOrganic=", Separators.RPAREN, this.f17953a);
    }
}
