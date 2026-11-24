package a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ehf0 f10396a = new ehf0((byte) 15);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.ru, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    public final ru a(Context context, q15 q15Var, n2a n2aVar, long j, l4a l4aVar, trm0 trm0Var) throws nbx {
        ?? arrayList;
        context.getClass();
        n0o0 n0o0VarB = maz.b(new mr0(this, context, q15Var, j == -1 ? null : new zen(j), (byte) 6));
        if (l4aVar == null) {
            l4aVar = new l4a(b780.j((wy40) new fvt0().f10231a));
        }
        context.getClass();
        q15Var.getClass();
        ?? ruVar = new ru();
        ruVar.f31100a = n0o0VarB;
        ruVar.b = n2aVar;
        ruVar.c = trm0Var;
        ruVar.d = l4aVar;
        ruVar.e = new wy9((m1a) n0o0VarB.getValue(), ((m1a) n0o0VarB.getValue()).b());
        n0o0 n0o0VarB2 = maz.b(new mr0(context, q15Var, ruVar, this.f10396a, (byte) 5));
        ruVar.g = n0o0VarB2;
        ruVar.h = xun.f41520a;
        ruVar.i = new Object();
        ruVar.j = new AtomicBoolean(false);
        ArrayList arrayListA = zy9.a(((cbi) n0o0VarB2.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(r3d.q(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((g0a) it.next()).f10449a);
            }
        } else {
            arrayList = iun.f15405a;
        }
        vae0 vae0Var = ((m1a) ((n0o0) ruVar.f31100a).getValue()).b().d().b.k;
        Executor executor = q15Var.f27934a;
        executor.getClass();
        ruVar.f = new jrs0(vae0Var, d5c.a(obb.Y(executor)), arrayList, context);
        ruVar.t(arrayList);
        return ruVar;
    }
}
