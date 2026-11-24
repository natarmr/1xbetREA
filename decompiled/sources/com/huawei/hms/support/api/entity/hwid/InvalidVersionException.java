package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidVersionException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Status f45978a;

    public InvalidVersionException(Status status) {
        this.f45978a = status;
    }

    public Status getError() {
        return this.f45978a;
    }
}
