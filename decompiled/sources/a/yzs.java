package a;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class yzs implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager.LayoutParams f43530a;
    public double b;
    public double c;
    public double d;
    public double e;
    public final /* synthetic */ GameVideoWindowService f;

    public yzs(GameVideoWindowService gameVideoWindowService) {
        this.f = gameVideoWindowService;
        int i = GameVideoWindowService.k;
        this.f43530a = (WindowManager.LayoutParams) gameVideoWindowService.j.getValue();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        GameVideoWindowService gameVideoWindowService = this.f;
        WindowManager.LayoutParams layoutParams = this.f43530a;
        if (action != 0) {
            if (action != 2) {
                return false;
            }
            layoutParams.x = (int) ((((double) motionEvent.getRawX()) - this.d) + this.b);
            layoutParams.y = (int) ((((double) motionEvent.getRawY()) - this.e) + this.c);
            int i = GameVideoWindowService.k;
            ((WindowManager) gameVideoWindowService.i.getValue()).updateViewLayout(gameVideoWindowService.c(), layoutParams);
            return false;
        }
        wzs wzsVar = gameVideoWindowService.c;
        if (wzsVar == null) {
            Intrinsics.h("viewModel");
            throw null;
        }
        wzsVar.w();
        this.b = layoutParams.x;
        this.c = layoutParams.y;
        this.d = motionEvent.getRawX();
        this.e = motionEvent.getRawY();
        return false;
    }
}
