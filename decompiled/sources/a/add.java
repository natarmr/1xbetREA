package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class add implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f673a;
    public final String b;
    public final String c;
    public final boolean d;

    public add(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.f673a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof add)) {
            return false;
        }
        add addVar = (add) obj;
        return this.f673a.equals(addVar.f673a) && this.b.equals(addVar.b) && Intrinsics.d(this.c, addVar.c) && this.d == addVar.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "COMPARE_TEAMS_ITEM_HEADER";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(ua80.b(-526785622, 31, this.f673a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", supportRtl=", Separators.RPAREN, b1j.n("CompareTeamsHeaderUiModel(key=COMPARE_TEAMS_ITEM_HEADER, firstTeamImage=", this.f673a, ", secondTeamImage=", this.b, ", teamTitle="), this.d);
    }
}
