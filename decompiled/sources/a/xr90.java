package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class xr90 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f41359a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;

    public xr90(br90 br90Var, final PickerDialogParams pickerDialogParams, int i, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.f41359a = ctf0Var;
        final byte b = 0;
        this.b = maz.b(new Function0() { // from class: a.vr90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                xr90 xr90Var = this;
                PickerDialogParams pickerDialogParams2 = pickerDialogParams;
                switch (b2) {
                    case 0:
                        PickerDialogParams.PickerType pickerType = pickerDialogParams2.f46801a;
                        ctf0 ctf0Var2 = xr90Var.f41359a;
                        pickerType.getClass();
                        ctf0Var2.getClass();
                        if (pickerType instanceof PickerDialogParams.PickerType.Citizenship) {
                            return ctf0Var2.b.a(R.string.auth_picker_citizenship_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.City) {
                            return ctf0Var2.b.a(R.string.auth_picker_city_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Country) {
                            return ctf0Var2.b.a(R.string.auth_picker_country_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Currency) {
                            return ctf0Var2.b.a(R.string.auth_picker_currency_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Document) {
                            return ctf0Var2.b.a(R.string.auth_picker_document_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Gender) {
                            return ctf0Var2.b.a(R.string.choose_gender, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Language) {
                            return ctf0Var2.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Phone) {
                            return ctf0Var2.b.a(R.string.auth_picker_phone_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Region) {
                            return ctf0Var2.b.a(R.string.auth_picker_region_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.ResidentStatus) {
                            return ctf0Var2.b.a(R.string.choose_resident_status, Arrays.copyOf(new Object[0], 0));
                        }
                        t9f.b();
                        return null;
                    default:
                        PickerDialogParams.PickerType pickerType2 = pickerDialogParams2.f46801a;
                        ctf0 ctf0Var3 = xr90Var.f41359a;
                        pickerType2.getClass();
                        ctf0Var3.getClass();
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Citizenship) {
                            return ctf0Var3.b.a(R.string.nationality, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.City) {
                            return ctf0Var3.b.a(R.string.city_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Country) {
                            return ctf0Var3.b.a(R.string.country_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Currency) {
                            return ctf0Var3.b.a(R.string.currency, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Document) {
                            return ctf0Var3.b.a(R.string.document_type, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Language) {
                            return ctf0Var3.b.a(R.string.language_search, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Phone) {
                            return ctf0Var3.b.a(R.string.auth_picker_phone_hint, Arrays.copyOf(new Object[0], 0));
                        }
                        return pickerType2 instanceof PickerDialogParams.PickerType.Region ? ctf0Var3.b.a(R.string.reg_region_vivat_be, Arrays.copyOf(new Object[0], 0)) : "";
                }
            }
        });
        final byte b2 = 1;
        this.c = maz.b(new Function0() { // from class: a.vr90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                xr90 xr90Var = this;
                PickerDialogParams pickerDialogParams2 = pickerDialogParams;
                switch (b3) {
                    case 0:
                        PickerDialogParams.PickerType pickerType = pickerDialogParams2.f46801a;
                        ctf0 ctf0Var2 = xr90Var.f41359a;
                        pickerType.getClass();
                        ctf0Var2.getClass();
                        if (pickerType instanceof PickerDialogParams.PickerType.Citizenship) {
                            return ctf0Var2.b.a(R.string.auth_picker_citizenship_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.City) {
                            return ctf0Var2.b.a(R.string.auth_picker_city_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Country) {
                            return ctf0Var2.b.a(R.string.auth_picker_country_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Currency) {
                            return ctf0Var2.b.a(R.string.auth_picker_currency_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Document) {
                            return ctf0Var2.b.a(R.string.auth_picker_document_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Gender) {
                            return ctf0Var2.b.a(R.string.choose_gender, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Language) {
                            return ctf0Var2.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Phone) {
                            return ctf0Var2.b.a(R.string.auth_picker_phone_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.Region) {
                            return ctf0Var2.b.a(R.string.auth_picker_region_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType instanceof PickerDialogParams.PickerType.ResidentStatus) {
                            return ctf0Var2.b.a(R.string.choose_resident_status, Arrays.copyOf(new Object[0], 0));
                        }
                        t9f.b();
                        return null;
                    default:
                        PickerDialogParams.PickerType pickerType2 = pickerDialogParams2.f46801a;
                        ctf0 ctf0Var3 = xr90Var.f41359a;
                        pickerType2.getClass();
                        ctf0Var3.getClass();
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Citizenship) {
                            return ctf0Var3.b.a(R.string.nationality, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.City) {
                            return ctf0Var3.b.a(R.string.city_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Country) {
                            return ctf0Var3.b.a(R.string.country_title, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Currency) {
                            return ctf0Var3.b.a(R.string.currency, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Document) {
                            return ctf0Var3.b.a(R.string.document_type, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Language) {
                            return ctf0Var3.b.a(R.string.language_search, Arrays.copyOf(new Object[0], 0));
                        }
                        if (pickerType2 instanceof PickerDialogParams.PickerType.Phone) {
                            return ctf0Var3.b.a(R.string.auth_picker_phone_hint, Arrays.copyOf(new Object[0], 0));
                        }
                        return pickerType2 instanceof PickerDialogParams.PickerType.Region ? ctf0Var3.b.a(R.string.reg_region_vivat_be, Arrays.copyOf(new Object[0], 0)) : "";
                }
            }
        });
        this.d = maz.b(new qw80(pickerDialogParams, br90Var, (byte) 7));
        this.e = maz.b(new pl70(pickerDialogParams, (byte) 22));
        this.f = maz.b(new y02(i, (byte) 8));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(br90Var.f));
        this.g = n0o0VarH;
        this.h = maz.b(new yw9(br90Var.b, new Function1(this) { // from class: a.wr90
            public final /* synthetic */ xr90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                xr90 xr90Var = this.b;
                switch (b3) {
                    case 0:
                        ctf0 ctf0Var2 = xr90Var.f41359a;
                        zqp zqpVar = (zqp) obj;
                        zqpVar.getClass();
                        return new c6q0(zqpVar.f44816a, e6q0.f7299a, o6q0.f24750a, zqpVar.b ? new s7q0(ctf0Var2.b.a(R.string.add_code_manually_error, Arrays.copyOf(new Object[0], 0))) : new s7q0(""), true, zqpVar.b, new y5q0(3, new ujj((byte) 1), null, 4), ctf0Var2.b.a(R.string.code, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261376);
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var = xr90Var.d;
                        ctf0 ctf0Var3 = xr90Var.f41359a;
                        if (((Boolean) n0o0Var.getValue()).booleanValue()) {
                            return zBooleanValue ? new pr90((c6q0) ((fee) xr90Var.h.getValue()).b(), new wul(qul.e, oe9.f25112a, new ue9(ctf0Var3.b.a(R.string.add, Arrays.copyOf(new Object[0], 0))), true, false, false)) : new qr90(ctf0Var3.b.a(R.string.add_code_manually, Arrays.copyOf(new Object[0], 0)));
                        }
                        return null;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        if (((Boolean) xr90Var.e.getValue()).booleanValue()) {
                            return new sr90(str, (String) xr90Var.c.getValue());
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.i = maz.b(new yw9(Boolean.valueOf(br90Var.c), new Function1(this) { // from class: a.wr90
            public final /* synthetic */ xr90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xr90 xr90Var = this.b;
                switch (b3) {
                    case 0:
                        ctf0 ctf0Var2 = xr90Var.f41359a;
                        zqp zqpVar = (zqp) obj;
                        zqpVar.getClass();
                        return new c6q0(zqpVar.f44816a, e6q0.f7299a, o6q0.f24750a, zqpVar.b ? new s7q0(ctf0Var2.b.a(R.string.add_code_manually_error, Arrays.copyOf(new Object[0], 0))) : new s7q0(""), true, zqpVar.b, new y5q0(3, new ujj((byte) 1), null, 4), ctf0Var2.b.a(R.string.code, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261376);
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var = xr90Var.d;
                        ctf0 ctf0Var3 = xr90Var.f41359a;
                        if (((Boolean) n0o0Var.getValue()).booleanValue()) {
                            return zBooleanValue ? new pr90((c6q0) ((fee) xr90Var.h.getValue()).b(), new wul(qul.e, oe9.f25112a, new ue9(ctf0Var3.b.a(R.string.add, Arrays.copyOf(new Object[0], 0))), true, false, false)) : new qr90(ctf0Var3.b.a(R.string.add_code_manually, Arrays.copyOf(new Object[0], 0)));
                        }
                        return null;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        if (((Boolean) xr90Var.e.getValue()).booleanValue()) {
                            return new sr90(str, (String) xr90Var.c.getValue());
                        }
                        return null;
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.j = maz.b(new yw9(br90Var.d, new Function1(this) { // from class: a.wr90
            public final /* synthetic */ xr90 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                xr90 xr90Var = this.b;
                switch (b4) {
                    case 0:
                        ctf0 ctf0Var2 = xr90Var.f41359a;
                        zqp zqpVar = (zqp) obj;
                        zqpVar.getClass();
                        return new c6q0(zqpVar.f44816a, e6q0.f7299a, o6q0.f24750a, zqpVar.b ? new s7q0(ctf0Var2.b.a(R.string.add_code_manually_error, Arrays.copyOf(new Object[0], 0))) : new s7q0(""), true, zqpVar.b, new y5q0(3, new ujj((byte) 1), null, 4), ctf0Var2.b.a(R.string.code, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261376);
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var = xr90Var.d;
                        ctf0 ctf0Var3 = xr90Var.f41359a;
                        if (((Boolean) n0o0Var.getValue()).booleanValue()) {
                            return zBooleanValue ? new pr90((c6q0) ((fee) xr90Var.h.getValue()).b(), new wul(qul.e, oe9.f25112a, new ue9(ctf0Var3.b.a(R.string.add, Arrays.copyOf(new Object[0], 0))), true, false, false)) : new qr90(ctf0Var3.b.a(R.string.add_code_manually, Arrays.copyOf(new Object[0], 0)));
                        }
                        return null;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        if (((Boolean) xr90Var.e.getValue()).booleanValue()) {
                            return new sr90(str, (String) xr90Var.c.getValue());
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new er90((byte) 1));
        this.l = maz.b(new yw9(br90Var.e, new ka70(this, pickerDialogParams, (byte) 18), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        br90 br90Var = (br90) obj;
        br90Var.getClass();
        ((fee) this.h.getValue()).d(br90Var.b);
        n0o0 n0o0Var = this.i;
        ((fee) n0o0Var.getValue()).d(Boolean.valueOf(br90Var.c));
        n0o0 n0o0Var2 = this.j;
        ((fee) n0o0Var2.getValue()).d(br90Var.d);
        n0o0 n0o0Var3 = this.l;
        ((fee) n0o0Var3.getValue()).d(br90Var.e);
        ((fee) this.g.getValue()).d(Boolean.valueOf(br90Var.f));
        return new ur90((bee) ((fee) this.k.getValue()).b(), (String) this.b.getValue(), (sr90) ((fee) n0o0Var2.getValue()).b(), (rr90) ((fee) n0o0Var.getValue()).b(), (or90) ((fee) n0o0Var3.getValue()).b());
    }
}
