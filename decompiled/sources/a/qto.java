package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qto implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29307a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lz10 c;

    public /* synthetic */ qto(boolean z, lz10 lz10Var, byte b) {
        this.f29307a = b;
        this.b = z;
        this.c = lz10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29307a;
        boolean z = false;
        int i = R.color.static_green;
        lz10 lz10Var = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                String str = lz10Var.j;
                boolean z3 = lz10Var.c;
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
                    pzw.E(bnk0Var, pzb.e0(lz10Var.g), 0, z3 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var, lz10Var.g, 0, z3 ? R.color.static_green : R.color.static_white, 0, 0, 54);
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
                String str2 = lz10Var.k;
                boolean z4 = lz10Var.e;
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
                    pzw.E(bnk0Var2, pzb.e0(lz10Var.h), 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var2, lz10Var.h, 0, z4 ? R.color.static_green : R.color.static_white, 0, 0, 54);
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
