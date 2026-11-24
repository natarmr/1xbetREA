package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ao5 implements co5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1184a;

    public final boolean equals(Object obj) {
        if (obj instanceof ao5) {
            return this.f1184a == ((ao5) obj).f1184a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1184a);
    }

    public final String toString() {
        return defpackage.c.d("AnimationEnable(value=", Separators.RPAREN, this.f1184a);
    }
}
