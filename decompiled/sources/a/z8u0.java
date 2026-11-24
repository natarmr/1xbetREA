package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class z8u0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a9u0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8u0(a9u0 a9u0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a9u0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a9u0 a9u0Var = this.k;
        switch (b) {
            case 0:
                z8u0 z8u0Var = new z8u0(a9u0Var, yjeVar, (byte) 0);
                z8u0Var.j = obj;
                return z8u0Var;
            default:
                z8u0 z8u0Var2 = new z8u0(a9u0Var, yjeVar, (byte) 1);
                z8u0Var2.j = obj;
                return z8u0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z8u0) create((h9u0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z8u0) create((d9u0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a9u0 a9u0Var;
        Context contextD;
        Object g0g0Var;
        switch (this.i) {
            case 0:
                h9u0 h9u0Var = (h9u0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = h9u0Var instanceof f9u0;
                a9u0 a9u0Var2 = this.k;
                if (z) {
                    ArrayList arrayList = ((f9u0) h9u0Var).f9173a;
                    uxs0 uxs0Var = a9u0.R1;
                    ((m8u0) a9u0Var2.Q1.getValue()).A(arrayList);
                    ((ProgressBar) a9u0Var2.G0().c.b).setVisibility(8);
                    a9u0Var2.G0().b.setVisibility(8);
                    a9u0Var2.G0().d.setVisibility(0);
                } else if (h9u0Var instanceof g9u0) {
                    ra10 ra10Var = ((g9u0) h9u0Var).f10932a;
                    uxs0 uxs0Var2 = a9u0.R1;
                    a9u0Var2.G0().b.v(ra10Var);
                    ((ProgressBar) a9u0Var2.G0().c.b).setVisibility(8);
                    a9u0Var2.G0().b.setVisibility(0);
                    a9u0Var2.G0().d.setVisibility(8);
                } else if (Intrinsics.d(h9u0Var, e9u0.f7441a)) {
                    uxs0 uxs0Var3 = a9u0.R1;
                    ((ProgressBar) a9u0Var2.G0().c.b).setVisibility(0);
                    a9u0Var2.G0().b.setVisibility(8);
                    a9u0Var2.G0().d.setVisibility(8);
                }
                return Unit.f46060a;
            default:
                d9u0 d9u0Var = (d9u0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (d9u0Var != null && (contextD = (a9u0Var = this.k).D()) != null) {
                    String str = d9u0Var.f5719a;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(str));
                        contextD.startActivity(intent);
                        g0g0Var = Unit.f46060a;
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        wdk0 wdk0Var = a9u0Var.N1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH = a9u0Var.H(R.string.open_browser_error_message);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), a9u0Var, null, null, false, null, 1020);
                    }
                    break;
                }
                return Unit.f46060a;
        }
    }
}
