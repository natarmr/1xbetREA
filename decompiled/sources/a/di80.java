package a;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class di80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m91 f6126a;
    public final Object b;
    public final el80 c;
    public final ehf0 d = new ehf0((byte) 22);
    public final ehf0 e = new ehf0((byte) 22);
    public final gmq f = idx.S(new wk70(this, null, 22));

    public di80(m91 m91Var, dfs0 dfs0Var, el80 el80Var) {
        this.f6126a = m91Var;
        this.b = dfs0Var;
        this.c = el80Var;
    }

    public static void b(di80 di80Var) {
        di80Var.d.u(new yh80(true, zh80.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(m06 m06Var, zje zjeVar) {
        ci80 ci80Var;
        m06 m06Var2;
        if (zjeVar instanceof ci80) {
            ci80Var = (ci80) zjeVar;
            int i = ci80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ci80Var.l = i - Integer.MIN_VALUE;
            } else {
                ci80Var = new ci80(this, zjeVar);
            }
        } else {
            ci80Var = new ci80(this, zjeVar);
        }
        Object objInvoke = ci80Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ci80Var.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objInvoke);
            m91 m91Var = this.f6126a;
            ci80Var.i = m06Var;
            ci80Var.l = 1;
            objInvoke = m91Var.invoke(ci80Var);
            if (objInvoke == wneVar) {
                return wneVar;
            }
            m06Var2 = m06Var;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m06 m06Var3 = ci80Var.i;
            z1x.P(objInvoke);
            m06Var2 = m06Var3;
        }
        m06 m06Var4 = (m06) objInvoke;
        if (m06Var4 == m06Var2) {
            jf4.n("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
            return null;
        }
        Class<di80> cls = di80.class;
        cz60 cz60Var = new cz60(0, this, cls, "invalidate", "invalidate()V", 0, (byte) 12);
        m06Var4.getClass();
        o24 o24Var = m06Var4.f20939a;
        if (o24Var.f24513a) {
            ((r580) o24Var.b).invoke(cz60Var);
        } else {
            synchronized (((s9m0) o24Var.c)) {
                if (!o24Var.f24513a) {
                    ((ArrayList) o24Var.d).add(cz60Var);
                    z = false;
                }
            }
            if (z) {
                ((r580) o24Var.b).invoke(cz60Var);
            }
        }
        if (m06Var2 != null) {
            cz60 cz60Var2 = new cz60(0, this, cls, "invalidate", "invalidate()V", 0, (byte) 13);
            o24 o24Var2 = m06Var2.f20939a;
            synchronized (((s9m0) o24Var2.c)) {
                ((ArrayList) o24Var2.d).remove(cz60Var2);
            }
        }
        if (m06Var2 != null) {
            m06Var2.c();
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Generated new PagingSource " + m06Var4, null);
        }
        return m06Var4;
    }
}
