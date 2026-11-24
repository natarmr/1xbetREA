package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class jjs implements mjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMenuDialogParams f16633a;

    public jjs(ActionMenuDialogParams actionMenuDialogParams) {
        this.f16633a = actionMenuDialogParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjs) && this.f16633a.equals(((jjs) obj).f16633a);
    }

    public final int hashCode() {
        return this.f16633a.hashCode();
    }

    public final String toString() {
        return "ShowMenuDialog(params=" + this.f16633a + Separators.RPAREN;
    }
}
