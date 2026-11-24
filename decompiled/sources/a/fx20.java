package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fx20 implements hx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10289a;

    public fx20(List list) {
        list.getClass();
        this.f10289a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx20) && Intrinsics.d(this.f10289a, ((fx20) obj).f10289a);
    }

    public final int hashCode() {
        return this.f10289a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10289a, "Content(buttons=", Separators.RPAREN);
    }
}
