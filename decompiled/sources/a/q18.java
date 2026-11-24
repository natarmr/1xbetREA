package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q18 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q18) && ycl.b(-24.0f, -24.0f) && ycl.b(62.0f, 62.0f) && ycl.b(76.0f, 76.0f) && ycl.b(62.0f, 62.0f) && ycl.b(-48.0f, -48.0f) && ycl.b(-34.0f, -34.0f) && ycl.b(86.0f, 86.0f) && ycl.b(44.0f, 44.0f);
    }

    public final int hashCode() {
        return Float.hashCode(44.0f) + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(-24.0f) * 31, 62.0f, 31), 76.0f, 31), 62.0f, 31), -48.0f, 31), -34.0f, 31), 86.0f, 31);
    }

    public final String toString() {
        String strC = ycl.c(-24.0f);
        String strC2 = ycl.c(62.0f);
        String strC3 = ycl.c(76.0f);
        String strC4 = ycl.c(62.0f);
        String strC5 = ycl.c(-48.0f);
        String strC6 = ycl.c(-34.0f);
        String strC7 = ycl.c(86.0f);
        String strC8 = ycl.c(44.0f);
        StringBuilder sbN = b1j.n("BigPigVictoryOffsetsUiModel(rightShoulderX=", strC, ", rightShoulderY=", strC2, ", leftShoulderX=");
        f140.v(sbN, strC3, ", leftShoulderY=", strC4, ", rightHandX=");
        f140.v(sbN, strC5, ", rightHandY=", strC6, ", leftHandX=");
        return ua80.m(sbN, strC7, ", leftHandY=", strC8, Separators.RPAREN);
    }
}
