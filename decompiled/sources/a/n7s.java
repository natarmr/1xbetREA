package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class n7s implements q7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMenuDialogParams f23056a;

    public final boolean equals(Object obj) {
        if (obj instanceof n7s) {
            return this.f23056a.equals(((n7s) obj).f23056a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23056a.hashCode();
    }

    public final String toString() {
        return "ShowMenuDialog(params=" + this.f23056a + Separators.RPAREN;
    }
}
