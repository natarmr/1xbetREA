package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class ujz extends v46 implements czx {
    public final dc3 u;
    public final Function1 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public ujz(dc3 dc3Var, b33 b33Var) {
        b33Var.getClass();
        DsSettingsCell dsSettingsCell = (DsSettingsCell) dc3Var.b;
        dsSettingsCell.getClass();
        super(dsSettingsCell);
        this.u = dc3Var;
        this.v = b33Var;
    }

    @Override // a.czx
    public final void a(boolean z, boolean z2) {
        DsSettingsCell dsSettingsCell = (DsSettingsCell) this.u.e;
        dsSettingsCell.setFirst(z);
        dsSettingsCell.setLast(z2);
    }

    @Override // a.v46
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(tjz tjzVar) {
        tjzVar.getClass();
        dc3 dc3Var = this.u;
        DsSettingsCell dsSettingsCell = (DsSettingsCell) dc3Var.e;
        ((DsCellLeftIcon) dc3Var.c).setImageResource(tjzVar.b);
        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) dc3Var.d;
        DsSettingsCell dsSettingsCell2 = (DsSettingsCell) dc3Var.b;
        dsCellMiddleTitle.setTitle(dsSettingsCell2.getContext().getString(tjzVar.f34072a));
        dsCellMiddleTitle.setSubtitleVisible(tjzVar.c);
        if (!(tjzVar instanceof sjz)) {
            dsSettingsCell.setEnabled(true);
            dsSettingsCell2.getClass();
            dyb.b0(dsSettingsCell2, ymx.INTERVAL_500, new okw(this, tjzVar, (byte) 27));
            return;
        }
        sjz sjzVar = (sjz) tjzVar;
        dsCellMiddleTitle.setSubtitle(sjzVar.d);
        dsCellMiddleTitle.setStatus(sjzVar.e);
        boolean z = sjzVar.f;
        dsSettingsCell.setEnabled(z);
        if (z) {
            dsSettingsCell2.getClass();
            dyb.b0(dsSettingsCell2, ymx.INTERVAL_500, new okw(this, sjzVar, (byte) 28));
        }
    }
}
