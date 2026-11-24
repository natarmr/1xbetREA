package a;

/* JADX INFO: loaded from: classes.dex */
public final class ep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f8161a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ep)) {
                return false;
            }
            ep epVar = (ep) obj;
            byte b = this.f8161a;
            if (b != epVar.f8161a) {
                return false;
            }
            if (b != 8 || Math.abs(this.d - this.b) != 1 || this.d != epVar.b || this.b != epVar.d) {
                if (this.d != epVar.d || this.b != epVar.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = epVar.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f8161a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        byte b = this.f8161a;
        if (b == 1) {
            str = "add";
        } else if (b == 2) {
            str = "rm";
        } else if (b != 4) {
            str = b != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
