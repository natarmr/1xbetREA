package a;

import android.view.View;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes4.dex */
public final class cfx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsPhoneTextField f4285a;
    public final DsPhoneTextField b;

    public cfx(DsPhoneTextField dsPhoneTextField, DsPhoneTextField dsPhoneTextField2) {
        this.f4285a = dsPhoneTextField;
        this.b = dsPhoneTextField2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4285a;
    }
}
