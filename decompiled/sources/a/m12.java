package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public enum m12 implements sgf0 {
    NATIVE("native"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM(Payload.CUSTOM),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_WITH_LOTTIE("customWithLottie");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20982a;

    m12(String str) {
        this.f20982a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "alertStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f20982a;
    }
}
