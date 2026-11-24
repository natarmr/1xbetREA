package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryGameView;
import org.xplatform.bonus_games.impl.memories.presentation.views.MemoryPickerView;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tr20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34404a;

    public /* synthetic */ tr20(byte b) {
        this.f34404a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        long textPrimary;
        int i2 = 0;
        switch (this.f34404a) {
            case 0:
                ig7 ig7Var = (ig7) obj;
                ig7Var.getClass();
                return Long.valueOf(ig7Var.b);
            case 1:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                while (i2 < 20) {
                    hcz.e(hczVar, null, null, dwi0.g, 3);
                    i2++;
                }
                return Unit.f46060a;
            case 2:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                while (i2 < 20) {
                    hcz.e(hczVar2, null, null, xf0.l, 3);
                    i2++;
                }
                return Unit.f46060a;
            case 3:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                while (i2 < 20) {
                    hcz.e(hczVar3, null, null, ay3.j, 3);
                    i2++;
                }
                return Unit.f46060a;
            case 4:
                xuz xuzVar = v330.Q1;
                ((wgl0) obj).getClass();
                return Unit.f46060a;
            case 5:
                xuz xuzVar2 = v330.Q1;
                ((xgl0) obj).getClass();
                return Unit.f46060a;
            case 6:
                xuz xuzVar3 = v330.Q1;
                ((ny20) obj).getClass();
                return Unit.f46060a;
            case 7:
                aw20 aw20Var = (aw20) obj;
                aw20Var.getClass();
                return x8x.G(aw20Var);
            case 8:
                tg30 tg30Var = (tg30) obj;
                tg30Var.getClass();
                List list = tg30Var.b;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    lg30 lg30Var = (lg30) obj2;
                    lg30Var.getClass();
                    int iOrdinal = lg30Var.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.multisingle;
                    } else if (iOrdinal == 1) {
                        i = R.string.tennis_win_loss_match_type_double;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.empty_str;
                    }
                    if (lg30Var == tg30Var.f33890a) {
                        pz40 pz40Var = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getPrimary();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getTextPrimary();
                    }
                    arrayList.add(new mg30(lg30Var, i, textPrimary, i3 != list.size() - 1));
                    i3 = i4;
                }
                return new ug30(dyb.r0(arrayList));
            case 9:
                Context context = (Context) obj;
                context.getClass();
                return (DsSettingsCell) zkk.a(LayoutInflater.from(context).inflate(R.layout.top_medals_statistic_item, (ViewGroup) null, false)).f;
            case 10:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                Context context2 = cpVar.w;
                Drawable drawable = context2.getDrawable(R.drawable.ic_glyph_language);
                sj3.B0(drawable, context2, R.attr.uikitSecondary60);
                cpVar.t(new bw20(cpVar, (Object) drawable, (byte) 7));
                return Unit.f46060a;
            case 11:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                my6 my6Var = (my6) feeVar.c();
                my6Var.getClass();
                md5 md5Var = my6Var.f22590a;
                td5 td5Var = new td5(md5Var.f21580a, md5Var.b);
                j580 j580Var = my6Var.b;
                m580 m580Var = new m580(j580Var.f15922a, j580Var.b, "", "", new die0(0), new die0(0), new lpm(opm.f25648a, new gpm()), true, j580Var.c);
                kur kurVar = my6Var.c;
                return new xy6(td5Var, null, m580Var, new c0s(new hy20(kurVar.f18925a.f39867a), p5n0.f26413a, kurVar.b, wbs0.IS_NOT_VISIBLE, iho.f14789a), null, null);
            case 12:
                zvh0 zvh0Var = (zvh0) obj;
                zvh0Var.getClass();
                return ydx.a0(zvh0Var);
            case 13:
                vsr0 vsr0Var = (vsr0) obj;
                vsr0Var.getClass();
                return Integer.valueOf(vsr0Var.f37966a ? 1 : 0);
            case 14:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 15:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 16:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 17:
                p6t0 p6t0Var4 = (p6t0) obj;
                p6t0Var4.getClass();
                return sre0.f32672a.b(p6t0Var4.getClass());
            case 18:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.g(hczVar4, 14, null, null, y9a.c, 6);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hcz.g(hczVar5, 14, null, null, zgc.c, 6);
                return Unit.f46060a;
            case 20:
                ((Integer) obj).getClass();
                int i5 = MemoryGameView.e;
                return Unit.f46060a;
            case 21:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 22:
                int i6 = MemoryPickerView.c;
                ((ht30) obj).getClass();
                return Unit.f46060a;
            case 23:
                return Unit.f46060a;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj).getClass();
                return iun.f15405a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.e = new rq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                n1gVar.d = j1g.REAL;
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i740 i740Var = (i740) obj;
                i740Var.getClass();
                return i740Var.b;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hcz.g(hczVar6, 4, null, null, o2e.c, 6);
                return Unit.f46060a;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ tr20(Object obj, byte b) {
        this.f34404a = b;
    }
}
