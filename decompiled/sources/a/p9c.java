package a;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class p9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g950 f26599a;
    public final Regex b;
    public final Collection c;
    public final Function1 d;
    public final eyb[] e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p9c(g950 g950Var, eyb[] eybVarArr, Function1 function1) {
        this(g950Var, null, null, function1, (eyb[]) Arrays.copyOf(eybVarArr, eybVarArr.length));
        g950Var.getClass();
    }

    public /* synthetic */ p9c(g950 g950Var, eyb[] eybVarArr) {
        this(g950Var, eybVarArr, i13.q);
    }

    public p9c(g950 g950Var, Regex regex, Collection collection, Function1 function1, eyb... eybVarArr) {
        this.f26599a = g950Var;
        this.b = regex;
        this.c = collection;
        this.d = function1;
        this.e = eybVarArr;
    }

    public /* synthetic */ p9c(Collection collection, eyb[] eybVarArr) {
        this(collection, eybVarArr, i13.s);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p9c(Collection collection, eyb[] eybVarArr, Function1 function1) {
        this(null, null, collection, function1, (eyb[]) Arrays.copyOf(eybVarArr, eybVarArr.length));
        collection.getClass();
    }
}
