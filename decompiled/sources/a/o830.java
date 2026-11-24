package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o830 implements p830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24814a;

    public o830(List list) {
        list.getClass();
        this.f24814a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o830) && Intrinsics.d(this.f24814a, ((o830) obj).f24814a);
    }

    public final int hashCode() {
        return this.f24814a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f24814a, "Paragraph(content=", Separators.RPAREN);
    }
}
