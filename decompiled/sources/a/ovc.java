package a;

import android.view.MotionEvent;
import android.view.View;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ovc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25918a;

    public /* synthetic */ ovc(byte b) {
        this.f25918a = b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f25918a) {
            case 0:
                gl5 gl5Var = tvc.R1;
                return motionEvent.getPointerCount() > 1;
            case 1:
                int i = GameZoneWebView.j;
                return true;
            default:
                return motionEvent.getAction() == 2;
        }
    }
}
