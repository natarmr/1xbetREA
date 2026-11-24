package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fwv {
    public static final cwv d = new cwv(null);
    public static final fwv e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10279a;
    public final bwv b;
    public final ewv c;

    static {
        awv awvVar = bwv.d;
        awvVar.getClass();
        bwv bwvVar = bwv.e;
        dwv dwvVar = ewv.f8546a;
        dwvVar.getClass();
        ewv ewvVar = ewv.b;
        e = new fwv(false, bwvVar, ewvVar);
        awvVar.getClass();
        dwvVar.getClass();
        new fwv(true, bwvVar, ewvVar);
    }

    public fwv(boolean z, bwv bwvVar, ewv ewvVar) {
        bwvVar.getClass();
        ewvVar.getClass();
        this.f10279a = z;
        this.b = bwvVar;
        this.c = ewvVar;
    }

    public final String toString() {
        StringBuilder sbR = brm0.r("HexFormat(\n    upperCase = ");
        sbR.append(this.f10279a);
        sbR.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a("        ", sbR);
        sbR.append('\n');
        sbR.append("    ),");
        sbR.append('\n');
        sbR.append("    number = NumberHexFormat(");
        sbR.append('\n');
        this.c.a("        ", sbR);
        sbR.append('\n');
        sbR.append("    )");
        sbR.append('\n');
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
