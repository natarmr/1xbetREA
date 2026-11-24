package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37610a;
    public final yag b;

    public vl9(String str, yag yagVar) {
        str.getClass();
        this.f37610a = str;
        this.b = yagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl9)) {
            return false;
        }
        vl9 vl9Var = (vl9) obj;
        return Intrinsics.d(this.f37610a, vl9Var.f37610a) && this.b == vl9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37610a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarSegmentedControlPageUiModel(title=" + this.f37610a + ", calendarType=" + this.b + Separators.RPAREN;
    }
}
