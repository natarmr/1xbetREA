package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class q3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f28065a;
    public final DsNavigationBar b;
    public final RecyclerView c;
    public final zwx d;
    public final zwx e;
    public final zwx f;
    public final zwx g;

    public q3r(LinearLayout linearLayout, DsNavigationBar dsNavigationBar, RecyclerView recyclerView, zwx zwxVar, zwx zwxVar2, zwx zwxVar3, zwx zwxVar4) {
        this.f28065a = linearLayout;
        this.b = dsNavigationBar;
        this.c = recyclerView;
        this.d = zwxVar;
        this.e = zwxVar2;
        this.f = zwxVar3;
        this.g = zwxVar4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28065a;
    }
}
