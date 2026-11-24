package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wp8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39531a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wp8(pz40 pz40Var, xcz xczVar, ugd ugdVar, boolean z, ugd ugdVar2, ugd ugdVar3) {
        this.f39531a = (byte) 2;
        this.c = pz40Var;
        this.d = xczVar;
        this.e = ugdVar;
        this.b = z;
        this.f = ugdVar2;
        this.g = ugdVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r8q0 r8q0Var;
        j6z j6zVar;
        j6z j6zVar2;
        byte b = this.f39531a;
        boolean z = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                xpj0 xpj0Var = (xpj0) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                vne vneVar = (vne) obj2;
                abi0 abi0Var = (abi0) obj;
                if (xpj0Var.e.j().f23849a.size() > 1 && z) {
                    ypj0 ypj0VarC = xpj0Var.c();
                    ypj0 ypj0Var = ypj0.c;
                    qv2 qv2Var = xpj0Var.e;
                    if (ypj0VarC == ypj0Var) {
                        if (((Boolean) ((Function1) qv2Var.e).invoke(ypj0.b)).booleanValue()) {
                            vp8 vp8Var = new vp8(vneVar, xpj0Var, b2);
                            iiy[] iiyVarArr = yai0.f42300a;
                            abi0Var.b(mai0.t, new m6(str, vp8Var));
                        }
                    } else if (((Boolean) ((Function1) qv2Var.e).invoke(ypj0Var)).booleanValue()) {
                        vp8 vp8Var2 = new vp8(vneVar, xpj0Var, (byte) 2);
                        iiy[] iiyVarArr2 = yai0.f42300a;
                        abi0Var.b(mai0.u, new m6(str2, vp8Var2));
                    }
                    if (!xpj0Var.c) {
                        vp8 vp8Var3 = new vp8(vneVar, xpj0Var, (byte) 3);
                        iiy[] iiyVarArr3 = yai0.f42300a;
                        abi0Var.b(mai0.v, new m6(str3, vp8Var3));
                    }
                }
                return Unit.f46060a;
            case 1:
                djz djzVar = (djz) obj6;
                pz40 pz40Var = djzVar.o;
                rhv0 rhv0Var = (rhv0) obj5;
                k7q0 k7q0Var = (k7q0) obj4;
                a8q0 a8q0Var = (a8q0) obj3;
                qe60 qe60Var = (qe60) obj2;
                j6z j6zVar3 = (j6z) obj;
                djzVar.h = j6zVar3;
                b9q0 b9q0VarD = djzVar.d();
                if (b9q0VarD != null) {
                    b9q0VarD.b = j6zVar3;
                }
                if (z) {
                    if (djzVar.a() == dmv.b) {
                        if (((Boolean) ((hgk0) djzVar.l).getValue()).booleanValue() && ((yez) rhv0Var).c()) {
                            k7q0Var.s();
                        } else {
                            k7q0Var.m();
                        }
                        ((hgk0) djzVar.m).setValue(Boolean.valueOf(cvm0.k(k7q0Var, true)));
                        ((hgk0) djzVar.n).setValue(Boolean.valueOf(cvm0.k(k7q0Var, false)));
                        ((hgk0) pz40Var).setValue(Boolean.valueOf(o9q0.c(a8q0Var.b)));
                    } else if (djzVar.a() == dmv.c) {
                        ((hgk0) pz40Var).setValue(Boolean.valueOf(cvm0.k(k7q0Var, true)));
                    }
                    dyb.f0(djzVar, a8q0Var, qe60Var);
                    b9q0 b9q0VarD2 = djzVar.d();
                    if (b9q0VarD2 != null && (r8q0Var = djzVar.e) != null && djzVar.b() && (j6zVar = b9q0VarD2.b) != null && j6zVar.h() && (j6zVar2 = b9q0VarD2.c) != null) {
                        a9q0 a9q0Var = b9q0VarD2.f2224a;
                        caz cazVar = new caz(j6zVar, (byte) 21);
                        jge0 jge0VarZ = k7x.z(j6zVar, true);
                        jge0 jge0VarP = k9x.p(j6zVar.m(jge0VarZ.g()), j6zVar.m(jge0VarZ.d()));
                        jge0 jge0VarW = j6zVar.w(j6zVar2, false);
                        if (Intrinsics.d((r8q0) r8q0Var.f30040a.b.get(), r8q0Var)) {
                            r8q0Var.b.c(a8q0Var, qe60Var, a9q0Var, cazVar, jge0VarP, jge0VarW);
                        }
                    }
                }
                return Unit.f46060a;
            default:
                pz40 pz40Var2 = (pz40) obj6;
                xcz xczVar = (xcz) obj5;
                ugd ugdVar = (ugd) obj4;
                ugd ugdVar2 = (ugd) obj3;
                ugd ugdVar3 = (ugd) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    xczVar.k(xczVar.h(), xczVar.i());
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    List list = (List) pz40Var2.getValue();
                    hczVar.f(list.size(), new d2p(new v1x((byte) 15), list, (byte) 27), new far(list, (byte) 24), new ugd(2039820996, true, new vp7(list, ugdVar, this.b, pz40Var2, ugdVar2, ugdVar3)));
                    return Unit.f46060a;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
        }
    }

    public /* synthetic */ wp8(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.f39531a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
