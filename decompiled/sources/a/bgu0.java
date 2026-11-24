package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class bgu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2575a;
    public final MaterialButton b;
    public final MaterialCardView c;
    public final MaterialButton d;
    public final TextView e;

    public bgu0(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, MaterialButton materialButton2, TextView textView) {
        this.f2575a = constraintLayout;
        this.b = materialButton;
        this.c = materialCardView;
        this.d = materialButton2;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2575a;
    }
}
