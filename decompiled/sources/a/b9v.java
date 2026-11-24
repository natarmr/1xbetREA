package a;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b9v extends hz5 {
    public static volatile haw0 A;
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    public b9v(Context context, Looper looper, int i, qgd qgdVar, qav qavVar, rav ravVar) {
        d7x0 d7x0VarA = d7x0.a(context);
        oav oavVar = oav.e;
        s0x.H(qavVar);
        s0x.H(ravVar);
        super(context, looper, d7x0VarA, oavVar, i, new zas0((Object) qavVar, (byte) 14), new rkt0(ravVar, (byte) 10), (String) qgdVar.f);
        Set set = (Set) qgdVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                jf4.n("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
        if (A == null) {
            synchronized (b9v.class) {
                try {
                    if (A == null) {
                        context.getPackageName();
                        A = haw0.a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // a.hz5
    public final Account e() {
        return null;
    }

    @Override // a.hz5
    public final Executor g() {
        return A;
    }

    @Override // a.hz5
    public final Set k() {
        return this.z;
    }
}
