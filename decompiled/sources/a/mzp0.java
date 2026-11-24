package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final class mzp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nzp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzp0(nzp0 nzp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nzp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nzp0 nzp0Var = this.k;
        switch (b) {
            case 0:
                mzp0 mzp0Var = new mzp0(nzp0Var, yjeVar, (byte) 0);
                mzp0Var.j = ((Boolean) obj).booleanValue();
                return mzp0Var;
            case 1:
                return new mzp0(nzp0Var, yjeVar, (byte) 1);
            default:
                return new mzp0(nzp0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mzp0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mzp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mzp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        nzp0 nzp0Var = this.k;
        Object obj2 = null;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((fzp0) nzp0Var.D()).f10419a || (z && ((fzp0) nzp0Var.D()).b)) {
                    nzp0Var.M();
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    osc oscVar = nzp0Var.v;
                    this.j = true;
                    xyp0 xyp0Var = oscVar.f25776a;
                    xyp0Var.getClass();
                    typ0 typ0Var = xyp0Var.c;
                    lun lunVar = lun.f20680a;
                    lunVar.getClass();
                    mxp0 mxp0Var = new mxp0(lunVar);
                    typ0Var.getClass();
                    typ0Var.f34767a = mxp0Var;
                    TennisSummaryFilterModel.Companion.getClass();
                    typ0Var.b.n(TennisSummaryFilterModel.d);
                    if (Unit.f46060a == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                x4u x4uVar = nzp0Var.t;
                oyg0 oyg0Var = nzp0Var.f;
                ocj ocjVar = nzp0Var.i;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    psu psuVar = nzp0Var.u;
                    String str = nzp0Var.p;
                    this.j = true;
                    Object objA = psuVar.f27531a.a(str, this);
                    if (objA != wneVar3) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = nzp0.z;
                vzg0 vzg0Var = nzp0Var.o;
                TennisSummaryFilterModel tennisSummaryFilterModelF = (TennisSummaryFilterModel) vzg0Var.a("SUMMARY_FILTER_KEY");
                TennisSummaryFilterModel tennisSummaryFilterModel = ((fzp0) nzp0Var.D()).f;
                TennisSummaryFilterModel.Companion.getClass();
                TennisSummaryFilterModel tennisSummaryFilterModel2 = TennisSummaryFilterModel.d;
                if (!Intrinsics.d(tennisSummaryFilterModel, tennisSummaryFilterModel2)) {
                    tennisSummaryFilterModelF = ((fzp0) nzp0Var.D()).f;
                } else if (!Intrinsics.d(((fzp0) nzp0Var.D()).f, tennisSummaryFilterModel2) || tennisSummaryFilterModelF == null) {
                    tennisSummaryFilterModelF = x4uVar.f();
                }
                TennisSummaryFilterModel tennisSummaryFilterModel3 = tennisSummaryFilterModelF;
                vzg0Var.e("SUMMARY_FILTER_KEY", tennisSummaryFilterModel3);
                qjj.W(jiu0.a(nzp0Var), null, null, new lcl0(nzp0Var, tennisSummaryFilterModel3, null, (byte) 25), 3);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, fzp0.a((fzp0) value, false, false, false, null, false, tennisSummaryFilterModel3, 63)));
                TennisSummaryFilterModel tennisSummaryFilterModel4 = ((fzp0) nzp0Var.D()).f;
                boolean z4 = !Intrinsics.d(tennisSummaryFilterModel4, x4uVar.f());
                b8u b8uVar = nzp0Var.x;
                b8uVar.getClass();
                tennisSummaryFilterModel4.getClass();
                xyp0 xyp0Var2 = (xyp0) b8uVar.f2175a;
                xyp0Var2.getClass();
                typ0 typ0Var2 = xyp0Var2.c;
                typ0Var2.getClass();
                Map map = typ0Var2.f34767a.f22569a;
                String str2 = tennisSummaryFilterModel4.f47097a;
                TennisSurfaceType tennisSurfaceType = tennisSummaryFilterModel4.b;
                List list = (List) map.get(str2);
                if (list != null) {
                    if (tennisSurfaceType == TennisSurfaceType.ALL || tennisSurfaceType == TennisSurfaceType.UNKNOWN) {
                        obj2 = (uyp0) CollectionsKt.firstOrNull(list);
                    } else {
                        for (Object obj3 : list) {
                            if (((uyp0) obj3).b == tennisSurfaceType) {
                                obj2 = obj3;
                                obj2 = (uyp0) obj2;
                            }
                        }
                        obj2 = (uyp0) obj2;
                    }
                }
                uyp0 uyp0Var = obj2;
                if (uyp0Var != 0) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, fzp0.a((fzp0) value3, false, false, false, uyp0Var, z4, tennisSummaryFilterModel4, 8)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, fzp0.a((fzp0) value2, false, false, true, null, false, null, 120)));
                }
                return Unit.f46060a;
        }
    }
}
