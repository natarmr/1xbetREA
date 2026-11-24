package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes5.dex */
public final class u7z implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f35209a;
    public final DsCheckbox b;
    public final LinearLayout c;

    public u7z(LinearLayoutCompat linearLayoutCompat, DsCheckbox dsCheckbox, LinearLayout linearLayout) {
        this.f35209a = linearLayoutCompat;
        this.b = dsCheckbox;
        this.c = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35209a;
    }
}
