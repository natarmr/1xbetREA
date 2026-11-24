package androidx.compose.runtime;

import a.agk0;
import a.cgk0;
import a.egk0;
import a.fet;
import a.igk0;
import a.pz40;
import a.rek0;
import a.ukd;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final agk0 a(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final cgk0 b(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final egk0 c(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final pz40 d(Object obj, igk0 igk0Var) {
        return new ParcelableSnapshotMutableState(obj, igk0Var);
    }

    public static pz40 e(Object obj) {
        return new ParcelableSnapshotMutableState(obj, rek0.c);
    }

    public static final pz40 f(Object obj, fet fetVar) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = e(obj);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        pz40Var.setValue(obj);
        return pz40Var;
    }
}
