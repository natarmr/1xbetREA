package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class oq60 {
    public static final hq60 Companion = new hq60();
    public static final a8z[] b = {maz.a(wez.f39042a, new fq60(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25673a;

    public /* synthetic */ oq60(int i, List list) {
        if ((i & 1) == 0) {
            this.f25673a = null;
        } else {
            this.f25673a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq60) && Intrinsics.d(this.f25673a, ((oq60) obj).f25673a);
    }

    public final int hashCode() {
        List list = this.f25673a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25673a, "OneXGamesActionResponseOld(actions=", Separators.RPAREN);
    }
}
