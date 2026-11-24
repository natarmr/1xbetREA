package a;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;

/* JADX INFO: loaded from: classes2.dex */
public final class xuw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41532a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public xuw0(long j, long j2, Bundle bundle, String str, String str2) {
        this.f41532a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static xuw0 a(zzbh zzbhVar) {
        String str = zzbhVar.f45544a;
        String str2 = zzbhVar.c;
        return new xuw0(zzbhVar.d, zzbhVar.e, zzbhVar.b.s(), str, str2);
    }

    public final zzbh b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.e));
        return new zzbh(this.f41532a, zzbfVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.f41532a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        f140.v(sb, "origin=", str, ",name=", str2);
        return axq.n(sb, ",params=", string);
    }
}
