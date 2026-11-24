package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes5.dex */
public enum xmu0 implements sgf0 {
    STATUS(CommonConstant.KEY_STATUS),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_HORIZONTAL("rectangleHorizontal"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_VERTICAL("rectangleVertical"),
    /* JADX INFO: Fake field, exist only in values array */
    ARROW("arrow");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41147a;

    xmu0(String str) {
        this.f41147a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorVipCashbackWidgetStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f41147a;
    }
}
