package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45839a = "e";

    public static boolean a(Long l) {
        if (l == null) {
            Logger.v(f45839a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - System.currentTimeMillis() >= 0) {
                Logger.i(f45839a, "isSpExpire false.");
                return false;
            }
            Logger.i(f45839a, "isSpExpire true.");
            return true;
        } catch (NumberFormatException unused) {
            Logger.v(f45839a, "isSpExpire spValue NumberFormatException.");
        }
    }

    public static boolean a(Long l, long j) {
        if (l == null) {
            Logger.v(f45839a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.v(f45839a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f45839a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
