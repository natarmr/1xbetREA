package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickItemView;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n2l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22806a;

    public /* synthetic */ n2l(byte b) {
        this.f22806a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22806a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return new DotaBanPickItemView(context, null, 6);
            case 1:
                ((DotaBanPickItemView) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((DotaBanPickItemView) obj).getClass();
                return Unit.f46060a;
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                hxm0.x(((w2l) cpVar.u).b, cpVar.w.getResources().getDimensionPixelSize(R.dimen.space_16));
                cpVar.t(new k2l(cpVar, cpVar, (byte) 1));
                return Unit.f46060a;
            case 4:
                ((m5l) obj).getClass();
                return Unit.f46060a;
            case 5:
                Context context2 = (Context) obj;
                context2.getClass();
                return new y6l(context2);
            case 6:
                ((y6l) obj).getClass();
                return Unit.f46060a;
            case 7:
                ((y6l) obj).getClass();
                return Unit.f46060a;
            case 8:
                ((j7l) obj).getClass();
                return Unit.f46060a;
            case 9:
                Context context3 = (Context) obj;
                context3.getClass();
                return new d9l(context3);
            case 10:
                ((d9l) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((d9l) obj).getClass();
                return Unit.f46060a;
            case 12:
                Context context4 = (Context) obj;
                context4.getClass();
                return new i8l(context4);
            case 13:
                ((i8l) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((i8l) obj).getClass();
                return Unit.f46060a;
            case 15:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.f40887a.setLayoutDirection(0);
                cpVar2.t(new k2l(cpVar2, cpVar2, (byte) 2));
                return Unit.f46060a;
            case 16:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.f40887a.setLayoutDirection(0);
                cpVar3.t(new k2l(cpVar3, cpVar3, (byte) 3));
                return Unit.f46060a;
            case 17:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                return xnm0.h(mbp0Var.c, mbp0Var.d, mbp0Var.b, mbp0Var.e, mbp0Var.g, mbp0Var.f21520a);
            case 18:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                return qim0.k(mbp0Var2.h, ucx.X(mbp0Var2.f), mbp0Var2.f21520a, mbp0Var2.k, mbp0Var2.l);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Context context5 = (Context) obj;
                context5.getClass();
                return new TeamStatisticView(context5, null);
            case 20:
                ((TeamStatisticView) obj).getClass();
                return Unit.f46060a;
            case 21:
                ((TeamStatisticView) obj).getClass();
                return Unit.f46060a;
            case 22:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return kpb.o0((bqr) feeVar.c(), false);
            case 23:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new b7l(wusVar);
            case 24:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new a7l(xa30Var);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Boolean.TRUE;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj).getClass();
                int i = DragonsGoldGameView.u;
                return Boolean.FALSE;
            default:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (StringsKt.t0((String) entry2.getKey()) != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(wp20.a(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(Long.valueOf(Long.parseLong((String) entry3.getKey())), entry3.getValue());
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(wp20.a(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object key = entry4.getKey();
                    Object value = entry4.getValue();
                    value.getClass();
                    linkedHashMap4.put(key, new y3d(fbc.d(((Integer) value).intValue())));
                }
                return new LinkedHashMap(linkedHashMap4);
        }
    }
}
