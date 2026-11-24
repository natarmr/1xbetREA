package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;

/* JADX INFO: loaded from: classes5.dex */
public final class w3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38515a;
    public final zkk b;
    public final zkk c;
    public final LoaderView d;

    public w3r(ConstraintLayout constraintLayout, zkk zkkVar, zkk zkkVar2, LoaderView loaderView) {
        this.f38515a = constraintLayout;
        this.b = zkkVar;
        this.c = zkkVar2;
        this.d = loaderView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38515a;
    }
}
