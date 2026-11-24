package a;

import android.gov.nist.core.Separators;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class i950 implements h950 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3d0 f14371a;
    public final t3d0 b;

    public i950(v3d0 v3d0Var, t3d0 t3d0Var) {
        v3d0Var.getClass();
        t3d0Var.getClass();
        this.f14371a = v3d0Var;
        this.b = t3d0Var;
    }

    @Override // a.h950
    public final boolean a(int i) {
        return ((Boolean) c(i).c).booleanValue();
    }

    @Override // a.h950
    public final String b(int i) {
        prs0 prs0VarC = c(i);
        List list = (List) prs0VarC.f27482a;
        String strB0 = CollectionsKt.b0((List) prs0VarC.b, Separators.DOT, null, null, null, 62);
        if (list.isEmpty()) {
            return strB0;
        }
        return CollectionsKt.b0(list, Separators.SLASH, null, null, null, 62) + '/' + strB0;
    }

    public final prs0 c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            s3d0 s3d0Var = (s3d0) this.b.b.get(i);
            String str = (String) this.f14371a.b.get(s3d0Var.d);
            r3d0 r3d0Var = s3d0Var.e;
            r3d0Var.getClass();
            int iOrdinal = r3d0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = s3d0Var.c;
        }
        return new prs0(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // a.h950
    public final String getString(int i) {
        String str = (String) this.f14371a.b.get(i);
        str.getClass();
        return str;
    }
}
