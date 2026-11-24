package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ww7 implements cx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39874a;
    public final long b;

    public ww7(long j, ArrayList arrayList) {
        this.f39874a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww7)) {
            return false;
        }
        ww7 ww7Var = (ww7) obj;
        return this.f39874a.equals(ww7Var.f39874a) && this.b == ww7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f39874a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(marketsGroupList=" + this.f39874a + ", hiddenMarketsCount=" + this.b + Separators.RPAREN;
    }
}
