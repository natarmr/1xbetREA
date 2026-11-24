package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class eun implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8428a;

    public eun(FrameLayout frameLayout) {
        this.f8428a = frameLayout;
    }

    public static eun a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.empty_frame_layout, (ViewGroup) null, false);
        if (viewInflate != null) {
            return new eun((FrameLayout) viewInflate);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8428a;
    }
}
