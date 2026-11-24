package a;

import java.util.Arrays;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jr90 {
    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x016f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0172  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    public static final ir90 a(cr90 cr90Var, ctf0 ctf0Var, PickerParams pickerParams) {
        String str;
        String strA;
        String strA2;
        boolean z;
        boolean z2;
        boolean z3;
        String strF;
        String str2;
        Integer num;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ctf0Var.getClass();
        pickerParams.getClass();
        boolean z8 = pickerParams instanceof PickerParams.Citizenship;
        if (z8) {
            strA = ctf0Var.f(R.string.nationality, new Object[0]);
        } else if (pickerParams instanceof PickerParams.City) {
            strA = ctf0Var.f(R.string.city_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Country) {
            strA = ctf0Var.f(R.string.country_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Currency) {
            strA = ctf0Var.f(R.string.currency, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Document) {
            strA = ctf0Var.f(R.string.document_type, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Phone) {
            strA = ctf0Var.f(R.string.auth_picker_phone_hint, new Object[0]);
        } else {
            if (!(pickerParams instanceof PickerParams.Region)) {
                if (pickerParams instanceof PickerParams.Language) {
                    strA = ctf0Var.b.a(R.string.language_search, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (!(pickerParams instanceof PickerParams.Gender) && !(pickerParams instanceof PickerParams.ResidentStatus)) {
                        t9f.b();
                        return null;
                    }
                    str = "";
                }
                if (z8) {
                    strA2 = ctf0Var.f(R.string.auth_picker_citizenship_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.City) {
                    strA2 = ctf0Var.f(R.string.auth_picker_city_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Country) {
                    strA2 = ctf0Var.f(R.string.auth_picker_country_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Currency) {
                    strA2 = ctf0Var.f(R.string.auth_picker_currency_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Document) {
                    strA2 = ctf0Var.f(R.string.auth_picker_document_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Phone) {
                    strA2 = ctf0Var.f(R.string.auth_picker_phone_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Region) {
                    strA2 = ctf0Var.f(R.string.auth_picker_region_title, new Object[0]);
                } else if (pickerParams instanceof PickerParams.Language) {
                    strA2 = ctf0Var.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
                } else if (pickerParams instanceof PickerParams.Gender) {
                    strA2 = ctf0Var.b.a(R.string.choose_gender, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (pickerParams instanceof PickerParams.ResidentStatus) {
                        t9f.b();
                        return null;
                    }
                    strA2 = ctf0Var.b.a(R.string.choose_resident_status, Arrays.copyOf(new Object[0], 0));
                }
                String str3 = strA2;
                z = cr90Var.f4834a;
                boolean z9 = cr90Var.b;
                if (z) {
                    if (pickerParams instanceof PickerParams.Phone) {
                        z7 = ((PickerParams.Phone) pickerParams).c;
                    } else {
                        z7 = false;
                    }
                    if (z7 || z9) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (z) {
                    if (pickerParams instanceof PickerParams.Phone) {
                        z6 = ((PickerParams.Phone) pickerParams).c;
                    } else {
                        z6 = false;
                    }
                    if (z6 || !z9) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                String str4 = cr90Var.d;
                strF = cr90Var.g != null ? ctf0Var.f(R.string.add_code_manually_error, new Object[0]) : null;
                if (strF == null) {
                    str2 = "";
                } else {
                    str2 = strF;
                }
                String str5 = cr90Var.c;
                num = cr90Var.h;
                if (num == null && num.intValue() == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!(pickerParams instanceof PickerParams.Gender) || (pickerParams instanceof PickerParams.ResidentStatus)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                return new ir90(z5, str, str3, z2, z3, str4, str5, str2, z4);
            }
            strA = ctf0Var.f(R.string.reg_region_vivat_be, new Object[0]);
        }
        str = strA;
        if (z8) {
            strA2 = ctf0Var.f(R.string.auth_picker_citizenship_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.City) {
            strA2 = ctf0Var.f(R.string.auth_picker_city_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Country) {
            strA2 = ctf0Var.f(R.string.auth_picker_country_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Currency) {
            strA2 = ctf0Var.f(R.string.auth_picker_currency_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Document) {
            strA2 = ctf0Var.f(R.string.auth_picker_document_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Phone) {
            strA2 = ctf0Var.f(R.string.auth_picker_phone_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Region) {
            strA2 = ctf0Var.f(R.string.auth_picker_region_title, new Object[0]);
        } else if (pickerParams instanceof PickerParams.Language) {
            strA2 = ctf0Var.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
        } else if (pickerParams instanceof PickerParams.Gender) {
            strA2 = ctf0Var.b.a(R.string.choose_gender, Arrays.copyOf(new Object[0], 0));
        } else {
            if (pickerParams instanceof PickerParams.ResidentStatus) {
                t9f.b();
                return null;
            }
            strA2 = ctf0Var.b.a(R.string.choose_resident_status, Arrays.copyOf(new Object[0], 0));
        }
        String str6 = strA2;
        z = cr90Var.f4834a;
        boolean z10 = cr90Var.b;
        if (z) {
            z2 = false;
        } else {
            if (pickerParams instanceof PickerParams.Phone) {
                z7 = ((PickerParams.Phone) pickerParams).c;
            } else {
                z7 = false;
            }
            if (z7) {
                z2 = false;
            } else {
                z2 = false;
            }
        }
        if (z) {
            z3 = false;
        } else {
            if (pickerParams instanceof PickerParams.Phone) {
                z6 = ((PickerParams.Phone) pickerParams).c;
            } else {
                z6 = false;
            }
            if (z6) {
                z3 = false;
            } else {
                z3 = false;
            }
        }
        String str7 = cr90Var.d;
        if (cr90Var.g != null) {
        }
        if (strF == null) {
            str2 = "";
        } else {
            str2 = strF;
        }
        String str8 = cr90Var.c;
        num = cr90Var.h;
        if (num == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (pickerParams instanceof PickerParams.Gender) {
            z5 = false;
        } else {
            z5 = false;
        }
        return new ir90(z5, str, str6, z2, z3, str7, str8, str2, z4);
    }
}
