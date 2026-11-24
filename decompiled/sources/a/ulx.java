package a;

import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ulx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f35894a;

    static {
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
        Regex regex = MediaType.e;
        f35894a = ResponseBody.Companion.a("", MediaType.Companion.a("text/plain"));
    }
}
