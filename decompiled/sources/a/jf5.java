package a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import java.io.IOException;
import java.util.Locale;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class jf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadgeState$State f16408a;
    public final BadgeState$State b = new BadgeState$State();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public jf5(Context context) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        BadgeState$State badgeState$State = new BadgeState$State();
        int i = badgeState$State.f45558a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayL0 = mrv.l0(context, attributeSetAsAttributeSet, rpd0.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayL0.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayL0.getDimensionPixelSize(15, -1);
        this.e = typedArrayL0.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayL0.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayL0.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayL0.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayL0.getInt(25, 1);
        this.l = typedArrayL0.getInt(2, 0);
        BadgeState$State badgeState$State2 = this.b;
        int i2 = badgeState$State.i;
        badgeState$State2.i = i2 == -2 ? 255 : i2;
        int i3 = badgeState$State.k;
        if (i3 != -2) {
            badgeState$State2.k = i3;
        } else {
            boolean zHasValue = typedArrayL0.hasValue(24);
            BadgeState$State badgeState$State3 = this.b;
            if (zHasValue) {
                badgeState$State3.k = typedArrayL0.getInt(24, 0);
            } else {
                badgeState$State3.k = -1;
            }
        }
        String str = badgeState$State.j;
        if (str != null) {
            this.b.j = str;
        } else if (typedArrayL0.hasValue(8)) {
            this.b.j = typedArrayL0.getString(8);
        }
        BadgeState$State badgeState$State4 = this.b;
        badgeState$State4.o = badgeState$State.o;
        CharSequence charSequence = badgeState$State.p;
        badgeState$State4.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State5 = this.b;
        int i4 = badgeState$State.q;
        badgeState$State5.q = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = badgeState$State.r;
        badgeState$State5.r = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = badgeState$State.t;
        badgeState$State5.t = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State6 = this.b;
        int i6 = badgeState$State.l;
        badgeState$State6.l = i6 == -2 ? typedArrayL0.getInt(22, -2) : i6;
        BadgeState$State badgeState$State7 = this.b;
        int i7 = badgeState$State.m;
        badgeState$State7.m = i7 == -2 ? typedArrayL0.getInt(23, -2) : i7;
        BadgeState$State badgeState$State8 = this.b;
        Integer num = badgeState$State.e;
        badgeState$State8.e = Integer.valueOf(num == null ? typedArrayL0.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State9 = this.b;
        Integer num2 = badgeState$State.f;
        badgeState$State9.f = Integer.valueOf(num2 == null ? typedArrayL0.getResourceId(7, 0) : num2.intValue());
        BadgeState$State badgeState$State10 = this.b;
        Integer num3 = badgeState$State.g;
        badgeState$State10.g = Integer.valueOf(num3 == null ? typedArrayL0.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State11 = this.b;
        Integer num4 = badgeState$State.h;
        badgeState$State11.h = Integer.valueOf(num4 == null ? typedArrayL0.getResourceId(17, 0) : num4.intValue());
        BadgeState$State badgeState$State12 = this.b;
        Integer num5 = badgeState$State.b;
        badgeState$State12.b = Integer.valueOf(num5 == null ? g7x.A(1, context, typedArrayL0).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State13 = this.b;
        Integer num6 = badgeState$State.d;
        badgeState$State13.d = Integer.valueOf(num6 == null ? typedArrayL0.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean zHasValue2 = typedArrayL0.hasValue(10);
            BadgeState$State badgeState$State14 = this.b;
            if (zHasValue2) {
                badgeState$State14.c = Integer.valueOf(g7x.A(10, context, typedArrayL0).getDefaultColor());
            } else {
                this.b.c = Integer.valueOf(new p2q0(context, badgeState$State14.d.intValue()).k.getDefaultColor());
            }
        }
        BadgeState$State badgeState$State15 = this.b;
        Integer num8 = badgeState$State.s;
        badgeState$State15.s = Integer.valueOf(num8 == null ? typedArrayL0.getInt(3, 8388661) : num8.intValue());
        BadgeState$State badgeState$State16 = this.b;
        Integer num9 = badgeState$State.u;
        badgeState$State16.u = Integer.valueOf(num9 == null ? typedArrayL0.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State17 = this.b;
        Integer num10 = badgeState$State.v;
        badgeState$State17.v = Integer.valueOf(num10 == null ? typedArrayL0.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State18 = this.b;
        Integer num11 = badgeState$State.w;
        badgeState$State18.w = Integer.valueOf(num11 == null ? typedArrayL0.getDimensionPixelOffset(19, 0) : num11.intValue());
        BadgeState$State badgeState$State19 = this.b;
        Integer num12 = badgeState$State.x;
        badgeState$State19.x = Integer.valueOf(num12 == null ? typedArrayL0.getDimensionPixelOffset(26, 0) : num12.intValue());
        BadgeState$State badgeState$State20 = this.b;
        Integer num13 = badgeState$State.y;
        badgeState$State20.y = Integer.valueOf(num13 == null ? typedArrayL0.getDimensionPixelOffset(20, badgeState$State20.w.intValue()) : num13.intValue());
        BadgeState$State badgeState$State21 = this.b;
        Integer num14 = badgeState$State.z;
        badgeState$State21.z = Integer.valueOf(num14 == null ? typedArrayL0.getDimensionPixelOffset(27, badgeState$State21.x.intValue()) : num14.intValue());
        BadgeState$State badgeState$State22 = this.b;
        Integer num15 = badgeState$State.Y;
        badgeState$State22.Y = Integer.valueOf(num15 == null ? typedArrayL0.getDimensionPixelOffset(21, 0) : num15.intValue());
        BadgeState$State badgeState$State23 = this.b;
        Integer num16 = badgeState$State.A;
        badgeState$State23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State24 = this.b;
        Integer num17 = badgeState$State.B;
        badgeState$State24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State25 = this.b;
        Boolean bool2 = badgeState$State.Z;
        badgeState$State25.Z = Boolean.valueOf(bool2 == null ? typedArrayL0.getBoolean(0, false) : bool2.booleanValue());
        typedArrayL0.recycle();
        Locale locale = badgeState$State.n;
        BadgeState$State badgeState$State26 = this.b;
        if (locale == null) {
            badgeState$State26.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            badgeState$State26.n = locale;
        }
        this.f16408a = badgeState$State;
    }
}
