package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jgx0 implements lgx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fgx0 f16501a = new fgx0();

    public String a() {
        return "<unknown class>";
    }

    public String b() {
        return "<unknown method>";
    }

    public int c() {
        return 0;
    }

    public String d() {
        return null;
    }

    public String e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(a());
        sb.append(", method=");
        sb.append(b());
        sb.append(", line=");
        sb.append(c());
        if (d() != null) {
            sb.append(", file=");
            sb.append(d());
        }
        if (e() != null) {
            sb.append(", filePath=");
            sb.append(e());
        }
        sb.append(" }");
        return sb.toString();
    }
}
