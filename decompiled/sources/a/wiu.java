package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class wiu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yox f39236a;

    public wiu(yox yoxVar) {
        this.f39236a = yoxVar;
    }

    public final Locale a() {
        kuy kuyVar = (kuy) this.f39236a.f43005a;
        String strA = kuyVar.c;
        String str = "";
        if (strA == null && (strA = q7d0.c(kuyVar.f18934a, "LANGUAGE_LOCALE_NAME")) == null) {
            strA = "";
        }
        if (StringsKt.W(strA)) {
            strA = kuyVar.a();
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(strA, new String[]{BundleUtil.UNDERLINE_TAG}, false, 0, 6, null);
            String str2 = (String) CollectionsKt.W(0, listSplit$default);
            if (str2 != null) {
                strA = str2;
            }
            String str3 = (String) CollectionsKt.W(1, listSplit$default);
            if (str3 != null) {
                str = str3;
            }
            return new Locale(strA, str);
        } catch (Exception unused) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            return locale;
        }
    }
}
