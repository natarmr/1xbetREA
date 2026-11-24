package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class j8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8(l8 l8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l8 l8Var = this.k;
        switch (b) {
            case 0:
                j8 j8Var = new j8(l8Var, yjeVar, (byte) 0);
                j8Var.j = obj;
                return j8Var;
            default:
                j8 j8Var2 = new j8(l8Var, yjeVar, (byte) 1);
                j8Var2.j = obj;
                return j8Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j8) create((ha) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j8) create((ea) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        switch (this.i) {
            case 0:
                ha haVar = (ha) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(haVar, ga.f10941a);
                l8 l8Var = this.k;
                if (zD) {
                    pek0 pek0Var = l8.P1;
                    l8Var.G0().b.setVisibility(8);
                    l8Var.G0().c.setVisibility(0);
                } else {
                    if (!Intrinsics.d(haVar, fa.f9180a)) {
                        t9f.b();
                        return null;
                    }
                    pek0 pek0Var2 = l8.P1;
                    l8Var.G0().b.setVisibility(0);
                    l8Var.G0().c.setVisibility(8);
                }
                return Unit.f46060a;
            default:
                l8 l8Var2 = this.k;
                a8z a8zVar = l8Var2.N1;
                ea eaVar = (ea) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(eaVar instanceof ba)) {
                    if (eaVar instanceof ca) {
                        ca caVar = (ca) eaVar;
                        String str = caVar.f3984a;
                        sek0 sek0Var = caVar.b;
                        pek0 pek0Var3 = l8.P1;
                        wdk0.k(((s5i) a8zVar.getValue()).b(), new xdk0(sek0Var, str, null, null, null, null, 124), l8Var2, null, null, false, null, 1020);
                    } else if (eaVar instanceof da) {
                        da daVar = (da) eaVar;
                        l8Var2.o0().startService(new Intent(daVar.b).setComponent(new ComponentName(l8Var2.o0(), daVar.f5723a)));
                    } else if (Intrinsics.d(eaVar, aa.f499a)) {
                        pek0 pek0Var4 = l8.P1;
                        kcx.G(l8Var2.G0().b, 0);
                    } else if (eaVar instanceof z9) {
                        pek0 pek0Var5 = l8.P1;
                        db dbVar = ((s5i) a8zVar.getValue()).f31654a;
                        androidx.fragment.app.e eVarC = l8Var2.C();
                        eVarC.getClass();
                        jvp0 jvp0Var = jvp0.f17215a;
                        s9m0.m(eVarC);
                    } else {
                        if (!(eaVar instanceof y9)) {
                            t9f.b();
                            return null;
                        }
                        Context contextO0 = l8Var2.o0();
                        String str2 = ((y9) eaVar).f42220a;
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(str2));
                            contextO0.startActivity(intent);
                            g0g0Var = Unit.f46060a;
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        if (j0g0.a(g0g0Var) != null) {
                            wdk0 wdk0VarB = ((s5i) a8zVar.getValue()).b();
                            rek0 rek0Var = rek0.b;
                            String strH = l8Var2.H(R.string.open_browser_error_message);
                            strH.getClass();
                            wdk0.k(wdk0VarB, new xdk0(rek0Var, strH, null, null, null, null, 124), l8Var2, null, null, false, null, 1020);
                        }
                    }
                    break;
                } else {
                    pek0 pek0Var6 = l8.P1;
                    ii iiVar = (ii) ((s5i) a8zVar.getValue()).f31654a.p;
                    x1x.y(iiVar);
                    String strH2 = l8Var2.H(R.string.attention);
                    String strH3 = l8Var2.H(R.string.country_blocking);
                    String strH4 = l8Var2.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = l8Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                return Unit.f46060a;
        }
    }
}
