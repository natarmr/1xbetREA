package a;

import android.os.Bundle;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
public final class ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc0 f14804a;

    public ii(hc0 hc0Var) {
        this.f14804a = hc0Var;
    }

    public final void a(DialogFields dialogFields, androidx.fragment.app.e eVar) {
        eVar.getClass();
        b(dialogFields).H0(eVar, u0i.class.getSimpleName());
    }

    public final s0i b(DialogFields dialogFields) {
        int i = s0i.f2;
        String str = (String) this.f14804a.invoke();
        dialogFields.getClass();
        str.getClass();
        s0i s0iVar = new s0i();
        s0iVar.R0(dialogFields);
        iiy iiyVar = u0i.d2[1];
        rd9 rd9Var = s0iVar.Z1;
        rd9Var.getClass();
        iiyVar.getClass();
        Bundle bundle = s0iVar.g;
        if (bundle == null) {
            bundle = new Bundle();
            s0iVar.s0(bundle);
        }
        bundle.putString("TMP_ALERT_STYLE", str);
        rd9Var.c = str;
        return s0iVar;
    }

    public final void c(u0i u0iVar, androidx.fragment.app.e eVar) {
        eVar.getClass();
        Bundle bundle = u0iVar.g;
        if (bundle != null) {
            bundle.putString("TMP_ALERT_STYLE", (String) this.f14804a.invoke());
        }
        ccq0.Y(u0iVar, u0iVar.getClass().getSimpleName(), eVar);
    }

    public final void d(DialogFields dialogFields, androidx.fragment.app.e eVar) {
        dialogFields.getClass();
        eVar.getClass();
        ccq0.Y(b(dialogFields), s0i.class.getSimpleName() + dialogFields.f + ((Object) dialogFields.f47242a) + ((Object) dialogFields.b), eVar);
    }
}
