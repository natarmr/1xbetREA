package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sw1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32898a = 1;
    public final /* synthetic */ m0x b;

    public /* synthetic */ sw1(m0x m0xVar) {
        this.b = m0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32898a;
        m0x m0xVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lv00.h(m0xVar, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
                    fetVar.e0(1845282040);
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, o7k0.n(jm40.b, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sw1(m0x m0xVar, int i) {
        this.b = m0xVar;
    }
}
