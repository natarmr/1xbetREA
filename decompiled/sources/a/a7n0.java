package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.util.BitSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a7n0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f380a;

    public /* synthetic */ a7n0(pmi0 pmi0Var) {
        this.f380a = (byte) 24;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f380a;
        bid bidVar = bid.f2654a;
        switch (b) {
            case 0:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 1:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 2:
                return new zw3(x6n0.f40372a, (byte) 0);
            case 3:
                return new zw3(l9n0.f19663a, (byte) 0);
            case 4:
                return new zw3(mrv.j0(ysm0.f43175a), (byte) 0);
            case 5:
                return new zw3(s710.f31729a, (byte) 0);
            case 6:
                return new zw3(p8n0.f26565a, (byte) 0);
            case 7:
                return new inv(ysm0.f43175a, new zw3(r9n0.f30092a, (byte) 0), (byte) 1);
            case 8:
                return new zw3(x6n0.f40372a, (byte) 0);
            case 9:
                iun iunVar = iun.f15405a;
                return new hdn0(iunVar, false, bdn0.f2407a, cdn0.f4170a, null, iunVar, false, false, false, v5l0.LARGE_CARD_LARGE_SPORT_ICON, false, false, false);
            case 10:
                int i = rdn0.I;
                return bidVar;
            case 11:
                return new jen0(false, false, false, iun.f15405a, een0.f7681a);
            case 12:
                iun iunVar2 = iun.f15405a;
                return new tbn0(iunVar2, false, tan0.f33621a, zan0.f44079a, null, iunVar2, false, false, false, v5l0.LARGE_CARD_LARGE_SPORT_ICON, false, false, false);
            case 13:
                int i2 = ven0.K;
                return bidVar;
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return new ycl(0.0f);
            case 17:
                s9m0 s9m0Var = ypn0.h2;
                return new ssn0();
            case 18:
                return new zw3(cpn0.f4757a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(y2q.f41918a, (byte) 0);
            case 20:
                y2m0 y2m0Var = tun0.P1;
                return Unit.f46060a;
            case 21:
                j6m0 j6m0Var = vvn0.W1;
                return new ssn0();
            case 22:
                lak0 lak0Var = lak0.c;
                return new vxn0(lak0Var, lak0Var, true, false, true, false, false, false, "", "", "", "", he.PRIMARY, false, false, false, null);
            case 23:
                r710 r710Var = SyntheticIndianPokerView.w;
                kin0 kin0VarE = qem0.e();
                rwj rwjVar = tvk.f34603a;
                return d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
            case 24:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    objInvoke.getClass();
                    str = (String) objInvoke;
                } catch (Exception unused) {
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                Iterator it = StringsKt.i0(str, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    try {
                        lc00VarB.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(CollectionsKt.M0(kotlin.collections.a.a(lc00VarB)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return xun.f41520a;
                }
                yni0 yni0Var = new yni0(size);
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        yni0Var.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return cui0.a(yni0Var);
                    }
                }
                return cui0.a(yni0Var);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new g0o("org.xplatform.aggregator.popular.dashboard.api.navigation.TabAggregatorRoute", iao0.INSTANCE, new Annotation[0]);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return CyberGamesPage.Companion.serializer();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return CyberGamesParentSectionModel.Companion.serializer();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new g0o("org.xplatform.games_section.api.navigation.TabOneXGamesRoute", cco0.INSTANCE, new Annotation[0]);
            default:
                int i3 = zco0.r0;
                return bidVar;
        }
    }

    public /* synthetic */ a7n0(byte b) {
        this.f380a = b;
    }
}
