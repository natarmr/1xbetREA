package a;

import android.view.View;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes4.dex */
public final class wwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsTextField f39906a;
    public final DsTextField b;

    public wwx(DsTextField dsTextField, DsTextField dsTextField2) {
        this.f39906a = dsTextField;
        this.b = dsTextField2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39906a;
    }
}
