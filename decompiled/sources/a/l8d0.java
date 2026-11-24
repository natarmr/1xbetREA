package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l8d0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19599a = 0;
    public final ctf0 b;
    public final boolean c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final Object k;

    public l8d0(j8d0 j8d0Var, ctf0 ctf0Var) {
        pt0 pt0Var;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(j8d0Var.j);
        this.d = n0o0VarH;
        this.e = bkb.H(j8d0Var.h);
        this.f = bkb.H(j8d0Var.c);
        this.g = bkb.H(Boolean.valueOf(j8d0Var.d));
        this.h = bkb.H(j8d0Var.i);
        n0o0 n0o0VarH2 = bkb.H(0);
        int iOrdinal = ((sff0) ((fee) n0o0VarH.getValue()).c()).b.l.ordinal();
        if (iOrdinal == 0) {
            pt0Var = pt0.f27539a;
        } else if (iOrdinal == 1) {
            pt0Var = pt0.b;
        } else if (iOrdinal == 2) {
            pt0Var = pt0.c;
        } else if (iOrdinal == 3) {
            pt0Var = pt0.d;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                throw null;
            }
            pt0Var = pt0.e;
        }
        this.k = pt0Var;
        this.c = ((sff0) ((fee) n0o0VarH.getValue()).c()).b.C;
        this.i = bkb.G(((fee) n0o0VarH2.getValue()).d, new ljc0((byte) 17));
        this.j = bkb.G(((fee) n0o0VarH2.getValue()).d, new ljc0((byte) 18));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        rdt adtVar;
        byte b = this.f19599a;
        n0o0 n0o0Var = this.f;
        n0o0 n0o0Var2 = this.j;
        n0o0 n0o0Var3 = this.d;
        n0o0 n0o0Var4 = this.e;
        n0o0 n0o0Var5 = this.h;
        n0o0 n0o0Var6 = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                j8d0 j8d0Var = (j8d0) obj;
                pt0 pt0Var = (pt0) obj2;
                j8d0Var.getClass();
                ((fee) n0o0Var3.getValue()).d(j8d0Var.j);
                ((fee) n0o0Var4.getValue()).d(j8d0Var.h);
                n0o0 n0o0Var7 = this.g;
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(j8d0Var.d));
                ((fee) n0o0Var.getValue()).d(j8d0Var.c);
                ((fee) n0o0Var5.getValue()).d(j8d0Var.i);
                String str = (String) ((fee) n0o0Var.getValue()).c();
                e8d0 e8d0Var = (e8d0) ((fee) n0o0Var4.getValue()).c();
                if (e8d0Var != null) {
                    if (e8d0Var instanceof d8d0) {
                        adtVar = mdt.f21614a;
                    } else if (e8d0Var instanceof c8d0) {
                        adtVar = new gdt((mdm) ((fee) n0o0Var6.getValue()).b());
                    } else if (e8d0Var instanceof b8d0) {
                        a4x<mlr> a4xVar = ((b8d0) e8d0Var).f2151a;
                        if (a4xVar.isEmpty()) {
                            adtVar = new cdt((mdm) ((fee) n0o0Var2.getValue()).b());
                        } else {
                            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                            for (mlr mlrVar : a4xVar) {
                                arrayList.add(ccq0.Z(mlrVar, this.b, ((Boolean) ((fee) n0o0Var7.getValue()).c()).booleanValue(), this.c, ((Set) ((fee) n0o0Var5.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) obj2, null));
                            }
                            adtVar = new adt(new zll(pt0Var, xll.f41078a, arrayList));
                        }
                    }
                    return new k8d0(str, adtVar, pt0Var);
                }
                t9f.b();
                return null;
            default:
                l8e0 l8e0Var = (l8e0) obj;
                l8e0Var.getClass();
                ((fee) n0o0Var4.getValue()).d(l8e0Var.d);
                ((fee) n0o0Var3.getValue()).d(l8e0Var.c);
                ((fee) n0o0Var2.getValue()).d(l8e0Var.h);
                boolean z = l8e0Var.f19600a;
                boolean z2 = this.c;
                if (z) {
                    return new r8e0((g8e0) ((fee) n0o0Var5.getValue()).b(), (f9m0) ((fee) n0o0Var2.getValue()).b(), z2);
                }
                if (l8e0Var.b) {
                    return new q8e0((g8e0) ((fee) n0o0Var5.getValue()).b(), (f9m0) ((fee) n0o0Var2.getValue()).b(), z2, ocl.b((ocl) obj2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                ((fee) n0o0Var6.getValue()).d(l8e0Var.g);
                ((fee) n0o0Var.getValue()).d(l8e0Var.f);
                return new s8e0((g8e0) ((fee) n0o0Var5.getValue()).b(), (f9m0) ((fee) n0o0Var2.getValue()).b(), z2, (p8e0) ((fee) n0o0Var6.getValue()).b());
        }
    }

    public l8d0(l8e0 l8e0Var, ctf0 ctf0Var, ocl oclVar, boolean z) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.k = oclVar;
        this.c = z;
        n0o0 n0o0VarH = bkb.H(l8e0Var.c);
        this.d = n0o0VarH;
        this.e = bkb.H(l8e0Var.d);
        this.f = bkb.H(l8e0Var.f);
        this.g = bkb.H(l8e0Var.e);
        this.h = bkb.G(((fee) n0o0VarH.getValue()).d, new oac0(this, l8e0Var, (byte) 21));
        final byte b2 = 0;
        this.i = maz.b(new yw9(l8e0Var.g, new Function1(this) { // from class: a.u8e0
            public final /* synthetic */ l8d0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:157:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:166:0x00ef A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:169:0x00c6 A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v7 java.lang.Object, still in use, count: 2, list:
                  (r14v7 java.lang.Object) from 0x00eb: PHI (r14 I:??) = (r14v4 java.lang.Object), (r14v7 java.lang.Object) binds: [B:33:0x00ea, B:172:0x00eb] A[DONT_GENERATE, DONT_INLINE]
                  (r14v7 java.lang.Object) from 0x00e3: CHECK_CAST (a.j8e0) (r14v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r38) {
                /*
                    Method dump skipped, instruction units count: 1322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.u8e0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.j = maz.b(new yw9(l8e0Var.h, new Function1(this) { // from class: a.u8e0
            public final /* synthetic */ l8d0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:157:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:166:0x00ef A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:169:0x00c6 A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v7 java.lang.Object, still in use, count: 2, list:
                  (r14v7 java.lang.Object) from 0x00eb: PHI (r14 I:??) = (r14v4 java.lang.Object), (r14v7 java.lang.Object) binds: [B:33:0x00ea, B:172:0x00eb] A[DONT_GENERATE, DONT_INLINE]
                  (r14v7 java.lang.Object) from 0x00e3: CHECK_CAST (a.j8e0) (r14v7 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r38) {
                /*
                    Method dump skipped, instruction units count: 1322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.u8e0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }
}
