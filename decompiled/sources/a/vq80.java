package a;

import android.gov.nist.core.Separators;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class vq80 implements lr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AggregatorScreenModel f37844a;
    public final r3q b;

    public vq80(AggregatorScreenModel aggregatorScreenModel, r3q r3qVar) {
        this.f37844a = aggregatorScreenModel;
        this.b = r3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq80)) {
            return false;
        }
        vq80 vq80Var = (vq80) obj;
        return this.f37844a.equals(vq80Var.f37844a) && this.b.equals(vq80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37844a.hashCode() * 31);
    }

    public final String toString() {
        return "LaunchFilters(aggregatorScreenModel=" + this.f37844a + ", params=" + this.b + Separators.RPAREN;
    }
}
