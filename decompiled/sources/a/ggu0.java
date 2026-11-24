package a;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class ggu0 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = hhu0.f13083a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
