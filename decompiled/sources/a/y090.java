package a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class y090 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b190 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y090(b190 b190Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = b190Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        b190 b190Var = this.k;
        switch (b) {
            case 0:
                y090 y090Var = new y090(b190Var, yjeVar, (byte) 0);
                y090Var.j = obj;
                return y090Var;
            case 1:
                y090 y090Var2 = new y090(b190Var, yjeVar, (byte) 1);
                y090Var2.j = obj;
                return y090Var2;
            default:
                y090 y090Var3 = new y090(b190Var, yjeVar, (byte) 2);
                y090Var3.j = obj;
                return y090Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y090) create((l190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((y090) create((n190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y090) create((k190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        b190 b190Var = this.k;
        switch (b) {
            case 0:
                l190 l190Var = (l190) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var = b190.V1;
                if (b190Var.G0().g.getAdapter() == null && !l190Var.f19239a.isEmpty()) {
                    List list = l190Var.f19239a;
                    androidx.fragment.app.e eVarC = b190Var.C();
                    eVarC.getClass();
                    qzf0 qzf0Var = new qzf0(eVarC, list);
                    ComposeView composeView = b190Var.G0().f;
                    ViewPager viewPager = b190Var.G0().g;
                    viewPager.setAdapter(qzf0Var);
                    ka70 ka70Var = new ka70(b190Var, qzf0Var, (byte) 10);
                    d4u0 d4u0Var = new d4u0((byte) 10);
                    t330 t330Var = new t330((byte) 16);
                    rju0 rju0Var = new rju0();
                    rju0Var.f30615a = d4u0Var;
                    rju0Var.b = t330Var;
                    rju0Var.c = ka70Var;
                    ArrayList arrayList = viewPager.u1;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        viewPager.u1 = arrayList;
                    }
                    arrayList.add(rju0Var);
                    viewPager.setCurrentItem(b190Var.U1);
                    composeView.setVisibility(l190Var.b ? 0 : 8);
                    DsBottomBar.u(b190Var.G0().b, new qw80(b190Var, qzf0Var, (byte) 4));
                }
                return Unit.f46060a;
            case 1:
                n190 n190Var = (n190) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                fl70 fl70Var2 = b190.V1;
                DsBottomBar dsBottomBar = b190Var.G0().b;
                String strH = b190Var.H(n190Var.f22739a);
                strH.getClass();
                dsBottomBar.setFirstButtonText(strH);
                ViewPager viewPager2 = b190Var.G0().g;
                ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = b190Var.G().getDimensionPixelSize(n190Var.b);
                viewPager2.setLayoutParams(layoutParams);
                if (n190Var.c) {
                    ViewPager viewPager3 = b190Var.G0().g;
                    ViewGroup.LayoutParams layoutParams2 = viewPager3.getLayoutParams();
                    if (layoutParams2 == null) {
                        hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                    viewPager3.setLayoutParams(marginLayoutParams);
                }
                return Unit.f46060a;
            default:
                k190 k190Var = (k190) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (k190Var != null) {
                    boolean z = k190Var instanceof j190;
                    b190 b190Var2 = this.k;
                    if (z) {
                        String str = ((j190) k190Var).f15723a;
                        fl70 fl70Var3 = b190.V1;
                        ii iiVar = b190Var2.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = b190Var2.H(R.string.error);
                        String strH3 = b190Var2.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = b190Var2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (k190Var instanceof i190) {
                        String str2 = ((i190) k190Var).f13987a;
                        fl70 fl70Var4 = b190.V1;
                        wdk0 wdk0Var = b190Var2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, str2, null, null, null, null, 124), b190Var2, null, null, false, null, 988);
                    } else if (k190Var instanceof h190) {
                        fl70 fl70Var5 = b190.V1;
                        f190 f190Var = (f190) b190Var2.Q1.getValue();
                        we50 we50Var = (we50) b190Var2.S1.n(b190Var2, b190.W1[1]);
                        boolean z2 = ((h190) k190Var).f12272a;
                        e190 e190Var = new e190(we50Var);
                        if (z2) {
                            f190Var.b.f(e190Var);
                        } else {
                            f190Var.c.f(e190Var);
                        }
                        Context contextO0 = b190Var2.o0();
                        View currentFocus = b190Var2.n0().getCurrentFocus();
                        t32 t32Var = new t32((byte) 28);
                        if (currentFocus != null) {
                            new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
