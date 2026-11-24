package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class slc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final slc f32392a;
    public static final slc b;
    public static final slc c;
    public static final slc d;
    public static final slc e;
    public static final slc f;
    public static final /* synthetic */ slc[] g;

    static {
        slc slcVar = new slc("CLASS", 0);
        f32392a = slcVar;
        slc slcVar2 = new slc("INTERFACE", 1);
        b = slcVar2;
        slc slcVar3 = new slc("ENUM_CLASS", 2);
        c = slcVar3;
        slc slcVar4 = new slc("ENUM_ENTRY", 3);
        d = slcVar4;
        slc slcVar5 = new slc("ANNOTATION_CLASS", 4);
        e = slcVar5;
        slc slcVar6 = new slc("OBJECT", 5);
        f = slcVar6;
        g = new slc[]{slcVar, slcVar2, slcVar3, slcVar4, slcVar5, slcVar6};
    }

    public static slc valueOf(String str) {
        return (slc) Enum.valueOf(slc.class, str);
    }

    public static slc[] values() {
        return (slc[]) g.clone();
    }

    public final boolean a() {
        return this == f || this == d;
    }
}
