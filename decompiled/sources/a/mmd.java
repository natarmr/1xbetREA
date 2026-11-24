package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mmd extends qmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22031a;

    public mmd(List list) {
        list.getClass();
        this.f22031a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmd) && Intrinsics.d(this.f22031a, ((mmd) obj).f22031a);
    }

    public final int hashCode() {
        return this.f22031a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22031a, "PeriodInfoChanged(periodScoreUiModelList=", Separators.RPAREN);
    }
}
