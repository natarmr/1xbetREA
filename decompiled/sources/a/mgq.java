package a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class mgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21755a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public mgq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = ktm0.f18874a;
        s0x.J("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.f21755a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static mgq a(Context context) {
        fuj0 fuj0Var = new fuj0(context, (byte) 4);
        String strR = fuj0Var.r("google_app_id");
        if (TextUtils.isEmpty(strR)) {
            return null;
        }
        return new mgq(strR, fuj0Var.r("google_api_key"), fuj0Var.r("firebase_database_url"), fuj0Var.r("ga_trackingId"), fuj0Var.r("gcm_defaultSenderId"), fuj0Var.r("google_storage_bucket"), fuj0Var.r("recaptcha_site_key"), fuj0Var.r("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mgq)) {
            return false;
        }
        mgq mgqVar = (mgq) obj;
        return Objects.equals(this.b, mgqVar.b) && Objects.equals(this.f21755a, mgqVar.f21755a) && Objects.equals(this.c, mgqVar.c) && Objects.equals(this.d, mgqVar.d) && Objects.equals(this.e, mgqVar.e) && Objects.equals(this.f, mgqVar.f) && Objects.equals(this.g, mgqVar.g) && Objects.equals(this.h, mgqVar.h);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.f21755a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(this.b, "applicationId");
        dq00Var.a(this.f21755a, "apiKey");
        dq00Var.a(this.c, "databaseUrl");
        dq00Var.a(this.e, "gcmSenderId");
        dq00Var.a(this.f, "storageBucket");
        dq00Var.a(this.g, "recaptchaSiteKey");
        dq00Var.a(this.h, "projectId");
        return dq00Var.toString();
    }
}
