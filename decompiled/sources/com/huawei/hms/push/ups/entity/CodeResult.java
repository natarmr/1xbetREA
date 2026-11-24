package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes2.dex */
public class CodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45953a;
    private String b;

    public CodeResult(int i, String str) {
        this.f45953a = i;
        this.b = str;
    }

    public String getReason() {
        return this.b;
    }

    public int getReturnCode() {
        return this.f45953a;
    }

    public void setReason(String str) {
        this.b = str;
    }

    public void setReturnCode(int i) {
        this.f45953a = i;
    }

    public CodeResult(int i) {
        this.f45953a = i;
    }

    public CodeResult() {
    }
}
