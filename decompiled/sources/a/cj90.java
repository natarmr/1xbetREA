package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class cj90 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4450a;
    public final DsHeader b;

    public cj90(FrameLayout frameLayout, DsHeader dsHeader) {
        this.f4450a = frameLayout;
        this.b = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4450a;
    }
}
