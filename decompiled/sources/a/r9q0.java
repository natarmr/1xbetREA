package a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r9q0 extends j16 implements Handler.Callback {
    public hfn0 A;
    public t8b B;
    public t8b Y;
    public int Z;
    public final Handler f1;
    public final qlo g1;
    public final hsj h1;
    public boolean i1;
    public boolean j1;
    public androidx.media3.common.b k1;
    public long l1;
    public long m1;
    public final qud t;
    public final wkj u;
    public etf v;
    public final gfn0 w;
    public boolean x;
    public byte y;
    public efn0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9q0(qlo qloVar, Looper looper) {
        super(3);
        lef0 lef0Var = gfn0.y0;
        this.g1 = qloVar;
        this.f1 = looper == null ? null : new Handler(looper, this);
        this.w = lef0Var;
        this.t = new qud();
        this.u = new wkj(1);
        this.h1 = new hsj();
        this.m1 = -9223372036854775807L;
        this.l1 = -9223372036854775807L;
    }

    @Override // a.j16
    public final int D(androidx.media3.common.b bVar) {
        boolean zEquals = Objects.equals(bVar.p, "application/x-media3-cues");
        String str = bVar.p;
        if (!zEquals) {
            lef0 lef0Var = (lef0) this.w;
            lef0Var.getClass();
            if (!((kwd) lef0Var.f19899a).c(bVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return mg40.l(str) ? j16.f(1, 0, 0, 0) : j16.f(0, 0, 0, 0);
            }
        }
        return j16.f(bVar.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void H() {
        boolean z = Objects.equals(this.k1.p, "application/cea-608") || Objects.equals(this.k1.p, "application/x-mp4-cea-608") || Objects.equals(this.k1.p, "application/cea-708");
        String str = this.k1.p;
        if (z) {
            return;
        }
        jf4.n(jtm0.p("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void I() {
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        K(this.l1);
        dtf dtfVar = new dtf(rcf0Var);
        Handler handler = this.f1;
        if (handler != null) {
            handler.obtainMessage(1, dtfVar).sendToTarget();
        } else {
            M(dtfVar);
        }
    }

    public final long J() {
        if (this.Z == -1) {
            return Long.MAX_VALUE;
        }
        this.B.getClass();
        if (this.Z >= this.B.l()) {
            return Long.MAX_VALUE;
        }
        return this.B.j(this.Z);
    }

    public final long K(long j) {
        x0x.K(j != -9223372036854775807L);
        return j - this.k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void L() {
        efn0 s3kVar;
        byte b = 1;
        this.x = true;
        androidx.media3.common.b bVar = this.k1;
        bVar.getClass();
        kwd kwdVar = (kwd) ((lef0) this.w).f19899a;
        String str = bVar.p;
        int i = bVar.P;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    s3kVar = new n8b(str, i);
                    break;
                case 2:
                    s3kVar = new r8b(i, bVar.s);
                    break;
                default:
                    if (kwdVar.c(bVar)) {
                        jf4.o(kng0.k("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    lfn0 lfn0VarB = kwdVar.b(bVar);
                    lfn0VarB.getClass().getSimpleName().concat("Decoder");
                    s3kVar = new s3k(lfn0VarB);
                    break;
                    break;
            }
        } else if (kwdVar.c(bVar)) {
            jf4.o(kng0.k("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            lfn0 lfn0VarB2 = kwdVar.b(bVar);
            lfn0VarB2.getClass().getSimpleName().concat("Decoder");
            s3kVar = new s3k(lfn0VarB2);
        }
        this.z = s3kVar;
        s3kVar.d(this.l);
    }

    public final void M(dtf dtfVar) {
        rcf0 rcf0Var = dtfVar.f6653a;
        qlo qloVar = this.g1;
        qloVar.f28944a.m.e(27, new asj(rcf0Var));
        ulo uloVar = qloVar.f28944a;
        uloVar.d0 = dtfVar;
        uloVar.m.e(27, new z9f(dtfVar, (byte) 20));
    }

    public final void N() {
        this.A = null;
        this.Z = -1;
        t8b t8bVar = this.B;
        if (t8bVar != null) {
            t8bVar.w();
            this.B = null;
        }
        t8b t8bVar2 = this.Y;
        if (t8bVar2 != null) {
            t8bVar2.w();
            this.Y = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((dtf) message.obj);
            return true;
        }
        v4i0.e();
        return false;
    }

    @Override // a.j16
    public final String k() {
        return "TextRenderer";
    }

    @Override // a.j16
    public final boolean m() {
        return this.j1;
    }

    @Override // a.j16
    public final boolean o() {
        androidx.media3.common.b bVar = this.k1;
        if (bVar != null) {
            if (Objects.equals(bVar.p, "application/x-media3-cues")) {
                etf etfVar = this.v;
                etfVar.getClass();
                if (etfVar.d(this.l1) == Long.MIN_VALUE) {
                    try {
                        ixg0 ixg0Var = this.i;
                        ixg0Var.getClass();
                        ixg0Var.c();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.j1) {
                    return false;
                }
                if (this.i1) {
                    t8b t8bVar = this.B;
                    long j = this.l1;
                    if (t8bVar == null || t8bVar.l() <= 0 || t8bVar.j(t8bVar.l() - 1) <= j) {
                        t8b t8bVar2 = this.Y;
                        long j2 = this.l1;
                        if ((t8bVar2 == null || t8bVar2.l() <= 0 || t8bVar2.j(t8bVar2.l() - 1) <= j2) && this.A != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // a.j16
    public final void p() {
        this.k1 = null;
        this.m1 = -9223372036854775807L;
        I();
        this.l1 = -9223372036854775807L;
        if (this.z != null) {
            N();
            efn0 efn0Var = this.z;
            efn0Var.getClass();
            efn0Var.release();
            this.z = null;
            this.y = (byte) 0;
        }
    }

    @Override // a.j16
    public final void r(long j, boolean z, boolean z2) {
        this.l1 = j;
        etf etfVar = this.v;
        if (etfVar != null) {
            etfVar.clear();
        }
        I();
        this.i1 = false;
        this.j1 = false;
        this.m1 = -9223372036854775807L;
        androidx.media3.common.b bVar = this.k1;
        if (bVar == null || Objects.equals(bVar.p, "application/x-media3-cues")) {
            return;
        }
        if (this.y == 0) {
            N();
            efn0 efn0Var = this.z;
            efn0Var.getClass();
            efn0Var.flush();
            efn0Var.d(this.l);
            return;
        }
        N();
        efn0 efn0Var2 = this.z;
        efn0Var2.getClass();
        efn0Var2.release();
        this.z = null;
        this.y = (byte) 0;
        L();
    }

    @Override // a.j16
    public final void w(androidx.media3.common.b[] bVarArr, long j, long j2, vn30 vn30Var) {
        androidx.media3.common.b bVar = bVarArr[0];
        this.k1 = bVar;
        if (Objects.equals(bVar.p, "application/x-media3-cues")) {
            this.v = this.k1.Q == 1 ? new o340() : new bi9((byte) 1);
            return;
        }
        H();
        if (this.z != null) {
            this.y = (byte) 1;
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02bc A[Catch: ffn0 -> 0x027d, TryCatch #1 {ffn0 -> 0x027d, blocks: (B:116:0x0263, B:118:0x0267, B:120:0x026b, B:123:0x027a, B:126:0x0280, B:128:0x0284, B:130:0x0293, B:132:0x029a, B:137:0x02a5, B:139:0x02ab, B:151:0x02cf, B:153:0x02d6, B:155:0x02dc, B:161:0x02fc, B:156:0x02e2, B:159:0x02e9, B:146:0x02bc, B:148:0x02c8), top: B:169:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02c8 A[Catch: ffn0 -> 0x027d, TryCatch #1 {ffn0 -> 0x027d, blocks: (B:116:0x0263, B:118:0x0267, B:120:0x026b, B:123:0x027a, B:126:0x0280, B:128:0x0284, B:130:0x0293, B:132:0x029a, B:137:0x02a5, B:139:0x02ab, B:151:0x02cf, B:153:0x02d6, B:155:0x02dc, B:161:0x02fc, B:156:0x02e2, B:159:0x02e9, B:146:0x02bc, B:148:0x02c8), top: B:169:0x0263 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[LOOP:0: B:42:0x00db->B:44:0x00e1, LOOP_END] */
    @Override // a.j16
    public final void z(long j, long j2) {
        boolean z;
        long j3;
        long j4;
        boolean z2;
        long j5;
        wkj wkjVar;
        int iY;
        ArrayList parcelableArrayList;
        sd9 sd9Var;
        u3x u3xVarL;
        if (this.n) {
            long j6 = this.m1;
            if (j6 != -9223372036854775807L && j >= j6) {
                N();
                this.j1 = true;
            }
        }
        if (this.j1) {
            return;
        }
        androidx.media3.common.b bVar = this.k1;
        bVar.getClass();
        boolean zEquals = Objects.equals(bVar.p, "application/x-media3-cues");
        Handler handler = this.f1;
        boolean zA = false;
        zA = false;
        zA = false;
        zA = false;
        zA = false;
        zA = false;
        zA = false;
        hsj hsjVar = this.h1;
        if (zEquals) {
            this.v.getClass();
            if (!this.i1 && ((iY = y(hsjVar, (wkjVar = this.u), 5)) != -3 || wkjVar.m(4))) {
                if (iY != -4 || wkjVar.m(4)) {
                    if (iY == -4 || iY == -3) {
                        long j7 = this.r;
                        long j8 = j - this.k;
                        if (j7 != -9223372036854775807L && j8 >= j7 - 1000000) {
                            if (y(hsjVar, wkjVar, 0) == -4) {
                                if (wkjVar.m(4)) {
                                    this.i1 = true;
                                } else {
                                    wkjVar.y();
                                    ByteBuffer byteBuffer = wkjVar.g;
                                    byteBuffer.getClass();
                                    long j9 = wkjVar.i;
                                    byte[] bArrArray = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset();
                                    int iLimit = byteBuffer.limit();
                                    this.t.getClass();
                                    Parcel parcelObtain = Parcel.obtain();
                                    parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                                    parcelObtain.setDataPosition(0);
                                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                                    parcelObtain.recycle();
                                    parcelableArrayList = bundle.getParcelableArrayList("c");
                                    parcelableArrayList.getClass();
                                    sd9Var = new sd9((byte) 1);
                                    u3xVarL = b4x.l();
                                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                                        bundle2.getClass();
                                        u3xVarL.b(sd9Var.apply(bundle2));
                                    }
                                    ftf ftfVar = new ftf(j9, bundle.getLong("d"), u3xVarL.g());
                                    wkjVar.v();
                                    zA = this.v.a(ftfVar, j);
                                }
                            }
                        }
                    } else if (y(hsjVar, wkjVar, 0) == -4) {
                        if (wkjVar.m(4)) {
                            this.i1 = true;
                        } else {
                            wkjVar.y();
                            ByteBuffer byteBuffer2 = wkjVar.g;
                            byteBuffer2.getClass();
                            long j10 = wkjVar.i;
                            byte[] bArrArray2 = byteBuffer2.array();
                            int iArrayOffset2 = byteBuffer2.arrayOffset();
                            int iLimit2 = byteBuffer2.limit();
                            this.t.getClass();
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.unmarshall(bArrArray2, iArrayOffset2, iLimit2);
                            parcelObtain2.setDataPosition(0);
                            Bundle bundle3 = parcelObtain2.readBundle(Bundle.class.getClassLoader());
                            parcelObtain2.recycle();
                            parcelableArrayList = bundle3.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            sd9Var = new sd9((byte) 1);
                            u3xVarL = b4x.l();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle4 = (Bundle) parcelableArrayList.get(i);
                                bundle4.getClass();
                                u3xVarL.b(sd9Var.apply(bundle4));
                            }
                            ftf ftfVar2 = new ftf(j10, bundle3.getLong("d"), u3xVarL.g());
                            wkjVar.v();
                            zA = this.v.a(ftfVar2, j);
                        }
                    }
                } else if (j >= wkjVar.i - 1000000) {
                    if (y(hsjVar, wkjVar, 0) == -4) {
                        if (wkjVar.m(4)) {
                            this.i1 = true;
                        } else {
                            wkjVar.y();
                            ByteBuffer byteBuffer3 = wkjVar.g;
                            byteBuffer3.getClass();
                            long j11 = wkjVar.i;
                            byte[] bArrArray3 = byteBuffer3.array();
                            int iArrayOffset3 = byteBuffer3.arrayOffset();
                            int iLimit3 = byteBuffer3.limit();
                            this.t.getClass();
                            Parcel parcelObtain3 = Parcel.obtain();
                            parcelObtain3.unmarshall(bArrArray3, iArrayOffset3, iLimit3);
                            parcelObtain3.setDataPosition(0);
                            Bundle bundle5 = parcelObtain3.readBundle(Bundle.class.getClassLoader());
                            parcelObtain3.recycle();
                            parcelableArrayList = bundle5.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            sd9Var = new sd9((byte) 1);
                            u3xVarL = b4x.l();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle6 = (Bundle) parcelableArrayList.get(i);
                                bundle6.getClass();
                                u3xVarL.b(sd9Var.apply(bundle6));
                            }
                            ftf ftfVar3 = new ftf(j11, bundle5.getLong("d"), u3xVarL.g());
                            wkjVar.v();
                            zA = this.v.a(ftfVar3, j);
                        }
                    }
                }
            }
            long jD = this.v.d(this.l1);
            if (jD == Long.MIN_VALUE && this.i1 && !zA) {
                this.j1 = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j) {
                zA = true;
            }
            if (zA) {
                b4x b4xVarB = this.v.b(j);
                long jC = this.v.c(j);
                K(jC);
                dtf dtfVar = new dtf(b4xVarB);
                if (handler != null) {
                    handler.obtainMessage(1, dtfVar).sendToTarget();
                } else {
                    M(dtfVar);
                }
                this.v.e(jC);
            }
            this.l1 = j;
            return;
        }
        H();
        this.l1 = j;
        if (this.Y == null) {
            efn0 efn0Var = this.z;
            efn0Var.getClass();
            efn0Var.a(j);
            try {
                efn0 efn0Var2 = this.z;
                efn0Var2.getClass();
                this.Y = (t8b) efn0Var2.b();
            } catch (ffn0 e) {
                f1t0.R("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.k1, e);
                I();
                N();
                efn0 efn0Var3 = this.z;
                efn0Var3.getClass();
                efn0Var3.release();
                this.z = null;
                this.y = (byte) 0;
                L();
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.B != null) {
            long J = J();
            z = false;
            while (J <= j) {
                this.Z++;
                J = J();
                z = true;
            }
        } else {
            z = false;
        }
        t8b t8bVar = this.Y;
        boolean z3 = z;
        if (t8bVar != null) {
            z3 = z;
            if (!t8bVar.m(4)) {
                z3 = z;
                if (t8bVar.e <= j) {
                    t8b t8bVar2 = this.B;
                    if (t8bVar2 != null) {
                        t8bVar2.w();
                    }
                    this.Z = t8bVar.a(j);
                    this.B = t8bVar;
                    this.Y = null;
                    z3 = true;
                }
            } else if (!z) {
                z3 = z;
                if (J() == Long.MAX_VALUE) {
                    if (this.y == 2) {
                        N();
                        efn0 efn0Var4 = this.z;
                        efn0Var4.getClass();
                        efn0Var4.release();
                        this.z = null;
                        this.y = (byte) 0;
                        L();
                        z3 = z;
                    } else {
                        N();
                        this.j1 = true;
                        z3 = z;
                    }
                }
            }
        }
        if (z3) {
            this.B.getClass();
            int iA = this.B.a(j);
            if (iA == 0 || this.B.l() == 0) {
                j5 = this.B.e;
            } else {
                t8b t8bVar3 = this.B;
                j5 = iA == -1 ? t8bVar3.j(t8bVar3.l() - 1) : t8bVar3.j(iA - 1);
            }
            K(j5);
            dtf dtfVar2 = new dtf(this.B.e(j));
            if (handler != null) {
                handler.obtainMessage(1, dtfVar2).sendToTarget();
            } else {
                M(dtfVar2);
            }
        }
        if (this.y == 2) {
            return;
        }
        while (!this.i1) {
            try {
                hfn0 hfn0Var = this.A;
                if (hfn0Var == null) {
                    efn0 efn0Var5 = this.z;
                    efn0Var5.getClass();
                    hfn0Var = (hfn0) efn0Var5.e();
                    if (hfn0Var == null) {
                        return;
                    } else {
                        this.A = hfn0Var;
                    }
                }
                if (this.y == 1) {
                    hfn0Var.b = 4;
                    efn0 efn0Var6 = this.z;
                    efn0Var6.getClass();
                    efn0Var6.c(hfn0Var);
                    this.A = null;
                    this.y = (byte) 2;
                    return;
                }
                int iY2 = y(hsjVar, hfn0Var, 5);
                if (iY2 == -3 && !hfn0Var.m(4)) {
                    return;
                }
                int i2 = -4;
                if (iY2 != -4) {
                    if (iY2 != i2 || iY2 == -3) {
                        j3 = this.r;
                        j4 = j - this.k;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    }
                } else if (hfn0Var.m(4)) {
                    i2 = -4;
                    if (iY2 != i2) {
                        j3 = this.r;
                        j4 = j - this.k;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    } else {
                        j3 = this.r;
                        j4 = j - this.k;
                        if (j3 == -9223372036854775807L) {
                            return;
                        }
                        if (j4 < j3 - 1000000) {
                            return;
                        }
                    }
                } else if (j < hfn0Var.i - 1000000) {
                    return;
                }
                int iY3 = y(hsjVar, hfn0Var, 0);
                if (iY3 == -4) {
                    if (hfn0Var.m(4)) {
                        this.i1 = true;
                        this.x = false;
                        z2 = false;
                    } else {
                        androidx.media3.common.b bVar2 = (androidx.media3.common.b) hsjVar.b;
                        if (bVar2 == null) {
                            return;
                        }
                        hfn0Var.l = bVar2.u;
                        hfn0Var.y();
                        z2 = this.x & (!hfn0Var.m(1));
                        this.x = z2;
                    }
                    if (!z2) {
                        efn0 efn0Var7 = this.z;
                        efn0Var7.getClass();
                        efn0Var7.c(hfn0Var);
                        this.A = null;
                    }
                } else if (iY3 == -3) {
                    return;
                }
            } catch (ffn0 e2) {
                f1t0.R("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.k1, e2);
                I();
                N();
                efn0 efn0Var8 = this.z;
                efn0Var8.getClass();
                efn0Var8.release();
                this.z = null;
                this.y = (byte) 0;
                L();
                return;
            }
        }
    }
}
