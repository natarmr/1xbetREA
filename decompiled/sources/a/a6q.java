package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a6q implements b6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f328a;

    public a6q(String str) {
        str.getClass();
        this.f328a = str;
    }

    @Override // a.b6q
    public final String a() {
        return this.f328a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6q) && Intrinsics.d(this.f328a, ((a6q) obj).f328a);
    }

    public final int hashCode() {
        return this.f328a.hashCode();
    }

    public final String toString() {
        return kng0.l("Lower(coef=", this.f328a, Separators.RPAREN);
    }
}
