package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ldk0 implements ndk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrm f19855a;
    public rdk0 b;

    public ldk0(rrm rrmVar) {
        this.f19855a = rrmVar;
    }

    @Override // a.ndk0
    public final Function1 b() {
        return this.b;
    }

    @Override // a.ndk0
    public final rrm c() {
        return this.f19855a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldk0) && this.f19855a == ((ldk0) obj).f19855a;
    }

    public final int hashCode() {
        return this.f19855a.hashCode();
    }

    public final String toString() {
        return "InDialog(snackbar=" + this.f19855a + Separators.RPAREN;
    }
}
