package com.huawei.hms.push;

import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.support.api.client.Result;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SubscribeResult extends Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45933a;
    private List<SubscribedItem> b;

    public String getErrorMsg() {
        return this.f45933a;
    }

    public List<SubscribedItem> getSubscribedItems() {
        return this.b;
    }

    public void setErrorMsg(String str) {
        this.f45933a = str;
    }

    public void setSubscribedItems(List<SubscribedItem> list) {
        this.b = list;
    }
}
