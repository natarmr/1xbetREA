package a;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rdk extends ock implements ire0 {
    public final ihy h;
    public final String i;
    public final String j;
    public final Object k;
    public final a8z l;
    public final mre0 m;
    public static final /* synthetic */ iiy[] o = {new j0d0(rdk.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final ddk n = new ddk();
    public static final Object p = new Object();

    public rdk(ihy ihyVar, String str, String str2, d0d0 d0d0Var, Object obj, rgy rgyVar) {
        super(rgyVar);
        this.h = ihyVar;
        this.i = str;
        this.j = str2;
        this.k = obj;
        this.l = maz.a(wez.f39042a, new bdk(this, (byte) 0));
        this.m = bww.S(d0d0Var, new bdk(this, (byte) 1));
    }

    public final Member A() {
        if (!z().v()) {
            return null;
        }
        qlc qlcVar = sog0.f32540a;
        g1x g1xVarB = sog0.b(z());
        if (g1xVarB instanceof qfy) {
            qfy qfyVar = (qfy) g1xVarB;
            h950 h950Var = qfyVar.d;
            xfy xfyVar = qfyVar.c;
            if ((xfyVar.b & 16) == 16) {
                vfy vfyVar = xfyVar.g;
                int i = vfyVar.b;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.h.B(h950Var.getString(vfyVar.c), h950Var.getString(vfyVar.d));
            }
        }
        return y();
    }

    @Override // a.ock
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final d0d0 z() {
        iiy iiyVar = o[0];
        Object objInvoke = this.m.invoke();
        objInvoke.getClass();
        return (d0d0) objInvoke;
    }

    public abstract fdk C();

    @Override // a.dre0
    public final bv9 G() {
        C().getClass();
        return null;
    }

    @Override // a.dre0
    public final ihy K() {
        return this.h;
    }

    @Override // a.dre0
    public final Object L() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        ire0 ire0VarC = xtt0.c(obj);
        return ire0VarC != null && Intrinsics.d(this.h, ire0VarC.K()) && Intrinsics.d(this.i, ire0VarC.getName()) && Intrinsics.d(this.j, ire0VarC.getSignature()) && Intrinsics.d(this.k, ire0VarC.L());
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.h, this.j);
    }

    @Override // a.qgy
    public final String getName() {
        return this.i;
    }

    @Override // a.ire0
    public final String getSignature() {
        return this.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(this.h.hashCode() * 31, 31, this.i);
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        rv00.k(sb, this);
        sb.append(this instanceof uhy ? "var " : "val ");
        rv00.m(sb, this);
        rv00.l(this.i, sb);
        sb.append(": ");
        sb.append(rv00.z(getReturnType(), false));
        return sb.toString();
    }

    @Override // a.ock
    public final wdk u() {
        wsy returnType = z().getReturnType();
        returnType.getClass();
        return new wdk(returnType, xvw.R(this) ? null : new bdk(this, (byte) 2), false);
    }

    @Override // a.dre0
    public final bv9 x() {
        return C().x();
    }

    @Override // a.ire0
    public final Field y() {
        return (Field) this.l.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rdk(ihy ihyVar, String str, String str2, Object obj) {
        this(ihyVar, str, str2, null, obj, rgy.k);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rdk(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        String strB = d0d0Var.getName().b();
        strB.getClass();
        this(ihyVar, strB, sog0.b(d0d0Var).o(), d0d0Var, op9.NO_RECEIVER, rgyVar);
    }
}
