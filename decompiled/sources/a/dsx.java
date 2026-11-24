package a;

import android.view.View;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class dsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6635a;
    public final DsHeader b;
    public final DsHeader c;

    public /* synthetic */ dsx(DsHeader dsHeader, DsHeader dsHeader2, byte b) {
        this.f6635a = b;
        this.b = dsHeader;
        this.c = dsHeader2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f6635a;
        return this.b;
    }
}
