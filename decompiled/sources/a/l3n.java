package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class l3n implements n3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3n f19365a = new l3n();

    @Override // a.n3n
    public final j83 a() {
        StringBuilder sb = new StringBuilder(true & true ? 16 : 0);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((g83) arrayList.get(i)).a(sb.length()));
        }
        return new j83(string, arrayList2);
    }

    @Override // a.n3n
    public final j83 b() {
        StringBuilder sb = new StringBuilder(true & true ? 16 : 0);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((g83) arrayList.get(i)).a(sb.length()));
        }
        return new j83(string, arrayList2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l3n);
    }

    public final int hashCode() {
        return 1321796607;
    }

    public final String toString() {
        return "Skeleton";
    }
}
