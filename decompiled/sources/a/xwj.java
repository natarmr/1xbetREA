package a;

/* JADX INFO: loaded from: classes.dex */
public final class xwj implements qah0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ywj f41612a;

    public xwj(ywj ywjVar) {
        this.f41612a = ywjVar;
    }

    @Override // a.qah0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        ywj ywjVar = this.f41612a;
        float fFloatValue = ((Number) ywjVar.f43372a.invoke(Float.valueOf(f))).floatValue();
        ((hgk0) ywjVar.e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((hgk0) ywjVar.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
