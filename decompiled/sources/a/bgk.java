package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes3.dex */
public final class bgk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2559a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tjz c;

    public /* synthetic */ bgk(tjz tjzVar, Function1 function1, byte b) {
        this.f2559a = b;
        this.c = tjzVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2559a;
        byte b2 = 1;
        tjz tjzVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((View) obj).getClass();
                function1.invoke(tjzVar);
                break;
            case 1:
                ((View) obj).getClass();
                function1.invoke(tjzVar);
                break;
            case 2:
                DsSettingsCell dsSettingsCell = (DsSettingsCell) obj;
                dsSettingsCell.getClass();
                if (!(tjzVar instanceof sjz)) {
                    dsSettingsCell.setEnabled(true);
                    dyb.b0(dsSettingsCell, ymx.INTERVAL_500, new bgk(function1, tjzVar, b2));
                } else if (((sjz) tjzVar).f) {
                    dyb.b0(dsSettingsCell, ymx.INTERVAL_500, new bgk(function1, tjzVar, (byte) 0));
                }
                break;
            case 3:
                ((View) obj).getClass();
                function1.invoke(tjzVar);
                break;
            case 4:
                ((View) obj).getClass();
                function1.invoke(tjzVar);
                break;
            default:
                DsSettingsCell dsSettingsCell2 = (DsSettingsCell) obj;
                dsSettingsCell2.getClass();
                if (!(tjzVar instanceof sjz)) {
                    dsSettingsCell2.setEnabled(true);
                    dyb.b0(dsSettingsCell2, ymx.INTERVAL_500, new bgk(function1, tjzVar, (byte) 4));
                } else if (((sjz) tjzVar).f) {
                    dyb.b0(dsSettingsCell2, ymx.INTERVAL_500, new bgk(function1, tjzVar, (byte) 3));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bgk(Function1 function1, tjz tjzVar, byte b) {
        this.f2559a = b;
        this.b = function1;
        this.c = tjzVar;
    }
}
