package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o3q implements l3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24598a;
    public final String b;

    public o3q(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24598a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3q)) {
            return false;
        }
        o3q o3qVar = (o3q) obj;
        return Intrinsics.d(this.f24598a, o3qVar.f24598a) && Intrinsics.d(this.b, o3qVar.b);
    }

    @Override // a.l3q
    public final String getId() {
        return this.f24598a;
    }

    @Override // a.l3q
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24598a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("FilterModel(id=", this.f24598a, ", name=", this.b, Separators.RPAREN);
    }
}
