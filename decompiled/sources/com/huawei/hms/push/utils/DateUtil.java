package com.huawei.hms.push.utils;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.log.HMSLog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class DateUtil {
    private DateUtil() {
    }

    public static String parseMilliSecondToString(Long l) {
        if (l == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(l);
        } catch (Exception e) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e);
            return null;
        }
    }

    public static long parseUtcToMillisecond(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str.substring(0, str.indexOf(Separators.DOT)).concat(str.substring(str.indexOf(Separators.DOT)).substring(0, 4).concat("Z"))).getTime();
    }
}
