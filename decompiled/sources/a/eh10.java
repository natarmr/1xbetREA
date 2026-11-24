package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class eh10 implements fh10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f7788a;

    public eh10(DialogFields dialogFields) {
        this.f7788a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh10) && this.f7788a.equals(((eh10) obj).f7788a);
    }

    public final int hashCode() {
        return this.f7788a.hashCode();
    }

    public final String toString() {
        return "ShowOperationSuccess(dialogFields=" + this.f7788a + Separators.RPAREN;
    }
}
