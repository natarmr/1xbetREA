package a;

import android.javax.sip.message.Response;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fet {
    public int A;
    public int B;
    public boolean C;
    public final eet D;
    public final ArrayList E;
    public boolean F;
    public p9k0 G;
    public q9k0 H;
    public t9k0 I;
    public boolean J;
    public bh90 K;
    public qpb L;
    public final vkd M;
    public bet N;
    public uiq O;
    public isj0 P;
    public final rld Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public get U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f9421a;
    public final nld b;
    public final q9k0 c;
    public final lz40 d;
    public final qpb e;
    public final qpb f;
    public final lrc g;
    public final tld h;
    public iet j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public dy40 p;
    public boolean q;
    public boolean r;
    public ey40 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final skx n = new skx();
    public final ArrayList s = new ArrayList();
    public final skx t = new skx();
    public bh90 u = bh90.g;
    public final skx x = new skx();
    public int z = -1;

    public fet(v0 v0Var, nld nldVar, q9k0 q9k0Var, lz40 lz40Var, qpb qpbVar, qpb qpbVar2, lrc lrcVar, tld tldVar) {
        this.f9421a = v0Var;
        this.b = nldVar;
        this.c = q9k0Var;
        this.d = lz40Var;
        this.e = qpbVar;
        this.f = qpbVar2;
        this.g = lrcVar;
        this.h = tldVar;
        this.C = nldVar.g() || nldVar.e();
        this.D = new eet(this, (byte) 0);
        this.E = new ArrayList();
        p9k0 p9k0VarG = q9k0Var.g();
        p9k0VarG.c();
        this.G = p9k0VarG;
        q9k0 q9k0Var2 = new q9k0();
        if (nldVar.g()) {
            q9k0Var2.c();
        }
        if (nldVar.e()) {
            q9k0Var2.k = new ey40();
        }
        this.H = q9k0Var2;
        t9k0 t9k0VarH = q9k0Var2.h();
        t9k0VarH.e(true);
        this.I = t9k0VarH;
        this.M = new vkd(this, qpbVar);
        p9k0 p9k0VarG2 = this.H.g();
        try {
            bet betVarA = p9k0VarG2.a(0);
            p9k0VarG2.c();
            this.N = betVarA;
            this.O = new uiq();
            this.Q = new rld(this);
            CoroutineContext coroutineContextK = nldVar.k();
            CoroutineContext coroutineContextC = C();
            this.R = coroutineContextK.plus(coroutineContextC == null ? kotlin.coroutines.g.f46065a : coroutineContextC);
        } catch (Throwable th) {
            p9k0VarG2.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final mu40 R(int i, fet fetVar) {
        ArrayList arrayList;
        int i2 = fetVar.G.i(i);
        p9k0 p9k0Var = fetVar.G;
        Object objP = p9k0Var.p(p9k0Var.b, i);
        if (i2 != 126665345 || !(objP instanceof ju40)) {
            return null;
        }
        if (fetVar.G.d(i)) {
            ArrayList arrayList2 = new ArrayList();
            S(i, fetVar, arrayList2);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        p9k0 p9k0Var2 = fetVar.G;
        Object objP2 = p9k0Var2.p(p9k0Var2.b, i);
        objP2.getClass();
        ju40 ju40Var = (ju40) objP2;
        Object objH = fetVar.G.h(i, 0);
        bet betVarA = fetVar.G.a(i);
        int i3 = fetVar.G.b[(i * 5) + 3] + i;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = fetVar.s;
        int iN = cwr0.N(i, arrayList4);
        if (iN < 0) {
            iN = -(iN + 1);
        }
        while (iN < arrayList4.size()) {
            fox foxVar = (fox) arrayList4.get(iN);
            if (foxVar.b >= i3) {
                break;
            }
            arrayList3.add(new Pair(foxVar.f9905a, foxVar.c));
            iN++;
        }
        return new mu40(ju40Var, objH, fetVar.h, fetVar.c, betVarA, arrayList3, fetVar.n(i), arrayList);
    }

    public static final void S(int i, fet fetVar, ArrayList arrayList) {
        int i2 = fetVar.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (fetVar.G.j(i3)) {
                mu40 mu40VarR = R(i3, fetVar);
                if (mu40VarR != null) {
                    arrayList.add(mu40VarR);
                }
            } else if (fetVar.G.d(i3)) {
                S(i3, fetVar, arrayList);
            }
            i3 += fetVar.G.b[(i3 * 5) + 3];
        }
    }

    public static final int T(fet fetVar, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i6;
        p9k0 p9k0Var = fetVar.G;
        int i7 = 0;
        if (p9k0Var.j(i2)) {
            int i8 = p9k0Var.i(i2);
            Object objP = p9k0Var.p(p9k0Var.b, i2);
            if (i8 == 126665345 && (objP instanceof ju40)) {
                mu40 mu40VarR = R(i2, fetVar);
                if (mu40VarR != null) {
                    fetVar.b.c(mu40VarR);
                    fetVar.M.e();
                    vkd vkdVar = fetVar.M;
                    tld tldVar = fetVar.h;
                    nld nldVar = fetVar.b;
                    a180 a180Var = vkdVar.b.f29108a;
                    a180Var.c0(a080.d);
                    c9x.N(a180Var, tldVar, nldVar, mu40VarR);
                }
                if (!z || i2 == i) {
                    return p9k0Var.o(i2);
                }
                vkd vkdVar2 = fetVar.M;
                vkdVar2.c();
                vkdVar2.b();
                fet fetVar2 = vkdVar2.f37566a;
                int iO = fetVar2.G.l(i2) ? 1 : fetVar2.G.o(i2);
                if (iO > 0) {
                    vkdVar2.f(i3, iO);
                }
                return 0;
            }
            if (i8 == 206 && Intrinsics.d(objP, ykd.e)) {
                Object objH = p9k0Var.h(i2, 0);
                jet jetVar = objH instanceof jet ? (jet) objH : null;
                jff0 jff0Var = jetVar != null ? jetVar.f16392a : null;
                det detVar = jff0Var instanceof det ? (det) jff0Var : null;
                if (detVar != null) {
                    iz40 iz40Var = detVar.f5966a.e;
                    Object[] objArr3 = iz40Var.b;
                    long[] jArr2 = iz40Var.f15620a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr2[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        fet fetVar3 = (fet) objArr3[(i9 << 3) + i12];
                                        q9k0 q9k0Var = fetVar3.c;
                                        if (q9k0Var.b <= 0 || (q9k0Var.f28352a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i6 = i7;
                                        } else {
                                            tld tldVar2 = fetVar3.h;
                                            synchronized (tldVar2.d) {
                                                tldVar2.u();
                                                hz40 hz40Var = tldVar2.n;
                                                tldVar2.n = e9x.J();
                                                try {
                                                    tldVar2.v.l0(hz40Var);
                                                } catch (Throwable th) {
                                                    tldVar2.n = hz40Var;
                                                    throw th;
                                                }
                                            }
                                            qpb qpbVar = new qpb();
                                            fetVar3.L = qpbVar;
                                            p9k0 p9k0VarG = fetVar3.c.g();
                                            try {
                                                fetVar3.G = p9k0VarG;
                                                vkd vkdVar3 = fetVar3.M;
                                                qpb qpbVar2 = vkdVar3.b;
                                                try {
                                                    vkdVar3.b = qpbVar;
                                                    fetVar3.Q(0);
                                                    vkd vkdVar4 = fetVar3.M;
                                                    vkdVar4.b();
                                                    if (vkdVar4.c) {
                                                        objArr2 = objArr3;
                                                        vkdVar4.b.f29108a.c0(h080.d);
                                                        if (vkdVar4.c) {
                                                            vkdVar4.d(false);
                                                            vkdVar4.d(false);
                                                            vkdVar4.b.f29108a.c0(qz70.d);
                                                            i6 = 0;
                                                            vkdVar4.c = false;
                                                        }
                                                        vkdVar3.b = qpbVar2;
                                                        p9k0VarG.c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                    vkdVar3.b = qpbVar2;
                                                    p9k0VarG.c();
                                                } catch (Throwable th2) {
                                                    vkdVar3.b = qpbVar2;
                                                    throw th2;
                                                }
                                            } catch (Throwable th3) {
                                                p9k0VarG.c();
                                                throw th3;
                                            }
                                        }
                                        fetVar.b.u(fetVar3.h);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i6 = i7;
                                        i10 = i10;
                                    }
                                    j >>= i10;
                                    i12++;
                                    i10 = i10;
                                    objArr3 = objArr2;
                                    i7 = i6;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i5 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            objArr3 = objArr;
                            i7 = i5;
                            jArr2 = jArr;
                        }
                    }
                }
                return p9k0Var.o(i2);
            }
            i4 = 1;
            if (!p9k0Var.l(i2)) {
                return p9k0Var.o(i2);
            }
        } else {
            i4 = 1;
            if (p9k0Var.d(i2)) {
                int i13 = p9k0Var.b[(i2 * 5) + 3] + i2;
                int iT = 0;
                for (int i14 = i2 + 1; i14 < i13; i14 += p9k0Var.b[(i14 * 5) + 3]) {
                    boolean zL = p9k0Var.l(i14);
                    if (zL) {
                        fetVar.M.c();
                        vkd vkdVar5 = fetVar.M;
                        Object objN = p9k0Var.n(i14);
                        vkdVar5.c();
                        vkdVar5.h.add(objN);
                    }
                    iT += T(fetVar, i, i14, zL || z, zL ? 0 : i3 + iT);
                    if (zL) {
                        fetVar.M.c();
                        fetVar.M.a();
                    }
                }
                if (!p9k0Var.l(i2)) {
                    return iT;
                }
            } else if (!p9k0Var.l(i2)) {
                return p9k0Var.o(i2);
            }
        }
        return i4;
    }

    public final yfe0 A() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (yfe0) dw9.l(1, arrayList);
    }

    public final boolean B() {
        if (!D() || this.w) {
            return true;
        }
        yfe0 yfe0VarA = A();
        return (yfe0VarA == null || (yfe0VarA.b & 4) == 0) ? false : true;
    }

    public final rld C() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        yfe0 yfe0VarA;
        return (this.S || this.y || this.w || (yfe0VarA = A()) == null || (yfe0VarA.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x012e A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a3, B:84:0x020b, B:28:0x00b3, B:29:0x00b6, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b7, B:32:0x00bd, B:35:0x00c7, B:38:0x00d1, B:40:0x00d5, B:41:0x00da, B:45:0x00e4, B:47:0x00f1, B:53:0x0111, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:83:0x0208, B:112:0x025c, B:113:0x025f, B:64:0x014f, B:115:0x0261, B:116:0x0264, B:52:0x010f, B:48:0x00ff, B:44:0x00df, B:117:0x0265, B:54:0x011e), top: B:136:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a3, B:84:0x020b, B:28:0x00b3, B:29:0x00b6, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b7, B:32:0x00bd, B:35:0x00c7, B:38:0x00d1, B:40:0x00d5, B:41:0x00da, B:45:0x00e4, B:47:0x00f1, B:53:0x0111, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:83:0x0208, B:112:0x025c, B:113:0x025f, B:64:0x014f, B:115:0x0261, B:116:0x0264, B:52:0x010f, B:48:0x00ff, B:44:0x00df, B:117:0x0265, B:54:0x011e), top: B:136:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f A[Catch: all -> 0x00ad, TryCatch #7 {all -> 0x00ad, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a3, B:84:0x020b, B:28:0x00b3, B:29:0x00b6, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b7, B:32:0x00bd, B:35:0x00c7, B:38:0x00d1, B:40:0x00d5, B:41:0x00da, B:45:0x00e4, B:47:0x00f1, B:53:0x0111, B:55:0x0125, B:57:0x012e, B:59:0x0139, B:61:0x014a, B:66:0x0162, B:83:0x0208, B:112:0x025c, B:113:0x025f, B:64:0x014f, B:115:0x0261, B:116:0x0264, B:52:0x010f, B:48:0x00ff, B:44:0x00df, B:117:0x0265, B:54:0x011e), top: B:136:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6 A[Catch: all -> 0x021e, TRY_LEAVE, TryCatch #13 {all -> 0x021e, blocks: (B:79:0x01e9, B:81:0x01f6, B:104:0x024a, B:105:0x024c), top: B:147:0x01e9 }] */
    public final void E(ArrayList arrayList) {
        lu40 lu40Var;
        bet betVar;
        bet betVarJ;
        ArrayList arrayList2;
        p9k0 p9k0VarG;
        p9k0 p9k0VarG2;
        p9k0 p9k0Var;
        p9k0 p9k0Var2;
        int[] iArr;
        ey40 ey40Var;
        ey40 ey40Var2;
        int[] iArr2;
        qpb qpbVar;
        qpb qpbVar2;
        qpb qpbVar3;
        boolean z;
        boolean z2;
        qpb qpbVar4;
        q9k0 q9k0Var;
        p9k0 p9k0Var3;
        fet fetVar = this;
        nld nldVar = fetVar.b;
        qpb qpbVar5 = fetVar.f;
        vkd vkdVar = fetVar.M;
        qpb qpbVar6 = vkdVar.b;
        try {
            vkdVar.b = qpbVar5;
            qpbVar5.f29108a.c0(f080.d);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair pair = (Pair) arrayList.get(i2);
                mu40 mu40Var = (mu40) pair.f46059a;
                mu40 mu40Var2 = (mu40) pair.b;
                bet betVarJ2 = obc.J(mu40Var.e);
                q9k0 q9k0VarA = s9k0.a(mu40Var.d);
                int iB = q9k0VarA.b(betVarJ2);
                nkx nkxVar = new nkx();
                vkdVar.b();
                a180 a180Var = vkdVar.b.f29108a;
                a180Var.c0(nz70.d);
                c9x.M(a180Var, i, nkxVar, 1, betVarJ2);
                if (mu40Var2 == null) {
                    if (q9k0VarA == fetVar.H) {
                        if (!fetVar.I.w) {
                            ykd.a("Check failed");
                        }
                        fetVar.y();
                    }
                    p9k0 p9k0VarG3 = q9k0VarA.g();
                    try {
                        p9k0VarG3.r(iB);
                        vkdVar.f = iB;
                        qpb qpbVar7 = new qpb();
                        mr0 mr0Var = new mr0(fetVar, qpbVar7, p9k0VarG3, mu40Var, (byte) 15);
                        p9k0Var3 = p9k0VarG3;
                        try {
                            fetVar = this;
                            fetVar.K(null, null, null, iun.f15405a, mr0Var);
                            qpb qpbVar8 = vkdVar.b;
                            qpbVar8.getClass();
                            if (!qpbVar7.f29108a.b0()) {
                                a180 a180Var2 = qpbVar8.f29108a;
                                a180Var2.c0(jz70.d);
                                c9x.M(a180Var2, i, qpbVar7, 1, nkxVar);
                            }
                            p9k0Var3.c();
                            nldVar = nldVar;
                        } catch (Throwable th) {
                            th = th;
                            p9k0Var3.c();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        p9k0Var3 = p9k0VarG3;
                    }
                } else {
                    lu40 lu40VarP = nldVar.p(mu40Var2);
                    q9k0 q9k0VarA2 = lu40VarP != null ? s9k0.a(lu40VarP.f20657a) : null;
                    q9k0 q9k0VarA3 = q9k0VarA2 == null ? s9k0.a(mu40Var2.d) : q9k0VarA2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (q9k0VarA2 != null) {
                                                                    if (q9k0VarA2.g) {
                                                                        ykd.a("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (q9k0VarA2.b <= 0) {
                                                                        dsb0.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList arrayList3 = q9k0VarA2.i;
                                                                    lu40Var = lu40VarP;
                                                                    int iC = s9k0.c(arrayList3, 0, q9k0VarA2.b);
                                                                    if (iC < 0) {
                                                                        betVar = new bet(0);
                                                                        arrayList3.add(-(iC + 1), betVar);
                                                                    } else {
                                                                        betVar = (bet) arrayList3.get(iC);
                                                                    }
                                                                    if (betVar != null) {
                                                                    }
                                                                    betVarJ = obc.J(betVar);
                                                                    arrayList2 = new ArrayList();
                                                                    p9k0VarG = q9k0VarA3.g();
                                                                    cwr0.M(p9k0VarG, arrayList2, q9k0VarA3.b(betVarJ));
                                                                    p9k0VarG.c();
                                                                    if (arrayList2.isEmpty()) {
                                                                        betVarJ = betVarJ;
                                                                    } else {
                                                                        qpbVar4 = vkdVar.b;
                                                                        qpbVar4.getClass();
                                                                        if (!arrayList2.isEmpty()) {
                                                                            a180 a180Var3 = qpbVar4.f29108a;
                                                                            a180Var3.c0(kz70.d);
                                                                            c9x.M(a180Var3, 1, arrayList2, 0, nkxVar);
                                                                        }
                                                                        q9k0Var = fetVar.c;
                                                                        if (q9k0VarA != q9k0Var) {
                                                                            int iB2 = q9k0Var.b(betVarJ2);
                                                                            fetVar.m0(iB2, fetVar.q0(iB2) + arrayList2.size());
                                                                        }
                                                                    }
                                                                    a180 a180Var4 = vkdVar.b.f29108a;
                                                                    a180Var4.c0(lz70.d);
                                                                    int i3 = a180Var4.f - a180Var4.f60a[a180Var4.b - 1].c;
                                                                    Object[] objArr = a180Var4.e;
                                                                    objArr[i3] = lu40Var;
                                                                    objArr[i3 + 1] = nldVar;
                                                                    objArr[i3 + 3] = mu40Var;
                                                                    objArr[i3 + 2] = mu40Var2;
                                                                    p9k0VarG2 = q9k0VarA3.g();
                                                                    p9k0Var2 = fetVar.G;
                                                                    iArr = fetVar.o;
                                                                    ey40Var = fetVar.v;
                                                                    fetVar.o = null;
                                                                    fetVar.v = null;
                                                                    fetVar.G = p9k0VarG2;
                                                                    int iB3 = q9k0VarA3.b(obc.J(betVarJ));
                                                                    p9k0VarG2.r(iB3);
                                                                    vkdVar.f = iB3;
                                                                    qpbVar = new qpb();
                                                                    qpbVar2 = vkdVar.b;
                                                                    vkdVar.b = qpbVar;
                                                                    z = vkdVar.e;
                                                                    vkdVar.e = false;
                                                                    tld tldVar = mu40Var2.c;
                                                                    tld tldVar2 = mu40Var.c;
                                                                    Integer numValueOf = Integer.valueOf(p9k0VarG2.g);
                                                                    p9k0Var = p9k0VarG2;
                                                                    iArr2 = iArr;
                                                                    ey40Var2 = ey40Var;
                                                                    z2 = z;
                                                                    qpbVar3 = qpbVar2;
                                                                    fetVar.K(tldVar, tldVar2, numValueOf, mu40Var2.f, new gmo(fetVar, mu40Var, (byte) 27));
                                                                    vkdVar.e = z2;
                                                                    vkdVar.b = qpbVar3;
                                                                    qpbVar3.getClass();
                                                                    if (!qpbVar.f29108a.b0()) {
                                                                        a180 a180Var5 = qpbVar3.f29108a;
                                                                        a180Var5.c0(jz70.d);
                                                                        c9x.M(a180Var5, 0, qpbVar, 1, nkxVar);
                                                                    }
                                                                    fetVar.G = p9k0Var2;
                                                                    fetVar.o = iArr2;
                                                                    fetVar.v = ey40Var2;
                                                                    p9k0Var.c();
                                                                } else {
                                                                    lu40Var = lu40VarP;
                                                                    nldVar = nldVar;
                                                                }
                                                                fetVar.G = p9k0Var2;
                                                                fetVar.o = iArr2;
                                                                fetVar.v = ey40Var2;
                                                                p9k0Var.c();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                p9k0Var.c();
                                                                throw th;
                                                            }
                                                            vkdVar.b = qpbVar3;
                                                            qpbVar3.getClass();
                                                            if (!qpbVar.f29108a.b0()) {
                                                                a180 a180Var6 = qpbVar3.f29108a;
                                                                a180Var6.c0(jz70.d);
                                                                c9x.M(a180Var6, 0, qpbVar, 1, nkxVar);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            fetVar.G = p9k0Var2;
                                                            fetVar.o = iArr2;
                                                            fetVar.v = ey40Var2;
                                                            throw th;
                                                        }
                                                        vkdVar.e = z2;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        vkdVar.b = qpbVar3;
                                                        throw th;
                                                    }
                                                    fetVar.K(tldVar, tldVar2, numValueOf, mu40Var2.f, new gmo(fetVar, mu40Var, (byte) 27));
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    vkdVar.e = z2;
                                                    throw th;
                                                }
                                                p9k0Var = p9k0VarG2;
                                                iArr2 = iArr;
                                                ey40Var2 = ey40Var;
                                                z2 = z;
                                                qpbVar3 = qpbVar2;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                qpbVar3 = qpbVar2;
                                                p9k0Var = p9k0VarG2;
                                                iArr2 = iArr;
                                                ey40Var2 = ey40Var;
                                                z2 = z;
                                            }
                                            tld tldVar3 = mu40Var.c;
                                            Integer numValueOf2 = Integer.valueOf(p9k0VarG2.g);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            qpbVar3 = qpbVar2;
                                            z2 = z;
                                            p9k0Var = p9k0VarG2;
                                            iArr2 = iArr;
                                            ey40Var2 = ey40Var;
                                        }
                                        vkdVar.e = false;
                                        tld tldVar4 = mu40Var2.c;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        ey40Var2 = ey40Var;
                                        qpbVar3 = qpbVar2;
                                        z2 = z;
                                        p9k0Var = p9k0VarG2;
                                        iArr2 = iArr;
                                    }
                                    vkdVar.b = qpbVar;
                                    z = vkdVar.e;
                                } catch (Throwable th10) {
                                    th = th10;
                                    ey40Var2 = ey40Var;
                                    qpbVar3 = qpbVar2;
                                    p9k0Var = p9k0VarG2;
                                    iArr2 = iArr;
                                }
                                fetVar.G = p9k0VarG2;
                                int iB4 = q9k0VarA3.b(obc.J(betVarJ));
                                p9k0VarG2.r(iB4);
                                vkdVar.f = iB4;
                                qpbVar = new qpb();
                                qpbVar2 = vkdVar.b;
                            } catch (Throwable th11) {
                                th = th11;
                                ey40Var2 = ey40Var;
                                p9k0Var = p9k0VarG2;
                                iArr2 = iArr;
                            }
                            p9k0Var2 = fetVar.G;
                            iArr = fetVar.o;
                            ey40Var = fetVar.v;
                            fetVar.o = null;
                            fetVar.v = null;
                        } catch (Throwable th12) {
                            th = th12;
                            p9k0Var = p9k0VarG2;
                        }
                        cwr0.M(p9k0VarG, arrayList2, q9k0VarA3.b(betVarJ));
                        p9k0VarG.c();
                        if (arrayList2.isEmpty()) {
                            qpbVar4 = vkdVar.b;
                            qpbVar4.getClass();
                            if (!arrayList2.isEmpty()) {
                                a180 a180Var7 = qpbVar4.f29108a;
                                a180Var7.c0(kz70.d);
                                c9x.M(a180Var7, 1, arrayList2, 0, nkxVar);
                            }
                            q9k0Var = fetVar.c;
                            if (q9k0VarA != q9k0Var) {
                                int iB5 = q9k0Var.b(betVarJ2);
                                fetVar.m0(iB5, fetVar.q0(iB5) + arrayList2.size());
                            }
                        } else {
                            betVarJ = betVarJ;
                        }
                        a180 a180Var8 = vkdVar.b.f29108a;
                        a180Var8.c0(lz70.d);
                        int i4 = a180Var8.f - a180Var8.f60a[a180Var8.b - 1].c;
                        Object[] objArr2 = a180Var8.e;
                        objArr2[i4] = lu40Var;
                        objArr2[i4 + 1] = nldVar;
                        objArr2[i4 + 3] = mu40Var;
                        objArr2[i4 + 2] = mu40Var2;
                        p9k0VarG2 = q9k0VarA3.g();
                    } catch (Throwable th13) {
                        p9k0VarG.c();
                        throw th13;
                    }
                    betVar = mu40Var2.e;
                    betVarJ = obc.J(betVar);
                    arrayList2 = new ArrayList();
                    p9k0VarG = q9k0VarA3.g();
                }
                vkdVar.b.f29108a.c0(h080.d);
                i2++;
                size = size;
                nldVar = nldVar;
                i = 0;
            }
            vkdVar.b();
            vkdVar.b.f29108a.c0(rz70.d);
            vkdVar.f = 0;
            vkdVar.b = qpbVar6;
        } catch (Throwable th14) {
            vkdVar.b = qpbVar6;
            throw th14;
        }
    }

    public final void F(ju40 ju40Var, bh90 bh90Var, Object obj, boolean z) {
        b0(126665345, ju40Var);
        H();
        p0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                t9k0.y(this.I);
            }
            boolean z2 = (this.S || Intrinsics.d(this.G.f(), bh90Var)) ? false : true;
            if (z2) {
                N(bh90Var);
            }
            Y(ykd.c, Response.ACCEPTED, 0, bh90Var);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                ahb.S(this, new ugd(-59194059, true, new sjs(ju40Var, obj, (byte) 3)));
                this.w = z3;
            } else {
                this.J = true;
                t9k0 t9k0Var = this.I;
                this.b.m(new mu40(ju40Var, obj, this.h, this.H, t9k0Var.b(t9k0Var.F(t9k0Var.b, t9k0Var.v)), iun.f15405a, m(), null));
            }
            r(false);
            this.K = null;
            this.T = j;
            r(false);
        } catch (Throwable th) {
            try {
                sac.t0(th, new cet(this, (byte) 1));
                throw th;
            } catch (Throwable th2) {
                r(false);
                this.K = null;
                this.T = j;
                r(false);
                throw th2;
            }
        }
    }

    public final Object G(Integer num, Object obj) {
        p9k0 p9k0Var = this.G;
        int i = p9k0Var.g;
        Object objP = cwr0.P(i < p9k0Var.h ? p9k0Var.p(p9k0Var.b, i) : null, num, obj);
        return objP == null ? new sby(num, obj) : objP;
    }

    public final Object H() {
        boolean z = this.S;
        cl5 cl5Var = ukd.f35823a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof tag0)) {
                return objM;
            }
        } else if (this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected");
            return cl5Var;
        }
        return cl5Var;
    }

    public final List I() {
        nld nldVar = this.b;
        mld mldVarI = nldVar.i();
        tld tldVar = mldVarI != null ? (tld) mldVarI : null;
        if (tldVar == null) {
            return iun.f15405a;
        }
        q9k0 q9k0Var = tldVar.f;
        p9k0 p9k0VarG = s9k0.a(q9k0Var).g();
        try {
            Integer numT = aac.T(p9k0VarG, nldVar, 0, p9k0VarG.c);
            p9k0VarG.c();
            if (numT == null) {
                return iun.f15405a;
            }
            p9k0 p9k0VarG2 = s9k0.a(q9k0Var).g();
            try {
                return CollectionsKt.q0(aac.i0(p9k0VarG2, numT.intValue(), 0), tldVar.v.I());
            } finally {
                p9k0VarG2.c();
            }
        } catch (Throwable th) {
            p9k0VarG.c();
            throw th;
        }
    }

    public final int J(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object K(tld tldVar, tld tldVar2, Integer num, List list, Function0 function0) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                yfe0 yfe0Var = (yfe0) pair.f46059a;
                Object obj = pair.b;
                if (obj != null) {
                    k0(yfe0Var, obj);
                } else {
                    k0(yfe0Var, null);
                }
            }
            if (tldVar == null) {
                objInvoke = function0.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (tldVar2 == null || tldVar2 == tldVar || iIntValue < 0) {
                    objInvoke = function0.invoke();
                } else {
                    tldVar.r = tldVar2;
                    tldVar.s = iIntValue;
                    try {
                        objInvoke = function0.invoke();
                        tldVar.r = null;
                        tldVar.s = 0;
                    } catch (Throwable th) {
                        tldVar.r = null;
                        tldVar.s = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = function0.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fet.L():void");
    }

    public final void M() {
        Q(this.G.g);
        vkd vkdVar = this.M;
        vkdVar.d(false);
        vkdVar.e();
        vkdVar.b.f29108a.c0(d080.d);
        int i = vkdVar.f;
        p9k0 p9k0Var = vkdVar.f37566a.G;
        vkdVar.f = p9k0Var.b[(p9k0Var.g * 5) + 3] + i;
    }

    public final void N(bh90 bh90Var) {
        ey40 ey40Var = this.v;
        if (ey40Var == null) {
            ey40Var = new ey40();
            this.v = ey40Var;
        }
        ey40Var.j(this.G.g, bh90Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void O(int i, int i2, int i3) {
        p9k0 p9k0Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (p9k0Var.q(i) == i2) {
                i3 = i2;
            } else if (p9k0Var.q(i2) == i) {
                i3 = i;
            } else if (p9k0Var.q(i) == p9k0Var.q(i2)) {
                i3 = p9k0Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = p9k0Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = p9k0Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = p9k0Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = p9k0Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = p9k0Var.q(iQ5)) {
                    i3 = p9k0Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (p9k0Var.l(i)) {
                this.M.a();
            }
            i = p9k0Var.q(i);
        }
        q(i2, i3);
    }

    public final Object P() {
        boolean z = this.S;
        cl5 cl5Var = ukd.f35823a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof tag0)) {
                return objM instanceof jet ? ((jet) objM).f16392a : objM;
            }
        } else if (this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected");
            return cl5Var;
        }
        return cl5Var;
    }

    public final void Q(int i) {
        boolean zL = this.G.l(i);
        vkd vkdVar = this.M;
        if (zL) {
            vkdVar.c();
            Object objN = this.G.n(i);
            vkdVar.c();
            vkdVar.h.add(objN);
        }
        T(this, i, i, zL, 0);
        vkdVar.c();
        if (zL) {
            vkdVar.a();
        }
    }

    public final boolean U(int i, boolean z) {
        yfe0 yfe0VarA;
        if ((i & 1) == 0 && (this.S || this.y)) {
            isj0 isj0Var = this.P;
            if (isj0Var != null && (yfe0VarA = A()) != null && isj0Var.g()) {
                int i2 = yfe0VarA.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                yfe0VarA.b = i3;
                yfe0VarA.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                a180 a180Var = this.M.b.f29108a;
                a180Var.c0(c080.d);
                c9x.L(a180Var, 0, yfe0VarA);
                this.b.t(yfe0VarA);
                return false;
            }
        } else if (!z && D()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void V() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        p9k0 p9k0Var = this.G;
        int iG = p9k0Var.g();
        int[] iArr = p9k0Var.b;
        int i = p9k0Var.g;
        Object objP = i < p9k0Var.h ? p9k0Var.p(iArr, i) : null;
        Object objF = p9k0Var.f();
        int i2 = this.m;
        cl5 cl5Var = ukd.f35823a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(cl5Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            d0(null, (iArr[(p9k0Var.g * 5) + 1] & 1073741824) != 0);
            L();
            p9k0Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(cl5Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        d0(null, (iArr[(p9k0Var.g * 5) + 1] & 1073741824) != 0);
        L();
        p9k0Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void W() {
        p9k0 p9k0Var = this.G;
        int i = p9k0Var.i;
        this.l = i >= 0 ? p9k0Var.b[(i * 5) + 1] & 67108863 : 0;
        p9k0Var.t();
    }

    public final void X() {
        if (this.l != 0) {
            ykd.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        yfe0 yfe0VarA = A();
        if (yfe0VarA != null) {
            int i = yfe0VarA.b;
            if ((i & 128) == 0) {
                yfe0VarA.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            W();
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x0315  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:174:0x0328  */
    /* JADX WARN: Code duplicated, block: B:176:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x032d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0359  */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197  */
    public final void Y(Object obj, int i, int i2, Object obj2) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        iet ietVar;
        iet ietVar2;
        ArrayList arrayList;
        ey40 ey40Var;
        int i3;
        Object objValueOf;
        hz40 hz40Var;
        Object objG;
        vy40 vy40Var;
        t9k0 t9k0Var;
        int i4;
        Object obj3;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        p9k0 p9k0Var;
        int[] iArr;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        p9k0 p9k0Var2;
        int i12;
        Object objP;
        t9k0 t9k0Var2;
        int i13;
        iet ietVar3;
        Object obj4 = obj;
        if (this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.m;
        Object obj5 = ukd.f35823a;
        if (obj4 == null) {
            if (obj2 == null || i != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i14);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i14);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                t9k0Var2 = this.I;
                i13 = t9k0Var2.t;
                if (z) {
                    t9k0Var2.R(i, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    t9k0Var2.R(i, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    t9k0Var2.R(i, obj4, false, obj5);
                }
                ietVar3 = this.j;
                if (ietVar3 != null) {
                    int i15 = (-2) - i13;
                    jky jkyVar = new jky(-1, i, i15, -1);
                    ietVar3.e.j(i15, new xgv(-1, this.k - ietVar3.b, 0));
                    ietVar3.d.add(jkyVar);
                }
                x(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    p9k0Var2 = this.G;
                    i12 = p9k0Var2.g;
                    if (i12 < p9k0Var2.h) {
                        objP = p9k0Var2.p(p9k0Var2.b, i12);
                    } else {
                        objP = null;
                    }
                    if (Intrinsics.d(obj4, objP)) {
                        d0(obj2, z);
                        z3 = z2;
                    }
                }
                p9k0Var = this.G;
                iArr = p9k0Var.b;
                arrayList2 = new ArrayList();
                if (p9k0Var.k <= 0) {
                    i9 = p9k0Var.g;
                    while (i9 < p9k0Var.h) {
                        int i16 = i9 * 5;
                        int i17 = iArr[i16];
                        Object objP2 = p9k0Var.p(iArr, i9);
                        i10 = iArr[i16 + 1];
                        if ((i10 & 1073741824) != 0) {
                            i11 = 1;
                        } else {
                            i11 = i10 & 67108863;
                        }
                        arrayList2.add(new jky(objP2, i17, i9, i11));
                        i9 += iArr[i16 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new iet(arrayList2, this.k);
            } else {
                z3 = z2;
            }
            ietVar = this.j;
            if (ietVar != null) {
                arrayList = ietVar.d;
                ey40Var = ietVar.e;
                i3 = ietVar.b;
                if (obj4 != null) {
                    objValueOf = new sby(Integer.valueOf(i), obj4);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                hz40Var = ((fx40) ietVar.f.getValue()).f10291a;
                objG = hz40Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof vy40) {
                    vy40Var = (vy40) objG;
                    Object objL = vy40Var.l(0);
                    if (vy40Var.i()) {
                        hz40Var.l(objValueOf);
                    }
                    if (vy40Var.b == 1) {
                        hz40Var.n(objValueOf, vy40Var.f());
                    }
                    objG = objL;
                } else {
                    hz40Var.l(objValueOf);
                }
                jky jkyVar2 = (jky) objG;
                if (!z3 || jkyVar2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        t9k0 t9k0VarH = this.H.h();
                        this.I = t9k0VarH;
                        t9k0VarH.N();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    t9k0Var = this.I;
                    int i18 = t9k0Var.t;
                    if (z) {
                        t9k0Var.R(i, obj5, true, obj5);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i4 = 0;
                        t9k0Var.R(i, obj5, false, obj2);
                    } else {
                        i4 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        t9k0Var.R(i, obj3, false, obj5);
                    }
                    this.N = this.I.b(i18);
                    int i19 = (-2) - i18;
                    jky jkyVar3 = new jky(-1, i, i19, -1);
                    ey40Var.j(i19, new xgv(-1, this.k - i3, i4));
                    arrayList.add(jkyVar3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    ietVar2 = new iet(arrayList3, i5);
                } else {
                    int i20 = jkyVar2.c;
                    arrayList.add(jkyVar2);
                    xgv xgvVar = (xgv) ey40Var.b(i20);
                    this.k = (xgvVar != null ? xgvVar.b : -1) + i3;
                    xgv xgvVar2 = (xgv) ey40Var.b(i20);
                    int i21 = xgvVar2 != null ? xgvVar2.f40857a : -1;
                    int i22 = ietVar.c;
                    int i23 = i21 - i22;
                    int i24 = 8;
                    if (i21 <= i22) {
                        i6 = i23;
                        if (i22 > i21) {
                            Object[] objArr3 = ey40Var.c;
                            long[] jArr = ey40Var.f11466a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                xgv xgvVar3 = (xgv) objArr3[(i25 << 3) + i27];
                                                int i28 = xgvVar3.f40857a;
                                                if (i28 == i21) {
                                                    xgvVar3.f40857a = i22;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i21 + 1 <= i28 && i28 < i22) {
                                                        xgvVar3.f40857a = i28 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i27++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = ey40Var.c;
                        long[] jArr2 = ey40Var.f11466a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j2 = jArr2[i29];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j2 & 255) < 128) {
                                            i8 = i24;
                                            xgv xgvVar4 = (xgv) objArr4[(i29 << 3) + i31];
                                            i7 = i23;
                                            int i32 = xgvVar4.f40857a;
                                            if (i32 == i21) {
                                                xgvVar4.f40857a = i22;
                                            } else if (i22 <= i32 && i32 < i21) {
                                                xgvVar4.f40857a = i32 + 1;
                                            }
                                        } else {
                                            i7 = i23;
                                            i8 = i24;
                                        }
                                        j2 >>= i8;
                                        i31++;
                                        i23 = i7;
                                        i24 = i8;
                                    }
                                    i6 = i23;
                                    if (i30 != i24) {
                                        break;
                                    }
                                } else {
                                    i6 = i23;
                                }
                                if (i29 == length2) {
                                    break;
                                }
                                i29++;
                                i23 = i6;
                                i24 = 8;
                            }
                        } else {
                            i6 = i23;
                        }
                    }
                    vkd vkdVar = this.M;
                    vkdVar.f = (i20 - vkdVar.f37566a.G.g) + vkdVar.f;
                    this.G.r(i20);
                    if (i6 > 0) {
                        vkdVar.d(false);
                        vkdVar.e();
                        a180 a180Var = vkdVar.b.f29108a;
                        a180Var.c0(yz70.d);
                        a180Var.c[a180Var.d - a180Var.f60a[a180Var.b - 1].b] = i6;
                    }
                    d0(obj2, z);
                    ietVar2 = null;
                }
            } else {
                ietVar2 = null;
            }
            x(z, ietVar2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        this.T = jRotateLeft;
        if (obj4 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            t9k0Var2 = this.I;
            i13 = t9k0Var2.t;
            if (z) {
                t9k0Var2.R(i, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                t9k0Var2.R(i, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                t9k0Var2.R(i, obj4, false, obj5);
            }
            ietVar3 = this.j;
            if (ietVar3 != null) {
                int i110 = (-2) - i13;
                jky jkyVar4 = new jky(-1, i, i110, -1);
                ietVar3.e.j(i110, new xgv(-1, this.k - ietVar3.b, 0));
                ietVar3.d.add(jkyVar4);
            }
            x(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                p9k0Var2 = this.G;
                i12 = p9k0Var2.g;
                if (i12 < p9k0Var2.h) {
                    objP = p9k0Var2.p(p9k0Var2.b, i12);
                } else {
                    objP = null;
                }
                if (Intrinsics.d(obj4, objP)) {
                    d0(obj2, z);
                    z3 = z2;
                }
            }
            p9k0Var = this.G;
            iArr = p9k0Var.b;
            arrayList2 = new ArrayList();
            if (p9k0Var.k <= 0) {
                i9 = p9k0Var.g;
                while (i9 < p9k0Var.h) {
                    int i111 = i9 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = p9k0Var.p(iArr, i9);
                    i10 = iArr[i111 + 1];
                    if ((i10 & 1073741824) != 0) {
                        i11 = 1;
                    } else {
                        i11 = i10 & 67108863;
                    }
                    arrayList2.add(new jky(objP3, i112, i9, i11));
                    i9 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new iet(arrayList2, this.k);
        } else {
            z3 = z2;
        }
        ietVar = this.j;
        if (ietVar != null) {
            arrayList = ietVar.d;
            ey40Var = ietVar.e;
            i3 = ietVar.b;
            if (obj4 != null) {
                objValueOf = new sby(Integer.valueOf(i), obj4);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            hz40Var = ((fx40) ietVar.f.getValue()).f10291a;
            objG = hz40Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof vy40) {
                vy40Var = (vy40) objG;
                Object objL2 = vy40Var.l(0);
                if (vy40Var.i()) {
                    hz40Var.l(objValueOf);
                }
                if (vy40Var.b == 1) {
                    hz40Var.n(objValueOf, vy40Var.f());
                }
                objG = objL2;
            } else {
                hz40Var.l(objValueOf);
            }
            jky jkyVar5 = (jky) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                t9k0 t9k0VarH2 = this.H.h();
                this.I = t9k0VarH2;
                t9k0VarH2.N();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            t9k0Var = this.I;
            int i113 = t9k0Var.t;
            if (z) {
                t9k0Var.R(i, obj5, true, obj5);
                i4 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i4 = 0;
                t9k0Var.R(i, obj5, false, obj2);
            } else {
                i4 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                t9k0Var.R(i, obj3, false, obj5);
            }
            this.N = this.I.b(i113);
            int i114 = (-2) - i113;
            jky jkyVar6 = new jky(-1, i, i114, -1);
            ey40Var.j(i114, new xgv(-1, this.k - i3, i4));
            arrayList.add(jkyVar6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            ietVar2 = new iet(arrayList4, i5);
        } else {
            ietVar2 = null;
        }
        x(z, ietVar2);
    }

    public final void Z() {
        Y(null, -127, 0, null);
    }

    public final void a() {
        j();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        uiq uiqVar = this.O;
        uiqVar.b.Z();
        uiqVar.f35744a.Z();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        p9k0 p9k0Var = this.G;
        if (!p9k0Var.f) {
            p9k0Var.c();
        }
        if (this.I.w) {
            return;
        }
        y();
    }

    public final void a0(int i, ev70 ev70Var) {
        Y(ev70Var, i, 0, null);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            a180 a180Var = this.O.f35744a;
            a180Var.c0(n080.d);
            c9x.L(a180Var, 0, obj);
            zys0.e(2, function2);
            c9x.L(a180Var, 1, function2);
            return;
        }
        vkd vkdVar = this.M;
        vkdVar.b();
        a180 a180Var2 = vkdVar.b.f29108a;
        a180Var2.c0(n080.d);
        zys0.e(2, function2);
        c9x.M(a180Var2, 0, obj, 1, function2);
    }

    public final void b0(int i, Object obj) {
        Y(obj, i, 0, null);
    }

    public final boolean c(double d) {
        Object objH = H();
        if ((objH instanceof Double) && d == ((Number) objH).doubleValue()) {
            return false;
        }
        p0(Double.valueOf(d));
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c0(l5d0 l5d0Var) {
        f3u0 f3u0Var;
        bh90 bh90VarM = m();
        a0(201, ykd.b);
        Object objP = P();
        if (Intrinsics.d(objP, ukd.f35823a)) {
            f3u0Var = null;
        } else {
            objP.getClass();
            f3u0Var = (f3u0) objP;
        }
        androidx.compose.runtime.d dVar = l5d0Var.f19449a;
        f3u0 f3u0VarD = dVar.d(l5d0Var, f3u0Var);
        boolean zEquals = f3u0VarD.equals(f3u0Var);
        if (!zEquals) {
            o0(f3u0VarD);
        }
        boolean z = true;
        if (!this.S) {
            p9k0 p9k0Var = this.G;
            Object objB = p9k0Var.b(p9k0Var.b, p9k0Var.g);
            objB.getClass();
            bh90 bh90Var = (bh90) objB;
            if (!(D() && zEquals) && (l5d0Var.g || !bh90VarM.containsKey(dVar))) {
                bh90VarM = bh90VarM.j(dVar, f3u0VarD);
            } else if ((zEquals && !this.w) || !this.w) {
                bh90VarM = bh90Var;
            }
            if (!this.y && bh90Var == bh90VarM) {
            }
            if (z && !this.S) {
                N(bh90VarM);
            }
            this.x.c(this.w ? 1 : 0);
            this.w = z;
            this.K = bh90VarM;
            Y(ykd.c, Response.ACCEPTED, 0, bh90VarM);
        }
        if (l5d0Var.g || !bh90VarM.containsKey(dVar)) {
            bh90VarM = bh90VarM.j(dVar, f3u0VarD);
        }
        this.J = true;
        z = false;
        if (z) {
            N(bh90VarM);
        }
        this.x.c(this.w ? 1 : 0);
        this.w = z;
        this.K = bh90VarM;
        Y(ykd.c, Response.ACCEPTED, 0, bh90VarM);
    }

    public final boolean d(float f) {
        Object objH = H();
        if ((objH instanceof Float) && f == ((Number) objH).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f));
        return true;
    }

    public final void d0(Object obj, boolean z) {
        if (z) {
            p9k0 p9k0Var = this.G;
            if (p9k0Var.k <= 0) {
                if ((p9k0Var.b[(p9k0Var.g * 5) + 1] & 1073741824) == 0) {
                    dsb0.a("Expected a node group");
                }
                p9k0Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            vkd vkdVar = this.M;
            vkdVar.getClass();
            vkdVar.d(false);
            a180 a180Var = vkdVar.b.f29108a;
            a180Var.c0(m080.d);
            c9x.L(a180Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean e(int i) {
        Object objH = H();
        if ((objH instanceof Integer) && i == ((Number) objH).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i));
        return true;
    }

    public final void e0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            Y(null, i, 0, null);
            return;
        }
        if (this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        p9k0 p9k0Var = this.G;
        boolean z = this.S;
        cl5 cl5Var = ukd.f35823a;
        if (z) {
            p9k0Var.k++;
            this.I.R(i, cl5Var, false, cl5Var);
            x(false, null);
            return;
        }
        if (p9k0Var.g() == i && ((i3 = p9k0Var.g) >= p9k0Var.h || (p9k0Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            p9k0Var.u();
            x(false, null);
            return;
        }
        if (p9k0Var.k <= 0 && (i2 = p9k0Var.g) != p9k0Var.h) {
            int i4 = this.k;
            M();
            this.M.f(i4, p9k0Var.s());
            cwr0.R(i2, p9k0Var.g, this.s);
        }
        p9k0Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            t9k0 t9k0VarH = this.H.h();
            this.I = t9k0VarH;
            t9k0VarH.N();
            this.J = false;
            this.K = null;
        }
        t9k0 t9k0Var = this.I;
        t9k0Var.d();
        int i5 = t9k0Var.t;
        t9k0Var.R(i, cl5Var, false, cl5Var);
        this.N = t9k0Var.b(i5);
        x(false, null);
    }

    public final boolean f(long j) {
        Object objH = H();
        if ((objH instanceof Long) && j == ((Number) objH).longValue()) {
            return false;
        }
        p0(Long.valueOf(j));
        return true;
    }

    public final void f0(int i) {
        Y(null, i, 0, null);
    }

    public final boolean g(Object obj) {
        if (Intrinsics.d(H(), obj)) {
            return false;
        }
        p0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final fet g0(int i) {
        yfe0 yfe0Var;
        boolean z;
        e0(i);
        boolean z2 = this.S;
        lrc lrcVar = this.g;
        ArrayList arrayList = this.E;
        tld tldVar = this.h;
        if (z2) {
            yfe0 yfe0Var2 = new yfe0(tldVar);
            arrayList.add(yfe0Var2);
            p0(yfe0Var2);
            yfe0Var2.e = this.B;
            yfe0Var2.b &= -17;
            lrcVar.b();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iN = cwr0.N(i2, arrayList2);
        fox foxVar = iN >= 0 ? (fox) arrayList2.remove(iN) : null;
        Object objM = this.G.m();
        if (Intrinsics.d(objM, ukd.f35823a)) {
            yfe0Var = new yfe0(tldVar);
            p0(yfe0Var);
        } else {
            objM.getClass();
            yfe0Var = (yfe0) objM;
        }
        if (foxVar == null) {
            int i3 = yfe0Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                yfe0Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = yfe0Var.b;
        yfe0Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(yfe0Var);
        yfe0Var.e = this.B;
        yfe0Var.b &= -17;
        lrcVar.b();
        int i5 = yfe0Var.b;
        if ((i5 & 256) != 0) {
            yfe0Var.b = (i5 & (-257)) | 512;
            a180 a180Var = this.M.b.f29108a;
            a180Var.c0(i080.d);
            c9x.L(a180Var, 0, yfe0Var);
            if (!this.y) {
                int i6 = yfe0Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    yfe0Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final boolean h(boolean z) {
        Object objH = H();
        if ((objH instanceof Boolean) && z == ((Boolean) objH).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z));
        return true;
    }

    public final void h0(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.d(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        Y(null, 207, 0, obj);
    }

    public final boolean i(Object obj) {
        if (H() == obj) {
            return false;
        }
        p0(obj);
        return true;
    }

    public final void i0() {
        Y(null, 125, 2, null);
        this.r = true;
    }

    public final void j() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        vkd vkdVar = this.M;
        vkdVar.c = false;
        vkdVar.d.b = 0;
        vkdVar.f = 0;
        vkdVar.e = true;
        vkdVar.g = 0;
        vkdVar.h.clear();
        vkdVar.i = -1;
        vkdVar.j = -1;
        vkdVar.k = -1;
        vkdVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j0() {
        this.m = 0;
        this.G = this.c.g();
        Y(null, 100, 0, null);
        nld nldVar = this.b;
        nldVar.w();
        bh90 bh90VarJ = nldVar.j();
        this.x.c(this.w ? 1 : 0);
        this.w = g(bh90VarJ);
        this.K = null;
        if (!this.q) {
            this.q = nldVar.f();
        }
        boolean zG = this.C;
        if (!zG) {
            zG = nldVar.g();
            this.C = zG;
        }
        if (zG) {
            zfn zfnVar = sld.f32394a;
            zfnVar.getClass();
            bh90VarJ = bh90VarJ.j(zfnVar, new z8m0(C()));
        }
        this.u = bh90VarJ;
        Set set = (Set) qbc.V(bh90VarJ, lix.f20127a);
        if (set != null) {
            set.add(z());
            nldVar.r(set);
        }
        Y(null, Long.hashCode(nldVar.h()), 0, null);
    }

    public final Object k(androidx.compose.runtime.d dVar) {
        return qbc.V(m(), dVar);
    }

    public final boolean k0(yfe0 yfe0Var, Object obj) {
        bet betVar = yfe0Var.c;
        if (betVar == null) {
            return false;
        }
        int iB = this.G.f26610a.b(obc.J(betVar));
        if (!this.F || iB < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iN = cwr0.N(iB, arrayList);
        if (iN < 0) {
            int i = -(iN + 1);
            if (!(obj instanceof zbk)) {
                obj = null;
            }
            arrayList.add(i, new fox(yfe0Var, iB, obj));
            return true;
        }
        fox foxVar = (fox) arrayList.get(iN);
        if (!(obj instanceof zbk)) {
            foxVar.c = null;
            return true;
        }
        Object obj2 = foxVar.c;
        if (obj2 == null) {
            foxVar.c = obj;
            return true;
        }
        if (obj2 instanceof iz40) {
            ((iz40) obj2).a(obj);
            return true;
        }
        iz40 iz40Var = v1h0.f36630a;
        iz40 iz40Var2 = new iz40(2);
        iz40Var2.k(obj2);
        iz40Var2.k(obj);
        foxVar.c = iz40Var2;
        return true;
    }

    public final void l(Function0 function0) {
        if (!this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ykd.a("createNode() can only be called when inserting");
        }
        skx skxVar = this.n;
        int i = skxVar.f32372a[skxVar.b - 1];
        t9k0 t9k0Var = this.I;
        bet betVarB = t9k0Var.b(t9k0Var.v);
        this.l++;
        uiq uiqVar = this.O;
        a180 a180Var = uiqVar.f35744a;
        a180Var.c0(vz70.e);
        c9x.L(a180Var, 0, function0);
        a180Var.c[a180Var.d - a180Var.f60a[a180Var.b - 1].b] = i;
        c9x.L(a180Var, 1, betVarB);
        a180 a180Var2 = uiqVar.b;
        a180Var2.c0(vz70.f);
        a180Var2.c[a180Var2.d - a180Var2.f60a[a180Var2.b - 1].b] = i;
        c9x.L(a180Var2, 0, betVarB);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void l0(hz40 hz40Var) {
        ArrayList arrayList = this.s;
        for (int i = q3d.i(arrayList); -1 < i; i--) {
            fox foxVar = (fox) arrayList.get(i);
            bet betVar = foxVar.f9905a.c;
            bet betVarJ = betVar != null ? obc.J(betVar) : null;
            if (betVarJ == null || !betVarJ.a()) {
                arrayList.remove(i);
            } else {
                int i2 = foxVar.b;
                int i3 = betVarJ.f2467a;
                if (i2 != i3) {
                    foxVar.b = i3;
                }
            }
        }
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            obj.getClass();
                            yfe0 yfe0Var = (yfe0) obj;
                            bet betVar2 = yfe0Var.c;
                            if (betVar2 != null) {
                                int i8 = obc.J(betVar2).f2467a;
                                if (obj2 == ujn.B) {
                                    obj2 = null;
                                }
                                arrayList.add(new fox(yfe0Var, i8, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        v3d.t(cwr0.g, arrayList);
    }

    public final bh90 m() {
        bh90 bh90Var = this.K;
        return bh90Var != null ? bh90Var : n(this.G.i);
    }

    public final void m0(int i, int i2) {
        if (q0(i) != i2) {
            if (i < 0) {
                dy40 dy40Var = this.p;
                if (dy40Var == null) {
                    dy40Var = new dy40();
                    this.p = dy40Var;
                }
                dy40Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                qx3.o(iArr, -1, 0, 6);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final bh90 n(int i) {
        bh90 bh90Var;
        boolean z = this.S;
        ev70 ev70Var = ykd.c;
        if (z && this.J) {
            int iF = this.I.v;
            while (iF > 0) {
                if (this.I.r(iF) == 202 && Intrinsics.d(this.I.s(iF), ev70Var)) {
                    Object objP = this.I.p(iF);
                    objP.getClass();
                    bh90 bh90Var2 = (bh90) objP;
                    this.K = bh90Var2;
                    return bh90Var2;
                }
                t9k0 t9k0Var = this.I;
                iF = t9k0Var.F(t9k0Var.b, iF);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    p9k0 p9k0Var = this.G;
                    if (Intrinsics.d(p9k0Var.p(p9k0Var.b, i), ev70Var)) {
                        ey40 ey40Var = this.v;
                        if (ey40Var == null || (bh90Var = (bh90) ey40Var.b(i)) == null) {
                            p9k0 p9k0Var2 = this.G;
                            Object objB = p9k0Var2.b(p9k0Var2.b, i);
                            objB.getClass();
                            bh90Var = (bh90) objB;
                        }
                        this.K = bh90Var;
                        return bh90Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        bh90 bh90Var3 = this.u;
        this.K = bh90Var3;
        return bh90Var3;
    }

    public final void n0(int i, int i2) {
        int iQ0 = q0(i);
        if (iQ0 != i2) {
            int i3 = i2 - iQ0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iQ1 = q0(i) + i3;
                m0(i, iQ1);
                for (int i4 = size; -1 < i4; i4--) {
                    iet ietVar = (iet) arrayList.get(i4);
                    if (ietVar != null && ietVar.a(i, iQ1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                p9k0 p9k0Var = this.G;
                if (i < 0) {
                    i = p9k0Var.i;
                } else if (p9k0Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final ikd o() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        t9k0 t9k0Var = this.I;
        lc00VarB.addAll(aac.O(t9k0Var, null, t9k0Var.t, null));
        p9k0 p9k0Var = this.G;
        boolean z = p9k0Var.f;
        int[] iArr = p9k0Var.b;
        if (z || p9k0Var.c == 0) {
            collection = iun.f15405a;
        } else {
            tae0 tae0Var = new tae0(p9k0Var);
            int iQ = p9k0Var.i;
            Object objValueOf = Integer.valueOf(p9k0Var.l - s9k0.d(iArr, iQ));
            while (iQ >= 0) {
                tae0Var.h(p9k0Var.i(iQ), p9k0Var.k(iQ) ? p9k0Var.p(iArr, iQ) : ukd.f35823a, p9k0Var.f26610a.k(iQ), objValueOf);
                objValueOf = p9k0Var.a(iQ);
                iQ = p9k0Var.q(iQ);
            }
            collection = tae0Var.f16663a;
        }
        lc00VarB.addAll(collection);
        lc00VarB.addAll(I());
        return new ikd(kotlin.collections.a.a(lc00VarB), this.C);
    }

    public final void o0(Object obj) {
        if (obj instanceof jff0) {
            jet jetVar = new jet((jff0) obj, this.m - 1);
            if (this.S) {
                a180 a180Var = this.M.b.f29108a;
                a180Var.c0(b080.d);
                c9x.L(a180Var, 0, jetVar);
            }
            this.d.add(obj);
            obj = jetVar;
        }
        p0(obj);
    }

    public final void p(hz40 hz40Var, Function2 function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            ykd.a("Reentrant composition is not supported");
        }
        this.g.b();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(xfk0.h().g());
            this.v = null;
            l0(hz40Var);
            this.k = 0;
            this.F = true;
            try {
                j0();
                Object objH = H();
                if (objH != function2 && function2 != null) {
                    p0(function2);
                }
                eet eetVar = this.D;
                xz40 xz40VarA = jgk0.a();
                try {
                    xz40VarA.b(eetVar);
                    ev70 ev70Var = ykd.f42783a;
                    if (function2 != null) {
                        a0(Response.OK, ev70Var);
                        ahb.S(this, function2);
                        r(false);
                    } else if (!this.w || objH == null || objH.equals(ukd.f35823a)) {
                        V();
                    } else {
                        a0(Response.OK, ev70Var);
                        zys0.e(2, objH);
                        ahb.S(this, (Function2) objH);
                        r(false);
                    }
                    xz40VarA.k(xz40VarA.c - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        ykd.a("Check failed");
                    }
                    y();
                    Trace.endSection();
                } catch (Throwable th) {
                    xz40VarA.k(xz40VarA.c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    sac.t0(th2, new cet(this, (byte) 0));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        ykd.a("Check failed");
                    }
                    y();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void p0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        p9k0 p9k0Var = this.G;
        boolean z = p9k0Var.n;
        vkd vkdVar = this.M;
        if (!z) {
            bet betVarA = p9k0Var.a(p9k0Var.i);
            a180 a180Var = vkdVar.b.f29108a;
            a180Var.c0(iz70.d);
            c9x.M(a180Var, 0, betVarA, 1, obj);
            return;
        }
        int iD = (p9k0Var.l - s9k0.d(p9k0Var.b, p9k0Var.i)) - 1;
        if (vkdVar.f37566a.G.i - vkdVar.f >= 0) {
            vkdVar.d(true);
            a180 a180Var2 = vkdVar.b.f29108a;
            a180Var2.c0(vz70.h);
            c9x.L(a180Var2, 0, obj);
            a180Var2.c[a180Var2.d - a180Var2.f60a[a180Var2.b - 1].b] = iD;
            return;
        }
        p9k0 p9k0Var2 = this.G;
        bet betVarA2 = p9k0Var2.a(p9k0Var2.i);
        a180 a180Var3 = vkdVar.b.f29108a;
        a180Var3.c0(vz70.g);
        c9x.M(a180Var3, 0, obj, 1, betVarA2);
        a180Var3.c[a180Var3.d - a180Var3.f60a[a180Var3.b - 1].b] = iD;
    }

    public final void q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        q(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            vkd vkdVar = this.M;
            vkdVar.c();
            vkdVar.h.add(objN);
        }
    }

    public final int q0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        dy40 dy40Var = this.p;
        if (dy40Var != null && dy40Var.c(i) >= 0) {
            int iC = dy40Var.c(i);
            if (iC >= 0) {
                return dy40Var.c[iC];
            }
            v4i0.o(twn.m(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(boolean z) {
        long jRotateRight;
        skx skxVar;
        int i;
        ArrayList arrayList;
        int i2;
        ?? r5;
        int i3;
        skx skxVar2;
        int i4;
        iz40 iz40Var;
        int i5;
        int i6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i7;
        int i8;
        Object[] objArr;
        long[] jArr;
        int i9;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        Object[] objArr3;
        long[] jArr3;
        int i11;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        skx skxVar3 = this.n;
        int i12 = skxVar3.f32372a[skxVar3.b - 2] - 1;
        boolean z2 = this.S;
        cl5 cl5Var = ukd.f35823a;
        if (z2) {
            t9k0 t9k0Var = this.I;
            int i13 = t9k0Var.v;
            int iR = t9k0Var.r(i13);
            Object objS = this.I.s(i13);
            Object objP = this.I.p(i13);
            if (objS != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objS instanceof Enum ? ((Enum) objS).ordinal() : objS.hashCode()));
            } else if (objP == null || iR != 207 || objP.equals(cl5Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) iR);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objP.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            p9k0 p9k0Var = this.G;
            int i14 = p9k0Var.i;
            int i15 = p9k0Var.i(i14);
            p9k0 p9k0Var2 = this.G;
            Object objP2 = p9k0Var2.p(p9k0Var2.b, i14);
            p9k0 p9k0Var3 = this.G;
            Object objB = p9k0Var3.b(p9k0Var3.b, i14);
            if (objP2 != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP2 instanceof Enum ? ((Enum) objP2).ordinal() : objP2.hashCode()));
            } else if (objB == null || i15 != 207 || objB.equals(cl5Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i16 = this.l;
        iet ietVar = this.j;
        ArrayList arrayList4 = this.s;
        vkd vkdVar = this.M;
        if (ietVar != null) {
            ey40 ey40Var = ietVar.e;
            int i17 = ietVar.b;
            ArrayList arrayList5 = ietVar.f14651a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = ietVar.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i18 = 0; i18 < size; i18++) {
                    hashSet2.add(arrayList6.get(i18));
                }
                i2 = -1;
                iz40 iz40Var2 = v1h0.f36630a;
                iz40 iz40Var3 = new iz40();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                i = 1;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i19 < size3) {
                    jky jkyVar = (jky) arrayList5.get(i19);
                    if (hashSet2.contains(jkyVar)) {
                        skxVar2 = skxVar3;
                        i4 = i19;
                        if (!iz40Var3.c(jkyVar)) {
                            int i22 = i20;
                            if (i22 < size2) {
                                jky jkyVar2 = (jky) arrayList6.get(i22);
                                if (jkyVar2 != jkyVar) {
                                    xgv xgvVar = (xgv) ey40Var.b(jkyVar2.c);
                                    int i23 = xgvVar != null ? xgvVar.b : -1;
                                    iz40Var3.a(jkyVar2);
                                    i7 = i21;
                                    if (i23 != i7) {
                                        xgv xgvVar2 = (xgv) ey40Var.b(jkyVar2.c);
                                        int i24 = xgvVar2 != null ? xgvVar2.c : jkyVar2.d;
                                        iz40Var = iz40Var3;
                                        int i25 = i23 + i17;
                                        i5 = size2;
                                        int i26 = i7 + i17;
                                        if (i24 > 0) {
                                            i6 = i17;
                                            int i27 = vkdVar.l;
                                            if (i27 > 0) {
                                                arrayList2 = arrayList5;
                                                if (vkdVar.j == i25 - i27 && vkdVar.k == i26 - i27) {
                                                    vkdVar.l = i27 + i24;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            vkdVar.c();
                                            vkdVar.j = i25;
                                            vkdVar.k = i26;
                                            vkdVar.l = i24;
                                        } else {
                                            i6 = i17;
                                            arrayList2 = arrayList5;
                                            vkdVar.getClass();
                                        }
                                        if (i23 <= i7) {
                                            int i28 = i24;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i7 > i23) {
                                                Object[] objArr5 = ey40Var.c;
                                                long[] jArr5 = ey40Var.f11466a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i29 = 0;
                                                    while (true) {
                                                        long j = jArr5[i29];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i30 = 8 - ((~(i29 - length)) >>> 31);
                                                            int i31 = 0;
                                                            while (i31 < i30) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    xgv xgvVar3 = (xgv) objArr5[(i29 << 3) + i31];
                                                                    jArr2 = jArr5;
                                                                    int i32 = xgvVar3.b;
                                                                    i10 = i23;
                                                                    if (i23 <= i32 && i32 < i10 + i28) {
                                                                        xgvVar3.b = (i32 - i10) + i7;
                                                                    } else if (i10 + 1 <= i32 && i32 < i7) {
                                                                        xgvVar3.b = i32 - i28;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i10 = i23;
                                                                }
                                                                j >>= 8;
                                                                i31++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i23 = i10;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                            if (i30 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i9 = i23;
                                                        }
                                                        if (i29 == length) {
                                                            break;
                                                        }
                                                        i29++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i23 = i9;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = ey40Var.c;
                                            long[] jArr6 = ey40Var.f11466a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i33];
                                                    int i34 = i24;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length2)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j2 & 255) < 128) {
                                                                i11 = i36;
                                                                xgv xgvVar4 = (xgv) objArr6[(i33 << 3) + i36];
                                                                objArr4 = objArr6;
                                                                int i37 = xgvVar4.b;
                                                                jArr4 = jArr6;
                                                                if (i23 <= i37 && i37 < i23 + i34) {
                                                                    xgvVar4.b = (i37 - i23) + i7;
                                                                } else if (i7 <= i37 && i37 < i23) {
                                                                    xgvVar4.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i11 = i36;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i36 = i11 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i33 == length2) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList4 = arrayList4;
                                                    i24 = i34;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i8 = i4;
                                    } else {
                                        iz40Var = iz40Var3;
                                        i5 = size2;
                                        i6 = i17;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i8 = i4;
                                } else {
                                    arrayList4 = arrayList4;
                                    iz40Var = iz40Var3;
                                    i5 = size2;
                                    i6 = i17;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i7 = i21;
                                    i8 = i4 + 1;
                                }
                                i20 = i22 + 1;
                                xgv xgvVar5 = (xgv) ey40Var.b(jkyVar2.c);
                                int i38 = i7 + (xgvVar5 != null ? xgvVar5.c : jkyVar2.d);
                                i19 = i8;
                                ietVar = ietVar;
                                iz40Var3 = iz40Var;
                                size2 = i5;
                                i17 = i6;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i21 = i38;
                                skxVar3 = skxVar2;
                            } else {
                                i20 = i22;
                                skxVar3 = skxVar2;
                                i19 = i4;
                            }
                        }
                    } else {
                        skxVar2 = skxVar3;
                        xgv xgvVar6 = (xgv) ey40Var.b(jkyVar.c);
                        int i39 = xgvVar6 != null ? xgvVar6.b : -1;
                        int i40 = jkyVar.c;
                        i4 = i19;
                        vkdVar.f(i39 + i17, jkyVar.d);
                        ietVar.a(i40, 0);
                        vkdVar.f = (i40 - vkdVar.f37566a.G.g) + vkdVar.f;
                        this.G.r(i40);
                        M();
                        this.G.s();
                        cwr0.R(i40, this.G.b[(i40 * 5) + 3] + i40, arrayList4);
                    }
                    i19 = i4 + 1;
                    skxVar3 = skxVar2;
                }
                skxVar = skxVar3;
                arrayList = arrayList4;
                vkdVar.c();
                if (arrayList5.size() > 0) {
                    p9k0 p9k0Var4 = this.G;
                    vkdVar.f = (p9k0Var4.h - vkdVar.f37566a.G.g) + vkdVar.f;
                    p9k0Var4.t();
                }
            } else {
                skxVar = skxVar3;
                i = 1;
                arrayList = arrayList4;
                i2 = -1;
            }
        } else {
            skxVar = skxVar3;
            i = 1;
            arrayList = arrayList4;
            i2 = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            p9k0 p9k0Var5 = this.G;
            int i41 = p9k0Var5.m - p9k0Var5.l;
            if (i41 > 0) {
                if (i41 > 0) {
                    vkdVar.d(false);
                    vkdVar.e();
                    a180 a180Var = vkdVar.b.f29108a;
                    a180Var.c0(l080.d);
                    a180Var.c[a180Var.d - a180Var.f60a[a180Var.b - 1].b] = i41;
                } else {
                    vkdVar.getClass();
                }
            }
        }
        int i42 = this.k;
        while (true) {
            p9k0 p9k0Var6 = this.G;
            if (p9k0Var6.k > 0 || (i3 = p9k0Var6.g) == p9k0Var6.h) {
                break;
            }
            M();
            vkdVar.f(i42, this.G.s());
            cwr0.R(i3, this.G.g, arrayList);
        }
        if (z3) {
            if (z) {
                uiq uiqVar = this.O;
                a180 a180Var2 = uiqVar.b;
                if (a180Var2.b == 0) {
                    ykd.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                a180 a180Var3 = uiqVar.f35744a;
                mjq[] mjqVarArr = a180Var2.f60a;
                int i43 = a180Var2.b - 1;
                a180Var2.b = i43;
                mjq mjqVar = mjqVarArr[i43];
                mjqVarArr[i43] = null;
                a180Var3.c0(mjqVar);
                Object[] objArr7 = a180Var2.e;
                Object[] objArr8 = a180Var3.e;
                int i44 = a180Var3.f;
                int i45 = mjqVar.c;
                int i46 = a180Var2.f;
                int i47 = i46 - i45;
                System.arraycopy(objArr7, i47, objArr8, i44 - i45, i46 - i47);
                Object[] objArr9 = a180Var2.e;
                int i48 = a180Var2.f;
                Arrays.fill(objArr9, i48 - i45, i48, (Object) null);
                int[] iArr = a180Var2.c;
                int[] iArr2 = a180Var3.c;
                int i49 = a180Var3.d;
                int i50 = mjqVar.b;
                int i51 = a180Var2.d;
                qx3.d(i49 - i50, i51 - i50, i51, iArr, iArr2);
                a180Var2.f -= i45;
                a180Var2.d -= i50;
                i16 = i;
            }
            p9k0 p9k0Var7 = this.G;
            if (p9k0Var7.k <= 0) {
                dsb0.a("Unbalanced begin/end empty");
            }
            p9k0Var7.k--;
            t9k0 t9k0Var2 = this.I;
            int i52 = t9k0Var2.v;
            t9k0Var2.i();
            if (this.G.k <= 0) {
                int i53 = (-2) - i52;
                this.I.j();
                this.I.e(i);
                bet betVar = this.N;
                boolean zB0 = this.O.f35744a.b0();
                q9k0 q9k0Var = this.H;
                if (zB0) {
                    vkdVar.b();
                    r5 = 0;
                    vkdVar.d(false);
                    vkdVar.e();
                    vkdVar.c();
                    a180 a180Var4 = vkdVar.b.f29108a;
                    a180Var4.c0(wz70.d);
                    c9x.M(a180Var4, 0, betVar, 1, q9k0Var);
                } else {
                    uiq uiqVar2 = this.O;
                    vkdVar.b();
                    vkdVar.d(false);
                    vkdVar.e();
                    vkdVar.c();
                    a180 a180Var5 = vkdVar.b.f29108a;
                    a180Var5.c0(xz70.d);
                    c9x.N(a180Var5, betVar, q9k0Var, uiqVar2);
                    this.O = new uiq();
                    r5 = 0;
                }
                this.S = r5;
                if (this.c.b != 0) {
                    m0(i53, r5);
                    n0(i53, i16);
                }
            }
        } else {
            if (z) {
                vkdVar.a();
            }
            int i54 = vkdVar.f37566a.G.i;
            skx skxVar4 = vkdVar.d;
            int i55 = i2;
            if (skxVar4.a(i55) > i54) {
                ykd.a("Missed recording an endGroup");
            }
            if (skxVar4.a(i55) == i54) {
                vkdVar.d(false);
                skxVar4.b();
                vkdVar.b.f29108a.c0(qz70.d);
            }
            int i56 = this.G.i;
            if (i16 != q0(i56)) {
                n0(i56, i16);
            }
            if (z) {
                i16 = 1;
            }
            this.G.e();
            vkdVar.c();
        }
        iet ietVar2 = (iet) hne.k(1, this.i);
        if (ietVar2 != null && !z3) {
            ietVar2.c++;
        }
        this.j = ietVar2;
        this.k = skxVar.b() + i16;
        this.m = skxVar.b();
        this.l = skxVar.b() + i16;
    }

    public final void r0() {
        if (!this.r) {
            ykd.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            ykd.a("useNode() called while inserting");
        }
        p9k0 p9k0Var = this.G;
        Object objN = p9k0Var.n(p9k0Var.i);
        vkd vkdVar = this.M;
        vkdVar.c();
        vkdVar.h.add(objN);
        if (this.y && (objN instanceof zjd)) {
            vkdVar.b();
            vkdVar.b.f29108a.c0(p080.d);
        }
    }

    public final void s() {
        r(false);
        yfe0 yfe0VarA = A();
        if (yfe0VarA != null) {
            int i = yfe0VarA.b;
            if ((i & 1) != 0) {
                yfe0VarA.b = i | 2;
            }
        }
    }

    public final void t() {
        r(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:15:0x0039->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[EDGE_INSN: B:28:0x007f->B:29:0x0080 BREAK  A[LOOP:0: B:15:0x0039->B:27:0x007c]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x007f A[SYNTHETIC] */
    public final yfe0 u() {
        yfe0 yfe0Var;
        bet betVarA;
        g18 g18Var;
        ArrayList arrayList = this.E;
        yfe0 yfe0Var2 = !arrayList.isEmpty() ? (yfe0) hne.k(1, arrayList) : null;
        if (yfe0Var2 != null) {
            yfe0Var2.b &= -9;
            this.g.b();
            int i = this.B;
            ry40 ry40Var = yfe0Var2.f;
            if (ry40Var == null || (yfe0Var2.b & 16) != 0) {
                g18Var = null;
                break;
            }
            Object[] objArr = ry40Var.b;
            int[] iArr = ry40Var.c;
            long[] jArr = ry40Var.f31295a;
            int length = jArr.length - 2;
            if (length < 0) {
                g18Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                g18Var = new g18((Object) yfe0Var2, i, (Object) ry40Var, (byte) 10);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    g18Var = null;
                    break;
                }
                if (i2 == length) {
                    g18Var = null;
                    break;
                }
                i2++;
            }
            vkd vkdVar = this.M;
            if (g18Var != null) {
                a180 a180Var = vkdVar.b.f29108a;
                a180Var.c0(pz70.d);
                c9x.M(a180Var, 0, g18Var, 1, this.h);
            }
            int i6 = yfe0Var2.b;
            if ((i6 & 512) != 0) {
                yfe0Var2.b = i6 & (-513);
                a180 a180Var2 = vkdVar.b.f29108a;
                a180Var2.c0(sz70.d);
                c9x.L(a180Var2, 0, yfe0Var2);
                int i7 = yfe0Var2.b;
                yfe0Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    yfe0Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (yfe0Var2 != null) {
            int i8 = yfe0Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (yfe0Var2.c == null) {
                    if (this.S) {
                        t9k0 t9k0Var = this.I;
                        betVarA = t9k0Var.b(t9k0Var.v);
                    } else {
                        p9k0 p9k0Var = this.G;
                        betVarA = p9k0Var.a(p9k0Var.i);
                    }
                    yfe0Var2.c = betVarA;
                }
                yfe0Var2.b &= -5;
                yfe0Var = yfe0Var2;
            } else {
                yfe0Var = null;
            }
        } else {
            yfe0Var = null;
        }
        r(false);
        return yfe0Var;
    }

    public final void v() {
        r(false);
        this.b.d();
        r(false);
        vkd vkdVar = this.M;
        if (vkdVar.c) {
            vkdVar.d(false);
            vkdVar.d(false);
            vkdVar.b.f29108a.c0(qz70.d);
            vkdVar.c = false;
        }
        vkdVar.b();
        if (vkdVar.d.b != 0) {
            ykd.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ykd.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(int i) {
        if (i < 0) {
            int i2 = -i;
            t9k0 t9k0Var = this.I;
            while (true) {
                int i3 = t9k0Var.v;
                if (i3 <= i2) {
                    return;
                } else {
                    r(t9k0Var.x(i3));
                }
            }
        } else {
            if (this.S) {
                t9k0 t9k0Var2 = this.I;
                while (this.S) {
                    r(t9k0Var2.x(t9k0Var2.v));
                }
            }
            p9k0 p9k0Var = this.G;
            while (true) {
                int i4 = p9k0Var.i;
                if (i4 <= i) {
                    return;
                } else {
                    r(p9k0Var.l(i4));
                }
            }
        }
    }

    public final void x(boolean z, iet ietVar) {
        this.i.add(this.j);
        this.j = ietVar;
        int i = this.l;
        skx skxVar = this.n;
        skxVar.c(i);
        skxVar.c(this.m);
        skxVar.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        q9k0 q9k0Var = new q9k0();
        if (this.C) {
            q9k0Var.c();
        }
        if (this.b.e()) {
            q9k0Var.k = new ey40();
        }
        this.H = q9k0Var;
        t9k0 t9k0VarH = q9k0Var.h();
        t9k0VarH.e(true);
        this.I = t9k0VarH;
    }

    public final pld z() {
        get getVar = this.U;
        if (getVar != null) {
            return getVar;
        }
        get getVar2 = new get(this.h);
        this.U = getVar2;
        return getVar2;
    }
}
