package a;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Timeline$Window;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kn30 implements gt2 {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18565a;
    public final owj c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public dlo o;
    public zz2 p;
    public zz2 q;
    public zz2 r;
    public androidx.media3.common.b s;
    public androidx.media3.common.b t;
    public androidx.media3.common.b u;
    public boolean v;
    public byte w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = kc5.P0();
    public final Timeline$Window f = new Timeline$Window();
    public final amq0 g = new amq0();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public kn30(Context context, PlaybackSession playbackSession) {
        this.f18565a = context.getApplicationContext();
        this.d = playbackSession;
        owj owjVar = new owj();
        this.c = owjVar;
        owjVar.d = this;
    }

    public final boolean a(zz2 zz2Var) {
        String str;
        if (zz2Var == null) {
            return false;
        }
        String str2 = (String) zz2Var.c;
        owj owjVar = this.c;
        synchronized (owjVar) {
            str = owjVar.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new llo(this, this.k.build(), (byte) 22));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(bmq0 bmq0Var, vn30 vn30Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (vn30Var == null || (iB = bmq0Var.b(vn30Var.f37698a)) == -1) {
            return;
        }
        amq0 amq0Var = this.g;
        int i = 0;
        bmq0Var.f(iB, amq0Var, false);
        int i2 = amq0Var.c;
        Timeline$Window timeline$Window = this.f;
        bmq0Var.n(i2, timeline$Window);
        en30 en30Var = timeline$Window.b.b;
        if (en30Var != null) {
            int iF = vtt0.F(en30Var.f8073a, en30Var.b);
            if (iF == 0) {
                i = 3;
            } else if (iF != 1) {
                i = iF != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (timeline$Window.l != -9223372036854775807L && !timeline$Window.j && !timeline$Window.h && !timeline$Window.a()) {
            builder.setMediaDurationMillis(vtt0.Y(timeline$Window.l));
        }
        builder.setPlaybackType(timeline$Window.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x0456  */
    /* JADX WARN: Code duplicated, block: B:270:0x0493  */
    /* JADX WARN: Code duplicated, block: B:271:0x0495  */
    /* JADX WARN: Code duplicated, block: B:279:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:280:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:351:0x05b4 A[PHI: r8
  0x05b4: PHI (r8v38 int) = (r8v35 int), (r8v36 int) binds: [B:350:0x05b2, B:372:0x05e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:385:0x0600  */
    /* JADX WARN: Code duplicated, block: B:388:0x062e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0642 A[Catch: all -> 0x0651, TryCatch #0 {all -> 0x0651, blocks: (B:390:0x063e, B:392:0x0642, B:395:0x0653, B:396:0x065d, B:398:0x0663, B:400:0x0670, B:402:0x0674), top: B:409:0x063e }] */
    /* JADX WARN: Code duplicated, block: B:398:0x0663 A[Catch: all -> 0x0651, TryCatch #0 {all -> 0x0651, blocks: (B:390:0x063e, B:392:0x0642, B:395:0x0653, B:396:0x065d, B:398:0x0663, B:400:0x0670, B:402:0x0674), top: B:409:0x063e }] */
    /* JADX WARN: Code duplicated, block: B:408:0x067e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:409:0x063e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(my90 my90Var, xr xrVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        eld0 eld0Var;
        eld0 eld0Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        zz2 zz2Var;
        int i10;
        int i11;
        int i12;
        boolean z2;
        owj owjVar;
        String str;
        Iterator it;
        nwj nwjVar;
        kn30 kn30Var;
        androidx.media3.common.b bVar;
        int i13;
        int i14;
        DrmInitData drmInitData;
        int i15;
        if (((jjq) xrVar.f41344a).f16630a.size() == 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            boolean z3 = true;
            if (i16 >= ((jjq) xrVar.f41344a).f16630a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = ((jjq) xrVar.f41344a).f16630a;
            x0x.D(i16, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i16);
            ft2 ft2Var = (ft2) ((SparseArray) xrVar.b).get(iKeyAt);
            ft2Var.getClass();
            owj owjVar2 = this.c;
            if (iKeyAt == 0) {
                synchronized (owjVar2) {
                    try {
                        owjVar2.d.getClass();
                        bmq0 bmq0Var = owjVar2.e;
                        owjVar2.e = ft2Var.b;
                        Iterator it2 = owjVar2.c.values().iterator();
                        while (it2.hasNext()) {
                            nwj nwjVar2 = (nwj) it2.next();
                            if (!nwjVar2.b(bmq0Var, owjVar2.e) || nwjVar2.a(ft2Var)) {
                                it2.remove();
                                if (nwjVar2.f24237a.equals(owjVar2.f)) {
                                    owjVar2.a(nwjVar2);
                                }
                                if (nwjVar2.e) {
                                    owjVar2.d.f(ft2Var, nwjVar2.f24237a);
                                }
                            }
                        }
                        owjVar2.d(ft2Var);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iKeyAt == 11) {
                int i17 = this.l;
                synchronized (owjVar2) {
                    try {
                        owjVar2.d.getClass();
                        if (i17 != 0) {
                            z3 = false;
                        }
                        Iterator it3 = owjVar2.c.values().iterator();
                        while (it3.hasNext()) {
                            nwj nwjVar3 = (nwj) it3.next();
                            if (nwjVar3.a(ft2Var)) {
                                it3.remove();
                                boolean zEquals = nwjVar3.f24237a.equals(owjVar2.f);
                                if (zEquals) {
                                    owjVar2.a(nwjVar3);
                                }
                                if (nwjVar3.e) {
                                    if (z3 && zEquals) {
                                        boolean z4 = nwjVar3.f;
                                    }
                                    owjVar2.d.f(ft2Var, nwjVar3.f24237a);
                                }
                            }
                        }
                        owjVar2.d(ft2Var);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                owjVar2.e(ft2Var);
            }
            i16++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (xrVar.d(0)) {
            ft2 ft2Var2 = (ft2) ((SparseArray) xrVar.b).get(0);
            ft2Var2.getClass();
            if (this.k != null) {
                c(ft2Var2.b, ft2Var2.d);
            }
        }
        if (xrVar.d(2) && this.k != null) {
            v3x v3xVarListIterator = ((ulo) my90Var).o().f30305a.listIterator(0);
            loop3: while (true) {
                if (!v3xVarListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                qds0 qds0Var = (qds0) v3xVarListIterator.next();
                for (int i18 = 0; i18 < qds0Var.f28550a; i18++) {
                    if (qds0Var.e[i18] && (drmInitData = qds0Var.b.d[i18].t) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str2 = vtt0.f38024a;
                int i19 = 0;
                while (true) {
                    if (i19 >= drmInitData.d) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f45381a[i19].b;
                    if (uuid.equals(tg9.d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(tg9.e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(tg9.c)) {
                            i15 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (xrVar.d(1011)) {
            this.A++;
        }
        dlo dloVar = this.o;
        int i20 = 7;
        if (dloVar == null) {
            i9 = 1;
            i5 = 13;
            i2 = 8;
            i3 = 6;
            i4 = 9;
        } else {
            int i21 = dloVar.f6293a;
            Context context = this.f18565a;
            boolean z5 = this.w == 4;
            byte b = 21;
            if (i21 == 1001) {
                eld0Var = new eld0(20, 0, (byte) 7);
            } else {
                if (dloVar instanceof dlo) {
                    z = dloVar.c == 1;
                    i = dloVar.g;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = dloVar.getCause();
                cause.getClass();
                int i22 = 27;
                if (!(cause instanceof IOException)) {
                    i2 = 8;
                    i3 = 6;
                    i4 = 9;
                    if (z && (i == 0 || i == 1)) {
                        eld0Var = new eld0(35, 0, (byte) 7);
                    } else if (z && i == 3) {
                        eld0Var = new eld0(15, 0, (byte) 7);
                    } else if (z && i == 2) {
                        eld0Var = new eld0(23, 0, (byte) 7);
                    } else {
                        if (cause instanceof km30) {
                            i5 = 13;
                            eld0Var2 = new eld0(13, vtt0.w(((km30) cause).d), (byte) 7);
                        } else {
                            i5 = 13;
                            if (cause instanceof hm30) {
                                eld0Var2 = new eld0(14, ((hm30) cause).f13287a, (byte) 7);
                            } else if (cause instanceof OutOfMemoryError) {
                                eld0Var = new eld0(14, 0, (byte) 7);
                            } else if (cause instanceof b44) {
                                eld0Var = new eld0(17, 0, (byte) 7);
                            } else if (cause instanceof d44) {
                                eld0Var2 = new eld0(18, ((d44) cause).f5436a, (byte) 7);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (vtt0.v(errorCode)) {
                                    case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                        i22 = 24;
                                        break;
                                    case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                        i22 = 28;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                        i22 = 25;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                        i22 = 26;
                                        break;
                                }
                                eld0Var = new eld0(i22, errorCode, (byte) 7);
                            } else {
                                eld0Var = new eld0(22, 0, (byte) 7);
                            }
                        }
                        eld0Var = eld0Var2;
                    }
                    i5 = 13;
                } else if (cause instanceof ptw) {
                    eld0Var = new eld0(5, ((ptw) cause).c, (byte) 7);
                } else {
                    if ((cause instanceof otw) || (cause instanceof kq80)) {
                        i6 = 9;
                        i7 = 8;
                        i8 = 6;
                        eld0Var = new eld0(z5 ? 10 : 11, 0, (byte) 7);
                    } else {
                        boolean z6 = cause instanceof ntw;
                        if (z6 || (cause instanceof l3t0)) {
                            i6 = 9;
                            if (wl50.a(context).b() == 1) {
                                eld0Var = new eld0(3, 0, (byte) 7);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i8 = 6;
                                    eld0Var = new eld0(6, 0, (byte) 7);
                                } else {
                                    i8 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        eld0Var = new eld0(7, 0, (byte) 7);
                                    } else if (z6 && ((ntw) cause).b == 1) {
                                        eld0Var = new eld0(4, 0, (byte) 7);
                                    } else {
                                        i7 = 8;
                                        eld0Var = new eld0(8, 0, (byte) 7);
                                    }
                                }
                                i4 = 9;
                                i3 = i8;
                                i5 = 13;
                                i2 = 8;
                            }
                        } else if (i21 == 1002) {
                            eld0Var = new eld0(21, 0, (byte) 7);
                        } else if (cause instanceof xhl) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iW = vtt0.w(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (vtt0.v(iW)) {
                                    case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                        i22 = 24;
                                        break;
                                    case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                        i22 = 28;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                        i22 = 25;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                        i22 = 26;
                                        break;
                                }
                                eld0Var = new eld0(i22, iW, (byte) 7);
                            } else if (cause3 instanceof MediaDrmResetException) {
                                eld0Var = new eld0(27, 0, (byte) 7);
                            } else if (cause3 instanceof NotProvisionedException) {
                                eld0Var = new eld0(24, 0, (byte) 7);
                            } else if (cause3 instanceof DeniedByServerException) {
                                eld0Var = new eld0(29, 0, (byte) 7);
                            } else if (cause3 instanceof rft0) {
                                eld0Var = new eld0(23, 0, (byte) 7);
                            } else {
                                eld0Var = cause3 instanceof xtj ? new eld0(28, 0, (byte) 7) : new eld0(30, 0, (byte) 7);
                            }
                        } else if ((cause instanceof dzp) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            eld0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new eld0(32, 0, (byte) 7) : new eld0(31, 0, (byte) 7);
                        } else {
                            i6 = 9;
                            eld0Var = new eld0(9, 0, (byte) 7);
                        }
                        i4 = i6;
                        i5 = 13;
                        i2 = 8;
                        i3 = 6;
                    }
                    i4 = i6;
                    i2 = i7;
                    i3 = i8;
                    i5 = 13;
                }
                this.b.execute(new llo(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(eld0Var.b).setSubErrorCode(eld0Var.c).setException(dloVar).build(), b));
                i9 = 1;
                this.B = true;
                this.o = null;
            }
            i5 = 13;
            i2 = 8;
            i3 = 6;
            i4 = 9;
            this.b.execute(new llo(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(eld0Var.b).setSubErrorCode(eld0Var.c).setException(dloVar).build(), b));
            i9 = 1;
            this.B = true;
            this.o = null;
        }
        if (xrVar.d(2)) {
            rds0 rds0VarO = ((ulo) my90Var).o();
            boolean zA = rds0VarO.a(2);
            boolean zA2 = rds0VarO.a(i9);
            boolean zA3 = rds0VarO.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    bVar = null;
                } else {
                    if (Objects.equals(this.s, null)) {
                        bVar = null;
                    } else {
                        int i23 = this.s == null ? 1 : 0;
                        this.s = null;
                        i20 = 7;
                        bVar = null;
                        i10 = 10;
                        g(1, jElapsedRealtime, null, i23);
                    }
                    if (!zA2 && !Objects.equals(this.t, bVar)) {
                        if (this.t == null) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        this.t = bVar;
                        g(0, jElapsedRealtime, bVar, i14);
                    }
                    if (!zA3 && !Objects.equals(this.u, bVar)) {
                        if (this.u == null) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        this.u = bVar;
                        g(2, jElapsedRealtime, bVar, i13);
                    }
                    zz2Var = bVar;
                }
                i10 = 10;
                if (!zA2) {
                    if (this.t == null) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    this.t = bVar;
                    g(0, jElapsedRealtime, bVar, i14);
                }
                if (!zA3) {
                    if (this.u == null) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    this.u = bVar;
                    g(2, jElapsedRealtime, bVar, i13);
                }
                zz2Var = bVar;
            } else {
                i20 = 7;
                zz2Var = 0;
                i10 = 10;
            }
        } else {
            i20 = 7;
            zz2Var = 0;
            i10 = 10;
        }
        if (a(this.p)) {
            zz2 zz2Var2 = this.p;
            androidx.media3.common.b bVar2 = (androidx.media3.common.b) zz2Var2.b;
            if (bVar2.x != -1) {
                int i24 = zz2Var2.f45232a;
                if (!Objects.equals(this.s, bVar2)) {
                    int i25 = (this.s == null && i24 == 0) ? 1 : i24;
                    this.s = bVar2;
                    g(1, jElapsedRealtime, bVar2, i25);
                }
                this.p = zz2Var;
            }
        }
        if (a(this.q)) {
            zz2 zz2Var3 = this.q;
            androidx.media3.common.b bVar3 = (androidx.media3.common.b) zz2Var3.b;
            int i26 = zz2Var3.f45232a;
            if (!Objects.equals(this.t, bVar3)) {
                int i27 = (this.t == null && i26 == 0) ? 1 : i26;
                this.t = bVar3;
                g(0, jElapsedRealtime, bVar3, i27);
            }
            this.q = zz2Var;
        }
        if (a(this.r)) {
            zz2 zz2Var4 = this.r;
            androidx.media3.common.b bVar4 = (androidx.media3.common.b) zz2Var4.b;
            int i28 = zz2Var4.f45232a;
            if (!Objects.equals(this.u, bVar4)) {
                int i29 = (this.u == null && i28 == 0) ? 1 : i28;
                this.u = bVar4;
                g(2, jElapsedRealtime, bVar4, i29);
            }
            this.r = zz2Var;
        }
        switch (wl50.a(this.f18565a).b()) {
            case 0:
                i11 = 0;
                break;
            case 1:
                i11 = i4;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = i3;
                break;
            case 6:
            case 8:
            default:
                i11 = 1;
                break;
            case 7:
                i11 = 3;
                break;
            case 9:
                i11 = i2;
                break;
            case 10:
                i11 = i20;
                break;
        }
        if (i11 != this.n) {
            this.n = i11;
            this.b.execute(new llo(this, new NetworkEvent.Builder().setNetworkType(i11).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build(), (byte) 20));
        }
        ulo uloVar = (ulo) my90Var;
        if (uloVar.s() != 2) {
            this.v = false;
        }
        uloVar.c0();
        if (uloVar.n0.f == null) {
            this.x = false;
        } else if (xrVar.d(i10)) {
            this.x = true;
        }
        int iS = uloVar.s();
        if (!this.v) {
            if (this.x) {
                i12 = i5;
            } else {
                i5 = 4;
                if (iS == 4) {
                    i12 = 11;
                } else {
                    i12 = 2;
                    if (iS == 2) {
                        int i30 = this.m;
                        if (i30 != 0 && i30 != 2 && i30 != 12) {
                            i12 = uloVar.r() ? uloVar.t() != 0 ? i10 : i3 : i20;
                        }
                    } else {
                        i12 = 3;
                        if (iS != 3) {
                            z2 = true;
                            i12 = (iS != 1 || this.m == 0) ? this.m : 12;
                        } else if (!uloVar.r()) {
                            i12 = i5;
                        } else if (uloVar.t() != 0) {
                            i12 = i4;
                        }
                    }
                }
            }
            if (this.m != i12) {
                this.m = i12;
                this.B = z2;
                this.b.execute(new llo(this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build(), (byte) 23));
            }
            if (xrVar.d(1028)) {
                owjVar = this.c;
                ft2 ft2Var3 = (ft2) ((SparseArray) xrVar.b).get(1028);
                ft2Var3.getClass();
                synchronized (owjVar) {
                    try {
                        str = owjVar.f;
                        if (str != null) {
                            nwj nwjVar4 = (nwj) owjVar.c.get(str);
                            nwjVar4.getClass();
                            owjVar.a(nwjVar4);
                        }
                        it = owjVar.c.values().iterator();
                        while (it.hasNext()) {
                            nwjVar = (nwj) it.next();
                            it.remove();
                            if (!nwjVar.e && (kn30Var = owjVar.d) != null) {
                                kn30Var.f(ft2Var3, nwjVar.f24237a);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        i12 = 5;
        z2 = true;
        if (this.m != i12) {
            this.m = i12;
            this.B = z2;
            this.b.execute(new llo(this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build(), (byte) 23));
        }
        if (xrVar.d(1028)) {
            owjVar = this.c;
            ft2 ft2Var4 = (ft2) ((SparseArray) xrVar.b).get(1028);
            ft2Var4.getClass();
            synchronized (owjVar) {
                str = owjVar.f;
                if (str != null) {
                    nwj nwjVar5 = (nwj) owjVar.c.get(str);
                    nwjVar5.getClass();
                    owjVar.a(nwjVar5);
                }
                it = owjVar.c.values().iterator();
                while (it.hasNext()) {
                    nwjVar = (nwj) it.next();
                    it.remove();
                    if (!nwjVar.e) {
                    }
                }
            }
        }
    }

    public final void e(ft2 ft2Var, String str) {
        vn30 vn30Var = ft2Var.d;
        if (vn30Var == null || !vn30Var.c()) {
            b();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
            c(ft2Var.b, vn30Var);
        }
    }

    public final void f(ft2 ft2Var, String str) {
        vn30 vn30Var = ft2Var.d;
        if ((vn30Var == null || !vn30Var.c()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void g(int i, long j, androidx.media3.common.b bVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (bVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = bVar.o;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bVar.p;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bVar.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = bVar.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = bVar.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = bVar.x;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = bVar.J;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = bVar.L;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = bVar.d;
            if (str4 != null) {
                String str5 = vtt0.f38024a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = bVar.B;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new llo(this, timeSinceCreatedMillis.build(), (byte) 19));
    }
}
