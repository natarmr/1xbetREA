package a;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f23113a = xp20.f(new Pair("PACKAGE", EnumSet.noneOf(vsy.class)), new Pair("TYPE", EnumSet.of(vsy.CLASS, vsy.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(vsy.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(vsy.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(vsy.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(vsy.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(vsy.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(vsy.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(vsy.FUNCTION, vsy.PROPERTY_GETTER, vsy.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(vsy.TYPE)));
    public static final Map b = xp20.f(new Pair("RUNTIME", usy.f36233a), new Pair("CLASS", usy.b), new Pair("SOURCE", usy.c));

    public static mx3 a(List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (obj instanceof rqe0) {
                arrayListU.add(obj);
            }
        }
        ArrayList<vsy> arrayList = new ArrayList();
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f23113a.get(g950.e(((rqe0) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = xun.f41520a;
            }
            w3d.u(arrayList, iterable);
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (vsy vsyVar : arrayList) {
            swq swqVar = i4m0.u;
            swqVar.getClass();
            arrayList2.add(new h0o(new qlc(swqVar.b(), swqVar.f32934a.g()), g950.e(vsyVar.name())));
        }
        return new mx3(arrayList2, j9x.g);
    }
}
