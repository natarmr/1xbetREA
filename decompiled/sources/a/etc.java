package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes4.dex */
public final class etc implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8368a;
    public final DsTextField b;
    public final View c;

    public etc(ConstraintLayout constraintLayout, DsTextField dsTextField, View view) {
        this.f8368a = constraintLayout;
        this.b = dsTextField;
        this.c = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8368a;
    }
}
