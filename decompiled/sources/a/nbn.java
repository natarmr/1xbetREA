package a;

import java.util.ArrayList;
import java.util.Map;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nbn implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23250a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nbn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.f23250a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f23250a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((kki) obj6).b((s0a) obj5, (s0a) obj4, (cmn0) obj3, (cmn0) obj2, (Map.Entry) obj);
                break;
            default:
                kie0 kie0Var = (kie0) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                GamesManiaMapView gamesManiaMapView = (GamesManiaMapView) obj3;
                String str = (String) obj2;
                b8t b8tVar = (b8t) obj;
                iiy[] iiyVarArr = b8t.Q1;
                if (kie0Var.f18333a < arrayList.size() && kie0Var.f18333a < arrayList2.size()) {
                    k7t k7tVar = (k7t) arrayList.get(kie0Var.f18333a);
                    k7t k7tVar2 = (k7t) arrayList2.get(kie0Var.f18333a);
                    k7tVar.getClass();
                    k7tVar2.getClass();
                    str.getClass();
                    gamesManiaMapView.g1 = 0;
                    gamesManiaMapView.n = GamesManiaMapView.r(k7tVar.e);
                    gamesManiaMapView.f1 = k7tVar.d;
                    gamesManiaMapView.b(k7tVar, k7tVar2, str, true);
                }
                b8tVar.H0().f.b(500L, gamesManiaMapView.getShotsValue$games_mania());
                gamesManiaMapView.postInvalidateDelayed(1000L);
                b8tVar.I0().y();
                kie0Var.f18333a++;
                break;
        }
    }
}
