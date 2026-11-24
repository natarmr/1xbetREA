package a;

import android.javax.sip.message.Response;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ssq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f32737a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public ssq(String str, String str2) {
        this.f32737a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = Response.BAD_REQUEST;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public ssq(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f32737a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = i3;
    }
}
