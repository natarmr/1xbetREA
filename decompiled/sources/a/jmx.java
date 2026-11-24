package a;

/* JADX INFO: loaded from: classes.dex */
public final class jmx extends fxw {
    public final String b;
    public final String c;
    public final String d;

    public jmx(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jmx.class != obj.getClass()) {
            return false;
        }
        jmx jmxVar = (jmx) obj;
        return this.c.equals(jmxVar.c) && this.b.equals(jmxVar.b) && this.d.equals(jmxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(527, 31, this.b), 31, this.c);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": domain=" + this.b + ", description=" + this.c;
    }
}
