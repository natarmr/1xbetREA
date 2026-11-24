package a;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class bdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ntu f2417a;

    public bdu(ntu ntuVar) {
        this.f2417a = ntuVar;
    }

    public String a() {
        return ohs0.n(this.f2417a.a(), "/getZone/web_nz/index_android.html");
    }

    public Map b(int i) {
        this.f2417a.a().getClass();
        return wp20.b(new Pair("HTTP_X_PROJECT_ID", String.valueOf(i)));
    }

    public bdu(sqt sqtVar, ntu ntuVar) {
        this.f2417a = ntuVar;
    }
}
