package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ib implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14461a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4k c;

    public /* synthetic */ ib(Function1 function1, g4k g4kVar, byte b) {
        this.f14461a = b;
        this.b = function1;
        this.c = g4kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14461a;
        g4k g4kVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((hej0) obj).getClass();
                function1.invoke(new oyi0(g4kVar));
                break;
            case 1:
                cux cuxVar = (cux) obj;
                cuxVar.getClass();
                DsSettingsCell dsSettingsCell = cuxVar.f5007a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new ib(function1, g4kVar, (byte) 3));
                dsSettingsCell.setLast(true);
                break;
            case 2:
                bux buxVar = (bux) obj;
                buxVar.getClass();
                DsSettingsCell dsSettingsCell2 = buxVar.f3257a;
                dsSettingsCell2.getClass();
                dyb.O(dsSettingsCell2, new ib(function1, g4kVar, (byte) 4));
                dsSettingsCell2.setLast(true);
                break;
            case 3:
                ((View) obj).getClass();
                function1.invoke(g4kVar);
                break;
            default:
                ((View) obj).getClass();
                function1.invoke(g4kVar);
                break;
        }
        return Unit.f46060a;
    }
}
