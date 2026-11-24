package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class yut0 extends c44 {
    public static final /* synthetic */ int f = 0;
    public final int b;
    public final String c;
    public final Bundle d;
    public final List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yut0(int i, String str, String str2, Bundle bundle, ArrayList arrayList, LinkedHashMap linkedHashMap, int i2) {
        super(str2, (byte) 15);
        bundle = (i2 & 16) != 0 ? Bundle.EMPTY : bundle;
        arrayList = (i2 & 32) != 0 ? null : arrayList;
        str.getClass();
        this.b = i;
        this.c = str;
        this.d = bundle;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yut0)) {
            return false;
        }
        yut0 yut0Var = (yut0) obj;
        if (this.b != yut0Var.b) {
            return false;
        }
        Bundle bundle = yut0Var.d;
        Bundle bundle2 = this.d;
        return bundle2 == null ? bundle == null : Intrinsics.d(bundle2, bundle);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bundle bundle = this.d;
        return i + (bundle != null ? bundle.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        Bundle bundle = this.d;
        if (bundle != null && bundle.containsKey("access_token")) {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putString("access_token", ParameterNames.HIDDEN);
            bundle = bundle2;
        }
        StringBuilder sb = new StringBuilder("VKApiExecutionException{code=");
        sb.append(this.b);
        sb.append(", extra=");
        sb.append(bundle);
        sb.append(", method=");
        sb.append(this.c);
        sb.append(", executeErrors=");
        List list = this.e;
        sb.append(list != null ? CollectionsKt.b0(list, null, "[", "]", null, 57) : null);
        sb.append(", super=");
        return axq.m(sb, super.toString(), '}');
    }
}
