package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fpn implements hpn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9936a;
    public final String b;

    public fpn(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9936a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpn)) {
            return false;
        }
        fpn fpnVar = (fpn) obj;
        return Intrinsics.d(this.f9936a, fpnVar.f9936a) && Intrinsics.d(this.b, fpnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9936a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowHelperBottomSheet(title=", this.f9936a, ", description=", this.b, Separators.RPAREN);
    }
}
