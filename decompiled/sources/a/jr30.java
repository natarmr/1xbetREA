package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jr30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16983a;
    public final Map b;

    public jr30(String str, Map map) {
        this.f16983a = str;
        this.b = aac.f0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr30)) {
            return false;
        }
        jr30 jr30Var = (jr30) obj;
        return Intrinsics.d(this.f16983a, jr30Var.f16983a) && Intrinsics.d(this.b, jr30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16983a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f16983a + ", extras=" + this.b + Separators.RPAREN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jr30(String str) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this(str, lunVar);
    }
}
