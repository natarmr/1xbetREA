package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/captcha/impl/data/datasource/CaptchaApi;", "", "La/x6a;", "request", "", "pushCaptcha", "La/jtf0;", "La/b7a;", "a", "(La/x6a;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "org.xplatform.secret.captcha:impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface t4w0 {
    @kg80("/captcha/v1/GetCaptcha")
    Object a(@jb8 x6a x6aVar, @xpv("X-Push-Captcha") String str, yje<? super jtf0<b7a>> yjeVar);
}
