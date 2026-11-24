package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aaj implements haj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jaj f527a;
    public final String b;
    public final a4x c;
    public final kmo d;

    public aaj(jaj jajVar, String str, a4x a4xVar, kmo kmoVar) {
        str.getClass();
        a4xVar.getClass();
        this.f527a = jajVar;
        this.b = str;
        this.c = a4xVar;
        this.d = kmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaj)) {
            return false;
        }
        aaj aajVar = (aaj) obj;
        return this.f527a == aajVar.f527a && Intrinsics.d(this.b, aajVar.b) && Intrinsics.d(this.c, aajVar.c) && Intrinsics.d(this.d, aajVar.d);
    }

    @Override // a.haj
    public final jaj getType() {
        return this.f527a;
    }

    public final int hashCode() {
        int iB = cs0.b(this.c, ua80.b(this.f527a.hashCode() * 31, 31, this.b), 31);
        kmo kmoVar = this.d;
        return iB + (kmoVar == null ? 0 : kmoVar.hashCode());
    }

    public final String toString() {
        return "LastGames(type=" + this.f527a + ", header=" + this.b + ", infoList=" + this.c + ", btnUiModel=" + this.d + Separators.RPAREN;
    }
}
