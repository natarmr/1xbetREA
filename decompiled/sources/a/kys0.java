package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getUfcPostGameScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public class kys0 implements lix0, SuccessContinuation, jgd, xmw0 {
    public static final /* synthetic */ kys0 b = new kys0(22);
    public static final /* synthetic */ kys0 c = new kys0(24);
    public static final /* synthetic */ kys0 d = new kys0(25);
    public static final /* synthetic */ kys0 e = new kys0(27);
    public static final /* synthetic */ kys0 f = new kys0(28);
    public static final /* synthetic */ kys0 g = new kys0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19122a;

    public /* synthetic */ kys0(byte b2) {
        this.f19122a = b2;
    }

    public static nev0 c(int i) {
        for (nev0 nev0Var : nev0.values()) {
            if (nev0Var.f23406a == i) {
                return nev0Var;
            }
        }
        return null;
    }

    public static lc00 f(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (str.length() < 4 && str2.length() == 0) {
            lc00VarB.add(kh4.f18271a);
        } else if (str.length() < 4) {
            lc00VarB.add(ih4.f14763a);
        } else if (str2.length() == 0) {
            lc00VarB.add(jh4.f16510a);
        }
        if (str3.length() == 0) {
            lc00VarB.add(hh4.f13044a);
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final ifw0 h(Object obj, Object obj2) {
        ifw0 ifw0VarA = (ifw0) obj;
        ifw0 ifw0Var = (ifw0) obj2;
        if (!ifw0Var.isEmpty()) {
            if (!ifw0VarA.f14707a) {
                ifw0VarA = ifw0VarA.a();
            }
            ifw0VarA.d();
            if (!ifw0Var.isEmpty()) {
                ifw0VarA.putAll(ifw0Var);
            }
        }
        return ifw0VarA;
    }

    public vzs0 a(iys0 iys0Var, List list) {
        iys0Var.getClass();
        list.getClass();
        List parameters = iys0Var.getParameters();
        parameters.getClass();
        hzs0 hzs0Var = (hzs0) CollectionsKt.f0(parameters);
        if (hzs0Var != null) {
            byte b2 = 1;
            if (hzs0Var.H()) {
                List parameters2 = iys0Var.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hzs0) it.next()).h());
                }
                Map mapM = xp20.m(CollectionsKt.T0(arrayList, list));
                mapM.getClass();
                return new r4m0(mapM, b2);
            }
        }
        return new g5x((hzs0[]) parameters.toArray(new hzs0[0]), (pzs0[]) list.toArray(new pzs0[0]), false);
    }

    @Override // a.lix0
    public /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    public UfcScreensFactoryImpl$getChampionshipFragmentScreen$1 d(long j, String str) {
        str.getClass();
        return new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(j, str);
    }

    public UfcScreensFactoryImpl$getUfcPostGameScreen$1 e(long j, long j2, String str) {
        str.getClass();
        return new UfcScreensFactoryImpl$getUfcPostGameScreen$1(j, j2, str);
    }

    public boolean g(CharSequence charSequence) {
        return charSequence instanceof csb0;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = cig0.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f19122a) {
            case 8:
                String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                string.getClass();
                return b1j.k("CreationExtras.Key@", string, Separators.LESS_THAN, sre0.f32672a.b(String.class).J(), Separators.GREATER_THAN);
            default:
                return super.toString();
        }
    }

    @Override // a.jgd
    public /* synthetic */ Object x0(pzu pzuVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(pzuVar);
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f19122a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new Boolean(((Boolean) zhw0.f44414a.get()).booleanValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            default:
                List list = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.sgtm.upload.max_queued_batches", 47, 5000L).get()).longValue());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.store.max_stored_events_per_app", 20, 100000L).get()).longValue());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.monitoring.sample_period_millis", 29, 86400000L).get();
        }
    }

    public /* synthetic */ kys0(Object obj, byte b2) {
        this.f19122a = b2;
    }
}
