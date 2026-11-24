package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class oy30 implements py30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMenuDialogParams f26043a;

    public oy30(ActionMenuDialogParams actionMenuDialogParams) {
        this.f26043a = actionMenuDialogParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy30) && this.f26043a.equals(((oy30) obj).f26043a);
    }

    public final int hashCode() {
        return this.f26043a.hashCode();
    }

    public final String toString() {
        return "ShowMenuDialog(params=" + this.f26043a + Separators.RPAREN;
    }
}
