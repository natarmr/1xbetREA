package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z7f implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43916a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f43916a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return Collections.unmodifiableList(arrayList).contains(str);
            case 3:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith(BundleUtil.UNDERLINE_TAG);
        }
    }
}
