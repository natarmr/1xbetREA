package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class cjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4464a;
    public final MaterialButton b;
    public final AppCompatEditText c;

    public cjk(LinearLayout linearLayout, MaterialButton materialButton, AppCompatEditText appCompatEditText) {
        this.f4464a = linearLayout;
        this.b = materialButton;
        this.c = appCompatEditText;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4464a;
    }
}
