package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dey extends ez40 {
    public static final dey b = new dey(eey.class, "jvmFlags", "getJvmFlags(Lkotlin/metadata/KmProperty;)I", 1);

    @Override // a.ez40, a.giy
    public final Object get(Object obj) {
        iiy[] iiyVarArr = eey.f7697a;
        return Integer.valueOf(j0x.v((dqy) obj).f23458a);
    }

    @Override // a.ez40, a.thy
    public final void k(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        iiy[] iiyVarArr = eey.f7697a;
        j0x.v((dqy) obj).f23458a = iIntValue;
    }
}
