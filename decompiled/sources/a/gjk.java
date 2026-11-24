package a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class gjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f11401a;
    public final MaterialButton b;
    public final View c;

    public gjk(LinearLayout linearLayout, MaterialButton materialButton, View view) {
        this.f11401a = linearLayout;
        this.b = materialButton;
        this.c = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11401a;
    }
}
