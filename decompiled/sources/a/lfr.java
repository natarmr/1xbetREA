package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes2.dex */
public final class lfr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19971a;
    public Object b;
    public final Object c;

    public lfr(b1x0 b1x0Var, gpw0 gpw0Var) {
        this.f19971a = (byte) 27;
        this.b = gpw0Var;
        Objects.requireNonNull(b1x0Var);
        this.c = b1x0Var;
    }

    private final void a() {
        synchronized (((e6w0) this.c).c) {
            ((yg60) ((e6w0) this.c).d).onComplete((u6w0) this.b);
        }
    }

    private final void b() {
        synchronized (((e6w0) this.c).c) {
            ((nh60) ((e6w0) this.c).d).onSuccess(((u6w0) this.b).c());
        }
    }

    private final void c() {
        IBinder iBinder = (IBinder) this.c;
        d6x0 d6x0Var = (d6x0) this.b;
        synchronized (d6x0Var) {
            if (iBinder == null) {
                d6x0Var.b("Null service connection");
                return;
            }
            try {
                d6x0Var.c = new fuj0(iBinder);
                d6x0Var.f5570a = (byte) 2;
                ((ScheduledExecutorService) d6x0Var.f.d).execute(new myw0(d6x0Var, (byte) 1));
            } catch (RemoteException e) {
                d6x0Var.b(e.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        a.qgi0.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            a.qgi0 r2 = (a.qgi0) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            a.qgi0 r0 = (a.qgi0) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            a.qgi0 r4 = (a.qgi0) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            a.qgi0 r10 = (a.qgi0) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = a.qgi0.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lfr.d():void");
    }

    /* JADX WARN: Code duplicated, block: B:284:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thC;
        mx30 mx30Var;
        char c;
        char c2;
        guw guwVar;
        guw s9x0Var;
        Long lValueOf;
        char c3 = 3;
        ppv0 ppv0Var = null;
        char c4 = 0;
        byte b = 1;
        switch (this.f19971a) {
            case 0:
                bfr bfrVar = (bfr) this.c;
                ig00 ig00Var = (ig00) this.b;
                if ((ig00Var instanceof r2) && (thC = ((r2) ig00Var).c()) != null) {
                    bfrVar.onFailure(thC);
                    return;
                }
                try {
                    bfrVar.onSuccess(hkb.E(ig00Var));
                    return;
                } catch (ExecutionException e) {
                    bfrVar.onFailure(e.getCause());
                    return;
                } catch (Throwable th) {
                    bfrVar.onFailure(th);
                    return;
                }
            case 1:
                ui uiVar = (ui) this.b;
                xi xiVar = (xi) this.c;
                ox30 ox30Var = xiVar.c;
                if (ox30Var != null && (mx30Var = ox30Var.e) != null) {
                    mx30Var.a(ox30Var);
                }
                View view = (View) xiVar.h;
                if (view != null && view.getWindowToken() != null) {
                    if (uiVar.b()) {
                        xiVar.s = uiVar;
                    } else if (uiVar.f != null) {
                        uiVar.d(0, 0, false, false);
                        xiVar.s = uiVar;
                    }
                }
                xiVar.u = null;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((un) this.c);
                return;
            case 3:
                wz3 wz3Var = (wz3) this.c;
                yz3 yz3Var = (yz3) wz3Var.f;
                if (yz3Var.g == wz3Var.b) {
                    List list = (List) wz3Var.d;
                    amk amkVar = (amk) this.b;
                    Runnable runnable = (Runnable) wz3Var.e;
                    List list2 = yz3Var.f;
                    yz3Var.e = list;
                    yz3Var.f = Collections.unmodifiableList(list);
                    amkVar.b(yz3Var.f43498a);
                    yz3Var.a(list2, runnable);
                    return;
                }
                return;
            case 4:
                owp0 owp0Var = (owp0) this.b;
                Typeface typeface = (Typeface) this.c;
                xvw xvwVar = (xvw) owp0Var.b;
                if (xvwVar != null) {
                    xvwVar.U(typeface);
                    return;
                }
                return;
            case 5:
                CardFootballFieldView cardFootballFieldView = (CardFootballFieldView) this.c;
                List list3 = cardFootballFieldView.v;
                vd7 vd7Var = cardFootballFieldView.q;
                int i = 0;
                for (Object obj : (List) this.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ?? r17 = ppv0Var;
                        q3d.p();
                        throw r17;
                    }
                    cha chaVar = (cha) obj;
                    AnimatorSet animatorSet = new AnimatorSet();
                    boolean z = chaVar.b;
                    int i3 = chaVar.f4350a;
                    List list4 = cardFootballFieldView.s;
                    if (z) {
                        Object obj2 = list4.get(i);
                        obj2.getClass();
                        ImageView imageView = (ImageView) obj2;
                        c = c3;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat.getClass();
                        objectAnimatorOfFloat.addListener(new jha(imageView, cardFootballFieldView, i3));
                        ImageView imageView2 = (ImageView) vd7Var.c;
                        Property property = ViewGroup.TRANSLATION_Y;
                        float[] fArr = new float[1];
                        fArr[c4] = ((Number) cardFootballFieldView.u.get(i)).floatValue() * ((CardFootballFieldView) vd7Var.b).getHeight();
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr);
                        ImageView imageView3 = (ImageView) vd7Var.c;
                        Property property2 = ViewGroup.SCALE_X;
                        c2 = c4;
                        float[] fArr2 = new float[1];
                        fArr2[c2] = ((Number) list3.get(i)).floatValue();
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property2, fArr2);
                        ImageView imageView4 = (ImageView) vd7Var.c;
                        Property property3 = ViewGroup.SCALE_Y;
                        float[] fArr3 = new float[1];
                        fArr3[c2] = ((Number) list3.get(i)).floatValue();
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr3);
                        Animator[] animatorArr = new Animator[4];
                        animatorArr[c2] = objectAnimatorOfFloat;
                        animatorArr[1] = objectAnimatorOfFloat2;
                        animatorArr[2] = objectAnimatorOfFloat3;
                        animatorArr[c] = objectAnimatorOfFloat4;
                        animatorSet.playTogether(animatorArr);
                    } else {
                        c = c3;
                        c2 = c4;
                        Object obj3 = list4.get(i);
                        obj3.getClass();
                        ImageView imageView5 = (ImageView) obj3;
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView5, (Property<ImageView, Float>) ViewGroup.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat5.getClass();
                        objectAnimatorOfFloat5.addListener(new jha(imageView5, cardFootballFieldView, i3));
                        ImageView imageView6 = (ImageView) vd7Var.c;
                        Property property4 = ViewGroup.TRANSLATION_X;
                        float[] fArr4 = new float[1];
                        fArr4[c2] = ((Number) cardFootballFieldView.t.get(i)).floatValue() * ((CardFootballFieldView) vd7Var.b).getWidth();
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property4, fArr4);
                        Animator[] animatorArr2 = new Animator[2];
                        animatorArr2[c2] = objectAnimatorOfFloat5;
                        animatorArr2[1] = objectAnimatorOfFloat6;
                        animatorSet.playTogether(animatorArr2);
                    }
                    animatorSet.setStartDelay(((long) i) * 1000);
                    animatorSet.setDuration(1000L);
                    animatorSet.start();
                    i = i2;
                    c3 = c;
                    ppv0Var = ppv0Var;
                    c4 = c2;
                }
                return;
            case 6:
                ((CyberDurakGameView) this.b).getBinding().h.setText(((qng) this.c).f29026a);
                return;
            case 7:
                kvj kvjVar = (kvj) this.c;
                ArrayList<ivj> arrayList = (ArrayList) this.b;
                for (ivj ivjVar : arrayList) {
                    ArrayList arrayList2 = kvjVar.r;
                    long j = kvjVar.f;
                    xhe0 xhe0Var = ivjVar.f15448a;
                    View view2 = xhe0Var == null ? null : xhe0Var.f40887a;
                    xhe0 xhe0Var2 = ivjVar.b;
                    View view3 = xhe0Var2 != null ? xhe0Var2.f40887a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList2.add(ivjVar.f15448a);
                        duration.translationX(ivjVar.e - ivjVar.c);
                        duration.translationY(ivjVar.f - ivjVar.d);
                        duration.alpha(0.0f).setListener(new hvj(kvjVar, ivjVar, duration, view2, (byte) 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                        arrayList2.add(ivjVar.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new hvj(kvjVar, ivjVar, viewPropertyAnimatorAnimate, view3, (byte) 1)).start();
                    }
                }
                arrayList.clear();
                kvjVar.n.remove(arrayList);
                return;
            case 8:
                wv00 wv00VarF = wv00.f();
                String str = xzj.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                ppv0 ppv0Var2 = (ppv0) this.b;
                sb.append(ppv0Var2.f27390a);
                wv00VarF.a(str, sb.toString());
                ((xzj) this.c).f41756a.d(ppv0Var2);
                return;
            case 9:
                ((LottieView) this.c).setVisibility(8);
                return;
            case 10:
                c2k c2kVar = (c2k) this.c;
                int width = c2kVar.f3627a.getWidth() - sj3.X(92);
                ShapeableImageView shapeableImageView = c2kVar.c;
                shapeableImageView.getLayoutParams().width = Math.min(width, shapeableImageView.getLayoutParams().width);
                shapeableImageView.getLayoutParams().height = Math.min(width, shapeableImageView.getLayoutParams().height);
                return;
            case 11:
                e2k e2kVar = (e2k) this.c;
                int width2 = e2kVar.f7091a.getWidth() - sj3.X(92);
                RecyclerView recyclerView = e2kVar.f;
                recyclerView.getLayoutParams().width = Math.min(width2, recyclerView.getLayoutParams().width);
                return;
            case 12:
                yje yjeVarB = pnx.b((jry) this.b);
                e0g0 e0g0Var = j0g0.b;
                yjeVarB.resumeWith(z1x.C((Throwable) this.c));
                return;
            case 13:
                synchronized (((zh00) this.c).c) {
                    try {
                        Object objMo11apply = ((zh00) this.c).d.mo11apply(this.b);
                        zh00 zh00Var = (zh00) this.c;
                        Object obj4 = zh00Var.f44368a;
                        if (obj4 == null && objMo11apply != null) {
                            zh00Var.f44368a = objMo11apply;
                            zh00Var.e.i(objMo11apply);
                        } else if (obj4 != null && !obj4.equals(objMo11apply)) {
                            zh00 zh00Var2 = (zh00) this.c;
                            zh00Var2.f44368a = objMo11apply;
                            zh00Var2.e.i(objMo11apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 14:
                ((gjn) this.b).accept(this.c);
                return;
            case 15:
                try {
                    d();
                    return;
                } catch (Error e2) {
                    synchronized (((qgi0) this.c).b) {
                        ((qgi0) this.c).c = 1;
                        throw e2;
                    }
                }
            case 16:
                ezb0 ezb0Var = ((o9o0) this.c).f24889a.f;
                String str2 = (String) this.b;
                synchronized (ezb0Var.k) {
                    try {
                        nqv0 nqv0VarC = ezb0Var.c(str2);
                        if (nqv0VarC != null) {
                            ppv0Var = nqv0VarC.f23975a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (ppv0Var == null || Intrinsics.d(o4e.j, ppv0Var.j)) {
                    return;
                }
                synchronized (((o9o0) this.c).c) {
                    ((o9o0) this.c).f.put(jpm0.k(ppv0Var), ppv0Var);
                    o9o0 o9o0Var = (o9o0) this.c;
                    ((o9o0) this.c).g.put(jpm0.k(ppv0Var), pov0.a(o9o0Var.h, ppv0Var, o9o0Var.b.b, o9o0Var));
                    break;
                }
                return;
            case 17:
                ig00 ig00Var2 = (ig00) this.b;
                boolean zIsCancelled = ig00Var2.isCancelled();
                n5a n5aVar = (n5a) this.c;
                if (zIsCancelled) {
                    n5aVar.h(null);
                    return;
                }
                try {
                    e0g0 e0g0Var2 = j0g0.b;
                    while (true) {
                        try {
                            Object obj5 = ig00Var2.get();
                            if (c4 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            n5aVar.resumeWith(obj5);
                            return;
                        } catch (InterruptedException unused) {
                            c4 = 1;
                        } catch (Throwable th4) {
                            if (c4 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th4;
                        }
                    }
                } catch (ExecutionException e3) {
                    e0g0 e0g0Var3 = j0g0.b;
                    Throwable cause = e3.getCause();
                    cause.getClass();
                    n5aVar.resumeWith(new g0g0(cause));
                    return;
                }
                break;
            case 18:
                ((glz) this.b).a((kov0) this.c);
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a();
                return;
            case 20:
                b();
                return;
            case 21:
                com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) this.b;
                qaj qajVar = (qaj) this.c;
                sav savVar = (sav) qajVar.f;
                b9v b9vVar = (b9v) qajVar.c;
                h9w0 h9w0Var = (h9w0) savVar.j.get((ua3) qajVar.b);
                if (h9w0Var == null) {
                    return;
                }
                if (connectionResult.b != 0) {
                    h9w0Var.m(connectionResult, null);
                    return;
                }
                qajVar.f28396a = true;
                if (b9vVar.r()) {
                    if (!qajVar.f28396a || (guwVar = (guw) qajVar.d) == null) {
                        return;
                    }
                    b9vVar.j(guwVar, (Set) qajVar.e);
                    return;
                }
                try {
                    b9vVar.j(null, b9vVar.r() ? b9vVar.z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    b9vVar.d("Failed to get service from broker.");
                    h9w0Var.m(new com.google.android.gms.common.ConnectionResult(10, null, null), null);
                    return;
                }
            case 22:
                r9w0 r9w0Var = (r9w0) this.c;
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) this.b;
                com.google.android.gms.common.ConnectionResult connectionResult2 = zakVar.b;
                if (connectionResult2.b == 0) {
                    zaaa zaaaVar = zakVar.c;
                    s0x.H(zaaaVar);
                    com.google.android.gms.common.ConnectionResult connectionResult3 = zaaaVar.c;
                    if (connectionResult3.b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult3)), new Exception());
                        r9w0Var.m.l(connectionResult3);
                        r9w0Var.l.c();
                        return;
                    }
                    qaj qajVar2 = r9w0Var.m;
                    IBinder iBinder = zaaaVar.b;
                    if (iBinder == null) {
                        s9x0Var = null;
                    } else {
                        int i4 = fc.b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        s9x0Var = iInterfaceQueryLocalInterface instanceof guw ? (guw) iInterfaceQueryLocalInterface : new s9x0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 3);
                    }
                    Set set = r9w0Var.e;
                    qajVar2.getClass();
                    if (s9x0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        qajVar2.l(new com.google.android.gms.common.ConnectionResult(4, null, null));
                    } else {
                        qajVar2.d = s9x0Var;
                        qajVar2.e = set;
                        if (qajVar2.f28396a) {
                            ((b9v) qajVar2.c).j(s9x0Var, set);
                        }
                    }
                } else {
                    r9w0Var.m.l(connectionResult2);
                }
                r9w0Var.l.c();
                return;
            case 23:
                syw0 syw0Var = (syw0) this.b;
                syw0Var.p();
                if (svs0.e()) {
                    syw0Var.J().v1(this);
                    return;
                }
                bmw0 bmw0Var = (bmw0) this.c;
                c4 = bmw0Var.c != 0 ? (char) 1 : (char) 0;
                bmw0Var.c = 0L;
                if (c4 != 0) {
                    bmw0Var.a();
                    return;
                }
                return;
            case 24:
                a4x0 a4x0VarI = ((AppMeasurementDynamiteService) this.c).f45539a.i();
                gpw0 gpw0Var = (gpw0) this.b;
                a4x0VarI.m1();
                a4x0VarI.n1();
                a4x0VarI.z1(new hf5((Object) a4x0VarI, (Object) a4x0VarI.B1(false), (Object) gpw0Var, false, (byte) 20));
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                m6x0 m6x0Var = ((oyw0) this.c).f26078a;
                m6x0Var.V();
                zzah zzahVar = (zzah) this.b;
                if (zzahVar.c.m() == null) {
                    m6x0Var.getClass();
                    String str3 = zzahVar.f45541a;
                    s0x.H(str3);
                    com.google.android.gms.measurement.internal.zzr zzrVarP = m6x0Var.P(str3);
                    if (zzrVarP != null) {
                        m6x0Var.a0(zzahVar, zzrVarP);
                        return;
                    }
                    return;
                }
                m6x0Var.getClass();
                String str4 = zzahVar.f45541a;
                s0x.H(str4);
                com.google.android.gms.measurement.internal.zzr zzrVarP2 = m6x0Var.P(str4);
                if (zzrVarP2 != null) {
                    m6x0Var.Z(zzahVar, zzrVarP2);
                    return;
                }
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                c();
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gpw0 gpw0Var2 = (gpw0) this.b;
                b1x0 b1x0Var = (b1x0) this.c;
                w4x0 w4x0Var = ((kxw0) b1x0Var.b).h;
                kxw0.f(w4x0Var);
                kxw0 kxw0Var = (kxw0) w4x0Var.b;
                wvw0 wvw0Var = kxw0Var.e;
                wvw0 wvw0Var2 = kxw0Var.e;
                kxw0.e(wvw0Var);
                if (wvw0Var.t1().i(wyw0.ANALYTICS_STORAGE)) {
                    kxw0.e(wvw0Var2);
                    kxw0Var.k.getClass();
                    if (!wvw0Var2.v1(System.currentTimeMillis())) {
                        kxw0.e(wvw0Var2);
                        if (wvw0Var2.r.a() != 0) {
                            kxw0.e(wvw0Var2);
                            lValueOf = Long.valueOf(wvw0Var2.r.a());
                        }
                    }
                    if (lValueOf == null) {
                        x6x0 x6x0Var = ((kxw0) b1x0Var.b).i;
                        kxw0.e(x6x0Var);
                        x6x0Var.a2(gpw0Var2, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            gpw0Var2.u(null);
                            return;
                        } catch (RemoteException e5) {
                            uuw0 uuw0Var = ((kxw0) b1x0Var.b).f;
                            kxw0.g(uuw0Var);
                            uuw0Var.g.b(e5, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.l.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    gpw0Var2.u(null);
                    return;
                }
                x6x0 x6x0Var2 = ((kxw0) b1x0Var.b).i;
                kxw0.e(x6x0Var2);
                x6x0Var2.a2(gpw0Var2, lValueOf.longValue());
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kxw0 kxw0Var2 = (kxw0) ((b1x0) this.c).b;
                wvw0 wvw0Var3 = kxw0Var2.e;
                uuw0 uuw0Var3 = kxw0Var2.f;
                kxw0.e(wvw0Var3);
                wvw0Var3.m1();
                wvw0Var3.m1();
                jmw0 jmw0VarB = jmw0.b(wvw0Var3.q1().getString("dma_consent_settings", null));
                jmw0 jmw0Var = (jmw0) this.b;
                int i5 = jmw0Var.f16787a;
                if (!xyw0.l(i5, jmw0VarB.f16787a)) {
                    kxw0.g(uuw0Var3);
                    uuw0Var3.m.b(Integer.valueOf(i5), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = wvw0Var3.q1().edit();
                editorEdit.putString("dma_consent_settings", jmw0Var.b);
                editorEdit.apply();
                kxw0.g(uuw0Var3);
                uuw0Var3.o.b(jmw0Var, "Setting DMA consent(FE)");
                if (kxw0Var2.i().v1()) {
                    a4x0 a4x0VarI2 = kxw0Var2.i();
                    a4x0VarI2.m1();
                    a4x0VarI2.n1();
                    a4x0VarI2.z1(new r3x0(a4x0VarI2, b));
                    return;
                }
                a4x0 a4x0VarI3 = kxw0Var2.i();
                a4x0VarI3.m1();
                a4x0VarI3.n1();
                if (a4x0VarI3.u1()) {
                    a4x0VarI3.z1(new t2x0(a4x0VarI3, a4x0VarI3.B1(false), (byte) 1));
                    return;
                }
                return;
            default:
                a4x0 a4x0Var = (a4x0) this.c;
                gtw0 gtw0Var = a4x0Var.e;
                kxw0 kxw0Var3 = (kxw0) a4x0Var.b;
                if (gtw0Var == null) {
                    uuw0 uuw0Var4 = kxw0Var3.f;
                    kxw0.g(uuw0Var4);
                    uuw0Var4.g.a("Failed to send current screen to service");
                    return;
                }
                try {
                    r1x0 r1x0Var = (r1x0) this.b;
                    if (r1x0Var == null) {
                        gtw0Var.p(0L, null, null, kxw0Var3.f19080a.getPackageName());
                    } else {
                        gtw0Var.p(r1x0Var.c, r1x0Var.f29705a, r1x0Var.b, kxw0Var3.f19080a.getPackageName());
                    }
                    a4x0Var.y1();
                    return;
                } catch (RemoteException e6) {
                    uuw0 uuw0Var5 = ((kxw0) a4x0Var.b).f;
                    kxw0.g(uuw0Var5);
                    uuw0Var5.g.b(e6, "Failed to send current screen to the service");
                    return;
                }
        }
    }

    public String toString() {
        String str;
        byte b = this.f19971a;
        Object obj = this.c;
        switch (b) {
            case 0:
                y3v y3vVar = new y3v(lfr.class.getSimpleName());
                zn00 zn00Var = new zn00();
                ((zn00) y3vVar.d).b = zn00Var;
                y3vVar.d = zn00Var;
                zn00Var.f44650a = (bfr) obj;
                return y3vVar.toString();
            case 15:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((qgi0) obj).c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lfr(Object obj, Object obj2, boolean z, byte b) {
        this.f19971a = b;
        this.c = obj;
        this.b = obj2;
    }

    public lfr(CardFootballFieldView cardFootballFieldView, List list, CardFootballFieldView cardFootballFieldView2) {
        this.f19971a = (byte) 5;
        this.b = list;
        this.c = cardFootballFieldView2;
    }

    public /* synthetic */ lfr(Object obj, Object obj2, byte b) {
        this.f19971a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lfr(a4x0 a4x0Var, r1x0 r1x0Var) {
        this.f19971a = (byte) 29;
        this.b = r1x0Var;
        Objects.requireNonNull(a4x0Var);
        this.c = a4x0Var;
    }

    public lfr(qgi0 qgi0Var) {
        this.f19971a = (byte) 15;
        this.c = qgi0Var;
    }

    public lfr(ig00 ig00Var, n5a n5aVar) {
        this.f19971a = (byte) 17;
        ig00Var.getClass();
        this.b = ig00Var;
        this.c = n5aVar;
    }
}
