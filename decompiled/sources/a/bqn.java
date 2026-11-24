package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bqn {
    public static final aqn Companion = new aqn();
    public static final a8z[] b = {maz.a(wez.f39042a, new dcn(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3039a;

    public /* synthetic */ bqn(int i, List list) {
        if ((i & 1) == 0) {
            this.f3039a = null;
        } else {
            this.f3039a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqn) && Intrinsics.d(this.f3039a, ((bqn) obj).f3039a);
    }

    public final int hashCode() {
        List list = this.f3039a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f3039a, "EditProfileErrorFormResponse(errorResponseList=", Separators.RPAREN);
    }
}
