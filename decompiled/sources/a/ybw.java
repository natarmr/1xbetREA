package a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.DrmInitData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ybw implements iq00, lq00, hgi0, huo, gxg0 {
    public static final Set A1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42359a;
    public final int b;
    public final jru c;
    public final waw d;
    public final lhf0 e;
    public final androidx.media3.common.b f;
    public int f1;
    public final cil g;
    public androidx.media3.common.b g1;
    public final zhl h;
    public androidx.media3.common.b h1;
    public final x860 i;
    public boolean i1;
    public final lhf0 j;
    public dcs0 j1;
    public final zhl k;
    public Set k1;
    public final boolean l;
    public int[] l1;
    public final cgx0 m;
    public int m1;
    public final ArrayList n;
    public boolean n1;
    public final List o;
    public boolean[] o1;
    public final vbw p;
    public boolean[] p1;
    public final vbw q;
    public long q1;
    public final Handler r;
    public long r1;
    public final ArrayList s;
    public boolean s1;
    public final Map t;
    public boolean t1;
    public yic u;
    public boolean u1;
    public xbw[] v;
    public long v1;
    public int[] w;
    public boolean w1;
    public final HashSet x;
    public long x1;
    public final SparseIntArray y;
    public DrmInitData y1;
    public wbw z;
    public yaw z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [a.vbw] */
    /* JADX WARN: Type inference failed for: r3v14, types: [a.vbw] */
    public ybw(String str, int i, jru jruVar, waw wawVar, Map map, lhf0 lhf0Var, long j, androidx.media3.common.b bVar, cil cilVar, zhl zhlVar, x860 x860Var, zhl zhlVar2, int i2, gff0 gff0Var) {
        this.f42359a = str;
        this.b = i;
        this.c = jruVar;
        this.d = wawVar;
        this.t = map;
        this.e = lhf0Var;
        this.f = bVar;
        this.g = cilVar;
        this.h = zhlVar;
        this.i = x860Var;
        this.k = zhlVar2;
        this.l = i2;
        final byte b = 1;
        this.j = gff0Var != null ? new lhf0(gff0Var) : new lhf0("Loader:HlsSampleStreamWrapper", (byte) 1);
        cgx0 cgx0Var = new cgx0((byte) 9, false);
        cgx0Var.c = null;
        cgx0Var.b = false;
        cgx0Var.d = null;
        this.m = cgx0Var;
        this.w = new int[0];
        Set set = A1;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new xbw[0];
        this.p1 = new boolean[0];
        this.o1 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.p = new Runnable(this) { // from class: a.vbw
            public final /* synthetic */ ybw b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = objArr;
                ybw ybwVar = this.b;
                switch (b2) {
                    case 0:
                        ybwVar.G();
                        break;
                    default:
                        for (xbw xbwVar : ybwVar.v) {
                            xbwVar.A(ybwVar.v1);
                        }
                        ybwVar.Y = true;
                        ybwVar.G();
                        break;
                }
            }
        };
        this.q = new Runnable(this) { // from class: a.vbw
            public final /* synthetic */ ybw b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                ybw ybwVar = this.b;
                switch (b2) {
                    case 0:
                        ybwVar.G();
                        break;
                    default:
                        for (xbw xbwVar : ybwVar.v) {
                            xbwVar.A(ybwVar.v1);
                        }
                        ybwVar.Y = true;
                        ybwVar.G();
                        break;
                }
            }
        };
        this.r = vtt0.n(null);
        this.q1 = j;
        this.r1 = j;
        this.v1 = Long.MIN_VALUE;
    }

    public static androidx.media3.common.b B(androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z) {
        String strB;
        if (bVar == null) {
            return bVar2;
        }
        String str = bVar.l;
        String strD = bVar2.p;
        int iH = mg40.h(strD);
        if (vtt0.r(iH, str) == 1) {
            strB = vtt0.s(iH, str);
            strD = mg40.d(strB);
        } else {
            strB = mg40.b(str, strD);
        }
        awq awqVarA = bVar2.a();
        awqVarA.f1587a = bVar.f45386a;
        awqVarA.b = bVar.b;
        awqVarA.c = b4x.o(bVar.c);
        awqVarA.d = bVar.d;
        awqVarA.e = bVar.e;
        awqVarA.f = bVar.f;
        awqVarA.i = z ? bVar.i : -1;
        awqVarA.j = z ? bVar.j : -1;
        awqVarA.k = strB;
        if (iH == 2) {
            awqVarA.v = bVar.w;
            awqVarA.w = bVar.x;
            awqVarA.a(bVar.B);
        }
        if (strD != null) {
            awqVarA.o = mg40.n(strD);
        }
        int i = bVar.J;
        if (i != -1 && iH == 1) {
            awqVarA.I = i;
        }
        ed40 ed40VarB = bVar.m;
        if (ed40VarB != null) {
            ed40 ed40Var = bVar2.m;
            if (ed40Var != null) {
                ed40VarB = ed40Var.b(ed40VarB);
            }
            awqVarA.l = ed40VarB;
        }
        return new androidx.media3.common.b(awqVarA);
    }

    public static int E(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static pnk z(int i, int i2) {
        f1t0.g0("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new pnk();
    }

    public final dcs0 A(ccs0[] ccs0VarArr) {
        for (int i = 0; i < ccs0VarArr.length; i++) {
            ccs0 ccs0Var = ccs0VarArr[i];
            androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[ccs0Var.f4128a];
            for (int i2 = 0; i2 < ccs0Var.f4128a; i2++) {
                androidx.media3.common.b bVar = ccs0Var.d[i2];
                int iD = this.g.d(bVar);
                awq awqVarA = bVar.a();
                awqVarA.S = iD;
                bVarArr[i2] = new androidx.media3.common.b(awqVarA);
            }
            ccs0VarArr[i] = new ccs0(ccs0Var.b, bVarArr);
        }
        return new dcs0(ccs0VarArr);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:63:0x00ee, B:65:0x00fa, B:67:0x010a), top: B:87:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void C(int i) {
        dr8 dr8Var;
        lhf0 lhf0Var;
        dr8 dr8Var2;
        dr8 dr8Var3;
        ArrayList arrayList = this.n;
        boolean z = true;
        x0x.K(!this.j.C());
        int i2 = i;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (y(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = D().h;
        yaw yawVar = (yaw) arrayList.get(i2);
        int size = arrayList.size();
        String str = vtt0.f38024a;
        if (i2 < 0 || size > arrayList.size() || i2 > size) {
            e9d0.o();
            return;
        }
        if (i2 != size) {
            arrayList.subList(i2, size).clear();
        }
        int i3 = 0;
        while (i3 < this.v.length) {
            int iE = yawVar.e(i3);
            xbw xbwVar = this.v[i3];
            exg0 exg0Var = xbwVar.f13813a;
            long jK = xbwVar.k(iE);
            int i4 = exg0Var.b;
            x0x.A(jK <= exg0Var.g ? z : false);
            exg0Var.g = jK;
            if (jK != 0) {
                dr8 dr8Var4 = exg0Var.d;
                if (jK == dr8Var4.f6545a) {
                    dr8Var = exg0Var.d;
                    if (((o52) dr8Var.c) != null) {
                        lhf0Var = exg0Var.f8575a;
                        synchronized (lhf0Var) {
                            ((xvj) lhf0Var.d).c.U(dr8Var);
                            dr8Var2 = dr8Var;
                            while (dr8Var2 != null) {
                                o52 o52Var = (o52) dr8Var2.c;
                                o52Var.getClass();
                                lhf0Var.G(o52Var);
                                dr8Var2 = (dr8) dr8Var2.d;
                                if (dr8Var2 != null || ((o52) dr8Var2.c) == null) {
                                    dr8Var2 = null;
                                }
                            }
                        }
                        dr8Var.c = null;
                        dr8Var.d = null;
                    }
                    dr8 dr8Var5 = new dr8(exg0Var.g, i4);
                    exg0Var.d = dr8Var5;
                    exg0Var.e = dr8Var5;
                    exg0Var.f = dr8Var5;
                } else {
                    while (true) {
                        long j2 = exg0Var.g;
                        long j3 = dr8Var4.b;
                        dr8Var3 = (dr8) dr8Var4.d;
                        if (j2 <= j3) {
                            break;
                        } else {
                            dr8Var4 = dr8Var3;
                        }
                    }
                    dr8Var3.getClass();
                    if (((o52) dr8Var3.c) != null) {
                        lhf0 lhf0Var2 = exg0Var.f8575a;
                        synchronized (lhf0Var2) {
                            ((xvj) lhf0Var2.d).c.U(dr8Var3);
                            dr8 dr8Var6 = dr8Var3;
                            while (dr8Var6 != null) {
                                o52 o52Var2 = (o52) dr8Var6.c;
                                o52Var2.getClass();
                                lhf0Var2.G(o52Var2);
                                dr8Var6 = (dr8) dr8Var6.d;
                                if (dr8Var6 == null || ((o52) dr8Var6.c) == null) {
                                    dr8Var6 = null;
                                }
                            }
                        }
                        dr8Var3.c = null;
                        dr8Var3.d = null;
                    }
                    dr8 dr8Var7 = new dr8(dr8Var4.b, i4);
                    dr8Var4.d = dr8Var7;
                    if (exg0Var.g == dr8Var4.b) {
                        dr8Var4 = dr8Var7;
                    }
                    exg0Var.f = dr8Var4;
                    if (exg0Var.e == dr8Var3) {
                        exg0Var.e = dr8Var7;
                    }
                }
            } else {
                dr8Var = exg0Var.d;
                if (((o52) dr8Var.c) != null) {
                    lhf0Var = exg0Var.f8575a;
                    synchronized (lhf0Var) {
                        ((xvj) lhf0Var.d).c.U(dr8Var);
                        dr8Var2 = dr8Var;
                        while (dr8Var2 != null) {
                            o52 o52Var3 = (o52) dr8Var2.c;
                            o52Var3.getClass();
                            lhf0Var.G(o52Var3);
                            dr8Var2 = (dr8) dr8Var2.d;
                            if (dr8Var2 != null) {
                            }
                            dr8Var2 = null;
                        }
                        dr8Var.c = null;
                        dr8Var.d = null;
                    }
                }
                dr8 dr8Var8 = new dr8(exg0Var.g, i4);
                exg0Var.d = dr8Var8;
                exg0Var.e = dr8Var8;
                exg0Var.f = dr8Var8;
            }
            i3++;
            z = true;
        }
        if (arrayList.isEmpty()) {
            this.r1 = Math.max(this.q1, yawVar.g);
        } else {
            ((yaw) g8x.H(arrayList)).J = true;
        }
        this.u1 = false;
        zhl zhlVar = this.k;
        in30 in30Var = new in30(1, this.A, null, 3, null, vtt0.Y(yawVar.g), vtt0.Y(j));
        vn30 vn30Var = zhlVar.b;
        vn30Var.getClass();
        zhlVar.a(new hi(zhlVar, vn30Var, in30Var, (byte) 9));
    }

    public final yaw D() {
        return (yaw) dw9.l(1, this.n);
    }

    public final boolean F() {
        return this.r1 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        int i;
        if (!this.i1 && this.l1 == null && this.Y) {
            int i2 = 0;
            for (xbw xbwVar : this.v) {
                if (xbwVar.r() == null) {
                    return;
                }
            }
            dcs0 dcs0Var = this.j1;
            if (dcs0Var != null) {
                int i3 = dcs0Var.f5860a;
                int[] iArr = new int[i3];
                this.l1 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        xbw[] xbwVarArr = this.v;
                        if (i5 >= xbwVarArr.length) {
                            break;
                        }
                        androidx.media3.common.b bVarR = xbwVarArr[i5].r();
                        bVarR.getClass();
                        androidx.media3.common.b bVar = this.j1.a(i4).d[0];
                        String str = bVarR.p;
                        String str2 = bVar.p;
                        int iH = mg40.h(str);
                        if (iH != 3) {
                            if (iH == mg40.h(str2)) {
                                this.l1[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || bVarR.P == bVar.P)) {
                                this.l1[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((ubw) it.next()).e();
                }
                return;
            }
            int length = this.v.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                androidx.media3.common.b bVarR2 = this.v[i6].r();
                bVarR2.getClass();
                String str3 = bVarR2.p;
                if (mg40.m(str3)) {
                    i9 = 2;
                } else if (!mg40.i(str3)) {
                    i9 = mg40.l(str3) ? 3 : -2;
                }
                if (E(i9) > E(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            ccs0 ccs0Var = this.d.i;
            int i10 = ccs0Var.f4128a;
            this.m1 = -1;
            this.l1 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.l1[i11] = i11;
            }
            ccs0[] ccs0VarArr = new ccs0[length];
            int i12 = 0;
            while (i12 < length) {
                androidx.media3.common.b bVarR3 = this.v[i12].r();
                bVarR3.getClass();
                androidx.media3.common.b bVar2 = this.f;
                String str4 = this.f42359a;
                if (i12 == i7) {
                    androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        androidx.media3.common.b bVarD = ccs0Var.d[i13];
                        if (i8 == 1 && bVar2 != null) {
                            bVarD = bVarD.d(bVar2);
                        }
                        bVarArr[i13] = i10 == 1 ? bVarR3.d(bVarD) : B(bVarD, bVarR3, true);
                    }
                    ccs0VarArr[i12] = new ccs0(str4, bVarArr);
                    this.m1 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !mg40.i(bVarR3.p)) {
                        bVar2 = null;
                    }
                    StringBuilder sbT = brm0.t(str4, ":muxed:");
                    sbT.append(i12 < i7 ? i12 : i12 - 1);
                    String string = sbT.toString();
                    i = 0;
                    awq awqVarA = B(bVar2, bVarR3, false).a();
                    awqVarA.m = str4;
                    ccs0VarArr[i12] = new ccs0(string, new androidx.media3.common.b(awqVarA));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.j1 = A(ccs0VarArr);
            x0x.K(this.k1 == null ? 1 : i14);
            this.k1 = Collections.EMPTY_SET;
            this.Z = true;
            this.c.i();
        }
    }

    public final void H() throws IOException {
        lhf0 lhf0Var = this.j;
        IOException iOException = (IOException) lhf0Var.d;
        if (iOException != null) {
            throw iOException;
        }
        jq00 jq00Var = (jq00) lhf0Var.c;
        if (jq00Var != null) {
            int i = jq00Var.f16926a;
            IOException iOException2 = jq00Var.e;
            if (iOException2 != null && jq00Var.f > i) {
                throw iOException2;
            }
        }
        waw wawVar = this.d;
        lb6 lb6Var = wawVar.o;
        if (lb6Var != null) {
            throw lb6Var;
        }
        Uri uri = wawVar.p;
        if (uri == null || !uri.equals(wawVar.q)) {
            return;
        }
        wawVar.g.j(wawVar.p);
    }

    public final void I(ccs0[] ccs0VarArr, int... iArr) {
        this.j1 = A(ccs0VarArr);
        this.k1 = new HashSet();
        for (int i : iArr) {
            this.k1.add(this.j1.a(i));
        }
        this.m1 = 0;
        this.r.post(new wss(this.c, (byte) 1));
        this.Z = true;
    }

    public final void J() {
        for (xbw xbwVar : this.v) {
            xbwVar.x(this.s1);
        }
        this.s1 = false;
    }

    public final boolean K(boolean z, long j) throws Throwable {
        yaw yawVar;
        boolean z2;
        this.q1 = j;
        if (F()) {
            this.r1 = j;
            return true;
        }
        boolean z3 = this.d.r;
        ArrayList arrayList = this.n;
        if (!z3) {
            yawVar = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                yawVar = null;
                break;
            }
            yawVar = (yaw) arrayList.get(i);
            if (yawVar.g == j) {
                break;
            }
            i++;
        }
        if (this.Y && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (int i2 = 0; i2 < length; i2++) {
                xbw xbwVar = this.v[i2];
                if (yawVar != null) {
                    z2 = xbwVar.y(yawVar.e(i2));
                } else {
                    long jB = b();
                    z2 = xbwVar.z(jB == Long.MIN_VALUE || j < jB, j);
                }
                if (z2 || (!this.p1[i2] && this.n1)) {
                }
            }
            return false;
        }
        this.r1 = j;
        this.u1 = false;
        arrayList.clear();
        lhf0 lhf0Var = this.j;
        if (!lhf0Var.C()) {
            lhf0Var.d = null;
            J();
            return true;
        }
        if (this.Y) {
            for (xbw xbwVar2 : this.v) {
                xbwVar2.j();
            }
        }
        lhf0Var.a();
        return true;
    }

    @Override // a.iq00
    public final void a(kq00 kq00Var, long j, long j2, int i) {
        yic yicVar = (yic) kq00Var;
        vn00 vn00Var = new vn00(yicVar.f42681a, yicVar.b, j);
        if (i != 0) {
            enm0 enm0Var = yicVar.i;
            vn00Var.f = enm0Var.c;
            vn00Var.g = enm0Var.d;
            vn00Var.c = j2;
            vn00Var.d = enm0Var.b;
        }
        this.k.f(new wn00(vn00Var), yicVar.c, this.b, yicVar.d, yicVar.e, yicVar.f, yicVar.g, yicVar.h, i);
    }

    @Override // a.hgi0
    public final long b() {
        if (F()) {
            return this.r1;
        }
        if (this.u1) {
            return Long.MIN_VALUE;
        }
        return D().h;
    }

    @Override // a.hgi0
    public final boolean e() {
        return this.j.C();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:119:0x0273  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0285  */
    /* JADX WARN: Code duplicated, block: B:126:0x0289  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02df  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0304  */
    /* JADX WARN: Code duplicated, block: B:160:0x030e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0311  */
    /* JADX WARN: Code duplicated, block: B:163:0x0315  */
    /* JADX WARN: Code duplicated, block: B:165:0x031a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0322  */
    /* JADX WARN: Code duplicated, block: B:170:0x0327  */
    /* JADX WARN: Code duplicated, block: B:172:0x032b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0337  */
    /* JADX WARN: Code duplicated, block: B:180:0x0355  */
    /* JADX WARN: Code duplicated, block: B:181:0x0359  */
    /* JADX WARN: Code duplicated, block: B:183:0x0367  */
    /* JADX WARN: Code duplicated, block: B:184:0x0369  */
    /* JADX WARN: Code duplicated, block: B:187:0x038d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0392  */
    /* JADX WARN: Code duplicated, block: B:191:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:194:0x03af  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:201:0x03cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:206:0x03de  */
    /* JADX WARN: Code duplicated, block: B:209:0x0404  */
    /* JADX WARN: Code duplicated, block: B:210:0x040e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0416  */
    /* JADX WARN: Code duplicated, block: B:215:0x042c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0432 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x044b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0454  */
    /* JADX WARN: Code duplicated, block: B:231:0x045a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x046e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0476  */
    /* JADX WARN: Code duplicated, block: B:246:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:252:0x04de  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:260:0x04f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:267:0x0511  */
    /* JADX WARN: Code duplicated, block: B:269:0x0515  */
    /* JADX WARN: Code duplicated, block: B:271:0x051e A[EDGE_INSN: B:271:0x051e->B:290:0x056e BREAK  A[LOOP:3: B:281:0x0547->B:289:0x0569], PHI: r34
  0x051e: PHI (r34v3 java.util.ArrayList) = (r34v0 java.util.ArrayList), (r34v0 java.util.ArrayList), (r34v0 java.util.ArrayList), (r34v1 java.util.ArrayList) binds: [B:270:0x051c, B:277:0x053b, B:279:0x053f, B:313:0x051e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0521  */
    /* JADX WARN: Code duplicated, block: B:274:0x052b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0537  */
    /* JADX WARN: Code duplicated, block: B:278:0x053d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0585 A[LOOP:1: B:291:0x0583->B:292:0x0585, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:312:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:84:0x0182  */
    /* JADX WARN: Code duplicated, block: B:87:0x018a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        long jMax;
        long j;
        long j2;
        long j3;
        List list;
        long j4;
        List list2;
        long jMax2;
        long j5;
        long j6;
        long jMax3;
        uyn uynVar;
        int i;
        ArrayList arrayList;
        long j7;
        uyn uynVar2;
        int i2;
        yaw yawVar;
        int iQ;
        boolean z;
        Uri uriB;
        xaw xawVar;
        String str;
        ibw ibwVarC;
        long j8;
        long j9;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int i3;
        ibw ibwVar;
        vaw vawVarF;
        String str2;
        boolean z2;
        long j10;
        vaw vawVarF2;
        cgx0 cgx0Var;
        boolean z3;
        gbw gbwVar;
        long j11;
        Uri uriP;
        saw sawVarG;
        String str3;
        Uri uriP2;
        saw sawVarG2;
        boolean z4;
        boolean z5;
        jbj jbjVar;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i4;
        boolean z6;
        byte[] bArrD;
        jbj g50Var;
        fbw fbwVar;
        mbj mbjVar;
        jbj jbjVar2;
        boolean z7;
        int i5;
        exw exwVar;
        fq80 fq80Var;
        td9 td9Var;
        SparseArray sparseArray;
        coq0 coq0Var;
        mbj mbjVar2;
        boolean z8;
        boolean z9;
        td9 td9Var2;
        boolean z10;
        byte[] bArrD2;
        jbj g50Var2;
        String str4;
        Uri uriB2;
        uuj uujVar;
        boolean z11;
        yic yicVar;
        Uri uri;
        boolean z12;
        long j12;
        yaw yawVar2;
        ArrayList arrayList2;
        u3x u3xVarL;
        int i6;
        int i7;
        uuj uujVar2;
        long j13;
        ArrayList arrayList3 = this.n;
        cgx0 cgx0Var2 = this.m;
        lhf0 lhf0Var = this.j;
        if (this.u1 || lhf0Var.C()) {
            return false;
        }
        if (((IOException) lhf0Var.d) != null) {
            return false;
        }
        long j14 = -9223372036854775807L;
        if (F()) {
            List list3 = Collections.EMPTY_LIST;
            long j15 = this.r1;
            for (xbw xbwVar : this.v) {
                xbwVar.t = this.r1;
            }
            list = list3;
            j = -9223372036854775807L;
            j2 = j15;
            j3 = j2;
        } else {
            List list4 = this.o;
            yaw yawVarD = D();
            boolean z13 = yawVarD.H;
            long j16 = yawVarD.g;
            if (z13 && yawVarD.f()) {
                long j17 = yawVarD.K;
                jMax = j17 != -9223372036854775807L ? j16 + j17 : -9223372036854775807L;
            } else {
                jMax = Math.max(this.q1, j16);
            }
            long jMax4 = this.q1;
            if (this.Y) {
                xbw[] xbwVarArr = this.v;
                int length = xbwVarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    xbw xbwVar2 = xbwVarArr[i8];
                    synchronized (xbwVar2) {
                        j4 = j14;
                        list2 = list4;
                        jMax2 = Math.max(xbwVar2.v, xbwVar2.n(xbwVar2.s));
                    }
                    jMax4 = Math.max(jMax4, jMax2);
                    i8++;
                    j14 = j4;
                    list4 = list2;
                }
            }
            j = j14;
            j2 = jMax;
            j3 = jMax4;
            list = list4;
        }
        cgx0Var2.c = null;
        cgx0Var2.b = false;
        cgx0Var2.d = null;
        waw wawVar = this.d;
        boolean z14 = this.Z || !list.isEmpty();
        uyn uynVar3 = wawVar.k;
        tbw[] tbwVarArr = wawVar.e;
        vuj vujVar = wawVar.g;
        yaw yawVar3 = list.isEmpty() ? null : (yaw) g8x.H(list);
        int iA = yawVar3 == null ? -1 : wawVar.i.a(yawVar3.d);
        List list5 = list;
        long j18 = yq00Var.f43053a;
        long jMax5 = j2 - j18;
        long j19 = wawVar.t;
        long j20 = j19 != j ? j19 - j18 : j;
        if (yawVar3 != null && !wawVar.r) {
            j5 = j20;
            long j21 = yawVar3.h - yawVar3.g;
            j6 = j18;
            jMax5 = Math.max(0L, jMax5 - j21);
            if (j5 != j) {
                jMax3 = Math.max(0L, j5 - j21);
            }
            am30[] am30VarArrB = wawVar.b(yawVar3, j2);
            if (iA != -1) {
                fmo fmoVar = wawVar.s;
                uynVar = uynVar3;
                i = iA;
                boolean z15 = fmoVar.c(fmoVar.l(iA), SystemClock.elapsedRealtime());
                arrayList = arrayList3;
                j7 = j2;
                boolean z16 = z15;
                uynVar2 = uynVar;
                i2 = i;
                yawVar = yawVar3;
                wawVar.s.m(j6, jMax5, jMax3, list5, am30VarArrB);
                iQ = wawVar.s.q();
                if (i2 != iQ) {
                    z = true;
                } else {
                    z = false;
                }
                uriB = tbwVarArr[iQ].b();
                xawVar = wawVar.h;
                if (xawVar == null && xawVar.k) {
                    str = tbwVarArr[iQ].d;
                } else {
                    str = null;
                }
                if (vujVar.h(uriB)) {
                    ibwVarC = vujVar.c(true, uriB);
                    ibwVarC.getClass();
                    wawVar.r = ibwVarC.c;
                    if (ibwVarC.o) {
                        j8 = j;
                    } else {
                        j8 = (ibwVarC.h + ibwVarC.u) - vujVar.v;
                    }
                    wawVar.t = j8;
                    j9 = ibwVarC.h - vujVar.v;
                    Pair pairE = wawVar.e(yawVar, z, ibwVarC, j9, j7);
                    jLongValue = ((Long) pairE.first).longValue();
                    iIntValue = ((Integer) pairE.second).intValue();
                    if (z || z16 || yawVar == null || (jLongValue >= ibwVarC.k && ((vawVarF = waw.f(ibwVarC, jLongValue, iIntValue)) == null || j9 + vawVarF.f37111a.e >= j3))) {
                        iIntValue2 = iIntValue;
                        ibwVar = ibwVarC;
                        i3 = iQ;
                    } else {
                        uriB = tbwVarArr[i2].b();
                        ibw ibwVarC2 = vujVar.c(true, uriB);
                        ibwVarC2.getClass();
                        j9 = ibwVarC2.h - vujVar.v;
                        Pair pairE2 = wawVar.e(yawVar, false, ibwVarC2, j9, j7);
                        jLongValue = ((Long) pairE2.first).longValue();
                        iIntValue2 = ((Integer) pairE2.second).intValue();
                        i3 = i2;
                        ibwVar = ibwVarC2;
                    }
                    str2 = ibwVar.f23262a;
                    z2 = ibwVar.c;
                    j10 = ibwVar.k;
                    b4x b4xVar = ibwVar.r;
                    if (i3 != i2 && i2 != -1) {
                        uriB2 = tbwVarArr[i2].b();
                        uujVar = (uuj) vujVar.d.get(uriB2);
                        if (uujVar != null) {
                            HashMap map2 = uujVar.b;
                            x0x.K(map2.containsKey(uriB2));
                            tuj tujVar = (tuj) map2.get(uriB2);
                            tujVar.getClass();
                            tujVar.l = false;
                        }
                    }
                    if (jLongValue < j10) {
                        wawVar.o = new lb6();
                        cgx0Var = cgx0Var2;
                    } else {
                        vawVarF2 = waw.f(ibwVar, jLongValue, iIntValue2);
                        if (vawVarF2 == null) {
                            cgx0Var = cgx0Var2;
                        } else if (ibwVar.o) {
                            cgx0Var = cgx0Var2;
                            if (!z14 || b4xVar.isEmpty()) {
                                cgx0Var.b = true;
                            } else {
                                vawVarF2 = new vaw((gbw) g8x.H(b4xVar), (j10 + ((long) b4xVar.size())) - 1, -1);
                            }
                        } else {
                            cgx0Var = cgx0Var2;
                            cgx0Var.d = uriB;
                            r19.q = uriB;
                        }
                        z3 = vawVarF2.d;
                        gbwVar = vawVarF2.f37111a;
                        r19.q = null;
                        SystemClock.elapsedRealtime();
                        fbw fbwVar2 = gbwVar.b;
                        j11 = gbwVar.e;
                        uriP = (fbwVar2 != null || (str4 = fbwVar2.g) == null) ? null : msm0.p(ibwVar.f23262a, str4);
                        sawVarG = r19.g(uriP, i3, true);
                        cgx0Var.c = sawVarG;
                        if (sawVarG == null) {
                            str3 = gbwVar.g;
                            if (str3 == null) {
                                uriP2 = null;
                            } else {
                                uriP2 = msm0.p(ibwVar.f23262a, str3);
                            }
                            sawVarG2 = r19.g(uriP2, i3, false);
                            cgx0Var.c = sawVarG2;
                            if (sawVarG2 == null) {
                                if (gbwVar instanceof dbw) {
                                    z4 = z2;
                                } else if (!((dbw) gbwVar).l || (vawVarF2.c == 0 && z2)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (yawVar == 0) {
                                    AtomicInteger atomicInteger = yaw.M;
                                } else {
                                    if (uriB.equals(yawVar.m) || !yawVar.H) {
                                        z5 = z4 || j9 + j11 < j7;
                                    }
                                    if (z5 || !z3) {
                                        ruj rujVar = r19.f38848a;
                                        jbjVar = r19.b;
                                        androidx.media3.common.b bVar = r19.f[i3];
                                        List list6 = r19.j;
                                        int iS = r19.s.s();
                                        Object objJ = r19.s.j();
                                        boolean z17 = r19.m;
                                        owp0 owp0Var = r19.d;
                                        if (uriP2 == null) {
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                        }
                                        if (uriP == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                        }
                                        a4a0 a4a0Var = r19.l;
                                        AtomicInteger atomicInteger2 = yaw.M;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriP3 = msm0.p(str2, gbwVar.f11032a);
                                        vaw vawVar = vawVarF2;
                                        cgx0 cgx0Var3 = cgx0Var;
                                        long j22 = gbwVar.i;
                                        long j23 = gbwVar.j;
                                        if (z3 != 0) {
                                            i4 = 8;
                                        } else {
                                            i4 = 0;
                                        }
                                        x0x.G(uriP3, "The uri must be set.");
                                        mbj mbjVar3 = new mbj(uriP3, 1, null, map, j22, j23, i4);
                                        if (bArr != null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            String str5 = gbwVar.h;
                                            str5.getClass();
                                            bArrD = yaw.d(str5);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            g50Var = new g50(jbjVar, bArr, bArrD);
                                        } else {
                                            g50Var = jbjVar;
                                        }
                                        fbwVar = gbwVar.b;
                                        if (fbwVar != null) {
                                            if (bArr2 != null) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                String str6 = fbwVar.h;
                                                str6.getClass();
                                                bArrD2 = yaw.d(str6);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            Uri uriP4 = msm0.p(str2, fbwVar.f11032a);
                                            long j24 = fbwVar.i;
                                            boolean z18 = z10;
                                            long j25 = fbwVar.j;
                                            x0x.G(uriP4, "The uri must be set.");
                                            mbj mbjVar4 = new mbj(uriP4, 1, null, map, j24, j25, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                            } else {
                                                g50Var2 = jbjVar;
                                            }
                                            jbjVar2 = g50Var2;
                                            z7 = z18;
                                            mbjVar = mbjVar4;
                                        } else {
                                            mbjVar = null;
                                            jbjVar2 = null;
                                            z7 = false;
                                        }
                                        long j26 = j9 + j11;
                                        long j27 = j26 + gbwVar.c;
                                        i5 = ibwVar.j + gbwVar.d;
                                        if (yawVar != 0) {
                                            mbjVar2 = yawVar.q;
                                            if (mbjVar != mbjVar2 || (mbjVar != null && mbjVar2 != null && mbjVar.f21512a.equals(mbjVar2.f21512a) && mbjVar.e == mbjVar2.e)) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (uriB.equals(yawVar.m) || !yawVar.H) {
                                                z9 = false;
                                            } else {
                                                z9 = true;
                                            }
                                            exwVar = yawVar.y;
                                            fq80Var = yawVar.z;
                                            if (z8 || !z9 || yawVar.J || yawVar.l != i5) {
                                                td9Var2 = null;
                                            } else {
                                                td9Var2 = yawVar.C;
                                            }
                                            td9Var = td9Var2;
                                        } else {
                                            exwVar = new exw(null);
                                            fq80Var = new fq80(10);
                                            td9Var = null;
                                        }
                                        exw exwVar2 = exwVar;
                                        fq80 fq80Var2 = fq80Var;
                                        long j28 = vawVar.b;
                                        int i9 = vawVar.c;
                                        boolean z19 = !z3;
                                        boolean z20 = gbwVar.k;
                                        sparseArray = (SparseArray) owp0Var.b;
                                        coq0Var = (coq0) sparseArray.get(i5);
                                        if (coq0Var == null) {
                                            coq0Var = new coq0(9223372036854775806L);
                                            sparseArray.put(i5, coq0Var);
                                        }
                                        yaw yawVar4 = new yaw(rujVar, g50Var, mbjVar3, bVar, z6, jbjVar2, mbjVar, z7, uriB, list6, iS, objJ, j26, j27, j28, i9, z19, i5, z20, z17, coq0Var, gbwVar.f, td9Var, exwVar2, fq80Var2, z5, z4, a4a0Var, str);
                                        cgx0Var = cgx0Var3;
                                        cgx0Var.c = yawVar4;
                                    }
                                }
                                if (z5) {
                                    ruj rujVar2 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar2 = r19.f[i3];
                                    List list7 = r19.j;
                                    int iS2 = r19.s.s();
                                    Object objJ2 = r19.s.j();
                                    boolean z110 = r19.m;
                                    owp0 owp0Var2 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var2 = r19.l;
                                    AtomicInteger atomicInteger3 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP5 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar2 = vawVarF2;
                                    cgx0 cgx0Var4 = cgx0Var;
                                    long j29 = gbwVar.i;
                                    long j210 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP5, "The uri must be set.");
                                    mbj mbjVar5 = new mbj(uriP5, 1, null, map, j29, j210, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str7 = gbwVar.h;
                                        str7.getClass();
                                        bArrD = yaw.d(str7);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str8 = fbwVar.h;
                                            str8.getClass();
                                            bArrD2 = yaw.d(str8);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP6 = msm0.p(str2, fbwVar.f11032a);
                                        long j211 = fbwVar.i;
                                        boolean z111 = z10;
                                        long j212 = fbwVar.j;
                                        x0x.G(uriP6, "The uri must be set.");
                                        mbj mbjVar6 = new mbj(uriP6, 1, null, map, j211, j212, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z111;
                                        mbjVar = mbjVar6;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j213 = j9 + j11;
                                    long j214 = j213 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar3 = exwVar;
                                    fq80 fq80Var3 = fq80Var;
                                    long j215 = vawVar2.b;
                                    int i10 = vawVar2.c;
                                    boolean z112 = !z3;
                                    boolean z21 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var2.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar5 = new yaw(rujVar2, g50Var, mbjVar5, bVar2, z6, jbjVar2, mbjVar, z7, uriB, list7, iS2, objJ2, j213, j214, j215, i10, z112, i5, z21, z110, coq0Var, gbwVar.f, td9Var, exwVar3, fq80Var3, z5, z4, a4a0Var2, str);
                                    cgx0Var = cgx0Var4;
                                    cgx0Var.c = yawVar5;
                                } else {
                                    ruj rujVar3 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar3 = r19.f[i3];
                                    List list8 = r19.j;
                                    int iS3 = r19.s.s();
                                    Object objJ3 = r19.s.j();
                                    boolean z113 = r19.m;
                                    owp0 owp0Var3 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var3 = r19.l;
                                    AtomicInteger atomicInteger4 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP7 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar3 = vawVarF2;
                                    cgx0 cgx0Var5 = cgx0Var;
                                    long j216 = gbwVar.i;
                                    long j217 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP7, "The uri must be set.");
                                    mbj mbjVar7 = new mbj(uriP7, 1, null, map, j216, j217, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str9 = gbwVar.h;
                                        str9.getClass();
                                        bArrD = yaw.d(str9);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str10 = fbwVar.h;
                                            str10.getClass();
                                            bArrD2 = yaw.d(str10);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP8 = msm0.p(str2, fbwVar.f11032a);
                                        long j218 = fbwVar.i;
                                        boolean z114 = z10;
                                        long j219 = fbwVar.j;
                                        x0x.G(uriP8, "The uri must be set.");
                                        mbj mbjVar8 = new mbj(uriP8, 1, null, map, j218, j219, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z114;
                                        mbjVar = mbjVar8;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j2110 = j9 + j11;
                                    long j2111 = j2110 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar4 = exwVar;
                                    fq80 fq80Var4 = fq80Var;
                                    long j2112 = vawVar3.b;
                                    int i11 = vawVar3.c;
                                    boolean z115 = !z3;
                                    boolean z22 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var3.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar6 = new yaw(rujVar3, g50Var, mbjVar7, bVar3, z6, jbjVar2, mbjVar, z7, uriB, list8, iS3, objJ3, j2110, j2111, j2112, i11, z115, i5, z22, z113, coq0Var, gbwVar.f, td9Var, exwVar4, fq80Var4, z5, z4, a4a0Var3, str);
                                    cgx0Var = cgx0Var5;
                                    cgx0Var.c = yawVar6;
                                }
                            }
                        }
                    }
                } else {
                    cgx0Var2.d = uriB;
                    wawVar.q = uriB;
                    cgx0Var = cgx0Var2;
                }
                z11 = cgx0Var.b;
                yicVar = (yic) cgx0Var.c;
                uri = (Uri) cgx0Var.d;
                if (yicVar != null) {
                    j13 = this.v1;
                    if (j13 != Long.MIN_VALUE || yicVar.g < j13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = false;
                }
                if (!z11) {
                    j12 = -9223372036854775807L;
                } else {
                    if (z12) {
                        if (yicVar == null) {
                            if (uri != null || (uujVar2 = (uuj) ((zaw) this.c.b).b.d.get(uri)) == null) {
                                return false;
                            }
                            uujVar2.e(true, uri);
                            return false;
                        }
                        if (yicVar instanceof yaw) {
                            yawVar2 = (yaw) yicVar;
                            if (!arrayList.isEmpty()) {
                                arrayList2 = arrayList;
                                break;
                            }
                            if (!D().f()) {
                                C(arrayList.size() - 1);
                            }
                            if (!yawVar2.n || !yawVar2.L) {
                                arrayList2 = arrayList;
                                break;
                            }
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    arrayList2 = arrayList;
                                    break;
                                }
                                arrayList2 = arrayList;
                                long j30 = ((yaw) arrayList2.get(size)).g;
                                long j31 = yawVar2.g;
                                if (j30 < j31) {
                                    break;
                                }
                                if (j30 == j31 && y(size)) {
                                    C(size);
                                    yawVar2.L = false;
                                    break;
                                }
                                size--;
                                arrayList = arrayList2;
                            }
                            this.z1 = yawVar2;
                            this.g1 = yawVar2.d;
                            this.r1 = j;
                            arrayList2.add(yawVar2);
                            u3xVarL = b4x.l();
                            for (xbw xbwVar3 : this.v) {
                                u3xVarL.b(Integer.valueOf(xbwVar3.q + xbwVar3.p));
                            }
                            rcf0 rcf0VarG = u3xVarL.g();
                            yawVar2.D = this;
                            yawVar2.I = rcf0VarG;
                            for (xbw xbwVar4 : this.v) {
                                xbwVar4.getClass();
                                xbwVar4.F = yawVar2.k;
                                if (yawVar2.L) {
                                    xbwVar4.J = true;
                                }
                            }
                        }
                        this.u = yicVar;
                        lhf0Var.J(yicVar, this, this.i.e(yicVar.c));
                        return true;
                    }
                    j12 = j;
                }
                this.r1 = j12;
                this.u1 = true;
                return true;
            }
            uynVar = uynVar3;
            i = iA;
            arrayList = arrayList3;
            j7 = j2;
            boolean z116 = z15;
            uynVar2 = uynVar;
            i2 = i;
            yawVar = yawVar3;
            wawVar.s.m(j6, jMax5, jMax3, list5, am30VarArrB);
            iQ = wawVar.s.q();
            if (i2 != iQ) {
                z = true;
            } else {
                z = false;
            }
            uriB = tbwVarArr[iQ].b();
            xawVar = wawVar.h;
            if (xawVar == null) {
                str = null;
            } else {
                str = null;
            }
            if (vujVar.h(uriB)) {
                cgx0Var2.d = uriB;
                wawVar.q = uriB;
                cgx0Var = cgx0Var2;
            } else {
                ibwVarC = vujVar.c(true, uriB);
                ibwVarC.getClass();
                wawVar.r = ibwVarC.c;
                if (ibwVarC.o) {
                    j8 = j;
                } else {
                    j8 = (ibwVarC.h + ibwVarC.u) - vujVar.v;
                }
                wawVar.t = j8;
                j9 = ibwVarC.h - vujVar.v;
                Pair pairE3 = wawVar.e(yawVar, z, ibwVarC, j9, j7);
                jLongValue = ((Long) pairE3.first).longValue();
                iIntValue = ((Integer) pairE3.second).intValue();
                if (z) {
                    iIntValue2 = iIntValue;
                    ibwVar = ibwVarC;
                    i3 = iQ;
                } else {
                    uriB = tbwVarArr[i2].b();
                    ibw ibwVarC3 = vujVar.c(true, uriB);
                    ibwVarC3.getClass();
                    j9 = ibwVarC3.h - vujVar.v;
                    Pair pairE4 = wawVar.e(yawVar, false, ibwVarC3, j9, j7);
                    jLongValue = ((Long) pairE4.first).longValue();
                    iIntValue2 = ((Integer) pairE4.second).intValue();
                    i3 = i2;
                    ibwVar = ibwVarC3;
                }
                str2 = ibwVar.f23262a;
                z2 = ibwVar.c;
                j10 = ibwVar.k;
                b4x b4xVar2 = ibwVar.r;
                if (i3 != i2) {
                    uriB2 = tbwVarArr[i2].b();
                    uujVar = (uuj) vujVar.d.get(uriB2);
                    if (uujVar != null) {
                        HashMap map3 = uujVar.b;
                        x0x.K(map3.containsKey(uriB2));
                        tuj tujVar2 = (tuj) map3.get(uriB2);
                        tujVar2.getClass();
                        tujVar2.l = false;
                    }
                }
                if (jLongValue < j10) {
                    wawVar.o = new lb6();
                    cgx0Var = cgx0Var2;
                } else {
                    vawVarF2 = waw.f(ibwVar, jLongValue, iIntValue2);
                    if (vawVarF2 == null) {
                        cgx0Var = cgx0Var2;
                    } else if (ibwVar.o) {
                        cgx0Var = cgx0Var2;
                        cgx0Var.d = uriB;
                        r19.q = uriB;
                    } else {
                        cgx0Var = cgx0Var2;
                        if (z14) {
                        }
                        cgx0Var.b = true;
                    }
                    z3 = vawVarF2.d;
                    gbwVar = vawVarF2.f37111a;
                    r19.q = null;
                    SystemClock.elapsedRealtime();
                    fbw fbwVar3 = gbwVar.b;
                    j11 = gbwVar.e;
                    if (fbwVar3 != null) {
                    }
                    sawVarG = r19.g(uriP, i3, true);
                    cgx0Var.c = sawVarG;
                    if (sawVarG == null) {
                        str3 = gbwVar.g;
                        if (str3 == null) {
                            uriP2 = null;
                        } else {
                            uriP2 = msm0.p(ibwVar.f23262a, str3);
                        }
                        sawVarG2 = r19.g(uriP2, i3, false);
                        cgx0Var.c = sawVarG2;
                        if (sawVarG2 == null) {
                            if (gbwVar instanceof dbw) {
                                z4 = z2;
                            } else if (((dbw) gbwVar).l) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (yawVar == 0) {
                                AtomicInteger atomicInteger5 = yaw.M;
                            } else {
                                if (uriB.equals(yawVar.m)) {
                                    if (z4) {
                                    }
                                } else if (z4) {
                                }
                                if (z5) {
                                    ruj rujVar4 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar4 = r19.f[i3];
                                    List list9 = r19.j;
                                    int iS4 = r19.s.s();
                                    Object objJ4 = r19.s.j();
                                    boolean z117 = r19.m;
                                    owp0 owp0Var4 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var4 = r19.l;
                                    AtomicInteger atomicInteger6 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP9 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar4 = vawVarF2;
                                    cgx0 cgx0Var6 = cgx0Var;
                                    long j2113 = gbwVar.i;
                                    long j2114 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP9, "The uri must be set.");
                                    mbj mbjVar9 = new mbj(uriP9, 1, null, map, j2113, j2114, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str11 = gbwVar.h;
                                        str11.getClass();
                                        bArrD = yaw.d(str11);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str12 = fbwVar.h;
                                            str12.getClass();
                                            bArrD2 = yaw.d(str12);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP10 = msm0.p(str2, fbwVar.f11032a);
                                        long j2115 = fbwVar.i;
                                        boolean z118 = z10;
                                        long j2116 = fbwVar.j;
                                        x0x.G(uriP10, "The uri must be set.");
                                        mbj mbjVar10 = new mbj(uriP10, 1, null, map, j2115, j2116, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z118;
                                        mbjVar = mbjVar10;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j2117 = j9 + j11;
                                    long j2118 = j2117 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar5 = exwVar;
                                    fq80 fq80Var5 = fq80Var;
                                    long j2119 = vawVar4.b;
                                    int i12 = vawVar4.c;
                                    boolean z119 = !z3;
                                    boolean z23 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var4.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar7 = new yaw(rujVar4, g50Var, mbjVar9, bVar4, z6, jbjVar2, mbjVar, z7, uriB, list9, iS4, objJ4, j2117, j2118, j2119, i12, z119, i5, z23, z117, coq0Var, gbwVar.f, td9Var, exwVar5, fq80Var5, z5, z4, a4a0Var4, str);
                                    cgx0Var = cgx0Var6;
                                    cgx0Var.c = yawVar7;
                                } else {
                                    ruj rujVar5 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar5 = r19.f[i3];
                                    List list10 = r19.j;
                                    int iS5 = r19.s.s();
                                    Object objJ5 = r19.s.j();
                                    boolean z1110 = r19.m;
                                    owp0 owp0Var5 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var5 = r19.l;
                                    AtomicInteger atomicInteger7 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP11 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar5 = vawVarF2;
                                    cgx0 cgx0Var7 = cgx0Var;
                                    long j21110 = gbwVar.i;
                                    long j21111 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP11, "The uri must be set.");
                                    mbj mbjVar11 = new mbj(uriP11, 1, null, map, j21110, j21111, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str13 = gbwVar.h;
                                        str13.getClass();
                                        bArrD = yaw.d(str13);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str14 = fbwVar.h;
                                            str14.getClass();
                                            bArrD2 = yaw.d(str14);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP12 = msm0.p(str2, fbwVar.f11032a);
                                        long j21112 = fbwVar.i;
                                        boolean z1111 = z10;
                                        long j21113 = fbwVar.j;
                                        x0x.G(uriP12, "The uri must be set.");
                                        mbj mbjVar12 = new mbj(uriP12, 1, null, map, j21112, j21113, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z1111;
                                        mbjVar = mbjVar12;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j21114 = j9 + j11;
                                    long j21115 = j21114 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar6 = exwVar;
                                    fq80 fq80Var6 = fq80Var;
                                    long j21116 = vawVar5.b;
                                    int i13 = vawVar5.c;
                                    boolean z1112 = !z3;
                                    boolean z24 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var5.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar8 = new yaw(rujVar5, g50Var, mbjVar11, bVar5, z6, jbjVar2, mbjVar, z7, uriB, list10, iS5, objJ5, j21114, j21115, j21116, i13, z1112, i5, z24, z1110, coq0Var, gbwVar.f, td9Var, exwVar6, fq80Var6, z5, z4, a4a0Var5, str);
                                    cgx0Var = cgx0Var7;
                                    cgx0Var.c = yawVar8;
                                }
                            }
                            if (z5) {
                                ruj rujVar6 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar6 = r19.f[i3];
                                List list11 = r19.j;
                                int iS6 = r19.s.s();
                                Object objJ6 = r19.s.j();
                                boolean z1113 = r19.m;
                                owp0 owp0Var6 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var6 = r19.l;
                                AtomicInteger atomicInteger8 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP13 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar6 = vawVarF2;
                                cgx0 cgx0Var8 = cgx0Var;
                                long j21117 = gbwVar.i;
                                long j21118 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP13, "The uri must be set.");
                                mbj mbjVar13 = new mbj(uriP13, 1, null, map, j21117, j21118, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str15 = gbwVar.h;
                                    str15.getClass();
                                    bArrD = yaw.d(str15);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str16 = fbwVar.h;
                                        str16.getClass();
                                        bArrD2 = yaw.d(str16);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP14 = msm0.p(str2, fbwVar.f11032a);
                                    long j21119 = fbwVar.i;
                                    boolean z1114 = z10;
                                    long j211110 = fbwVar.j;
                                    x0x.G(uriP14, "The uri must be set.");
                                    mbj mbjVar14 = new mbj(uriP14, 1, null, map, j21119, j211110, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z1114;
                                    mbjVar = mbjVar14;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j211111 = j9 + j11;
                                long j211112 = j211111 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar7 = exwVar;
                                fq80 fq80Var7 = fq80Var;
                                long j211113 = vawVar6.b;
                                int i14 = vawVar6.c;
                                boolean z1115 = !z3;
                                boolean z25 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var6.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar9 = new yaw(rujVar6, g50Var, mbjVar13, bVar6, z6, jbjVar2, mbjVar, z7, uriB, list11, iS6, objJ6, j211111, j211112, j211113, i14, z1115, i5, z25, z1113, coq0Var, gbwVar.f, td9Var, exwVar7, fq80Var7, z5, z4, a4a0Var6, str);
                                cgx0Var = cgx0Var8;
                                cgx0Var.c = yawVar9;
                            } else {
                                ruj rujVar7 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar7 = r19.f[i3];
                                List list12 = r19.j;
                                int iS7 = r19.s.s();
                                Object objJ7 = r19.s.j();
                                boolean z1116 = r19.m;
                                owp0 owp0Var7 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var7 = r19.l;
                                AtomicInteger atomicInteger9 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP15 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar7 = vawVarF2;
                                cgx0 cgx0Var9 = cgx0Var;
                                long j211114 = gbwVar.i;
                                long j211115 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP15, "The uri must be set.");
                                mbj mbjVar15 = new mbj(uriP15, 1, null, map, j211114, j211115, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str17 = gbwVar.h;
                                    str17.getClass();
                                    bArrD = yaw.d(str17);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str18 = fbwVar.h;
                                        str18.getClass();
                                        bArrD2 = yaw.d(str18);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP16 = msm0.p(str2, fbwVar.f11032a);
                                    long j211116 = fbwVar.i;
                                    boolean z1117 = z10;
                                    long j211117 = fbwVar.j;
                                    x0x.G(uriP16, "The uri must be set.");
                                    mbj mbjVar16 = new mbj(uriP16, 1, null, map, j211116, j211117, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z1117;
                                    mbjVar = mbjVar16;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j211118 = j9 + j11;
                                long j211119 = j211118 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar8 = exwVar;
                                fq80 fq80Var8 = fq80Var;
                                long j2111110 = vawVar7.b;
                                int i15 = vawVar7.c;
                                boolean z1118 = !z3;
                                boolean z26 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var7.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar10 = new yaw(rujVar7, g50Var, mbjVar15, bVar7, z6, jbjVar2, mbjVar, z7, uriB, list12, iS7, objJ7, j211118, j211119, j2111110, i15, z1118, i5, z26, z1116, coq0Var, gbwVar.f, td9Var, exwVar8, fq80Var8, z5, z4, a4a0Var7, str);
                                cgx0Var = cgx0Var9;
                                cgx0Var.c = yawVar10;
                            }
                        }
                    }
                }
            }
            z11 = cgx0Var.b;
            yicVar = (yic) cgx0Var.c;
            uri = (Uri) cgx0Var.d;
            if (yicVar != null) {
                j13 = this.v1;
                if (j13 != Long.MIN_VALUE) {
                    z12 = false;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z11) {
                j12 = -9223372036854775807L;
            } else {
                if (z12) {
                    if (yicVar == null) {
                        if (uri != null) {
                        }
                        return false;
                    }
                    if (yicVar instanceof yaw) {
                        yawVar2 = (yaw) yicVar;
                        if (!arrayList.isEmpty()) {
                            arrayList2 = arrayList;
                            break;
                        }
                        if (!D().f()) {
                            C(arrayList.size() - 1);
                        }
                        if (!yawVar2.n) {
                            arrayList2 = arrayList;
                            break;
                        }
                        arrayList2 = arrayList;
                        break;
                        this.z1 = yawVar2;
                        this.g1 = yawVar2.d;
                        this.r1 = j;
                        arrayList2.add(yawVar2);
                        u3xVarL = b4x.l();
                        while (i6 < r5) {
                            u3xVarL.b(Integer.valueOf(xbwVar3.q + xbwVar3.p));
                        }
                        rcf0 rcf0VarG2 = u3xVarL.g();
                        yawVar2.D = this;
                        yawVar2.I = rcf0VarG2;
                        while (i7 < r4) {
                            xbwVar4.getClass();
                            xbwVar4.F = yawVar2.k;
                            if (yawVar2.L) {
                                xbwVar4.J = true;
                            }
                        }
                    }
                    this.u = yicVar;
                    lhf0Var.J(yicVar, this, this.i.e(yicVar.c));
                    return true;
                }
                j12 = j;
            }
            this.r1 = j12;
            this.u1 = true;
            return true;
        }
        j5 = j20;
        j6 = j18;
        jMax3 = j5;
        am30[] am30VarArrB2 = wawVar.b(yawVar3, j2);
        if (iA != -1) {
            fmo fmoVar2 = wawVar.s;
            uynVar = uynVar3;
            i = iA;
            if (fmoVar2.c(fmoVar2.l(iA), SystemClock.elapsedRealtime())) {
            }
            arrayList = arrayList3;
            j7 = j2;
            boolean z1119 = z15;
            uynVar2 = uynVar;
            i2 = i;
            yawVar = yawVar3;
            wawVar.s.m(j6, jMax5, jMax3, list5, am30VarArrB2);
            iQ = wawVar.s.q();
            if (i2 != iQ) {
                z = true;
            } else {
                z = false;
            }
            uriB = tbwVarArr[iQ].b();
            xawVar = wawVar.h;
            if (xawVar == null) {
                str = null;
            } else {
                str = null;
            }
            if (vujVar.h(uriB)) {
                cgx0Var2.d = uriB;
                wawVar.q = uriB;
                cgx0Var = cgx0Var2;
            } else {
                ibwVarC = vujVar.c(true, uriB);
                ibwVarC.getClass();
                wawVar.r = ibwVarC.c;
                if (ibwVarC.o) {
                    j8 = j;
                } else {
                    j8 = (ibwVarC.h + ibwVarC.u) - vujVar.v;
                }
                wawVar.t = j8;
                j9 = ibwVarC.h - vujVar.v;
                Pair pairE5 = wawVar.e(yawVar, z, ibwVarC, j9, j7);
                jLongValue = ((Long) pairE5.first).longValue();
                iIntValue = ((Integer) pairE5.second).intValue();
                if (z) {
                    iIntValue2 = iIntValue;
                    ibwVar = ibwVarC;
                    i3 = iQ;
                } else {
                    uriB = tbwVarArr[i2].b();
                    ibw ibwVarC4 = vujVar.c(true, uriB);
                    ibwVarC4.getClass();
                    j9 = ibwVarC4.h - vujVar.v;
                    Pair pairE6 = wawVar.e(yawVar, false, ibwVarC4, j9, j7);
                    jLongValue = ((Long) pairE6.first).longValue();
                    iIntValue2 = ((Integer) pairE6.second).intValue();
                    i3 = i2;
                    ibwVar = ibwVarC4;
                }
                str2 = ibwVar.f23262a;
                z2 = ibwVar.c;
                j10 = ibwVar.k;
                b4x b4xVar3 = ibwVar.r;
                if (i3 != i2) {
                    uriB2 = tbwVarArr[i2].b();
                    uujVar = (uuj) vujVar.d.get(uriB2);
                    if (uujVar != null) {
                        HashMap map4 = uujVar.b;
                        x0x.K(map4.containsKey(uriB2));
                        tuj tujVar3 = (tuj) map4.get(uriB2);
                        tujVar3.getClass();
                        tujVar3.l = false;
                    }
                }
                if (jLongValue < j10) {
                    wawVar.o = new lb6();
                    cgx0Var = cgx0Var2;
                } else {
                    vawVarF2 = waw.f(ibwVar, jLongValue, iIntValue2);
                    if (vawVarF2 == null) {
                        cgx0Var = cgx0Var2;
                    } else if (ibwVar.o) {
                        cgx0Var = cgx0Var2;
                        cgx0Var.d = uriB;
                        r19.q = uriB;
                    } else {
                        cgx0Var = cgx0Var2;
                        if (z14) {
                        }
                        cgx0Var.b = true;
                    }
                    z3 = vawVarF2.d;
                    gbwVar = vawVarF2.f37111a;
                    r19.q = null;
                    SystemClock.elapsedRealtime();
                    fbw fbwVar4 = gbwVar.b;
                    j11 = gbwVar.e;
                    if (fbwVar4 != null) {
                    }
                    sawVarG = r19.g(uriP, i3, true);
                    cgx0Var.c = sawVarG;
                    if (sawVarG == null) {
                        str3 = gbwVar.g;
                        if (str3 == null) {
                            uriP2 = null;
                        } else {
                            uriP2 = msm0.p(ibwVar.f23262a, str3);
                        }
                        sawVarG2 = r19.g(uriP2, i3, false);
                        cgx0Var.c = sawVarG2;
                        if (sawVarG2 == null) {
                            if (gbwVar instanceof dbw) {
                                z4 = z2;
                            } else if (((dbw) gbwVar).l) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (yawVar == 0) {
                                AtomicInteger atomicInteger10 = yaw.M;
                            } else {
                                if (uriB.equals(yawVar.m)) {
                                    if (z4) {
                                    }
                                } else if (z4) {
                                }
                                if (z5) {
                                    ruj rujVar8 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar8 = r19.f[i3];
                                    List list13 = r19.j;
                                    int iS8 = r19.s.s();
                                    Object objJ8 = r19.s.j();
                                    boolean z11110 = r19.m;
                                    owp0 owp0Var8 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var8 = r19.l;
                                    AtomicInteger atomicInteger11 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP17 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar8 = vawVarF2;
                                    cgx0 cgx0Var10 = cgx0Var;
                                    long j2111111 = gbwVar.i;
                                    long j2111112 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP17, "The uri must be set.");
                                    mbj mbjVar17 = new mbj(uriP17, 1, null, map, j2111111, j2111112, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str19 = gbwVar.h;
                                        str19.getClass();
                                        bArrD = yaw.d(str19);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str110 = fbwVar.h;
                                            str110.getClass();
                                            bArrD2 = yaw.d(str110);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP18 = msm0.p(str2, fbwVar.f11032a);
                                        long j2111113 = fbwVar.i;
                                        boolean z11111 = z10;
                                        long j2111114 = fbwVar.j;
                                        x0x.G(uriP18, "The uri must be set.");
                                        mbj mbjVar18 = new mbj(uriP18, 1, null, map, j2111113, j2111114, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z11111;
                                        mbjVar = mbjVar18;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j2111115 = j9 + j11;
                                    long j2111116 = j2111115 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar9 = exwVar;
                                    fq80 fq80Var9 = fq80Var;
                                    long j2111117 = vawVar8.b;
                                    int i16 = vawVar8.c;
                                    boolean z11112 = !z3;
                                    boolean z27 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var8.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar11 = new yaw(rujVar8, g50Var, mbjVar17, bVar8, z6, jbjVar2, mbjVar, z7, uriB, list13, iS8, objJ8, j2111115, j2111116, j2111117, i16, z11112, i5, z27, z11110, coq0Var, gbwVar.f, td9Var, exwVar9, fq80Var9, z5, z4, a4a0Var8, str);
                                    cgx0Var = cgx0Var10;
                                    cgx0Var.c = yawVar11;
                                } else {
                                    ruj rujVar9 = r19.f38848a;
                                    jbjVar = r19.b;
                                    androidx.media3.common.b bVar9 = r19.f[i3];
                                    List list14 = r19.j;
                                    int iS9 = r19.s.s();
                                    Object objJ9 = r19.s.j();
                                    boolean z11113 = r19.m;
                                    owp0 owp0Var9 = r19.d;
                                    if (uriP2 == null) {
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                    }
                                    if (uriP == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                    }
                                    a4a0 a4a0Var9 = r19.l;
                                    AtomicInteger atomicInteger12 = yaw.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriP19 = msm0.p(str2, gbwVar.f11032a);
                                    vaw vawVar9 = vawVarF2;
                                    cgx0 cgx0Var11 = cgx0Var;
                                    long j2111118 = gbwVar.i;
                                    long j2111119 = gbwVar.j;
                                    if (z3 != 0) {
                                        i4 = 8;
                                    } else {
                                        i4 = 0;
                                    }
                                    x0x.G(uriP19, "The uri must be set.");
                                    mbj mbjVar19 = new mbj(uriP19, 1, null, map, j2111118, j2111119, i4);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str111 = gbwVar.h;
                                        str111.getClass();
                                        bArrD = yaw.d(str111);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        g50Var = new g50(jbjVar, bArr, bArrD);
                                    } else {
                                        g50Var = jbjVar;
                                    }
                                    fbwVar = gbwVar.b;
                                    if (fbwVar != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str112 = fbwVar.h;
                                            str112.getClass();
                                            bArrD2 = yaw.d(str112);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriP110 = msm0.p(str2, fbwVar.f11032a);
                                        long j21111110 = fbwVar.i;
                                        boolean z11114 = z10;
                                        long j21111111 = fbwVar.j;
                                        x0x.G(uriP110, "The uri must be set.");
                                        mbj mbjVar110 = new mbj(uriP110, 1, null, map, j21111110, j21111111, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                        } else {
                                            g50Var2 = jbjVar;
                                        }
                                        jbjVar2 = g50Var2;
                                        z7 = z11114;
                                        mbjVar = mbjVar110;
                                    } else {
                                        mbjVar = null;
                                        jbjVar2 = null;
                                        z7 = false;
                                    }
                                    long j21111112 = j9 + j11;
                                    long j21111113 = j21111112 + gbwVar.c;
                                    i5 = ibwVar.j + gbwVar.d;
                                    if (yawVar != 0) {
                                        mbjVar2 = yawVar.q;
                                        if (mbjVar != mbjVar2) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        if (uriB.equals(yawVar.m)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        exwVar = yawVar.y;
                                        fq80Var = yawVar.z;
                                        if (z8) {
                                            td9Var2 = null;
                                        } else {
                                            td9Var2 = null;
                                        }
                                        td9Var = td9Var2;
                                    } else {
                                        exwVar = new exw(null);
                                        fq80Var = new fq80(10);
                                        td9Var = null;
                                    }
                                    exw exwVar10 = exwVar;
                                    fq80 fq80Var10 = fq80Var;
                                    long j21111114 = vawVar9.b;
                                    int i17 = vawVar9.c;
                                    boolean z11115 = !z3;
                                    boolean z28 = gbwVar.k;
                                    sparseArray = (SparseArray) owp0Var9.b;
                                    coq0Var = (coq0) sparseArray.get(i5);
                                    if (coq0Var == null) {
                                        coq0Var = new coq0(9223372036854775806L);
                                        sparseArray.put(i5, coq0Var);
                                    }
                                    yaw yawVar12 = new yaw(rujVar9, g50Var, mbjVar19, bVar9, z6, jbjVar2, mbjVar, z7, uriB, list14, iS9, objJ9, j21111112, j21111113, j21111114, i17, z11115, i5, z28, z11113, coq0Var, gbwVar.f, td9Var, exwVar10, fq80Var10, z5, z4, a4a0Var9, str);
                                    cgx0Var = cgx0Var11;
                                    cgx0Var.c = yawVar12;
                                }
                            }
                            if (z5) {
                                ruj rujVar10 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar10 = r19.f[i3];
                                List list15 = r19.j;
                                int iS10 = r19.s.s();
                                Object objJ10 = r19.s.j();
                                boolean z11116 = r19.m;
                                owp0 owp0Var10 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var10 = r19.l;
                                AtomicInteger atomicInteger13 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP111 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar10 = vawVarF2;
                                cgx0 cgx0Var12 = cgx0Var;
                                long j21111115 = gbwVar.i;
                                long j21111116 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP111, "The uri must be set.");
                                mbj mbjVar111 = new mbj(uriP111, 1, null, map, j21111115, j21111116, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str113 = gbwVar.h;
                                    str113.getClass();
                                    bArrD = yaw.d(str113);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str114 = fbwVar.h;
                                        str114.getClass();
                                        bArrD2 = yaw.d(str114);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP112 = msm0.p(str2, fbwVar.f11032a);
                                    long j21111117 = fbwVar.i;
                                    boolean z11117 = z10;
                                    long j21111118 = fbwVar.j;
                                    x0x.G(uriP112, "The uri must be set.");
                                    mbj mbjVar112 = new mbj(uriP112, 1, null, map, j21111117, j21111118, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z11117;
                                    mbjVar = mbjVar112;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j21111119 = j9 + j11;
                                long j211111110 = j21111119 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar11 = exwVar;
                                fq80 fq80Var11 = fq80Var;
                                long j211111111 = vawVar10.b;
                                int i18 = vawVar10.c;
                                boolean z11118 = !z3;
                                boolean z29 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var10.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar13 = new yaw(rujVar10, g50Var, mbjVar111, bVar10, z6, jbjVar2, mbjVar, z7, uriB, list15, iS10, objJ10, j21111119, j211111110, j211111111, i18, z11118, i5, z29, z11116, coq0Var, gbwVar.f, td9Var, exwVar11, fq80Var11, z5, z4, a4a0Var10, str);
                                cgx0Var = cgx0Var12;
                                cgx0Var.c = yawVar13;
                            } else {
                                ruj rujVar11 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar11 = r19.f[i3];
                                List list16 = r19.j;
                                int iS11 = r19.s.s();
                                Object objJ11 = r19.s.j();
                                boolean z11119 = r19.m;
                                owp0 owp0Var11 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var11 = r19.l;
                                AtomicInteger atomicInteger14 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP113 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar11 = vawVarF2;
                                cgx0 cgx0Var13 = cgx0Var;
                                long j211111112 = gbwVar.i;
                                long j211111113 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP113, "The uri must be set.");
                                mbj mbjVar113 = new mbj(uriP113, 1, null, map, j211111112, j211111113, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str115 = gbwVar.h;
                                    str115.getClass();
                                    bArrD = yaw.d(str115);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str116 = fbwVar.h;
                                        str116.getClass();
                                        bArrD2 = yaw.d(str116);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP114 = msm0.p(str2, fbwVar.f11032a);
                                    long j211111114 = fbwVar.i;
                                    boolean z111110 = z10;
                                    long j211111115 = fbwVar.j;
                                    x0x.G(uriP114, "The uri must be set.");
                                    mbj mbjVar114 = new mbj(uriP114, 1, null, map, j211111114, j211111115, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z111110;
                                    mbjVar = mbjVar114;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j211111116 = j9 + j11;
                                long j211111117 = j211111116 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar12 = exwVar;
                                fq80 fq80Var12 = fq80Var;
                                long j211111118 = vawVar11.b;
                                int i19 = vawVar11.c;
                                boolean z111111 = !z3;
                                boolean z210 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var11.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar14 = new yaw(rujVar11, g50Var, mbjVar113, bVar11, z6, jbjVar2, mbjVar, z7, uriB, list16, iS11, objJ11, j211111116, j211111117, j211111118, i19, z111111, i5, z210, z11119, coq0Var, gbwVar.f, td9Var, exwVar12, fq80Var12, z5, z4, a4a0Var11, str);
                                cgx0Var = cgx0Var13;
                                cgx0Var.c = yawVar14;
                            }
                        }
                    }
                }
            }
            z11 = cgx0Var.b;
            yicVar = (yic) cgx0Var.c;
            uri = (Uri) cgx0Var.d;
            if (yicVar != null) {
                j13 = this.v1;
                if (j13 != Long.MIN_VALUE) {
                    z12 = false;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z11) {
                j12 = -9223372036854775807L;
            } else {
                if (z12) {
                    if (yicVar == null) {
                        if (uri != null) {
                        }
                        return false;
                    }
                    if (yicVar instanceof yaw) {
                        yawVar2 = (yaw) yicVar;
                        if (!arrayList.isEmpty()) {
                            arrayList2 = arrayList;
                            break;
                        }
                        if (!D().f()) {
                            C(arrayList.size() - 1);
                        }
                        if (!yawVar2.n) {
                            arrayList2 = arrayList;
                            break;
                        }
                        arrayList2 = arrayList;
                        break;
                        this.z1 = yawVar2;
                        this.g1 = yawVar2.d;
                        this.r1 = j;
                        arrayList2.add(yawVar2);
                        u3xVarL = b4x.l();
                        while (i6 < r5) {
                            u3xVarL.b(Integer.valueOf(xbwVar3.q + xbwVar3.p));
                        }
                        rcf0 rcf0VarG3 = u3xVarL.g();
                        yawVar2.D = this;
                        yawVar2.I = rcf0VarG3;
                        while (i7 < r4) {
                            xbwVar4.getClass();
                            xbwVar4.F = yawVar2.k;
                            if (yawVar2.L) {
                                xbwVar4.J = true;
                            }
                        }
                    }
                    this.u = yicVar;
                    lhf0Var.J(yicVar, this, this.i.e(yicVar.c));
                    return true;
                }
                j12 = j;
            }
            this.r1 = j12;
            this.u1 = true;
            return true;
        }
        uynVar = uynVar3;
        i = iA;
        arrayList = arrayList3;
        j7 = j2;
        boolean z11120 = z15;
        uynVar2 = uynVar;
        i2 = i;
        yawVar = yawVar3;
        wawVar.s.m(j6, jMax5, jMax3, list5, am30VarArrB2);
        iQ = wawVar.s.q();
        if (i2 != iQ) {
            z = true;
        } else {
            z = false;
        }
        uriB = tbwVarArr[iQ].b();
        xawVar = wawVar.h;
        if (xawVar == null) {
            str = null;
        } else {
            str = null;
        }
        if (vujVar.h(uriB)) {
            cgx0Var2.d = uriB;
            wawVar.q = uriB;
            cgx0Var = cgx0Var2;
        } else {
            ibwVarC = vujVar.c(true, uriB);
            ibwVarC.getClass();
            wawVar.r = ibwVarC.c;
            if (ibwVarC.o) {
                j8 = j;
            } else {
                j8 = (ibwVarC.h + ibwVarC.u) - vujVar.v;
            }
            wawVar.t = j8;
            j9 = ibwVarC.h - vujVar.v;
            Pair pairE7 = wawVar.e(yawVar, z, ibwVarC, j9, j7);
            jLongValue = ((Long) pairE7.first).longValue();
            iIntValue = ((Integer) pairE7.second).intValue();
            if (z) {
                iIntValue2 = iIntValue;
                ibwVar = ibwVarC;
                i3 = iQ;
            } else {
                uriB = tbwVarArr[i2].b();
                ibw ibwVarC5 = vujVar.c(true, uriB);
                ibwVarC5.getClass();
                j9 = ibwVarC5.h - vujVar.v;
                Pair pairE8 = wawVar.e(yawVar, false, ibwVarC5, j9, j7);
                jLongValue = ((Long) pairE8.first).longValue();
                iIntValue2 = ((Integer) pairE8.second).intValue();
                i3 = i2;
                ibwVar = ibwVarC5;
            }
            str2 = ibwVar.f23262a;
            z2 = ibwVar.c;
            j10 = ibwVar.k;
            b4x b4xVar4 = ibwVar.r;
            if (i3 != i2) {
                uriB2 = tbwVarArr[i2].b();
                uujVar = (uuj) vujVar.d.get(uriB2);
                if (uujVar != null) {
                    HashMap map5 = uujVar.b;
                    x0x.K(map5.containsKey(uriB2));
                    tuj tujVar4 = (tuj) map5.get(uriB2);
                    tujVar4.getClass();
                    tujVar4.l = false;
                }
            }
            if (jLongValue < j10) {
                wawVar.o = new lb6();
                cgx0Var = cgx0Var2;
            } else {
                vawVarF2 = waw.f(ibwVar, jLongValue, iIntValue2);
                if (vawVarF2 == null) {
                    cgx0Var = cgx0Var2;
                } else if (ibwVar.o) {
                    cgx0Var = cgx0Var2;
                    cgx0Var.d = uriB;
                    r19.q = uriB;
                } else {
                    cgx0Var = cgx0Var2;
                    if (z14) {
                    }
                    cgx0Var.b = true;
                }
                z3 = vawVarF2.d;
                gbwVar = vawVarF2.f37111a;
                r19.q = null;
                SystemClock.elapsedRealtime();
                fbw fbwVar5 = gbwVar.b;
                j11 = gbwVar.e;
                if (fbwVar5 != null) {
                }
                sawVarG = r19.g(uriP, i3, true);
                cgx0Var.c = sawVarG;
                if (sawVarG == null) {
                    str3 = gbwVar.g;
                    if (str3 == null) {
                        uriP2 = null;
                    } else {
                        uriP2 = msm0.p(ibwVar.f23262a, str3);
                    }
                    sawVarG2 = r19.g(uriP2, i3, false);
                    cgx0Var.c = sawVarG2;
                    if (sawVarG2 == null) {
                        if (gbwVar instanceof dbw) {
                            z4 = z2;
                        } else if (((dbw) gbwVar).l) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (yawVar == 0) {
                            AtomicInteger atomicInteger15 = yaw.M;
                        } else {
                            if (uriB.equals(yawVar.m)) {
                                if (z4) {
                                }
                            } else if (z4) {
                            }
                            if (z5) {
                                ruj rujVar12 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar12 = r19.f[i3];
                                List list17 = r19.j;
                                int iS12 = r19.s.s();
                                Object objJ12 = r19.s.j();
                                boolean z111112 = r19.m;
                                owp0 owp0Var12 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var12 = r19.l;
                                AtomicInteger atomicInteger16 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP115 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar12 = vawVarF2;
                                cgx0 cgx0Var14 = cgx0Var;
                                long j211111119 = gbwVar.i;
                                long j2111111110 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP115, "The uri must be set.");
                                mbj mbjVar115 = new mbj(uriP115, 1, null, map, j211111119, j2111111110, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str117 = gbwVar.h;
                                    str117.getClass();
                                    bArrD = yaw.d(str117);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str118 = fbwVar.h;
                                        str118.getClass();
                                        bArrD2 = yaw.d(str118);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP116 = msm0.p(str2, fbwVar.f11032a);
                                    long j2111111111 = fbwVar.i;
                                    boolean z111113 = z10;
                                    long j2111111112 = fbwVar.j;
                                    x0x.G(uriP116, "The uri must be set.");
                                    mbj mbjVar116 = new mbj(uriP116, 1, null, map, j2111111111, j2111111112, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z111113;
                                    mbjVar = mbjVar116;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j2111111113 = j9 + j11;
                                long j2111111114 = j2111111113 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar13 = exwVar;
                                fq80 fq80Var13 = fq80Var;
                                long j2111111115 = vawVar12.b;
                                int i110 = vawVar12.c;
                                boolean z111114 = !z3;
                                boolean z211 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var12.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar15 = new yaw(rujVar12, g50Var, mbjVar115, bVar12, z6, jbjVar2, mbjVar, z7, uriB, list17, iS12, objJ12, j2111111113, j2111111114, j2111111115, i110, z111114, i5, z211, z111112, coq0Var, gbwVar.f, td9Var, exwVar13, fq80Var13, z5, z4, a4a0Var12, str);
                                cgx0Var = cgx0Var14;
                                cgx0Var.c = yawVar15;
                            } else {
                                ruj rujVar13 = r19.f38848a;
                                jbjVar = r19.b;
                                androidx.media3.common.b bVar13 = r19.f[i3];
                                List list18 = r19.j;
                                int iS13 = r19.s.s();
                                Object objJ13 = r19.s.j();
                                boolean z111115 = r19.m;
                                owp0 owp0Var13 = r19.d;
                                if (uriP2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                                }
                                if (uriP == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                                }
                                a4a0 a4a0Var13 = r19.l;
                                AtomicInteger atomicInteger17 = yaw.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriP117 = msm0.p(str2, gbwVar.f11032a);
                                vaw vawVar13 = vawVarF2;
                                cgx0 cgx0Var15 = cgx0Var;
                                long j2111111116 = gbwVar.i;
                                long j2111111117 = gbwVar.j;
                                if (z3 != 0) {
                                    i4 = 8;
                                } else {
                                    i4 = 0;
                                }
                                x0x.G(uriP117, "The uri must be set.");
                                mbj mbjVar117 = new mbj(uriP117, 1, null, map, j2111111116, j2111111117, i4);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str119 = gbwVar.h;
                                    str119.getClass();
                                    bArrD = yaw.d(str119);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    g50Var = new g50(jbjVar, bArr, bArrD);
                                } else {
                                    g50Var = jbjVar;
                                }
                                fbwVar = gbwVar.b;
                                if (fbwVar != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str1110 = fbwVar.h;
                                        str1110.getClass();
                                        bArrD2 = yaw.d(str1110);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriP118 = msm0.p(str2, fbwVar.f11032a);
                                    long j2111111118 = fbwVar.i;
                                    boolean z111116 = z10;
                                    long j2111111119 = fbwVar.j;
                                    x0x.G(uriP118, "The uri must be set.");
                                    mbj mbjVar118 = new mbj(uriP118, 1, null, map, j2111111118, j2111111119, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                    } else {
                                        g50Var2 = jbjVar;
                                    }
                                    jbjVar2 = g50Var2;
                                    z7 = z111116;
                                    mbjVar = mbjVar118;
                                } else {
                                    mbjVar = null;
                                    jbjVar2 = null;
                                    z7 = false;
                                }
                                long j21111111110 = j9 + j11;
                                long j21111111111 = j21111111110 + gbwVar.c;
                                i5 = ibwVar.j + gbwVar.d;
                                if (yawVar != 0) {
                                    mbjVar2 = yawVar.q;
                                    if (mbjVar != mbjVar2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uriB.equals(yawVar.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    exwVar = yawVar.y;
                                    fq80Var = yawVar.z;
                                    if (z8) {
                                        td9Var2 = null;
                                    } else {
                                        td9Var2 = null;
                                    }
                                    td9Var = td9Var2;
                                } else {
                                    exwVar = new exw(null);
                                    fq80Var = new fq80(10);
                                    td9Var = null;
                                }
                                exw exwVar14 = exwVar;
                                fq80 fq80Var14 = fq80Var;
                                long j21111111112 = vawVar13.b;
                                int i111 = vawVar13.c;
                                boolean z111117 = !z3;
                                boolean z212 = gbwVar.k;
                                sparseArray = (SparseArray) owp0Var13.b;
                                coq0Var = (coq0) sparseArray.get(i5);
                                if (coq0Var == null) {
                                    coq0Var = new coq0(9223372036854775806L);
                                    sparseArray.put(i5, coq0Var);
                                }
                                yaw yawVar16 = new yaw(rujVar13, g50Var, mbjVar117, bVar13, z6, jbjVar2, mbjVar, z7, uriB, list18, iS13, objJ13, j21111111110, j21111111111, j21111111112, i111, z111117, i5, z212, z111115, coq0Var, gbwVar.f, td9Var, exwVar14, fq80Var14, z5, z4, a4a0Var13, str);
                                cgx0Var = cgx0Var15;
                                cgx0Var.c = yawVar16;
                            }
                        }
                        if (z5) {
                            ruj rujVar14 = r19.f38848a;
                            jbjVar = r19.b;
                            androidx.media3.common.b bVar14 = r19.f[i3];
                            List list19 = r19.j;
                            int iS14 = r19.s.s();
                            Object objJ14 = r19.s.j();
                            boolean z111118 = r19.m;
                            owp0 owp0Var14 = r19.d;
                            if (uriP2 == null) {
                                bArr = null;
                            } else {
                                bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                            }
                            if (uriP == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                            }
                            a4a0 a4a0Var14 = r19.l;
                            AtomicInteger atomicInteger18 = yaw.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriP119 = msm0.p(str2, gbwVar.f11032a);
                            vaw vawVar14 = vawVarF2;
                            cgx0 cgx0Var16 = cgx0Var;
                            long j21111111113 = gbwVar.i;
                            long j21111111114 = gbwVar.j;
                            if (z3 != 0) {
                                i4 = 8;
                            } else {
                                i4 = 0;
                            }
                            x0x.G(uriP119, "The uri must be set.");
                            mbj mbjVar119 = new mbj(uriP119, 1, null, map, j21111111113, j21111111114, i4);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str1111 = gbwVar.h;
                                str1111.getClass();
                                bArrD = yaw.d(str1111);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                g50Var = new g50(jbjVar, bArr, bArrD);
                            } else {
                                g50Var = jbjVar;
                            }
                            fbwVar = gbwVar.b;
                            if (fbwVar != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str1112 = fbwVar.h;
                                    str1112.getClass();
                                    bArrD2 = yaw.d(str1112);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriP1110 = msm0.p(str2, fbwVar.f11032a);
                                long j21111111115 = fbwVar.i;
                                boolean z111119 = z10;
                                long j21111111116 = fbwVar.j;
                                x0x.G(uriP1110, "The uri must be set.");
                                mbj mbjVar1110 = new mbj(uriP1110, 1, null, map, j21111111115, j21111111116, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                } else {
                                    g50Var2 = jbjVar;
                                }
                                jbjVar2 = g50Var2;
                                z7 = z111119;
                                mbjVar = mbjVar1110;
                            } else {
                                mbjVar = null;
                                jbjVar2 = null;
                                z7 = false;
                            }
                            long j21111111117 = j9 + j11;
                            long j21111111118 = j21111111117 + gbwVar.c;
                            i5 = ibwVar.j + gbwVar.d;
                            if (yawVar != 0) {
                                mbjVar2 = yawVar.q;
                                if (mbjVar != mbjVar2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uriB.equals(yawVar.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                exwVar = yawVar.y;
                                fq80Var = yawVar.z;
                                if (z8) {
                                    td9Var2 = null;
                                } else {
                                    td9Var2 = null;
                                }
                                td9Var = td9Var2;
                            } else {
                                exwVar = new exw(null);
                                fq80Var = new fq80(10);
                                td9Var = null;
                            }
                            exw exwVar15 = exwVar;
                            fq80 fq80Var15 = fq80Var;
                            long j21111111119 = vawVar14.b;
                            int i112 = vawVar14.c;
                            boolean z1111110 = !z3;
                            boolean z213 = gbwVar.k;
                            sparseArray = (SparseArray) owp0Var14.b;
                            coq0Var = (coq0) sparseArray.get(i5);
                            if (coq0Var == null) {
                                coq0Var = new coq0(9223372036854775806L);
                                sparseArray.put(i5, coq0Var);
                            }
                            yaw yawVar17 = new yaw(rujVar14, g50Var, mbjVar119, bVar14, z6, jbjVar2, mbjVar, z7, uriB, list19, iS14, objJ14, j21111111117, j21111111118, j21111111119, i112, z1111110, i5, z213, z111118, coq0Var, gbwVar.f, td9Var, exwVar15, fq80Var15, z5, z4, a4a0Var14, str);
                            cgx0Var = cgx0Var16;
                            cgx0Var.c = yawVar17;
                        } else {
                            ruj rujVar15 = r19.f38848a;
                            jbjVar = r19.b;
                            androidx.media3.common.b bVar15 = r19.f[i3];
                            List list110 = r19.j;
                            int iS15 = r19.s.s();
                            Object objJ15 = r19.s.j();
                            boolean z1111111 = r19.m;
                            owp0 owp0Var15 = r19.d;
                            if (uriP2 == null) {
                                bArr = null;
                            } else {
                                bArr = (byte[]) ((icr) uynVar2.f36498a).get(uriP2);
                            }
                            if (uriP == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((icr) uynVar2.f36498a).get(uriP);
                            }
                            a4a0 a4a0Var15 = r19.l;
                            AtomicInteger atomicInteger19 = yaw.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriP1111 = msm0.p(str2, gbwVar.f11032a);
                            vaw vawVar15 = vawVarF2;
                            cgx0 cgx0Var17 = cgx0Var;
                            long j211111111110 = gbwVar.i;
                            long j211111111111 = gbwVar.j;
                            if (z3 != 0) {
                                i4 = 8;
                            } else {
                                i4 = 0;
                            }
                            x0x.G(uriP1111, "The uri must be set.");
                            mbj mbjVar1111 = new mbj(uriP1111, 1, null, map, j211111111110, j211111111111, i4);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str1113 = gbwVar.h;
                                str1113.getClass();
                                bArrD = yaw.d(str1113);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                g50Var = new g50(jbjVar, bArr, bArrD);
                            } else {
                                g50Var = jbjVar;
                            }
                            fbwVar = gbwVar.b;
                            if (fbwVar != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str1114 = fbwVar.h;
                                    str1114.getClass();
                                    bArrD2 = yaw.d(str1114);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriP1112 = msm0.p(str2, fbwVar.f11032a);
                                long j211111111112 = fbwVar.i;
                                boolean z1111112 = z10;
                                long j211111111113 = fbwVar.j;
                                x0x.G(uriP1112, "The uri must be set.");
                                mbj mbjVar1112 = new mbj(uriP1112, 1, null, map, j211111111112, j211111111113, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    g50Var2 = new g50(jbjVar, bArr2, bArrD2);
                                } else {
                                    g50Var2 = jbjVar;
                                }
                                jbjVar2 = g50Var2;
                                z7 = z1111112;
                                mbjVar = mbjVar1112;
                            } else {
                                mbjVar = null;
                                jbjVar2 = null;
                                z7 = false;
                            }
                            long j211111111114 = j9 + j11;
                            long j211111111115 = j211111111114 + gbwVar.c;
                            i5 = ibwVar.j + gbwVar.d;
                            if (yawVar != 0) {
                                mbjVar2 = yawVar.q;
                                if (mbjVar != mbjVar2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uriB.equals(yawVar.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                exwVar = yawVar.y;
                                fq80Var = yawVar.z;
                                if (z8) {
                                    td9Var2 = null;
                                } else {
                                    td9Var2 = null;
                                }
                                td9Var = td9Var2;
                            } else {
                                exwVar = new exw(null);
                                fq80Var = new fq80(10);
                                td9Var = null;
                            }
                            exw exwVar16 = exwVar;
                            fq80 fq80Var16 = fq80Var;
                            long j211111111116 = vawVar15.b;
                            int i113 = vawVar15.c;
                            boolean z1111113 = !z3;
                            boolean z214 = gbwVar.k;
                            sparseArray = (SparseArray) owp0Var15.b;
                            coq0Var = (coq0) sparseArray.get(i5);
                            if (coq0Var == null) {
                                coq0Var = new coq0(9223372036854775806L);
                                sparseArray.put(i5, coq0Var);
                            }
                            yaw yawVar18 = new yaw(rujVar15, g50Var, mbjVar1111, bVar15, z6, jbjVar2, mbjVar, z7, uriB, list110, iS15, objJ15, j211111111114, j211111111115, j211111111116, i113, z1111113, i5, z214, z1111111, coq0Var, gbwVar.f, td9Var, exwVar16, fq80Var16, z5, z4, a4a0Var15, str);
                            cgx0Var = cgx0Var17;
                            cgx0Var.c = yawVar18;
                        }
                    }
                }
            }
        }
        z11 = cgx0Var.b;
        yicVar = (yic) cgx0Var.c;
        uri = (Uri) cgx0Var.d;
        if (yicVar != null) {
            j13 = this.v1;
            if (j13 != Long.MIN_VALUE) {
                z12 = false;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (!z11) {
            j12 = -9223372036854775807L;
        } else {
            if (z12) {
                if (yicVar == null) {
                    if (uri != null) {
                    }
                    return false;
                }
                if (yicVar instanceof yaw) {
                    yawVar2 = (yaw) yicVar;
                    if (!arrayList.isEmpty()) {
                        arrayList2 = arrayList;
                        break;
                    }
                    if (!D().f()) {
                        C(arrayList.size() - 1);
                    }
                    if (!yawVar2.n) {
                        arrayList2 = arrayList;
                        break;
                    }
                    arrayList2 = arrayList;
                    break;
                    this.z1 = yawVar2;
                    this.g1 = yawVar2.d;
                    this.r1 = j;
                    arrayList2.add(yawVar2);
                    u3xVarL = b4x.l();
                    while (i6 < r5) {
                        u3xVarL.b(Integer.valueOf(xbwVar3.q + xbwVar3.p));
                    }
                    rcf0 rcf0VarG4 = u3xVarL.g();
                    yawVar2.D = this;
                    yawVar2.I = rcf0VarG4;
                    while (i7 < r4) {
                        xbwVar4.getClass();
                        xbwVar4.F = yawVar2.k;
                        if (yawVar2.L) {
                            xbwVar4.J = true;
                        }
                    }
                }
                this.u = yicVar;
                lhf0Var.J(yicVar, this, this.i.e(yicVar.c));
                return true;
            }
            j12 = j;
        }
        this.r1 = j12;
        this.u1 = true;
        return true;
    }

    @Override // a.lq00
    public final void i() {
        for (xbw xbwVar : this.v) {
            xbwVar.x(true);
            ivn ivnVar = xbwVar.h;
            if (ivnVar != null) {
                ivnVar.m(xbwVar.e);
                xbwVar.h = null;
                xbwVar.g = null;
            }
        }
    }

    @Override // a.iq00
    public final void n(kq00 kq00Var, long j, long j2, boolean z) {
        yic yicVar = (yic) kq00Var;
        this.u = null;
        vn00 vn00Var = new vn00(yicVar.f42681a, yicVar.b, j);
        enm0 enm0Var = yicVar.i;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        this.i.getClass();
        this.k.b(wn00Var, yicVar.c, this.b, yicVar.d, yicVar.e, yicVar.f, yicVar.g, yicVar.h);
        if (z) {
            return;
        }
        if (F() || this.f1 == 0) {
            J();
        }
        if (this.f1 > 0) {
            this.c.a(this);
        }
    }

    @Override // a.huo
    public final void o() {
        this.w1 = true;
        this.r.post(this.q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [a.xbw[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.xbw[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.ncs0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.hxg0, a.xbw] */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.pnk] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // a.huo
    public final ncs0 q(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = A1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? xbwVar = 0;
        xbwVar = 0;
        if (zContains) {
            x0x.A(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                xbwVar = this.w[i3] == i ? this.v[i3] : z(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    xbwVar = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (xbwVar == 0) {
            if (this.w1) {
                return z(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            xbwVar = new xbw(this.e, this.g, this.h, this.t);
            xbwVar.t = this.q1;
            if (z) {
                xbwVar.L = this.y1;
                xbwVar.C = true;
            }
            long j = this.x1;
            if (xbwVar.I != j) {
                xbwVar.I = j;
                xbwVar.C = true;
            }
            yaw yawVar = this.z1;
            if (yawVar != null) {
                xbwVar.F = yawVar.k;
            }
            xbwVar.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            xbw[] xbwVarArr = this.v;
            String str = vtt0.f38024a;
            ?? CopyOf = Arrays.copyOf(xbwVarArr, xbwVarArr.length + 1);
            CopyOf[xbwVarArr.length] = xbwVar;
            this.v = (xbw[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.p1, i5);
            this.p1 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.n1 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (E(i2) > E(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.o1 = Arrays.copyOf(this.o1, i5);
        }
        if (i2 != 5) {
            return xbwVar;
        }
        wbw wbwVar = this.z;
        if (wbwVar != null) {
            return wbwVar;
        }
        wbw wbwVar2 = new wbw(xbwVar, this.l ? 1 : 0);
        this.z = wbwVar2;
        return wbwVar2;
    }

    @Override // a.hgi0
    public final long s() {
        long j;
        ArrayList arrayList = this.n;
        if (this.u1) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.r1;
        }
        long jMax = this.q1;
        yaw yawVarD = D();
        if (!yawVarD.H) {
            yawVarD = arrayList.size() > 1 ? (yaw) dw9.l(2, arrayList) : null;
        }
        if (yawVarD != null) {
            jMax = Math.max(jMax, yawVarD.h);
        }
        if (this.Y) {
            for (xbw xbwVar : this.v) {
                synchronized (xbwVar) {
                    j = xbwVar.w;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // a.gxg0
    public final void t() {
        this.r.post(this.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.iq00
    public final void u(kq00 kq00Var, long j, long j2) {
        yic yicVar = (yic) kq00Var;
        this.u = null;
        if (yicVar instanceof saw) {
            saw sawVar = (saw) yicVar;
            byte[] bArr = sawVar.j;
            waw wawVar = this.d;
            wawVar.n = bArr;
            uyn uynVar = wawVar.k;
            Uri uri = sawVar.b.f21512a;
            byte[] bArr2 = sawVar.l;
            bArr2.getClass();
            icr icrVar = (icr) uynVar.f36498a;
            uri.getClass();
        }
        vn00 vn00Var = new vn00(yicVar.f42681a, yicVar.b, j);
        enm0 enm0Var = yicVar.i;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        this.i.getClass();
        this.k.c(wn00Var, yicVar.c, this.b, yicVar.d, yicVar.e, yicVar.f, yicVar.g, yicVar.h);
        if (this.Z) {
            this.c.a(this);
            return;
        }
        xq00 xq00Var = new xq00();
        xq00Var.f41291a = this.q1;
        g(new yq00(xq00Var));
    }

    @Override // a.hgi0
    public final void v(long j) {
        lhf0 lhf0Var = this.j;
        if (((IOException) lhf0Var.d) == null && !F()) {
            boolean zC = lhf0Var.C();
            boolean z = false;
            waw wawVar = this.d;
            ArrayList arrayList = this.n;
            List list = this.o;
            if (zC) {
                yic yicVar = this.u;
                yicVar.getClass();
                if (!(yicVar instanceof yaw) || y(arrayList.size() - 1)) {
                    long j2 = this.v1;
                    if (j2 == Long.MIN_VALUE || yicVar.g < j2) {
                        if (!(wawVar.o == null ? wawVar.s.t(j, yicVar, list) : false)) {
                            return;
                        }
                    }
                    lhf0Var.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && wawVar.c((yaw) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                C(size);
            }
            int iMin = Math.min(arrayList.size(), (wawVar.o != null || wawVar.s.length() < 2) ? list.size() : wawVar.s.p(j, list));
            if (this.v1 != Long.MIN_VALUE) {
                while (iMin > 0 && ((yaw) arrayList.get(iMin - 1)).g >= this.v1) {
                    iMin--;
                    z = true;
                }
            }
            if (iMin < arrayList.size()) {
                C(iMin);
            }
            if (z) {
                this.r1 = -9223372036854775807L;
                this.u1 = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x0188  */
    /* JADX WARN: Code duplicated, block: B:87:0x019a  */
    @Override // a.iq00
    public final ejx w(kq00 kq00Var, long j, long j2, IOException iOException, int i) {
        dmk dmkVar;
        boolean z;
        long j3;
        boolean zA;
        boolean z2;
        int iL;
        long jF;
        boolean z3;
        ejx ejxVar;
        ejx ejxVar2;
        int i2;
        boolean z4;
        ArrayList arrayList;
        boolean z5;
        int i3;
        yic yicVar = (yic) kq00Var;
        waw wawVar = this.d;
        xaw xawVar = wawVar.h;
        boolean z6 = yicVar instanceof yaw;
        if (z6 && !((yaw) yicVar).f() && (iOException instanceof ptw) && ((i3 = ((ptw) iOException).c) == 410 || i3 == 404)) {
            return lhf0.e;
        }
        long j4 = yicVar.i.b;
        vn00 vn00Var = new vn00(yicVar.f42681a, yicVar.b, j);
        enm0 enm0Var = yicVar.i;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = j4;
        wn00 wn00Var = new wn00(vn00Var);
        vtt0.Y(yicVar.g);
        vtt0.Y(yicVar.h);
        y78 y78Var = new y78((Object) iOException, i, (byte) 7);
        boolean z7 = yicVar instanceof yaw;
        if (z7) {
            dmkVar = wawVar.a(((yaw) yicVar).m);
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int length = wawVar.s.length();
            boolean z8 = xawVar != null && xawVar.k;
            dmkVar = new dmk(z8, 1, 0, length, wawVar.d(z8, jElapsedRealtime));
        }
        x860 x860Var = this.i;
        x860Var.getClass();
        un00 un00VarC = x860.c(dmkVar, y78Var);
        if (un00VarC != null) {
            byte b = un00VarC.f35939a;
            if (xawVar == null || !xawVar.k) {
                xawVar = null;
            }
            z = z6;
            j3 = j4;
            long j5 = un00VarC.b;
            if (b == 1) {
                if (xawVar != null) {
                    wawVar.s.e();
                    zA = xawVar.a(j5);
                } else if (z7) {
                    vuj vujVar = wawVar.g;
                    Uri uri = ((yaw) yicVar).m;
                    uuj uujVar = (uuj) vujVar.d.get(uri);
                    zA = uujVar != null ? uujVar.a(uri, j5, null) : false;
                }
                z2 = zA;
            } else {
                if (b != 2) {
                    jf4.n(twn.m(b, "Invalid fallback selection type: "));
                    return null;
                }
                int iA = wawVar.i.a(yicVar.d);
                if (iA != -1 && (iL = wawVar.s.l(iA)) != -1) {
                    zA = wawVar.s.h(iL, j5);
                    z2 = zA;
                }
            }
            if (z2) {
                if (z && j3 == 0) {
                    arrayList = this.n;
                    if (((yaw) hne.k(1, arrayList)) == yicVar) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    x0x.K(z5);
                    if (arrayList.isEmpty()) {
                        this.r1 = this.q1;
                    } else {
                        ((yaw) g8x.H(arrayList)).J = true;
                    }
                }
                ejxVar = lhf0.f;
                z3 = false;
            } else {
                jF = x860Var.f(y78Var);
                if (jF != -9223372036854775807L) {
                    z3 = false;
                    ejxVar = new ejx(0, jF);
                } else {
                    z3 = false;
                    ejxVar = lhf0.g;
                }
            }
            ejxVar2 = ejxVar;
            i2 = ejxVar2.f7928a;
            if (i2 != 0 || i2 == 1) {
                z4 = true;
            } else {
                z4 = z3;
            }
            this.k.d(wn00Var, yicVar.c, this.b, yicVar.d, yicVar.e, yicVar.f, yicVar.g, yicVar.h, iOException, !z4);
            if (!z4) {
                this.u = null;
            }
            if (z2) {
                if (!this.Z) {
                    xq00 xq00Var = new xq00();
                    xq00Var.f41291a = this.q1;
                    g(new yq00(xq00Var));
                    return ejxVar2;
                }
                this.c.a(this);
            }
            return ejxVar2;
        }
        z = z6;
        j3 = j4;
        z2 = false;
        if (z2) {
            if (z) {
                arrayList = this.n;
                if (((yaw) hne.k(1, arrayList)) == yicVar) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                x0x.K(z5);
                if (arrayList.isEmpty()) {
                    this.r1 = this.q1;
                } else {
                    ((yaw) g8x.H(arrayList)).J = true;
                }
            }
            ejxVar = lhf0.f;
            z3 = false;
        } else {
            jF = x860Var.f(y78Var);
            if (jF != -9223372036854775807L) {
                z3 = false;
                ejxVar = new ejx(0, jF);
            } else {
                z3 = false;
                ejxVar = lhf0.g;
            }
        }
        ejxVar2 = ejxVar;
        i2 = ejxVar2.f7928a;
        if (i2 != 0) {
            z4 = true;
        } else {
            z4 = true;
        }
        this.k.d(wn00Var, yicVar.c, this.b, yicVar.d, yicVar.e, yicVar.f, yicVar.g, yicVar.h, iOException, !z4);
        if (!z4) {
            this.u = null;
        }
        if (z2) {
            if (!this.Z) {
                xq00 xq00Var2 = new xq00();
                xq00Var2.f41291a = this.q1;
                g(new yq00(xq00Var2));
                return ejxVar2;
            }
            this.c.a(this);
        }
        return ejxVar2;
    }

    public final void x() {
        x0x.K(this.Z);
        this.j1.getClass();
        this.k1.getClass();
    }

    public final boolean y(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                yaw yawVar = (yaw) arrayList.get(i);
                for (int i3 = 0; i3 < this.v.length; i3++) {
                    if (this.v[i3].o() > yawVar.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((yaw) arrayList.get(i2)).L) {
                return false;
            }
            i2++;
        }
    }

    @Override // a.huo
    public final void f(fvh0 fvh0Var) {
    }
}
