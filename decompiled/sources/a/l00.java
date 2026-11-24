package a;

import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19174a;
    public final /* synthetic */ String b;

    public /* synthetic */ l00(String str, byte b) {
        this.f19174a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String value;
        byte b = this.f19174a;
        String str = this.b;
        switch (b) {
            case 0:
                return new t6n(d4d.STATIC_WHITE60, w6n.f, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 1:
                return str;
            case 2:
                return new btb(this.b, null, null, ipb.e, "", null, null);
            case 3:
                bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
                if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                    value = "";
                }
                return StringsKt.u0(kotlin.text.c.u(str, value, "", false)).toString();
            case 4:
                return new u6n(d4d.SECONDARY60, w6n.g, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 5:
                return new t6n(d4d.SECONDARY60, w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 6:
                return new t6n(d4d.SECONDARY60, w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 7:
                return new u6n(d4d.SECONDARY60, w6n.f, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 8:
                return new t6n(d4d.SECONDARY60, w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 9:
                return new hiq0(str, false);
            case 10:
                return new u6n(d4d.STATIC_WHITE60, w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            case 11:
                return new u6n(d4d.STATIC_WHITE60, w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            default:
                return new mmv0(true, false, false, null, this.b);
        }
    }
}
