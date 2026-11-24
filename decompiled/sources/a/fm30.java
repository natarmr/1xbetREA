package a;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fm30 extends mm30 implements bm30 {
    public long A2;
    public long B2;
    public boolean C2;
    public final Context k2;
    public final xex l2;
    public final osj m2;
    public final dq00 n2;
    public final AtomicBoolean o2;
    public int p2;
    public boolean q2;
    public androidx.media3.common.b r2;
    public androidx.media3.common.b s2;
    public long t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public boolean x2;
    public int y2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm30(Context context, cm30 cm30Var, Handler handler, qlo qloVar, osj osjVar) {
        super(context.getApplicationContext(), 1, cm30Var);
        dq00 dq00Var = Build.VERSION.SDK_INT >= 35 ? new dq00((byte) 2) : null;
        this.k2 = context.getApplicationContext();
        this.m2 = osjVar;
        this.n2 = dq00Var;
        this.y2 = -1000;
        this.l2 = new xex(handler, qloVar);
        this.o2 = new AtomicBoolean();
        this.A2 = -9223372036854775807L;
        this.B2 = -9223372036854775807L;
        this.C2 = false;
    }

    @Override // a.mm30
    public final boolean B0(androidx.media3.common.b bVar) {
        tjf0 tjf0Var = this.d;
        tjf0Var.getClass();
        if (tjf0Var.f34046a != 0) {
            int iG0 = G0(bVar);
            if ((iG0 & 512) != 0) {
                tjf0 tjf0Var2 = this.d;
                tjf0Var2.getClass();
                if (tjf0Var2.f34046a == 2 || (iG0 & 1024) != 0 || (bVar.N == 0 && bVar.O == 0)) {
                    return true;
                }
            }
        }
        return this.m2.h(bVar) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    @Override // a.mm30
    public final int C0(androidx.media3.common.b bVar) {
        int iG0;
        rcf0 rcf0VarG;
        boolean z;
        boolean z2;
        int iF = j16.f(1, 0, 0, 0);
        String str = bVar.p;
        String str2 = bVar.p;
        if (!mg40.i(str)) {
            return j16.f(0, 0, 0, 0);
        }
        int i = bVar.T;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        osj osjVar = this.m2;
        if (z4) {
            if (z3) {
                List listE = qm30.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : (jm30) listE.get(0)) == null) {
                    iG0 = 0;
                }
            }
            iG0 = G0(bVar);
            if (osjVar.h(bVar) != 0) {
                return j16.f(4, 8, 32, iG0);
            }
        } else {
            iG0 = 0;
        }
        if (!"audio/raw".equals(str2) || osjVar.h(bVar) != 0) {
            int i3 = bVar.J;
            int i4 = bVar.L;
            awq awqVar = new awq();
            awqVar.o = mg40.n("audio/raw");
            awqVar.I = i3;
            awqVar.K = i4;
            awqVar.L = 2;
            if (osjVar.h(new androidx.media3.common.b(awqVar)) != 0) {
                if (str2 == null) {
                    v3x v3xVar = b4x.b;
                    rcf0VarG = rcf0.e;
                } else if (osjVar.h(bVar) != 0) {
                    List listE2 = qm30.e("audio/raw", false, false);
                    jm30 jm30Var = listE2.isEmpty() ? null : (jm30) listE2.get(0);
                    if (jm30Var != null) {
                        rcf0VarG = b4x.t(jm30Var);
                    } else {
                        rcf0VarG = qm30.g(bVar, false, false);
                    }
                } else {
                    rcf0VarG = qm30.g(bVar, false, false);
                }
                if (!rcf0VarG.isEmpty()) {
                    if (!z4) {
                        return j16.f(2, 0, 0, 0);
                    }
                    jm30 jm30Var2 = (jm30) rcf0VarG.get(0);
                    Context context = this.k2;
                    boolean zE = jm30Var2.e(context, bVar);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= rcf0VarG.d) {
                                z = zE;
                                z2 = true;
                                break;
                            }
                            jm30 jm30Var3 = (jm30) rcf0VarG.get(i5);
                            if (jm30Var3.e(context, bVar)) {
                                z2 = false;
                                jm30Var2 = jm30Var3;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zE;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && jm30Var2.f(bVar)) {
                        i2 = 16;
                    }
                    return (jm30Var2.g ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iG0;
                }
            }
        }
        return iF;
    }

    public final int G0(androidx.media3.common.b bVar) {
        d34 d34VarA;
        osj osjVar = this.m2;
        if (osjVar.a0) {
            d34VarA = d34.d;
        } else {
            h34 h34VarB = osjVar.r.b(osjVar.g(bVar));
            c34 c34Var = new c34();
            c34Var.f3655a = h34VarB.f12367a;
            c34Var.b = h34VarB.b;
            c34Var.c = h34VarB.c;
            d34VarA = c34Var.a();
        }
        if (!d34VarA.f5384a) {
            return 0;
        }
        int i = d34VarA.b ? 1536 : 512;
        return d34VarA.c ? i | 2048 : i;
    }

    public final void H0() {
        long j;
        long jMax;
        long j2;
        m();
        osj osjVar = this.m2;
        khf0 khf0Var = osjVar.b;
        if (!osjVar.m() || osjVar.H) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(osjVar.t.a(), vtt0.R(((k34) osjVar.p.e).b, osjVar.j()));
            ArrayDeque arrayDeque = osjVar.h;
            while (!arrayDeque.isEmpty() && jMin >= ((nsj) arrayDeque.getFirst()).c) {
                osjVar.w = (nsj) arrayDeque.remove();
            }
            nsj nsjVar = osjVar.w;
            long jT = jMin - nsjVar.c;
            long jY = vtt0.y(nsjVar.f24052a.f45148a, jT);
            if (arrayDeque.isEmpty()) {
                zkk0 zkk0Var = (zkk0) khf0Var.d;
                if (!zkk0Var.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (zkk0Var.m >= 1024) {
                    long j3 = zkk0Var.l;
                    ykk0 ykk0Var = zkk0Var.i;
                    ykk0Var.getClass();
                    long jQ = j3 - ((long) (ykk0Var.i.q() * (ykk0Var.j * ykk0Var.b)));
                    int i = zkk0Var.g.f28032a;
                    int i2 = zkk0Var.f.f28032a;
                    j = Long.MIN_VALUE;
                    long j4 = zkk0Var.m;
                    jT = i == i2 ? vtt0.T(jT, jQ, j4, RoundingMode.DOWN) : vtt0.T(jT, jQ * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jT = (long) (((double) zkk0Var.b) * jT);
                }
                nsj nsjVar2 = osjVar.w;
                j2 = nsjVar2.b + jT;
                nsjVar2.d = jT - jY;
            } else {
                j = Long.MIN_VALUE;
                nsj nsjVar3 = osjVar.w;
                j2 = nsjVar3.b + jY + nsjVar3.d;
            }
            long j5 = ((muj0) khf0Var.c).l;
            jMax = vtt0.R(((k34) osjVar.p.e).b, j5) + j2;
            long j6 = osjVar.c0;
            if (j5 > j6) {
                long jR = vtt0.R(((k34) osjVar.p.e).b, j5 - j6);
                osjVar.c0 = j5;
                osjVar.d0 += jR;
                Handler handler = osjVar.e0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    osjVar.e0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                osjVar.e0.postDelayed(new ccf((Object) osjVar, (byte) 5), 100L);
            }
        }
        if (jMax != j) {
            if (!this.u2) {
                jMax = Math.max(this.t2, jMax);
            }
            this.t2 = jMax;
            this.u2 = false;
        }
    }

    @Override // a.mm30
    public final alj J(jm30 jm30Var, androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z) {
        alj aljVarB = jm30Var.b(bVar, bVar2);
        int i = aljVarB.e;
        if (this.h1 == null && B0(bVar2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(jm30Var.f16746a);
        if (bVar2.q > this.p2) {
            i |= 64;
        }
        int i2 = i;
        return new alj(jm30Var.f16746a, bVar, bVar2, i2 != 0 ? 0 : aljVarB.d, i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // a.mm30
    public final ArrayList T(androidx.media3.common.b bVar, boolean z) {
        rcf0 rcf0VarG;
        if (bVar.p == null) {
            v3x v3xVar = b4x.b;
            rcf0VarG = rcf0.e;
        } else if (this.m2.h(bVar) != 0) {
            List listE = qm30.e("audio/raw", false, false);
            jm30 jm30Var = listE.isEmpty() ? null : (jm30) listE.get(0);
            if (jm30Var != null) {
                rcf0VarG = b4x.t(jm30Var);
            } else {
                rcf0VarG = qm30.g(bVar, z, false);
            }
        } else {
            rcf0VarG = qm30.g(bVar, z, false);
        }
        HashMap map = qm30.f28964a;
        ArrayList arrayList = new ArrayList(rcf0VarG);
        Collections.sort(arrayList, new gi2(new uq((Object) this.k2, (Object) bVar, (byte) 19), (byte) 6));
        return arrayList;
    }

    @Override // a.mm30
    public final long U(long j, boolean z, long j2) {
        long jT;
        osj osjVar = this.m2;
        boolean z2 = osjVar.k() && this.A2 != -9223372036854775807L;
        if (this.z2) {
            if (!osjVar.m()) {
                jT = -9223372036854775807L;
            } else if (osjVar.p.f()) {
                jT = vtt0.R(((k34) osjVar.p.e).b, osjVar.t.f19386a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = osjVar.t.f19386a.getBufferSizeInFrames();
                int iQ = obc.Q(((k34) osjVar.p.e).f17601a);
                x0x.K(iQ != -2147483647);
                jT = vtt0.T(bufferSizeInFrames, 1000000L, iQ, RoundingMode.DOWN);
            }
            if (this.x2 && z2 && jT != -9223372036854775807L) {
                float fMin = Math.min(jT, this.A2 - j);
                zx90 zx90Var = osjVar.x;
                return Math.max(10000L, (long) ((fMin / (zx90Var != null ? zx90Var.f45148a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.U1) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // a.mm30
    public final pzu W(jm30 jm30Var, androidx.media3.common.b bVar, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        Integer num;
        androidx.media3.common.b[] bVarArr = this.j;
        bVarArr.getClass();
        String str = jm30Var.f16746a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = bVar.q;
        String str2 = bVar.p;
        int i = bVar.J;
        int i2 = 0;
        if (bVarArr.length != 1) {
            for (androidx.media3.common.b bVar2 : bVarArr) {
                if (jm30Var.b(bVar, bVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, bVar2.q);
                }
            }
        }
        this.p2 = iMax;
        HashSet hashSet = hn30.f13332a;
        this.q2 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = jm30Var.c;
        int i3 = this.p2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i4 = bVar.L;
        mediaFormat.setInteger("sample-rate", i4);
        c9x.K(mediaFormat, bVar.s);
        c9x.A(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger(RemoteMessageConst.Notification.PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = jyc.b(bVar);
            if (pairB != null) {
                c9x.A(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) pairB.first).intValue());
                c9x.A(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        awq awqVar = new awq();
        awqVar.o = mg40.n("audio/raw");
        awqVar.I = i;
        awqVar.K = i4;
        awqVar.L = 4;
        androidx.media3.common.b bVar3 = new androidx.media3.common.b(awqVar);
        osj osjVar = this.m2;
        if (osjVar.h(bVar3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.y2));
        }
        androidx.media3.common.b bVar4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            n44 n44Var = osjVar.r;
            q24 q24Var = n44Var != null ? n44Var.g : null;
            int i6 = 12;
            if (q24Var == null) {
                f1t0.g0("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                f4x f4xVar = mvw.f22476a;
                Iterator it = q24Var.d.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!mvw.f22476a.contains(num));
                if (iIntValue != 0) {
                    i6 = iIntValue;
                } else {
                    for (Integer num2 : q24Var.c) {
                        int iIntValue2 = num2.intValue();
                        if (mvw.f22476a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i6 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i6);
                mediaFormat.setInteger("channel-mask", i6);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        H(mediaFormat);
        if ("audio/raw".equals(jm30Var.b) && !"audio/raw".equals(str2)) {
            bVar4 = bVar;
        }
        this.s2 = bVar4;
        return new pzu(jm30Var, mediaFormat, bVar, (Object) null, mediaCrypto, this.n2);
    }

    @Override // a.mm30
    public final void X(wkj wkjVar) {
        androidx.media3.common.b bVar;
        msj msjVar;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || (bVar = wkjVar.e) == null || !Objects.equals(bVar.p, "audio/opus") || !this.G1) {
            return;
        }
        ByteBuffer byteBuffer = wkjVar.j;
        byteBuffer.getClass();
        androidx.media3.common.b bVar2 = wkjVar.e;
        bVar2.getClass();
        int i2 = bVar2.N;
        if (byteBuffer.remaining() == 8) {
            int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            osj osjVar = this.m2;
            l44 l44Var = osjVar.t;
            if (l44Var == null || !l44Var.c() || (msjVar = osjVar.p) == null || !((k34) msjVar.e).k) {
                return;
            }
            l44 l44Var2 = osjVar.t;
            if (i < 29) {
                l44Var2.getClass();
            } else {
                l44Var2.f19386a.setOffloadDelayPadding(i2, i3);
            }
        }
    }

    @Override // a.bm30
    public final void a(zx90 zx90Var) {
        osj osjVar = this.m2;
        if (osjVar.v()) {
            osjVar.x = zx90Var;
            osjVar.s();
            return;
        }
        zx90 zx90Var2 = new zx90(vtt0.h(zx90Var.f45148a, 0.1f, 8.0f), vtt0.h(zx90Var.b, 0.1f, 8.0f));
        osjVar.x = zx90Var2;
        nsj nsjVar = new nsj(zx90Var2, -9223372036854775807L, -9223372036854775807L);
        if (osjVar.m()) {
            osjVar.v = nsjVar;
        } else {
            osjVar.w = nsjVar;
        }
    }

    @Override // a.bm30
    public final boolean b() {
        boolean z = this.w2;
        this.w2 = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    @Override // a.mm30, a.j16, a.x8a0
    public final void c(int i, Object obj) {
        dq00 dq00Var;
        osj osjVar = this.m2;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (osjVar.K != fFloatValue) {
                osjVar.K = fFloatValue;
                if (osjVar.m()) {
                    osjVar.t.f19386a.setVolume(osjVar.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            m24 m24Var = (m24) obj;
            m24Var.getClass();
            if (osjVar.u.equals(m24Var)) {
                return;
            }
            osjVar.u = m24Var;
            if (osjVar.Y) {
                return;
            }
            osjVar.q();
            return;
        }
        if (i == 6) {
            y55 y55Var = (y55) obj;
            y55Var.getClass();
            if (osjVar.V.equals(y55Var)) {
                return;
            }
            if (osjVar.t != null) {
                osjVar.V.getClass();
            }
            osjVar.V = y55Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            osjVar.W = audioDeviceInfo;
            l44 l44Var = osjVar.t;
            if (l44Var != null) {
                l44Var.f19386a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.y2 = ((Integer) obj).intValue();
            dm30 dm30Var = this.m1;
            if (dm30Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.y2));
                dm30Var.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            osjVar.y = ((Boolean) obj).booleanValue();
            nsj nsjVar = new nsj(osjVar.v() ? zx90.d : osjVar.x, -9223372036854775807L, -9223372036854775807L);
            if (osjVar.m()) {
                osjVar.v = nsjVar;
                return;
            } else {
                osjVar.w = nsjVar;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (osjVar.U) {
                if (osjVar.T == iIntValue) {
                    osjVar.U = false;
                    if (osjVar.T != iIntValue) {
                        osjVar.T = iIntValue;
                        osjVar.S = iIntValue != 0;
                        osjVar.q();
                    }
                }
            } else if (osjVar.T != iIntValue) {
                osjVar.T = iIntValue;
                osjVar.S = iIntValue != 0;
                osjVar.q();
            }
            if (Build.VERSION.SDK_INT < 35 || (dq00Var = this.n2) == null) {
                return;
            }
            dq00Var.j(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (osjVar.X == iIntValue2) {
                return;
            }
            osjVar.X = iIntValue2;
            osjVar.q();
            return;
        }
        if (i != 20) {
            super.c(i, obj);
            return;
        }
        obj.getClass();
        n44 n44Var = (n44) obj;
        n44 n44Var2 = osjVar.r;
        if (n44Var != n44Var2) {
            n44Var2.d();
            osjVar.r = n44Var;
            jsj jsjVar = osjVar.s;
            if (jsjVar != null) {
                n44Var.f();
                vg00 vg00Var = n44Var.e;
                if (vg00Var == null) {
                    vg00Var = new vg00(Thread.currentThread());
                    n44Var.e = vg00Var;
                }
                vg00Var.a(jsjVar);
            }
            osjVar.q();
        }
    }

    @Override // a.bm30
    public final zx90 d() {
        return this.m2.x;
    }

    @Override // a.mm30
    public final void d0(Exception exc) {
        f1t0.R("MediaCodecAudioRenderer", "Audio codec error", exc);
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, (Object) exc, (byte) 0));
        }
    }

    @Override // a.bm30
    public final long e() {
        if (this.h == 2) {
            H0();
        }
        return this.t2;
    }

    @Override // a.mm30
    public final void e0(long j, long j2, String str) {
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, str, j, j2));
        }
    }

    @Override // a.mm30
    public final void f0(hyc hycVar) {
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new fy2(xexVar, hycVar, (byte) 7));
        }
    }

    @Override // a.mm30
    public final void g0(String str) {
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, (Object) str, (byte) 5));
        }
    }

    @Override // a.mm30
    public final alj h0(hsj hsjVar) throws dlo {
        androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
        bVar.getClass();
        this.r2 = bVar;
        alj aljVarH0 = super.h0(hsjVar);
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, bVar, aljVarH0));
        }
        return aljVarH0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    @Override // a.mm30
    public final void i0(androidx.media3.common.b bVar, MediaFormat mediaFormat) throws dlo {
        int iZ;
        int integer;
        vn30 vn30Var;
        boolean z;
        androidx.media3.common.b bVar2 = this.s2;
        t3x t3xVar = null;
        if (bVar2 != null) {
            bVar = bVar2;
        } else if (this.m1 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(bVar.p)) {
                iZ = bVar.M;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iZ = mediaFormat.getInteger("pcm-encoding");
            } else {
                iZ = mediaFormat.containsKey("v-bits-per-sample") ? vtt0.z(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i = bVar.K;
            if (i == -1 || bVar.J != integer2) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i = integer;
            }
            awq awqVar = new awq();
            awqVar.o = mg40.n("audio/raw");
            awqVar.L = iZ;
            awqVar.M = bVar.N;
            awqVar.N = bVar.O;
            awqVar.l = bVar.m;
            awqVar.f1587a = bVar.f45386a;
            awqVar.b = bVar.b;
            awqVar.c = b4x.o(bVar.c);
            awqVar.d = bVar.d;
            awqVar.e = bVar.e;
            awqVar.f = bVar.f;
            awqVar.I = integer2;
            awqVar.J = i;
            awqVar.K = mediaFormat.getInteger("sample-rate");
            bVar = new androidx.media3.common.b(awqVar);
            if (this.q2) {
                int i2 = bVar.J;
                if (i2 == 3) {
                    t3xVar = kvu0.f18972a;
                } else if (i2 == 5) {
                    t3xVar = kvu0.b;
                } else if (i2 == 6) {
                    t3xVar = kvu0.c;
                } else if (i2 == 7) {
                    t3xVar = kvu0.d;
                } else if (i2 != 8) {
                    t3x t3xVar2 = kvu0.f18972a;
                } else {
                    t3xVar = kvu0.e;
                }
            }
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            osj osjVar = this.m2;
            if (i3 >= 29) {
                if (this.G1) {
                    tjf0 tjf0Var = this.d;
                    tjf0Var.getClass();
                    if (tjf0Var.f34046a != 0) {
                        tjf0 tjf0Var2 = this.d;
                        tjf0Var2.getClass();
                        byte b = tjf0Var2.f34046a;
                        x0x.K(i3 >= 29);
                        osjVar.i = b;
                    } else {
                        if (i3 >= 29) {
                            z = true;
                        } else {
                            z = false;
                        }
                        x0x.K(z);
                        osjVar.i = (byte) 0;
                    }
                } else {
                    if (i3 >= 29) {
                        z = true;
                    } else {
                        z = false;
                    }
                    x0x.K(z);
                    osjVar.i = (byte) 0;
                }
            }
            mii0 mii0Var = new mii0(bVar);
            mii0Var.c = t3xVar;
            bmq0 bmq0Var = this.p;
            mii0Var.d = bmq0Var;
            mii0Var.e = this.q;
            if (!bmq0Var.p() && (vn30Var = (vn30) mii0Var.e) != null) {
                if (((bmq0) mii0Var.d).b(vn30Var.f37698a) == -1) {
                    z2 = false;
                }
                x0x.A(z2);
            }
            osjVar.c(new z34(mii0Var));
            D0(this.n1);
        } catch (a44 e) {
            throw g(e, e.f205a, false, 5001);
        }
    }

    @Override // a.mm30
    public final void j0(long j) {
        this.m2.J = j;
    }

    @Override // a.j16
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // a.mm30
    public final void l0() {
        this.m2.G = true;
    }

    @Override // a.j16
    public final boolean m() {
        if (!this.U1) {
            return false;
        }
        osj osjVar = this.m2;
        if (osjVar.m()) {
            return osjVar.O && !osjVar.k();
        }
        return true;
    }

    @Override // a.j16
    public final boolean o() {
        boolean zIsReady;
        if (this.m2.k()) {
            this.B2 = -9223372036854775807L;
            this.C2 = true;
            return true;
        }
        if (!this.C2 || !this.z2) {
            return false;
        }
        if (l()) {
            zIsReady = this.n;
        } else {
            ixg0 ixg0Var = this.i;
            ixg0Var.getClass();
            zIsReady = ixg0Var.isReady();
        }
        if (!zIsReady || l()) {
            return false;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.B2;
        if (j != -9223372036854775807L) {
            return jElapsedRealtime - j < 100;
        }
        this.B2 = jElapsedRealtime;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    @Override // a.mm30
    public final boolean o0(long j, long j2, dm30 dm30Var, final ByteBuffer byteBuffer, int i, int i2, final int i3, final long j3, boolean z, boolean z2, androidx.media3.common.b bVar) throws dlo {
        final fm30 fm30Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.A2 = -9223372036854775807L;
        if (this.s2 != null && (i2 & 2) != 0) {
            dm30Var.getClass();
            dm30Var.k(i);
            return true;
        }
        if (z) {
            if (dm30Var != null) {
                dm30Var.k(i);
            }
            this.Y1.f += i3;
            this.m2.G = true;
            return true;
        }
        try {
            try {
                fm30Var = this;
                try {
                    fdq0 fdq0Var = new fdq0() { // from class: a.em30
                        /* JADX WARN: Code duplicated, block: B:104:0x01c9  */
                        /* JADX WARN: Code duplicated, block: B:105:0x01d4  */
                        /* JADX WARN: Code duplicated, block: B:107:0x01ed  */
                        /* JADX WARN: Code duplicated, block: B:110:0x01fa  */
                        /* JADX WARN: Code duplicated, block: B:111:0x0200  */
                        /* JADX WARN: Code duplicated, block: B:113:0x020e  */
                        /* JADX WARN: Code duplicated, block: B:120:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:12:0x0028  */
                        /* JADX WARN: Code duplicated, block: B:21:0x0058  */
                        /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
                        /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
                        /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
                        /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
                        /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
                        /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
                        /* JADX WARN: Code duplicated, block: B:62:0x0101  */
                        /* JADX WARN: Code duplicated, block: B:63:0x0103  */
                        /* JADX WARN: Code duplicated, block: B:67:0x010f  */
                        /* JADX WARN: Code duplicated, block: B:69:0x0117  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0131  */
                        /* JADX WARN: Code duplicated, block: B:79:0x0139  */
                        /* JADX WARN: Code duplicated, block: B:80:0x013e  */
                        /* JADX WARN: Code duplicated, block: B:82:0x0148  */
                        /* JADX WARN: Code duplicated, block: B:83:0x0155  */
                        /* JADX WARN: Code duplicated, block: B:86:0x016f  */
                        /* JADX WARN: Code duplicated, block: B:90:0x0180  */
                        /* JADX WARN: Code duplicated, block: B:94:0x019d  */
                        /* JADX WARN: Code duplicated, block: B:97:0x01a5  */
                        /* JADX WARN: Code duplicated, block: B:99:0x01b5  */
                        /* JADX WARN: Code restructure failed: missing block: B:72:0x0129, code lost:
                        
                            if (r3 == 0) goto L118;
                         */
                        @Override // a.fdq0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 564
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: a.em30.run():void");
                        }
                    };
                    if (dm30Var != null) {
                        dm30Var.r(fdq0Var);
                    } else {
                        fdq0Var.run();
                    }
                    if (!fm30Var.o2.get()) {
                        fm30Var.A2 = j3;
                        return false;
                    }
                    if (dm30Var != null) {
                        dm30Var.k(i);
                    }
                    fm30Var.Y1.e += i3;
                    return true;
                } catch (b44 e) {
                    e = e;
                    b44 b44Var = e;
                    androidx.media3.common.b bVar2 = fm30Var.r2;
                    if (fm30Var.G1) {
                        tjf0 tjf0Var = fm30Var.d;
                        tjf0Var.getClass();
                        if (tjf0Var.f34046a != 0) {
                            i5 = 5004;
                        } else {
                            i5 = 5001;
                        }
                    } else {
                        i5 = 5001;
                    }
                    throw fm30Var.g(b44Var, bVar2, b44Var.f1939a, i5);
                } catch (d44 e2) {
                    e = e2;
                    d44 d44Var = e;
                    if (fm30Var.G1) {
                        tjf0 tjf0Var2 = fm30Var.d;
                        tjf0Var2.getClass();
                        if (tjf0Var2.f34046a != 0) {
                            i4 = 5003;
                        } else {
                            i4 = 5002;
                        }
                    } else {
                        i4 = 5002;
                    }
                    throw fm30Var.g(d44Var, bVar, d44Var.b, i4);
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception e4) {
                itt0.o(e4);
                return false;
            }
        } catch (b44 e5) {
            e = e5;
            fm30Var = this;
        } catch (d44 e6) {
            e = e6;
            fm30Var = this;
        }
    }

    @Override // a.mm30, a.j16
    public final void p() {
        xex xexVar = this.l2;
        this.v2 = true;
        this.r2 = null;
        this.A2 = -9223372036854775807L;
        this.x2 = false;
        try {
            this.m2.f();
            try {
                super.p();
            } finally {
                xexVar.v(this.Y1);
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
                xexVar.v(this.Y1);
            }
        }
    }

    @Override // a.j16
    public final void q(boolean z, boolean z2) {
        tkj tkjVar = new tkj();
        this.Y1 = tkjVar;
        xex xexVar = this.l2;
        Handler handler = (Handler) xexVar.f40764a;
        if (handler != null) {
            handler.post(new w34(xexVar, (Object) tkjVar, (byte) 6));
        }
        tjf0 tjf0Var = this.d;
        tjf0Var.getClass();
        boolean z3 = tjf0Var.b;
        osj osjVar = this.m2;
        if (z3) {
            x0x.K(osjVar.S);
            if (!osjVar.Y) {
                osjVar.Y = true;
                osjVar.q();
            }
        } else if (osjVar.Y) {
            osjVar.Y = false;
            osjVar.q();
        }
        a4a0 a4a0Var = this.f;
        a4a0Var.getClass();
        osjVar.m = a4a0Var;
        l9o0 l9o0Var = this.g;
        l9o0Var.getClass();
        osjVar.r.f = l9o0Var;
        osjVar.n = new yox(this);
    }

    @Override // a.mm30, a.j16
    public final void r(long j, boolean z, boolean z2) throws dlo {
        super.r(j, z, z2);
        this.m2.f();
        this.t2 = j;
        this.A2 = -9223372036854775807L;
        this.B2 = -9223372036854775807L;
        this.C2 = false;
        this.w2 = false;
        this.x2 = false;
        this.u2 = true;
    }

    @Override // a.mm30
    public final void r0() throws dlo {
        try {
            osj osjVar = this.m2;
            if (!osjVar.O && osjVar.m() && osjVar.e()) {
                osjVar.o();
                osjVar.O = true;
            }
            long j = this.Z1.h;
            if (j != -9223372036854775807L) {
                this.A2 = j;
            }
        } catch (d44 e) {
            throw g(e, e.c, e.b, this.G1 ? 5003 : 5002);
        }
    }

    @Override // a.j16
    public final void s() {
        dq00 dq00Var;
        this.m2.r.d();
        if (Build.VERSION.SDK_INT < 35 || (dq00Var = this.n2) == null) {
            return;
        }
        ((HashSet) dq00Var.b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) dq00Var.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // a.j16
    public final void t() {
        osj osjVar = this.m2;
        this.w2 = false;
        this.x2 = false;
        this.A2 = -9223372036854775807L;
        try {
            try {
                this.G1 = false;
                s0();
                q0();
                ivn ivnVar = this.h1;
                if (ivnVar != null) {
                    ivnVar.m(null);
                }
                this.h1 = null;
                if (this.v2) {
                    this.v2 = false;
                    osjVar.r();
                }
            } catch (Throwable th) {
                ivn ivnVar2 = this.h1;
                if (ivnVar2 != null) {
                    ivnVar2.m(null);
                }
                this.h1 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.v2) {
                this.v2 = false;
                osjVar.r();
            }
            throw th2;
        }
    }

    @Override // a.j16
    public final void u() {
        this.m2.n();
        this.z2 = true;
    }

    @Override // a.j16
    public final void v() {
        H0();
        this.z2 = false;
        osj osjVar = this.m2;
        osjVar.R = false;
        if (osjVar.m()) {
            l44 l44Var = osjVar.t;
            o44 o44Var = l44Var.e;
            o44Var.e();
            if (o44Var.u == -9223372036854775807L) {
                o44Var.h.a(0);
            }
            o44Var.w = o44Var.a();
            if (!l44Var.j || l44Var.c()) {
                l44Var.f19386a.pause();
            }
        }
        this.x2 = false;
        this.B2 = -9223372036854775807L;
        this.C2 = false;
    }

    @Override // a.j16
    public final bm30 j() {
        return this;
    }
}
