package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dwt0 {
    public static final cwt0 Companion = new cwt0();
    public static final a8z[] b = {maz.a(wez.f39042a, new tht0(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6815a;

    public /* synthetic */ dwt0(int i, List list) {
        if ((i & 1) == 0) {
            this.f6815a = null;
        } else {
            this.f6815a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwt0) && Intrinsics.d(this.f6815a, ((dwt0) obj).f6815a);
    }

    public final int hashCode() {
        List list = this.f6815a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6815a, "VKUserResponse(response=", Separators.RPAREN);
    }
}
