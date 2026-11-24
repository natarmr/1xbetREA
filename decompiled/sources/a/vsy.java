package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v35 a.vsy[], still in use, count: 1, list:
  (r1v35 a.vsy[]) from 0x026a: CONSTRUCTOR (r2v9 a.c0o) = (r1v35 a.vsy[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:619) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class vsy {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANION_MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANION_EXTENSION_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANION_MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANION_EXTENSION_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);

    public static final HashMap b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final /* synthetic */ c0o m1;
    public static final List n;
    public static final Map o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37975a;

    static {
        c0o c0oVar = new c0o(vsyVarArr);
        m1 = c0oVar;
        b = new HashMap();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            vsy vsyVar = (vsy) y2Var.next();
            b.put(vsyVar.name(), vsyVar);
        }
        c0o c0oVar2 = m1;
        ArrayList arrayList = new ArrayList();
        c0oVar2.getClass();
        y2 y2Var2 = new y2(c0oVar2, (byte) 0);
        while (y2Var2.hasNext()) {
            Object next = y2Var2.next();
            if (((vsy) next).f37975a) {
                arrayList.add(next);
            }
        }
        CollectionsKt.P0(arrayList);
        CollectionsKt.P0(m1);
        vsy vsyVar2 = ANNOTATION_CLASS;
        vsy vsyVar3 = CLASS;
        c = q3d.j(vsyVar2, vsyVar3);
        d = q3d.j(LOCAL_CLASS, vsyVar3);
        e = q3d.j(CLASS_ONLY, vsyVar3);
        vsy vsyVar4 = COMPANION_OBJECT;
        vsy vsyVar5 = OBJECT;
        f = q3d.j(vsyVar4, vsyVar5, vsyVar3);
        g = q3d.j(STANDALONE_OBJECT, vsyVar5, vsyVar3);
        h = q3d.j(INTERFACE, vsyVar3);
        i = q3d.j(ENUM_CLASS, vsyVar3);
        vsy vsyVar6 = ENUM_ENTRY;
        vsy vsyVar7 = PROPERTY;
        vsy vsyVar8 = FIELD;
        j = q3d.j(vsyVar6, vsyVar7, vsyVar8);
        vsy vsyVar9 = PROPERTY_SETTER;
        k = kotlin.collections.a.c(vsyVar9);
        vsy vsyVar10 = PROPERTY_GETTER;
        l = kotlin.collections.a.c(vsyVar10);
        m = kotlin.collections.a.c(FUNCTION);
        vsy vsyVar11 = FILE;
        n = kotlin.collections.a.c(vsyVar11);
        b93 b93Var = b93.CONSTRUCTOR_PARAMETER;
        vsy vsyVar12 = VALUE_PARAMETER;
        o = xp20.f(new Pair(b93Var, vsyVar12), new Pair(b93.FIELD, vsyVar8), new Pair(b93.PROPERTY, vsyVar7), new Pair(b93.FILE, vsyVar11), new Pair(b93.PROPERTY_GETTER, vsyVar10), new Pair(b93.PROPERTY_SETTER, vsyVar9), new Pair(b93.RECEIVER, vsyVar12), new Pair(b93.SETTER_PARAMETER, vsyVar12), new Pair(b93.PROPERTY_DELEGATE_FIELD, vsyVar8));
    }

    public vsy(boolean z) {
        super(str, i);
        this.f37975a = z;
    }

    public static vsy valueOf(String str) {
        return (vsy) Enum.valueOf(vsy.class, str);
    }

    public static vsy[] values() {
        return (vsy[]) l1.clone();
    }
}
