package a;

import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uwi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36394a;
    public final /* synthetic */ vdj0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ uwi0(vdj0 vdj0Var, Function1 function1, byte b) {
        this.f36394a = b;
        this.b = vdj0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36394a;
        final Function1 function1 = this.c;
        final vdj0 vdj0Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                srx srxVar = (srx) obj;
                srxVar.getClass();
                DsCellRightSwitch dsCellRightSwitch = srxVar.d;
                dsCellRightSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.vwi0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b3 = b2;
                        Function1 function2 = function1;
                        vdj0 vdj0Var2 = vdj0Var;
                        switch (b3) {
                            case 0:
                                compoundButton.getClass();
                                if (compoundButton.isPressed()) {
                                    if (!(vdj0Var2 instanceof tdj0)) {
                                        function2.invoke(vdj0Var2);
                                    } else {
                                        function2.invoke(tdj0.c((tdj0) vdj0Var2, z));
                                    }
                                }
                                break;
                            default:
                                compoundButton.getClass();
                                if (compoundButton.isPressed()) {
                                    if (!(vdj0Var2 instanceof tdj0)) {
                                        function2.invoke(vdj0Var2);
                                    } else {
                                        function2.invoke(tdj0.c((tdj0) vdj0Var2, z));
                                    }
                                }
                                break;
                        }
                    }
                });
                DsSettingsCell dsSettingsCell = srxVar.f32701a;
                dsSettingsCell.setFirst(vdj0Var.getFirst());
                dsSettingsCell.setLast(vdj0Var.getLast());
                srxVar.e.setEnabled(vdj0Var.i());
                srxVar.b.setImageResource(vdj0Var.b());
                dsCellRightSwitch.setChecked(vdj0Var.x());
                DsCellMiddleTitle dsCellMiddleTitle = srxVar.c;
                dsCellMiddleTitle.setSubtitleVisible(false);
                dsCellMiddleTitle.setTitle(vdj0Var.getTitle());
                break;
            default:
                nxx nxxVar = (nxx) obj;
                nxxVar.getClass();
                DsCellRightSwitch dsCellRightSwitch2 = nxxVar.d;
                final byte b3 = 1;
                dsCellRightSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.vwi0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b4 = b3;
                        Function1 function2 = function1;
                        vdj0 vdj0Var2 = vdj0Var;
                        switch (b4) {
                            case 0:
                                compoundButton.getClass();
                                if (compoundButton.isPressed()) {
                                    if (!(vdj0Var2 instanceof tdj0)) {
                                        function2.invoke(vdj0Var2);
                                    } else {
                                        function2.invoke(tdj0.c((tdj0) vdj0Var2, z));
                                    }
                                }
                                break;
                            default:
                                compoundButton.getClass();
                                if (compoundButton.isPressed()) {
                                    if (!(vdj0Var2 instanceof tdj0)) {
                                        function2.invoke(vdj0Var2);
                                    } else {
                                        function2.invoke(tdj0.c((tdj0) vdj0Var2, z));
                                    }
                                }
                                break;
                        }
                    }
                });
                DsSettingsCell dsSettingsCell2 = nxxVar.f24304a;
                dsSettingsCell2.setFirst(vdj0Var.getFirst());
                dsSettingsCell2.setLast(vdj0Var.getLast());
                nxxVar.e.setEnabled(vdj0Var.i());
                nxxVar.b.setImageResource(vdj0Var.b());
                dsCellRightSwitch2.setChecked(vdj0Var.x());
                DsCellMiddleTitle dsCellMiddleTitle2 = nxxVar.c;
                dsCellMiddleTitle2.setSubtitleVisible(false);
                dsCellMiddleTitle2.setTitle(vdj0Var.getTitle());
                break;
        }
        return Unit.f46060a;
    }
}
