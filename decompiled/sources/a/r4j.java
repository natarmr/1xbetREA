package a;

import java.io.Serializable;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r4j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public byte j;
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Serializable m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4j(agk0 agk0Var, Pair pair, agk0 agk0Var2, int i, pz40 pz40Var, t33 t33Var, t33 t33Var2, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.l = agk0Var;
        this.m = pair;
        this.n = agk0Var2;
        this.k = i;
        this.o = pz40Var;
        this.p = t33Var;
        this.q = t33Var2;
        this.r = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        Object obj6 = this.n;
        Serializable serializable = this.m;
        switch (b) {
            case 0:
                r4j r4jVar = new r4j((hie0) serializable, (cr) obj6, (Set) obj5, (String) obj4, this.k, (Function0) obj3, (bmh) obj2, yjeVar);
                r4jVar.l = obj;
                return r4jVar;
            default:
                return new r4j((agk0) this.l, (Pair) serializable, (agk0) obj6, this.k, (pz40) obj5, (t33) obj4, (t33) obj3, (pz40) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((r4j) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x015c -> B:37:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:42:0x00df
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r4j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4j(hie0 hie0Var, cr crVar, Set set, String str, int i, Function0 function0, bmh bmhVar, yje yjeVar) {
        super(2, yjeVar);
        this.m = hie0Var;
        this.n = crVar;
        this.o = set;
        this.p = str;
        this.k = i;
        this.q = function0;
        this.r = bmhVar;
    }
}
