package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kz50 implements nz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19139a;

    public kz50(Object obj) {
        this.f19139a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz50) && Intrinsics.d(this.f19139a, ((kz50) obj).f19139a);
    }

    public final int hashCode() {
        Object obj = this.f19139a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f19139a, "Content(data=", Separators.RPAREN);
    }
}
