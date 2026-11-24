package a;

import android.view.View;
import android.widget.TextView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;

/* JADX INFO: loaded from: classes4.dex */
public final class ahu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpandBtnView f892a;
    public final TextView b;

    public ahu0(ExpandBtnView expandBtnView, TextView textView) {
        this.f892a = expandBtnView;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f892a;
    }
}
