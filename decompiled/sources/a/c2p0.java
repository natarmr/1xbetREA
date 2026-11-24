package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3636a;
    public final String b;
    public final String c;
    public final List d;

    public c2p0(List list, String str, String str2, String str3) {
        str.getClass();
        list.getClass();
        this.f3636a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2p0)) {
            return false;
        }
        c2p0 c2p0Var = (c2p0) obj;
        return Intrinsics.d(this.f3636a, c2p0Var.f3636a) && this.b.equals(c2p0Var.b) && this.c.equals(c2p0Var.c) && Intrinsics.d(this.d, c2p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f3636a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", subTeams=", Separators.RPAREN, b1j.n("TeamBetStatisticTeamModel(id=", this.f3636a, ", title=", this.b, ", image="), this.d);
    }
}
