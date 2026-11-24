package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17486a;
    public final o0u0 b;
    public final o0u0 c;
    public final List d;

    public k0u0(String str, o0u0 o0u0Var, o0u0 o0u0Var2, List list) {
        list.getClass();
        this.f17486a = str;
        this.b = o0u0Var;
        this.c = o0u0Var2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0u0)) {
            return false;
        }
        k0u0 k0u0Var = (k0u0) obj;
        return this.f17486a.equals(k0u0Var.f17486a) && this.b.equals(k0u0Var.b) && this.c.equals(k0u0Var.c) && Intrinsics.d(this.d, k0u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f17486a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ValorantStatisticMatchesMatchModel(map=" + this.f17486a + ", team1=" + this.b + ", team2=" + this.c + ", graphValues=" + this.d + Separators.RPAREN;
    }
}
