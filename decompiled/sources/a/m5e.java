package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21215a;

    public m5e(List list) {
        list.getClass();
        this.f21215a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5e) && Intrinsics.d(this.f21215a, ((m5e) obj).f21215a);
    }

    public final int hashCode() {
        return this.f21215a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21215a, "OpenGallery(mimeTypes=", Separators.RPAREN);
    }
}
