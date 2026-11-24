package a;

import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pks implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27150a = 0;
    public final /* synthetic */ yks b;
    public final /* synthetic */ fsr c;

    public /* synthetic */ pks(fsr fsrVar, yks yksVar) {
        this.c = fsrVar;
        this.b = yksVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tf50 tf50Var;
        o49 o49Var;
        byte b = this.f27150a;
        yks yksVar = this.b;
        switch (b) {
            case 0:
                njs njsVarA = njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, tf50.b, o49.f24622a, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, true, false, false, false, false, this.c, null, null, null, null, null, null, null, null, null, -134219265, 65503);
                vzg0 vzg0Var = yksVar.o;
                vzg0Var.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA.j);
                vzg0Var.e("KEY_BROADCASTING_TAB", njsVarA.k);
                return njsVarA;
            default:
                njs njsVar = (njs) obj2;
                SportGameLiteScreenParams sportGameLiteScreenParams = yksVar.p;
                vzg0 vzg0Var2 = yksVar.o;
                int iOrdinal = sportGameLiteScreenParams.d.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    tf50Var = tf50.b;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    tf50Var = njsVar.j;
                }
                tf50 tf50Var2 = tf50Var;
                int iOrdinal2 = sportGameLiteScreenParams.d.ordinal();
                if (iOrdinal2 == 0) {
                    o49Var = o49.f24622a;
                } else if (iOrdinal2 == 1) {
                    o49Var = o49.b;
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    o49Var = njsVar.k;
                }
                njs njsVarA2 = njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, tf50Var2, o49Var, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, this.c, null, null, null, null, null, null, null, null, null, -1537, 65503);
                vzg0Var2.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA2.j);
                vzg0Var2.e("KEY_BROADCASTING_TAB", njsVarA2.k);
                return njsVarA2;
        }
    }

    public /* synthetic */ pks(yks yksVar, fsr fsrVar) {
        this.b = yksVar;
        this.c = fsrVar;
    }
}
