package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class inh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15074a;
    public final fyl b;
    public final s3q c;

    public inh0(String str, fyl fylVar, s3q s3qVar) {
        str.getClass();
        this.f15074a = str;
        this.b = fylVar;
        this.c = s3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inh0)) {
            return false;
        }
        inh0 inh0Var = (inh0) obj;
        return Intrinsics.d(this.f15074a, inh0Var.f15074a) && this.b.equals(inh0Var.b) && this.c == inh0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f15074a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SectionUiModel(title=" + this.f15074a + ", dsChipUiModel=" + this.b + ", type=" + this.c + Separators.RPAREN;
    }
}
