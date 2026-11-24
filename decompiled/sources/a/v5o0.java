package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class v5o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36835a;
    public final ArrayList b;

    public v5o0(int i, ArrayList arrayList) {
        this.f36835a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5o0)) {
            return false;
        }
        v5o0 v5o0Var = (v5o0) obj;
        return this.f36835a == v5o0Var.f36835a && this.b.equals(v5o0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "FOOTBALL_KEY";
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(this.f36835a, -2020942029, 31);
    }

    public final String toString() {
        return "SyntheticFootballStatisticHeaderUiModel(key=FOOTBALL_KEY, background=" + this.f36835a + ", timeInfoList=" + this.b + Separators.RPAREN;
    }
}
