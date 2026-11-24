package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22366a;

    public final boolean equals(Object obj) {
        if (obj instanceof mte) {
            return this.f22366a == ((mte) obj).f22366a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22366a);
    }

    public final String toString() {
        return defpackage.c.d("MoveActionVisible(value=", Separators.RPAREN, this.f22366a);
    }
}
