package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.segmented_control.DsSegmentItem;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lqm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20493a;
    public final /* synthetic */ DsSegmentedGroup b;

    public /* synthetic */ lqm(DsSegmentedGroup dsSegmentedGroup, byte b) {
        this.f20493a = b;
        this.b = dsSegmentedGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20493a;
        DsSegmentedGroup dsSegmentedGroup = this.b;
        DsSegmentItem dsSegmentItem = (DsSegmentItem) obj;
        switch (b) {
            case 0:
                return DsSegmentedGroup.d(dsSegmentedGroup, dsSegmentItem);
            default:
                int i = DsSegmentedGroup.o;
                dsSegmentItem.getClass();
                dsSegmentedGroup.h(dsSegmentItem, true);
                dsSegmentedGroup.i(dsSegmentItem, true);
                dsSegmentedGroup.g(true);
                return Unit.f46060a;
        }
    }
}
