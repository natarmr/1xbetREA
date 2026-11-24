package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44654a;

    public zn3(List list) {
        list.getClass();
        this.f44654a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn3) && Intrinsics.d(this.f44654a, ((zn3) obj).f44654a);
    }

    public final int hashCode() {
        return this.f44654a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44654a, "AppUpdateWhatsNewStateModel(rules=", Separators.RPAREN);
    }
}
