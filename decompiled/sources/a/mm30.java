package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class mm30 extends j16 {
    public static final byte[] j2 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public boolean A1;
    public final cf60 B;
    public long B1;
    public int C1;
    public int D1;
    public ByteBuffer E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public byte K1;
    public byte L1;
    public byte M1;
    public boolean N1;
    public boolean O1;
    public boolean P1;
    public long Q1;
    public long R1;
    public boolean S1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public dlo X1;
    public final AtomicInteger Y;
    public tkj Y1;
    public androidx.media3.common.b Z;
    public lm30 Z1;
    public long a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public long e2;
    public androidx.media3.common.b f1;
    public long f2;
    public ivn g1;
    public hyc g2;
    public ivn h1;
    public hyc h2;
    public ylo i1;
    public f4x i2;
    public MediaCrypto j1;
    public float k1;
    public float l1;
    public dm30 m1;
    public androidx.media3.common.b n1;
    public MediaFormat o1;
    public boolean p1;
    public float q1;
    public ArrayDeque r1;
    public km30 s1;
    public final Context t;
    public jm30 t1;
    public final cm30 u;
    public int u1;
    public final wkj v;
    public boolean v1;
    public final wkj w;
    public boolean w1;
    public final wkj x;
    public boolean x1;
    public final ra6 y;
    public boolean y1;
    public final MediaCodec.BufferInfo z;
    public long z1;

    public mm30(Context context, int i, cm30 cm30Var) {
        super(i);
        this.t = context.getApplicationContext();
        this.u = cm30Var;
        this.Y = new AtomicInteger();
        this.v = new wkj(0);
        this.w = new wkj(0);
        this.x = new wkj(2);
        ra6 ra6Var = new ra6(2);
        ra6Var.n = (byte) 32;
        this.y = ra6Var;
        this.z = new MediaCodec.BufferInfo();
        this.k1 = 1.0f;
        this.l1 = 1.0f;
        this.A = new ArrayDeque();
        this.Z1 = lm30.i;
        ra6Var.x(0);
        ra6Var.g.order(ByteOrder.nativeOrder());
        cf60 cf60Var = new cf60();
        cf60Var.d = u34.f34978a;
        cf60Var.c = 0;
        cf60Var.b = 2;
        this.B = cf60Var;
        this.q1 = -1.0f;
        this.u1 = 0;
        this.K1 = (byte) 0;
        this.C1 = -1;
        this.D1 = -1;
        this.B1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.a2 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        this.L1 = (byte) 0;
        this.M1 = (byte) 0;
        this.Y1 = new tkj();
        this.d2 = false;
        this.e2 = 0L;
        this.f2 = -9223372036854775807L;
        int i2 = f4x.c;
        this.i2 = ycf0.j;
        hyc hycVar = hyc.b;
        this.g2 = hycVar;
        this.h2 = hycVar;
    }

    public boolean A0() {
        byte b = this.M1;
        if (b == 3 || (this.v1 && !this.P1)) {
            return true;
        }
        if (b != 2) {
            return false;
        }
        try {
            E0();
            return false;
        } catch (dlo e) {
            f1t0.h0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean B0(androidx.media3.common.b bVar) {
        return false;
    }

    @Override // a.j16
    public void C(float f, float f2) {
        this.k1 = f;
        this.l1 = f2;
        D0(this.n1);
    }

    public abstract int C0(androidx.media3.common.b bVar);

    @Override // a.j16
    public final int D(androidx.media3.common.b bVar) throws dlo {
        try {
            return C0(bVar);
        } catch (om30 e) {
            throw g(e, bVar, false, 4002);
        }
    }

    public final void D0(androidx.media3.common.b bVar) {
        if (this.m1 == null || this.M1 == 3 || this.h == 0) {
            return;
        }
        float f = this.l1;
        bVar.getClass();
        androidx.media3.common.b[] bVarArr = this.j;
        bVarArr.getClass();
        float fS = S(f, bVar, bVarArr);
        float f2 = this.q1;
        if (f2 == fS || fS == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fS > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS);
            dm30 dm30Var = this.m1;
            dm30Var.getClass();
            dm30Var.b(bundle);
            this.q1 = fS;
        }
    }

    @Override // a.j16
    public final int E() {
        return 8;
    }

    public final void E0() {
        ivn ivnVar = this.h1;
        ivnVar.getClass();
        ivnVar.b();
        v0(this.h1);
        this.L1 = (byte) 0;
        this.M1 = (byte) 0;
    }

    public final void F0(long j) {
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.Z1.d.Y(j);
        if (bVar == null && this.b2 && this.o1 != null) {
            bVar = (androidx.media3.common.b) this.Z1.d.X();
        }
        if (bVar != null) {
            this.f1 = bVar;
        } else if (!this.p1 || (bVar = this.f1) == null) {
            return;
        }
        i0(bVar, this.o1);
        this.p1 = false;
        this.b2 = false;
    }

    public final void H(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.g2.f13853a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f0  */
    public final boolean I(long j, long j3) throws dlo {
        ra6 ra6Var;
        int length;
        ByteBuffer byteBuffer;
        x0x.K(!this.U1);
        ra6 ra6Var2 = this.y;
        if (ra6Var2.A()) {
            ByteBuffer byteBuffer2 = ra6Var2.g;
            int i = this.D1;
            int i2 = ra6Var2.m;
            long j4 = ra6Var2.i;
            boolean Z = Z(this.l, ra6Var2.l);
            boolean zM = ra6Var2.m(4);
            androidx.media3.common.b bVar = this.f1;
            bVar.getClass();
            ra6Var = ra6Var2;
            if (!o0(j, j3, null, byteBuffer2, i, 0, i2, j4, Z, zM, bVar)) {
                return false;
            }
            k0(ra6Var.l);
            ra6Var.v();
        } else {
            ra6Var = ra6Var2;
        }
        if (this.S1) {
            this.U1 = true;
            return false;
        }
        boolean z = this.H1;
        wkj wkjVar = this.x;
        if (z) {
            x0x.K(ra6Var.z(wkjVar));
            this.H1 = false;
        }
        if (this.I1) {
            if (ra6Var.A()) {
                return true;
            }
            this.G1 = false;
            s0();
            this.I1 = false;
            a0();
            if (!this.G1) {
                return false;
            }
        }
        x0x.K(!this.S1);
        hsj hsjVar = this.c;
        hsjVar.e();
        wkjVar.v();
        while (true) {
            wkjVar.v();
            int iY = y(hsjVar, wkjVar, 0);
            if (iY == -5) {
                h0(hsjVar);
                break;
            }
            if (iY != -4) {
                if (iY != -3) {
                    v4i0.e();
                    return false;
                }
                if (!l()) {
                    break;
                }
                V().h = this.Q1;
                break;
            }
            if (wkjVar.m(4)) {
                this.S1 = true;
                V().h = this.Q1;
                break;
            }
            this.Q1 = Math.max(this.Q1, wkjVar.i);
            if (l() || this.w.m(536870912)) {
                V().h = this.Q1;
            }
            byte[] bArr = null;
            if (this.V1) {
                androidx.media3.common.b bVar2 = this.Z;
                bVar2.getClass();
                this.f1 = bVar2;
                if (Objects.equals(bVar2.p, "audio/opus") && !this.f1.s.isEmpty()) {
                    byte[] bArr2 = (byte[]) this.f1.s.get(0);
                    int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                    awq awqVarA = this.f1.a();
                    awqVarA.M = i3;
                    this.f1 = new androidx.media3.common.b(awqVarA);
                }
                i0(this.f1, null);
                this.V1 = false;
            }
            wkjVar.y();
            androidx.media3.common.b bVar3 = this.f1;
            if (bVar3 == null || !Objects.equals(bVar3.p, "audio/opus")) {
                ra6Var = ra6Var;
            } else {
                if (wkjVar.m(268435456)) {
                    wkjVar.e = this.f1;
                    X(wkjVar);
                }
                if (this.l - wkjVar.i <= 80000) {
                    List list = this.f1.s;
                    wkjVar.g.getClass();
                    if (wkjVar.g.limit() - wkjVar.g.position() == 0) {
                        ra6Var = ra6Var;
                    } else {
                        cf60 cf60Var = this.B;
                        if (cf60Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = wkjVar.g;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i4 = iLimit - iPosition;
                        int i5 = (i4 + 255) / 255;
                        int i6 = i5 + 27 + i4;
                        if (cf60Var.b == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i6 = length + 44 + i6;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) cf60Var.d).capacity() < i6) {
                            cf60Var.d = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) cf60Var.d).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) cf60Var.d;
                        if (cf60Var.b == 2) {
                            if (bArr != null) {
                                cf60.q(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(ohm0.j(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, vtt0.m(byteBuffer.arrayOffset(), byteBuffer.array(), bArr.length + 28, 0));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(cf60.e);
                            }
                            byteBuffer.put(cf60.f);
                        } else {
                            ra6Var = ra6Var;
                            byteBuffer = byteBuffer4;
                        }
                        int iU = cf60Var.c + ((int) ((zvw.U(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                        cf60Var.c = iU;
                        cf60.q(byteBuffer, iU, cf60Var.b, i5, false);
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (i4 >= 255) {
                                byteBuffer.put((byte) -1);
                                i4 -= 255;
                            } else {
                                byteBuffer.put((byte) i4);
                                i4 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (cf60Var.b == 2) {
                            byteBuffer.putInt(length + 66, vtt0.m(byteBuffer.arrayOffset() + length + 44, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        } else {
                            byteBuffer.putInt(22, vtt0.m(byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        }
                        cf60Var.b++;
                        cf60Var.d = byteBuffer;
                        wkjVar.v();
                        wkjVar.x(((ByteBuffer) cf60Var.d).remaining());
                        wkjVar.g.put((ByteBuffer) cf60Var.d);
                        wkjVar.y();
                    }
                } else {
                    ra6Var = ra6Var;
                }
            }
            if (ra6Var.A()) {
                long j5 = this.l;
                ra6Var = ra6Var;
                if (Z(j5, ra6Var.l) == Z(j5, wkjVar.i)) {
                }
                this.H1 = true;
                break;
            }
            ra6Var = ra6Var;
            if (!ra6Var.z(wkjVar)) {
                this.H1 = true;
                break;
            }
        }
        if (ra6Var.A()) {
            ra6Var.y();
        }
        return ra6Var.A() || this.S1 || this.I1;
    }

    public abstract alj J(jm30 jm30Var, androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z);

    public hm30 K(IllegalStateException illegalStateException, jm30 jm30Var) {
        return new hm30(illegalStateException, jm30Var);
    }

    public final boolean L() {
        if (!this.N1) {
            E0();
            return true;
        }
        this.L1 = (byte) 1;
        if (A0()) {
            this.M1 = (byte) 3;
            return false;
        }
        this.M1 = (byte) 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    public final boolean M(long j, long j3) throws dlo {
        boolean z;
        boolean z2;
        boolean z3;
        dm30 dm30Var = this.m1;
        dm30Var.getClass();
        int i = this.D1;
        MediaCodec.BufferInfo bufferInfo = this.z;
        if (i < 0) {
            int iQ = dm30Var.q(bufferInfo);
            if (iQ < 0) {
                if (iQ != -2) {
                    if (this.y1 && (this.S1 || this.L1 == 2)) {
                        n0();
                    }
                    long j4 = this.z1;
                    if (j4 != -9223372036854775807L) {
                        long j5 = j4 + 100;
                        this.g.getClass();
                        if (j5 < System.currentTimeMillis()) {
                            n0();
                            return false;
                        }
                    }
                    return false;
                }
                this.P1 = true;
                dm30 dm30Var2 = this.m1;
                dm30Var2.getClass();
                MediaFormat mediaFormatE = dm30Var2.e();
                if (this.u1 != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
                    this.x1 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.i2.isEmpty()) {
                    f4x<String> f4xVar = this.i2;
                    hyc hycVar = hyc.b;
                    HashMap map = new HashMap();
                    for (String str : f4xVar) {
                        if (mediaFormatE.containsKey(str)) {
                            int valueTypeForKey = mediaFormatE.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatE.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatE.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatE.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatE.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatE.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    hyc hycVar2 = new hyc(map);
                    if (!hycVar2.equals(this.h2)) {
                        this.h2 = hycVar2;
                        f0(hycVar2);
                    }
                }
                this.o1 = mediaFormatE;
                this.p1 = true;
                return true;
            }
            long j6 = this.f2;
            this.F1 = j6 != -9223372036854775807L && bufferInfo.presentationTimeUs <= j6;
            bufferInfo.presentationTimeUs -= this.e2;
            if (this.x1) {
                this.x1 = false;
                dm30Var.k(iQ);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                n0();
                return false;
            }
            this.D1 = iQ;
            ByteBuffer byteBufferS = dm30Var.s(iQ);
            this.E1 = byteBufferS;
            if (byteBufferS != null) {
                byteBufferS.position(bufferInfo.offset);
                this.E1.limit(bufferInfo.offset + bufferInfo.size);
            }
            F0(bufferInfo.presentationTimeUs);
        }
        lm30 lm30Var = this.Z1;
        lm30 lm30Var2 = lm30.i;
        if ((lm30Var.f & 1) != 0) {
            long j7 = lm30Var.e;
            if (j7 == -9223372036854775807L || bufferInfo.presentationTimeUs - lm30Var.c < j7) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z4 = this.F1 || this.d2 || bufferInfo.presentationTimeUs < this.l || z;
        long j8 = lm30Var.h;
        if (j8 == -9223372036854775807L || j8 > bufferInfo.presentationTimeUs || z) {
            z2 = true;
            z3 = false;
        } else {
            z2 = true;
            z3 = true;
        }
        ByteBuffer byteBuffer2 = this.E1;
        int i2 = this.D1;
        int i3 = bufferInfo.flags;
        long j9 = bufferInfo.presentationTimeUs;
        androidx.media3.common.b bVar = this.f1;
        bVar.getClass();
        boolean z5 = z2;
        if (!o0(j, j3, dm30Var, byteBuffer2, i2, i3, 1, j9, z4, z3, bVar)) {
            return false;
        }
        k0(bufferInfo.presentationTimeUs);
        boolean z6 = (bufferInfo.flags & 4) != 0 ? z5 : false;
        if (!z6 && this.O1 && z3) {
            this.g.getClass();
            this.z1 = System.currentTimeMillis();
        }
        this.D1 = -1;
        this.E1 = null;
        if (!z6) {
            return z5;
        }
        n0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x0209  */
    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x00a4 A[EDGE_INSN: B:130:0x00a4->B:33:0x00a4 BREAK  A[LOOP:0: B:30:0x0082->B:32:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[LOOP:0: B:30:0x0082->B:32:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b0  */
    public final boolean N() throws dlo {
        int iPosition;
        hsj hsjVar;
        int i;
        long j;
        boolean zM;
        long j3;
        lm30 lm30VarV;
        long j4;
        int iR;
        long j5;
        int i2;
        long j6;
        long j7;
        int[] iArr;
        lm30 lm30VarV2;
        long j8;
        lm30 lm30VarV3;
        long j9;
        int i3;
        androidx.media3.common.b bVar;
        wkj wkjVar = this.w;
        pef pefVar = wkjVar.f;
        lm30 lm30VarV4 = V();
        ixg0 ixg0Var = this.i;
        ixg0Var.getClass();
        lm30VarV4.f = ixg0Var.a();
        dm30 dm30Var = this.m1;
        if (dm30Var != null && this.L1 != 2 && !this.S1) {
            if (this.C1 < 0) {
                int iO = dm30Var.o();
                this.C1 = iO;
                if (iO >= 0) {
                    wkjVar.g = dm30Var.h(iO);
                    wkjVar.v();
                    if (this.L1 == 1) {
                        if (!this.y1) {
                            this.O1 = true;
                            dm30Var.c(this.C1, 0, 4, 0L);
                            this.C1 = -1;
                            wkjVar.g = null;
                        }
                        this.L1 = (byte) 2;
                        return false;
                    }
                    if (this.w1) {
                        this.w1 = false;
                        ByteBuffer byteBuffer = wkjVar.g;
                        byteBuffer.getClass();
                        byteBuffer.put(j2);
                        dm30Var.c(this.C1, 38, 0, 0L);
                        this.C1 = -1;
                        wkjVar.g = null;
                        this.N1 = true;
                        return true;
                    }
                    if (this.K1 == 1) {
                        i3 = 0;
                        while (true) {
                            bVar = this.n1;
                            bVar.getClass();
                            if (i3 < bVar.s.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.n1.s.get(i3);
                            ByteBuffer byteBuffer2 = wkjVar.g;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.K1 = (byte) 2;
                    }
                    ByteBuffer byteBuffer3 = wkjVar.g;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    hsjVar = this.c;
                    hsjVar.e();
                    try {
                        dm30Var.r(new uq((Object) this, (Object) hsjVar, (byte) 18));
                        i = this.Y.get();
                        if (i == -3) {
                            if (l()) {
                                lm30 lm30VarV5 = V();
                                lm30VarV3 = V();
                                lm30 lm30Var = lm30.i;
                                if ((lm30VarV3.f & 1) != 0) {
                                    j9 = this.R1;
                                } else {
                                    j9 = this.Q1;
                                }
                                lm30VarV5.h = j9;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.K1 == 2) {
                                    wkjVar.v();
                                    this.K1 = (byte) 1;
                                }
                                h0(hsjVar);
                                return true;
                            }
                            if (wkjVar.m(4)) {
                                if (!this.N1 || wkjVar.m(1)) {
                                    j = wkjVar.i;
                                    if (!x0(wkjVar)) {
                                        zM = wkjVar.m(1073741824);
                                        if (zM && iPosition != 0) {
                                            iArr = pefVar.d;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                                pefVar.d = iArr;
                                                pefVar.i.numBytesOfClearData = iArr;
                                            }
                                            iArr[0] = iArr[0] + iPosition;
                                        }
                                        if (this.V1) {
                                            lm30 lm30VarV6 = V();
                                            tyc tycVar = lm30VarV6.d;
                                            androidx.media3.common.b bVar2 = this.Z;
                                            bVar2.getClass();
                                            tycVar.f(bVar2, j);
                                            lm30VarV6.g = true;
                                            this.V1 = false;
                                        }
                                        if (this.d2) {
                                            j6 = this.Q1;
                                            j7 = this.e2;
                                            this.f2 = j6 + j7;
                                            if (j <= j6) {
                                                this.e2 = (j6 - j) + 1 + j7;
                                            }
                                            this.Q1 = j;
                                            this.R1 = j;
                                            this.d2 = false;
                                        }
                                        this.Q1 = Math.max(this.Q1, j);
                                        j3 = this.r;
                                        if (j3 != -9223372036854775807L || j - V().c < j3) {
                                            this.R1 = Math.max(this.R1, j);
                                        }
                                        if (l() || wkjVar.m(536870912)) {
                                            lm30 lm30VarV7 = V();
                                            lm30VarV = V();
                                            lm30 lm30Var2 = lm30.i;
                                            if ((lm30VarV.f & 1) != 0) {
                                                j4 = this.R1;
                                            } else {
                                                j4 = this.Q1;
                                            }
                                            lm30VarV7.h = j4;
                                        }
                                        wkjVar.y();
                                        if (wkjVar.m(268435456)) {
                                            X(wkjVar);
                                        }
                                        m0(wkjVar);
                                        iR = R(wkjVar);
                                        j5 = this.e2 + j;
                                        i2 = this.C1;
                                        if (zM) {
                                            dm30Var.d(i2, pefVar, j5, iR);
                                        } else {
                                            ByteBuffer byteBuffer4 = wkjVar.g;
                                            byteBuffer4.getClass();
                                            dm30Var.c(i2, byteBuffer4.limit(), iR, j5);
                                        }
                                        this.C1 = -1;
                                        wkjVar.g = null;
                                        this.N1 = true;
                                        this.K1 = (byte) 0;
                                        this.Y1.c++;
                                        return true;
                                    }
                                } else {
                                    wkjVar.v();
                                    this.Y1.d++;
                                    if (this.K1 == 2) {
                                        this.K1 = (byte) 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            lm30 lm30VarV8 = V();
                            lm30VarV2 = V();
                            lm30 lm30Var3 = lm30.i;
                            if ((lm30VarV2.f & 1) != 0) {
                                j8 = this.R1;
                            } else {
                                j8 = this.Q1;
                            }
                            lm30VarV8.h = j8;
                            if (this.K1 == 2) {
                                wkjVar.v();
                                this.K1 = (byte) 1;
                            }
                            this.S1 = true;
                            if (!this.N1) {
                                n0();
                                return false;
                            }
                            if (!this.y1) {
                                this.O1 = true;
                                dm30Var.c(this.C1, 0, 4, 0L);
                                this.C1 = -1;
                                wkjVar.g = null;
                                return false;
                            }
                        }
                    } catch (vkj e) {
                        d0(e);
                        p0(0);
                        O();
                        return true;
                    }
                }
            } else {
                if (this.L1 == 1) {
                    if (!this.y1) {
                        this.O1 = true;
                        dm30Var.c(this.C1, 0, 4, 0L);
                        this.C1 = -1;
                        wkjVar.g = null;
                    }
                    this.L1 = (byte) 2;
                    return false;
                }
                if (this.w1) {
                    this.w1 = false;
                    ByteBuffer byteBuffer5 = wkjVar.g;
                    byteBuffer5.getClass();
                    byteBuffer5.put(j2);
                    dm30Var.c(this.C1, 38, 0, 0L);
                    this.C1 = -1;
                    wkjVar.g = null;
                    this.N1 = true;
                    return true;
                }
                if (this.K1 == 1) {
                    i3 = 0;
                    while (true) {
                        bVar = this.n1;
                        bVar.getClass();
                        if (i3 < bVar.s.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.n1.s.get(i3);
                        ByteBuffer byteBuffer6 = wkjVar.g;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.K1 = (byte) 2;
                }
                ByteBuffer byteBuffer7 = wkjVar.g;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                hsjVar = this.c;
                hsjVar.e();
                dm30Var.r(new uq((Object) this, (Object) hsjVar, (byte) 18));
                i = this.Y.get();
                if (i == -3) {
                    if (l()) {
                        lm30 lm30VarV9 = V();
                        lm30VarV3 = V();
                        lm30 lm30Var4 = lm30.i;
                        if ((lm30VarV3.f & 1) != 0) {
                            j9 = this.R1;
                        } else {
                            j9 = this.Q1;
                        }
                        lm30VarV9.h = j9;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.K1 == 2) {
                            wkjVar.v();
                            this.K1 = (byte) 1;
                        }
                        h0(hsjVar);
                        return true;
                    }
                    if (wkjVar.m(4)) {
                        if (this.N1) {
                            j = wkjVar.i;
                            if (!x0(wkjVar)) {
                                zM = wkjVar.m(1073741824);
                                if (zM) {
                                    iArr = pefVar.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        pefVar.d = iArr;
                                        pefVar.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.V1) {
                                    lm30 lm30VarV10 = V();
                                    tyc tycVar2 = lm30VarV10.d;
                                    androidx.media3.common.b bVar3 = this.Z;
                                    bVar3.getClass();
                                    tycVar2.f(bVar3, j);
                                    lm30VarV10.g = true;
                                    this.V1 = false;
                                }
                                if (this.d2) {
                                    j6 = this.Q1;
                                    j7 = this.e2;
                                    this.f2 = j6 + j7;
                                    if (j <= j6) {
                                        this.e2 = (j6 - j) + 1 + j7;
                                    }
                                    this.Q1 = j;
                                    this.R1 = j;
                                    this.d2 = false;
                                }
                                this.Q1 = Math.max(this.Q1, j);
                                j3 = this.r;
                                if (j3 != -9223372036854775807L) {
                                    this.R1 = Math.max(this.R1, j);
                                } else {
                                    this.R1 = Math.max(this.R1, j);
                                }
                                if (l()) {
                                    lm30 lm30VarV11 = V();
                                    lm30VarV = V();
                                    lm30 lm30Var5 = lm30.i;
                                    if ((lm30VarV.f & 1) != 0) {
                                        j4 = this.R1;
                                    } else {
                                        j4 = this.Q1;
                                    }
                                    lm30VarV11.h = j4;
                                } else {
                                    lm30 lm30VarV12 = V();
                                    lm30VarV = V();
                                    lm30 lm30Var6 = lm30.i;
                                    if ((lm30VarV.f & 1) != 0) {
                                        j4 = this.R1;
                                    } else {
                                        j4 = this.Q1;
                                    }
                                    lm30VarV12.h = j4;
                                }
                                wkjVar.y();
                                if (wkjVar.m(268435456)) {
                                    X(wkjVar);
                                }
                                m0(wkjVar);
                                iR = R(wkjVar);
                                j5 = this.e2 + j;
                                i2 = this.C1;
                                if (zM) {
                                    dm30Var.d(i2, pefVar, j5, iR);
                                } else {
                                    ByteBuffer byteBuffer8 = wkjVar.g;
                                    byteBuffer8.getClass();
                                    dm30Var.c(i2, byteBuffer8.limit(), iR, j5);
                                }
                                this.C1 = -1;
                                wkjVar.g = null;
                                this.N1 = true;
                                this.K1 = (byte) 0;
                                this.Y1.c++;
                                return true;
                            }
                        } else {
                            j = wkjVar.i;
                            if (!x0(wkjVar)) {
                                zM = wkjVar.m(1073741824);
                                if (zM) {
                                    iArr = pefVar.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        pefVar.d = iArr;
                                        pefVar.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.V1) {
                                    lm30 lm30VarV13 = V();
                                    tyc tycVar3 = lm30VarV13.d;
                                    androidx.media3.common.b bVar4 = this.Z;
                                    bVar4.getClass();
                                    tycVar3.f(bVar4, j);
                                    lm30VarV13.g = true;
                                    this.V1 = false;
                                }
                                if (this.d2) {
                                    j6 = this.Q1;
                                    j7 = this.e2;
                                    this.f2 = j6 + j7;
                                    if (j <= j6) {
                                        this.e2 = (j6 - j) + 1 + j7;
                                    }
                                    this.Q1 = j;
                                    this.R1 = j;
                                    this.d2 = false;
                                }
                                this.Q1 = Math.max(this.Q1, j);
                                j3 = this.r;
                                if (j3 != -9223372036854775807L) {
                                    this.R1 = Math.max(this.R1, j);
                                } else {
                                    this.R1 = Math.max(this.R1, j);
                                }
                                if (l()) {
                                    lm30 lm30VarV14 = V();
                                    lm30VarV = V();
                                    lm30 lm30Var7 = lm30.i;
                                    if ((lm30VarV.f & 1) != 0) {
                                        j4 = this.R1;
                                    } else {
                                        j4 = this.Q1;
                                    }
                                    lm30VarV14.h = j4;
                                } else {
                                    lm30 lm30VarV15 = V();
                                    lm30VarV = V();
                                    lm30 lm30Var8 = lm30.i;
                                    if ((lm30VarV.f & 1) != 0) {
                                        j4 = this.R1;
                                    } else {
                                        j4 = this.Q1;
                                    }
                                    lm30VarV15.h = j4;
                                }
                                wkjVar.y();
                                if (wkjVar.m(268435456)) {
                                    X(wkjVar);
                                }
                                m0(wkjVar);
                                iR = R(wkjVar);
                                j5 = this.e2 + j;
                                i2 = this.C1;
                                if (zM) {
                                    dm30Var.d(i2, pefVar, j5, iR);
                                } else {
                                    ByteBuffer byteBuffer9 = wkjVar.g;
                                    byteBuffer9.getClass();
                                    dm30Var.c(i2, byteBuffer9.limit(), iR, j5);
                                }
                                this.C1 = -1;
                                wkjVar.g = null;
                                this.N1 = true;
                                this.K1 = (byte) 0;
                                this.Y1.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    lm30 lm30VarV16 = V();
                    lm30VarV2 = V();
                    lm30 lm30Var9 = lm30.i;
                    if ((lm30VarV2.f & 1) != 0) {
                        j8 = this.R1;
                    } else {
                        j8 = this.Q1;
                    }
                    lm30VarV16.h = j8;
                    if (this.K1 == 2) {
                        wkjVar.v();
                        this.K1 = (byte) 1;
                    }
                    this.S1 = true;
                    if (!this.N1) {
                        n0();
                        return false;
                    }
                    if (!this.y1) {
                        this.O1 = true;
                        dm30Var.c(this.C1, 0, 4, 0L);
                        this.C1 = -1;
                        wkjVar.g = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void O() {
        try {
            dm30 dm30Var = this.m1;
            dm30Var.getClass();
            dm30Var.flush();
        } finally {
            t0();
        }
    }

    public final boolean P() {
        if (this.m1 != null) {
            if (A0()) {
                q0();
                return true;
            }
            if (y0()) {
                O();
                return false;
            }
            if (this.N1) {
                this.d2 = true;
            }
        }
        return false;
    }

    public final List Q(boolean z) {
        androidx.media3.common.b bVar = this.Z;
        bVar.getClass();
        ArrayList arrayListT = T(bVar, z);
        if (!arrayListT.isEmpty() || !z) {
            return arrayListT;
        }
        ArrayList arrayListT2 = T(bVar, false);
        if (!arrayListT2.isEmpty()) {
            f1t0.g0("MediaCodecRenderer", "Drm session requires secure decoder for " + bVar.p + ", but no secure decoder available. Trying to proceed with " + arrayListT2 + Separators.DOT);
        }
        return arrayListT2;
    }

    public int R(wkj wkjVar) {
        return 0;
    }

    public float S(float f, androidx.media3.common.b bVar, androidx.media3.common.b[] bVarArr) {
        MediaFormat mediaFormat;
        int integer = -1;
        for (androidx.media3.common.b bVar2 : bVarArr) {
            int i = bVar2.L;
            if (i != -1) {
                integer = Math.max(integer, i);
            }
        }
        if (integer == -1 && (mediaFormat = this.o1) != null && mediaFormat.containsKey("sample-rate")) {
            integer = mediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f;
    }

    public abstract ArrayList T(androidx.media3.common.b bVar, boolean z);

    public long U(long j, boolean z, long j3) {
        return super.i(j, j3);
    }

    public final lm30 V() {
        ArrayDeque arrayDeque = this.A;
        return !arrayDeque.isEmpty() ? (lm30) arrayDeque.getLast() : this.Z1;
    }

    public abstract pzu W(jm30 jm30Var, androidx.media3.common.b bVar, MediaCrypto mediaCrypto, float f);

    public abstract void X(wkj wkjVar);

    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    public final void Y(jm30 jm30Var, MediaCrypto mediaCrypto) {
        int i;
        this.t1 = jm30Var;
        androidx.media3.common.b bVar = this.Z;
        bVar.getClass();
        String str = jm30Var.f16746a;
        float f = this.l1;
        androidx.media3.common.b[] bVarArr = this.j;
        bVarArr.getClass();
        float fS = S(f, bVar, bVarArr);
        if (fS <= 0.0f) {
            fS = -1.0f;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        pzu pzuVarW = W(jm30Var, bVar, mediaCrypto, fS);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            a4a0 a4a0Var = this.f;
            a4a0Var.getClass();
            LogSessionId logSessionIdA = a4a0Var.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) pzuVarW.b).setString("log-session-id", logSessionIdA.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            dm30 dm30VarC = this.u.c(pzuVarW);
            this.m1 = dm30VarC;
            this.A1 = dm30VarC.l(new nv20(this));
            Trace.endSection();
            this.g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!jm30Var.e(this.t, bVar)) {
                String strC = androidx.media3.common.b.c(bVar);
                Locale locale = Locale.US;
                f1t0.g0("MediaCodecRenderer", b1j.k("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.q1 = fS;
            this.n1 = bVar;
            HashSet hashSet = hn30.f13332a;
            boolean z = false;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.u1 = i;
            this.v1 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = jm30Var.f16746a;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && jm30Var.f))) {
                z = true;
            }
            this.y1 = z;
            this.m1.getClass();
            if (this.h == 2) {
                this.g.getClass();
                this.B1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.Y1.f34097a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i2 >= 31 && !this.i2.isEmpty()) {
                dm30 dm30Var = this.m1;
                dm30Var.getClass();
                dm30Var.t(new ArrayList(this.i2));
            }
            e0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean Z(long j, long j3) {
        if (j3 >= j) {
            return false;
        }
        androidx.media3.common.b bVar = this.f1;
        return bVar == null || !Objects.equals(bVar.p, "audio/opus") || j - j3 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a0() throws dlo {
        androidx.media3.common.b bVar;
        ivn ivnVar;
        if (this.m1 != null || this.G1 || (bVar = this.Z) == null) {
            return;
        }
        String str = bVar.p;
        if (this.h1 == null && B0(bVar)) {
            this.G1 = false;
            s0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            ra6 ra6Var = this.y;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ra6Var.n = (byte) 32;
            } else {
                ra6Var.n = (byte) 1;
            }
            this.G1 = true;
            return;
        }
        v0(this.h1);
        if (this.g1 == null) {
            try {
                ivnVar = this.g1;
                if (ivnVar != null && (ivnVar.e() == 3 || this.g1.e() == 4)) {
                    ivn ivnVar2 = this.g1;
                    str.getClass();
                    ivnVar2.getClass();
                }
                b0(this.j1, false);
            } catch (km30 e) {
                throw g(e, bVar, false, 4001);
            }
        } else {
            x0x.K(this.j1 == null);
            ivn ivnVar3 = this.g1;
            ivnVar3.getClass();
            HashSet hashSet = hn30.f13332a;
            boolean z = u7r.f35199a;
            if (ivnVar3.c() != null) {
                ivnVar = this.g1;
                if (ivnVar != null) {
                    ivn ivnVar4 = this.g1;
                    str.getClass();
                    ivnVar4.getClass();
                }
                b0(this.j1, false);
            }
        }
        MediaCrypto mediaCrypto = this.j1;
        if (mediaCrypto == null || this.m1 != null) {
            return;
        }
        mediaCrypto.release();
        this.j1 = null;
    }

    public final void b0(MediaCrypto mediaCrypto, boolean z) throws km30 {
        androidx.media3.common.b bVar = this.Z;
        bVar.getClass();
        if (this.r1 == null) {
            try {
                List listQ = Q(z);
                this.r1 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listQ;
                if (!arrayList.isEmpty()) {
                    this.r1.add((jm30) arrayList.get(0));
                }
                this.s1 = null;
            } catch (om30 e) {
                throw new km30(bVar, e, z, -49998);
            }
        }
        if (this.r1.isEmpty()) {
            throw new km30(bVar, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.r1;
        arrayDeque.getClass();
        while (this.m1 == null) {
            jm30 jm30Var = (jm30) arrayDeque.peekFirst();
            jm30Var.getClass();
            if (!c0(bVar) || !z0(jm30Var)) {
                return;
            }
            try {
                Y(jm30Var, mediaCrypto);
            } catch (Exception e2) {
                f1t0.h0("MediaCodecRenderer", "Failed to initialize decoder: " + jm30Var, e2);
                arrayDeque.removeFirst();
                km30 km30Var = new km30("Decoder init failed: " + jm30Var.f16746a + ", " + bVar, e2, bVar.p, z, jm30Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                d0(km30Var);
                km30 km30Var2 = this.s1;
                if (km30Var2 == null) {
                    this.s1 = km30Var;
                } else {
                    this.s1 = new km30(km30Var2.getMessage(), km30Var2.getCause(), km30Var2.f18520a, km30Var2.b, km30Var2.c, km30Var2.d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.s1;
                }
            }
        }
        this.r1 = null;
    }

    @Override // a.j16, a.x8a0
    public void c(int i, Object obj) {
        int i2;
        if (i == 11) {
            ylo yloVar = (ylo) obj;
            yloVar.getClass();
            this.i1 = yloVar;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                f4x f4xVar = (f4x) obj;
                if (this.i2.equals(f4xVar)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(f4xVar);
                    HashSet hashSet2 = new HashSet();
                    eet0 it = this.i2.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    dm30 dm30Var = this.m1;
                    if (dm30Var != null) {
                        if (!hashSet2.isEmpty()) {
                            dm30Var.v(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            dm30Var.t(new ArrayList(hashSet));
                        }
                    }
                }
                this.i2 = f4xVar;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            hyc hycVar = (hyc) obj;
            this.g2 = hycVar;
            dm30 dm30Var2 = this.m1;
            if (dm30Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : hycVar.f13853a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                dm30Var2.b(bundle);
            }
        }
    }

    public boolean c0(androidx.media3.common.b bVar) {
        return true;
    }

    public abstract void d0(Exception exc);

    public abstract void e0(long j, long j3, String str);

    public abstract void f0(hyc hycVar);

    public abstract void g0(String str);

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    public alj h0(hsj hsjVar) throws dlo {
        androidx.media3.common.b bVar;
        int i;
        Pair pairB;
        String str;
        boolean z = true;
        this.V1 = true;
        androidx.media3.common.b bVar2 = (androidx.media3.common.b) hsjVar.b;
        bVar2.getClass();
        String str2 = bVar2.p;
        if (str2 == null) {
            throw g(new IllegalArgumentException("Sample MIME type is null."), bVar2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = jyc.f17352a;
                if (str2.equals("video/dolby-vision") && (pairB = jyc.b(bVar2)) != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                        str = "video/hevc";
                    } else if (iIntValue == 512) {
                        str = "video/avc";
                    } else if (iIntValue != 1024) {
                        str = null;
                    } else {
                        str = "video/av01";
                    }
                } else {
                    str = null;
                }
                if (Objects.equals(str, "video/av01")) {
                    if (bVar2.s.isEmpty()) {
                        awq awqVarA = bVar2.a();
                        awqVarA.r = null;
                        bVar = new androidx.media3.common.b(awqVarA);
                    }
                }
            }
            bVar = bVar2;
        } else if (bVar2.s.isEmpty()) {
            bVar = bVar2;
        } else {
            awq awqVarA2 = bVar2.a();
            awqVarA2.r = null;
            bVar = new androidx.media3.common.b(awqVarA2);
        }
        ivn ivnVar = (ivn) hsjVar.f13586a;
        ivn ivnVar2 = this.h1;
        this.h1 = ivnVar;
        this.Z = bVar;
        if (this.G1) {
            this.I1 = true;
            return null;
        }
        dm30 dm30Var = this.m1;
        if (dm30Var == null) {
            this.r1 = null;
            a0();
            return null;
        }
        jm30 jm30Var = this.t1;
        jm30Var.getClass();
        androidx.media3.common.b bVar3 = this.n1;
        bVar3.getClass();
        if (this.g1 != this.h1) {
            if (this.N1) {
                this.L1 = (byte) 1;
                this.M1 = (byte) 3;
            } else {
                q0();
                a0();
            }
            return new alj(jm30Var.f16746a, bVar3, bVar, 0, 128);
        }
        boolean z2 = this.h1 != this.g1;
        alj aljVarJ = J(jm30Var, bVar3, bVar, V().g);
        int i2 = aljVarJ.d;
        if (i2 != 0) {
            if (i2 == 1) {
                D0(bVar);
                this.n1 = bVar;
                if (z2) {
                    if (!L()) {
                        i = 2;
                    }
                } else if (this.N1) {
                    this.L1 = (byte) 1;
                    if (A0()) {
                        this.M1 = (byte) 3;
                        i = 2;
                    } else {
                        this.M1 = (byte) 1;
                    }
                }
            } else if (i2 == 2) {
                D0(bVar);
                this.J1 = true;
                this.K1 = (byte) 1;
                int i3 = this.u1;
                if (i3 != 2 && (i3 != 1 || bVar.w != bVar3.w || bVar.x != bVar3.x)) {
                    z = false;
                }
                this.w1 = z;
                this.n1 = bVar;
                if (z2 && !L()) {
                    i = 2;
                }
            } else {
                if (i2 != 3) {
                    v4i0.e();
                    return null;
                }
                D0(bVar);
                this.n1 = bVar;
                if (z2 && !L()) {
                    i = 2;
                }
            }
            return (i2 != 0 || (this.m1 == dm30Var && this.M1 != 3)) ? aljVarJ : new alj(jm30Var.f16746a, bVar3, bVar, 0, i);
        }
        if (this.N1) {
            this.L1 = (byte) 1;
            this.M1 = (byte) 3;
        } else {
            q0();
            a0();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    @Override // a.j16
    public final long i(long j, long j3) {
        return U(j, this.A1, j3);
    }

    public abstract void i0(androidx.media3.common.b bVar, MediaFormat mediaFormat);

    public void k0(long j) {
        this.a2 = Math.max(j, this.a2);
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j < ((lm30) arrayDeque.peek()).f20277a) {
                return;
            }
            lm30 lm30Var = (lm30) arrayDeque.poll();
            lm30Var.getClass();
            w0(lm30Var);
            l0();
        }
    }

    public abstract void l0();

    public final void n0() throws dlo {
        byte b = this.M1;
        if (b == 1) {
            O();
            return;
        }
        if (b == 2) {
            O();
            E0();
        } else if (b != 3) {
            this.U1 = true;
            r0();
        } else {
            q0();
            a0();
        }
    }

    public abstract boolean o0(long j, long j3, dm30 dm30Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j4, boolean z, boolean z2, androidx.media3.common.b bVar);

    @Override // a.j16
    public void p() {
        this.Z = null;
        w0(lm30.i);
        this.A.clear();
        if (!this.G1) {
            P();
        } else {
            this.G1 = false;
            s0();
        }
    }

    public final boolean p0(int i) throws dlo {
        hsj hsjVar = this.c;
        hsjVar.e();
        wkj wkjVar = this.v;
        wkjVar.v();
        int iY = y(hsjVar, wkjVar, i | 4);
        if (iY == -5) {
            h0(hsjVar);
            return true;
        }
        if (iY != -4 || !wkjVar.m(4)) {
            return false;
        }
        this.S1 = true;
        n0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        try {
            dm30 dm30Var = this.m1;
            if (dm30Var != null) {
                dm30Var.release();
                this.Y1.b++;
                jm30 jm30Var = this.t1;
                jm30Var.getClass();
                g0(jm30Var.f16746a);
            }
            this.m1 = null;
            try {
                MediaCrypto mediaCrypto = this.j1;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.j1 = null;
                v0(null);
                u0();
            }
        } catch (Throwable th) {
            this.m1 = null;
            try {
                MediaCrypto mediaCrypto2 = this.j1;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.j1 = null;
                v0(null);
                u0();
            }
        }
    }

    @Override // a.j16
    public void r(long j, boolean z, boolean z2) throws dlo {
        ArrayDeque arrayDeque = this.A;
        if (!arrayDeque.isEmpty()) {
            this.Z1 = (lm30) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.S1 = false;
            this.U1 = false;
            this.W1 = false;
            if (this.G1) {
                s0();
            } else if (P()) {
                a0();
            }
            if (this.Z1.d.f0() > 0) {
                this.V1 = true;
            }
            this.Z1.d.l();
            this.Z1.g = false;
        }
    }

    public abstract void r0();

    public final void s0() {
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.a2 = -9223372036854775807L;
        this.I1 = false;
        this.y.v();
        this.x.v();
        this.H1 = false;
        ByteBuffer byteBuffer = u34.f34978a;
        cf60 cf60Var = this.B;
        cf60Var.d = byteBuffer;
        cf60Var.c = 0;
        cf60Var.b = 2;
    }

    public void t0() {
        this.C1 = -1;
        this.w.g = null;
        this.D1 = -1;
        this.E1 = null;
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.a2 = -9223372036854775807L;
        this.B1 = -9223372036854775807L;
        this.O1 = false;
        this.z1 = -9223372036854775807L;
        this.N1 = false;
        this.w1 = false;
        this.x1 = false;
        this.F1 = false;
        this.L1 = (byte) 0;
        this.M1 = (byte) 0;
        this.K1 = this.J1 ? (byte) 1 : (byte) 0;
        this.d2 = false;
        this.e2 = 0L;
        this.f2 = -9223372036854775807L;
    }

    public final void u0() {
        t0();
        this.X1 = null;
        this.r1 = null;
        this.t1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = false;
        this.P1 = false;
        this.q1 = -1.0f;
        this.u1 = 0;
        this.v1 = false;
        this.y1 = false;
        this.A1 = false;
        this.J1 = false;
        this.K1 = (byte) 0;
    }

    public final void v0(ivn ivnVar) {
        ivn ivnVar2 = this.g1;
        this.g1 = ivnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r4 >= r2) goto L16;
     */
    @Override // a.j16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(androidx.media3.common.b[] r13, long r14, long r16, a.vn30 r18) {
        /*
            r12 = this;
            long r8 = r12.r
            a.ixg0 r13 = r12.i
            r13.getClass()
            a.ixg0 r13 = (a.ixg0) r13
            int r1 = r13.a()
            a.lm30 r13 = r12.Z1
            long r2 = r13.c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r13 != 0) goto L32
            a.lm30 r0 = new a.lm30
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r14
            r6 = r16
            r0.<init>(r1, r2, r4, r6, r8)
            r12.w0(r0)
            boolean r13 = r12.c2
            if (r13 == 0) goto L65
            r12.l0()
            return
        L32:
            java.util.ArrayDeque r13 = r12.A
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L66
            long r2 = r12.Q1
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r4 = r12.a2
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L66
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L66
        L4a:
            a.lm30 r0 = new a.lm30
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r14
            r6 = r16
            r0.<init>(r1, r2, r4, r6, r8)
            r12.w0(r0)
            a.lm30 r13 = r12.Z1
            long r0 = r13.c
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L65
            r12.l0()
        L65:
            return
        L66:
            a.lm30 r0 = new a.lm30
            long r2 = r12.Q1
            r4 = r14
            r6 = r16
            r0.<init>(r1, r2, r4, r6, r8)
            r13.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mm30.w(androidx.media3.common.b[], long, long, a.vn30):void");
    }

    public final void w0(lm30 lm30Var) {
        this.Z1 = lm30Var;
        long j = lm30Var.c;
        if (j != -9223372036854775807L) {
            this.b2 = true;
            j0(j);
        }
    }

    @Override // a.j16
    public final void x() {
        V().e = this.r;
    }

    public boolean x0(wkj wkjVar) {
        return false;
    }

    public boolean y0() {
        return this.N1;
    }

    @Override // a.j16
    public void z(long j, long j3) throws dlo {
        boolean z = false;
        if (this.W1) {
            this.W1 = false;
            n0();
        }
        dlo dloVar = this.X1;
        if (dloVar != null) {
            this.X1 = null;
            throw dloVar;
        }
        try {
            if (this.U1) {
                r0();
                return;
            }
            if (this.Z != null || p0(2)) {
                a0();
                if (this.G1) {
                    Trace.beginSection("bypassRender");
                    while (I(j, j3)) {
                    }
                    Trace.endSection();
                } else if (this.m1 != null) {
                    this.g.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (M(j, j3)) {
                    }
                    while (N()) {
                    }
                    Trace.endSection();
                } else {
                    tkj tkjVar = this.Y1;
                    int i = tkjVar.d;
                    ixg0 ixg0Var = this.i;
                    ixg0Var.getClass();
                    tkjVar.d = i + ixg0Var.d(j - this.k);
                    p0(1);
                }
                synchronized (this.Y1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw g(e, this.Z, false, vtt0.v(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            d0(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                q0();
            }
            hm30 hm30VarK = K(e2, this.t1);
            throw g(hm30VarK, this.Z, z, hm30VarK.f13287a == 1101 ? 4006 : 4003);
        }
    }

    public boolean z0(jm30 jm30Var) {
        return true;
    }

    public void j0(long j) {
    }

    public void m0(wkj wkjVar) {
    }
}
