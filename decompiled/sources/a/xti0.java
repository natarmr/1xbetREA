package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class xti0 implements jr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f41467a = new Regex("^ {0,3}(-+|=+) *$");

    @Override // a.jr20
    public final List a(k810 k810Var, y78 y78Var, mr20 mr20Var) {
        CharSequence charSequenceV;
        Object next;
        mr20Var.getClass();
        Iterator it = mr20Var.c.iterator();
        do {
            charSequenceV = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ir20) next) instanceof co80));
        if (((co80) next) != null) {
            return iun.f15405a;
        }
        v9d v9dVar = mr20Var.f22248a;
        if (!Intrinsics.d(mr20Var.b, v9dVar)) {
            return iun.f15405a;
        }
        v9dVar.getClass();
        if (k810Var.b == idx.x(v9dVar, k810Var.d)) {
            int i = k810Var.f17851a + 1;
            ArrayList arrayList = (ArrayList) k810Var.e.b;
            CharSequence charSequence = i < arrayList.size() ? (CharSequence) arrayList.get(i) : null;
            if (charSequence != null) {
                v9d v9dVarB = v9dVar.b(k810Var.d());
                if (idx.w(v9dVarB, v9dVar)) {
                    charSequenceV = idx.v(v9dVarB, charSequence);
                }
            }
            if (charSequenceV != null && f41467a.g(charSequenceV)) {
                return kotlin.collections.a.c(new wti0(y78Var, v9dVar));
            }
        }
        return iun.f15405a;
    }

    @Override // a.jr20
    public final boolean b(v9d v9dVar, k810 k810Var) {
        return false;
    }
}
