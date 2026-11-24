package a;

import com.yandex.authsdk.YandexAuthToken;

/* JADX INFO: loaded from: classes2.dex */
public final class h2w0 implements i2w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YandexAuthToken f12356a;

    public h2w0(YandexAuthToken yandexAuthToken) {
        this.f12356a = yandexAuthToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2w0) && this.f12356a.equals(((h2w0) obj).f12356a);
    }

    public final int hashCode() {
        return this.f12356a.hashCode();
    }

    public final String toString() {
        return "Success(token=" + this.f12356a + ')';
    }
}
