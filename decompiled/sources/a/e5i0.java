package a;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e9d0 f7235a = m2a.h1;

    public static final boolean a(woa0 woa0Var) {
        MotionEvent motionEventA;
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dpa0) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = woa0Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = woa0Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
