package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class scs {
    public static final rcs Companion = new rcs();
    public static final a8z[] c = {maz.a(wez.f39042a, new o9s(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32002a;
    public final Long b;

    public /* synthetic */ scs(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f32002a = null;
        } else {
            this.f32002a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scs)) {
            return false;
        }
        scs scsVar = (scs) obj;
        return Intrinsics.d(this.f32002a, scsVar.f32002a) && Intrinsics.d(this.b, scsVar.b);
    }

    public final int hashCode() {
        List list = this.f32002a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "GameGroupResponse(eventsBets=" + this.f32002a + ", groupId=" + this.b + Separators.RPAREN;
    }
}
