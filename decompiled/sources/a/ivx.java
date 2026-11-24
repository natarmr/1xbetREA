package a;

import android.view.View;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class ivx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f15463a;
    public final DsHeader b;

    public ivx(DsHeader dsHeader, DsHeader dsHeader2) {
        this.f15463a = dsHeader;
        this.b = dsHeader2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15463a;
    }
}
