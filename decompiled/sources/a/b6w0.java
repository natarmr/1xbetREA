package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class b6w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5w0 f2077a;
    public final v5w0 b;
    public final v5w0 c;

    public b6w0(kii0 kii0Var) {
        this.f2077a = new v5w0(kii0Var, (byte) 0);
        this.b = new v5w0(kii0Var, (byte) 1);
        this.c = new v5w0(kii0Var, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable a(zg40 zg40Var, zje zjeVar) {
        w5w0 w5w0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof w5w0) {
            w5w0Var = (w5w0) zjeVar;
            int i = w5w0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5w0Var.m = i - Integer.MIN_VALUE;
            } else {
                w5w0Var = new w5w0(this, zjeVar);
            }
        } else {
            w5w0Var = new w5w0(this, zjeVar);
        }
        Object objA = w5w0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = w5w0Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                w4w0 w4w0Var = (w4w0) this.b.invoke();
                String str = "https://" + zg40Var.getHostName() + "/status.json";
                w5w0Var.i = zg40Var;
                w5w0Var.j = this;
                w5w0Var.m = 1;
                objA = w4w0Var.a(str, w5w0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = w5w0Var.j;
                zg40Var = w5w0Var.i;
                z1x.P(objA);
            }
            jtf0 jtf0Var = (jtf0) objA;
            String hostName = zg40Var.getHostName();
            if (hostName == null) {
                hostName = "";
            }
            boolean z = jtf0Var.f17098a.q;
            this.getClass();
            g0g0Var = "domain=" + hostName + "&status=" + (z ? 1 : 0);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        String hostName2 = zg40Var.getHostName();
        return g0g0Var instanceof g0g0 ? kng0.l("domain=", hostName2 != null ? hostName2 : "", "&status=0") : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00aa -> B:31:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f6 -> B:39:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b6w0.b(java.lang.String, a.zje):java.lang.Object");
    }
}
