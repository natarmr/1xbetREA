package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xcz implements bch0 {
    public static final v0h0 y = qxw.L(new z8z(4), new hvy(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcz f40671a;
    public boolean b;
    public mcz c;
    public boolean d;
    public final t8z e;
    public final pz40 f;
    public final gy40 g;
    public float h;
    public boolean i;
    public final ywj j;
    public final boolean k;
    public e7z l;
    public final a9z m;
    public final la5 n;
    public final dbz o;
    public final hru p;
    public final tbz q;
    public final jru r;
    public final qbz s;
    public final pz40 t;
    public final pz40 u;
    public final pz40 v;
    public final pz40 w;
    public final ieu x;

    public xcz(int i, int i2, pcz pczVar) {
        this.f40671a = pczVar;
        this.e = new t8z(i, i2, (byte) 1);
        this.f = androidx.compose.runtime.e.d(ddz.f5921a, m2a.v);
        this.g = new gy40();
        this.j = new ywj(new ebz(this, (byte) 3));
        this.k = true;
        this.m = new a9z(this, (byte) 1);
        this.n = new la5();
        this.o = new dbz();
        this.p = new hru((byte) 25);
        this.q = new tbz(new z08((Object) this, i, (byte) 8));
        this.r = new jru((Object) this, (byte) 26);
        this.s = new qbz();
        this.t = m8x.J();
        Boolean bool = Boolean.FALSE;
        this.u = androidx.compose.runtime.e.e(bool);
        this.v = androidx.compose.runtime.e.e(bool);
        this.w = m8x.J();
        this.x = new ieu((byte) 23);
    }

    @Override // a.bch0
    public final boolean a() {
        return this.j.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.j.b(r7, r8, r0) == r1) goto L23;
     */
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
    @Override // a.bch0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.c050 r7, kotlin.jvm.functions.Function2 r8, a.yje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.wcz
            if (r0 == 0) goto L13
            r0 = r9
            a.wcz r0 = (a.wcz) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.wcz r0 = new a.wcz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.bnn0 r7 = r0.j
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            a.c050 r7 = r0.i
            a.z1x.P(r9)
            goto L5d
        L3c:
            a.z1x.P(r9)
            a.pz40 r9 = r6.f
            a.hgk0 r9 = (a.hgk0) r9
            java.lang.Object r9 = r9.getValue()
            a.mcz r2 = a.ddz.f5921a
            if (r9 != r2) goto L5d
            r0.i = r7
            r9 = r8
            a.bnn0 r9 = (a.bnn0) r9
            r0.j = r9
            r0.m = r5
            a.la5 r9 = r6.n
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            goto L6b
        L5d:
            r0.i = r3
            r0.j = r3
            r0.m = r4
            a.ywj r6 = r6.j
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xcz.b(a.c050, kotlin.jvm.functions.Function2, a.yje):java.lang.Object");
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) ((hgk0) this.v).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) ((hgk0) this.u).getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object f(int i, int i2, yje yjeVar) {
        vcz vczVar;
        if (yjeVar instanceof vcz) {
            vczVar = (vcz) yjeVar;
            int i3 = vczVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vczVar.k = i3 - Integer.MIN_VALUE;
            } else {
                vczVar = new vcz(this, yjeVar);
            }
        } else {
            vczVar = new vcz(this, yjeVar);
        }
        Object obj = vczVar.i;
        wne wneVar = wne.f39444a;
        int i4 = vczVar.k;
        try {
            if (i4 == 0) {
                z1x.P(obj);
                this.i = true;
                ydu yduVar = new ydu(this, i, i2, null);
                vczVar.k = 1;
                if (b(c050.f3507a, yduVar, vczVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            this.i = false;
            this = Unit.f46060a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(mcz mczVar, boolean z, boolean z2) {
        List list = mczVar.l;
        int i = mczVar.b;
        ncz nczVar = mczVar.f21570a;
        this.q.e = list.size();
        ieu ieuVar = this.x;
        t8z t8zVar = this.e;
        if (!z && this.b) {
            this.c = mczVar;
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                if (ieuVar.o() && nczVar != null && nczVar.f23317a == t8zVar.b.l() && i == t8zVar.c.l()) {
                    ieuVar.q();
                }
                return;
            } finally {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            }
        }
        if (z) {
            this.b = true;
        }
        ((hgk0) this.v).setValue(Boolean.valueOf(((nczVar != null ? nczVar.f23317a : 0) == 0 && i == 0) ? false : true));
        ((hgk0) this.u).setValue(Boolean.valueOf(mczVar.c));
        this.h -= mczVar.d;
        ((hgk0) this.f).setValue(mczVar);
        if (z2) {
            t8zVar.getClass();
            if (i < 0.0f) {
                adx.c("scrollOffset should be non-negative");
            }
            t8zVar.c.m(i);
        } else {
            ncz nczVar2 = (ncz) CollectionsKt.firstOrNull(list);
            ncz nczVar3 = (ncz) CollectionsKt.f0(list);
            ahy.k0(nczVar2 != null ? nczVar2.f23317a : -1L, "firstVisibleItem:index");
            ahy.k0(nczVar3 != null ? nczVar3.f23317a : -1L, "lastVisibleItem:index");
            t8zVar.getClass();
            t8zVar.e = nczVar != null ? nczVar.l : null;
            if (t8zVar.d || mczVar.o > 0) {
                t8zVar.d = true;
                if (i < 0.0f) {
                    adx.c("scrollOffset should be non-negative");
                }
                t8zVar.a(nczVar != null ? nczVar.f23317a : 0, i);
            }
            if (this.k) {
                this.f40671a.a(this.r, mczVar);
            }
        }
        if (z) {
            ieuVar.s(mczVar.f, mczVar.i, mczVar.h);
        }
    }

    public final int h() {
        return this.e.b.l();
    }

    public final int i() {
        return this.e.c.l();
    }

    public final mcz j() {
        return (mcz) ((hgk0) this.f).getValue();
    }

    public final void k(int i, int i2) {
        if (this.j.a()) {
            qjj.W(((mcz) ((hgk0) this.f).getValue()).h, null, null, new wi6(this, null, (byte) 5), 3);
        }
        m(i, i2, false);
    }

    public final Object l(int i, int i2, yje yjeVar) {
        Object objB = b(c050.f3507a, new c9z(this, i, i2, null, (byte) 1), yjeVar);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final void m(int i, int i2, boolean z) {
        t8z t8zVar = this.e;
        if (t8zVar.b.l() != i || t8zVar.c.l() != i2) {
            dbz dbzVar = this.o;
            dbzVar.e();
            dbzVar.b = null;
            dbzVar.c = -1;
            Object obj = this.f40671a;
            sj9 sj9Var = obj instanceof sj9 ? (sj9) obj : null;
            if (sj9Var != null) {
                sj9Var.k();
            }
        }
        t8zVar.a(i, i2);
        t8zVar.e = null;
        if (!z) {
            m8x.Z(this.t);
            return;
        }
        e7z e7zVar = this.l;
        if (e7zVar != null) {
            e7zVar.l();
        }
    }

    public xcz(int i, int i2) {
        this(i, i2, new pvj(2));
    }

    public xcz(uwq uwqVar, int i, int i2) {
        this(i, i2, new fcz(uwqVar));
    }

    public /* synthetic */ xcz(int i, int i2, int i3) {
        this((i2 & 1) != 0 ? 0 : i, 0);
    }
}
