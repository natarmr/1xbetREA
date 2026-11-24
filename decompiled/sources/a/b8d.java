package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class b8d {
    public static final a8d Companion = new a8d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2150a;
    public final String b;

    public /* synthetic */ b8d(int i, String str, String str2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, z7d.f43913a.getDescriptor());
            throw null;
        }
        this.f2150a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8d)) {
            return false;
        }
        b8d b8dVar = (b8d) obj;
        return Intrinsics.d(this.f2150a, b8dVar.f2150a) && Intrinsics.d(this.b, b8dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2150a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CommandDataModel(type=", this.f2150a, ", variantId=", this.b, Separators.RPAREN);
    }

    public b8d(String str) {
        str.getClass();
        this.f2150a = "SelectVariantCommand";
        this.b = str;
    }
}
