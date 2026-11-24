package a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class dr6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ er6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr6(er6 er6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = er6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        er6 er6Var = this.k;
        switch (b) {
            case 0:
                dr6 dr6Var = new dr6(er6Var, yjeVar, (byte) 0);
                dr6Var.j = obj;
                return dr6Var;
            case 1:
                dr6 dr6Var2 = new dr6(er6Var, yjeVar, (byte) 1);
                dr6Var2.j = obj;
                return dr6Var2;
            default:
                dr6 dr6Var3 = new dr6(er6Var, yjeVar, (byte) 2);
                dr6Var3.j = obj;
                return dr6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dr6) create((eeu) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dr6) create((ssj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dr6) create((zct) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        er6 er6Var = this.k;
        switch (b) {
            case 0:
                eeu eeuVar = (eeu) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (eeuVar != null) {
                    if (eeuVar instanceof deu) {
                        kl5 kl5Var = er6.S1;
                        er6Var.G0().e.setVisibility(0);
                        er6Var.G0().f.setVisibility(8);
                    } else if (eeuVar instanceof aeu) {
                        kl5 kl5Var2 = er6.S1;
                        er6Var.G0().e.setVisibility(8);
                        er6Var.G0().f.setVisibility(8);
                        RecyclerView recyclerView = er6Var.G0().h;
                        aeu aeuVar = (aeu) eeuVar;
                        ArrayList arrayList = aeuVar.f746a;
                        recyclerView.setVisibility(!arrayList.isEmpty() ? 0 : 8);
                        er6Var.G0().c.setVisibility(aeuVar.b.isEmpty() ? 8 : 0);
                        k4f k4fVar = er6Var.R1;
                        if (k4fVar != null) {
                            k4fVar.f = arrayList;
                        }
                        if (k4fVar != null) {
                            k4fVar.g();
                        }
                        pkd.i(er6Var.G0().c, null, new ugd(355876381, true, new sr1(eeuVar, er6Var, (byte) 27)));
                    } else if (eeuVar instanceof beu) {
                        kl5 kl5Var3 = er6.S1;
                        er6Var.G0().e.setVisibility(8);
                        ra10 ra10Var = ((beu) eeuVar).f2468a;
                        LottieView lottieView = er6Var.G0().f;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                    } else if (eeuVar instanceof ceu) {
                        kl5 kl5Var4 = er6.S1;
                        er6Var.G0().e.setVisibility(8);
                        ra10 ra10Var2 = ((ceu) eeuVar).f4230a;
                        LottieView lottieView2 = er6Var.G0().f;
                        lottieView2.v(ra10Var2);
                        lottieView2.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                ssj0 ssj0Var = (ssj0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ssj0Var instanceof rsj0) {
                    kl5 kl5Var5 = er6.S1;
                    er6Var.G0().d.setVisibility(((rsj0) ssj0Var).f31034a ? 0 : 8);
                }
                return Unit.f46060a;
            default:
                zct zctVar = (zct) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (zctVar != null) {
                    boolean z = zctVar instanceof xct;
                    er6 er6Var2 = this.k;
                    if (z) {
                        g9m0 g9m0Var = xip0.n2;
                        androidx.fragment.app.e eVarF = er6Var2.F();
                        xct xctVar = (xct) zctVar;
                        d9a0 d9a0Var = xctVar.f40664a;
                        String str = d9a0Var.c;
                        int i = d9a0Var.f5691a;
                        int i2 = d9a0Var.b;
                        ArrayList arrayList2 = xctVar.b;
                        g9m0Var.getClass();
                        if (eVarF.J("TeamSelectorBottomFragment") == null) {
                            xip0 xip0Var = new xip0();
                            iiy[] iiyVarArr = xip0.o2;
                            xip0Var.g2.x(xip0Var, iiyVarArr[0], "REQUEST_TEAM_SELECTOR_KEY");
                            xip0Var.h2.x(xip0Var, iiyVarArr[1], str);
                            xip0Var.i2.I(xip0Var, iiyVarArr[2], i);
                            xip0Var.j2.I(xip0Var, iiyVarArr[3], i2);
                            xip0Var.k2.D(xip0Var, iiyVarArr[4], arrayList2);
                            xip0Var.H0(eVarF, "TeamSelectorBottomFragment");
                        }
                    } else if (zctVar instanceof yct) {
                        if (er6Var2.O1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC = er6Var2.C();
                        eVarC.getClass();
                        uuz uuzVar = fk60.b;
                        noq0.m2.getClass();
                        if (eVarC.J("TipsDialogTag") == null) {
                            noq0 noq0Var = new noq0();
                            iiy[] iiyVarArr2 = noq0.n2;
                            noq0Var.h2.I(noq0Var, iiyVarArr2[3], 3);
                            noq0Var.i2.x(noq0Var, iiyVarArr2[4], "");
                            sj3.E0(noq0Var, eVarC, "TipsDialogTag");
                        }
                    } else if (zctVar instanceof vct) {
                        ii iiVar = er6Var2.P1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = er6Var2.H(R.string.attention);
                        String strH2 = er6Var2.H(R.string.betconstructor_exit_message);
                        String strH3 = er6Var2.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, er6Var2.H(R.string.no), (String) null, "REQUEST_KEY_EXIT", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = er6Var2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (zctVar instanceof wct) {
                        wdk0 wdk0Var = er6Var2.Q1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((wct) zctVar).f38940a, null, null, null, null, 124), er6Var2, null, null, false, null, 1020);
                    } else if (zctVar instanceof uct) {
                        kl5 kl5Var6 = er6.S1;
                        ii iiVar2 = er6Var2.P1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = er6Var2.H(R.string.attention);
                        String strH5 = er6Var2.H(R.string.unacceptable_account_for_section);
                        String strH6 = er6Var2.H(R.string.ok);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = er6Var2.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    }
                }
                return Unit.f46060a;
        }
    }
}
