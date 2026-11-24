package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class aa8 implements ba8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f513a;

    public aa8(Object obj) {
        this.f513a = obj;
    }

    @Override // a.ha8
    public final Object a() {
        return this.f513a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa8) && Intrinsics.d(this.f513a, ((aa8) obj).f513a);
    }

    public final int hashCode() {
        Object obj = this.f513a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f513a, "WithoutContent(config=", Separators.RPAREN);
    }
}
