package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dbx extends fbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5823a;
    public final String b;

    public dbx(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5823a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbx)) {
            return false;
        }
        dbx dbxVar = (dbx) obj;
        return Intrinsics.d(this.f5823a, dbxVar.f5823a) && Intrinsics.d(this.b, dbxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5823a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LinkState(url=", this.f5823a, ", webToken=", this.b, Separators.RPAREN);
    }
}
