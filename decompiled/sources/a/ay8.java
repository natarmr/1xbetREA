package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ay8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1659a = 0;
    public final /* synthetic */ yx8 b;
    public final /* synthetic */ by8 c;

    public /* synthetic */ ay8(yx8 yx8Var, by8 by8Var) {
        this.b = yx8Var;
        this.c = by8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1659a;
        gmm dmmVar = fmm.f9790a;
        by8 by8Var = this.c;
        yx8 yx8Var = this.b;
        switch (b) {
            case 0:
                n0o0 n0o0Var = by8Var.l;
                boolean z = yx8Var.n;
                xx8 xx8Var = (xx8) obj;
                xx8Var.getClass();
                pz40 pz40Var = s6t0.f31722a;
                long secondary = s6t0.b().f33626a.getSecondary();
                ra50 ra50Var = ra50.f30118a;
                wkm wkmVar = new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, secondary);
                wkm wkmVar2 = new wkm(1, R.drawable.ic_glyph_info_circle, true, ra50Var, s6t0.b().f33626a.getSecondary());
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                boolean z2 = xx8Var.b;
                tlm nlmVar = z2 ? new nlm(new hmm(10, xx8Var.c, by8Var.b.b.a(R.string.search_by_games, Arrays.copyOf(new Object[0], 0)), false)) : new plm(xx8Var.f41644a, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                if (z2) {
                    if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && z) {
                        dmmVar = new dmm(new ta50(wkmVar2));
                    }
                } else if (z) {
                    dmmVar = new dmm(((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() ? new va50(wkmVar, wkmVar2) : new ta50(wkmVar));
                }
                return new imm(ilmVar, nlmVar, dmmVar, ((ix8) by8Var.B) == ix8.f15529a ? s6t0.b().f33626a.getBackgroundContent() : StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null);
            default:
                ((String) obj).getClass();
                if (yx8Var.n) {
                    dmmVar = new emm(((Boolean) ((fee) by8Var.l.getValue()).c()).booleanValue() ? new na50(new skm(0, R.drawable.ic_glyph_search, true, (y3d) null, 48), new skm(1, R.drawable.ic_glyph_info_circle, true, (y3d) null, 48)) : new la50(new skm(0, R.drawable.ic_glyph_search, true, (y3d) null, 48)));
                }
                pz40 pz40Var2 = s6t0.f31722a;
                return new imm(jlm.f16723a, mlm.f21997a, dmmVar, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), false, null);
        }
    }

    public /* synthetic */ ay8(by8 by8Var, yx8 yx8Var) {
        this.c = by8Var;
        this.b = yx8Var;
    }
}
