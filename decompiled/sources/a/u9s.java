package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35298a;
    public final Long b;
    public final Boolean c;

    public u9s(ArrayList arrayList, Long l, Boolean bool) {
        this.f35298a = arrayList;
        this.b = l;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9s)) {
            return false;
        }
        u9s u9sVar = (u9s) obj;
        return Intrinsics.d(this.f35298a, u9sVar.f35298a) && Intrinsics.d(this.b, u9sVar.b) && Intrinsics.d(this.c, u9sVar.c);
    }

    public final int hashCode() {
        List list = this.f35298a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameEventBetGroupModel(eventsBets=");
        sb.append(this.f35298a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", specialSign=");
        return defpackage.c.e(sb, this.c, Separators.RPAREN);
    }
}
