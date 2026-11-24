package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33294a;
    public final boolean b;
    public final String c;

    public t40(String str, boolean z) {
        this.f33294a = (byte) 1;
        this.b = z;
        this.c = str;
    }

    public String toString() {
        switch (this.f33294a) {
            case 0:
                String str = this.c;
                int length = String.valueOf(str).length();
                boolean z = this.b;
                StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(z).length());
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t40(byte b, String str, boolean z) {
        this.f33294a = b;
        this.c = str;
        this.b = z;
    }
}
