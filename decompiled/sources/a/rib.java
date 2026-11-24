package a;

import android.javax.sip.message.Response;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rib implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30533a;
    public final /* synthetic */ g2v b;

    public /* synthetic */ rib(g2v g2vVar, byte b) {
        this.f30533a = b;
        this.b = g2vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object p1m0Var;
        byte b = this.f30533a;
        g2v g2vVar = this.b;
        switch (b) {
            case 0:
                kib kibVar = (kib) obj;
                kibVar.getClass();
                return new lib(kibVar, g2vVar);
            case 1:
                ais aisVar = (ais) obj;
                aisVar.getClass();
                int iOrdinal = aisVar.ordinal();
                if (iOrdinal == 0) {
                    return null;
                }
                g2v g2vVar2 = this.b;
                if (iOrdinal == 1) {
                    return g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal == 2) {
                    return g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal == 3) {
                    return g2v.b(g2vVar2, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                }
                t9f.b();
                return null;
            case 2:
                y690 y690Var = (y690) obj;
                y690Var.getClass();
                return new zun(y690Var, g2vVar);
            case 3:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                String str = (String) a8k0.H(vzg0Var, "SEARCH_QUERY_KEY", "");
                return new tec(true, false, str.length() > 0, str, iun.f15405a, (Set) a8k0.H(vzg0Var, "SELECTED_IDS_KEY", xun.f41520a), g2v.b(this.b, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
            case 4:
                l1m0 l1m0Var = (l1m0) obj;
                l1m0Var.getClass();
                nc5 nc5Var = l1m0Var.g;
                List list = l1m0Var.c;
                z0m0 z0m0Var = new z0m0(l1m0Var.f, ydx.c0(nc5Var), l1m0Var.d);
                if (l1m0Var.f19261a) {
                    return new o1m0(z0m0Var);
                }
                boolean z = l1m0Var.b;
                g2v g2vVar3 = this.b;
                if (z) {
                    p1m0Var = new n1m0(z0m0Var, g2v.d(g2vVar3, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350));
                } else if (list == null || !list.isEmpty()) {
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    xhh0 xhh0Var = l1m0Var.e;
                    if (xhh0Var == null) {
                        xhh0Var = new xhh0("", null, iun.f15405a, false, false);
                    }
                    p1m0Var = new p1m0(z0m0Var, list, xhh0Var);
                } else {
                    p1m0Var = new m1m0(z0m0Var, g2v.d(g2vVar3, pb10.g, null, null, R.string.data_is_missing, 0, null, 478));
                }
                return p1m0Var;
            case 5:
                cdn0 cdn0Var = (cdn0) obj;
                cdn0Var.getClass();
                int iOrdinal2 = cdn0Var.ordinal();
                if (iOrdinal2 == 0) {
                    return null;
                }
                g2v g2vVar4 = this.b;
                if (iOrdinal2 == 1) {
                    return g2v.b(g2vVar4, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal2 == 2) {
                    return g2v.b(g2vVar4, pb10.g, null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                t9f.b();
                return null;
            case 6:
                zan0 zan0Var = (zan0) obj;
                zan0Var.getClass();
                int iOrdinal3 = zan0Var.ordinal();
                if (iOrdinal3 == 0) {
                    return null;
                }
                g2v g2vVar5 = this.b;
                if (iOrdinal3 == 1) {
                    return g2v.b(g2vVar5, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal3 == 2) {
                    return g2v.b(g2vVar5, pb10.g, null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                t9f.b();
                return null;
            case 7:
                ((vzg0) obj).getClass();
                return new h5r0(null, null, false, g2v.b(this.b, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
            default:
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) obj;
                dSLottieEmptyContainer.getClass();
                dSLottieEmptyContainer.a(g2v.d(this.b, pb10.u, null, null, 0, 0, null, 510));
                return Unit.f46060a;
        }
    }
}
