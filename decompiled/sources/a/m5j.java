package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21222a;

    public m5j(List list) {
        list.getClass();
        this.f21222a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5j) && Intrinsics.d(this.f21222a, ((m5j) obj).f21222a);
    }

    public final int hashCode() {
        return this.f21222a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21222a, "DailyTasksRulesState(rulesParagraphs=", Separators.RPAREN);
    }
}
