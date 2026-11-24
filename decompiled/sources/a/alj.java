package a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class alj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1070a;
    public final androidx.media3.common.b b;
    public final androidx.media3.common.b c;
    public final int d;
    public final int e;

    public alj(String str, androidx.media3.common.b bVar, androidx.media3.common.b bVar2, int i, int i2) {
        x0x.A(i == 0 || i2 == 0);
        x0x.A(true ^ TextUtils.isEmpty(str));
        this.f1070a = str;
        bVar.getClass();
        this.b = bVar;
        bVar2.getClass();
        this.c = bVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && alj.class == obj.getClass()) {
            alj aljVar = (alj) obj;
            if (this.d == aljVar.d && this.e == aljVar.e && this.f1070a.equals(aljVar.f1070a) && this.b.equals(aljVar.b) && this.c.equals(aljVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ua80.b((((527 + this.d) * 31) + this.e) * 31, 31, this.f1070a)) * 31);
    }
}
