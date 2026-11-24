package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class kam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17972a;
    public final boolean b;

    public kam0(ArrayList arrayList, boolean z) {
        this.f17972a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kam0)) {
            return false;
        }
        kam0 kam0Var = (kam0) obj;
        return this.f17972a.equals(kam0Var.f17972a) && this.b == kam0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f17972a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticBlocksChangedModel(statisticBlocks=" + this.f17972a + ", changed=" + this.b + Separators.RPAREN;
    }
}
