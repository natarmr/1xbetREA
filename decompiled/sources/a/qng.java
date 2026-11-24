package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29026a;
    public final len b;

    public qng(String str, len lenVar) {
        str.getClass();
        this.f29026a = str;
        this.b = lenVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qng)) {
            return false;
        }
        qng qngVar = (qng) obj;
        return Intrinsics.d(this.f29026a, qngVar.f29026a) && this.b == qngVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29026a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchDescription(description=" + this.f29026a + ", matchState=" + this.b + Separators.RPAREN;
    }
}
