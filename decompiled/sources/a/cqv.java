package a;

import android.view.View;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class cqv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f4814a;
    public final DsHeader b;

    public cqv(DsHeader dsHeader, DsHeader dsHeader2) {
        this.f4814a = dsHeader;
        this.b = dsHeader2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4814a;
    }
}
