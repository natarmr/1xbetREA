package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oz8 implements qz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26093a;

    public oz8(int i) {
        this.f26093a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oz8) && this.f26093a == ((oz8) obj).f26093a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26093a);
    }

    public final String toString() {
        return ua80.e(this.f26093a, "OnLanguageClick(languageId=", Separators.RPAREN);
    }
}
