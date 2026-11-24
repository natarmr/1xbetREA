package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xfb0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xfb0 f40784a = new xfb0(1, ffb0.class, "toBannersUiModel", "toBannersUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperBannersState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesContentItemUiModel$BannerCollection;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        efb0 efb0Var = (efb0) obj;
        efb0Var.getClass();
        hfe hfeVar = efb0Var.f7715a;
        lq5 lq5Var = efb0Var.b;
        if (hfeVar instanceof vee) {
            return new heb0(lq5Var, lak0.c, true);
        }
        if (!(hfeVar instanceof bfe)) {
            return null;
        }
        if (efb0Var.c) {
            return new heb0(lq5Var, lak0.c, true);
        }
        ArrayList<lr5> arrayList = ((deb0) ((bfe) hfeVar).f2497a).f5942a;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (lr5 lr5Var : arrayList) {
            lr5Var.getClass();
            if ((lq5Var instanceof gq5) || (lq5Var instanceof fq5)) {
                str = lr5Var.c;
            } else if ((lq5Var instanceof hq5) || (lq5Var instanceof iq5) || (lq5Var instanceof kq5) || (lq5Var instanceof jq5)) {
                str = lr5Var.b;
            } else {
                if (!(lq5Var instanceof dq5) && !(lq5Var instanceof eq5) && !(lq5Var instanceof cq5)) {
                    t9f.b();
                    return null;
                }
                str = lr5Var.d;
            }
            arrayList2.add(new fr5(lr5Var.f20512a, new n0x(str), new n0x(azw.R(str)), lr5Var.e, lr5Var.f, (er5) null, 64));
        }
        return new heb0(lq5Var, dyb.r0(arrayList2), false);
    }
}
