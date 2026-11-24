package a;

/* JADX INFO: loaded from: classes.dex */
public final class onf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25544a;

    public static final String a(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return twn.m(i, "UNKNOWN-");
        }
    }

    public static String b(int i) {
        return brm0.l("RequestTemplate(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof onf0) {
            return this.f25544a == ((onf0) obj).f25544a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25544a);
    }

    public final String toString() {
        return b(this.f25544a);
    }
}
