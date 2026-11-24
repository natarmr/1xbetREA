package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e4j implements g4j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tll f7184a;

    public e4j(tll tllVar) {
        this.f7184a = tllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4j) && this.f7184a.equals(((e4j) obj).f7184a);
    }

    public final int hashCode() {
        return this.f7184a.hashCode();
    }

    public final String toString() {
        return "Content(aggregatorDailyMissionsWidgetUiModel=" + this.f7184a + Separators.RPAREN;
    }
}
