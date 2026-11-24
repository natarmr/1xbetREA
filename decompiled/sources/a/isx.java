package a;

import android.view.View;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
public final class isx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsButton f15328a;
    public final DsButton b;

    public isx(DsButton dsButton, DsButton dsButton2) {
        this.f15328a = dsButton;
        this.b = dsButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15328a;
    }
}
