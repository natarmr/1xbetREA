package a;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 extends f3k implements gpa0, lky, qai0, vld, fe60, h7x, zlt {
    public String A = "idle";
    public yzj B;
    public jub0 Y;
    public rsw Z;
    public final jy40 f1;
    public long g1;
    public jub0 h1;
    public gy40 i1;
    public boolean j1;
    public c4m0 k1;
    public gy40 q;
    public d6x r;
    public boolean s;
    public String t;
    public ucg0 u;
    public boolean v;
    public Function0 w;
    public final uqq x;
    public d6x y;
    public amt z;

    public s1(gy40 gy40Var, d6x d6xVar, boolean z, boolean z2, String str, ucg0 ucg0Var, Function0 function0) {
        this.q = gy40Var;
        this.r = d6xVar;
        this.s = z;
        this.t = str;
        this.u = ucg0Var;
        this.v = z2;
        this.w = function0;
        this.x = new uqq(gy40Var, 0, new t0(1, this, s1.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 1));
        int i = f710.f9038a;
        this.f1 = new jy40(6);
        this.g1 = 0L;
        gy40 gy40Var2 = this.q;
        this.i1 = gy40Var2;
        this.j1 = gy40Var2 == null;
    }

    @Override // a.zlt
    public final String F() {
        return this.A;
    }

    @Override // a.qai0
    public final boolean J0() {
        return true;
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.fe60
    public final void R() {
        if (this.s) {
            c9x.B(this, new j1(this, (byte) 0));
        }
    }

    @Override // a.lm40
    public final void R0() {
        R();
        if (!this.j1) {
            k1();
        }
        if (this.v) {
            Z0(this.x);
        }
    }

    @Override // a.lm40
    public final void S0() {
        e1();
        if (this.i1 == null) {
            this.q = null;
        }
        yzj yzjVar = this.B;
        if (yzjVar != null) {
            a1(yzjVar);
        }
        this.B = null;
        amt amtVar = this.z;
        if (amtVar != null) {
            a1(amtVar);
        }
        this.z = null;
    }

    @Override // a.lky
    public final boolean c0(KeyEvent keyEvent) {
        return false;
    }

    public final boolean d1() {
        mie0 mie0Var = new mie0();
        etm0.t(this, amt.p, new dht(new cx2(mie0Var, (byte) 1), (byte) 6));
        if (mie0Var.f21842a == null) {
            int i = ntc.b;
            ViewParent parent = tdc.Z(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void e1() {
        gy40 gy40Var = this.q;
        jy40 jy40Var = this.f1;
        if (gy40Var != null) {
            jub0 jub0Var = this.Y;
            if (jub0Var != null) {
                gy40Var.b(new iub0(jub0Var));
            }
            jub0 jub0Var2 = this.h1;
            if (jub0Var2 != null) {
                gy40Var.b(new iub0(jub0Var2));
            }
            rsw rswVar = this.Z;
            if (rswVar != null) {
                gy40Var.b(new ssw(rswVar));
            }
            Object[] objArr = jy40Var.c;
            long[] jArr = jy40Var.f17342a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                gy40Var.b(new iub0((jub0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.Y = null;
        this.h1 = null;
        this.Z = null;
        jy40Var.a();
    }

    public final long f1(long j) {
        long jG0 = vcc.Z(this).z.G0(((wgu0) mbc.R(this, bmd.t)).f());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jG0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jG0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void g1(boolean z) {
        gy40 gy40Var = this.q;
        if (gy40Var != null) {
            c4m0 c4m0Var = this.k1;
            yje yjeVar = null;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                jub0 jub0Var = z ? this.h1 : this.Y;
                if (jub0Var != null) {
                    iub0 iub0Var = new iub0(jub0Var);
                    bby bbyVar = (bby) N0().getCoroutineContext().get(gqw0.o1);
                    qjj.W(N0(), null, null, new m1((Object) gy40Var, (Object) iub0Var, (Object) (bbyVar != null ? bbyVar.invokeOnCompletion(new k1(gy40Var, iub0Var, (byte) 0)) : null), yjeVar, (byte) 0), 3);
                }
            } else {
                c4m0 c4m0Var2 = this.k1;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
            }
            if (z) {
                this.h1 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.g1 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        k1();
        if (this.v) {
            if (this.z == null) {
                amt amtVar = new amt(this);
                Z0(amtVar);
                this.z = amtVar;
            }
            if (xoa0Var == xoa0.b) {
                int i = woa0Var.f;
                yje yjeVar = null;
                if (i == 4) {
                    qjj.W(N0(), null, null, new r1(this, yjeVar, (byte) 0), 3);
                } else if (i == 5) {
                    qjj.W(N0(), null, null, new r1(this, yjeVar, (byte) 1), 3);
                }
            }
        }
    }

    public final void h1(boolean z, long j) {
        gy40 gy40Var = this.q;
        if (gy40Var != null) {
            c4m0 c4m0Var = this.k1;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                jub0 jub0Var = z ? this.h1 : this.Y;
                if (jub0Var != null) {
                    qjj.W(N0(), null, null, new o1(jub0Var, gy40Var, null), 3);
                }
            } else {
                c4m0Var.cancel(null);
                qjj.W(N0(), null, null, new n1((Object) c4m0Var, j, (Object) gy40Var, (yje) null, (byte) 0), 3);
            }
            if (z) {
                this.h1 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void i1(x6x x6xVar) {
        gy40 gy40Var = this.q;
        if (gy40Var != null) {
            jub0 jub0Var = new jub0(x6xVar.c);
            yje yjeVar = null;
            if (d1()) {
                this.k1 = qjj.W(N0(), null, null, new p1(gy40Var, jub0Var, this, yjeVar, (byte) 0), 3);
            } else {
                this.h1 = jub0Var;
                qjj.W(N0(), null, null, new o1(gy40Var, jub0Var, yjeVar, (byte) 1), 3);
            }
        }
    }

    public final void j1(dpa0 dpa0Var) {
        gy40 gy40Var = this.q;
        if (gy40Var != null) {
            jub0 jub0Var = new jub0(dpa0Var.c);
            yje yjeVar = null;
            if (d1()) {
                this.k1 = qjj.W(N0(), null, null, new p1(gy40Var, jub0Var, this, yjeVar, (byte) 1), 3);
            } else {
                this.Y = jub0Var;
                qjj.W(N0(), null, null, new o1(gy40Var, jub0Var, yjeVar, (byte) 2), 3);
            }
        }
    }

    public final void k1() {
        if (this.B != null) {
            return;
        }
        d6x d6xVar = this.s ? this.y : this.r;
        if (d6xVar != null) {
            gy40 gy40Var = this.q;
            if (gy40Var == null) {
                gy40Var = new gy40();
                this.q = gy40Var;
            }
            this.x.e1(gy40Var);
            gy40 gy40Var2 = this.q;
            gy40Var2.getClass();
            yzj yzjVarA = d6xVar.a(gy40Var2);
            Z0(yzjVarA);
            this.B = yzjVarA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
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
    @Override // a.lky
    public final boolean l0(KeyEvent keyEvent) {
        boolean z;
        k1();
        long jC = n7x.C(keyEvent);
        boolean z2 = this.v;
        byte b = 3;
        yje yjeVar = null;
        jy40 jy40Var = this.f1;
        if (z2) {
            byte b2 = 2;
            if (n7x.H(keyEvent) == 2 && y860.d0(keyEvent)) {
                if (jy40Var.b(jC)) {
                    z = false;
                } else {
                    jub0 jub0Var = new jub0(this.g1);
                    jy40Var.g(jub0Var, jC);
                    if (this.q != null) {
                        qjj.W(N0(), null, null, new q1(this, jub0Var, yjeVar, b2), 3);
                    }
                    z = true;
                }
                if (m1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.v && n7x.H(keyEvent) == 1 && y860.d0(keyEvent)) {
            jub0 jub0Var2 = (jub0) jy40Var.f(jC);
            if (jub0Var2 != null) {
                if (this.q != null) {
                    qjj.W(N0(), null, null, new q1(this, jub0Var2, yjeVar, b), 3);
                }
                n1(keyEvent);
            }
            if (jub0Var2 != null) {
                return true;
            }
        }
        return false;
    }

    public boolean m1(KeyEvent keyEvent) {
        return false;
    }

    public void n1(KeyEvent keyEvent) {
        o1();
    }

    public final void o1() {
        dmk0 dmk0Var = (dmk0) mbc.R(this, bmd.v);
        if (dmk0Var != null) {
            dmk0Var.a();
        }
        this.w.invoke();
    }

    public final void p1(gy40 gy40Var, d6x d6xVar, boolean z, boolean z2, String str, ucg0 ucg0Var, Function0 function0) {
        boolean z3;
        boolean z4;
        yzj yzjVar;
        boolean z5 = true;
        if (Intrinsics.d(this.i1, gy40Var)) {
            z3 = false;
        } else {
            e1();
            this.i1 = gy40Var;
            this.q = gy40Var;
            z3 = true;
        }
        if (!Intrinsics.d(this.r, d6xVar)) {
            this.r = d6xVar;
            z3 = true;
        }
        if (this.s != z) {
            this.s = z;
            if (z) {
                R();
            }
            z3 = true;
        }
        boolean z6 = this.v;
        uqq uqqVar = this.x;
        if (z6 != z2) {
            if (z2) {
                Z0(uqqVar);
            } else {
                a1(uqqVar);
                e1();
            }
            s0x.S(this);
            if (!z2) {
                yzj yzjVar2 = this.z;
                if (yzjVar2 != null) {
                    a1(yzjVar2);
                }
                this.z = null;
                this.A = "idle";
            }
            this.v = z2;
        }
        if (!Intrinsics.d(this.t, str)) {
            this.t = str;
            s0x.S(this);
        }
        if (!Intrinsics.d(this.u, ucg0Var)) {
            this.u = ucg0Var;
            s0x.S(this);
        }
        this.w = function0;
        boolean z7 = this.j1;
        gy40 gy40Var2 = this.i1;
        if (z7 == (gy40Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = gy40Var2 == null;
            this.j1 = z4;
            if (z4 || this.B != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((yzjVar = this.B) != null || !z4)) {
            if (yzjVar != null) {
                a1(yzjVar);
            }
            this.B = null;
            k1();
        }
        uqqVar.e1(this.q);
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        ucg0 ucg0Var = this.u;
        if (ucg0Var != null) {
            yai0.e(abi0Var, ucg0Var.f35427a);
        }
        String str = this.t;
        j1 j1Var = new j1(this, (byte) 1);
        iiy[] iiyVarArr = yai0.f42300a;
        abi0Var.b(mai0.b, new m6(str, j1Var));
        if (this.v) {
            this.x.x0(abi0Var);
        } else {
            abi0Var.b(xai0.j, Unit.f46060a);
        }
        c1(abi0Var);
    }

    public void l1() {
    }

    public void c1(abi0 abi0Var) {
    }
}
