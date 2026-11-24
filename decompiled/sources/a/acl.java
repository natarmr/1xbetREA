package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class acl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final acl f633a;
    public static final acl b;
    public static final acl c;
    public static final acl d;
    public static final /* synthetic */ acl[] e;

    static {
        acl aclVar = new acl("Up", 0);
        f633a = aclVar;
        acl aclVar2 = new acl("Drag", 1);
        b = aclVar2;
        acl aclVar3 = new acl("Timeout", 2);
        c = aclVar3;
        acl aclVar4 = new acl("Cancel", 3);
        d = aclVar4;
        e = new acl[]{aclVar, aclVar2, aclVar3, aclVar4};
    }

    public static acl valueOf(String str) {
        return (acl) Enum.valueOf(acl.class, str);
    }

    public static acl[] values() {
        return (acl[]) e.clone();
    }
}
