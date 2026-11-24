package a;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lzi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20908a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nzi0 c;

    public /* synthetic */ lzi0(nzi0 nzi0Var, Function1 function1, byte b) {
        this.f20908a = b;
        this.c = nzi0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20908a;
        byte b2 = 1;
        nzi0 nzi0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                jxx jxxVar = (jxx) obj;
                jxxVar.getClass();
                DsSettingsCell dsSettingsCell = jxxVar.e;
                DsSettingsCell dsSettingsCell2 = jxxVar.f17332a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new lzi0(function1, nzi0Var, b2));
                jxxVar.b.setImageResource(R.drawable.ic_glyph_device);
                DsCellMiddleTitle dsCellMiddleTitle = jxxVar.c;
                dsCellMiddleTitle.setTitle(nzi0Var.f24375a);
                dsCellMiddleTitle.setSubtitleVisible(true);
                dsCellMiddleTitle.setSubtitle(nzi0Var.b);
                DsCellRightLabel dsCellRightLabel = jxxVar.d;
                dsCellRightLabel.setVisibility(0);
                if (nzi0Var.c) {
                    dsCellRightLabel.setText(R.string.update_app_button);
                    Context context = dsSettingsCell2.getContext();
                    context.getClass();
                    dsCellRightLabel.setTextColor(m5d.b(R.attr.uikitPrimary, context));
                } else {
                    dsCellRightLabel.setText(R.string.updated);
                    Context context2 = dsSettingsCell2.getContext();
                    context2.getClass();
                    dsCellRightLabel.setTextColor(m5d.b(R.attr.uikitSecondary, context2));
                }
                break;
            case 1:
                ((View) obj).getClass();
                function1.invoke(nzi0Var);
                break;
            case 2:
                lxx lxxVar = (lxx) obj;
                lxxVar.getClass();
                DsSettingsCell dsSettingsCell3 = lxxVar.e;
                DsSettingsCell dsSettingsCell4 = lxxVar.f20837a;
                dsSettingsCell3.getClass();
                dyb.O(dsSettingsCell3, new lzi0(function1, nzi0Var, (byte) 3));
                lxxVar.b.setImageResource(R.drawable.ic_glyph_device);
                DsCellMiddleTitle dsCellMiddleTitle2 = lxxVar.c;
                dsCellMiddleTitle2.setTitle(nzi0Var.f24375a);
                dsCellMiddleTitle2.setSubtitleVisible(true);
                dsCellMiddleTitle2.setSubtitle(nzi0Var.b);
                boolean z = nzi0Var.c;
                DsCellRightLabel dsCellRightLabel2 = lxxVar.d;
                if (z) {
                    dsCellRightLabel2.setText(R.string.update_app_button);
                    Context context3 = dsSettingsCell4.getContext();
                    context3.getClass();
                    dsCellRightLabel2.setTextColor(m5d.b(R.attr.uikitPrimary, context3));
                } else {
                    dsCellRightLabel2.setText(R.string.updated);
                    Context context4 = dsSettingsCell4.getContext();
                    context4.getClass();
                    dsCellRightLabel2.setTextColor(m5d.b(R.attr.uikitSecondary, context4));
                }
                break;
            default:
                ((View) obj).getClass();
                function1.invoke(nzi0Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lzi0(Function1 function1, nzi0 nzi0Var, byte b) {
        this.f20908a = b;
        this.b = function1;
        this.c = nzi0Var;
    }
}
