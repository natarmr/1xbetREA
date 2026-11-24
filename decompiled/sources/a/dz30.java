package a;

import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class dz30 extends f5r {
    public final /* synthetic */ byte m = 0;
    public final Map n;
    public final Object o;

    /* JADX WARN: Illegal instructions before constructor call */
    public dz30(List list, Fragment fragment) {
        list.getClass();
        androidx.fragment.app.e eVarC = fragment.C();
        n6r n6rVarK = fragment.K();
        n6rVarK.b();
        super(eVarC, n6rVarK.c);
        this.o = list;
        this.n = xp20.f(new Pair(r040.TOP, new gj30((byte) 15)), new Pair(r040.SPORTS, new gj30((byte) 16)), new Pair(r040.AGGREGATOR, new gj30((byte) 17)), new Pair(r040.VIRTUAL, new gj30((byte) 18)), new Pair(r040.GAMES, new gj30((byte) 19)), new Pair(r040.OTHER, new gj30((byte) 20)));
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        Fragment fragment;
        Fragment fragment2;
        byte b = this.m;
        Object obj = this.o;
        Map map = this.n;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) map.get(((e140) obj).c.get(i));
                return (function0 == null || (fragment = (Fragment) function0.invoke()) == null) ? new Fragment() : fragment;
            default:
                Function0 function1 = (Function0) map.get(((List) obj).get(i));
                return (function1 == null || (fragment2 = (Fragment) function1.invoke()) == null) ? new Fragment() : fragment2;
        }
    }

    @Override // a.yge0
    public final int d() {
        byte b = this.m;
        Object obj = this.o;
        switch (b) {
            case 0:
                return ((e140) obj).b.size();
            default:
                return ((List) obj).size();
        }
    }

    public dz30(e140 e140Var, Fragment fragment) {
        super(fragment.C(), fragment.u1);
        this.o = e140Var;
        this.n = xp20.f(new Pair(r040.TOP, new gj30((byte) 8)), new Pair(r040.SPORTS, new gj30((byte) 9)), new Pair(r040.AGGREGATOR, new gj30((byte) 10)), new Pair(r040.VIRTUAL, new gj30((byte) 11)), new Pair(r040.GAMES, new gj30((byte) 12)), new Pair(r040.OTHER, new gj30((byte) 13)));
    }
}
