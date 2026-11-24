package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gp0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11659a = 0;
    public final /* synthetic */ pp0 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ gp0(pp0 pp0Var, mm40 mm40Var, Function0 function0) {
        this.b = pp0Var;
        this.c = mm40Var;
        this.d = function0;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f11659a;
        pp0 pp0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    np0 np0Var = (np0) pp0Var;
                    nia0.H(this.c, np0Var.c, new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6), np0Var.d, this.d, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    np0 np0Var2 = (np0) pp0Var;
                    xia0.B(this.c, np0Var2.c, new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6), np0Var2.g, np0Var2.f, np0Var2.d, this.d, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gp0(mm40 mm40Var, pp0 pp0Var, Function0 function0) {
        this.c = mm40Var;
        this.b = pp0Var;
        this.d = function0;
    }
}
