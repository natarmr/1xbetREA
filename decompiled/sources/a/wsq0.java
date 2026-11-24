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
public final class wsq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xsq0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsq0(xsq0 xsq0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xsq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xsq0 xsq0Var = this.k;
        switch (b) {
            case 0:
                wsq0 wsq0Var = new wsq0(xsq0Var, yjeVar, (byte) 0);
                wsq0Var.j = obj;
                return wsq0Var;
            default:
                wsq0 wsq0Var2 = new wsq0(xsq0Var, yjeVar, (byte) 1);
                wsq0Var2.j = obj;
                return wsq0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wsq0) create((ktq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wsq0) create((htq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        switch (this.i) {
            case 0:
                ktq0 ktq0Var = (ktq0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(ktq0Var, jtq0.f17113a);
                xsq0 xsq0Var = this.k;
                if (zD) {
                    y2m0 y2m0Var = xsq0.P1;
                    xsq0Var.G0().c.setVisibility(8);
                    xsq0Var.G0().b.setVisibility(0);
                } else {
                    if (!Intrinsics.d(ktq0Var, itq0.f15366a)) {
                        t9f.b();
                        return null;
                    }
                    y2m0 y2m0Var2 = xsq0.P1;
                    xsq0Var.G0().c.setVisibility(0);
                    xsq0Var.G0().b.setVisibility(8);
                }
                return Unit.f46060a;
            default:
                xsq0 xsq0Var2 = this.k;
                a8z a8zVar = xsq0Var2.N1;
                htq0 htq0Var = (htq0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(htq0Var instanceof etq0)) {
                    if (htq0Var instanceof ftq0) {
                        ftq0 ftq0Var = (ftq0) htq0Var;
                        String str = ftq0Var.f10127a;
                        sek0 sek0Var = ftq0Var.b;
                        y2m0 y2m0Var3 = xsq0.P1;
                        wdk0.k(((s5i) a8zVar.getValue()).b(), new xdk0(sek0Var, str, null, null, null, null, 124), xsq0Var2, null, null, false, null, 1020);
                    } else if (htq0Var instanceof gtq0) {
                        gtq0 gtq0Var = (gtq0) htq0Var;
                        xsq0Var2.o0().startService(new Intent(gtq0Var.b).setComponent(new ComponentName(xsq0Var2.o0(), gtq0Var.f11893a)));
                    } else if (Intrinsics.d(htq0Var, dtq0.f6667a)) {
                        y2m0 y2m0Var4 = xsq0.P1;
                        kcx.G(xsq0Var2.G0().c, 0);
                    } else if (htq0Var instanceof ctq0) {
                        y2m0 y2m0Var5 = xsq0.P1;
                        db dbVar = ((s5i) a8zVar.getValue()).f31654a;
                        androidx.fragment.app.e eVarC = xsq0Var2.C();
                        eVarC.getClass();
                        jvp0 jvp0Var = jvp0.f17215a;
                        s9m0.m(eVarC);
                    } else {
                        if (!(htq0Var instanceof btq0)) {
                            t9f.b();
                            return null;
                        }
                        Context contextO0 = xsq0Var2.o0();
                        String str2 = ((btq0) htq0Var).f3195a;
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
                            String strH = xsq0Var2.H(R.string.open_browser_error_message);
                            strH.getClass();
                            wdk0.k(wdk0VarB, new xdk0(rek0Var, strH, null, null, null, null, 124), xsq0Var2, null, null, false, null, 1020);
                        }
                    }
                    break;
                } else {
                    y2m0 y2m0Var6 = xsq0.P1;
                    ii iiVar = (ii) ((s5i) a8zVar.getValue()).f31654a.p;
                    x1x.y(iiVar);
                    String strH2 = xsq0Var2.H(R.string.attention);
                    String strH3 = xsq0Var2.H(R.string.country_blocking);
                    String strH4 = xsq0Var2.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = xsq0Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                return Unit.f46060a;
        }
    }
}
