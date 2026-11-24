.class public final La/de90;
.super La/ix5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/de90;",
        "La/ix5;",
        "<init>",
        "()V",
        "a/xi70",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final k2:La/xi70;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final d2:La/phf0;

.field public final e2:La/zz2;

.field public final f2:La/r34;

.field public final g2:La/r34;

.field public final h2:La/r34;

.field public final i2:La/cgx0;

.field public final j2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/de90;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "maxPeriod"

    .line 16
    .line 17
    const-string v5, "getMaxPeriod()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "startTimeSec"

    .line 25
    .line 26
    const-string v6, "getStartTimeSec()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "defaultFromTimeSec"

    .line 34
    .line 35
    const-string v7, "getDefaultFromTimeSec()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "endTimeSec"

    .line 43
    .line 44
    const-string v8, "getEndTimeSec()J"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "fromStartDate"

    .line 52
    .line 53
    const-string v9, "getFromStartDate()Z"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/j0d0;

    .line 59
    .line 60
    const-string v9, "binding"

    .line 61
    .line 62
    const-string v10, "getBinding()Lorg/xplatform/ui_core/databinding/DatePickerViewBinding;"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x7

    .line 68
    new-array v1, v1, [La/iiy;

    .line 69
    .line 70
    aput-object v0, v1, v4

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    aput-object v2, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object v3, v1, v0

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    aput-object v5, v1, v0

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v6, v1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v7, v1, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v8, v1, v0

    .line 89
    .line 90
    sput-object v1, La/de90;->l2:[La/iiy;

    .line 91
    .line 92
    new-instance v0, La/xi70;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, La/de90;->k2:La/xi70;

    .line 98
    .line 99
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/ix5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/de90;->d2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/zz2;

    .line 14
    .line 15
    const-string v1, "BUNDLE_MAX_PERIOD"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/de90;->e2:La/zz2;

    .line 21
    .line 22
    new-instance v0, La/r34;

    .line 23
    .line 24
    const-string v1, "BUNDLE_START_DATE"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/de90;->f2:La/r34;

    .line 30
    .line 31
    new-instance v0, La/r34;

    .line 32
    .line 33
    const-string v1, "BUNDLE_DEFAULT_FROM_DATE"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/de90;->g2:La/r34;

    .line 39
    .line 40
    new-instance v0, La/r34;

    .line 41
    .line 42
    const-string v1, "BUNDLE_END_DATE"

    .line 43
    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/de90;->h2:La/r34;

    .line 50
    .line 51
    new-instance v0, La/cgx0;

    .line 52
    .line 53
    const-string v1, "BUNDLE_FROM_START_DATE"

    .line 54
    .line 55
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/de90;->i2:La/cgx0;

    .line 59
    .line 60
    sget-object v0, La/ce90;->a:La/ce90;

    .line 61
    .line 62
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/de90;->j2:La/nae0;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final I0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/de90;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final bridge synthetic J0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final L0()I
    .locals 0

    .line 1
    const p0, 0x7f1405aa

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final M0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/de90;->W0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_1

    .line 7
    .line 8
    const v0, 0x7f130cd6

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/de90;->W0()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-lez v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/de90;->W0()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v2, 0x1e

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const v4, 0x7f130684

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v3, v3, La/cej;->d:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v3, v3, La/cej;->d:Landroid/widget/TextView;

    .line 67
    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v0, " "

    .line 74
    .line 75
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v0, v0, La/cej;->e:Landroid/widget/TextView;

    .line 93
    .line 94
    invoke-virtual {p0}, La/de90;->V0()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    const v2, 0x7f131379

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    const v2, 0x7f130798

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, La/ix5;->a2:Landroid/widget/Button;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, La/de90;->V0()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_3

    .line 127
    .line 128
    const v2, 0x7f130dfb

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    goto :goto_2

    .line 136
    :cond_3
    const v2, 0x7f13014a

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object v2, v2, La/cej;->b:Landroid/widget/CalendarView;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    invoke-virtual {v2, v3, v4}, Landroid/widget/CalendarView;->setMaxDate(J)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, La/de90;->V0()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    sget-object v3, La/de90;->l2:[La/iiy;

    .line 168
    .line 169
    const/4 v4, 0x1

    .line 170
    const-wide/16 v5, 0x3e8

    .line 171
    .line 172
    const-wide/16 v7, 0x0

    .line 173
    .line 174
    if-eqz v2, :cond_7

    .line 175
    .line 176
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/16 v9, 0x7d0

    .line 181
    .line 182
    invoke-virtual {v2, v9, v1, v4}, Ljava/util/Calendar;->set(III)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    iget-object v9, v9, La/cej;->b:Landroid/widget/CalendarView;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 192
    .line 193
    .line 194
    move-result-wide v10

    .line 195
    invoke-virtual {v9, v10, v11}, Landroid/widget/CalendarView;->setMinDate(J)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, La/de90;->W0()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_6

    .line 203
    .line 204
    invoke-virtual {p0}, La/de90;->W0()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    sub-int/2addr v2, v4

    .line 209
    neg-int v2, v2

    .line 210
    const/4 v9, 0x5

    .line 211
    invoke-virtual {v0, v9, v2}, Ljava/util/Calendar;->add(II)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget-object v2, v2, La/cej;->b:Landroid/widget/CalendarView;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 221
    .line 222
    .line 223
    move-result-wide v9

    .line 224
    invoke-virtual {v2, v9, v10}, Landroid/widget/CalendarView;->setMinDate(J)V

    .line 225
    .line 226
    .line 227
    const/4 v2, 0x3

    .line 228
    aget-object v9, v3, v2

    .line 229
    .line 230
    iget-object v10, p0, La/de90;->g2:La/r34;

    .line 231
    .line 232
    invoke-virtual {v10, p0, v9}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 237
    .line 238
    .line 239
    move-result-wide v11

    .line 240
    cmp-long v9, v11, v7

    .line 241
    .line 242
    if-eqz v9, :cond_5

    .line 243
    .line 244
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    aget-object v2, v3, v2

    .line 249
    .line 250
    invoke-virtual {v10, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v10

    .line 258
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 259
    .line 260
    invoke-virtual {v2, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v10

    .line 264
    invoke-virtual {v9, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, v9}, La/de90;->Y0(Ljava/util/Calendar;)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_5
    invoke-virtual {p0}, La/de90;->X0()J

    .line 272
    .line 273
    .line 274
    move-result-wide v9

    .line 275
    cmp-long v2, v9, v7

    .line 276
    .line 277
    if-nez v2, :cond_6

    .line 278
    .line 279
    invoke-virtual {p0, v0}, La/de90;->Y0(Ljava/util/Calendar;)V

    .line 280
    .line 281
    .line 282
    :cond_6
    :goto_3
    invoke-virtual {p0}, La/de90;->X0()J

    .line 283
    .line 284
    .line 285
    move-result-wide v9

    .line 286
    cmp-long v2, v9, v7

    .line 287
    .line 288
    if-eqz v2, :cond_9

    .line 289
    .line 290
    invoke-virtual {p0}, La/de90;->X0()J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    mul-long/2addr v9, v5

    .line 295
    invoke-virtual {v0, v9, v10}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 296
    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_7
    invoke-virtual {p0}, La/de90;->U0()J

    .line 300
    .line 301
    .line 302
    move-result-wide v9

    .line 303
    cmp-long v2, v9, v7

    .line 304
    .line 305
    if-nez v2, :cond_8

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 308
    .line 309
    .line 310
    move-result-wide v9

    .line 311
    div-long/2addr v9, v5

    .line 312
    const/4 v2, 0x4

    .line 313
    aget-object v2, v3, v2

    .line 314
    .line 315
    iget-object v11, p0, La/de90;->h2:La/r34;

    .line 316
    .line 317
    invoke-virtual {v11, p0, v2, v9, v10}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 318
    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_8
    invoke-virtual {p0}, La/de90;->U0()J

    .line 322
    .line 323
    .line 324
    move-result-wide v9

    .line 325
    mul-long/2addr v9, v5

    .line 326
    invoke-virtual {v0, v9, v10}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 327
    .line 328
    .line 329
    :goto_4
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    iget-object v2, v2, La/cej;->b:Landroid/widget/CalendarView;

    .line 334
    .line 335
    invoke-virtual {p0}, La/de90;->X0()J

    .line 336
    .line 337
    .line 338
    move-result-wide v9

    .line 339
    mul-long/2addr v9, v5

    .line 340
    invoke-virtual {v2, v9, v10}, Landroid/widget/CalendarView;->setMinDate(J)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, v0}, La/de90;->a1(Ljava/util/Calendar;)V

    .line 344
    .line 345
    .line 346
    :cond_9
    :goto_5
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iget-object v2, v2, La/cej;->b:Landroid/widget/CalendarView;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 353
    .line 354
    .line 355
    move-result-wide v9

    .line 356
    invoke-virtual {v2, v9, v10, v1, v4}, Landroid/widget/CalendarView;->setDate(JZZ)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, La/de90;->T0()La/cej;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    iget-object v2, v2, La/cej;->b:Landroid/widget/CalendarView;

    .line 364
    .line 365
    new-instance v4, La/be90;

    .line 366
    .line 367
    invoke-direct {v4, v0, p0, v1}, La/be90;-><init>(Ljava/util/Calendar;La/ix5;B)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4}, Landroid/widget/CalendarView;->setOnDateChangeListener(Landroid/widget/CalendarView$OnDateChangeListener;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, La/de90;->X0()J

    .line 374
    .line 375
    .line 376
    move-result-wide v1

    .line 377
    cmp-long v1, v1, v7

    .line 378
    .line 379
    if-nez v1, :cond_a

    .line 380
    .line 381
    invoke-virtual {p0}, La/de90;->V0()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_a

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 388
    .line 389
    .line 390
    move-result-wide v0

    .line 391
    div-long/2addr v0, v5

    .line 392
    const/4 v2, 0x2

    .line 393
    aget-object v2, v3, v2

    .line 394
    .line 395
    iget-object v3, p0, La/de90;->f2:La/r34;

    .line 396
    .line 397
    invoke-virtual {v3, p0, v2, v0, v1}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 398
    .line 399
    .line 400
    :cond_a
    return-void
.end method

.method public final N0()I
    .locals 0

    .line 1
    const p0, 0x7f13032f

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final O0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/de90;->Z0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/sik;->y0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final P0()I
    .locals 0

    .line 1
    const p0, 0x7f130dfb

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final Q0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/de90;->X0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/de90;->U0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/de90;->Z0()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/sik;->y0()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "BUNDLE_RESULT_START_TIME_SEC"

    .line 32
    .line 33
    invoke-virtual {p0}, La/de90;->X0()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 38
    .line 39
    .line 40
    const-string v1, "BUNDLE_RESULT_END_TIME_SEC"

    .line 41
    .line 42
    invoke-virtual {p0}, La/de90;->U0()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 47
    .line 48
    .line 49
    sget-object v1, La/de90;->l2:[La/iiy;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    aget-object v1, v1, v2

    .line 53
    .line 54
    iget-object v2, p0, La/de90;->d2:La/phf0;

    .line 55
    .line 56
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/sik;->y0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final S0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x7f0705b7

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 35
    .line 36
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const v2, 0x7f070712

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    mul-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    sub-int/2addr v1, v0

    .line 58
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const/4 v2, -0x2

    .line 70
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const v1, 0x7f08024e

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v0, p0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    :goto_0
    return-void
.end method

.method public final T0()La/cej;
    .locals 2

    .line 1
    sget-object v0, La/de90;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/de90;->j2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/cej;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()J
    .locals 2

    .line 1
    sget-object v0, La/de90;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/de90;->h2:La/r34;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final V0()Z
    .locals 2

    .line 1
    sget-object v0, La/de90;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/de90;->i2:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final W0()I
    .locals 2

    .line 1
    sget-object v0, La/de90;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/de90;->e2:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final X0()J
    .locals 2

    .line 1
    sget-object v0, La/de90;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/de90;->f2:La/r34;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final Y0(Ljava/util/Calendar;)V
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0xe

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    const-wide/16 v2, 0x3e8

    .line 27
    .line 28
    div-long/2addr v0, v2

    .line 29
    sget-object p1, La/de90;->l2:[La/iiy;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aget-object p1, p1, v2

    .line 33
    .line 34
    iget-object v2, p0, La/de90;->f2:La/r34;

    .line 35
    .line 36
    invoke-virtual {v2, p0, p1, v0, v1}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final Z0()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "BUNDLE_RESULT_CANCELED"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/de90;->l2:[La/iiy;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    iget-object v2, p0, La/de90;->d2:La/phf0;

    .line 18
    .line 19
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final a1(Ljava/util/Calendar;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->isToday(J)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0xb

    .line 12
    .line 13
    const/16 v1, 0x17

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    const/16 v1, 0x3b

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 23
    .line 24
    .line 25
    const/16 v0, 0xd

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 28
    .line 29
    .line 30
    const/16 v0, 0xe

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    const-wide/16 v2, 0x3e8

    .line 41
    .line 42
    div-long/2addr v0, v2

    .line 43
    sget-object p1, La/de90;->l2:[La/iiy;

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    aget-object p1, p1, v2

    .line 47
    .line 48
    iget-object v2, p0, La/de90;->h2:La/r34;

    .line 49
    .line 50
    invoke-virtual {v2, p0, p1, v0, v1}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
