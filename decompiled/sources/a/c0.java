package a;

import android.view.View;
import kotlin.jvm.functions.Function0;
import org.xplatform.core.presentation.views.tax_message.TaxMessageView;
import org.xplatform.promo.impl.promocodes.presentation.components.PromoBanner;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3498a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ c0(Function0 function0, byte b) {
        this.f3498a = b;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f3498a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                int i = DsSnackBarView.s;
                function0.invoke();
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            case 8:
                function0.invoke();
                break;
            case 9:
                function0.invoke();
                break;
            case 10:
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            case 12:
                int i2 = PromoBanner.b;
                function0.invoke();
                break;
            case 13:
                function0.invoke();
                break;
            default:
                int i3 = TaxMessageView.i;
                function0.invoke();
                break;
        }
    }
}
