package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes6.dex */
public final class aus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1494a;
    public final UiText.ByString b;

    public aus(String str, UiText.ByString byString) {
        str.getClass();
        this.f1494a = str;
        this.b = byString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aus)) {
            return false;
        }
        aus ausVar = (aus) obj;
        return Intrinsics.d(this.f1494a, ausVar.f1494a) && this.b.equals(ausVar.b);
    }

    public final int hashCode() {
        return this.b.f47189a.hashCode() + (this.f1494a.hashCode() * 31);
    }

    public final String toString() {
        return "Spannable(spannableSubtitle=" + ((Object) this.f1494a) + ", title=" + this.b + Separators.RPAREN;
    }
}
