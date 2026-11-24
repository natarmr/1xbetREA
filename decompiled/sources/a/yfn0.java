package a;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;

/* JADX INFO: loaded from: classes6.dex */
@lbk
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yfn0;", "La/sik;", "<init>", "()V", "a/y2m0", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yfn0 extends sik {
    public final ehf0 Y1 = new ehf0("SUCCESS_BET_STRING_MODEL");
    public final ehf0 Z1 = new ehf0("SUCCESS_BET_ALERT_MODEL_KEY");
    public final ehf0 a2 = new ehf0("BET_DONE_ICON_STYLE_ENUM_KEY");
    public kgn0 b2;
    public static final /* synthetic */ iiy[] d2 = {new ez40(yfn0.class, "successBetStringModel", "getSuccessBetStringModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;", 0), new ez40(yfn0.class, "successBetAlertModel", "getSuccessBetAlertModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;", 0), new ez40(yfn0.class, "tmpBetDoneUiModel", "getTmpBetDoneUiModel()Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;", 0)};
    public static final y2m0 c2 = new y2m0((byte) 5);

    public final SuccessBetAlertModel I0() {
        return (SuccessBetAlertModel) this.Z1.n(this, d2[1]);
    }

    public final SuccessBetStringModel J0() {
        return (SuccessBetStringModel) this.Y1.n(this, d2[0]);
    }

    public final void K0(fhn0 fhn0Var, boolean z) {
        String str = I0().c;
        if (str != null && str.length() != 0 && N()) {
            vcc.f0(i120.V(new Pair(fhn0Var.name(), Boolean.TRUE), new Pair("BALANCE_ID", I0().d), new Pair("BET_MODE", I0().e)), this, I0().c + fhn0Var.name());
        }
        if (z) {
            y0();
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        Log.i("onCreate", "Current screen: ".concat(yfn0.class.getName()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        kgn0 kgn0Var = new kgn0((TmpBetDoneUiModel) this.a2.n(this, d2[2]), I0(), J0(), o0());
        this.b2 = kgn0Var;
        kgn0Var.setTitle$uikit(J0().f47267a);
        String str = J0().c;
        if (str == null) {
            str = "";
        }
        String str2 = J0().d;
        kgn0Var.d(str, str2 != null ? str2 : "");
        kgn0Var.setSubTitle$uikit(J0().f);
        final byte b = 0;
        dyb.O(kgn0Var.getContinueButton$uikit(), new Function1(this) { // from class: a.xfn0
            public final /* synthetic */ yfn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                yfn0 yfn0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        y2m0 y2m0Var = yfn0.c2;
                        view.getClass();
                        yfn0Var.K0(fhn0.f9551a, true);
                        break;
                    default:
                        y2m0 y2m0Var2 = yfn0.c2;
                        view.getClass();
                        yfn0Var.K0(fhn0.b, true);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(kgn0Var.getHistoryButton$uikit(), new Function1(this) { // from class: a.xfn0
            public final /* synthetic */ yfn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                yfn0 yfn0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        y2m0 y2m0Var = yfn0.c2;
                        view.getClass();
                        yfn0Var.K0(fhn0.f9551a, true);
                        break;
                    default:
                        y2m0 y2m0Var2 = yfn0.c2;
                        view.getClass();
                        yfn0Var.K0(fhn0.b, true);
                        break;
                }
                return Unit.f46060a;
            }
        });
        kgn0Var.setOnShareClick(new jfm0(this, (byte) 12));
        String str3 = J0().f;
        if (str3 != null && str3.length() != 0) {
            kgn0Var.c();
        }
        return this.b2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        View decorView;
        super.g0();
        Dialog dialog = this.S1;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(17);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawableResource(R.color.static_transparent);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setWindowAnimations(R.style.Widget_Dialog_AlertDialogAnimation);
            }
            Window window4 = dialog.getWindow();
            if (window4 != null && (decorView = window4.getDecorView()) != null) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                decorView.setElevation(0.0f);
            }
            dialog.setCanceledOnTouchOutside(false);
            E0(false);
            int i = G().getDisplayMetrics().widthPixels;
            Window window5 = dialog.getWindow();
            if (window5 != null) {
                int dimension = (int) G().getDimension(R.dimen.size_400);
                int dimension2 = (int) G().getDimension(R.dimen.size_288);
                int dimension3 = (int) (G().getDisplayMetrics().widthPixels - (G().getDimension(R.dimen.space_16) * 2.0f));
                if (dimension > dimension3) {
                    dimension = dimension3;
                } else if (dimension >= dimension3) {
                    if (dimension2 > dimension3) {
                        dimension = dimension2;
                    } else {
                        dimension = dimension3;
                    }
                }
                window5.setLayout(dimension, -2);
            }
        }
    }
}
