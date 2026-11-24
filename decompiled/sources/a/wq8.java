package a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class wq8 implements vq8, ojv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wq8 f39577a = new wq8();
    public static final wq8 b = new wq8();

    @Override // a.ojv0
    public kjv0 b(Activity activity, x6k x6kVar) {
        vq8.G.getClass();
        return new kjv0(new tq8(uq8.a().f(activity)), x6kVar.h(activity));
    }

    @Override // a.vq8
    public Rect f(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // a.ojv0
    public kjv0 g(Context context, x6k x6kVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new kjv0(bounds, f);
    }
}
