package a;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class ykv0 implements OnCompleteListener, zuw0 {
    public static ykv0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42811a;
    public final Object b;
    public final Object c;

    public ykv0(Context context, kxw0 kxw0Var) {
        this.c = new AtomicLong(-1L);
        this.b = new mmx(context, mmx.n, new mwp0("measurement:api"), mav.c);
        this.f42811a = kxw0Var;
    }

    public synchronized void a(int i, int i2, long j, long j2) {
        ((kxw0) this.f42811a).k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.c;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((mmx) this.b).c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, 0, i2, j, j2, null, null)))).addOnFailureListener(new hac(this, jElapsedRealtime, (byte) 7));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0052 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[Catch: all -> 0x001e, PHI: r6
  0x0065: PHI (r6v7 int) = (r6v1 int), (r6v0 int) binds: [B:12:0x002a, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001e, blocks: (B:4:0x001b, B:19:0x0065, B:22:0x0089, B:13:0x002c, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zuw0
    public void c(String str, int i, Throwable th, byte[] bArr, Map map) {
        fvw0 fvw0Var;
        zlw0 zlw0Var;
        String strSubstring;
        Object obj;
        long j = ((p6x0) this.b).f26479a;
        m6x0 m6x0Var = (m6x0) this.c;
        String str2 = (String) this.f42811a;
        m6x0Var.J().m1();
        m6x0Var.l0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                m6x0Var.u = false;
                m6x0Var.N();
            }
        }
        if (i == 200) {
            if (th == null) {
                zlw0 zlw0Var2 = m6x0Var.c;
                m6x0.T(zlw0Var2);
                zlw0Var2.t1(Long.valueOf(j));
                m6x0Var.r().o.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                fvw0Var = m6x0Var.b;
                m6x0.T(fvw0Var);
                if (fvw0Var.q1()) {
                    zlw0Var = m6x0Var.c;
                    m6x0.T(zlw0Var);
                    if (zlw0Var.s1(str2)) {
                        m6x0Var.o(str2);
                    } else {
                        m6x0Var.M();
                    }
                } else {
                    m6x0Var.M();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                quw0 quw0Var = m6x0Var.r().l;
                Integer numValueOf = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                quw0Var.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                zlw0 zlw0Var3 = m6x0Var.c;
                m6x0.T(zlw0Var3);
                zlw0Var3.y1(Long.valueOf(j));
                m6x0Var.M();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                zlw0 zlw0Var4 = m6x0Var.c;
                m6x0.T(zlw0Var4);
                zlw0Var4.t1(Long.valueOf(j));
                m6x0Var.r().o.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                fvw0Var = m6x0Var.b;
                m6x0.T(fvw0Var);
                if (fvw0Var.q1()) {
                    zlw0Var = m6x0Var.c;
                    m6x0.T(zlw0Var);
                    if (zlw0Var.s1(str2)) {
                        m6x0Var.o(str2);
                    } else {
                        m6x0Var.M();
                    }
                } else {
                    m6x0Var.M();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                quw0 quw0Var2 = m6x0Var.r().l;
                Integer numValueOf2 = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                quw0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                zlw0 zlw0Var5 = m6x0Var.c;
                m6x0.T(zlw0Var5);
                zlw0Var5.y1(Long.valueOf(j));
                m6x0Var.M();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            quw0 quw0Var3 = m6x0Var.r().l;
            Integer numValueOf3 = Integer.valueOf(i);
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            quw0Var3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            zlw0 zlw0Var6 = m6x0Var.c;
            m6x0.T(zlw0Var6);
            zlw0Var6.y1(Long.valueOf(j));
            m6x0Var.M();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        cig0 cig0Var = (cig0) this.f42811a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        nuj0 nuj0Var = cig0Var.f4413a;
        synchronized (nuj0Var) {
            nuj0Var.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public ykv0(m6x0 m6x0Var, String str, p6x0 p6x0Var) {
        this.f42811a = str;
        this.b = p6x0Var;
        this.c = m6x0Var;
    }

    public /* synthetic */ ykv0(Object obj, String str, Comparable comparable) {
        this.f42811a = obj;
        this.b = str;
        this.c = comparable;
    }

    public ykv0(trm0 trm0Var, knf0 knf0Var, mne mneVar) {
        knf0Var.getClass();
        this.f42811a = trm0Var;
        this.b = knf0Var;
        this.c = mneVar;
    }
}
