package a;

import android.view.View;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dgh0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6043a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dgh0(Function1 function1, byte b) {
        this.f6043a = b;
        this.b = function1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.f6043a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int i = SearchMaterialViewNew.U1;
                function1.invoke(Boolean.valueOf(z));
                break;
            default:
                int i2 = TextInputEditTextNew.j2;
                function1.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
