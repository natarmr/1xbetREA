package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class ae00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ce00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae00(ce00 ce00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ce00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ce00 ce00Var = this.k;
        switch (b) {
            case 0:
                ae00 ae00Var = new ae00(ce00Var, yjeVar, (byte) 0);
                ae00Var.j = obj;
                return ae00Var;
            case 1:
                ae00 ae00Var2 = new ae00(ce00Var, yjeVar, (byte) 1);
                ae00Var2.j = obj;
                return ae00Var2;
            default:
                ae00 ae00Var3 = new ae00(ce00Var, yjeVar, (byte) 2);
                ae00Var3.j = obj;
                return ae00Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ae00) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ae00) create((se00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ae00) create((pe00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        byte b = this.i;
        ce00 ce00Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                wsz wszVar = ce00.P1;
                ((vd00) ce00Var.O1.getValue()).A(list);
                return Unit.f46060a;
            case 1:
                se00 se00Var = (se00) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(se00Var, qe00.f28558a)) {
                    wsz wszVar2 = ce00.P1;
                    ce00Var.G0().b.setVisibility(0);
                    ce00Var.G0().c.setVisibility(8);
                } else {
                    if (!Intrinsics.d(se00Var, re00.f30312a)) {
                        t9f.b();
                        return null;
                    }
                    wsz wszVar3 = ce00.P1;
                    ce00Var.G0().b.setVisibility(8);
                    ce00Var.G0().c.setVisibility(0);
                }
                return Unit.f46060a;
            default:
                ce00 ce00Var2 = this.k;
                a8z a8zVar = ce00Var2.M1;
                pe00 pe00Var = (pe00) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!(pe00Var instanceof ke00)) {
                    if (pe00Var instanceof ne00) {
                        ne00 ne00Var = (ne00) pe00Var;
                        String strA = ne00Var.a();
                        sek0 sek0Var = ne00Var.f23359a;
                        wsz wszVar4 = ce00.P1;
                        xdk0 xdk0Var = new xdk0(sek0Var, strA, null, null, null, null, 124);
                        wdk0 wdk0Var = (wdk0) ((uji) a8zVar.getValue()).f35781a.q;
                        x1x.y(wdk0Var);
                        wdk0.k(wdk0Var, xdk0Var, ce00Var2, null, null, false, null, 1020);
                    } else if (pe00Var instanceof oe00) {
                        oe00 oe00Var = (oe00) pe00Var;
                        wsz wszVar5 = ce00.P1;
                        ce00Var2.o0().startService(new Intent(oe00Var.b).setComponent(new ComponentName(ce00Var2.o0(), oe00Var.f25099a)));
                    } else if (Intrinsics.d(pe00Var, je00.f16352a)) {
                        wsz wszVar6 = ce00.P1;
                        kcx.G(ce00Var2.G0().b, 0);
                    } else if (pe00Var instanceof ie00) {
                        wsz wszVar7 = ce00.P1;
                        db dbVar = ((uji) a8zVar.getValue()).f35781a;
                        androidx.fragment.app.e eVarC = ce00Var2.C();
                        eVarC.getClass();
                        jvp0 jvp0Var = jvp0.f17215a;
                        s9m0.m(eVarC);
                    } else {
                        if (!(pe00Var instanceof he00)) {
                            t9f.b();
                            return null;
                        }
                        Context contextO0 = ce00Var2.o0();
                        String str = ((he00) pe00Var).f12897a;
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
                            wdk0 wdk0Var2 = (wdk0) ((uji) a8zVar.getValue()).f35781a.q;
                            x1x.y(wdk0Var2);
                            rek0 rek0Var = rek0.b;
                            String strH = ce00Var2.H(R.string.open_browser_error_message);
                            strH.getClass();
                            wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), ce00Var2, null, null, false, null, 1020);
                        }
                    }
                    break;
                } else {
                    wsz wszVar8 = ce00.P1;
                    ii iiVar = (ii) ((uji) a8zVar.getValue()).f35781a.p;
                    x1x.y(iiVar);
                    String strH2 = ce00Var2.H(R.string.attention);
                    String strH3 = ce00Var2.H(R.string.country_blocking);
                    String strH4 = ce00Var2.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = ce00Var2.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                }
                return Unit.f46060a;
        }
    }
}
