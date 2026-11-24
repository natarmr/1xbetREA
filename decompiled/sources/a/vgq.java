package a;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes2.dex */
public final class vgq implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37394a = 1;
    public final n5d0 b;
    public final n5d0 c;
    public final n5d0 d;
    public final n5d0 e;
    public final n5d0 f;
    public final n5d0 g;
    public final n5d0 h;

    public vgq(svs0 svs0Var, n5d0 n5d0Var, n5d0 n5d0Var2, n5d0 n5d0Var3, n5d0 n5d0Var4, n5d0 n5d0Var5, n5d0 n5d0Var6, n5d0 n5d0Var7) {
        this.b = n5d0Var;
        this.c = n5d0Var2;
        this.d = n5d0Var3;
        this.e = n5d0Var4;
        this.f = n5d0Var5;
        this.g = n5d0Var6;
        this.h = n5d0Var7;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f37394a;
        n5d0 n5d0Var = this.h;
        n5d0 n5d0Var2 = this.g;
        n5d0 n5d0Var3 = this.f;
        n5d0 n5d0Var4 = this.e;
        n5d0 n5d0Var5 = this.d;
        n5d0 n5d0Var6 = this.c;
        n5d0 n5d0Var7 = this.b;
        switch (b) {
            case 0:
                return new sgq((nfq) ((ugq) n5d0Var7).get(), (p5d0) ((ugq) n5d0Var6).get(), (dgq) ((ugq) n5d0Var5).get(), (p5d0) ((ugq) n5d0Var4).get(), (RemoteConfigManager) ((p8i) n5d0Var3).get(), (hsd) ((p8i) n5d0Var2).get(), (SessionManager) ((p8i) n5d0Var).get());
            default:
                d5w0 d5w0Var = (d5w0) n5d0Var7.get();
                b5w0 b5w0Var = (b5w0) n5d0Var6.get();
                f5w0 f5w0Var = (f5w0) n5d0Var5.get();
                bwt bwtVar = (bwt) n5d0Var4.get();
                izx izxVar = (izx) n5d0Var3.get();
                wo10 wo10Var = (wo10) n5d0Var2.get();
                y2w0 y2w0Var = (y2w0) n5d0Var.get();
                d5w0Var.getClass();
                b5w0Var.getClass();
                f5w0Var.getClass();
                bwtVar.getClass();
                izxVar.getClass();
                wo10Var.getClass();
                y2w0Var.getClass();
                return new cyh(d5w0Var, b5w0Var, bwtVar, izxVar, wo10Var, f5w0Var, y2w0Var);
        }
    }

    public vgq(ugq ugqVar, ugq ugqVar2, ugq ugqVar3, ugq ugqVar4, p8i p8iVar, p8i p8iVar2, p8i p8iVar3) {
        this.b = ugqVar;
        this.c = ugqVar2;
        this.d = ugqVar3;
        this.e = ugqVar4;
        this.f = p8iVar;
        this.g = p8iVar2;
        this.h = p8iVar3;
    }
}
