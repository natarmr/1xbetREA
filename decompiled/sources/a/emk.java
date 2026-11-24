package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class emk implements gmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8050a;
    public final String b;

    public emk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8050a = str;
        this.b = str2;
    }

    @Override // a.gmk
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emk)) {
            return false;
        }
        emk emkVar = (emk) obj;
        return Intrinsics.d(this.f8050a, emkVar.f8050a) && Intrinsics.d(this.b, emkVar.b);
    }

    @Override // a.gmk
    public final String getValue() {
        return this.f8050a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8050a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Minus(value=", this.f8050a, ", currency=", this.b, Separators.RPAREN);
    }
}
