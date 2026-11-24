package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;

/* JADX INFO: loaded from: classes2.dex */
public final class kch implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18059a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ kch(Object obj, Object obj2, Object obj3, byte b) {
        this.f18059a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18059a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ComponentCallbacks2 componentCallbacks2 = (Application) obj3;
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(k1h.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof k1h)) {
                        ze3Var = null;
                    }
                    k1h k1hVar = (k1h) ze3Var;
                    if (k1hVar != null) {
                        return k1hVar.a(new CyberHomeParams((CyberGamesPage) obj2, (CyberGamesParentSectionModel) obj));
                    }
                }
                jf4.n(b1j.i(k1h.class, "Cannot create dependency "));
                return null;
            case 1:
                return ((sfy) obj3).a((ByteArrayInputStream) obj2, (sso) ((f6i) ((pfk) obj).b.f10647a).r);
            case 2:
                n9y n9yVar = (n9y) obj3;
                a8z a8zVar = n9yVar.i;
                ihy ihyVar = (ihy) obj2;
                rgy rgyVar = (rgy) obj;
                if (Modifier.isStatic(n9yVar.B().getModifiers())) {
                    return null;
                }
                ihyVar.getClass();
                xgy xgyVar = (xgy) ihyVar;
                if (xgyVar.X() != null) {
                    return null;
                }
                ArrayList arrayListB = two.b(xgyVar, two.h(n9yVar, j0o.f15691a));
                if (rgyVar.c() && arrayListB.size() == 1) {
                    return null;
                }
                nre0 nre0Var = new nre0(x83.METHOD_RETURN_TYPE, false);
                v2 v2Var = (v2) a8zVar.getValue();
                ArrayList arrayList = new ArrayList(r3d.q(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    kiy returnType = ((gre0) it.next()).getReturnType();
                    returnType.getClass();
                    arrayList.add((v2) returnType);
                }
                g5 g5VarL = nre0Var.L(v2Var, arrayList, null, false);
                v2 v2Var2 = (v2) a8zVar.getValue();
                v2Var2.getClass();
                v2 v2Var3 = (v2) cww.t(v2Var2, g5VarL, 0).c;
                if (v2Var3 != null) {
                    v2Var2 = v2Var3;
                }
                List<hre0> list = (List) n9yVar.h.getValue();
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (hre0 o9yVar : list) {
                    nre0 nre0Var2 = new nre0(x83.VALUE_PARAMETER, o9yVar.u());
                    if (o9yVar instanceof o9y) {
                        o9y o9yVar2 = (o9y) o9yVar;
                        kiy kiyVar = o9yVar2.c;
                        kiyVar.getClass();
                        v2 v2Var4 = (v2) kiyVar;
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListB, 10));
                        Iterator it2 = arrayListB.iterator();
                        while (it2.hasNext()) {
                            kiy kiyVarP = ((hre0) ((gre0) it2.next()).getParameters().get(o9yVar2.d)).p();
                            kiyVarP.getClass();
                            arrayList3.add((v2) kiyVarP);
                        }
                        g5 g5VarL2 = nre0Var2.L(v2Var4, arrayList3, null, false);
                        e9y e9yVar = o9yVar2.f24903a;
                        String str = o9yVar2.b;
                        v2 v2Var5 = (v2) cww.t(v2Var4, g5VarL2, 0).c;
                        o9yVar = new o9y(e9yVar, str, v2Var5 == null ? v2Var4 : v2Var5, o9yVar2.d, o9yVar2.e, o9yVar2.f);
                    }
                    arrayList2.add(o9yVar);
                }
                return new m9y(arrayList2, v2Var2);
            case 3:
                xgy xgyVar2 = (xgy) obj3;
                Class cls = (Class) obj2;
                qlc qlcVar = (qlc) obj;
                Class cls2 = xgyVar2.b;
                if (Intrinsics.d(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iH = tx3.H(cls, interfaces);
                if (iH < 0) {
                    udk.f("No superclass of ", xgyVar2, " in Java reflection for ", qlcVar);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iH];
                type.getClass();
                return type;
            case 4:
                baz bazVar = (baz) obj3;
                return new bu00((eu00) ((v7i) bazVar.b.b).i, new nsr(bazVar, (sqe0) obj2, (mie0) obj));
            default:
                st0 st0Var = (st0) obj2;
                ((Function1) obj3).invoke(new w1b0(st0Var.f32750a, ((g2b0) ((j2b0) obj)).f10552a, st0Var.g));
                return Unit.f46060a;
        }
    }
}
