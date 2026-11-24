package a;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class msn extends rcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yp2 f22328a;

    public msn(yp2 yp2Var) {
        this.f22328a = yp2Var;
    }

    @Override // a.rcb
    public final void a1(Throwable th) {
        ((qsn) this.f22328a.f43010a).f(th);
    }

    @Override // a.rcb
    public final void b1(dgu dguVar) {
        yp2 yp2Var = this.f22328a;
        yp2Var.c = dguVar;
        dgu dguVar2 = (dgu) yp2Var.c;
        qsn qsnVar = (qsn) yp2Var.f43010a;
        yp2Var.b = new lhf0(dguVar2, qsnVar.g, qsnVar.i, Build.VERSION.SDK_INT >= 34 ? wsn.a() : vdb.e0());
        qsn qsnVar2 = (qsn) yp2Var.f43010a;
        ArrayList arrayList = new ArrayList();
        qsnVar2.f29266a.writeLock().lock();
        try {
            qsnVar2.c = (byte) 1;
            arrayList.addAll(qsnVar2.b);
            qsnVar2.b.clear();
            qsnVar2.f29266a.writeLock().unlock();
            qsnVar2.d.post(new osn(arrayList, qsnVar2.c, null));
        } catch (Throwable th) {
            qsnVar2.f29266a.writeLock().unlock();
            throw th;
        }
    }
}
