package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;

/* JADX INFO: loaded from: classes4.dex */
public final class akp implements ekp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChoosenDate f1033a;

    public akp(ChoosenDate choosenDate) {
        this.f1033a = choosenDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akp) && this.f1033a.equals(((akp) obj).f1033a);
    }

    public final int hashCode() {
        return this.f1033a.hashCode();
    }

    public final String toString() {
        return "ShowSelectDateDialog(chosenDate=" + this.f1033a + Separators.RPAREN;
    }
}
