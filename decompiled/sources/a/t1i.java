package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t1i implements u1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33168a;

    public t1i(String str) {
        str.getClass();
        this.f33168a = str;
    }

    @Override // a.u1i
    public final String a() {
        return this.f33168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1i) && Intrinsics.d(this.f33168a, ((t1i) obj).f33168a);
    }

    public final int hashCode() {
        return this.f33168a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondCommand(label=", this.f33168a, Separators.RPAREN);
    }
}
