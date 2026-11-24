package com.huawei.hms.support.feature.result;

import a.twn;
import android.text.TextUtils;
import com.huawei.hms.common.api.CommonStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAuthResultCode extends CommonStatusCodes {
    public static final int RESULT_CODE_CANCELLED = 2012;
    public static final int RESULT_CODE_EXECUTING = 2013;
    public static final int RESULT_CODE_FAILED = 2014;
    public static final int SIGN_IN_JSONEXCEPTION = 2015;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f45985a;

    static {
        HashMap map = new HashMap();
        f45985a = map;
        map.put(2012, "Auth canceled by subscriber");
        map.put(2013, "Auth executing");
        map.put(2014, "An unrecoverable auth failure occurred");
    }

    public static String getResultDescription(int i) {
        String str = f45985a.get(Integer.valueOf(i));
        return TextUtils.isEmpty(str) ? twn.m(i, "unknown status code: ") : str;
    }
}
