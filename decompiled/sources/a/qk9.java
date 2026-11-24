package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28875a;
    public final vk9 b;

    public qk9(String str, vk9 vk9Var) {
        str.getClass();
        this.f28875a = str;
        this.b = vk9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk9)) {
            return false;
        }
        qk9 qk9Var = (qk9) obj;
        return Intrinsics.d(this.f28875a, qk9Var.f28875a) && this.b.equals(qk9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28875a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarCellUiModel(value=" + this.f28875a + ", state=" + this.b + Separators.RPAREN;
    }
}
