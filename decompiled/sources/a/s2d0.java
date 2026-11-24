package a;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s2d0 extends gjt {
    public static final s2d0 h1;
    public static final sfy i1 = new sfy(8);
    public g4d0 A;
    public List B;
    public n4d0 Y;
    public List Z;
    public final pg9 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public byte f1;
    public List g;
    public int g1;
    public List h;
    public List i;
    public int j;
    public List k;
    public int l;
    public List m;
    public List n;
    public int o;
    public List p;
    public List q;
    public List r;
    public List s;
    public List t;
    public List u;
    public int v;
    public int w;
    public a4d0 x;
    public int y;
    public List z;

    static {
        s2d0 s2d0Var = new s2d0();
        h1 = s2d0Var;
        s2d0Var.r();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public s2d0(a.pyc r22, a.sso r23) {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s2d0.<init>(a.pyc, a.sso):void");
    }

    @Override // a.e540
    public final z3 a() {
        return h1;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.f1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) != 2) {
            this.f1 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((f4d0) this.g.get(i)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((a4d0) this.h.get(i2)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            if (!((a4d0) this.m.get(i3)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            if (!((v2d0) this.p.get(i4)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            if (!((i3d0) this.q.get(i5)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.r.size(); i6++) {
            if (!((p3d0) this.r.get(i6)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.s.size(); i7++) {
            if (!((c4d0) this.s.get(i7)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.t.size(); i8++) {
            if (!((d3d0) this.t.get(i8)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 16) == 16 && !this.x.b()) {
            this.f1 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.z.size(); i9++) {
            if (!((p2d0) this.z.get(i9)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 64) == 64 && !this.A.b()) {
            this.f1 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.Z.size(); i10++) {
            if (!((t2d0) this.Z.get(i10)).b()) {
                this.f1 = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.f1 = (byte) 1;
            return true;
        }
        this.f1 = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        int i = this.g1;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        int i2 = 0;
        int iO = 0;
        while (true) {
            int size = this.i.size();
            list = this.i;
            if (i2 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iP = iN + iO;
        if (!list.isEmpty()) {
            iP = iP + 1 + tyc.o(iO);
        }
        this.j = iO;
        if ((this.c & 2) == 2) {
            iP += tyc.n(3, this.e);
        }
        if ((this.c & 4) == 4) {
            iP += tyc.n(4, this.f);
        }
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            iP += tyc.p(5, (z3) this.g.get(i3));
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            iP += tyc.p(6, (z3) this.h.get(i4));
        }
        int i5 = 0;
        int iO2 = 0;
        while (true) {
            int size2 = this.k.size();
            list2 = this.k;
            if (i5 >= size2) {
                break;
            }
            iO2 += tyc.o(((Integer) list2.get(i5)).intValue());
            i5++;
        }
        int iP2 = iP + iO2;
        if (!list2.isEmpty()) {
            iP2 = iP2 + 1 + tyc.o(iO2);
        }
        this.l = iO2;
        for (int i6 = 0; i6 < this.p.size(); i6++) {
            iP2 += tyc.p(8, (z3) this.p.get(i6));
        }
        for (int i7 = 0; i7 < this.q.size(); i7++) {
            iP2 += tyc.p(9, (z3) this.q.get(i7));
        }
        for (int i8 = 0; i8 < this.r.size(); i8++) {
            iP2 += tyc.p(10, (z3) this.r.get(i8));
        }
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            iP2 += tyc.p(11, (z3) this.s.get(i9));
        }
        for (int i10 = 0; i10 < this.t.size(); i10++) {
            iP2 += tyc.p(13, (z3) this.t.get(i10));
        }
        int i11 = 0;
        int iO3 = 0;
        while (true) {
            int size3 = this.u.size();
            list3 = this.u;
            if (i11 >= size3) {
                break;
            }
            iO3 += tyc.o(((Integer) list3.get(i11)).intValue());
            i11++;
        }
        int iP3 = iP2 + iO3;
        if (!list3.isEmpty()) {
            iP3 = iP3 + 2 + tyc.o(iO3);
        }
        this.v = iO3;
        if ((this.c & 8) == 8) {
            iP3 += tyc.n(17, this.w);
        }
        if ((this.c & 16) == 16) {
            iP3 += tyc.p(18, this.x);
        }
        if ((this.c & 32) == 32) {
            iP3 += tyc.n(19, this.y);
        }
        for (int i12 = 0; i12 < this.m.size(); i12++) {
            iP3 += tyc.p(20, (z3) this.m.get(i12));
        }
        int i13 = 0;
        int iO4 = 0;
        while (true) {
            int size4 = this.n.size();
            list4 = this.n;
            if (i13 >= size4) {
                break;
            }
            iO4 += tyc.o(((Integer) list4.get(i13)).intValue());
            i13++;
        }
        int iP4 = iP3 + iO4;
        if (!list4.isEmpty()) {
            iP4 = iP4 + 2 + tyc.o(iO4);
        }
        this.o = iO4;
        for (int i14 = 0; i14 < this.z.size(); i14++) {
            iP4 += tyc.p(25, (z3) this.z.get(i14));
        }
        if ((this.c & 64) == 64) {
            iP4 += tyc.p(30, this.A);
        }
        int i15 = 0;
        int iO5 = 0;
        while (true) {
            int size5 = this.B.size();
            list5 = this.B;
            if (i15 >= size5) {
                break;
            }
            iO5 += tyc.o(((Integer) list5.get(i15)).intValue());
            i15++;
        }
        int size6 = (list5.size() * 2) + iP4 + iO5;
        if ((this.c & 128) == 128) {
            size6 += tyc.p(32, this.Y);
        }
        for (int i16 = 0; i16 < this.Z.size(); i16++) {
            size6 += tyc.p(33, (z3) this.Z.get(i16));
        }
        int size7 = this.b.size() + k() + size6;
        this.g1 = size7;
        return size7;
    }

    @Override // a.z3
    public final ajt f() {
        q2d0 q2d0VarH = q2d0.h();
        q2d0VarH.i(this);
        return q2d0VarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.j0(1, this.d);
        }
        if (this.i.size() > 0) {
            tycVar.s0(18);
            tycVar.s0(this.j);
        }
        for (int i = 0; i < this.i.size(); i++) {
            tycVar.k0(((Integer) this.i.get(i)).intValue());
        }
        if ((this.c & 2) == 2) {
            tycVar.j0(3, this.e);
        }
        if ((this.c & 4) == 4) {
            tycVar.j0(4, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            tycVar.l0(5, (z3) this.g.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            tycVar.l0(6, (z3) this.h.get(i3));
        }
        if (this.k.size() > 0) {
            tycVar.s0(58);
            tycVar.s0(this.l);
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            tycVar.k0(((Integer) this.k.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            tycVar.l0(8, (z3) this.p.get(i5));
        }
        for (int i6 = 0; i6 < this.q.size(); i6++) {
            tycVar.l0(9, (z3) this.q.get(i6));
        }
        for (int i7 = 0; i7 < this.r.size(); i7++) {
            tycVar.l0(10, (z3) this.r.get(i7));
        }
        for (int i8 = 0; i8 < this.s.size(); i8++) {
            tycVar.l0(11, (z3) this.s.get(i8));
        }
        for (int i9 = 0; i9 < this.t.size(); i9++) {
            tycVar.l0(13, (z3) this.t.get(i9));
        }
        if (this.u.size() > 0) {
            tycVar.s0(130);
            tycVar.s0(this.v);
        }
        for (int i10 = 0; i10 < this.u.size(); i10++) {
            tycVar.k0(((Integer) this.u.get(i10)).intValue());
        }
        if ((this.c & 8) == 8) {
            tycVar.j0(17, this.w);
        }
        if ((this.c & 16) == 16) {
            tycVar.l0(18, this.x);
        }
        if ((this.c & 32) == 32) {
            tycVar.j0(19, this.y);
        }
        for (int i11 = 0; i11 < this.m.size(); i11++) {
            tycVar.l0(20, (z3) this.m.get(i11));
        }
        if (this.n.size() > 0) {
            tycVar.s0(170);
            tycVar.s0(this.o);
        }
        for (int i12 = 0; i12 < this.n.size(); i12++) {
            tycVar.k0(((Integer) this.n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            tycVar.l0(25, (z3) this.z.get(i13));
        }
        if ((this.c & 64) == 64) {
            tycVar.l0(30, this.A);
        }
        for (int i14 = 0; i14 < this.B.size(); i14++) {
            tycVar.j0(31, ((Integer) this.B.get(i14)).intValue());
        }
        if ((this.c & 128) == 128) {
            tycVar.l0(32, this.Y);
        }
        for (int i15 = 0; i15 < this.Z.size(); i15++) {
            tycVar.l0(33, (z3) this.Z.get(i15));
        }
        wtiVar.E(19000, tycVar);
        tycVar.o0(this.b);
    }

    public final void r() {
        this.d = 6;
        this.e = 0;
        this.f = 0;
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.h = list;
        this.i = list;
        this.k = list;
        this.m = list;
        this.n = list;
        this.p = list;
        this.q = list;
        this.r = list;
        this.s = list;
        this.t = list;
        this.u = list;
        this.w = 0;
        this.x = a4d0.u;
        this.y = 0;
        this.z = list;
        this.A = g4d0.g;
        this.B = list;
        this.Y = n4d0.e;
        this.Z = list;
    }

    public s2d0() {
        this.j = -1;
        this.l = -1;
        this.o = -1;
        this.v = -1;
        this.f1 = (byte) -1;
        this.g1 = -1;
        this.b = pg9.f26941a;
    }

    public s2d0(q2d0 q2d0Var) {
        super(q2d0Var);
        this.j = -1;
        this.l = -1;
        this.o = -1;
        this.v = -1;
        this.f1 = (byte) -1;
        this.g1 = -1;
        this.b = q2d0Var.f994a;
    }
}
