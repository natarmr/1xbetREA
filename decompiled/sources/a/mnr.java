package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class mnr implements pnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMenuDialogParams f22102a;

    public mnr(ActionMenuDialogParams actionMenuDialogParams) {
        this.f22102a = actionMenuDialogParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnr) && this.f22102a.equals(((mnr) obj).f22102a);
    }

    public final int hashCode() {
        return this.f22102a.hashCode();
    }

    public final String toString() {
        return "ShowMenuDialog(params=" + this.f22102a + Separators.RPAREN;
    }
}
