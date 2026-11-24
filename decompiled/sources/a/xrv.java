package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class xrv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41389a;
    public final TextView b;
    public final DsHeader c;

    public xrv(ConstraintLayout constraintLayout, TextView textView, DsHeader dsHeader) {
        this.f41389a = constraintLayout;
        this.b = textView;
        this.c = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41389a;
    }
}
