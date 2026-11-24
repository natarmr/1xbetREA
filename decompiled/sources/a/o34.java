package a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class o34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f24564a = new k050();
    public AudioTrack b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        l34 l34Var;
        k050 k050Var;
        if (zjeVar instanceof l34) {
            l34Var = (l34) zjeVar;
            int i = l34Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l34Var.l = i - Integer.MIN_VALUE;
            } else {
                l34Var = new l34(this, zjeVar);
            }
        } else {
            l34Var = new l34(this, zjeVar);
        }
        Object obj = l34Var.j;
        wne wneVar = wne.f39444a;
        int i2 = l34Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f24564a;
            l34Var.i = k050Var2;
            l34Var.l = 1;
            if (k050Var2.d(l34Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = l34Var.i;
            z1x.P(obj);
        }
        try {
            AudioTrack audioTrack = this.b;
            this.b = null;
            if (audioTrack != null) {
                try {
                    audioTrack.stop();
                } catch (Exception unused) {
                }
                try {
                    audioTrack.release();
                } catch (Exception unused2) {
                }
            }
            int minBufferSize = AudioTrack.getMinBufferSize(JosStatusCodes.RTN_CODE_COMMON_ERROR, 4, 2);
            if (minBufferSize < 3840) {
                minBufferSize = 3840;
            }
            try {
                AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(JosStatusCodes.RTN_CODE_COMMON_ERROR).setChannelMask(4).build()).setBufferSizeInBytes(minBufferSize).setTransferMode(1).build();
                audioTrackBuild.getClass();
                audioTrackBuild.write(new short[640], 0, 640);
                audioTrackBuild.play();
                this.b = audioTrackBuild;
            } catch (Exception unused3) {
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        m34 m34Var;
        k050 k050Var;
        if (zjeVar instanceof m34) {
            m34Var = (m34) zjeVar;
            int i = m34Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                m34Var.l = i - Integer.MIN_VALUE;
            } else {
                m34Var = new m34(this, zjeVar);
            }
        } else {
            m34Var = new m34(this, zjeVar);
        }
        Object obj = m34Var.j;
        wne wneVar = wne.f39444a;
        int i2 = m34Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f24564a;
            m34Var.i = k050Var2;
            m34Var.l = 1;
            if (k050Var2.d(m34Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = m34Var.i;
            z1x.P(obj);
        }
        try {
            AudioTrack audioTrack = this.b;
            this.b = null;
            k050Var.c(null);
            if (audioTrack != null) {
                try {
                    audioTrack.stop();
                } catch (Exception unused) {
                }
                try {
                    audioTrack.release();
                } catch (Exception unused2) {
                }
            }
            return Unit.f46060a;
        } catch (Throwable th) {
            k050Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: Exception -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a2, blocks: (B:13:0x0031, B:22:0x0052, B:26:0x0067, B:28:0x006c, B:30:0x0072, B:34:0x007b, B:37:0x0094, B:39:0x0098, B:40:0x009b, B:41:0x009c, B:18:0x0045, B:25:0x0065), top: B:47:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[Catch: Exception -> 0x00a2, TryCatch #1 {Exception -> 0x00a2, blocks: (B:13:0x0031, B:22:0x0052, B:26:0x0067, B:28:0x006c, B:30:0x0072, B:34:0x007b, B:37:0x0094, B:39:0x0098, B:40:0x009b, B:41:0x009c, B:18:0x0045, B:25:0x0065), top: B:47:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[Catch: Exception -> 0x00a2, TryCatch #1 {Exception -> 0x00a2, blocks: (B:13:0x0031, B:22:0x0052, B:26:0x0067, B:28:0x006c, B:30:0x0072, B:34:0x007b, B:37:0x0094, B:39:0x0098, B:40:0x009b, B:41:0x009c, B:18:0x0045, B:25:0x0065), top: B:47:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: Exception -> 0x00a2, TryCatch #1 {Exception -> 0x00a2, blocks: (B:13:0x0031, B:22:0x0052, B:26:0x0067, B:28:0x006c, B:30:0x0072, B:34:0x007b, B:37:0x0094, B:39:0x0098, B:40:0x009b, B:41:0x009c, B:18:0x0045, B:25:0x0065), top: B:47:0x0021, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0065 A[EXC_TOP_SPLITTER, PHI: r2 r6 r9 r10
  0x0065: PHI (r2v4 int) = (r2v6 int), (r2v7 int) binds: [B:23:0x0062, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r6v0 a.k050) = (r6v6 a.k050), (r6v7 a.k050) binds: [B:23:0x0062, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r9v1 short[]) = (r9v2 short[]), (r9v4 short[]) binds: [B:23:0x0062, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r10v3 int) = (r10v5 int), (r10v6 int) binds: [B:23:0x0062, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0091 -> B:21:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0094 -> B:21:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(short[] r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.n34
            if (r0 == 0) goto L13
            r0 = r10
            a.n34 r0 = (a.n34) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.n34 r0 = new a.n34
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L37
            int r9 = r0.l
            int r2 = r0.k
            a.k050 r6 = r0.j
            android.media.AudioTrack r6 = (android.media.AudioTrack) r6
            short[] r6 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Exception -> La2
            r10 = r9
            r9 = r6
            goto L50
        L37:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L3d:
            int r9 = r0.l
            int r2 = r0.k
            a.k050 r6 = r0.j
            short[] r7 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Exception -> La2
            r10 = r9
            r9 = r7
            goto L65
        L4b:
            a.z1x.P(r10)
            int r10 = r9.length
            r2 = 0
        L50:
            if (r10 <= 0) goto L9c
            a.k050 r6 = r8.f24564a     // Catch: java.lang.Exception -> La2
            r0.i = r9     // Catch: java.lang.Exception -> La2
            r0.j = r6     // Catch: java.lang.Exception -> La2
            r0.k = r2     // Catch: java.lang.Exception -> La2
            r0.l = r10     // Catch: java.lang.Exception -> La2
            r0.o = r3     // Catch: java.lang.Exception -> La2
            java.lang.Object r7 = r6.d(r0)     // Catch: java.lang.Exception -> La2
            if (r7 != r1) goto L65
            goto L93
        L65:
            android.media.AudioTrack r7 = r8.b     // Catch: java.lang.Throwable -> L97
            r6.c(r5)     // Catch: java.lang.Exception -> La2
            if (r7 != 0) goto L72
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Exception -> La2
            r8.<init>(r2)     // Catch: java.lang.Exception -> La2
            return r8
        L72:
            int r6 = r7.write(r9, r2, r10)     // Catch: java.lang.Exception -> La2
            if (r6 >= 0) goto L79
            goto L9c
        L79:
            if (r6 != 0) goto L94
            a.uen r6 = a.wen.b     // Catch: java.lang.Exception -> La2
            a.bfn r6 = a.bfn.MILLISECONDS     // Catch: java.lang.Exception -> La2
            long r6 = a.ibc.v0(r4, r6)     // Catch: java.lang.Exception -> La2
            r0.i = r9     // Catch: java.lang.Exception -> La2
            r0.j = r5     // Catch: java.lang.Exception -> La2
            r0.k = r2     // Catch: java.lang.Exception -> La2
            r0.l = r10     // Catch: java.lang.Exception -> La2
            r0.o = r4     // Catch: java.lang.Exception -> La2
            java.lang.Object r6 = a.qcc.P(r6, r0)     // Catch: java.lang.Exception -> La2
            if (r6 != r1) goto L50
        L93:
            return r1
        L94:
            int r2 = r2 + r6
            int r10 = r10 - r6
            goto L50
        L97:
            r8 = move-exception
            r6.c(r5)     // Catch: java.lang.Exception -> La2
            throw r8     // Catch: java.lang.Exception -> La2
        L9c:
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Exception -> La2
            r8.<init>(r2)     // Catch: java.lang.Exception -> La2
            return r8
        La2:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o34.c(short[], a.zje):java.lang.Object");
    }
}
