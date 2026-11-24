package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final class qn60 implements tn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogFields f29017a;

    public qn60(DialogFields dialogFields) {
        this.f29017a = dialogFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn60) && this.f29017a.equals(((qn60) obj).f29017a);
    }

    public final int hashCode() {
        return this.f29017a.hashCode();
    }

    public final String toString() {
        return "ShowErrorDialog(dialogFields=" + this.f29017a + Separators.RPAREN;
    }
}
