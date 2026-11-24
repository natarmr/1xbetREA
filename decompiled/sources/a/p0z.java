package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p0z implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26176a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0z(k050 k050Var, j050 j050Var) {
        this.f26176a = (byte) 17;
        this.b = k050Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        h6a0 h6a0Var = (h6a0) this.b;
        yhg0 yhg0Var = (yhg0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yhg0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            u7x.i(yhg0Var.a(1.0f, jm40.b, true), h6a0Var.b, h6a0Var.g, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        epb0 epb0Var = (epb0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xww.l(0, fetVar, epb0Var.b, null);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        l8c0 l8c0Var = (l8c0) this.b;
        u4s u4sVar = (u4s) obj;
        ((Integer) obj2).getClass();
        u4sVar.getClass();
        l8c0Var.invoke(u4sVar);
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        nac0 nac0Var = (nac0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            v8q0.a(((edc0) nac0Var.b).f7610a, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 384, 126970);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) throws Throwable {
        lac0 lac0Var = (lac0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xww.m(null, lac0Var.c, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0277  */
    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:105:0x028b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0290  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a0 A[Catch: Exception -> 0x02a5, TRY_LEAVE, TryCatch #0 {Exception -> 0x02a5, blocks: (B:109:0x0294, B:111:0x02a0), top: B:400:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0250  */
    /* JADX WARN: Code duplicated, block: B:95:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0266  */
    /* JADX WARN: Code duplicated, block: B:97:0x026f  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v51 java.lang.Object, still in use, count: 2, list:
          (r4v51 java.lang.Object) from 0x0246: PHI (r4 I:??) = (r4v48 java.lang.Object), (r4v51 java.lang.Object) binds: [B:86:0x0245, B:406:0x0246] A[DONT_GENERATE, DONT_INLINE]
          (r4v51 java.lang.Object) from 0x023e: CHECK_CAST (a.kr5) (r4v51 java.lang.Object)
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
    @Override // a.xdr
    public final java.lang.Object F(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 3220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p0z.F(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p0z(Object obj, byte b) {
        this.f26176a = b;
        this.b = obj;
    }
}
