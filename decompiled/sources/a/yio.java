package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42703a;
    public final String b;
    public final int c;
    public final List d;

    public yio(int i, String str, List list, boolean z) {
        list.getClass();
        this.f42703a = z;
        this.b = str;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yio)) {
            return false;
        }
        yio yioVar = (yio) obj;
        return this.f42703a == yioVar.f42703a && this.b.equals(yioVar.b) && this.c == yioVar.c && Intrinsics.d(this.d, yioVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, ua80.b(Boolean.hashCode(this.f42703a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("ExamAnswersModel(success=", ", questionsResult=", this.b, this.f42703a, ", approveTs=");
        sbQ.append(this.c);
        sbQ.append(", limitsData=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
