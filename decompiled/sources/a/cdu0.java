package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class cdu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4181a;
    public final DsHeader b;

    public cdu0(FrameLayout frameLayout, DsHeader dsHeader) {
        this.f4181a = frameLayout;
        this.b = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4181a;
    }
}
