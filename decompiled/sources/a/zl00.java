package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public final class zl00 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f44558a;
    public final DsButton b;
    public final DsTextField c;

    public zl00(LinearLayout linearLayout, DsButton dsButton, DsTextField dsTextField) {
        this.f44558a = linearLayout;
        this.b = dsButton;
        this.c = dsTextField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44558a;
    }
}
