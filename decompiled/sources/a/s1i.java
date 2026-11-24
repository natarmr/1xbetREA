package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s1i implements u1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31456a;

    public s1i(String str) {
        str.getClass();
        this.f31456a = str;
    }

    @Override // a.u1i
    public final String a() {
        return this.f31456a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1i) && Intrinsics.d(this.f31456a, ((s1i) obj).f31456a);
    }

    public final int hashCode() {
        return this.f31456a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstCommand(label=", this.f31456a, Separators.RPAREN);
    }
}
