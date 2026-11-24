package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7h0 f26835a;
    public final g1w0 b;
    public final bjk c;
    public final pu4 d;
    public final List e;
    public final List f;

    public pe50(m7h0 m7h0Var, g1w0 g1w0Var, bjk bjkVar, pu4 pu4Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f26835a = m7h0Var;
        this.b = g1w0Var;
        this.c = bjkVar;
        this.d = pu4Var;
        this.e = list;
        this.f = list2;
    }

    public static pe50 a(pe50 pe50Var, m7h0 m7h0Var, g1w0 g1w0Var, bjk bjkVar, pu4 pu4Var, List list, List list2, int i) {
        if ((i & 1) != 0) {
            m7h0Var = pe50Var.f26835a;
        }
        m7h0 m7h0Var2 = m7h0Var;
        if ((i & 2) != 0) {
            g1w0Var = pe50Var.b;
        }
        g1w0 g1w0Var2 = g1w0Var;
        if ((i & 4) != 0) {
            bjkVar = pe50Var.c;
        }
        bjk bjkVar2 = bjkVar;
        if ((i & 8) != 0) {
            pu4Var = pe50Var.d;
        }
        pu4 pu4Var2 = pu4Var;
        if ((i & 16) != 0) {
            list = pe50Var.e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = pe50Var.f;
        }
        List list4 = list2;
        pe50Var.getClass();
        bjkVar2.getClass();
        list3.getClass();
        list4.getClass();
        return new pe50(m7h0Var2, g1w0Var2, bjkVar2, pu4Var2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe50)) {
            return false;
        }
        pe50 pe50Var = (pe50) obj;
        return Intrinsics.d(this.f26835a, pe50Var.f26835a) && Intrinsics.d(this.b, pe50Var.b) && this.c.equals(pe50Var.c) && this.d.equals(pe50Var.d) && Intrinsics.d(this.e, pe50Var.e) && Intrinsics.d(this.f, pe50Var.f);
    }

    public final int hashCode() {
        m7h0 m7h0Var = this.f26835a;
        int iHashCode = (m7h0Var == null ? 0 : m7h0Var.hashCode()) * 31;
        g1w0 g1w0Var = this.b;
        return this.f.hashCode() + dw9.a((this.d.f27596a.hashCode() + ((this.c.hashCode() + ((iHashCode + (g1w0Var != null ? g1w0Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationContext(requiredAuthScreen=");
        sb.append(this.f26835a);
        sb.append(", pendingCommand=");
        sb.append(this.b);
        sb.append(", dialogParams=");
        sb.append(this.c);
        sb.append(", auth=");
        sb.append(this.d);
        sb.append(", authSuccessCommands=");
        return kng0.n(", postAuthCommands=", Separators.RPAREN, sb, this.e, this.f);
    }
}
