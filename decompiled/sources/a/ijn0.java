package a;

import android.content.Intent;
import android.net.Uri;
import android.net.sip.SipManager;
import android.os.Build;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ijn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jjn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijn0(jjn0 jjn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jjn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jjn0 jjn0Var = this.k;
        switch (b) {
            case 0:
                ijn0 ijn0Var = new ijn0(jjn0Var, yjeVar, (byte) 0);
                ijn0Var.j = obj;
                return ijn0Var;
            case 1:
                ijn0 ijn0Var2 = new ijn0(jjn0Var, yjeVar, (byte) 1);
                ijn0Var2.j = obj;
                return ijn0Var2;
            default:
                ijn0 ijn0Var3 = new ijn0(jjn0Var, yjeVar, (byte) 2);
                ijn0Var3.j = obj;
                return ijn0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ijn0) create((sjn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ijn0) create((rjn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ijn0) create((gkn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jjn0 jjn0Var = this.k;
        z = false;
        z = false;
        boolean z = false;
        switch (b) {
            case 0:
                sjn0 sjn0Var = (sjn0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g9m0 g9m0Var = jjn0.S1;
                ((ejn0) jjn0Var.R1.getValue()).A(sjn0Var.f32311a);
                jjn0Var.G0().b.setVisibility(sjn0Var.b ? 0 : 8);
                return Unit.f46060a;
            case 1:
                rjn0 rjn0Var = (rjn0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                g9m0 g9m0Var2 = jjn0.S1;
                androidx.recyclerview.widget.b layoutManager = jjn0Var.G0().d.getLayoutManager();
                if (rjn0Var == rjn0.PLAIN_LIST_ITEMS && !(layoutManager instanceof LinearLayoutManager)) {
                    jjn0Var.G0().d.setLayoutManager(new LinearLayoutManager(jjn0Var.o0()));
                    RecyclerView recyclerView = jjn0Var.G0().d;
                    int dimensionPixelSize = jjn0Var.G().getDimensionPixelSize(R.dimen.space_8);
                    int dimensionPixelSize2 = jjn0Var.G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
                    recyclerView.m(new gvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, (byte) 3));
                } else if (rjn0Var == rjn0.COMPACT_CARDS && !(layoutManager instanceof GridLayoutManager)) {
                    jjn0Var.G0().d.setLayoutManager(new GridLayoutManager(jjn0Var.o0(), 2));
                    RecyclerView recyclerView2 = jjn0Var.G0().d;
                    int dimensionPixelSize3 = jjn0Var.G().getDimensionPixelSize(R.dimen.space_8);
                    int dimensionPixelSize4 = jjn0Var.G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
                    recyclerView2.m(new fvl(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4, 0, dimensionPixelSize3, cy7.c(), iun.f15405a));
                }
                return Unit.f46060a;
            default:
                rek0 rek0Var = rek0.b;
                gkn0 gkn0Var = (gkn0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (gkn0Var != null) {
                    boolean z2 = gkn0Var instanceof bkn0;
                    jjn0 jjn0Var2 = this.k;
                    if (!z2) {
                        if (!(gkn0Var instanceof ckn0)) {
                            if (gkn0Var instanceof fkn0) {
                                g9m0 g9m0Var3 = jjn0.S1;
                                j120.c0(jjn0Var2.o0(), "open/paymentconsultant");
                            } else if (gkn0Var instanceof dkn0) {
                                String str = ((dkn0) gkn0Var).f6240a;
                                g9m0 g9m0Var4 = jjn0.S1;
                                try {
                                    jjn0Var2.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                                } catch (Exception unused) {
                                    if (jjn0Var2.N()) {
                                        wdk0 wdk0Var = jjn0Var2.K1;
                                        if (wdk0Var == null) {
                                            Intrinsics.h("snackbarManager");
                                            throw null;
                                        }
                                        String strH = jjn0Var2.H(R.string.intent_app_not_installed);
                                        strH.getClass();
                                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), jjn0Var2, null, null, false, null, 1020);
                                    }
                                }
                            } else if (gkn0Var instanceof ekn0) {
                                String str2 = ((ekn0) gkn0Var).f7961a;
                                g9m0 g9m0Var5 = jjn0.S1;
                                wdk0 wdk0Var2 = jjn0Var2.K1;
                                if (wdk0Var2 == null) {
                                    Intrinsics.h("snackbarManager");
                                    throw null;
                                }
                                wdk0.k(wdk0Var2, new xdk0(rek0Var, str2, null, null, null, null, 124), jjn0Var2, null, null, false, null, 1020);
                            }
                            break;
                        } else {
                            g9m0 g9m0Var6 = jjn0.S1;
                            if (v3c.R(jjn0Var2.o0(), "org.xcare.client")) {
                                j6m0 j6m0Var = sin0.j2;
                                androidx.fragment.app.e eVarC = jjn0Var2.C();
                                eVarC.getClass();
                                j6m0Var.getClass();
                                j6m0.e(eVarC, "REQUEST_CODE_OPEN_SUPPORT_APP", true);
                            } else {
                                j6m0 j6m0Var2 = sin0.j2;
                                androidx.fragment.app.e eVarC2 = jjn0Var2.C();
                                eVarC2.getClass();
                                j6m0Var2.getClass();
                                j6m0.e(eVarC2, "REQUEST_CODE_DOWNLOAD_SUPPORT_APP", false);
                            }
                        }
                    } else {
                        g9m0 g9m0Var7 = jjn0.S1;
                        Object[] objArr = Build.VERSION.SDK_INT < 31;
                        if (SipManager.isVoipSupported(jjn0Var2.D()) && SipManager.isApiSupported(jjn0Var2.D()) && objArr != false) {
                            z = true;
                        }
                        mkn0 mkn0VarH0 = jjn0Var2.H0();
                        sac.V(jiu0.a(mkn0VarH0), jkn0.f16679a, null, mkn0VarH0.c.f22085a, new eyc0(mkn0VarH0, z, null), 10);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
