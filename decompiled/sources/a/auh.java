package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class auh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1478a;
    public final FrameLayout b;

    public /* synthetic */ auh(FrameLayout frameLayout, byte b) {
        this.f1478a = b;
        this.b = frameLayout;
    }

    public static auh a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.empty_row_header_vh, viewGroup, false);
        if (viewInflate != null) {
            return new auh((FrameLayout) viewInflate, (byte) 2);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f1478a;
        return this.b;
    }
}
