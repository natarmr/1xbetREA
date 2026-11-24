package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final class tku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f34115a;
    public final View b;
    public final TextView c;
    public final Group d;
    public final LinearProgressIndicator e;
    public final TextView f;
    public final View g;

    public tku0(DsSettingsCell dsSettingsCell, View view, TextView textView, Group group, LinearProgressIndicator linearProgressIndicator, TextView textView2, View view2) {
        this.f34115a = dsSettingsCell;
        this.b = view;
        this.c = textView;
        this.d = group;
        this.e = linearProgressIndicator;
        this.f = textView2;
        this.g = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34115a;
    }
}
