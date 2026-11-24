.class public Landroid/gov/nist/javax/sip/header/SIPDate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final APR:Ljava/lang/String; = "Apr"

.field public static final AUG:Ljava/lang/String; = "Aug"

.field public static final DEC:Ljava/lang/String; = "Dec"

.field public static final FEB:Ljava/lang/String; = "Feb"

.field public static final FRI:Ljava/lang/String; = "Fri"

.field public static final GMT:Ljava/lang/String; = "GMT"

.field public static final JAN:Ljava/lang/String; = "Jan"

.field public static final JUL:Ljava/lang/String; = "Jul"

.field public static final JUN:Ljava/lang/String; = "Jun"

.field public static final MAR:Ljava/lang/String; = "Mar"

.field public static final MAY:Ljava/lang/String; = "May"

.field public static final MON:Ljava/lang/String; = "Mon"

.field public static final NOV:Ljava/lang/String; = "Nov"

.field public static final OCT:Ljava/lang/String; = "Oct"

.field public static final SAT:Ljava/lang/String; = "Sat"

.field public static final SEP:Ljava/lang/String; = "Sep"

.field public static final SUN:Ljava/lang/String; = "Sun"

.field public static final THU:Ljava/lang/String; = "Thu"

.field public static final TUE:Ljava/lang/String; = "Tue"

.field public static final WED:Ljava/lang/String; = "Wed"

.field private static final serialVersionUID:J = 0x7692bf68cdf8211dL


# instance fields
.field protected day:I

.field protected hour:I

.field private javaCal:Ljava/util/Calendar;

.field protected minute:I

.field protected month:I

.field protected second:I

.field protected sipMonth:Ljava/lang/String;

.field protected sipWkDay:Ljava/lang/String;

.field protected wkday:I

