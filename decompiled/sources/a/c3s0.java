package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes4.dex */
public final class c3s0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3695a;
    public final TextView b;
    public final DsAccordion c;

    public c3s0(FrameLayout frameLayout, TextView textView, DsAccordion dsAccordion) {
        this.f3695a = frameLayout;
        this.b = textView;
        this.c = dsAccordion;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3695a;
    }
}
