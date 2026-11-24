package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b1> f45889a;
    private String b;
    private String c;
    private String d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.f45889a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    private void a(List<b1> list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i = 0;
        while (i < size) {
            int i2 = i * 500;
            List<b1> listSubList = list.subList(i2, Math.min(list.size(), i2 + 500));
            String strReplace = UUID.randomUUID().toString().replace("-", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB = ((long) a1.b(str2, str)) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (b1 b1Var : listSubList) {
                if (!c0.a(b1Var.b(), jCurrentTimeMillis, jB)) {
                    arrayList.add(b1Var);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new l0(str4, str3, this.d, arrayList, strReplace).a();
            } else {
                str3 = str;
                str4 = str2;
                v.e("hmsSdk", "No data to report handler");
            }
            i++;
            str2 = str4;
            str = str3;
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.c)) {
            a(this.f45889a, this.c, this.b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.f45889a) {
            String strC = b1Var.c();
            if (TextUtils.isEmpty(strC) || "oper".equals(strC)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(strC)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(strC)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(strC)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