.field protected year:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 238
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 239
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 240
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 241
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 242
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 243
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 244
    iput v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    const/4 v0, 0x0

    .line 245
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 5
    .line 6
    const-string v1, "GMT:0"

    .line 7
    .line 8
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 20
    .line 21
    new-instance v0, Ljava/util/Date;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 32
    .line 33
    const/4 p2, 0x7

    .line 34
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 39
    .line 40
    packed-switch p1, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p2, "No date map for wkday "

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget p2, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_0
    const-string p1, "Sat"

    .line 64
    .line 65
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :pswitch_1
    const-string p1, "Fri"

    .line 69
    .line 70
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_2
    const-string p1, "Thu"

    .line 74
    .line 75
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_3
    const-string p1, "Wed"

    .line 79
    .line 80
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_4
    const-string p1, "Tue"

    .line 84
    .line 85
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_5
    const-string p1, "Mon"

    .line 89
    .line 90
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_6
    const-string p1, "Sun"

    .line 94
    .line 95
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 96
    .line 97
    :goto_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 98
    .line 99
    const/4 p2, 0x5

    .line 100
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 105
    .line 106
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 107
    .line 108
    const/4 p2, 0x2

    .line 109
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 114
    .line 115
    packed-switch p1, :pswitch_data_1

    .line 116
    .line 117
    .line 118
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string p2, "No date map for month "

    .line 121
    .line 122
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget p2, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-static {p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :pswitch_7
    const-string p1, "Dec"

    .line 139
    .line 140
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_8
    const-string p1, "Nov"

    .line 144
    .line 145
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_9
    const-string p1, "Oct"

    .line 149
    .line 150
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_a
    const-string p1, "Sep"

    .line 154
    .line 155
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_b
    const-string p1, "Aug"

    .line 159
    .line 160
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :pswitch_c
    const-string p1, "Jul"

    .line 164
    .line 165
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :pswitch_d
    const-string p1, "Jun"

    .line 169
    .line 170
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :pswitch_e
    const-string p1, "May"

    .line 174
    .line 175
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :pswitch_f
    const-string p1, "Apr"

    .line 179
    .line 180
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :pswitch_10
    const-string p1, "Mar"

    .line 184
    .line 185
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :pswitch_11
    const-string p1, "Feb"

    .line 189
    .line 190
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :pswitch_12
    const-string p1, "Jan"

    .line 194
    .line 195
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 196
    .line 197
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 198
    .line 199
    const/4 p2, 0x1

    .line 200
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 205
    .line 206
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 207
    .line 208
    const/16 p2, 0xb

    .line 209
    .line 210
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 215
    .line 216
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 217
    .line 218
    const/16 p2, 0xc

    .line 219
    .line 220
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 225
    .line 226
    iget-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 227
    .line 228
    const/16 p2, 0xd

    .line 229
    .line 230
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method private setJavaCal()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/GregorianCalendar;

    .line 2
    .line 3
    const-string v1, "GMT:0"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 17
    .line 18
    iget v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->set(II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 28
    .line 29
    if-eq v0, v2, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 38
    .line 39
    if-eq v0, v2, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 48
    .line 49
    if-eq v0, v2, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 52
    .line 53
    const/4 v3, 0x7

    .line 54
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 58
    .line 59
    if-eq v0, v2, :cond_4

    .line 60
    .line 61
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 62
    .line 63
    const/16 v3, 0xa

    .line 64
    .line 65
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 69
    .line 70
    if-eq v0, v2, :cond_5

    .line 71
    .line 72
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 73
    .line 74
    const/16 v3, 0xc

    .line 75
    .line 76
    invoke-virtual {v1, v3, v0}, Ljava/util/Calendar;->set(II)V

    .line 77
    .line 78
    .line 79
    :cond_5
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 80
    .line 81
    if-eq v0, v2, :cond_6

    .line 82
    .line 83
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 84
    .line 85
    const/16 v1, 0xd

    .line 86
    .line 87
    invoke-virtual {p0, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 88
    .line 89
    .line 90
    :cond_6
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/header/SIPDate;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/Calendar;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 18
    .line 19
    :cond_0
    return-object v0

    .line 20
    :catch_0
    const-string p0, "Internal error"

    .line 21
    .line 22
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 8

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-string v3, "0"

    .line 8
    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    if-ge v0, v4, :cond_0

    .line 12
    .line 13
    invoke-static {v1, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v1, v2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    iget v1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 23
    .line 24
    iget v5, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 25
    .line 26
    if-ge v1, v4, :cond_1

    .line 27
    .line 28
    invoke-static {v5, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {v5, v2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    iget v5, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 38
    .line 39
    iget v6, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 40
    .line 41
    if-ge v5, v4, :cond_2

    .line 42
    .line 43
    invoke-static {v6, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-static {v6, v2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    :goto_2
    iget v6, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 53
    .line 54
    iget v7, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 55
    .line 56
    if-ge v6, v4, :cond_3

    .line 57
    .line 58
    invoke-static {v7, v3}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    invoke-static {v7, v2}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_3
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 68
    .line 69
    const-string v4, " "

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    const-string v6, ","

    .line 74
    .line 75
    invoke-static {p1, v3, v6, v4}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_5
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 95
    .line 96
    const-string v0, ":"

    .line 97
    .line 98
    invoke-static {p0, v4, v1, v0, p1}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, v5, v0, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p0, "GMT"

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/header/SIPDate;

    .line 14
    .line 15
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 16
    .line 17
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 22
    .line 23
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 28
    .line 29
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 34
    .line 35
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 36
    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 40
    .line 41
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    iget v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 46
    .line 47
    iget v1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 48
    .line 49
    if-ne v0, v1, :cond_1

    .line 50
    .line 51
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 52
    .line 53
    iget p1, p1, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 54
    .line 55
    if-ne p0, p1, :cond_1

    .line 56
    .line 57
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_1
    return v2
.end method

.method public getDeltaSeconds()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPDate;->getJavaCal()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    sub-long/2addr v0, v2

    .line 18
    long-to-int p0, v0

    .line 19
    div-int/lit16 p0, p0, 0x3e8

    .line 20
    .line 21
    return p0
.end method

.method public getHour()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 2
    .line 3
    return p0
.end method

.method public getJavaCal()Ljava/util/Calendar;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPDate;->setJavaCal()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 9
    .line 10
    return-object p0
.end method

.method public getMinute()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 2
    .line 3
    return p0
.end method

.method public getMonth()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSecond()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 2
    .line 3
    return p0
.end method

.method public getWkday()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getYear()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 2
    .line 3
    return p0
.end method

.method public setDay(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0x1f

    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->day:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Illegal Day of the month "

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, p0}, La/ohq;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setHour(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 9
    .line 10
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->hour:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Illegal hour : "

    .line 14
    .line 15
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setMinute(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x3c

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 9
    .line 10
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->minute:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Illegal minute : "

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1, p0}, La/ohq;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setMonth(Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "Jan"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "Feb"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "Mar"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 44
    .line 45
    const-string v1, "Apr"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    const/4 p1, 0x3

    .line 54
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "May"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    const/4 p1, 0x4

    .line 68
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 72
    .line 73
    const-string v1, "Jun"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    const/4 p1, 0x5

    .line 82
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 86
    .line 87
    const-string v1, "Jul"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    const/4 p1, 0x6

    .line 96
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 97
    .line 98
    return-void

    .line 99
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 100
    .line 101
    const-string v1, "Aug"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_7

    .line 108
    .line 109
    const/4 p1, 0x7

    .line 110
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 111
    .line 112
    return-void

    .line 113
    :cond_7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 114
    .line 115
    const-string v1, "Sep"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_8

    .line 122
    .line 123
    const/16 p1, 0x8

    .line 124
    .line 125
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 126
    .line 127
    return-void

    .line 128
    :cond_8
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 129
    .line 130
    const-string v1, "Oct"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_9

    .line 137
    .line 138
    const/16 p1, 0x9

    .line 139
    .line 140
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 141
    .line 142
    return-void

    .line 143
    :cond_9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 144
    .line 145
    const-string v1, "Nov"

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_a

    .line 152
    .line 153
    const/16 p1, 0xa

    .line 154
    .line 155
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 156
    .line 157
    return-void

    .line 158
    :cond_a
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipMonth:Ljava/lang/String;

    .line 159
    .line 160
    const-string v1, "Dec"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_b

    .line 167
    .line 168
    const/16 p1, 0xb

    .line 169
    .line 170
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->month:I

    .line 171
    .line 172
    return-void

    .line 173
    :cond_b
    const-string p0, "Illegal Month :"

    .line 174
    .line 175
    invoke-static {p0, p1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public setSecond(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x3c

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 9
    .line 10
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->second:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Illegal second : "

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1, p0}, La/ohq;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setWkday(Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "Mon"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "Tue"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "Wed"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 p1, 0x4

    .line 40
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 44
    .line 45
    const-string v1, "Thu"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    const/4 p1, 0x5

    .line 54
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 58
    .line 59
    const-string v1, "Fri"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    const/4 p1, 0x6

    .line 68
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 72
    .line 73
    const-string v1, "Sat"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    const/4 p1, 0x7

    .line 82
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->sipWkDay:Ljava/lang/String;

    .line 86
    .line 87
    const-string v1, "Sun"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->wkday:I

    .line 97
    .line 98
    return-void

    .line 99
    :cond_6
    const-string p0, "Illegal Week day :"

    .line 100
    .line 101
    invoke-static {p0, p1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public setYear(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->javaCal:Ljava/util/Calendar;

    .line 5
    .line 6
    iput p1, p0, Landroid/gov/nist/javax/sip/header/SIPDate;->year:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Illegal year : "

    .line 10
    .line 11
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
