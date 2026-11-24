package a;

import android.webkit.CookieManager;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vax implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37112a;
    public final /* synthetic */ yax b;

    public /* synthetic */ vax(yax yaxVar, byte b) {
        this.f37112a = b;
        this.b = yaxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i1w0 i1w0Var;
        ListIterator listIteratorP;
        byte b = this.f37112a;
        yax yaxVar = this.b;
        switch (b) {
            case 0:
                art artVar = yax.S1;
                i1w0 i1w0VarF = a4n0.f(yaxVar);
                cji cjiVar = yaxVar.L1;
                if (cjiVar != null) {
                    return new ry3(i1w0VarF, cjiVar);
                }
                Intrinsics.h("infoWebViewModelFactory");
                throw null;
            case 1:
                z7z z7zVar = yaxVar.M1;
                if (z7zVar == null) {
                    Intrinsics.h("lottieConfigurator");
                    throw null;
                }
                Object obj = z7zVar.get();
                obj.getClass();
                return sa10.b((sa10) obj, pb10.g, R.string.data_retrieval_error, 0, null, 28);
            default:
                art artVar2 = yax.S1;
                try {
                    CookieManager.getInstance().removeAllCookies(null);
                    CookieManager.getInstance().flush();
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (!pawVar.hasNext()) {
                            return Unit.f46060a;
                        }
                        i1w0Var.a((oe50) pawVar.next());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i1w0Var = ((ibx) yaxVar.O1.getValue()).b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                break;
        }
    }
}
