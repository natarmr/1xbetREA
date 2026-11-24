package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class mdk0 implements ndk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrm f21601a;
    public rdk0 b;

    public mdk0(rrm rrmVar) {
        this.f21601a = rrmVar;
    }

    @Override // a.ndk0
    public final Function1 b() {
        return this.b;
    }

    @Override // a.ndk0
    public final rrm c() {
        return this.f21601a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdk0) && this.f21601a == ((mdk0) obj).f21601a;
    }

    public final int hashCode() {
        return this.f21601a.hashCode();
    }

    public final String toString() {
        return "Regular(snackbar=" + this.f21601a + Separators.RPAREN;
    }
}
