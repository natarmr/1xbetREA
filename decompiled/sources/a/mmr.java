package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22055a;

    public final boolean equals(Object obj) {
        if (obj instanceof mmr) {
            return this.f22055a == ((mmr) obj).f22055a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22055a);
    }

    public final String toString() {
        return defpackage.c.d("ExpandClick(isExpanded=", Separators.RPAREN, this.f22055a);
    }
}
