package a;

import android.gov.nist.core.Separators;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j83 implements CharSequence {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16067a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        v0h0 v0h0Var = z0h0.f43566a;
    }

    public j83(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f16067a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                i83 i83Var = (i83) list.get(i);
                Object obj = i83Var.f14321a;
                if (obj instanceof smk0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(i83Var);
                } else if (obj instanceof eo80) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(i83Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listA0 = arrayList2 != null ? CollectionsKt.A0(arrayList2, new s7f((byte) 15)) : null;
        if (listA0 == null || listA0.isEmpty()) {
            return;
        }
        int i2 = ((i83) CollectionsKt.U(listA0)).c;
        MutableIntList mutableIntList = IntListKt.f45341a;
        MutableIntList mutableIntList2 = new MutableIntList(1);
        mutableIntList2.a(i2);
        int size2 = listA0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            i83 i83Var2 = (i83) listA0.get(i3);
            while (mutableIntList2.b != 0) {
                int iD = mutableIntList2.d();
                if (i83Var2.b < iD) {
                    int i4 = i83Var2.c;
                    if (i4 > iD) {
                        ycx.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                mutableIntList2.e(mutableIntList2.b - 1);
            }
            mutableIntList2.a(i83Var2.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List a(int i) {
        ?? arrayList;
        List list = this.f16067a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                i83 i83Var = (i83) obj;
                if ((i83Var.f14321a instanceof kb00) && k83.b(0, i, i83Var.b, i83Var.c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = iun.f15405a;
        }
        arrayList.getClass();
        return arrayList;
    }

    public final j83 b(Function1 function1) {
        h83 h83Var = new h83(this);
        ArrayList arrayList = h83Var.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i83 i83Var = (i83) function1.invoke(((g83) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new g83(i83Var.b, i83Var.c, i83Var.f14321a, i83Var.d));
        }
        return h83Var.h();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j83 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            ycx.a("start (" + i + ") should be less or equal to end (" + i2 + Separators.RPAREN);
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        j83 j83Var = k83.f17854a;
        if (i > i2) {
            ycx.a("start (" + i + ") should be less than or equal to end (" + i2 + Separators.RPAREN);
        }
        List list = this.f16067a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i83 i83Var = (i83) list.get(i3);
                int i4 = i83Var.b;
                int i5 = i83Var.c;
                if (k83.b(i, i2, i4, i5)) {
                    arrayList2.add(new i83(Math.max(i, i83Var.b) - i, Math.min(i2, i5) - i, i83Var.f14321a, i83Var.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new j83(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j83)) {
            return false;
        }
        j83 j83Var = (j83) obj;
        return Intrinsics.d(this.b, j83Var.b) && Intrinsics.d(this.f16067a, j83Var.f16067a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.f16067a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public j83(String str) {
        this(str, iun.f15405a);
    }

    public j83(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
