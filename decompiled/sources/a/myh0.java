package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class myh0 implements iqg {
    public static final lyh0 Companion = new lyh0();
    public static final a8z[] b = {maz.a(wez.f39042a, new igh0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22603a;

    public /* synthetic */ myh0(int i, List list) {
        if ((i & 1) == 0) {
            this.f22603a = null;
        } else {
            this.f22603a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myh0) && Intrinsics.d(this.f22603a, ((myh0) obj).f22603a);
    }

    public final int hashCode() {
        List list = this.f22603a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22603a, "SekiroRoundListResponse(roundList=", Separators.RPAREN);
    }

    public myh0() {
        this.f22603a = null;
    }
}
