package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r1i implements u1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29681a;

    public r1i(String str) {
        str.getClass();
        this.f29681a = str;
    }

    @Override // a.u1i
    public final String a() {
        return this.f29681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1i) && Intrinsics.d(this.f29681a, ((r1i) obj).f29681a);
    }

    public final int hashCode() {
        return this.f29681a.hashCode();
    }

    public final String toString() {
        return kng0.l("AddToCommand(label=", this.f29681a, Separators.RPAREN);
    }
}
