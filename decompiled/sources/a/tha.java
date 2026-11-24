package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33951a;
    public final List b;

    public tha(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f33951a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tha)) {
            return false;
        }
        tha thaVar = (tha) obj;
        return Intrinsics.d(this.f33951a, thaVar.f33951a) && Intrinsics.d(this.b, thaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33951a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("CardFootballTeamModel(defenders=", ", attackers=", this.f33951a, Separators.RPAREN, this.b);
    }
}
