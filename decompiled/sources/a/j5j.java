package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15935a;
    public final String b;

    public j5j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f15935a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5j)) {
            return false;
        }
        j5j j5jVar = (j5j) obj;
        return Intrinsics.d(this.f15935a, j5jVar.f15935a) && Intrinsics.d(this.b, j5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15935a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DailyTasksRulesParagraphModel(headerText=", this.f15935a, ", descriptionText=", this.b, Separators.RPAREN);
    }
}
