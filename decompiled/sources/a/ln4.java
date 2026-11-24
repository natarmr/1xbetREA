package a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import org.xplatform.authreminder.impl.data.AuthReminderBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class ln4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f20325a;

    public /* synthetic */ ln4(us00 us00Var) {
        this.f20325a = us00Var;
    }

    public boolean a(String str) {
        List list = u0d.f34849a;
        String strB = u0d.b(str);
        Context applicationContext = this.f20325a.getApplicationContext();
        applicationContext.getClass();
        gbe0 gbe0VarA = o5k0.a(applicationContext);
        jbe0 jbe0VarD = gbe0VarA.d();
        if ((jbe0VarD != null ? jbe0VarD.a(new jr30(strB)) : null) != null) {
            return true;
        }
        bbe0 bbe0Var = (bbe0) gbe0VarA.f11014a.e.getValue();
        if (bbe0Var == null) {
            return false;
        }
        hvk hvkVar = bbe0Var.b;
        qg9 qg9Var = qg9.d;
        fvk fvkVarD = hvkVar.d(gl5.i(strB).d("SHA-256").f());
        abe0 abe0Var = fvkVarD != null ? new abe0(fvkVarD) : null;
        if (abe0Var == null) {
            return false;
        }
        ay3.L(abe0Var, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:15:0x0049->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0087 -> B:22:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object b(java.util.List r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.me8
            if (r0 == 0) goto L13
            r0 = r10
            a.me8 r0 = (a.me8) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.me8 r0 = new a.me8
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            java.util.Iterator r9 = r0.k
            a.gbe0 r2 = r0.j
            android.content.Context r5 = r0.i
            a.z1x.P(r10)
            goto L8a
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L34:
            a.z1x.P(r10)
            a.us00 r10 = r8.f20325a
            android.content.Context r10 = r10.getApplicationContext()
            r10.getClass()
            a.gbe0 r2 = a.o5k0.a(r10)
            java.util.Iterator r9 = r9.iterator()
            r5 = r10
        L49:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La8
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r6 = r8.a(r10)
            if (r6 != 0) goto L49
            java.util.List r6 = a.u0d.f34849a
            java.lang.String r6 = a.u0d.b(r10)
            a.k1x r7 = new a.k1x
            r5.getClass()
            r7.<init>(r5)
            r7.c = r10
            r7.i = r6
            r7.f = r6
            a.vi9 r10 = a.vi9.c
            r7.m = r10
            r7.n = r10
            r7.o = r10
            a.o1x r10 = r7.a()
            r0.i = r5
            r0.j = r2
            r0.k = r9
            r0.n = r3
            java.lang.Object r10 = r2.c(r10, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            a.u1x r10 = (a.u1x) r10
            boolean r6 = r10 instanceof a.hhn0
            if (r6 != 0) goto L49
            boolean r6 = r10 instanceof a.r1o
            if (r6 == 0) goto L97
            a.r1o r10 = (a.r1o) r10
            goto L98
        L97:
            r10 = r4
        L98:
            if (r10 == 0) goto L49
            java.lang.Throwable r10 = r10.c
            boolean r6 = a.saj.Y(r10)
            if (r6 != 0) goto La7
            boolean r6 = r10 instanceof java.io.IOException
            if (r6 != 0) goto La7
            goto L49
        La7:
            throw r10
        La8:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ln4.b(java.util.List, a.zje):java.lang.Object");
    }

    public void c(Bundle bundle, int i, long j) {
        us00 us00Var = this.f20325a;
        Object systemService = us00Var.getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager == null) {
            return;
        }
        Intent intentPutExtras = new Intent(us00Var, (Class<?>) AuthReminderBroadcastReceiver.class).putExtras(bundle);
        intentPutExtras.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(us00Var, i, intentPutExtras, 67108864);
        broadcast.getClass();
        alarmManager.setExact(1, j, broadcast);
    }
}
