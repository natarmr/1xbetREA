package a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class ha5 extends eby {
    public static final /* synthetic */ long h = defpackage.a.f0a.objectFieldOffset(ha5.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final n5a e;
    public nwk f;
    public final /* synthetic */ ja5 g;

    public ha5(ja5 ja5Var, n5a n5aVar) {
        this.g = ja5Var;
        this.e = n5aVar;
    }

    @Override // a.eby
    public final void m(Throwable th) throws mvk {
        n5a n5aVar = this.e;
        if (th != null) {
            pfw pfwVarF = n5aVar.F(new udd(th, false), null);
            if (pfwVarF != null) {
                n5aVar.w(pfwVarF);
                ia5 ia5Var = (ia5) defpackage.a.f0a.getObjectVolatile(this, h);
                if (ia5Var != null) {
                    ia5Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ja5.b;
        ja5 ja5Var = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(ja5Var) == 0) {
            jzj[] jzjVarArr = ja5Var.f16173a;
            ArrayList arrayList = new ArrayList(jzjVarArr.length);
            for (jzj jzjVar : jzjVarArr) {
                arrayList.add(jzjVar.getCompleted());
            }
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(arrayList);
        }
    }
}
