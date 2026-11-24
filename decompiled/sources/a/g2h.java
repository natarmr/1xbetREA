package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2h f10556a;
    public final h2h b;
    public final h2h c;
    public final String d;

    public g2h(h2h h2hVar, h2h h2hVar2, h2h h2hVar3, String str) {
        str.getClass();
        this.f10556a = h2hVar;
        this.b = h2hVar2;
        this.c = h2hVar3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2h)) {
            return false;
        }
        g2h g2hVar = (g2h) obj;
        return this.f10556a.equals(g2hVar.f10556a) && this.b.equals(g2hVar.b) && this.c.equals(g2hVar.c) && Intrinsics.d(this.d, g2hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10556a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CyberLeaderboardAnalyticsCardBottomUiModel(online=" + this.f10556a + ", offline=" + this.b + ", mixed=" + this.c + ", bottomTitle=" + this.d + Separators.RPAREN;
    }
}
