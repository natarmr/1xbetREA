package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ry6 implements wy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8r0 f31298a;
    public final uf40 b;
    public final String c;
    public final eo8 d;
    public final String e;
    public final i680 f;

    public ry6(d8r0 d8r0Var, uf40 uf40Var, String str, eo8 eo8Var, String str2, i680 i680Var) {
        this.f31298a = d8r0Var;
        this.b = uf40Var;
        this.c = str;
        this.d = eo8Var;
        this.e = str2;
        this.f = i680Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof ry6) {
                ry6 ry6Var = (ry6) obj;
                if (this.f31298a.equals(ry6Var.f31298a) && this.b.equals(ry6Var.b)) {
                    String str = ry6Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && this.d.equals(ry6Var.d)) {
                        String str3 = ry6Var.e;
                        String str4 = this.e;
                        if (str4 == null) {
                            if (str3 == null) {
                                zEquals2 = true;
                            } else {
                                zEquals2 = false;
                            }
                        } else if (str3 == null) {
                            zEquals2 = false;
                        } else {
                            zEquals2 = str4.equals(str3);
                        }
                        if (zEquals2 && Intrinsics.d(this.f, ry6Var.f)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f31298a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i680 i680Var = this.f;
        return iHashCode3 + (i680Var != null ? i680Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.c;
        String strL = str == null ? "null" : kng0.l("SubgameUiModel(subgameText=", str, Separators.RPAREN);
        String str2 = this.e;
        return "MakeBetBetGameInfoUiModel(topLaneUiModel=" + this.f31298a + ", middleLaneUiModel=" + this.b + ", subgameUiModel=" + strL + ", bottomLaneUiModel=" + this.d + ", optionBetLabelUiModel=" + (str2 != null ? kng0.l("OptionBetLabelUiModel(optionBetLabel=", str2, Separators.RPAREN) : "null") + ", optionBetUiState=" + this.f + Separators.RPAREN;
    }
}
