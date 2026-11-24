package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mqk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lqk f22228a;
    public final cev0 b;

    public mqk(lqk lqkVar, cev0 cev0Var) {
        this.f22228a = lqkVar;
        this.b = cev0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqk)) {
            return false;
        }
        mqk mqkVar = (mqk) obj;
        return this.f22228a.equals(mqkVar.f22228a) && this.b.equals(mqkVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HeaderContainerUiModel";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f22228a.hashCode() + 1638516255) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsEventFocusHeaderContainerUiModel(key=HeaderContainerUiModel, title=" + this.f22228a + ", widgetGroup=" + this.b + Separators.RPAREN;
    }
}
