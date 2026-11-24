package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12930a;
    public final List b;

    public hen(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f12930a = list;
        this.b = list2;
    }

    public static hen a(hen henVar, List list, List list2, int i) {
        if ((i & 1) != 0) {
            list = henVar.f12930a;
        }
        if ((i & 2) != 0) {
            list2 = henVar.b;
        }
        list.getClass();
        list2.getClass();
        return new hen(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hen)) {
            return false;
        }
        hen henVar = (hen) obj;
        return Intrinsics.d(this.f12930a, henVar.f12930a) && Intrinsics.d(this.b, henVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12930a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DuelTeamsModel(firstTeam=", ", secondTeam=", this.f12930a, Separators.RPAREN, this.b);
    }
}
