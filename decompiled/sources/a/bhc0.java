package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bhc0 implements chc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2599a;

    public bhc0(List list) {
        list.getClass();
        this.f2599a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhc0) && Intrinsics.d(this.f2599a, ((bhc0) obj).f2599a);
    }

    public final int hashCode() {
        return this.f2599a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2599a, "Success(promoCodeUiModels=", Separators.RPAREN);
    }
}
