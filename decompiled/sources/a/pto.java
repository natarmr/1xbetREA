package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pto implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27575a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hzm0 c;

    public /* synthetic */ pto(boolean z, hzm0 hzm0Var, byte b) {
        this.f27575a = b;
        this.b = z;
        this.c = hzm0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27575a;
        boolean z = false;
        int i = R.color.static_green;
        hzm0 hzm0Var = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                String str = hzm0Var.j;
                boolean z3 = hzm0Var.e;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                if (cy7.c() && z2) {
                    z = true;
                }
                pzw.E(bnk0Var, "\u2066", 0, 0, 0, 0, 62);
                if (z) {
                    if (str != null) {
                        pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var, "ov ", 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var, str, 0, z3 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                        bnk0Var = bnk0Var;
                        pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white, 0, 0, 54);
                    }
                    pzw.E(bnk0Var, pzb.e0(hzm0Var.h), 0, z3 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var, hzm0Var.h, 0, z3 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                    if (str != null) {
                        pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white, 0, 0, 54);
                        if (!z3) {
                            i = R.color.static_white;
                        }
                        pzw.E(bnk0Var, str, 0, i, 0, 0, 54);
                        pzw.E(bnk0Var, " ov", 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white, 0, 0, 54);
                    }
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                break;
            default:
                String str2 = hzm0Var.i;
                boolean z4 = hzm0Var.c;
                bnk0 bnk0Var2 = (bnk0) obj;
                bnk0Var2.getClass();
                if (cy7.c() && z2) {
                    z = true;
                }
                pzw.E(bnk0Var2, "\u2066", 0, 0, 0, 0, 62);
                if (z) {
                    if (str2 != null) {
                        pzw.E(bnk0Var2, Separators.LPAREN, 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var2, "ov ", 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var2, str2, 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                        bnk0Var2 = bnk0Var2;
                        pzw.E(bnk0Var2, Separators.RPAREN, 0, R.color.static_white, 0, 0, 54);
                    }
                    pzw.E(bnk0Var2, pzb.e0(hzm0Var.g), 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var2, hzm0Var.g, 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                    if (str2 != null) {
                        pzw.E(bnk0Var2, Separators.LPAREN, 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var2, str2, 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                        bnk0Var2 = bnk0Var2;
                        pzw.E(bnk0Var2, " ov", 0, R.color.static_white, 0, 0, 54);
                        pzw.E(bnk0Var2, Separators.RPAREN, 0, R.color.static_white, 0, 0, 54);
                    }
                }
                pzw.E(bnk0Var2, "\u2069", 0, 0, 0, 0, 62);
                break;
        }
        return Unit.f46060a;
    }
}
