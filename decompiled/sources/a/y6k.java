package a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class y6k implements x6k, ojv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y6k f42101a = new y6k();
    public static final y6k b = new y6k();

    @Override // a.ojv0
    public kjv0 b(Activity activity, x6k x6kVar) {
        vq8.G.getClass();
        return new kjv0(new tq8(uq8.a().f(activity)), x6kVar.h(activity));
    }

    @Override // a.ojv0
    public kjv0 g(Context context, x6k x6kVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new kjv0(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // a.x6k
    public float h(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
