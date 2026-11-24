package a;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f27704a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(mwb0.f22496a, 0);
        map.put(mwb0.b, 1);
        map.put(mwb0.c, 2);
        for (mwb0 mwb0Var : map.keySet()) {
            f27704a.append(((Integer) b.get(mwb0Var)).intValue(), mwb0Var);
        }
    }

    public static int a(mwb0 mwb0Var) {
        Integer num = (Integer) b.get(mwb0Var);
        if (num != null) {
            return num.intValue();
        }
        e9d0.v(mwb0Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static mwb0 b(int i) {
        mwb0 mwb0Var = (mwb0) f27704a.get(i);
        if (mwb0Var != null) {
            return mwb0Var;
        }
        jf4.o(twn.m(i, "Unknown Priority for value "));
        return null;
    }
}
