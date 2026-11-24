package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cas {
    public static final bas Companion = new bas();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new o9s(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4027a;
    public final Integer b;
    public final List c;
    public final Boolean d;

    public /* synthetic */ cas(int i, Long l, Integer num, List list, Boolean bool) {
        if ((i & 1) == 0) {
            this.f4027a = null;
        } else {
            this.f4027a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cas)) {
            return false;
        }
        cas casVar = (cas) obj;
        return Intrinsics.d(this.f4027a, casVar.f4027a) && Intrinsics.d(this.b, casVar.b) && Intrinsics.d(this.c, casVar.c) && Intrinsics.d(this.d, casVar.d);
    }

    public final int hashCode() {
        Long l = this.f4027a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f4027a, "GameEventGroupResponse(groupId=", ", shortGroupId=", ", events=");
        sbQ.append(this.c);
        sbQ.append(", specialSign=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
