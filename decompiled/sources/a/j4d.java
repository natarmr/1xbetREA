package a;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class j4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15878a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        kng0.x(-984833, map, "aliceblue", -332841, "antiquewhite");
        dw9.B(map, "aqua", -16711681, -8388652, "aquamarine");
        kng0.x(-983041, map, "azure", -657956, "beige");
        kng0.x(-6972, map, "bisque", -16777216, "black");
        kng0.x(-5171, map, "blanchedalmond", -16776961, "blue");
        kng0.x(-7722014, map, "blueviolet", -5952982, "brown");
        kng0.x(-2180985, map, "burlywood", -10510688, "cadetblue");
        kng0.x(-8388864, map, "chartreuse", -2987746, "chocolate");
        kng0.x(-32944, map, "coral", -10185235, "cornflowerblue");
        kng0.x(-1828, map, "cornsilk", -2354116, "crimson");
        dw9.B(map, "cyan", -16711681, -16777077, "darkblue");
        kng0.x(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        dw9.B(map, "darkgray", -5658199, -16751616, "darkgreen");
        dw9.B(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        kng0.x(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        kng0.x(-29696, map, "darkorange", -6737204, "darkorchid");
        kng0.x(-7667712, map, "darkred", -1468806, "darksalmon");
        kng0.x(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        dw9.B(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        kng0.x(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        dw9.B(map, "dodgerblue", -14774017, -5103070, "firebrick");
        kng0.x(-1296, map, "floralwhite", -14513374, "forestgreen");
        dw9.B(map, "fuchsia", -65281, -2302756, "gainsboro");
        kng0.x(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        kng0.x(-16744448, map, "green", -5374161, "greenyellow");
        dw9.B(map, "grey", -8355712, -983056, "honeydew");
        kng0.x(-38476, map, "hotpink", -3318692, "indianred");
        kng0.x(-11861886, map, "indigo", -16, "ivory");
        kng0.x(-989556, map, "khaki", -1644806, "lavender");
        kng0.x(-3851, map, "lavenderblush", -8586240, "lawngreen");
        kng0.x(-1331, map, "lemonchiffon", -5383962, "lightblue");
        kng0.x(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        kng0.x(-18751, map, "lightpink", -24454, "lightsalmon");
        kng0.x(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        dw9.B(map, "lightsteelblue", -5192482, -32, "lightyellow");
        kng0.x(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        kng0.x(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        kng0.x(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        kng0.x(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        kng0.x(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        kng0.x(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        kng0.x(-15132304, map, "midnightblue", -655366, "mintcream");
        kng0.x(-6943, map, "mistyrose", -6987, "moccasin");
        kng0.x(-8531, map, "navajowhite", -16777088, "navy");
        kng0.x(-133658, map, "oldlace", -8355840, "olive");
        kng0.x(-9728477, map, "olivedrab", -23296, "orange");
        kng0.x(-47872, map, "orangered", -2461482, "orchid");
        kng0.x(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        kng0.x(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        kng0.x(-4139, map, "papayawhip", -9543, "peachpuff");
        kng0.x(-3308225, map, "peru", -16181, "pink");
        kng0.x(-2252579, map, "plum", -5185306, "powderblue");
        kng0.x(-8388480, map, "purple", -10079335, "rebeccapurple");
        kng0.x(-65536, map, "red", -4419697, "rosybrown");
        kng0.x(-12490271, map, "royalblue", -7650029, "saddlebrown");
        kng0.x(-360334, map, "salmon", -744352, "sandybrown");
        kng0.x(-13726889, map, "seagreen", -2578, "seashell");
        kng0.x(-6270419, map, "sienna", -4144960, "silver");
        kng0.x(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        dw9.B(map, "snow", -1286, -16711809, "springgreen");
        kng0.x(-12156236, map, "steelblue", -2968436, "tan");
        kng0.x(-16744320, map, "teal", -2572328, "thistle");
        kng0.x(-40121, map, "tomato", 0, "transparent");
        kng0.x(-12525360, map, "turquoise", -1146130, "violet");
        kng0.x(-663885, map, "wheat", -1, "white");
        kng0.x(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        x0x.A(!TextUtils.isEmpty(str));
        String strReplace = str.replace(Separators.SP, "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            e9d0.o();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f15878a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(j47.H0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        e9d0.o();
        return 0;
    }
}
