package a;

import android.view.View;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class ifx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsTextField f14708a;
    public final DsTextField b;

    public ifx(DsTextField dsTextField, DsTextField dsTextField2) {
        this.f14708a = dsTextField;
        this.b = dsTextField2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14708a;
    }
}
