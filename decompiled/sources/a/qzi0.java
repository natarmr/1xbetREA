package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qzi0 implements szi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29580a;

    public final boolean equals(Object obj) {
        if (obj instanceof qzi0) {
            return this.f29580a == ((qzi0) obj).f29580a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29580a);
    }

    public final String toString() {
        return defpackage.c.d("NeedUpdate(value=", Separators.RPAREN, this.f29580a);
    }
}
