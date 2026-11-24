package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* JADX INFO: loaded from: classes2.dex */
public class BaseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45922a;
    private final ErrorEnum b;

    public BaseException(int i) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(i);
        this.b = errorEnumFromCode;
        this.f45922a = errorEnumFromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f45922a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b.getMessage();
    }
}
