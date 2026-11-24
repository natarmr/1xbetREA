package a;

import java.util.ArrayList;
import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class db2 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5780a = 4;
    public final Object b;
    public final Object c;

    public db2(s93 s93Var) {
        Object obj;
        this.b = bkb.H(Long.valueOf(s93Var.c));
        Cnew cnew = s93Var.f31833a;
        this.c = maz.b(new yw9((cnew == null || (obj = cnew.b) == null) ? iun.f15405a : obj, new b33((Object) this, (byte) 3), (byte) 20));
    }

    public static a4x b(v5l0 v5l0Var) {
        ull0 ull0Var;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                ull0Var = pll0.f27189a;
            } else if (iOrdinal == 1) {
                ull0Var = tll0.f34152a;
            } else if (iOrdinal == 2) {
                ull0Var = sll0.f32406a;
            } else if (iOrdinal == 3) {
                ull0Var = rll0.f30703a;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                ull0Var = qll0.f28940a;
            }
            arrayList.add(new m2g0(new mla(ull0Var)));
        }
        return dyb.o0(arrayList);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object c(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r50v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public pmj0 a(boolean z) {
        oul oulVar = oul.e;
        ctf0 ctf0Var = (ctf0) this.b;
        String strA = ctf0Var.b.a(R.string.save, Arrays.copyOf(new Object[0], 0));
        oe9 oe9Var = oe9.f25112a;
        return new pmj0(new wul(oulVar, oe9Var, new ue9(strA), z, false, true), new wul(lul.e, oe9Var, new ue9(ctf0Var.b.a(R.string.share, Arrays.copyOf(new Object[0], 0))), z, false, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 a.bb2, still in use, count: 3, list:
          (r1v1 a.bb2) from 0x0620: MOVE (r36v1 a.bb2) = (r1v1 a.bb2) (LINE:1569)
          (r1v1 a.bb2) from 0x058a: PHI (r1v4 a.bb2) = (r1v1 a.bb2), (r1v11 a.bb2) binds: [B:178:0x0574, B:193:0x05c7] A[DONT_GENERATE, DONT_INLINE]
          (r1v1 a.bb2) from 0x04f1: MOVE (r36v5 a.bb2) = (r1v1 a.bb2) (LINE:1266)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.db2.invoke(java.lang.Object):java.lang.Object");
    }

    public db2(ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = oclVar;
    }

    public db2(ctf0 ctf0Var, sa10 sa10Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = sa10Var;
    }

    public db2(ctf0 ctf0Var, qho qhoVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = qhoVar;
    }

    public db2(ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        str.getClass();
        this.b = ctf0Var;
        this.c = str;
    }
}
