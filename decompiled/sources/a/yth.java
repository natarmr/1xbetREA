package a;

import android.view.View;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class yth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f43217a;
    public final DsHeader b;

    public yth(DsHeader dsHeader, DsHeader dsHeader2) {
        this.f43217a = dsHeader;
        this.b = dsHeader2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43217a;
    }
}
