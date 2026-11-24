package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class tfe implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33860a;
    public final int b;
    public final Object c;

    public tfe(int i, cgk0 cgk0Var) {
        this.f33860a = (byte) 0;
        this.b = i;
        this.c = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33860a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((cgk0) obj).m(i);
                return Unit.f46060a;
            case 1:
                v2 v2Var = (v2) ((Function0) obj).invoke();
                a8z a8zVarA = maz.a(wez.f39042a, new svc(v2Var, (byte) 28));
                mre0 mre0Var = v2Var.f36658a;
                Type type = mre0Var != null ? (Type) mre0Var.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i != 0) {
                        ohq.u(v2Var, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    ohq.u(v2Var, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) a8zVarA.getValue()).get(i);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) tx3.B(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) tx3.A(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
            case 2:
                return (go80) ((List) obj).get(i);
            case 3:
                Object obj2 = ((mp9) obj).z().get(i);
                obj2.getClass();
                return (go80) obj2;
            default:
                omn omnVar = (omn) obj;
                ddk ddkVar = omn.p2;
                phf0 phf0Var = omnVar.m2;
                iiy[] iiyVarArr = omn.q2;
                vcc.f0(i120.V(new Pair(omnVar.n2.n(omnVar, iiyVarArr[3]), Integer.valueOf(i))), omnVar, phf0Var.n(omnVar, iiyVarArr[2]));
                omnVar.y0();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ tfe(Object obj, int i, byte b) {
        this.f33860a = b;
        this.c = obj;
        this.b = i;
    }
}
