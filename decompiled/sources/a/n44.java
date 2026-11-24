package a;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n44 {
    public static final lin0 k = hfm0.z(new m44(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22881a;
    public final m2a b;
    public final fhj c;
    public final do20 d;
    public vg00 e;
    public l9o0 f;
    public q24 g;
    public krs0 h;
    public Looper i;
    public Context j;

    public n44(mii0 mii0Var) {
        Context context = (Context) mii0Var.b;
        this.f22881a = context;
        fhj fhjVar = (fhj) mii0Var.c;
        fhjVar.getClass();
        this.c = fhjVar;
        this.b = (m2a) mii0Var.d;
        this.g = (q24) mii0Var.e;
        this.d = context == null ? null : new do20(this);
        this.f = l9o0.f19665a;
    }

    public final l44 a(k34 k34Var) throws i34 {
        Context context;
        Context context2;
        try {
            int i = k34Var.h;
            int i2 = k34Var.i;
            if (i2 == -1 || (context2 = this.f22881a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(k34Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : k34Var.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(k34Var.b).setChannelMask(k34Var.c).setEncoding(k34Var.f17601a).build()).setTransferMode(1).setBufferSizeInBytes(k34Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(k34Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new l44(audioTrackBuild, k34Var, this.d, this.f);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new i34();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new i34(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final h34 b(g34 g34Var) {
        e(g34Var);
        androidx.media3.common.b bVar = g34Var.f10594a;
        m24 m24Var = g34Var.b;
        d34 d34VarP = this.c.p(bVar, m24Var);
        h34 h34Var = new h34();
        int i = 0;
        h34Var.d = 0;
        String str = bVar.p;
        int i2 = bVar.M;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(bVar, m24Var) != null : i2 == 2) {
            i = 2;
        }
        h34Var.d = i;
        boolean z = d34VarP.f5384a;
        h34Var.f12367a = z;
        boolean z2 = d34VarP.b;
        h34Var.b = z2;
        boolean z3 = d34VarP.c;
        h34Var.c = z3;
        if (!z && (z2 || z3)) {
            jf4.n("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        h34 h34Var2 = new h34();
        h34Var2.f12367a = h34Var.f12367a;
        h34Var2.b = h34Var.b;
        h34Var2.c = h34Var.c;
        h34Var2.d = h34Var.d;
        return h34Var2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x016c  */
    public final k34 c(g34 g34Var) throws f34 {
        char c;
        int iQ;
        boolean z;
        boolean z2;
        int i;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iS;
        boolean z5;
        boolean z6;
        int iQ2;
        boolean z7;
        int i2;
        int iQ3;
        boolean z8;
        int iS2;
        androidx.media3.common.b bVar = g34Var.f10594a;
        boolean z9 = g34Var.d;
        m24 m24Var = g34Var.b;
        e(g34Var);
        String str = bVar.p;
        int iIntValue = bVar.K;
        int i3 = bVar.J;
        int i4 = bVar.L;
        int iIntValue2 = bVar.M;
        if (!Objects.equals(str, "audio/raw")) {
            d34 d34VarP = z9 ? this.c.p(bVar, m24Var) : d34.d;
            if (z9 && d34VarP.f5384a) {
                str.getClass();
                int iC = mg40.c(str, bVar.l);
                if (iIntValue == -1) {
                    iIntValue = vtt0.p(i3);
                }
                if ((iC == 11 || iC == 12) && i4 >= 16000 && !((Boolean) k.get()).booleanValue()) {
                    if (iC == 12 && i3 == 2) {
                        iIntValue = 4;
                    }
                    i4 /= 2;
                    iC = 10;
                }
                z = d34VarP.b;
                iIntValue2 = iC;
                iQ = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairC = this.g.c(bVar, m24Var);
                if (pairC == null) {
                    throw new f34("Unable to configure passthrough for: " + bVar);
                }
                iIntValue2 = ((Integer) pairC.first).intValue();
                iIntValue = ((Integer) pairC.second).intValue();
                c = 2;
                iQ = -1;
                z = false;
            }
            i = bVar.k;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            x0x.K(z3);
            if (iQ == -1) {
                iQ = 1;
            }
            if (z2) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.b.getClass();
            if (c != 0) {
                z4 = true;
                iS = n6x.s(((500000 * ((long) i4)) * ((long) iQ)) / 1000000);
            } else if (c != 1) {
                z4 = true;
                iQ2 = obc.Q(iIntValue2);
                if (iQ2 != -2147483647) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                x0x.K(z7);
                iS = n6x.s((50000000 * ((long) iQ2)) / 1000000);
            } else {
                if (c == 2) {
                    e9d0.o();
                    return null;
                }
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iS2 = g1x.s(i, 8);
                } else {
                    iQ3 = obc.Q(iIntValue2);
                    if (iQ3 != -2147483647) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    x0x.K(z8);
                    iS2 = iQ3;
                }
                z4 = true;
                iS = n6x.s((((long) i2) * ((long) iS2)) / 1000000);
            }
            int iMax = (((Math.max(minBufferSize, (int) (((double) iS) * d)) + iQ) - 1) / iQ) * iQ;
            j34 j34Var = new j34();
            m24 m24Var2 = m24.b;
            j34Var.i = -1;
            j34Var.b = i4;
            j34Var.c = iIntValue;
            j34Var.f15813a = iIntValue2;
            j34Var.f = iMax;
            j34Var.h = g34Var.e;
            j34Var.g = m24Var;
            z5 = z4;
            if (c == z5) {
                z6 = z5;
            } else {
                z6 = false;
            }
            j34Var.e = z6;
            j34Var.d = g34Var.g;
            j34Var.j = z2;
            j34Var.k = z;
            j34Var.i = g34Var.f;
            return new k34(j34Var);
        }
        x0x.A(vtt0.I(iIntValue2));
        if (iIntValue == -1) {
            iIntValue = vtt0.p(i3);
        }
        iQ = vtt0.q(iIntValue2) * i3;
        z = false;
        c = 0;
        z2 = false;
        i = bVar.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
        if (minBufferSize != -2) {
            z3 = true;
        } else {
            z3 = false;
        }
        x0x.K(z3);
        if (iQ == -1) {
            iQ = 1;
        }
        if (z2) {
            d = 8.0d;
        } else {
            d = 1.0d;
        }
        this.b.getClass();
        if (c != 0) {
            z4 = true;
            iS = n6x.s(((500000 * ((long) i4)) * ((long) iQ)) / 1000000);
        } else if (c != 1) {
            z4 = true;
            iQ2 = obc.Q(iIntValue2);
            if (iQ2 != -2147483647) {
                z7 = true;
            } else {
                z7 = false;
            }
            x0x.K(z7);
            iS = n6x.s((50000000 * ((long) iQ2)) / 1000000);
        } else {
            if (c == 2) {
                e9d0.o();
                return null;
            }
            if (iIntValue2 == 5) {
                i2 = 500000;
            } else if (iIntValue2 == 8) {
                i2 = 1000000;
            } else {
                i2 = 250000;
            }
            if (i != -1) {
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                iS2 = g1x.s(i, 8);
            } else {
                iQ3 = obc.Q(iIntValue2);
                if (iQ3 != -2147483647) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                x0x.K(z8);
                iS2 = iQ3;
            }
            z4 = true;
            iS = n6x.s((((long) i2) * ((long) iS2)) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iS) * d)) + iQ) - 1) / iQ) * iQ;
        j34 j34Var2 = new j34();
        m24 m24Var3 = m24.b;
        j34Var2.i = -1;
        j34Var2.b = i4;
        j34Var2.c = iIntValue;
        j34Var2.f15813a = iIntValue2;
        j34Var2.f = iMax2;
        j34Var2.h = g34Var.e;
        j34Var2.g = m24Var;
        z5 = z4;
        if (c == z5) {
            z6 = z5;
        } else {
            z6 = false;
        }
        j34Var2.e = z6;
        j34Var2.d = g34Var.g;
        j34Var2.j = z2;
        j34Var2.k = z;
        j34Var2.i = g34Var.f;
        return new k34(j34Var2);
    }

    public final void d() {
        o24 o24Var;
        lnk0 lnk0Var;
        vg00 vg00Var = this.e;
        if (vg00Var != null) {
            vg00Var.d();
        }
        krs0 krs0Var = this.h;
        if (krs0Var != null) {
            Context context = (Context) krs0Var.b;
            if (krs0Var.f18784a) {
                krs0Var.i = null;
                b34.g0(context).unregisterAudioDeviceCallback((r24) krs0Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (o24Var = (o24) krs0Var.h) != null) {
                    Handler handler = (Handler) o24Var.c;
                    Spatializer spatializer = (Spatializer) o24Var.b;
                    if (spatializer != null && (lnk0Var = (lnk0) o24Var.d) != null && handler != null) {
                        spatializer.removeOnSpatializerStateChangedListener(lnk0Var);
                        handler.removeCallbacksAndMessages(null);
                    }
                    krs0Var.h = null;
                }
                context.unregisterReceiver((md3) krs0Var.f);
                s24 s24Var = (s24) krs0Var.g;
                if (s24Var != null) {
                    s24Var.f31483a.unregisterContentObserver(s24Var);
                }
                krs0Var.f18784a = false;
            }
        }
    }

    public final void e(g34 g34Var) {
        Context context;
        q24 q24VarB;
        AudioDeviceInfo audioDeviceInfo = g34Var.c;
        m24 m24Var = g34Var.b;
        f();
        krs0 krs0Var = this.h;
        if (krs0Var == null && (context = this.f22881a) != null) {
            krs0 krs0Var2 = new krs0(context, new gne(this, (byte) 13), m24Var, audioDeviceInfo);
            this.h = krs0Var2;
            Handler handler = (Handler) krs0Var2.d;
            Context context2 = (Context) krs0Var2.b;
            if (krs0Var2.f18784a) {
                q24VarB = (q24) krs0Var2.i;
                q24VarB.getClass();
            } else {
                krs0Var2.f18784a = true;
                s24 s24Var = (s24) krs0Var2.g;
                if (s24Var != null) {
                    s24Var.f31483a.registerContentObserver(s24Var.b, false, s24Var);
                }
                b34.g0(context2).registerAudioDeviceCallback((r24) krs0Var2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((o24) krs0Var2.h) == null) {
                    krs0Var2.h = new o24(context2, new w1(krs0Var2, (byte) 13), Boolean.valueOf(vtt0.L(context2)));
                }
                q24VarB = q24.b(context2, context2.registerReceiver((md3) krs0Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (m24) krs0Var2.k, (AudioDeviceInfo) krs0Var2.j, krs0Var2.b());
                krs0Var2.i = q24VarB;
            }
            this.g = q24VarB;
        } else if (krs0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) krs0Var.j)) {
                krs0Var.j = audioDeviceInfo;
                Context context3 = (Context) krs0Var.b;
                m24 m24Var2 = (m24) krs0Var.k;
                List listB = krs0Var.b();
                rcf0 rcf0Var = q24.e;
                krs0Var.d(q24.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), m24Var2, audioDeviceInfo, listB));
            }
            krs0 krs0Var3 = this.h;
            if (!Objects.equals(m24Var, (m24) krs0Var3.k)) {
                krs0Var3.k = m24Var;
                Context context4 = (Context) krs0Var3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) krs0Var3.j;
                List listB2 = krs0Var3.b();
                rcf0 rcf0Var2 = q24.e;
                krs0Var3.d(q24.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), m24Var, audioDeviceInfo2, listB2));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.f22881a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.i = looperMyLooper;
        } else {
            jf4.n(jtm0.p("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
