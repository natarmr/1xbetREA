package a;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sg3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vg3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg3(vg3 vg3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vg3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vg3 vg3Var = this.k;
        switch (b) {
            case 0:
                sg3 sg3Var = new sg3(vg3Var, yjeVar, (byte) 0);
                sg3Var.j = obj;
                return sg3Var;
            case 1:
                sg3 sg3Var2 = new sg3(vg3Var, yjeVar, (byte) 1);
                sg3Var2.j = obj;
                return sg3Var2;
            case 2:
                sg3 sg3Var3 = new sg3(vg3Var, yjeVar, (byte) 2);
                sg3Var3.j = obj;
                return sg3Var3;
            default:
                sg3 sg3Var4 = new sg3(vg3Var, yjeVar, (byte) 3);
                sg3Var4.j = obj;
                return sg3Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sg3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sg3) create((nh3) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((sg3) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sg3) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        String string;
        byte b = this.i;
        vg3 vg3Var = this.k;
        switch (b) {
            case 0:
                String str = "";
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    Context contextD = vg3Var.D();
                    g0g0Var = contextD != null ? WebSettings.getDefaultUserAgent(contextD) : null;
                    if (g0g0Var == null) {
                        g0g0Var = "";
                    }
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Context contextD2 = vg3Var.D();
                if (contextD2 != null && (string = contextD2.getString(R.string.web_view_not_found)) != null) {
                    str = string;
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = str;
                }
                v6j0 v6j0Var = vg3Var.H0().U.f23840a;
                v6j0Var.getClass();
                v6j0Var.f36880a.g("WEB_VIEW_USER_AGENT", (String) g0g0Var);
                break;
            case 1:
                nh3 nh3Var = (nh3) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hfk0 hfk0Var = vg3.R1;
                vg3Var.G0().b.u(nh3Var, new qg3(vg3Var, (byte) 2));
                break;
            case 2:
                List<String> list = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                for (String str2 : list) {
                    List list2 = u0d.f34849a;
                    u0d.r(vg3Var.o0(), str2);
                }
                break;
            default:
                String str3 = (String) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                List list3 = u0d.f34849a;
                u0d.r(vg3Var.o0(), str3);
                break;
        }
        return Unit.f46060a;
    }
}
