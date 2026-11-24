package a;

import android.gov.nist.core.Separators;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l4q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f19422a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public l4q0(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.f19422a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4q0)) {
            return false;
        }
        l4q0 l4q0Var = (l4q0) obj;
        return Intrinsics.d(this.f19422a, l4q0Var.f19422a) && o9q0.b(this.b, l4q0Var.b) && Intrinsics.d(this.c, l4q0Var.c) && this.d.equals(l4q0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f19422a.hashCode() * 31;
        int i = o9q0.c;
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(iHashCode, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f19422a) + ", selection=" + o9q0.h(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + Separators.RPAREN;
    }
}
