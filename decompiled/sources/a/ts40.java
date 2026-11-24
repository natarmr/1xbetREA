package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ts40 extends qs40 {
    public int d = -1;
    public String e = null;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public int j = 0;

    public ts40() {
        this.b = (byte) 2;
    }

    @Override // a.l0t0
    public final boolean c(int i, int i2) {
        if (i == 100) {
            this.f29242a = i2;
        } else if (i == 508) {
            this.d = i2;
        } else {
            if (i != 510) {
                if (i != 100) {
                    return false;
                }
                this.f29242a = i2;
                return true;
            }
            this.j = i2;
        }
        return true;
    }

    public final Object clone() {
        ts40 ts40Var = new ts40();
        ts40Var.f29242a = this.f29242a;
        ts40Var.b = this.b;
        ts40Var.e = this.e;
        ts40Var.f = this.f;
        ts40Var.g = Float.NaN;
        ts40Var.h = this.h;
        ts40Var.i = this.i;
        return ts40Var;
    }

    @Override // a.l0t0
    public final boolean d(float f, int i) {
        switch (i) {
            case Response.SERVICE_UNAVAILABLE /* 503 */:
                this.f = f;
                return true;
            case Response.SERVER_TIMEOUT /* 504 */:
                this.g = f;
                return true;
            case Response.VERSION_NOT_SUPPORTED /* 505 */:
                this.f = f;
                this.g = f;
                return true;
            case 506:
                this.h = f;
                return true;
            case 507:
                this.i = f;
                return true;
            default:
                return false;
        }
    }

    @Override // a.l0t0
    public final boolean e(int i, String str) {
        if (i != 501) {
            return i == 101;
        }
        this.e = str.toString();
        return true;
    }
}
