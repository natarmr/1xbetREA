package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f751a;
    public final String b;

    public aex(int i, String str) {
        str.getClass();
        this.f751a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aex)) {
            return false;
        }
        aex aexVar = (aex) obj;
        return this.f751a == aexVar.f751a && Intrinsics.d(this.b, aexVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f751a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f751a, "InningModel(order=", ", name=", this.b, Separators.RPAREN);
    }
}
