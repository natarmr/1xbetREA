package a;

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.DsCheckbox;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/u0i;", "La/sik;", "<init>", "()V", "a/usd", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class u0i extends sik {
    public l12 a2;
    public static final /* synthetic */ iiy[] d2 = {new ez40(u0i.class, "dialogFields", "getDialogFields()Lorg/xplatform/uikit/components/dialog/DialogFields;", 0), new ez40(u0i.class, "alertStyle", "getAlertStyle()Ljava/lang/String;", 0)};
    public static final usd c2 = new usd();
    public static final String e2 = u0i.class.getSimpleName();
    public final ehf0 Y1 = new ehf0("DIALOG_FIELDS");
    public final rd9 Z1 = new rd9((byte) 0);
    public boolean b2 = true;

    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    @Override // a.sik
    public Dialog C0(Bundle bundle) {
        l12 kwfVar;
        int i;
        Dialog dialogC0 = super.C0(bundle);
        final byte b = 0;
        final byte b2 = 2;
        final byte b3 = 1;
        if (K0().i == 0) {
            DialogFields dialogFieldsK0 = K0();
            int iOrdinal = K0().j.ordinal();
            if (iOrdinal == 0) {
                i = R.raw.info_lottie_info_opt;
            } else if (iOrdinal == 1) {
                i = R.raw.info_lottie_warning_opt;
            } else if (iOrdinal == 2) {
                i = R.raw.info_lottie_accept_opt;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                i = 0;
            }
            R0(DialogFields.a(dialogFieldsK0, null, null, i, 1791));
        }
        Object obj = this.a2;
        View view = obj != null ? (View) obj : null;
        if (view != null) {
            jmu0.h(view);
        }
        String strN = this.Z1.n(this, d2[1]);
        int iHashCode = strN.hashCode();
        if (iHashCode != -1349088399) {
            if (iHashCode != -1052618729) {
                if (iHashCode == 2125598294 && strN.equals("customWithLottie")) {
                    kwfVar = new zxf(o0());
                } else {
                    kwfVar = new p950(o0());
                }
            } else if (strN.equals("native")) {
                kwfVar = new p950(o0());
            } else {
                kwfVar = new p950(o0());
            }
        } else if (strN.equals(Payload.CUSTOM)) {
            kwfVar = new kwf(o0());
        } else {
            kwfVar = new p950(o0());
        }
        this.a2 = kwfVar;
        kwfVar.setModel(K0());
        kwfVar.getPositiveButton().setTag("topButton");
        dyb.O(kwfVar.getPositiveButton(), new Function1(this) { // from class: a.t0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b;
                u0i u0iVar = this.b;
                View view2 = (View) obj2;
                switch (b4) {
                    case 0:
                        usd usdVar = u0i.c2;
                        view2.getClass();
                        u0iVar.O0();
                        break;
                    case 1:
                        usd usdVar2 = u0i.c2;
                        view2.getClass();
                        u0iVar.M0();
                        break;
                    default:
                        usd usdVar3 = u0i.c2;
                        view2.getClass();
                        u0iVar.N0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        kwfVar.mo5getNegativeButton().setTag("middleButton");
        dyb.O(kwfVar.mo5getNegativeButton(), new Function1(this) { // from class: a.t0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b3;
                u0i u0iVar = this.b;
                View view2 = (View) obj2;
                switch (b4) {
                    case 0:
                        usd usdVar = u0i.c2;
                        view2.getClass();
                        u0iVar.O0();
                        break;
                    case 1:
                        usd usdVar2 = u0i.c2;
                        view2.getClass();
                        u0iVar.M0();
                        break;
                    default:
                        usd usdVar3 = u0i.c2;
                        view2.getClass();
                        u0iVar.N0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(kwfVar.mo6getNeutralButton(), new Function1(this) { // from class: a.t0i
            public final /* synthetic */ u0i b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b4 = b2;
                u0i u0iVar = this.b;
                View view2 = (View) obj2;
                switch (b4) {
                    case 0:
                        usd usdVar = u0i.c2;
                        view2.getClass();
                        u0iVar.O0();
                        break;
                    case 1:
                        usd usdVar2 = u0i.c2;
                        view2.getClass();
                        u0iVar.M0();
                        break;
                    default:
                        usd usdVar3 = u0i.c2;
                        view2.getClass();
                        u0iVar.N0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        kwfVar.getChecker().setCheckedChangeListener(new z9f(this, (byte) 6));
        Object obj2 = this.a2;
        View view2 = obj2 != null ? (View) obj2 : null;
        if (view2 != null) {
            view2.setId(R.id.alertDialogRoot);
            view2.setTag(e2);
            dialogC0.setContentView(view2);
        }
        return dialogC0;
    }

    public final void I0(Dialog dialog) {
        WindowManager.LayoutParams attributes;
        boolean z = G().getConfiguration().orientation == 2;
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_16);
        Window window = dialog.getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        if (!z) {
            attributes.gravity = 17;
            attributes.y = 0;
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setLayout(S0(), -2);
            }
            l12 l12Var = this.a2;
            if (l12Var != null) {
                l12Var.setMaxContentHeight(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        View decorView = n0().getWindow().getDecorView();
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(decorView);
        pfx pfxVarI = xiv0VarA != null ? xiv0VarA.f40966a.i(3) : null;
        int i = ((G().getDisplayMetrics().heightPixels - (pfxVarI != null ? pfxVarI.b : 0)) - (pfxVarI != null ? pfxVarI.d : 0)) - (dimensionPixelSize * 2);
        if (i < 0) {
            i = 0;
        }
        attributes.gravity = 17;
        attributes.y = 0;
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        Window window5 = dialog.getWindow();
        if (window5 != null) {
            window5.setLayout(S0(), -2);
        }
        l12 l12Var2 = this.a2;
        if (l12Var2 != null) {
            l12Var2.setMaxContentHeight(i);
        }
    }

    public final DsCheckbox J0() {
        l12 l12Var = this.a2;
        if (l12Var != null) {
            return l12Var.getChecker();
        }
        return null;
    }

    public final DialogFields K0() {
        return (DialogFields) this.Y1.n(this, d2[0]);
    }

    public void M0() {
        P0(gi.c);
    }

    public void N0() {
        P0(gi.d);
    }

    public void O0() {
        P0(gi.b);
    }

    public final void P0(gi giVar) {
        String str = K0().f;
        if (str != null && str.length() != 0) {
            vcc.f0(i120.V(new Pair(giVar.name(), Boolean.TRUE)), this, K0().f + giVar.name());
        }
        y0();
    }

    public final void Q0(String str) {
        str.getClass();
        if (Intrinsics.d(K0().g, str)) {
            return;
        }
        R0(DialogFields.a(K0(), null, str, 0, 1983));
        l12 l12Var = this.a2;
        if (l12Var != null) {
            l12Var.setModel(K0());
        }
    }

    public final void R0(DialogFields dialogFields) {
        dialogFields.getClass();
        this.Y1.v(this, d2[0], dialogFields);
    }

    public final int S0() {
        Resources resourcesG = G();
        mjv0.f21914a.getClass();
        njv0 njv0Var = ljv0.b;
        njv0Var.getClass();
        kjv0 kjv0VarA = njv0Var.a(n0());
        return resourcesG.getDimensionPixelSize(si30.b(((float) kjv0VarA.f18406a.c().width()) / kjv0VarA.b) >= 600 ? R.dimen.size_400 : R.dimen.size_288);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        Log.i("onCreate", "Current screen: ".concat(getClass().getName()));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        Object obj = this.a2;
        View view = obj != null ? (View) obj : null;
        if (view != null) {
            jmu0.h(view);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        this.j1 = true;
        L0();
        this.b2 = false;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        Window window;
        Window.Callback callback;
        Dialog dialog;
        Window window2;
        View decorView;
        super.g0();
        Dialog dialog2 = this.S1;
        if (dialog2 != null) {
            Window window3 = dialog2.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawableResource(R.drawable.rounded_background_20_content);
            }
            Window window4 = dialog2.getWindow();
            if (window4 != null) {
                window4.setWindowAnimations(this.b2 ? R.style.Widget_Dialog_AlertDialogAnimation : R.style.Widget_Dialog_AlertDialogExitAnimation);
            }
            Window window5 = dialog2.getWindow();
            if (window5 != null && (decorView = window5.getDecorView()) != null) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                decorView.setElevation(1.0f);
            }
            dialog2.setCanceledOnTouchOutside(false);
            E0(K0().k);
            I0(dialog2);
        }
        Dialog dialog3 = this.S1;
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (callback = window.getCallback()) == null || (dialog = this.S1) == null || (window2 = dialog.getWindow()) == null) {
            return;
        }
        window2.setCallback(new hx5(callback, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.j1 = true;
        Object obj = this.a2;
        View view = obj != null ? (View) obj : null;
        if (view != null) {
            view.post(new ccf((Object) this, (byte) 2));
        }
    }

    public void L0() {
    }
}
