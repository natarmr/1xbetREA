package org.xplatform.aggregator.impl.core.navigation;

import a.as80;
import a.hm1;
import a.iiy;
import a.iun;
import a.m1r;
import a.tm1;
import a.vfc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AggregatorScreens$PartTypeOneScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AggregatorScreenModel f46305a;

    public AggregatorScreens$PartTypeOneScreen(AggregatorScreenModel aggregatorScreenModel) {
        this.f46305a = aggregatorScreenModel;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        as80.Y1.getClass();
        as80 as80Var = new as80();
        AggregatorScreenModel aggregatorScreenModel = this.f46305a;
        tm1 tm1Var = aggregatorScreenModel.d;
        hm1 hm1Var = tm1Var instanceof hm1 ? (hm1) tm1Var : null;
        iiy[] iiyVarArr = as80.Z1;
        as80Var.R1.J(as80Var, iiyVarArr[1], aggregatorScreenModel);
        String string = UUID.randomUUID().toString();
        string.getClass();
        as80Var.V1.x(as80Var, iiyVarArr[4], string);
        List list = hm1Var != null ? hm1Var.f13285a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        as80Var.S1.r(as80Var, iiyVarArr[2], CollectionsKt.M0(list));
        List list2 = hm1Var != null ? hm1Var.b : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        as80Var.U1.r(as80Var, iiyVarArr[3], CollectionsKt.M0(list2));
        return as80Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return vfc.I(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
