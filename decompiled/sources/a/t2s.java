package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class t2s implements y2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMenuDialogParams f33230a;

    public t2s(ActionMenuDialogParams actionMenuDialogParams) {
        this.f33230a = actionMenuDialogParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2s) && this.f33230a.equals(((t2s) obj).f33230a);
    }

    public final int hashCode() {
        return this.f33230a.hashCode();
    }

    public final String toString() {
        return "ShowMenuDialog(params=" + this.f33230a + Separators.RPAREN;
    }
}
