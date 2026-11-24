package a;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final class cun0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f4995a;
    public final DsButton b;
    public final DsAccountSelection c;
    public final DsButton d;
    public final DsButton e;
    public final DsButton f;
    public final DsButton g;
    public final DsTextField h;

    public cun0(NestedScrollView nestedScrollView, DsButton dsButton, DsAccountSelection dsAccountSelection, DsButton dsButton2, DsButton dsButton3, DsButton dsButton4, DsButton dsButton5, DsTextField dsTextField) {
        this.f4995a = nestedScrollView;
        this.b = dsButton;
        this.c = dsAccountSelection;
        this.d = dsButton2;
        this.e = dsButton3;
        this.f = dsButton4;
        this.g = dsButton5;
        this.h = dsTextField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4995a;
    }
}
