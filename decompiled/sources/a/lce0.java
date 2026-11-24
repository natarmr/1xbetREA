package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class lce0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19795a;
    public final Object b;

    public /* synthetic */ lce0(Object obj, byte b) {
        this.f19795a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y78 y78Var;
        String property;
        List listG0;
        byte b = this.f19795a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((f1d0) obj).invoke();
            case 1:
                return (gke0) obj;
            case 2:
                return (riu0) ((lce0) obj).invoke();
            case 3:
                return (jne0) obj;
            case 4:
                return (riu0) ((lce0) obj).invoke();
            case 5:
                return (woe0) obj;
            case 6:
                return (riu0) ((lce0) obj).invoke();
            case 7:
                return (ppe0) obj;
            case 8:
                return (riu0) ((lce0) obj).invoke();
            case 9:
                hre0 hre0Var = (hre0) obj;
                if (fre0.V(hre0Var.c())) {
                    if (!(hre0Var instanceof csy)) {
                        return iun.f15405a;
                    }
                    csy csyVar = (csy) hre0Var;
                    ArrayList arrayList = csyVar.b.e;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(jwb.S((voy) it.next(), bqe0.d(csyVar.f4912a.K().j())));
                    }
                    return arrayList2;
                }
                Member memberB = hre0Var.c().x().b();
                byte b2 = 4;
                int length = 0;
                if (memberB instanceof Method) {
                    y78Var = new y78(memberB, hre0Var.j() + (Modifier.isStatic(((Method) memberB).getModifiers()) ? 0 : -1), b2);
                } else {
                    if (!(memberB instanceof Constructor)) {
                        ohq.u(memberB, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberB;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (sre0.f32672a.b(declaringClass).i() && (property = System.getProperty("java.version")) != null && kotlin.text.c.x(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    y78Var = new y78(memberB, hre0Var.j() + length, b2);
                }
                int i = y78Var.b;
                Member member = (Member) y78Var.c;
                if (member instanceof Method) {
                    Annotation[] annotationArr = ((Method) member).getParameterAnnotations()[i];
                    annotationArr.getClass();
                    listG0 = tx3.g0(annotationArr);
                } else if (member instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) member).getParameterAnnotations()[i];
                    annotationArr2.getClass();
                    listG0 = tx3.g0(annotationArr2);
                } else {
                    listG0 = iun.f15405a;
                }
                return xtt0.t(listG0);
            case 10:
                return (m6f0) obj;
            case 11:
                return (riu0) ((lce0) obj).invoke();
            case 12:
                return (fdf0) obj;
            case 13:
                return (riu0) ((lce0) obj).invoke();
            case 14:
                return new q0h0((p0h0) ((rif0) obj).invoke());
            case 15:
                return (vif0) obj;
            case 16:
                return (riu0) ((lce0) obj).invoke();
            case 17:
                return (vof0) obj;
            case 18:
                return (riu0) ((lce0) obj).invoke();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (kqf0) obj;
            case 20:
                return (riu0) ((lce0) obj).invoke();
            case 21:
                return (iuf0) obj;
            case 22:
                return (riu0) ((lce0) obj).invoke();
            case 23:
                return (zuf0) obj;
            case 24:
                return (riu0) ((lce0) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (dwf0) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((lce0) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (hxf0) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((lce0) obj).invoke();
            default:
                return (riu0) ((dxf0) obj).invoke();
        }
    }
}
