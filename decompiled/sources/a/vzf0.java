package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vzf0 implements wzf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38296a;
    public final String b;

    public vzf0(int i, String str) {
        str.getClass();
        this.f38296a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzf0)) {
            return false;
        }
        vzf0 vzf0Var = (vzf0) obj;
        return this.f38296a == vzf0Var.f38296a && Intrinsics.d(this.b, vzf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38296a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f38296a, "ByPhone(countryId=", ", phone=", this.b, Separators.RPAREN);
    }
}
