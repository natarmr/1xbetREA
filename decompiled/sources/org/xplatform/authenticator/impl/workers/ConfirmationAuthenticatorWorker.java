package org.xplatform.authenticator.impl.workers;

import a.a8z;
import a.af3;
import a.b1j;
import a.b9i;
import a.ctf0;
import a.ee0;
import a.epc;
import a.g760;
import a.h760;
import a.jf4;
import a.lvq;
import a.m460;
import a.maz;
import a.myb;
import a.n0o0;
import a.ng00;
import a.nyb;
import a.o5d0;
import a.oif0;
import a.ojj;
import a.ot10;
import a.ozd;
import a.pzd;
import a.qjj;
import a.r080;
import a.rwj;
import a.sxs0;
import a.t760;
import a.ts4;
import a.tvk;
import a.ujn;
import a.wez;
import a.wne;
import a.ws4;
import a.x1x;
import a.yje;
import a.ys10;
import a.z1x;
import a.ze3;
import a.zje;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/ga3", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ConfirmationAuthenticatorWorker extends CoroutineWorker {
    public final Context g;
    public final ot10 h;
    public final ctf0 i;
    public final sxs0 j;
    public final t760 k;
    public final epc l;
    public final nyb m;
    public final oif0 n;
    public final ojj o;
    public final a8z p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationAuthenticatorWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        final byte b = 0;
        this.p = maz.a(wez.b, new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x0094  */
            /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.q = maz.b(new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        final byte b3 = 2;
        this.r = maz.b(new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        final byte b4 = 3;
        this.s = maz.b(new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        final byte b5 = 4;
        this.t = maz.b(new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        final byte b6 = 5;
        this.u = maz.b(new Function0(this) { // from class: a.mzd
            public final /* synthetic */ ConfirmationAuthenticatorWorker b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
                  (r0v7 java.lang.Object) from 0x0090: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x008f, B:41:0x0090] A[DONT_GENERATE, DONT_INLINE]
                  (r0v7 java.lang.Object) from 0x0082: CHECK_CAST (a.r080) (r0v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    java.lang.String r1 = ""
                    org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker r3 = r3.b
                    switch(r0) {
                        case 0: goto L97;
                        case 1: goto L5d;
                        case 2: goto L48;
                        case 3: goto L33;
                        case 4: goto L1e;
                        default: goto L9;
                    }
                L9:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_USER_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L1c
                    goto L1d
                L1c:
                    r1 = r3
                L1d:
                    return r1
                L1e:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_MESSAGE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L31
                    goto L32
                L31:
                    r1 = r3
                L32:
                    return r1
                L33:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_TITLE"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L46
                    goto L47
                L46:
                    r1 = r3
                L47:
                    return r1
                L48:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_APPROVAL_ID"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L5b
                    goto L5c
                L5b:
                    r1 = r3
                L5c:
                    return r1
                L5d:
                    a.a8z r3 = r3.p
                    java.lang.Object r3 = r3.getValue()
                    java.util.Map r3 = (java.util.Map) r3
                    java.lang.String r0 = "AUTHENTICATOR_CONFIRMATION_KEY"
                    java.lang.Object r3 = r3.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L70
                    goto L71
                L70:
                    r1 = r3
                L71:
                    a.c0o r3 = a.r080.e
                    java.util.Iterator r3 = r3.iterator()
                L77:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L8f
                    java.lang.Object r0 = r3.next()
                    r2 = r0
                    a.r080 r2 = (a.r080) r2
                    java.lang.String r2 = r2.name()
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L77
                    goto L90
                L8f:
                    r0 = 0
                L90:
                    a.r080 r0 = (a.r080) r0
                    if (r0 != 0) goto L96
                    a.r080 r0 = a.r080.f29619a
                L96:
                    return r0
                L97:
                    androidx.work.WorkerParameters r3 = r3.b
                    a.maj r3 = r3.b
                    java.util.HashMap r3 = r3.f21460a
                    java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
                    r3.getClass()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: a.mzd.invoke():java.lang.Object");
            }
        });
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pzd.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pzd pzdVar = (pzd) (ze3Var instanceof pzd ? ze3Var : null);
            if (pzdVar != null) {
                b9i b9iVar = pzdVar.f27839a.f32574a;
                h760 h760Var = pzdVar.b;
                ctf0 ctf0Var = pzdVar.d;
                ot10 ot10Var = pzdVar.c;
                ojj ojjVar = pzdVar.e;
                h760Var.getClass();
                ctf0Var.getClass();
                this.h = ot10Var;
                this.i = ctf0Var;
                this.j = new sxs0((byte) 3);
                t760 t760VarA = h760Var.a();
                x1x.x(t760VarA);
                this.k = t760VarA;
                this.l = new epc(b9iVar.x());
                this.m = new nyb(b9iVar.x());
                this.n = new oif0(new myb(b9iVar.x()), b9iVar.m, b9iVar.o, (byte) 12);
                this.o = ojjVar;
                return;
            }
        }
        jf4.n(b1j.i(pzd.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        ozd ozdVar;
        ConfirmationAuthenticatorWorker confirmationAuthenticatorWorker;
        Throwable th;
        Application application;
        n0o0 n0o0Var = this.r;
        if (yjeVar instanceof ozd) {
            ozdVar = (ozd) yjeVar;
            int i = ozdVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozdVar.m = i - Integer.MIN_VALUE;
            } else {
                ozdVar = new ozd(this, (zje) yjeVar);
            }
        } else {
            ozdVar = new ozd(this, (zje) yjeVar);
        }
        Object objD = ozdVar.k;
        wne wneVar = wne.f39444a;
        ?? r3 = ozdVar.m;
        yje yjeVar2 = null;
        try {
            if (r3 == 0) {
                z1x.P(objD);
                Context applicationContext = this.g.getApplicationContext();
                application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    return ng00.a();
                }
                ot10 ot10Var = this.h;
                if (ot10Var == null) {
                    Intrinsics.h("mainDomainResolver");
                    throw null;
                }
                ozdVar.i = application;
                ozdVar.m = 1;
                objD = ot10Var.d(ozdVar);
                if (objD == wneVar) {
                }
                return wneVar;
            }
            if (r3 == 1) {
                application = ozdVar.i;
                z1x.P(objD);
            } else if (r3 == 2 || r3 == 3) {
                Application application2 = ozdVar.i;
                z1x.P(objD);
            } else {
                if (r3 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = ozdVar.j;
                z1x.P(objD);
                confirmationAuthenticatorWorker = this;
                ojj ojjVar = confirmationAuthenticatorWorker.o;
                if (ojjVar == null) {
                    Intrinsics.h("logManager");
                    throw null;
                }
                ojjVar.c("Authenticator_confirmation error: " + th.getMessage(), th);
            }
            return ng00.a();
            String str = (String) objD;
            if (this.j == null) {
                Intrinsics.h("updateApiEndpointUseCase");
                throw null;
            }
            str.getClass();
            if (!Intrinsics.d(ujn.h, str)) {
                ujn.h = str;
            }
            Object systemService = application.getSystemService(RemoteMessageConst.NOTIFICATION);
            systemService.getClass();
            ((NotificationManager) systemService).cancel(((String) n0o0Var.getValue()).hashCode());
            int iOrdinal = ((r080) this.q.getValue()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ozdVar.i = application;
                    ozdVar.j = null;
                    ozdVar.m = 2;
                    if (e(ozdVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new m460();
                    }
                    ozdVar.i = application;
                    ozdVar.j = null;
                    ozdVar.m = 3;
                    epc epcVar = this.l;
                    if (epcVar == null) {
                        Intrinsics.h("declineOperationV2UseCase");
                        throw null;
                    }
                    String str2 = (String) n0o0Var.getValue();
                    ts4 ts4Var = epcVar.f8179a;
                    Object objH = ((ws4) ts4Var.m.invoke()).h(ts4Var.h.a(), str2, "application/vnd.xenvelop+json", ozdVar);
                    if (objH != wneVar) {
                        objH = Unit.f46060a;
                    }
                    if (objH != wneVar) {
                        objH = Unit.f46060a;
                    }
                    if (objH != wneVar) {
                        objH = Unit.f46060a;
                    }
                    if (objH == wneVar) {
                        return wneVar;
                    }
                }
            }
            return ng00.a();
        } catch (Throwable th2) {
            th2.printStackTrace();
            ozdVar.i = null;
            ozdVar.j = th2;
            ozdVar.m = 4;
            rwj rwjVar = tvk.f34603a;
            confirmationAuthenticatorWorker = this;
            Object objD0 = qjj.d0(ys10.f43147a, new ee0(th2, confirmationAuthenticatorWorker, r3, yjeVar2, (byte) 25), ozdVar);
            if (objD0 != wne.f39444a) {
                objD0 = Unit.f46060a;
            }
            if (objD0 != wneVar) {
                th = th2;
            }
            return wneVar;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        g760 g760Var = new g760(this.f25193a, "confirm_auth");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        return new lvq(1, g760Var.a(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r9.C(r2, r3, r10, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.zje r10) throws a.zhi0 {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a.nzd
            if (r0 == 0) goto L13
            r0 = r10
            a.nzd r0 = (a.nzd) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.nzd r0 = new a.nzd
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.n0o0 r3 = r9.r
            a.n0o0 r4 = r9.u
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 == r7) goto L35
            if (r2 != r6) goto L2f
            a.z1x.P(r10)
            goto L76
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r5
        L35:
            a.z1x.P(r10)     // Catch: a.zhi0 -> L39
            goto L59
        L39:
            r10 = move-exception
            goto L85
        L3b:
            a.z1x.P(r10)
            a.nyb r10 = r9.m     // Catch: a.zhi0 -> L39
            if (r10 == 0) goto L7f
            java.lang.Object r2 = r4.getValue()     // Catch: a.zhi0 -> L39
            java.lang.String r2 = (java.lang.String) r2     // Catch: a.zhi0 -> L39
            java.lang.Object r8 = r3.getValue()     // Catch: a.zhi0 -> L39
            java.lang.String r8 = (java.lang.String) r8     // Catch: a.zhi0 -> L39
            r0.k = r7     // Catch: a.zhi0 -> L39
            a.ts4 r10 = r10.f24323a     // Catch: a.zhi0 -> L39
            java.lang.Object r10 = r10.b(r2, r8, r0)     // Catch: a.zhi0 -> L39
            if (r10 != r1) goto L59
            goto L75
        L59:
            a.ap4 r10 = (a.ap4) r10     // Catch: a.zhi0 -> L39
            java.lang.String r10 = r10.e     // Catch: a.zhi0 -> L39
            a.oif0 r9 = r9.n
            if (r9 == 0) goto L79
            java.lang.Object r2 = r4.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.k = r6
            java.lang.Object r9 = r9.C(r2, r3, r10, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L79:
            java.lang.String r9 = "confirmOperationV2Scenario"
            kotlin.jvm.internal.Intrinsics.h(r9)
            throw r5
        L7f:
            java.lang.String r10 = "getActiveOperationV2UseCase"
            kotlin.jvm.internal.Intrinsics.h(r10)     // Catch: a.zhi0 -> L39
            throw r5     // Catch: a.zhi0 -> L39
        L85:
            a.kuw r0 = r10.c
            a.i2o r1 = a.i2o.NotFound
            if (r0 != r1) goto Lab
            a.zhi0 r10 = new a.zhi0
            a.ctf0 r9 = r9.i
            if (r9 == 0) goto La5
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            a.lsm0 r9 = r9.b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r1 = 2131953610(0x7f1307ca, float:1.9543696E38)
            java.lang.String r9 = r9.a(r1, r0)
            r10.<init>(r9)
            throw r10
        La5:
            java.lang.String r9 = "resourceManager"
            kotlin.jvm.internal.Intrinsics.h(r9)
            throw r5
        Lab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.authenticator.impl.workers.ConfirmationAuthenticatorWorker.e(a.zje):java.lang.Object");
    }
}
