package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cwm0 implements dwm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5089a;
    public final List b;

    public cwm0(String str, List list) {
        list.getClass();
        this.f5089a = str;
        this.b = list;
    }

    @Override // a.dwm0
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwm0)) {
            return false;
        }
        cwm0 cwm0Var = (cwm0) obj;
        return this.f5089a.equals(cwm0Var.f5089a) && Intrinsics.d(this.b, cwm0Var.b);
    }

    @Override // a.dwm0
    public final String h() {
        return this.f5089a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5089a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("Main(fullScoreStr=", this.f5089a, ", periodScoreList=", this.b, Separators.RPAREN);
    }
}
