package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class p720 implements r720 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26485a;

    @Override // a.r720
    public final boolean a() {
        return this.f26485a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p720) {
            return this.f26485a == ((p720) obj).f26485a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26485a);
    }

    public final String toString() {
        return defpackage.c.d("Hide(isMediumNoGameInfo=", Separators.RPAREN, this.f26485a);
    }
}
