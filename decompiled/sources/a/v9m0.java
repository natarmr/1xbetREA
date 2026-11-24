package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightDragAndDropAndButton;

/* JADX INFO: loaded from: classes5.dex */
public final class v9m0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f37043a;
    public final DsCellRightDragAndDropAndButton b;
    public final DsSettingsCell c;
    public final DsCellMiddleTitle d;

    public v9m0(DsSettingsCell dsSettingsCell, DsCellRightDragAndDropAndButton dsCellRightDragAndDropAndButton, DsSettingsCell dsSettingsCell2, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f37043a = dsSettingsCell;
        this.b = dsCellRightDragAndDropAndButton;
        this.c = dsSettingsCell2;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37043a;
    }
}
