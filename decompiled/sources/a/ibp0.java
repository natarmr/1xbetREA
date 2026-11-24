package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineDialogParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ibp0 implements lbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeamDetailsDisciplineDialogParams f14501a;

    public ibp0(TeamDetailsDisciplineDialogParams teamDetailsDisciplineDialogParams) {
        this.f14501a = teamDetailsDisciplineDialogParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibp0) && this.f14501a.equals(((ibp0) obj).f14501a);
    }

    public final int hashCode() {
        return this.f14501a.hashCode();
    }

    public final String toString() {
        return "ShowDisciplinesDialog(params=" + this.f14501a + Separators.RPAREN;
    }
}
