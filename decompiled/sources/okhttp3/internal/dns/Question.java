package okhttp3.internal.dns;

import a.brm0;
import a.twn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/Question;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Question {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46162a;
    public final int b;
    public final int c;

    public Question(String str, int i, int i2) {
        str.getClass();
        this.f46162a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return Intrinsics.d(this.f46162a, question.f46162a) && this.b == question.b && this.c == question.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f46162a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Question(name=");
        sb.append(this.f46162a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", class=");
        return brm0.n(sb, this.c, ')');
    }
}
