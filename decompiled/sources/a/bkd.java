package a;

import android.gov.nist.core.Separators;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bkd extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy40 f2742a;
    public final vy40 b;
    public final MutableIntList c;
    public final int d;

    public bkd(vy40 vy40Var, vy40 vy40Var2, MutableIntList mutableIntList, int i, Exception exc) {
        super(exc);
        this.f2742a = vy40Var;
        this.b = vy40Var2;
        this.c = mutableIntList;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listC;
        egi0 egi0VarA = igi0.a(new akd(this, null));
        if (egi0VarA.hasNext()) {
            Object next = egi0VarA.next();
            if (egi0VarA.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (egi0VarA.hasNext()) {
                    arrayList.add(egi0VarA.next());
                }
                listC = arrayList;
            } else {
                listC = kotlin.collections.a.c(next);
            }
        } else {
            listC = iun.f15405a;
        }
        return ntm0.d("\n            |Failed to execute op number " + this.d + ":\n            |" + CollectionsKt.b0(CollectionsKt.E0(50, listC), Separators.RETURN, null, null, null, 62) + "\n            ");
    }
}
