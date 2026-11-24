package a;

import android.view.View;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class h2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12338a;
    public final DsHeader b;

    public /* synthetic */ h2k(DsHeader dsHeader, byte b) {
        this.f12338a = b;
        this.b = dsHeader;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f12338a;
        return this.b;
    }
}
