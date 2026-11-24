package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19731a;
    public final /* synthetic */ mv00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ lb(mv00 mv00Var, Function1 function1, byte b) {
        this.f19731a = b;
        this.b = mv00Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19731a;
        mv00 mv00Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                ((hej0) obj).getClass();
                function1.invoke(new oyi0(mv00Var));
                break;
            case 1:
                ewx ewxVar = (ewx) obj;
                ewxVar.getClass();
                DsSettingsCell dsSettingsCell = ewxVar.f8548a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new lb(function1, mv00Var, (byte) 2));
                if (mv00Var.f22436a) {
                    dsSettingsCell.setLast(true);
                }
                break;
            case 2:
                ((View) obj).getClass();
                function1.invoke(mv00Var);
                break;
            case 3:
                fwx fwxVar = (fwx) obj;
                fwxVar.getClass();
                DsSettingsCell dsSettingsCell2 = fwxVar.f10282a;
                dsSettingsCell2.getClass();
                dyb.O(dsSettingsCell2, new lb(function1, mv00Var, (byte) 4));
                if (mv00Var.f22436a) {
                    dsSettingsCell2.setLast(true);
                }
                break;
            default:
                ((View) obj).getClass();
                function1.invoke(mv00Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lb(Function1 function1, mv00 mv00Var, byte b) {
        this.f19731a = b;
        this.c = function1;
        this.b = mv00Var;
    }
}
