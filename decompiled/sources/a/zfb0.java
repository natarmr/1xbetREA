package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zfb0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfb0 f44294a = new zfb0(1, ro4.class, "toScreenUiModel", "toScreenUiModel(Lorg/xplatform/games_section/feature/popular/impl/presentation/mappers/models/PopularOneXGamesMapperContentState;)Lorg/xplatform/games_section/feature/popular/impl/presentation/models/ui/PopularOneXGamesUiModel;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        Object obj2;
        ifb0 ifb0Var = (ifb0) obj;
        ifb0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        long background = s6t0.b().f33626a.getBackground();
        mdm mdmVar = ifb0Var.g;
        if (mdmVar == null) {
            List<web0> list2 = ifb0Var.f14678a;
            ArrayList arrayList = new ArrayList();
            for (web0 web0Var : list2) {
                Object obj3 = null;
                if (web0Var instanceof teb0) {
                    y4t y4tVar = ((teb0) web0Var).f33812a;
                    if (y4tVar == y4t.d) {
                        obj2 = ifb0Var.f;
                    } else {
                        List list3 = ifb0Var.e;
                        if (list3 != null) {
                            for (Object obj4 : list3) {
                                if (Intrinsics.d(((keb0) obj4).B(), y4tVar.f42020a)) {
                                    obj3 = obj4;
                                    break;
                                }
                            }
                            obj3 = (keb0) obj3;
                        }
                        obj2 = obj3;
                    }
                } else if (Intrinsics.d(web0Var, ueb0.f35518a)) {
                    obj2 = ifb0Var.d;
                } else {
                    if (!Intrinsics.d(web0Var, veb0.f37277a)) {
                        t9f.b();
                        return null;
                    }
                    obj2 = ifb0Var.c;
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            heb0 heb0Var = ifb0Var.b;
            list = arrayList2;
            if (heb0Var != null) {
                arrayList2.add(0, heb0Var);
                list = arrayList2;
            }
        } else {
            list = iun.f15405a;
        }
        return new vfb0(background, list, mdmVar);
    }
}
