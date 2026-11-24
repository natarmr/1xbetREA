package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19450a;

    public l5e(List list) {
        list.getClass();
        this.f19450a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5e) && Intrinsics.d(this.f19450a, ((l5e) obj).f19450a);
    }

    public final int hashCode() {
        return this.f19450a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19450a, "OpenFilePicker(mimeTypes=", Separators.RPAREN);
    }
}
