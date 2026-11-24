package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;
import org.xplatform.feed.notifictation.presentation.models.SubscriptionEventSettingsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class eke0 {
    public eke0(zie0 zie0Var, btt0 btt0Var, gii0 gii0Var) {
        btt0Var.getClass();
        gii0Var.getClass();
    }

    public static fxk0 b(String str, String str2, String str3, String str4) {
        return new fxk0(str, g950.e(str2), str3, str4);
    }

    public static wsf0 c(n0a n0aVar, rrd rrdVar) {
        jgp jgpVarA;
        rrc rrcVar = new rrc(n0aVar, (byte) 17);
        Set set = (Set) rrdVar.e;
        l8x.U("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + rrdVar + ", lensFacing = " + n0aVar.h());
        List list = (List) rrdVar.f;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) rrdVar.g;
        if (set.isEmpty() && list.isEmpty()) {
            jf4.o("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                fot0 fot0Var = (fot0) it.next();
                upt0.b.getClass();
                if (sxs0.a(fot0Var) == upt0.h) {
                    jgpVarA = new hgp(fot0Var);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            igp igpVarB = rrc.B((giv) obj, list2);
                            if (igpVarB != null) {
                                l8x.U("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + igpVarB);
                            } else {
                                igpVarB = null;
                            }
                            if (igpVarB == null) {
                                arrayList.add(obj);
                            }
                        }
                        l8x.U("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        jgpVarA = rrcVar.A(rrdVar, arrayList, 0, iun.f15405a);
                        break;
                    }
                    igp igpVarB2 = rrc.B((giv) it2.next(), list2);
                    if (igpVarB2 != null) {
                        jgpVarA = igpVarB2;
                        break;
                    }
                }
            }
        }
        if (jgpVarA instanceof fgp) {
            wsf0 wsf0Var = ((fgp) jgpVarA).f9503a;
            l8x.U("ResolvedFeatureGroup", "resolvedFeatureGroup = " + wsf0Var);
            return wsf0Var;
        }
        if (jgpVarA instanceof ggp) {
            jf4.o("Feature group is not supported");
            return null;
        }
        if (jgpVarA instanceof hgp) {
            throw new IllegalArgumentException(((hgp) jgpVarA).f13024a + " is not supported");
        }
        if (!(jgpVarA instanceof igp)) {
            t9f.b();
            return null;
        }
        igp igpVar = (igp) jgpVarA;
        e9d0.w(" must be added for ", igpVar.b, igpVar.f14744a);
        return null;
    }

    public void a(GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel, NotificationInfoUiModel notificationInfoUiModel, boolean z) {
        Object obj;
        Object next;
        gameSubscriptionSettingsScreenUiModel.getClass();
        ArrayList arrayList = gameSubscriptionSettingsScreenUiModel.c;
        j760 j760Var = notificationInfoUiModel.f46676a;
        long j = notificationInfoUiModel.d;
        int iOrdinal = j760Var.ordinal();
        if (iOrdinal == 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((PeriodSubscriptionSettingsScreenUiModel) it.next()).b.iterator();
                while (it2.hasNext()) {
                    ((SubscriptionEventSettingsUiModel) it2.next()).b = z;
                }
            }
            return;
        }
        if (iOrdinal == 1) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((PeriodSubscriptionSettingsScreenUiModel) obj2).f46679a.f46682a == j) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((PeriodSubscriptionSettingsScreenUiModel) it3.next()).b.iterator();
                while (it4.hasNext()) {
                    ((SubscriptionEventSettingsUiModel) it4.next()).b = z;
                }
            }
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        long j2 = notificationInfoUiModel.e;
        Iterator it5 = arrayList.iterator();
        do {
            obj = null;
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
        } while (((PeriodSubscriptionSettingsScreenUiModel) next).f46679a.f46682a != j);
        PeriodSubscriptionSettingsScreenUiModel periodSubscriptionSettingsScreenUiModel = (PeriodSubscriptionSettingsScreenUiModel) next;
        if (periodSubscriptionSettingsScreenUiModel != null) {
            for (Object obj3 : periodSubscriptionSettingsScreenUiModel.b) {
                if (((SubscriptionEventSettingsUiModel) obj3).f46680a.f46681a == j2) {
                    obj = obj3;
                    break;
                }
            }
            SubscriptionEventSettingsUiModel subscriptionEventSettingsUiModel = (SubscriptionEventSettingsUiModel) obj;
            if (subscriptionEventSettingsUiModel != null) {
                subscriptionEventSettingsUiModel.b = z;
            }
        }
    }
}
