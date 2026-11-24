package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;

/* JADX INFO: loaded from: classes4.dex */
public final class zta0 implements bua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChoosenDate f44948a;

    public zta0(ChoosenDate choosenDate) {
        this.f44948a = choosenDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zta0) && this.f44948a.equals(((zta0) obj).f44948a);
    }

    public final int hashCode() {
        return this.f44948a.hashCode();
    }

    public final String toString() {
        return "ShowSelectDateDialog(chosenDate=" + this.f44948a + Separators.RPAREN;
    }
}
