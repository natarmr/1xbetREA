package a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class bpb extends gms0 {
    public static final String[] j1 = {"android:clipBounds:clip"};
    public static final Rect k1 = new Rect();

    public static void U(mns0 mns0Var, boolean z) {
        View view = mns0Var.b;
        HashMap map = mns0Var.f22105a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != k1 ? clipBounds : null;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var == null) {
            return null;
        }
        HashMap map = mns0Var.f22105a;
        if (mns0Var2 == null) {
            return null;
        }
        View view = mns0Var2.b;
        HashMap map2 = mns0Var2.f22105a;
        if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        zkq zkqVar = new zkq((byte) 2);
        zkqVar.b = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, bmu0.c, zkqVar, rect3, rect4);
        apb apbVar = new apb(rect, rect2, view);
        objectAnimatorOfObject.addListener(apbVar);
        a(apbVar);
        return objectAnimatorOfObject;
    }

    @Override // a.gms0
    public final String[] z() {
        return j1;
    }
}
