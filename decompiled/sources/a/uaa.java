package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35319a;
    public final saa b;

    public uaa(String str, saa saaVar) {
        str.getClass();
        this.f35319a = str;
        this.b = saaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaa)) {
            return false;
        }
        uaa uaaVar = (uaa) obj;
        return Intrinsics.d(this.f35319a, uaaVar.f35319a) && this.b == uaaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35319a.hashCode() * 31);
    }

    public final String toString() {
        return "ZoneModel(value=" + this.f35319a + ", status=" + this.b + Separators.RPAREN;
    }
}
