package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class r48 {
    public static final q48 Companion = new q48();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new os7(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29823a;
    public final List b;

    public /* synthetic */ r48(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f29823a = null;
        } else {
            this.f29823a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r48)) {
            return false;
        }
        r48 r48Var = (r48) obj;
        return Intrinsics.d(this.f29823a, r48Var.f29823a) && Intrinsics.d(this.b, r48Var.b);
    }

    public final int hashCode() {
        String str = this.f29823a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("BiographyResponse(title=", this.f29823a, ", paragraphs=", this.b, Separators.RPAREN);
    }
}
