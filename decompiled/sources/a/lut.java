package a;

/* JADX INFO: loaded from: classes4.dex */
public final class lut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20690a;
    public final btr b;

    public lut(btr btrVar, byte b) {
        this.f20690a = b;
        btrVar.getClass();
        switch (b) {
            case 1:
                this.b = btrVar;
                break;
            case 2:
                this.b = btrVar;
                break;
            default:
                this.b = btrVar;
                break;
        }
    }

    public boolean a() {
        byte b = this.f20690a;
        btr btrVar = this.b;
        switch (b) {
            case 0:
                return btrVar.d.f22888a.a().getBoolean("GAME_BROADCAST_SOUND_ENABLE", true);
            default:
                nhv0 nhv0Var = btrVar.c;
                return nhv0Var.f23554a.getValue() != null && nhv0Var.b.getValue() == null;
        }
    }
}
