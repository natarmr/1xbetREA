package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
public final class sfo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ufo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfo0(ufo0 ufo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ufo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ufo0 ufo0Var = this.k;
        switch (b) {
            case 0:
                sfo0 sfo0Var = new sfo0(ufo0Var, yjeVar, (byte) 0);
                sfo0Var.j = obj;
                return sfo0Var;
            default:
                sfo0 sfo0Var2 = new sfo0(ufo0Var, yjeVar, (byte) 1);
                sfo0Var2.j = obj;
                return sfo0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sfo0) create((hgo0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sfo0) create((ego0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00f2  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        int i = 0;
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                hgo0 hgo0Var = (hgo0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (hgo0Var != null) {
                    boolean z = hgo0Var instanceof ggo0;
                    ufo0 ufo0Var = this.k;
                    if (z) {
                        s2m0 s2m0Var = ufo0.Q1;
                        ufo0Var.G0().b.setVisibility(0);
                        ufo0Var.G0().c.setVisibility(8);
                        ufo0Var.G0().d.setVisibility(8);
                    } else if (hgo0Var instanceof fgo0) {
                        fgo0 fgo0Var = (fgo0) hgo0Var;
                        s2m0 s2m0Var2 = ufo0.Q1;
                        if (ufo0Var.G0().d.getAdapter() == null) {
                            DsTabs dsTabs = ufo0Var.G0().c;
                            e140 e140Var = fgo0Var.f9502a;
                            dsTabs.setTabsStyle(e140Var.f7020a);
                            ufo0Var.G0().c.c(e140Var.b);
                            ufo0Var.G0().d.setAdapter(new dz30(e140Var, ufo0Var));
                        }
                        ufo0Var.G0().b.setVisibility(8);
                        ufo0Var.G0().c.setVisibility(0);
                        ufo0Var.G0().d.setVisibility(0);
                        ViewPager2 viewPager2 = ufo0Var.G0().d;
                        viewPager2.post(new oh60(viewPager2, fgo0Var, (byte) 26));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                ufo0 ufo0Var2 = this.k;
                a8z a8zVar = ufo0Var2.M1;
                ego0 ego0Var = (ego0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(ego0Var instanceof bgo0)) {
                    if (!(ego0Var instanceof cgo0)) {
                        if (!(ego0Var instanceof dgo0)) {
                            if (!Intrinsics.d(ego0Var, ago0.f834a)) {
                                if (ego0Var instanceof zfo0) {
                                    s2m0 s2m0Var3 = ufo0.Q1;
                                    db dbVar = ((cwi) a8zVar.getValue()).f5081a;
                                    androidx.fragment.app.e eVarC = ufo0Var2.C();
                                    eVarC.getClass();
                                    jvp0 jvp0Var = jvp0.f17215a;
                                    s9m0.m(eVarC);
                                } else {
                                    if (!(ego0Var instanceof yfo0)) {
                                        t9f.b();
                                        return null;
                                    }
                                    Context contextO0 = ufo0Var2.o0();
                                    String str = ((yfo0) ego0Var).f42550a;
                                    try {
                                        e0g0 e0g0Var = j0g0.b;
                                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                                        intent.setFlags(268435456);
                                        intent.setData(Uri.parse(str));
                                        contextO0.startActivity(intent);
                                        g0g0Var = Unit.f46060a;
                                    } catch (Throwable th) {
                                        e0g0 e0g0Var2 = j0g0.b;
                                        g0g0Var = new g0g0(th);
                                    }
                                    if (j0g0.a(g0g0Var) != null) {
                                        wdk0 wdk0Var = (wdk0) ((cwi) a8zVar.getValue()).f5081a.q;
                                        x1x.y(wdk0Var);
                                        rek0 rek0Var = rek0.b;
                                        String strH = ufo0Var2.H(R.string.open_browser_error_message);
                                        strH.getClass();
                                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), ufo0Var2, null, null, false, null, 1020);
                                    }
                                }
                                break;
                            } else {
                                s2m0 s2m0Var4 = ufo0.Q1;
                                List listP = ufo0Var2.C().c.p();
                                listP.getClass();
                                i0h0 i0h0Var = (Fragment) CollectionsKt.W(ufo0Var2.G0().d.getCurrentItem(), listP);
                                if (i0h0Var != null) {
                                    if (i0h0Var instanceof tah0) {
                                        tah0 tah0Var = (tah0) i0h0Var;
                                        if (tah0Var.p()) {
                                            tah0Var.w();
                                        } else {
                                            fho0 fho0VarH0 = ufo0Var2.H0();
                                            sac.V(jiu0.a(fho0VarH0), cho0.f4370a, null, fho0VarH0.x.f22085a, new bh0(fho0VarH0, i, yjeVar, (byte) 25), 10);
                                        }
                                    } else {
                                        fho0 fho0VarH1 = ufo0Var2.H0();
                                        sac.V(jiu0.a(fho0VarH1), cho0.f4370a, null, fho0VarH1.x.f22085a, new bh0(fho0VarH1, i, yjeVar, (byte) 25), 10);
                                    }
                                }
                            }
                        } else {
                            dgo0 dgo0Var = (dgo0) ego0Var;
                            s2m0 s2m0Var5 = ufo0.Q1;
                            ufo0Var2.o0().startService(new Intent(dgo0Var.b).setComponent(new ComponentName(ufo0Var2.o0(), dgo0Var.f6052a)));
                        }
                    } else {
                        cgo0 cgo0Var = (cgo0) ego0Var;
                        String str2 = cgo0Var.f4323a;
                        sek0 sek0Var = cgo0Var.b;
                        s2m0 s2m0Var6 = ufo0.Q1;
                        xdk0 xdk0Var = new xdk0(sek0Var, str2, null, null, null, null, 124);
                        wdk0 wdk0Var2 = (wdk0) ((cwi) a8zVar.getValue()).f5081a.q;
                        x1x.y(wdk0Var2);
                        wdk0.k(wdk0Var2, xdk0Var, ufo0Var2, null, null, false, null, 1020);
                    }
                } else {
                    s2m0 s2m0Var7 = ufo0.Q1;
                    ii iiVar = (ii) ((cwi) a8zVar.getValue()).f5081a.p;
                    x1x.y(iiVar);
                    String strH2 = ufo0Var2.H(R.string.attention);
                    String strH3 = ufo0Var2.H(R.string.country_blocking);
                    String strH4 = ufo0Var2.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = ufo0Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                return Unit.f46060a;
        }
    }
}
