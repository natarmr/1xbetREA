package a;

import android.os.Handler;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i44 implements sg00, xbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f14127a;

    public /* synthetic */ i44(long j) {
        this.f14127a = j;
    }

    @Override // a.xbf
    public Object c(Object obj) {
        ((m1r) obj).getClass();
        dm60.P1.getClass();
        dm60 dm60Var = new dm60();
        dm60Var.s0(i120.V(new Pair("OPEN_GAME_ID_KEY", Long.valueOf(this.f14127a)), new Pair("OPEN_GAME_NAME_KEY", "")));
        return dm60Var;
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        yox yoxVar;
        ksj ksjVar = (ksj) obj;
        osj osjVar = ksjVar.f18815a;
        if (ksjVar == osjVar.j && (yoxVar = osjVar.n) != null) {
            fm30 fm30Var = (fm30) yoxVar.f43005a;
            fm30Var.x2 = true;
            xex xexVar = fm30Var.l2;
            Handler handler = (Handler) xexVar.f40764a;
            if (handler != null) {
                handler.post(new w34(xexVar, this.f14127a));
            }
        }
    }
}
