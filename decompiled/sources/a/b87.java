package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b87 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2143a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b87(lbu lbuVar, vzg0 vzg0Var, e1u e1uVar, MlbbGameScreenParams mlbbGameScreenParams, wyu wyuVar, pru pruVar, luu luuVar, r9u r9uVar, ctf0 ctf0Var) {
        this.f2143a = (byte) 3;
        this.d = lbuVar;
        this.c = vzg0Var;
        this.e = e1uVar;
        this.f = mlbbGameScreenParams;
        this.g = wyuVar;
        this.b = pruVar;
        this.h = luuVar;
        this.j = r9uVar;
        this.i = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02dd  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v15 java.lang.Object, still in use, count: 2, list:
          (r14v15 java.lang.Object) from 0x02d9: PHI (r14 I:??) = (r14v11 java.lang.Object), (r14v15 java.lang.Object) binds: [B:72:0x02d8, B:123:0x02d9] A[DONT_GENERATE, DONT_INLINE]
          (r14v15 java.lang.Object) from 0x02c9: CHECK_CAST (org.xplatform.bet_history.history.domain.model.HistoryTypeModel) (r14v15 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b87.invoke():java.lang.Object");
    }

    public /* synthetic */ b87(pru pruVar, bzt bztVar, uyn uynVar, ctf0 ctf0Var, evt evtVar, n4u n4uVar, svu svuVar, bzu bzuVar, j1q0 j1q0Var) {
        this.f2143a = (byte) 2;
        this.b = pruVar;
        this.i = bztVar;
        this.c = uynVar;
        this.d = ctf0Var;
        this.e = evtVar;
        this.f = n4uVar;
        this.g = svuVar;
        this.h = bzuVar;
        this.j = j1q0Var;
    }

    public /* synthetic */ b87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        this.f2143a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
    }
}
