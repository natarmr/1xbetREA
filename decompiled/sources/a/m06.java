package a;

import android.os.Build;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o24 f20939a;

    public m06() {
        r580 r580Var = new r580((byte) 19);
        o24 o24Var = new o24();
        o24Var.b = r580Var;
        o24Var.c = new s9m0();
        o24Var.d = new ArrayList();
        this.f20939a = o24Var;
    }

    public abstract Object a(om80 om80Var);

    public lm80 b(Throwable th) {
        return new lm80(th);
    }

    public final void c() {
        o24 o24Var = this.f20939a;
        boolean z = false;
        if (!o24Var.f24513a) {
            synchronized (((s9m0) o24Var.c)) {
                if (!o24Var.f24513a) {
                    z = true;
                    o24Var.f24513a = true;
                    List listL0 = CollectionsKt.L0((ArrayList) o24Var.d);
                    ((ArrayList) o24Var.d).clear();
                    r580 r580Var = (r580) o24Var.b;
                    Iterator it = listL0.iterator();
                    while (it.hasNext()) {
                        r580Var.invoke(it.next());
                    }
                }
            }
        }
        if (z && Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Invalidated PagingSource " + this, null);
        }
    }

    public boolean d(Object obj, Object obj2) {
        return Intrinsics.d((lic0) obj, (lic0) obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(km80 km80Var, zje zjeVar) {
        l06 l06Var;
        Object g0g0Var;
        Object obj;
        m06 m06Var;
        if (zjeVar instanceof l06) {
            l06Var = (l06) zjeVar;
            int i = l06Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                l06Var.m = i - Integer.MIN_VALUE;
            } else {
                l06Var = new l06(this, zjeVar);
            }
        } else {
            l06Var = new l06(this, zjeVar);
        }
        Object obj2 = l06Var.k;
        wne wneVar = wne.f39444a;
        int i2 = l06Var.m;
        try {
            if (i2 == 0) {
                z1x.P(obj2);
                e0g0 e0g0Var = j0g0.b;
                l06Var.i = km80Var;
                l06Var.j = this;
                l06Var.m = 1;
                Serializable serializableF = f(km80Var, l06Var);
                if (serializableF == wneVar) {
                    return wneVar;
                }
                obj = serializableF;
                m06Var = this;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m06 m06Var2 = l06Var.j;
                km80 km80Var2 = l06Var.i;
                z1x.P(obj2);
                m06Var = m06Var2;
                km80Var = km80Var2;
                obj = obj2;
            }
            Pair pair = (Pair) obj;
            Object obj3 = pair.f46059a;
            g0g0Var = (nm80) pair.b;
            if (!(km80Var instanceof jm80) && m06Var.d(km80Var.a(), obj3)) {
                throw new ff5(null);
            }
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        return thA == null ? g0g0Var : b(thA);
    }

    public abstract Serializable f(km80 km80Var, yje yjeVar);
}
