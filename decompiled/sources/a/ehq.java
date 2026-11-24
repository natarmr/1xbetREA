package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ehq implements dhq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7819a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ehq(String str, int i) {
        this.f7819a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b != 0) {
            String strTrim = d().trim();
            if (srd.e.matcher(strTrim).matches()) {
                return true;
            }
            if (!srd.f.matcher(strTrim).matches()) {
                jf4.o(kng0.l("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            e9d0.t(kng0.l("[Value: ", strTrim, "] cannot be converted to a double."), e);
            return 0.0d;
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            e9d0.t(kng0.l("[Value: ", strTrim, "] cannot be converted to a long."), e);
            return 0L;
        }
    }

    public final String d() {
        return this.b == 0 ? "" : this.f7819a;
    }
}
