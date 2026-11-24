package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24873a;
    private final boolean b;

    public o9c(String str, boolean z) {
        str.getClass();
        this.f24873a = str;
        this.b = z;
    }

    public static /* synthetic */ o9c copy$default(o9c o9cVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = o9cVar.f24873a;
        }
        if ((i & 2) != 0) {
            z = o9cVar.b;
        }
        return o9cVar.copy(str, z);
    }

    public final String component1() {
        return this.f24873a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final o9c copy(String str, boolean z) {
        str.getClass();
        return new o9c(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9c)) {
            return false;
        }
        o9c o9cVar = (o9c) obj;
        return Intrinsics.d(this.f24873a, o9cVar.f24873a) && this.b == o9cVar.b;
    }

    public final boolean getBanned() {
        return this.b;
    }

    public final String getDomain() {
        return this.f24873a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.b) + (this.f24873a.hashCode() * 31);
    }

    public String toString() {
        return ua80.j("CheckedDomain(domain=", this.f24873a, ", banned=", this.b, Separators.RPAREN);
    }

    public /* synthetic */ o9c(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
