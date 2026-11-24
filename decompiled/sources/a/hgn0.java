package a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;
import org.xplatform.uikit.components.successbetalert.model.TmpBetDoneUiModel;

/* JADX INFO: loaded from: classes6.dex */
@lbk
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hgn0;", "La/stl;", "La/cgn0;", "<init>", "()V", "a/m6m0", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hgn0 extends stl<cgn0> {
    public final ehf0 g2 = new ehf0("SUCCESS_BET_STRING_MODEL");
    public final ehf0 h2 = new ehf0("SUCCESS_BET_ALERT_MODEL_KEY");
    public final ehf0 i2 = new ehf0("BET_DONE_ICON_STYLE_ENUM_KEY");
    public final nae0 j2 = new pmi(this, ggn0.f11259a);
    public static final /* synthetic */ iiy[] l2 = {new ez40(hgn0.class, "successBetStringModel", "getSuccessBetStringModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;", 0), new ez40(hgn0.class, "successBetAlertModel", "getSuccessBetAlertModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;", 0), new ez40(hgn0.class, "tmpBetDoneUiModel", "getTmpBetDoneUiModel()Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;", 0), new j0d0(hgn0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/SuccessBetAlertBottomSheetBinding;", 0)};
    public static final m6m0 k2 = new m6m0((byte) 5);

    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x011b  */
    @Override // a.stl
    public final void S0() {
        View view;
        iiy[] iiyVarArr = l2;
        final byte b = 2;
        iiy iiyVar = iiyVarArr[2];
        ehf0 ehf0Var = this.i2;
        int iOrdinal = ((TmpBetDoneUiModel) ehf0Var.n(this, iiyVar)).b.ordinal();
        final byte b2 = 1;
        final byte b3 = 0;
        if (iOrdinal == 0) {
            Q0().f4321a.removeView(Q0().e);
        } else if (iOrdinal == 1) {
            Q0().e.removeView(Q0().f);
            Q0().d.setVisibility(0);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            Q0().e.removeView(Q0().d);
            Integer num = X0().g;
            if (num != null) {
                Q0().f.setAnimation(G().getString(num.intValue()));
            }
            Q0().f.setVisibility(0);
        }
        DsPresetTitle dsPresetTitle = Q0().h;
        String strN = Y0().f47267a;
        if (!StringsKt.O(strN, "!", false)) {
            strN = null;
        }
        if (strN == null) {
            strN = ohs0.n(Y0().f47267a, "!");
        }
        dsPresetTitle.setTitle(strN);
        if (V0()) {
            Q0().i.setPadding(0, 0, 0, G().getDimensionPixelSize(R.dimen.space_24));
        }
        if (V0()) {
            Q0().g.setVisibility(8);
        } else {
            int iOrdinal2 = ((TmpBetDoneUiModel) ehf0Var.n(this, iiyVarArr[2])).f47268a.ordinal();
            if (iOrdinal2 == 0) {
                ahn0 ahn0Var = new ahn0(o0());
                ahn0Var.setId(jmu0.d());
                ahn0Var.a(X0(), Y0(), new Function0(this) { // from class: a.fgn0
                    public final /* synthetic */ hgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        hgn0 hgn0Var = this.b;
                        switch (b4) {
                            case 0:
                                m6m0 m6m0Var = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            case 1:
                                m6m0 m6m0Var2 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            default:
                                m6m0 m6m0Var3 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                view = ahn0Var;
            } else if (iOrdinal2 == 1) {
                wgn0 wgn0Var = new wgn0(o0());
                wgn0Var.setId(jmu0.d());
                wgn0Var.a(X0(), Y0(), new Function0(this) { // from class: a.fgn0
                    public final /* synthetic */ hgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b2;
                        hgn0 hgn0Var = this.b;
                        switch (b4) {
                            case 0:
                                m6m0 m6m0Var = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            case 1:
                                m6m0 m6m0Var2 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            default:
                                m6m0 m6m0Var3 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                view = wgn0Var;
            } else if (iOrdinal2 == 2) {
                ahn0 ahn0Var2 = new ahn0(o0());
                ahn0Var2.setId(jmu0.d());
                ahn0Var2.a(X0(), Y0(), new Function0(this) { // from class: a.fgn0
                    public final /* synthetic */ hgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        hgn0 hgn0Var = this.b;
                        switch (b4) {
                            case 0:
                                m6m0 m6m0Var = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            case 1:
                                m6m0 m6m0Var2 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            default:
                                m6m0 m6m0Var3 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                view = ahn0Var2;
            } else if (iOrdinal2 != 3) {
                ahn0 ahn0Var3 = new ahn0(o0());
                ahn0Var3.setId(jmu0.d());
                ahn0Var3.a(X0(), Y0(), new Function0(this) { // from class: a.fgn0
                    public final /* synthetic */ hgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b;
                        hgn0 hgn0Var = this.b;
                        switch (b4) {
                            case 0:
                                m6m0 m6m0Var = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            case 1:
                                m6m0 m6m0Var2 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            default:
                                m6m0 m6m0Var3 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                view = ahn0Var3;
            } else {
                wgn0 wgn0Var2 = new wgn0(o0());
                wgn0Var2.setId(jmu0.d());
                wgn0Var2.a(X0(), Y0(), new Function0(this) { // from class: a.fgn0
                    public final /* synthetic */ hgn0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b2;
                        hgn0 hgn0Var = this.b;
                        switch (b4) {
                            case 0:
                                m6m0 m6m0Var = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            case 1:
                                m6m0 m6m0Var2 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                            default:
                                m6m0 m6m0Var3 = hgn0.k2;
                                hgn0Var.Z0(fhn0.c, false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                view = wgn0Var2;
            }
            Q0().g.addView(view);
        }
        DsButton dsButton = Q0().c;
        String str = Y0().c;
        if (str == null) {
            str = "";
        }
        dsButton.l(str);
        DsButton dsButton2 = Q0().b;
        String str2 = Y0().d;
        dsButton2.l(str2 != null ? str2 : "");
        String str3 = Y0().f;
        if (str3 != null && str3.length() != 0) {
            Q0().i.setText(Y0().f);
            Q0().i.setVisibility(0);
            Q0().g.setPadding(0, 0, 0, G().getDimensionPixelSize(R.dimen.space_16));
            DsPresetTitle dsPresetTitle2 = Q0().h;
            ViewGroup.LayoutParams layoutParams = dsPresetTitle2.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = G().getDimensionPixelSize(R.dimen.space_4);
                dsPresetTitle2.setLayoutParams(marginLayoutParams);
            }
        }
        dyb.O(Q0().c, new Function1(this) { // from class: a.dgn0
            public final /* synthetic */ hgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                hgn0 hgn0Var = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = hgn0.k2;
                        view2.getClass();
                        hgn0Var.Z0(fhn0.b, true);
                        break;
                    default:
                        m6m0 m6m0Var2 = hgn0.k2;
                        view2.getClass();
                        hgn0Var.Z0(fhn0.f9551a, true);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(Q0().b, new Function1(this) { // from class: a.dgn0
            public final /* synthetic */ hgn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                hgn0 hgn0Var = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        m6m0 m6m0Var = hgn0.k2;
                        view2.getClass();
                        hgn0Var.Z0(fhn0.b, true);
                        break;
                    default:
                        m6m0 m6m0Var2 = hgn0.k2;
                        view2.getClass();
                        hgn0Var.Z0(fhn0.f9551a, true);
                        break;
                }
                return Unit.f46060a;
            }
        });
        Dialog dialog = this.S1;
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: a.egn0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    m6m0 m6m0Var = hgn0.k2;
                    this.f7773a.Z0(fhn0.f9551a, true);
                }
            });
        }
    }

    public final boolean V0() {
        boolean zIsEmpty = X0().f.isEmpty();
        String str = X0().f47264a;
        boolean z = str != null && str.length() == 0;
        String str2 = X0().b;
        return zIsEmpty && z && (str2 != null && str2.length() == 0);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final cgn0 Q0() {
        Object objN = this.j2.n(l2[3], this);
        objN.getClass();
        return (cgn0) objN;
    }

    public final SuccessBetAlertModel X0() {
        return (SuccessBetAlertModel) this.h2.n(this, l2[1]);
    }

    public final SuccessBetStringModel Y0() {
        return (SuccessBetStringModel) this.g2.n(this, l2[0]);
    }

    public final void Z0(fhn0 fhn0Var, boolean z) {
        String str = X0().c;
        if (str != null && str.length() != 0 && N()) {
            vcc.f0(i120.V(new Pair(fhn0Var.name(), Boolean.TRUE), new Pair("BALANCE_ID", X0().d), new Pair("BET_MODE", X0().e)), this, X0().c + fhn0Var.name());
        }
        if (z) {
            y0();
        }
    }
}
