package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class itu0 {
    public static final htu0 Companion = new htu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ftu0 f15369a;

    public /* synthetic */ itu0(int i, ftu0 ftu0Var) {
        if ((i & 1) == 0) {
            this.f15369a = null;
        } else {
            this.f15369a = ftu0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itu0) && Intrinsics.d(this.f15369a, ((itu0) obj).f15369a);
    }

    public final int hashCode() {
        ftu0 ftu0Var = this.f15369a;
        if (ftu0Var == null) {
            return 0;
        }
        return ftu0Var.hashCode();
    }

    public final String toString() {
        return "SectionWrapper(section=" + this.f15369a + Separators.RPAREN;
    }
}
