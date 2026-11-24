package a;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public enum jek {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set b;
    public static final Set c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16378a;

    static {
        jek[] jekVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (jek jekVar : jekVarArrValues) {
            if (jekVar.f16378a) {
                arrayList.add(jekVar);
            }
        }
        b = CollectionsKt.P0(arrayList);
        c = tx3.l0(values());
    }

    jek(boolean z) {
        this.f16378a = z;
    }
}
