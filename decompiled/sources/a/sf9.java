package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sf9 extends ia80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdr f32106a;
    public final ia80 b;

    public sf9(tdr tdrVar, ia80 ia80Var) {
        this.f32106a = tdrVar;
        this.b = ia80Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tdr tdrVar = this.f32106a;
        return this.b.compare(tdrVar.apply(obj), tdrVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sf9)) {
            return false;
        }
        sf9 sf9Var = (sf9) obj;
        return this.f32106a.equals(sf9Var.f32106a) && this.b.equals(sf9Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f32106a, this.b);
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.f32106a + Separators.RPAREN;
    }
}
