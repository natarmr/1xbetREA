package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class pr3 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27445a;
    public final /* synthetic */ ApplicationActivity b;

    public pr3(ApplicationActivity applicationActivity, vne vneVar) {
        this.f27445a = (byte) 2;
        this.b = applicationActivity;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        byte b = this.f27445a;
        ApplicationActivity applicationActivity = this.b;
        switch (b) {
            case 0:
                erq erqVar = (erq) obj;
                p7m0 p7m0Var = applicationActivity.B().f10265a.f32216a;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, ahk.a((ahk) value, null, null, erqVar, null, null, 59)));
                break;
            case 1:
                t9o0 t9o0Var = (t9o0) obj;
                fwk fwkVarB = applicationActivity.B();
                t9o0Var.getClass();
                shk shkVar = fwkVarB.f10265a;
                shkVar.getClass();
                p7m0 p7m0Var2 = shkVar.f32216a;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ahk.a((ahk) value2, null, null, null, t9o0Var, null, 55)));
                break;
            default:
                jjv0 jjv0Var = (jjv0) obj;
                int i = ApplicationActivity.F1;
                zu3 zu3VarF = applicationActivity.F();
                List list = jjv0Var.f16636a;
                boolean z = false;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((tmv) it.next()) instanceof tmv) {
                            z = true;
                        }
                    }
                }
                sac.V(jiu0.a(zu3VarF), lu3.f20654a, null, zu3VarF.g.b, new mu3(zu3VarF, z, null), 10);
                List list2 = jjv0Var.f16636a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof tmv) {
                        arrayList.add(obj2);
                    }
                }
                tmv tmvVar = (tmv) CollectionsKt.firstOrNull(arrayList);
                if (tmvVar != null) {
                    m60 m60Var = tmvVar.c;
                    applicationActivity.F().y(m60Var != m60.f ? m60Var != m60.g ? new yqq(i120.a0(applicationActivity)) : new zqq(i120.a0(applicationActivity)) : new xqq(i120.a0(applicationActivity)));
                } else {
                    applicationActivity.F().y(new yqq(i120.a0(applicationActivity)));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pr3(ApplicationActivity applicationActivity, byte b) {
        this.f27445a = b;
        this.b = applicationActivity;
    }
}
