package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o51 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24664a;
    public final /* synthetic */ v51 b;

    public /* synthetic */ o51(v51 v51Var, byte b) {
        this.f24664a = b;
        this.b = v51Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24664a;
        v51 v51Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                qek0 qek0Var = v51.a2;
                str.getClass();
                switch (str.hashCode()) {
                    case -2005529504:
                        if (str.equals("PROMO_TAB_TAG")) {
                            v51Var.I0(new jr1(), false);
                        }
                        break;
                    case -1853832169:
                        if (str.equals("PROVIDERS_AGGREGATOR_TAB_TAG")) {
                            v51Var.I0(new kr1(), false);
                        }
                        break;
                    case 1153138883:
                        if (str.equals("AGGREGATOR_CATEGORIES_TAB_TAG")) {
                            v51Var.I0(new fr1(null, null, 3), false);
                        }
                        break;
                    case 1427181229:
                        if (str.equals("MY_AGGREGATOR_TAB_TAG")) {
                            v51Var.I0(new hr1(0L, 3), false);
                        }
                        break;
                    case 1470825538:
                        if (str.equals("FAVORITES_AGGREGATOR_TAB_TAG")) {
                            v51Var.I0(new gr1(), false);
                        }
                        break;
                }
                break;
            case 1:
                eg60 eg60Var = (eg60) obj;
                qek0 qek0Var2 = v51.a2;
                eg60Var.getClass();
                if (v51Var.C().P() > 1) {
                    v51Var.H0().w(false);
                } else {
                    eg60Var.f(false);
                    v51Var.n0().k().c().a();
                }
                break;
            default:
                String str2 = (String) obj;
                qek0 qek0Var3 = v51.a2;
                str2.getClass();
                int iHashCode = str2.hashCode();
                if (iHashCode != -283251288) {
                    if (iHashCode != 973189577) {
                        if (iHashCode == 1153138883 && str2.equals("AGGREGATOR_CATEGORIES_TAB_TAG")) {
                            v51Var.I0(new fr1(null, null, 3), true);
                        }
                    } else if (str2.equals("MY_VIRTUAL_TAB_TAG")) {
                        v51Var.I0(new hr1(0L, 3), true);
                    }
                } else if (str2.equals("FAVORITES_TAB_TAG")) {
                    v51Var.I0(new gr1(), true);
                }
                break;
        }
        return Unit.f46060a;
    }
}
