package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class BindResolveClients {
    private static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f45791a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f45792a = new BindResolveClients();
    }

    private BindResolveClients() {
        this.f45791a = new ArrayList<>();
    }

    public static BindResolveClients getInstance() {
        return b.f45792a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (b) {
            zContains = this.f45791a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (b) {
            try {
                ListIterator<ResolveClientBean> listIterator = this.f45791a.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().clientReconnect();
                }
                this.f45791a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            try {
                if (!this.f45791a.contains(resolveClientBean)) {
                    this.f45791a.add(resolveClientBean);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            try {
                if (this.f45791a.contains(resolveClientBean)) {
                    ListIterator<ResolveClientBean> listIterator = this.f45791a.listIterator();
                    while (listIterator.hasNext()) {
                        if (resolveClientBean.equals(listIterator.next())) {
                            listIterator.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterAll() {
        synchronized (b) {
            this.f45791a.clear();
        }
    }
}
