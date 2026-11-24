package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7039a;
    public final String b;

    public e1k(String str, boolean z) {
        str.getClass();
        this.f7039a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1k)) {
            return false;
        }
        e1k e1kVar = (e1k) obj;
        return this.f7039a == e1kVar.f7039a && Intrinsics.d(this.b, e1kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f7039a) * 31);
    }

    public final String toString() {
        return ua80.k("OnEventPushSubscribeClick(isSubscribe=", this.f7039a, ", betId=", this.b, Separators.RPAREN);
    }
}
