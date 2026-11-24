package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.xplatform.aggregator.impl.core.data.models.AggregatorClearRecentGamesResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ei0 f7833a;
    private static final ugi0 descriptor;

    static {
        ei0 ei0Var = new ei0();
        f7833a = ei0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorClearRecentGamesResponse", ei0Var, 1);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        ehi0 ehi0Var = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new AggregatorClearRecentGamesResponse(i, str, ehi0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        AggregatorClearRecentGamesResponse aggregatorClearRecentGamesResponse = (AggregatorClearRecentGamesResponse) obj;
        aggregatorClearRecentGamesResponse.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        AggregatorClearRecentGamesResponse.write$Self$impl(aggregatorClearRecentGamesResponse, cldVarA, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
