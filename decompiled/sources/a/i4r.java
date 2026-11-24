package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class i4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14159a;
    public final DsPhoneTextField b;

    public i4r(ConstraintLayout constraintLayout, DsPhoneTextField dsPhoneTextField) {
        this.f14159a = constraintLayout;
        this.b = dsPhoneTextField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14159a;
    }
}
