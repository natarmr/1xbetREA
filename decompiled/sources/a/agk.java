package a;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class agk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f828a;
    public final /* synthetic */ tjz b;

    public /* synthetic */ agk(tjz tjzVar, byte b) {
        this.f828a = b;
        this.b = tjzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f828a;
        tjz tjzVar = this.b;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                dc3 dc3VarE = dc3.e(LayoutInflater.from(context), null);
                ((DsCellLeftIcon) dc3VarE.c).setIconResource(tjzVar.b);
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) dc3VarE.d;
                dsCellMiddleTitle.setTitle(tjzVar.f34072a);
                dsCellMiddleTitle.setSubtitleVisible(tjzVar.c);
                DsSettingsCell dsSettingsCell = (DsSettingsCell) dc3VarE.e;
                dsSettingsCell.setFirst(true);
                dsSettingsCell.setLast(true);
                if (tjzVar instanceof sjz) {
                    sjz sjzVar = (sjz) tjzVar;
                    dsCellMiddleTitle.setSubtitle(sjzVar.d);
                    dsCellMiddleTitle.setStatus(sjzVar.e);
                    dsSettingsCell.setEnabled(sjzVar.f);
                }
                return dsSettingsCell;
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                dc3 dc3VarE2 = dc3.e(LayoutInflater.from(context2), null);
                ((DsCellLeftIcon) dc3VarE2.c).setIconResource(tjzVar.b);
                DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) dc3VarE2.d;
                dsCellMiddleTitle2.setTitle(tjzVar.f34072a);
                dsCellMiddleTitle2.setSubtitleVisible(tjzVar.c);
                DsSettingsCell dsSettingsCell2 = (DsSettingsCell) dc3VarE2.e;
                dsSettingsCell2.setFirst(true);
                dsSettingsCell2.setLast(true);
                if (tjzVar instanceof sjz) {
                    sjz sjzVar2 = (sjz) tjzVar;
                    dsCellMiddleTitle2.setSubtitle(sjzVar2.d);
                    dsCellMiddleTitle2.setStatus(sjzVar2.e);
                    dsSettingsCell2.setEnabled(sjzVar2.f);
                }
                return dsSettingsCell2;
        }
    }
}
