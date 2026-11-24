package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26679a;
    public final /* synthetic */ wgj0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ pb(Function1 function1, wgj0 wgj0Var) {
        this.f26679a = (byte) 0;
        this.c = function1;
        this.b = wgj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26679a;
        Function1 function1 = this.c;
        wgj0 wgj0Var = this.b;
        switch (b) {
            case 0:
                ((hej0) obj).getClass();
                function1.invoke(new oyi0(wgj0Var));
                break;
            case 1:
                ixx ixxVar = (ixx) obj;
                ixxVar.getClass();
                DsSettingsCell dsSettingsCell = ixxVar.d;
                dsSettingsCell.getClass();
                dyb.N(dsSettingsCell, ymx.INTERVAL_400, new pb(wgj0Var, function1, (byte) 2));
                DsSettingsCell dsSettingsCell2 = ixxVar.f15563a;
                dsSettingsCell2.setFirst(wgj0Var.getFirst());
                dsSettingsCell2.setLast(wgj0Var.getLast());
                dsSettingsCell.setAllowClickWhenDisabled(true);
                dsSettingsCell.setEnabled(wgj0Var.i());
                ixxVar.b.setImageResource(wgj0Var.b());
                DsCellMiddleTitle dsCellMiddleTitle = ixxVar.c;
                dsCellMiddleTitle.setTitle(wgj0Var.getTitle());
                dsCellMiddleTitle.setSubtitleVisible(wgj0Var.getSubTitle().length() > 0);
                dsCellMiddleTitle.setSubtitle(wgj0Var.getSubTitle());
                if (wgj0Var.getSubTitle().length() > 0) {
                    dsCellMiddleTitle.setStatus(wgj0Var.y());
                }
                break;
            case 2:
                ((View) obj).getClass();
                if (wgj0Var.k()) {
                    function1.invoke(wgj0Var);
                }
                break;
            case 3:
                kxx kxxVar = (kxx) obj;
                kxxVar.getClass();
                DsSettingsCell dsSettingsCell3 = kxxVar.e;
                DsCellRightLabel dsCellRightLabel = kxxVar.d;
                dsSettingsCell3.getClass();
                dyb.N(dsSettingsCell3, ymx.INTERVAL_400, new pb(wgj0Var, function1, (byte) 4));
                DsSettingsCell dsSettingsCell4 = kxxVar.f19081a;
                dsSettingsCell4.setFirst(wgj0Var.getFirst());
                dsSettingsCell4.setLast(wgj0Var.getLast());
                dsSettingsCell3.setAllowClickWhenDisabled(true);
                dsSettingsCell3.setEnabled(wgj0Var.i());
                kxxVar.b.setImageResource(wgj0Var.b());
                DsCellMiddleTitle dsCellMiddleTitle2 = kxxVar.c;
                dsCellMiddleTitle2.setTitle(wgj0Var.getTitle());
                dsCellMiddleTitle2.setSubtitleVisible(wgj0Var.getSubTitle().length() > 0);
                dsCellMiddleTitle2.setSubtitle(wgj0Var.getSubTitle());
                if (wgj0Var.getSubTitle().length() > 0) {
                    dsCellMiddleTitle2.setStatus(wgj0Var.y());
                }
                if (wgj0Var.l().length() > 0) {
                    dsCellRightLabel.setText(wgj0Var.l());
                    dsCellRightLabel.setVisibility(0);
                } else {
                    dsCellRightLabel.setVisibility(8);
                }
                break;
            default:
                ((View) obj).getClass();
                if (wgj0Var.k()) {
                    function1.invoke(wgj0Var);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pb(wgj0 wgj0Var, Function1 function1, byte b) {
        this.f26679a = b;
        this.b = wgj0Var;
        this.c = function1;
    }
}
