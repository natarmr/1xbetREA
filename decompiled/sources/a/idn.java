package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class idn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14594a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ pru c;
    public final /* synthetic */ r9u d;

    public /* synthetic */ idn(r9u r9uVar, pru pruVar, ctf0 ctf0Var, byte b) {
        this.f14594a = b;
        this.d = r9uVar;
        this.c = pruVar;
        this.b = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        udl0 udl0Var;
        Object op30Var;
        Object mkwVar;
        udl0 udl0Var2;
        byte b = this.f14594a;
        ctf0 ctf0Var = this.b;
        pru pruVar = this.c;
        r9u r9uVar = this.d;
        switch (b) {
            case 0:
                cdn cdnVar = (cdn) obj;
                cdnVar.getClass();
                ygp ygpVar = ygp.c;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                m1q0 m1q0Var = j1q0Var.f15748a;
                boolean zD = m1q0Var.d(ygpVar);
                int iOrdinal = pruVar.a().h1.ordinal();
                if (iOrdinal == 0) {
                    udl0Var = udl0.CLASSIC;
                } else if (iOrdinal == 1) {
                    udl0Var = udl0.ADVANCED;
                } else if (iOrdinal == 2) {
                    udl0Var = udl0.DASHBOARD;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    udl0Var = udl0.LITE;
                }
                return new hdn(cdnVar, zD, udl0Var, m1q0Var.d(ygp.o1), this.b);
            case 1:
                a820 a820Var = (a820) obj;
                a820Var.getClass();
                zvh0 zvh0Var = pruVar.a().g.x;
                ygp ygpVar2 = ygp.K1;
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                ctf0Var.getClass();
                if (!zD2) {
                    return new uf60(ctf0Var, zvh0Var, (byte) 1);
                }
                int iOrdinal2 = a820Var.r.ordinal();
                if (iOrdinal2 == 1) {
                    op30Var = new op30(a820Var, ctf0Var, zvh0Var);
                } else if (iOrdinal2 == 2) {
                    op30Var = new kh00(a820Var, ctf0Var, zvh0Var);
                } else {
                    if (iOrdinal2 != 3) {
                        return kun.c;
                    }
                    op30Var = new ecr(a820Var, ctf0Var, zvh0Var);
                }
                return op30Var;
            case 2:
                b820 b820Var = (b820) obj;
                b820Var.getClass();
                zvh0 zvh0Var2 = pruVar.a().g.x;
                ygp ygpVar3 = ygp.F1;
                j1q0 j1q0Var3 = r9uVar.f30104a;
                j1q0Var3.getClass();
                boolean zD3 = j1q0Var3.f15748a.d(ygpVar3);
                ctf0Var.getClass();
                if (!zD3) {
                    return new uf60(ctf0Var, zvh0Var2, (byte) 0);
                }
                int iOrdinal3 = b820Var.m.ordinal();
                if (iOrdinal3 == 1) {
                    mkwVar = new mkw(b820Var, ctf0Var, zvh0Var2);
                } else if (iOrdinal3 == 2) {
                    mkwVar = new xa9(b820Var, ctf0Var, zvh0Var2);
                } else {
                    if (iOrdinal3 != 3) {
                        return kun.b;
                    }
                    mkwVar = new ecr(b820Var, ctf0Var, zvh0Var2);
                }
                return mkwVar;
            default:
                m730 m730Var = (m730) obj;
                m730Var.getClass();
                ygp ygpVar4 = ygp.c;
                r9uVar.getClass();
                j1q0 j1q0Var4 = r9uVar.f30104a;
                j1q0Var4.getClass();
                m1q0 m1q0Var2 = j1q0Var4.f15748a;
                boolean zD4 = m1q0Var2.d(ygpVar4);
                int iOrdinal4 = pruVar.a().h1.ordinal();
                if (iOrdinal4 == 0) {
                    udl0Var2 = udl0.CLASSIC;
                } else if (iOrdinal4 == 1) {
                    udl0Var2 = udl0.ADVANCED;
                } else if (iOrdinal4 == 2) {
                    udl0Var2 = udl0.DASHBOARD;
                } else {
                    if (iOrdinal4 != 3) {
                        t9f.b();
                        return null;
                    }
                    udl0Var2 = udl0.LITE;
                }
                return new bfw(m730Var, zD4, udl0Var2, m1q0Var2.d(ygp.o1), this.b);
        }
    }

    public /* synthetic */ idn(ctf0 ctf0Var, pru pruVar, r9u r9uVar, byte b) {
        this.f14594a = b;
        this.b = ctf0Var;
        this.c = pruVar;
        this.d = r9uVar;
    }
}
