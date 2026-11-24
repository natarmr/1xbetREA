package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ank0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1159a;

    public ank0(List list) {
        list.getClass();
        this.f1159a = list;
    }

    public final String a() {
        return CollectionsKt.b0(this.f1159a, null, null, null, new ejk0((byte) 3), 31);
    }

    public final SpannableString b(Context context) {
        context.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List list = this.f1159a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(spannableStringBuilder.append((CharSequence) ((zmk0) it.next()).a(context)));
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
        spannableStringValueOf.getClass();
        return spannableStringValueOf;
    }

    public final SpannableString c(Context context) {
        context.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        by7 by7Var = cy7.c() ? by7.e : by7.d;
        List list = this.f1159a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpannableString spannableStringA = ((zmk0) it.next()).a(context);
            by7Var.getClass();
            s88 s88Var = o5q0.f24700a;
            arrayList.add(spannableStringBuilder.append((CharSequence) by7Var.d(spannableStringA)));
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
        spannableStringValueOf.getClass();
        return spannableStringValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ank0) && Intrinsics.d(this.f1159a, ((ank0) obj).f1159a);
    }

    public final int hashCode() {
        return this.f1159a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f1159a, "SpannableModel(input=", Separators.RPAREN);
    }
}
