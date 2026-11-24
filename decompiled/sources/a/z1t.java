package a;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class z1t implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager.LayoutParams f43638a;
    public double b;
    public double c;
    public double d;
    public double e;
    public final /* synthetic */ GameZoneWindowService f;
    public final /* synthetic */ GameZoneView g;

    public z1t(GameZoneWindowService gameZoneWindowService, GameZoneView gameZoneView) {
        this.f = gameZoneWindowService;
        this.g = gameZoneView;
        int i = GameZoneWindowService.g;
        this.f43638a = (WindowManager.LayoutParams) gameZoneWindowService.f.getValue();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        GameZoneWindowService gameZoneWindowService = this.f;
        WindowManager.LayoutParams layoutParams = this.f43638a;
        if (action != 0) {
            if (action != 2) {
                return false;
            }
            layoutParams.x = (int) ((((double) motionEvent.getRawX()) - this.d) + this.b);
            layoutParams.y = (int) ((((double) motionEvent.getRawY()) - this.e) + this.c);
            int i = GameZoneWindowService.g;
            ((WindowManager) gameZoneWindowService.e.getValue()).updateViewLayout(this.g, layoutParams);
            return false;
        }
        x1t x1tVar = gameZoneWindowService.c;
        if (x1tVar == null) {
            Intrinsics.h("viewModel");
            throw null;
        }
        x1tVar.w();
        this.b = layoutParams.x;
        this.c = layoutParams.y;
        this.d = motionEvent.getRawX();
        this.e = motionEvent.getRawY();
        return false;
    }
}
