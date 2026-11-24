package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class suh0 implements tuh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32820a;

    public suh0(List list) {
        list.getClass();
        this.f32820a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suh0) && Intrinsics.d(this.f32820a, ((suh0) obj).f32820a);
    }

    public final int hashCode() {
        return this.f32820a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f32820a, "Loading(items=", Separators.RPAREN);
    }
}
