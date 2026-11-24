package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bj40 implements iqg {
    public static final aj40 Companion = new aj40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9h f2688a;

    static {
        s9h s9hVar = t9h.Companion;
    }

    public /* synthetic */ bj40(int i, t9h t9hVar) {
        if ((i & 1) == 0) {
            this.f2688a = null;
        } else {
            this.f2688a = t9hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj40) && Intrinsics.d(this.f2688a, ((bj40) obj).f2688a);
    }

    public final int hashCode() {
        t9h t9hVar = this.f2688a;
        if (t9hVar == null) {
            return 0;
        }
        return t9hVar.hashCode();
    }

    public final String toString() {
        return "MlbbMainStatisticResponse(mlbbStatistic=" + this.f2688a + Separators.RPAREN;
    }

    public bj40() {
        this.f2688a = null;
    }
}
