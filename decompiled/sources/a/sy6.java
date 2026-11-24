package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sy6 implements yy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf40 f33012a;
    public final String b;
    public final kf9 c;
    public final fo8 d;

    public sy6(vf40 vf40Var, String str, kf9 kf9Var, fo8 fo8Var) {
        this.f33012a = vf40Var;
        this.b = str;
        this.c = kf9Var;
        this.d = fo8Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof sy6) {
                sy6 sy6Var = (sy6) obj;
                if (this.f33012a.equals(sy6Var.f33012a)) {
                    String str = sy6Var.b;
                    String str2 = this.b;
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
                    if (zEquals && Intrinsics.d(this.c, sy6Var.c) && Intrinsics.d(this.d, sy6Var.d)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f33012a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kf9 kf9Var = this.c;
        int iHashCode3 = (iHashCode2 + (kf9Var == null ? 0 : kf9Var.hashCode())) * 31;
        fo8 fo8Var = this.d;
        return iHashCode3 + (fo8Var != null ? fo8Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        return "MakeBetBetGameInfoUiModel(middleLaneUiModel=" + this.f33012a + ", optionBetLabelUiModel=" + (str == null ? "null" : kng0.l("OptionBetLabelUiModel(optionBetLabel=", str, Separators.RPAREN)) + ", buttonsLaneUiModel=" + this.c + ", bottomLaneUiModel=" + this.d + Separators.RPAREN;
    }
}
