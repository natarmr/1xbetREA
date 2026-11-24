package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11089a;

    public gd4(String str) {
        str.getClass();
        this.f11089a = str;
    }

    public static gd4 a(String str) {
        str.getClass();
        return new gd4(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd4) && Intrinsics.d(this.f11089a, ((gd4) obj).f11089a);
    }

    public final int hashCode() {
        return this.f11089a.hashCode();
    }

    public final String toString() {
        return kng0.l("Login(login=", this.f11089a, Separators.RPAREN);
    }
}
