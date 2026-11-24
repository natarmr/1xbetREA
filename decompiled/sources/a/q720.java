package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class q720 implements r720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28228a;

    @Override // a.r720
    public final boolean a() {
        return this.f28228a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q720) {
            return this.f28228a == ((q720) obj).f28228a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28228a);
    }

    public final String toString() {
        return defpackage.c.d("Show(isMediumNoGameInfo=", Separators.RPAREN, this.f28228a);
    }
}
