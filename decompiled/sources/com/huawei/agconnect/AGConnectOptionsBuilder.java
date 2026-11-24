package com.huawei.agconnect;

import android.content.Context;
import com.huawei.agconnect.config.impl.AGConnectOptionsImpl;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AGConnectOptionsBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f45675a;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public final AGConnectOptionsImpl a(Context context) {
        return new AGConnectOptionsImpl(context, this.f45675a, this.b, this.c);
    }
}
