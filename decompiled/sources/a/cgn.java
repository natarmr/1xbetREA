package a;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cgn extends giv {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agn f4320a = agn.e;
    public final lhp b = lhp.f20068a;

    @Override // a.giv
    public final lhp a() {
        return this.b;
    }

    @Override // a.giv
    public final boolean b(n0a n0aVar, rrd rrdVar) {
        Set setA = n0aVar.a();
        setA.getClass();
        l8x.U("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setA + ", this = " + this);
        agn agnVar = this.f4320a;
        if (!setA.contains(agnVar)) {
            return false;
        }
        for (fot0 fot0Var : (List) rrdVar.g) {
            Set setK = fot0Var.k(n0aVar);
            l8x.U("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setK + ", this = " + this + ", useCases = " + fot0Var);
            if (setK != null && !setK.contains(agnVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f4320a + ')';
    }
}
