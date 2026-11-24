package com.huawei.agconnect.config.impl;

/* JADX INFO: loaded from: classes2.dex */
public class AesParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45679a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public AesParam(int i, String str, String str2, String str3, String str4, String str5) {
        this.g = 0;
        this.f45679a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        if (str != null) {
            this.g = str.length() / 2;
        }
    }
}
