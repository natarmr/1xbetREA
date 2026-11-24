package a;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class os40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final os40 f25767a = new os40();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
