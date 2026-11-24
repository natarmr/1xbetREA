package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class agp0 {
    public static final zfp0 Companion = new zfp0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ccp0(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f836a;
    public final List b;

    public /* synthetic */ agp0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f836a = null;
        } else {
            this.f836a = str;
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
        if (!(obj instanceof agp0)) {
            return false;
        }
        agp0 agp0Var = (agp0) obj;
        return Intrinsics.d(this.f836a, agp0Var.f836a) && Intrinsics.d(this.b, agp0Var.b);
    }

    public final int hashCode() {
        String str = this.f836a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("TeamMovementsResponse(teamId=", this.f836a, ", movements=", this.b, Separators.RPAREN);
    }
}
