package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zxf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxf0 f45155a = new zxf0(1, i4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentRestoreByPhoneBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.phone_description;
        if (((TextView) yum0.f(view, R.id.phone_description)) != null) {
            i = R.id.textFieldPhone;
            DsPhoneTextField dsPhoneTextField = (DsPhoneTextField) yum0.f(view, R.id.textFieldPhone);
            if (dsPhoneTextField != null) {
                return new i4r((ConstraintLayout) view, dsPhoneTextField);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
