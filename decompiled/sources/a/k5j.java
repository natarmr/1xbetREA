package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f17723a;
    public final String b;

    public k5j(hjm hjmVar, String str) {
        str.getClass();
        this.f17723a = hjmVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5j)) {
            return false;
        }
        k5j k5jVar = (k5j) obj;
        return this.f17723a.equals(k5jVar.f17723a) && Intrinsics.d(this.b, k5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17723a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTasksRulesParagraphUiModel(headerUiModel=" + this.f17723a + ", descriptionText=" + this.b + Separators.RPAREN;
    }
}
