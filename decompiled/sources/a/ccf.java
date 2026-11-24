package a;

import android.app.Dialog;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Log;
import android.view.TouchDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.page_control.DsPageControl;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ccf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4108a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ccf(dmo dmoVar, int i) {
        this.f4108a = (byte) 20;
        this.b = dmoVar;
    }

    private final void a() {
        yrq yrqVar = (yrq) this.b;
        synchronized (yrqVar.c) {
            try {
                if (yrqVar.g == null) {
                    return;
                }
                try {
                    ssq ssqVarC = yrqVar.c();
                    int i = ssqVarC.f;
                    if (i == 2) {
                        synchronized (yrqVar.c) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + Separators.RPAREN);
                    }
                    try {
                        Method method = ebs0.b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Context context = yrqVar.f43133a;
                        ssq[] ssqVarArr = {ssqVarC};
                        atm0 atm0Var = m0t0.f20972a;
                        Trace.beginSection("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceH = m0t0.f20972a.h(context, ssqVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferS = btm0.s(yrqVar.f43133a, ssqVarC.f32737a);
                            if (mappedByteBufferS == null || typefaceH == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                dgu dguVar = new dgu(typefaceH, k7x.U(mappedByteBufferS));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (yrqVar.c) {
                                    try {
                                        rcb rcbVar = yrqVar.g;
                                        if (rcbVar != null) {
                                            rcbVar.b1(dguVar);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                yrqVar.b();
                            } catch (Throwable th2) {
                                Method method2 = ebs0.b;
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Method method3 = ebs0.b;
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (yrqVar.c) {
                        try {
                            rcb rcbVar2 = yrqVar.g;
                            if (rcbVar2 != null) {
                                rcbVar2.a1(th5);
                            }
                            yrqVar.b();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        o24 o24Var;
        dmo dmoVar;
        Object obj;
        boolean z = true;
        byte b = 0;
        switch (this.f4108a) {
            case 0:
                ((a1d) ((dcf) this.b).d()).j(new d0u("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 3));
                return;
            case 1:
                ((a1d) ((icf) this.b).d()).j(new d0u("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 3));
                return;
            case 2:
                u0i u0iVar = (u0i) this.b;
                usd usdVar = u0i.c2;
                if (!u0iVar.N() || (dialog = u0iVar.S1) == null) {
                    return;
                }
                u0iVar.I0(dialog);
                return;
            case 3:
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) this.b;
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.requestLayout();
                return;
            case 4:
                fsj fsjVar = (fsj) this.b;
                fsjVar.N(fsjVar.I(), 1028, new t9f((byte) 25));
                fsjVar.f.d();
                return;
            case 5:
                osj osjVar = (osj) this.b;
                if (osjVar.d0 >= 300000) {
                    ((fm30) osjVar.n.f43005a).w2 = true;
                    osjVar.d0 = 0L;
                    return;
                }
                return;
            case 6:
                ((tu9) this.b).d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case 7:
                ((imn0) this.b).close();
                return;
            case 8:
                txj txjVar = (txj) this.b;
                txjVar.j = true;
                txjVar.c();
                return;
            case 9:
                ((zxj) this.b).d(false);
                return;
            case 10:
                syj syjVar = (syj) this.b;
                if (!syjVar.f.C || Build.VERSION.SDK_INT < 32 || (o24Var = syjVar.h) == null || !o24Var.f24513a || (dmoVar = syjVar.f33026a) == null) {
                    return;
                }
                dmoVar.g.c(10, null).b();
                return;
            case 11:
                ((czj) this.b).i.d();
                return;
            case 12:
                ((pmi) this.b).d = null;
                return;
            case 13:
                ((ali) this.b).c = null;
                return;
            case 14:
                til tilVar = (til) this.b;
                boolean zIsPopupShowing = tilVar.h.isPopupShowing();
                tilVar.s(zIsPopupShowing);
                tilVar.m = zIsPopupShowing;
                return;
            case 15:
                DsPageControl dsPageControl = (DsPageControl) this.b;
                int i2 = DsPageControl.y2;
                dsPageControl.b0();
                return;
            case 16:
                DsPasswordRequirement dsPasswordRequirement = (DsPasswordRequirement) this.b;
                int i3 = DsPasswordRequirement.c;
                Rect rect = new Rect();
                dc3 dc3Var = dsPasswordRequirement.f47255a;
                ((ConstraintLayout) dc3Var.b).getHitRect(rect);
                dsPasswordRequirement.setTouchDelegate(new TouchDelegate(rect, (DsAccordion) dc3Var.c));
                return;
            case 17:
                mbn mbnVar = (mbn) this.b;
                mbnVar.f = true;
                mbnVar.c();
                return;
            case 18:
                btd btdVar = (btd) ((kki) this.b).d;
                if (btdVar != null) {
                    Iterator it = btdVar.values().iterator();
                    while (it.hasNext()) {
                        ((cmn0) it.next()).b();
                    }
                    return;
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ulo uloVar = (ulo) this.b;
                fp fpVar = uloVar.C;
                Context context = uloVar.e;
                String str = vtt0.f38024a;
                int iGenerateAudioSessionId = b34.g0(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                fpVar.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((q9o0) fpVar.d).f28360a.getLooper()) {
                    obj = fpVar.f;
                } else {
                    x0x.K(looperMyLooper == ((q9o0) fpVar.c).f28360a.getLooper());
                    obj = fpVar.g;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    fpVar.g = numValueOf;
                    nd5 nd5Var = new nd5(fpVar, numValueOf, b);
                    q9o0 q9o0Var = (q9o0) fpVar.d;
                    if (q9o0Var.f28360a.getLooper().getThread().isAlive()) {
                        q9o0Var.e(nd5Var);
                    }
                    q9o0 q9o0Var2 = uloVar.l.g;
                    p9o0 p9o0VarB = q9o0Var2.b(40, iGenerateAudioSessionId, 0);
                    Handler handler = q9o0Var2.f28360a;
                    Message message = p9o0VarB.f26617a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    p9o0VarB.a();
                    return;
                }
                return;
            case 20:
                fsj fsjVar2 = ((dmo) this.b).w;
                fsjVar2.N(fsjVar2.I(), 1034, new t9f((byte) 17));
                return;
            case 21:
                y8a0 y8a0Var = (y8a0) this.b;
                try {
                    synchronized (y8a0Var) {
                    }
                    try {
                        y8a0Var.f42187a.c(y8a0Var.c, y8a0Var.d);
                        return;
                    } finally {
                        y8a0Var.a(true);
                    }
                } catch (dlo e) {
                    f1t0.R("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    ohq.p(e);
                    return;
                }
            case 22:
                ((sbe) this.b).accept(new jjv0(iun.f15405a));
                return;
            case 23:
                z1k z1kVar = (z1k) this.b;
                z1kVar.e.setMinWidth(z1kVar.f43625a.getMeasuredWidth() / 2);
                return;
            case 24:
                a2k a2kVar = (a2k) this.b;
                a2kVar.e.setMinWidth(a2kVar.f128a.getMeasuredWidth() / 2);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jvq jvqVar = (jvq) this.b;
                if (!jvqVar.d || !jvqVar.e) {
                    Log.i("a.jvq", "still foreground");
                    return;
                }
                jvqVar.d = false;
                Log.i("a.jvq", "went background");
                Iterator it2 = jvqVar.g.iterator();
                while (it2.hasNext()) {
                    try {
                        ((js3) it2.next()).a();
                    } catch (Exception e2) {
                        Log.e("a.jvq", "Listener threw exception!", e2);
                    }
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((s0r) this.b).d = null;
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Iterator it3 = ((androidx.fragment.app.e) this.b).o.iterator();
                if (it3.hasNext()) {
                    throw rw2.h(it3);
                }
                return;
            default:
                ((s0r) this.b).d = null;
                return;
        }
    }

    public /* synthetic */ ccf(dmo dmoVar, y8a0 y8a0Var) {
        this.f4108a = (byte) 21;
        this.b = y8a0Var;
    }

    public /* synthetic */ ccf(Object obj, byte b) {
        this.f4108a = b;
        this.b = obj;
    }
}
