package a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class avf0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f1523a;
    public final MaterialButton b;
    public final MaterialButton c;

    public avf0(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f1523a = linearLayout;
        this.b = materialButton;
        this.c = materialButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1523a;
    }
}
