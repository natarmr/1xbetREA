package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13844a;

    public hy5(boolean z) {
        this.f13844a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy5) && this.f13844a == ((hy5) obj).f13844a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13844a);
    }

    public final String toString() {
        return defpackage.c.d("BlockBetCommand(block=", Separators.RPAREN, this.f13844a);
    }
}
