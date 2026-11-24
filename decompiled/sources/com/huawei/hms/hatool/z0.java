package com.huawei.hms.hatool;

import a.twn;
import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45894a;
    public l1 b;

    public z0(String str) {
        this.f45894a = str;
        this.b = new l1(str);
        s.c().a(this.f45894a, this.b);
    }

    private boolean c(int i) {
        String str;
        if (i != 2) {
            s0 s0VarB = b(i);
            if (s0VarB != null && !TextUtils.isEmpty(s0VarB.h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.f45894a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        v.e("hmsSdk", str);
        return false;
    }

    public void a(Context context, String str, String str2) {
        v.d("hmsSdk", "onEvent(context). TAG: " + this.f45894a + ", eventId : " + str);
        if (context == null) {
            v.e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (e1.a(str) || !c(0)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f45894a);
        } else {
            if (!e1.a("value", str2, 65536)) {
                v.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f45894a);
                str2 = "";
            }
            g0.a().a(this.f45894a, context, str, str2);
        }
    }

    public void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder sb = new StringBuilder("onStreamEvent. TAG: ");
        twn.w(i, this.f45894a, ", TYPE: ", ", eventId : ", sb);
        sb.append(str);
        v.d("hmsSdk", sb.toString());
        if (e1.a(str) || !c(i)) {
            v.e("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f45894a + ", TYPE: " + i);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f45894a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g0.a().b(this.f45894a, i, str, linkedHashMap);
    }

    public void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        StringBuilder sb = new StringBuilder("onEvent. TAG: ");
        twn.w(i, this.f45894a, ", TYPE: ", ", eventId : ", sb);
        sb.append(str);
        v.d("hmsSdk", sb.toString());
        if (e1.a(str) || !c(i)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f45894a + ", TYPE: " + i);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f45894a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        g0.a().a(this.f45894a, i, str, linkedHashMap);
    }

    public void a(int i) {
        v.d("hmsSdk", "onReport. TAG: " + this.f45894a + ", TYPE: " + i);
        g0.a().a(this.f45894a, i);
    }

    public void a(s0 s0Var) {
        l1 l1Var;
        v.a("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f45894a);
        if (s0Var == null) {
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            l1Var = this.b;
            s0Var = null;
        } else {
            l1Var = this.b;
        }
        l1Var.a(s0Var);
    }

    private s0 b(int i) {
        if (i == 0) {
            return this.b.c();
        }
        if (i == 1) {
            return this.b.b();
        }
        if (i == 2) {
            return this.b.d();
        }
        if (i != 3) {
            return null;
        }
        return this.b.a();
    }

    public void b(s0 s0Var) {
        v.a("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f45894a);
        l1 l1Var = this.b;
        if (s0Var != null) {
            l1Var.b(s0Var);
        } else {
            l1Var.b(null);
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }
}
