package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ybn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdn f42347a;
    public final List b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final l9s f;

    public ybn(wdn wdnVar, List list, Set set, Set set2, Set set3, l9s l9sVar) {
        list.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        this.f42347a = wdnVar;
        this.b = list;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = l9sVar;
    }

    public static ybn a(ybn ybnVar, Set set, l9s l9sVar, int i) {
        wdn wdnVar = ybnVar.f42347a;
        List list = ybnVar.b;
        Set set2 = ybnVar.c;
        Set set3 = ybnVar.d;
        if ((i & 16) != 0) {
            set = ybnVar.e;
        }
        Set set4 = set;
        if ((i & 32) != 0) {
            l9sVar = ybnVar.f;
        }
        ybnVar.getClass();
        list.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        return new ybn(wdnVar, list, set2, set3, set4, l9sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybn)) {
            return false;
        }
        ybn ybnVar = (ybn) obj;
        return this.f42347a == ybnVar.f42347a && Intrinsics.d(this.b, ybnVar.b) && Intrinsics.d(this.c, ybnVar.c) && Intrinsics.d(this.d, ybnVar.d) && Intrinsics.d(this.e, ybnVar.e) && Intrinsics.d(this.f, ybnVar.f);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.e, ohs0.g(this.d, ohs0.g(this.c, dw9.a(this.f42347a.hashCode() * 31, 31, this.b), 31), 31), 31);
        l9s l9sVar = this.f;
        return iG + (l9sVar == null ? 0 : l9sVar.hashCode());
    }

    public final String toString() {
        return "DuelBuilderStateModel(teamType=" + this.f42347a + ", availablePlayers=" + this.b + ", unavailablePlayerIds=" + this.c + ", initialTeamPlayerIds=" + this.d + ", selectedPlayerIds=" + this.e + ", gameDetailsModel=" + this.f + Separators.RPAREN;
    }
}
