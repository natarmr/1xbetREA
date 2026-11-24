package a;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightMediumLabel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ri90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30530a;
    public final /* synthetic */ xj80 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ ri90(cp cpVar, xj80 xj80Var, byte b) {
        this.f30530a = b;
        this.c = cpVar;
        this.b = xj80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30530a;
        cp cpVar = this.c;
        xj80 xj80Var = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                ((si90) yfu0Var).b.setTitle(((rde) cpVar.u()).f30287a);
                si90 si90Var = (si90) yfu0Var;
                DsCellMiddleTitle dsCellMiddleTitle = si90Var.b;
                DsSettingsCell dsSettingsCell = si90Var.d;
                DsCellRightMediumLabel dsCellRightMediumLabel = si90Var.c;
                byte b2 = 1;
                dsCellMiddleTitle.setSubtitleVisible(((rde) cpVar.u()).b.length() > 0);
                si90Var.b.setSubtitle(((rde) cpVar.u()).b);
                dsCellRightMediumLabel.setVisibility(((rde) cpVar.u()).d ? 0 : 8);
                dsCellRightMediumLabel.setText(((rde) cpVar.u()).c);
                if (((rde) cpVar.u()).e.f7898a) {
                    dyb.c0(dsCellRightMediumLabel, new ri90(xj80Var, cpVar, b2));
                }
                dj90 dj90Var = dj90.f6173a;
                dj90 dj90Var2 = dj90.f6173a;
                dsSettingsCell.setFirst(false);
                dj90 dj90Var3 = dj90.f6173a;
                dsSettingsCell.setLast(false);
                break;
            case 1:
                ((View) obj).getClass();
                xj80Var.invoke(((rde) cpVar.u()).e);
                break;
            case 2:
                ((List) obj).getClass();
                Object objU = cpVar.u();
                yfu0 yfu0Var2 = cpVar.u;
                if (((sde) objU).f32030a.f7898a) {
                    dyb.c0(((vi90) yfu0Var2).d, new ri90(xj80Var, cpVar, (byte) 3));
                }
                vi90 vi90Var = (vi90) yfu0Var2;
                vi90Var.c.setTitle(((sde) cpVar.u()).b);
                vi90Var.b.setIconResource(((sde) cpVar.u()).c);
                break;
            default:
                ((View) obj).getClass();
                xj80Var.invoke(((sde) cpVar.u()).f32030a);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ri90(xj80 xj80Var, cp cpVar, byte b) {
        this.f30530a = b;
        this.b = xj80Var;
        this.c = cpVar;
    }
}
