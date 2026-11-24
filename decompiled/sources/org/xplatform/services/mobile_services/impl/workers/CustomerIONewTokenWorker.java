package org.xplatform.services.mobile_services.impl.workers;

import a.af3;
import a.b1j;
import a.bzt;
import a.clc;
import a.fsd;
import a.h760;
import a.iqt;
import a.iw20;
import a.jf4;
import a.jzf;
import a.lp4;
import a.o5d0;
import a.pru;
import a.roi0;
import a.u760;
import a.uii;
import a.vyf;
import a.x1u;
import a.ze3;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CustomerIONewTokenWorker extends CoroutineWorker {
    public final iqt g;
    public final x1u h;
    public final bzt i;
    public final roi0 j;
    public final pru k;
    public final h760 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerIONewTokenWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vyf.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vyf vyfVar = (vyf) (ze3Var instanceof vyf ? ze3Var : null);
            if (vyfVar != null) {
                clc clcVar = vyfVar.f38245a;
                iw20 iw20Var = vyfVar.b;
                lp4 lp4Var = vyfVar.c;
                h760 h760Var = vyfVar.d;
                fsd fsdVar = vyfVar.g;
                iqt iqtVar = vyfVar.e;
                x1u x1uVar = vyfVar.f;
                lp4Var.getClass();
                h760Var.getClass();
                fsdVar.getClass();
                this.g = iqtVar;
                this.h = x1uVar;
                this.i = new bzt(fsdVar);
                jzf jzfVar = (jzf) clcVar.b;
                this.j = new roi0(new jzf(jzfVar.f17409a, jzfVar.b, (byte) 0));
                this.k = ((uii) iw20Var.f15470a).r();
                this.l = h760Var;
                return;
            }
        }
        jf4.n(b1j.i(vyf.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:25:0x005e, B:27:0x0064, B:29:0x0068, B:31:0x0070, B:34:0x0085, B:37:0x008a, B:38:0x008f, B:39:0x0090, B:40:0x0095, B:16:0x0041), top: B:53:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x0070
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object c(a.yje r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof a.uyf
            if (r0 == 0) goto L13
            r0 = r12
            a.uyf r0 = (a.uyf) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L1a
        L13:
            a.uyf r0 = new a.uyf
            a.zje r12 = (a.zje) r12
            r0.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3b
            if (r2 != r4) goto L35
            int r2 = r0.k
            int r7 = r0.j
            java.lang.String r8 = r0.i
            a.z1x.P(r12)
            goto Lb5
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r3
        L3b:
            int r2 = r0.k
            int r7 = r0.j
            java.lang.String r8 = r0.i
            a.z1x.P(r12)     // Catch: java.lang.Exception -> L46
            goto Lb5
        L46:
            r12 = move-exception
            goto L98
        L48:
            a.z1x.P(r12)
            androidx.work.WorkerParameters r12 = r11.b
            a.maj r12 = r12.b
            java.lang.String r2 = "KEY_TOKEN"
            java.lang.String r12 = r12.b(r2)
            if (r12 != 0) goto L5c
            a.mg00 r11 = a.ng00.a()
            return r11
        L5c:
            r8 = r12
            r7 = r5
        L5e:
            boolean r12 = r11.e()     // Catch: java.lang.Exception -> L46
            if (r12 == 0) goto L96
            a.x1u r12 = r11.h     // Catch: java.lang.Exception -> L46
            if (r12 == 0) goto L90
            long r9 = r12.a()     // Catch: java.lang.Exception -> L46
            a.roi0 r12 = r11.j     // Catch: java.lang.Exception -> L46
            if (r12 == 0) goto L8a
            r0.i = r8     // Catch: java.lang.Exception -> L46
            r0.j = r7     // Catch: java.lang.Exception -> L46
            r0.k = r5     // Catch: java.lang.Exception -> L46
            r0.n = r6     // Catch: java.lang.Exception -> L46
            java.lang.Object r12 = r12.f30839a     // Catch: java.lang.Exception -> L46
            a.jzf r12 = (a.jzf) r12     // Catch: java.lang.Exception -> L46
            java.lang.Object r12 = r12.e(r9, r0, r8)     // Catch: java.lang.Exception -> L46
            a.wne r2 = a.wne.f39444a     // Catch: java.lang.Exception -> L46
            if (r12 != r2) goto L85
            goto L87
        L85:
            kotlin.Unit r12 = kotlin.Unit.f46060a     // Catch: java.lang.Exception -> L46
        L87:
            if (r12 != r1) goto L96
            goto Lb3
        L8a:
            java.lang.String r12 = "updateCustomerDeviceUseCase"
            kotlin.jvm.internal.Intrinsics.h(r12)     // Catch: java.lang.Exception -> L46
            throw r3     // Catch: java.lang.Exception -> L46
        L90:
            java.lang.String r12 = "getUserIdUseCase"
            kotlin.jvm.internal.Intrinsics.h(r12)     // Catch: java.lang.Exception -> L46
            throw r3     // Catch: java.lang.Exception -> L46
        L96:
            r2 = r5
            goto Lb5
        L98:
            r12.printStackTrace()
            int r12 = r7 + 1
            r2 = 3
            if (r7 >= r2) goto La2
            r2 = r6
            goto La3
        La2:
            r2 = r5
        La3:
            r0.i = r8
            r0.j = r12
            r0.k = r2
            r0.n = r4
            r9 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r7 = a.qcc.O(r9, r0)
            if (r7 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            r7 = r12
        Lb5:
            if (r2 != 0) goto L5e
            a.mg00 r11 = a.ng00.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.services.mobile_services.impl.workers.CustomerIONewTokenWorker.c(a.yje):java.lang.Object");
    }

    public final boolean e() {
        boolean zF;
        iqt iqtVar = this.g;
        if (iqtVar == null) {
            Intrinsics.h("getAuthorizationStateUseCase");
            throw null;
        }
        boolean zA = iqtVar.f15225a.a();
        pru pruVar = this.k;
        if (pruVar == null) {
            Intrinsics.h("getRemoteConfigUseCase");
            throw null;
        }
        if (pruVar.a().W) {
            h760 h760Var = this.l;
            if (h760Var == null) {
                Intrinsics.h("notificationFeature");
                throw null;
            }
            zF = ((u760) h760Var.a()).f();
        } else {
            zF = true;
        }
        bzt bztVar = this.i;
        if (bztVar != null) {
            return (bztVar.f3488a.a().j || zA || zF) ? false : true;
        }
        Intrinsics.h("getCommonConfigUseCase");
        throw null;
    }
}
