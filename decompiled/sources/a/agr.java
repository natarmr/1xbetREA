package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class agr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f838a;
    public final String b;

    public agr(String str, String str2) {
        str.getClass();
        this.f838a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agr)) {
            return false;
        }
        agr agrVar = (agr) obj;
        return Intrinsics.d(this.f838a, agrVar.f838a) && this.b.equals(agrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f838a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GPWebAppEvent(eventName=", this.f838a, ", script=", this.b, Separators.RPAREN);
    }
}
