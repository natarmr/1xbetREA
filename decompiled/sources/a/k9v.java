package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k9v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17933a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k9v(mtv mtvVar, String str, String str2, zsb0 zsb0Var) {
        this.f17933a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = zsb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x037a  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x03df  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x0400  */
    /* JADX WARN: Code duplicated, block: B:134:0x040b  */
    /* JADX WARN: Code duplicated, block: B:135:0x040e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0417  */
    /* JADX WARN: Code duplicated, block: B:140:0x041d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0424  */
    /* JADX WARN: Code duplicated, block: B:144:0x042a  */
    /* JADX WARN: Code duplicated, block: B:146:0x042e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0436  */
    /* JADX WARN: Code duplicated, block: B:158:0x0496  */
    /* JADX WARN: Code duplicated, block: B:161:0x049e  */
    /* JADX WARN: Code duplicated, block: B:162:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x04b9 A[LOOP:6: B:163:0x04b3->B:165:0x04b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:177:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:178:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:180:0x0502  */
    /* JADX WARN: Code duplicated, block: B:181:0x0504  */
    /* JADX WARN: Code duplicated, block: B:186:0x050c  */
    /* JADX WARN: Code duplicated, block: B:193:0x051f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0536 A[LOOP:5: B:195:0x0530->B:197:0x0536, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x054e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0553 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x0555  */
    /* JADX WARN: Code duplicated, block: B:204:0x0575  */
    /* JADX WARN: Code duplicated, block: B:207:0x057e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0583  */
    /* JADX WARN: Code duplicated, block: B:210:0x0587  */
    /* JADX WARN: Code duplicated, block: B:211:0x058c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0590  */
    /* JADX WARN: Code duplicated, block: B:214:0x0593  */
    /* JADX WARN: Code duplicated, block: B:216:0x0596  */
    /* JADX WARN: Code duplicated, block: B:217:0x0599  */
    /* JADX WARN: Code duplicated, block: B:364:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fe  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v31 java.lang.Object, still in use, count: 2, list:
          (r7v31 java.lang.Object) from 0x035e: PHI (r7 I:??) = (r7v24 java.lang.Object), (r7v31 java.lang.Object) binds: [B:109:0x035d, B:368:0x035e] A[DONT_GENERATE, DONT_INLINE]
          (r7v31 java.lang.Object) from 0x0354: CHECK_CAST (a.lok0) (r7v31 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 3216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k9v.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ k9v(l7m0 l7m0Var, Function1 function1, Object obj, byte b) {
        this.f17933a = b;
        this.c = l7m0Var;
        this.b = function1;
        this.d = obj;
    }

    public /* synthetic */ k9v(Object obj, Object obj2, Object obj3, byte b) {
        this.f17933a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
