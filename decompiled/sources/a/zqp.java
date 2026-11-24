package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44816a;
    public final boolean b;

    public zqp(String str, boolean z) {
        str.getClass();
        this.f44816a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqp)) {
            return false;
        }
        zqp zqpVar = (zqp) obj;
        return Intrinsics.d(this.f44816a, zqpVar.f44816a) && this.b == zqpVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f44816a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("FieldPhoneCodeStateModel(value=", this.f44816a, ", isError=", this.b, Separators.RPAREN);
    }
}
