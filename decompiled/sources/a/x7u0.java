package a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class x7u0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40432a;
    public final LinearLayout b;
    public final MaterialButton c;
    public final MaterialButton d;

    public x7u0(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f40432a = linearLayout;
        this.b = linearLayout2;
        this.c = materialButton;
        this.d = materialButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40432a;
    }
}
