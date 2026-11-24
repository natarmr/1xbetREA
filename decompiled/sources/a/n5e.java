package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22940a;

    public n5e(List list) {
        list.getClass();
        this.f22940a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5e) && Intrinsics.d(this.f22940a, ((n5e) obj).f22940a);
    }

    public final int hashCode() {
        return this.f22940a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22940a, "SendCameraRequestPermission(mimeTypes=", Separators.RPAREN);
    }
}
