package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class jlf0 implements mlf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16714a;
    public final ArrayList b;

    public jlf0(String str, ArrayList arrayList) {
        this.f16714a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlf0)) {
            return false;
        }
        jlf0 jlf0Var = (jlf0) obj;
        return this.f16714a.equals(jlf0Var.f16714a) && this.b.equals(jlf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16714a.hashCode() * 31);
    }

    public final String toString() {
        return "FileMessage(text=" + this.f16714a + ", fileInfoList=" + this.b + Separators.RPAREN;
    }
}
