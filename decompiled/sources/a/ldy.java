package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ldy implements scy, bwn, cld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19876a;
    public final vby b;
    public final Function1 c;
    public final dcy d;
    public String e;
    public String f;
    public final /* synthetic */ byte g;
    public Object h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ldy(vby vbyVar, Function1 function1, byte b) {
        this(vbyVar, function1, 0);
        this.g = b;
        function1.getClass();
        switch (b) {
            case 1:
                this(vbyVar, function1, 0);
                this.h = new LinkedHashMap();
                break;
            case 2:
                this(vbyVar, function1, 0);
                this.h = new ArrayList();
                break;
            default:
                this.f19876a.add("primitive");
                break;
        }
    }

    @Override // a.bwn
    public final bwn A(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (CollectionsKt.f0(this.f19876a) == null) {
            return new ldy(this.b, this.c, (byte) 0).A(ugi0Var);
        }
        if (this.e != null) {
            this.f = ugi0Var.h();
        }
        return I(L(), ugi0Var);
    }

    @Override // a.bwn
    public final void B(int i) {
        String str = (String) L();
        str.getClass();
        M(ncy.b(Integer.valueOf(i)), str);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    @Override // a.bwn
    public final void C(jiy jiyVar, Object obj) {
        String strA;
        jiy jiyVarU;
        jiyVar.getClass();
        Object objF0 = CollectionsKt.f0(this.f19876a);
        vby vbyVar = this.b;
        if (objF0 == null) {
            ugi0 ugi0VarL = yqm0.l(jiyVar.getDescriptor(), vbyVar.b);
            if ((ugi0VarL.l() instanceof zvb0) || ugi0VarL.l() == zgi0.b) {
                new ldy(vbyVar, this.c, (byte) 0).C(jiyVar, obj);
                return;
            }
        }
        boolean z = jiyVar instanceof l4;
        olc olcVar = vbyVar.f37162a.h;
        if (!z) {
            int iOrdinal = olcVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c3x c3xVarL = jiyVar.getDescriptor().l();
                    strA = (Intrinsics.d(c3xVarL, aum0.b) || Intrinsics.d(c3xVarL, aum0.e)) ? u7x.A(vbyVar, jiyVar.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
            }
        } else if (olcVar != olc.f25445a) {
        }
        if (z) {
            l4 l4Var = (l4) jiyVar;
            if (obj == null) {
                e9d0.u(l4Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            jiyVarU = a8k0.u(l4Var, this, obj);
        } else {
            jiyVarU = jiyVar;
        }
        if (strA != null) {
            u7x.y(vbyVar, jiyVar, jiyVarU, strA);
            u7x.z(jiyVarU.getDescriptor().l());
            String strH = jiyVarU.getDescriptor().h();
            this.e = strA;
            this.f = strH;
        }
        jiyVarU.serialize(this, obj);
    }

    @Override // a.cld
    public final void D(ugi0 ugi0Var, int i, char c) {
        ugi0Var.getClass();
        M(ncy.c(String.valueOf(c)), K(ugi0Var, i));
    }

    @Override // a.bwn
    public final void E(String str) {
        str.getClass();
        String str2 = (String) L();
        str2.getClass();
        M(ncy.c(str), str2);
    }

    public final void F(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        this.f19876a.add(K(ugi0Var, i));
        if (jiyVar.getDescriptor().b()) {
            C(jiyVar, obj);
        } else if (obj == null) {
            q();
        } else {
            C(jiyVar, obj);
        }
    }

    public final void G(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        M(ncy.b(Double.valueOf(d)), str);
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw xww.c(Double.valueOf(d), str);
        }
    }

    public final void H(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        M(ncy.b(Float.valueOf(f)), str);
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw xww.c(Float.valueOf(f), str);
        }
    }

    public final bwn I(Object obj, ugi0 ugi0Var) {
        String str = (String) obj;
        str.getClass();
        ugi0Var.getClass();
        if (zrm0.a(ugi0Var)) {
            return new u2(this, str);
        }
        if (ugi0Var.isInline() && ugi0Var.equals(ncy.f23316a)) {
            return new u2(this, str, ugi0Var);
        }
        this.f19876a.add(str);
        return this;
    }

    public mcy J() {
        switch (this.g) {
            case 0:
                mcy mcyVar = (mcy) this.h;
                if (mcyVar != null) {
                    return mcyVar;
                }
                jf4.o("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new edy((LinkedHashMap) this.h);
            default:
                return new yby((ArrayList) this.h);
        }
    }

    public final String K(ugi0 ugi0Var, int i) {
        String strValueOf;
        ugi0Var.getClass();
        byte b = this.g;
        ugi0Var.getClass();
        switch (b) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                ady.d(this.b, ugi0Var);
                strValueOf = ugi0Var.e(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public final Object L() {
        ArrayList arrayList = this.f19876a;
        if (!arrayList.isEmpty()) {
            return hne.k(1, arrayList);
        }
        v4i0.n("No tag in stack for requested element");
        return null;
    }

    public void M(mcy mcyVar, String str) {
        byte b = this.g;
        str.getClass();
        mcyVar.getClass();
        switch (b) {
            case 0:
                if (str != "primitive") {
                    jf4.o("This output can only consume primitives with 'primitive' tag");
                } else if (((mcy) this.h) != null) {
                    jf4.o("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.h = mcyVar;
                    this.c.invoke(mcyVar);
                }
                break;
            case 1:
                ((LinkedHashMap) this.h).put(str, mcyVar);
                break;
            default:
                ((ArrayList) this.h).add(Integer.parseInt(str), mcyVar);
                break;
        }
    }

    @Override // a.bwn
    public final cld a(ugi0 ugi0Var) {
        ldy ldyVar;
        ugi0Var.getClass();
        Function1 t1Var = CollectionsKt.f0(this.f19876a) == null ? this.c : new t1(this, (byte) 1);
        c3x c3xVarL = ugi0Var.l();
        boolean zD = Intrinsics.d(c3xVarL, aum0.c);
        vby vbyVar = this.b;
        if (zD || (c3xVarL instanceof tua0)) {
            ldyVar = new ldy(vbyVar, t1Var, (byte) 2);
        } else if (Intrinsics.d(c3xVarL, aum0.d)) {
            ugi0 ugi0VarL = yqm0.l(ugi0Var.g(0), vbyVar.b);
            c3x c3xVarL2 = ugi0VarL.l();
            if (!(c3xVarL2 instanceof zvb0) && !Intrinsics.d(c3xVarL2, zgi0.b)) {
                throw xww.d(ugi0VarL);
            }
            t1Var.getClass();
            rdy rdyVar = new rdy(vbyVar, t1Var, (byte) 1);
            rdyVar.j = true;
            ldyVar = rdyVar;
        } else {
            ldyVar = new ldy(vbyVar, t1Var, (byte) 1);
        }
        String str = this.e;
        if (str != null) {
            if (ldyVar instanceof rdy) {
                rdy rdyVar2 = (rdy) ldyVar;
                rdyVar2.M(ncy.c(str), "key");
                String strH = this.f;
                if (strH == null) {
                    strH = ugi0Var.h();
                }
                rdyVar2.M(ncy.c(strH), "value");
            } else {
                String strH2 = this.f;
                if (strH2 == null) {
                    strH2 = ugi0Var.h();
                }
                ldyVar.M(ncy.c(strH2), str);
            }
            this.e = null;
            this.f = null;
        }
        return ldyVar;
    }

    @Override // a.bwn
    public final qaj b() {
        return this.b.b;
    }

    @Override // a.cld
    public final void c(ugi0 ugi0Var) {
        ugi0Var.getClass();
        if (!this.f19876a.isEmpty()) {
            L();
        }
        this.c.invoke(J());
    }

    @Override // a.scy
    public final vby d() {
        return this.b;
    }

    @Override // a.cld
    public final void e(vvb0 vvb0Var, int i, short s) {
        M(ncy.b(Short.valueOf(s)), K(vvb0Var, i));
    }

    @Override // a.scy
    public final void f(edy edyVar) {
        C(qcy.f28507a, edyVar);
    }

    @Override // a.bwn
    public final void g(double d) {
        G(L(), d);
    }

    @Override // a.bwn
    public final void h(byte b) {
        String str = (String) L();
        str.getClass();
        M(ncy.b(Byte.valueOf(b)), str);
    }

    @Override // a.cld
    public final void i(int i, int i2, ugi0 ugi0Var) {
        ugi0Var.getClass();
        M(ncy.b(Integer.valueOf(i2)), K(ugi0Var, i));
    }

    @Override // a.cld
    public final void j(ugi0 ugi0Var, int i, double d) {
        ugi0Var.getClass();
        G(K(ugi0Var, i), d);
    }

    @Override // a.cld
    public final void k(vvb0 vvb0Var, int i, byte b) {
        M(ncy.b(Byte.valueOf(b)), K(vvb0Var, i));
    }

    @Override // a.bwn
    public final void l(long j) {
        String str = (String) L();
        str.getClass();
        M(ncy.b(Long.valueOf(j)), str);
    }

    @Override // a.cld
    public final void m(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        ugi0Var.getClass();
        jiyVar.getClass();
        this.f19876a.add(K(ugi0Var, i));
        C(jiyVar, obj);
    }

    @Override // a.cld
    public final void n(ugi0 ugi0Var, int i, long j) {
        ugi0Var.getClass();
        M(ncy.b(Long.valueOf(j)), K(ugi0Var, i));
    }

    @Override // a.cld
    public final void o(ugi0 ugi0Var, int i, float f) {
        ugi0Var.getClass();
        H(K(ugi0Var, i), f);
    }

    @Override // a.cld
    public void p(ugi0 ugi0Var, int i, jiy jiyVar, Object obj) {
        switch (this.g) {
            case 1:
                ugi0Var.getClass();
                jiyVar.getClass();
                if (obj != null || this.d.c) {
                    F(ugi0Var, i, jiyVar, obj);
                }
                break;
            default:
                F(ugi0Var, i, jiyVar, obj);
                break;
        }
    }

    @Override // a.bwn
    public final void q() {
        String str = (String) CollectionsKt.f0(this.f19876a);
        if (str == null) {
            this.c.invoke(bdy.INSTANCE);
        } else {
            M(bdy.INSTANCE, str);
        }
    }

    @Override // a.bwn
    public final void r(short s) {
        String str = (String) L();
        str.getClass();
        M(ncy.b(Short.valueOf(s)), str);
    }

    @Override // a.bwn
    public final void s(boolean z) {
        String str = (String) L();
        str.getClass();
        M(ncy.a(Boolean.valueOf(z)), str);
    }

    @Override // a.bwn
    public final void t(float f) {
        H(L(), f);
    }

    @Override // a.cld
    public final boolean u(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return false;
    }

    @Override // a.cld
    public final bwn v(vvb0 vvb0Var, int i) {
        return I(K(vvb0Var, i), vvb0Var.g(i));
    }

    @Override // a.bwn
    public final void w(char c) {
        String str = (String) L();
        str.getClass();
        M(ncy.c(String.valueOf(c)), str);
    }

    @Override // a.cld
    public final void x(ugi0 ugi0Var, int i, boolean z) {
        ugi0Var.getClass();
        M(ncy.a(Boolean.valueOf(z)), K(ugi0Var, i));
    }

    @Override // a.bwn
    public final void y(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        String str = (String) L();
        str.getClass();
        M(ncy.c(ugi0Var.e(i)), str);
    }

    @Override // a.cld
    public final void z(ugi0 ugi0Var, int i, String str) {
        ugi0Var.getClass();
        str.getClass();
        M(ncy.c(str), K(ugi0Var, i));
    }

    public ldy(vby vbyVar, Function1 function1, int i) {
        this.f19876a = new ArrayList();
        this.b = vbyVar;
        this.c = function1;
        this.d = vbyVar.f37162a;
    }
}
