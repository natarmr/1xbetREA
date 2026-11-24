package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z5q implements b6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43830a;

    public z5q(String str) {
        str.getClass();
        this.f43830a = str;
    }

    @Override // a.b6q
    public final String a() {
        return this.f43830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5q) && Intrinsics.d(this.f43830a, ((z5q) obj).f43830a);
    }

    public final int hashCode() {
        return this.f43830a.hashCode();
    }

    public final String toString() {
        return kng0.l("Higher(coef=", this.f43830a, Separators.RPAREN);
    }
}
