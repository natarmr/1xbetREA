package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class skc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32339a;
    public final String b;

    public skc(int i, String str) {
        str.getClass();
        this.f32339a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skc)) {
            return false;
        }
        skc skcVar = (skc) obj;
        return this.f32339a == skcVar.f32339a && Intrinsics.d(this.b, skcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f32339a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f32339a, "CityModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
