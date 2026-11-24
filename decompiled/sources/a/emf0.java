package a;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes2.dex */
public final class emf0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8044a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    public emf0(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f8044a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = _HeadersCommonKt.d(headers);
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
            return;
        }
        if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            MediaType mediaType2 = MultipartBody.g;
            mediaType2.getClass();
            if (Intrinsics.d(mediaType2.b, "multipart")) {
                builder.b = mediaType2;
            } else {
                hny.v(mediaType2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        FormBody.Builder builder = this.j;
        if (z) {
            builder.getClass();
            str.getClass();
            builder.f46095a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        builder.getClass();
        str.getClass();
        builder.f46095a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = MediaType.e;
                this.g = MediaType.Companion.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                e9d0.t(kng0.k("Malformed content type: ", str2), e);
                return;
            }
        }
        Headers.Builder builder = this.f;
        if (z) {
            builder.c(str, str2);
        } else {
            builder.a(str, str2);
        }
    }

    public final void c(String str, String str2, boolean z) {
        HttpUrl.Builder builder;
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.b(httpUrl, str3);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            this.d = builder;
            if (builder == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                String str4 = this.c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        HttpUrl.Builder builder2 = this.d;
        if (z) {
            builder2.getClass();
            str.getClass();
            ArrayList arrayList = builder2.g;
            if (arrayList == null) {
                arrayList = new ArrayList();
                builder2.g = arrayList;
            }
            arrayList.add(_UrlKt.a(str, 0, 0, 83, " \"'<>#&="));
            ArrayList arrayList2 = builder2.g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? _UrlKt.a(str2, 0, 0, 83, " \"'<>#&=") : null);
            return;
        }
        builder2.getClass();
        str.getClass();
        ArrayList arrayList3 = builder2.g;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            builder2.g = arrayList3;
        }
        arrayList3.add(_UrlKt.a(str, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = builder2.g;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? _UrlKt.a(str2, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
