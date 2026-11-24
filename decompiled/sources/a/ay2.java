package a;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ay2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ay2 f1651a = new ay2();

    public final void a(View view, bpa0 bpa0Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = bpa0Var instanceof d13 ? PointerIcon.getSystemIcon(context, ((d13) bpa0Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
