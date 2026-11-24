package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ue50 implements ve50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul0 f35509a;

    public ue50(wul0 wul0Var) {
        this.f35509a = wul0Var;
    }

    @Override // a.ve50
    public final wul0 a() {
        return this.f35509a;
    }

    @Override // a.ve50
    public final List b() {
        return kotlin.collections.a.c(this.f35509a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue50) && this.f35509a.equals(((ue50) obj).f35509a);
    }

    public final int hashCode() {
        return this.f35509a.hashCode();
    }

    public final String toString() {
        return "Single(entry=" + this.f35509a + Separators.RPAREN;
    }
}
