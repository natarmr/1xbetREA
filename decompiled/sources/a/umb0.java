package a;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class umb0 extends smb0 {
    @Override // a.mi70
    public final void a(Rect rect, View view) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
