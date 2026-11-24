.class public final La/f2i0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/g2i0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/f2i0;",
        "La/stl;",
        "La/g2i0;",
        "<init>",
        "()V",
        "a/eke0",
        "impl"
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
.field public static final q2:La/eke0;

.field public static final synthetic r2:[La/iiy;


# instance fields
.field public final g2:La/nae0;

.field public final h2:La/khf0;

.field public final i2:La/n0o0;

.field public final j2:Ljava/util/ArrayList;

.field public final k2:Ljava/util/ArrayList;

.field public final l2:Ljava/util/ArrayList;

.field public final m2:Ljava/util/ArrayList;

.field public final n2:Ljava/util/ArrayList;

.field public final o2:Ljava/util/Calendar;

.field public final p2:Ljava/util/Calendar;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/f2i0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feed/impl/databinding/SelectDateTimeDialogBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/f2i0;->r2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/eke0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/f2i0;->q2:La/eke0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/e2i0;->a:La/e2i0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/f2i0;->g2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/khf0;

    .line 13
    .line 14
    const-string v1, "SELECT_DATE_TIME_SCREEN_PARAMS"

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/f2i0;->h2:La/khf0;

    .line 20
    .line 21
    new-instance v0, La/a7g0;

    .line 22
    .line 23
    const/16 v1, 0x1a

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/f2i0;->i2:La/n0o0;

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/f2i0;->j2:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/f2i0;->k2:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, La/f2i0;->l2:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/f2i0;->m2:Ljava/util/ArrayList;

    .line 61
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/f2i0;->n2:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 74
    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/f2i0;->p2:Ljava/util/Calendar;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    const v1, 0x7f130798

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const v1, 0x7f131379

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v3, La/kp8;

    .line 41
    .line 42
    const v4, 0x7f1404af

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, La/stl;->I0(La/kp8;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    if-ne v1, v2, :cond_2

    .line 64
    .line 65
    const v1, 0x7f1301db

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const v1, 0x7f13032f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object v3, v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    if-ne v3, v2, :cond_4

    .line 100
    .line 101
    const v3, 0x7f13014b

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    const v3, 0x7f130dfb

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v4, La/c2i0;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-direct {v4, v0, v5}, La/c2i0;-><init>(La/f2i0;B)V

    .line 127
    .line 128
    .line 129
    new-instance v6, La/c2i0;

    .line 130
    .line 131
    invoke-direct {v6, v0, v2}, La/c2i0;-><init>(La/f2i0;B)V

    .line 132
    .line 133
    .line 134
    new-instance v7, La/jp8;

    .line 135
    .line 136
    invoke-direct {v7, v1, v3, v4, v6}, La/jp8;-><init>(Ljava/lang/String;Ljava/lang/String;La/c2i0;La/c2i0;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v7}, La/stl;->M0(La/lp8;)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v0, v1}, La/stl;->J0(Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const v3, 0x7f07072d

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v0}, La/stl;->P0()La/vfk;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v3, v3, La/vfk;->c:Landroid/widget/FrameLayout;

    .line 162
    .line 163
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-eqz v4, :cond_24

    .line 168
    .line 169
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 170
    .line 171
    iput v1, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v1, v1, La/g2i0;->e:Landroid/widget/TextView;

    .line 181
    .line 182
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3, v2}, Ljava/util/Calendar;->get(I)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 202
    .line 203
    sget-object v3, La/j2i0;->b:La/j2i0;

    .line 204
    .line 205
    const/16 v4, 0xc

    .line 206
    .line 207
    const/4 v6, 0x5

    .line 208
    iget-object v7, v0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 209
    .line 210
    if-ne v1, v3, :cond_6

    .line 211
    .line 212
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 217
    .line 218
    invoke-virtual {v7, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v4, v6}, Ljava/util/Calendar;->add(II)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 230
    .line 231
    invoke-virtual {v7, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget-boolean v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->i:Z

    .line 239
    .line 240
    const/16 v3, 0x8

    .line 241
    .line 242
    if-eqz v1, :cond_7

    .line 243
    .line 244
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iget-object v1, v1, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 249
    .line 250
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-object v1, v1, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 258
    .line 259
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v1, v1, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 267
    .line 268
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 276
    .line 277
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-virtual {v8, v9}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 289
    .line 290
    .line 291
    const/4 v1, 0x6

    .line 292
    invoke-virtual {v8, v1}, Ljava/util/Calendar;->get(I)I

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    iget-object v9, v9, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 301
    .line 302
    new-instance v10, La/d2i0;

    .line 303
    .line 304
    invoke-direct {v10, v0, v8, v5}, La/d2i0;-><init>(La/f2i0;IB)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9, v10}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    iget-object v9, v9, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 315
    .line 316
    new-instance v10, La/d2i0;

    .line 317
    .line 318
    invoke-direct {v10, v0, v8, v2}, La/d2i0;-><init>(La/f2i0;IB)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9, v10}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    iget-object v8, v8, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 329
    .line 330
    new-instance v9, La/dlq0;

    .line 331
    .line 332
    const/4 v10, 0x3

    .line 333
    invoke-direct {v9, v0, v10}, La/dlq0;-><init>(La/stl;B)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v9}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    iget-boolean v8, v8, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->f:Z

    .line 344
    .line 345
    iget-object v9, v0, La/f2i0;->k2:Ljava/util/ArrayList;

    .line 346
    .line 347
    iget-object v10, v0, La/f2i0;->p2:Ljava/util/Calendar;

    .line 348
    .line 349
    iget-object v11, v0, La/f2i0;->j2:Ljava/util/ArrayList;

    .line 350
    .line 351
    if-eqz v8, :cond_a

    .line 352
    .line 353
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    iget-boolean v8, v8, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->h:Z

    .line 358
    .line 359
    if-eqz v8, :cond_8

    .line 360
    .line 361
    new-instance v8, Ljava/util/Date;

    .line 362
    .line 363
    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10, v8}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 367
    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_8
    invoke-virtual {v10, v2}, Ljava/util/Calendar;->get(I)I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    add-int/2addr v8, v2

    .line 375
    invoke-virtual {v10, v2, v8}, Ljava/util/Calendar;->set(II)V

    .line 376
    .line 377
    .line 378
    :goto_4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    iget-object v12, v12, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 387
    .line 388
    invoke-virtual {v8, v12}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 389
    .line 390
    .line 391
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 392
    .line 393
    .line 394
    move-result-object v12

    .line 395
    new-instance v13, Ljava/util/Date;

    .line 396
    .line 397
    sget-object v14, La/rv00;->k:La/rv00;

    .line 398
    .line 399
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    .line 404
    .line 405
    .line 406
    move-result-wide v1

    .line 407
    invoke-static {v14, v1, v2, v4}, La/rv00;->n(La/rv00;JI)J

    .line 408
    .line 409
    .line 410
    move-result-wide v1

    .line 411
    invoke-direct {v13, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v13}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 415
    .line 416
    .line 417
    :goto_5
    invoke-virtual {v8, v12}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-nez v1, :cond_9

    .line 422
    .line 423
    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v8}, La/f2i0;->V0(Ljava/util/Calendar;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    const/4 v15, 0x1

    .line 441
    invoke-virtual {v8, v6, v15}, Ljava/util/Calendar;->add(II)V

    .line 442
    .line 443
    .line 444
    goto :goto_5

    .line 445
    :cond_9
    const/4 v15, 0x1

    .line 446
    goto :goto_8

    .line 447
    :cond_a
    move v15, v2

    .line 448
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iget-boolean v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->h:Z

    .line 453
    .line 454
    if-eqz v1, :cond_b

    .line 455
    .line 456
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->g:Ljava/util/Date;

    .line 461
    .line 462
    invoke-virtual {v10, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 463
    .line 464
    .line 465
    goto :goto_6

    .line 466
    :cond_b
    invoke-virtual {v10, v15}, Ljava/util/Calendar;->get(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    sub-int/2addr v1, v15

    .line 471
    invoke-virtual {v10, v15, v1}, Ljava/util/Calendar;->set(II)V

    .line 472
    .line 473
    .line 474
    :goto_6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    iget-object v2, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 483
    .line 484
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 485
    .line 486
    .line 487
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    invoke-virtual {v2, v8}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 496
    .line 497
    .line 498
    :goto_7
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    if-nez v8, :cond_c

    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 505
    .line 506
    .line 507
    move-result-object v8

    .line 508
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0, v1}, La/f2i0;->V0(Ljava/util/Calendar;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    const/4 v8, -0x1

    .line 522
    invoke-virtual {v1, v6, v8}, Ljava/util/Calendar;->add(II)V

    .line 523
    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_c
    :goto_8
    invoke-virtual {v0, v5}, La/f2i0;->d1(Z)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0}, La/f2i0;->a1()Z

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    const/16 v2, 0x9

    .line 534
    .line 535
    const/16 v6, 0xa

    .line 536
    .line 537
    if-eqz v1, :cond_d

    .line 538
    .line 539
    invoke-virtual {v0, v5}, La/f2i0;->c1(Z)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    iget-object v1, v1, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 547
    .line 548
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 549
    .line 550
    .line 551
    goto :goto_d

    .line 552
    :cond_d
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    iget-wide v8, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->a:J

    .line 557
    .line 558
    const-wide/16 v12, 0x0

    .line 559
    .line 560
    cmp-long v1, v8, v12

    .line 561
    .line 562
    if-lez v1, :cond_12

    .line 563
    .line 564
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    iget-wide v8, v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->a:J

    .line 573
    .line 574
    invoke-virtual {v1, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v7, v2}, Ljava/util/Calendar;->get(I)I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-nez v3, :cond_e

    .line 582
    .line 583
    const/4 v3, 0x1

    .line 584
    goto :goto_9

    .line 585
    :cond_e
    move v3, v5

    .line 586
    :goto_9
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    if-nez v8, :cond_f

    .line 591
    .line 592
    const/4 v8, 0x1

    .line 593
    goto :goto_a

    .line 594
    :cond_f
    move v8, v5

    .line 595
    :goto_a
    if-eq v3, v8, :cond_11

    .line 596
    .line 597
    if-eqz v8, :cond_10

    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_10
    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    invoke-virtual {v0, v1}, La/f2i0;->b1(I)V

    .line 605
    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_11
    :goto_b
    invoke-virtual {v7, v6}, Ljava/util/Calendar;->get(I)I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    invoke-virtual {v0, v1}, La/f2i0;->b1(I)V

    .line 613
    .line 614
    .line 615
    goto :goto_c

    .line 616
    :cond_12
    invoke-virtual {v7, v6}, Ljava/util/Calendar;->get(I)I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    invoke-virtual {v0, v1}, La/f2i0;->b1(I)V

    .line 621
    .line 622
    .line 623
    :goto_c
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v7}, La/f2i0;->e1(Ljava/util/Calendar;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    iget-object v1, v1, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 634
    .line 635
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 636
    .line 637
    .line 638
    :goto_d
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    if-nez v1, :cond_13

    .line 643
    .line 644
    move v1, v5

    .line 645
    goto :goto_e

    .line 646
    :cond_13
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    const/4 v15, 0x1

    .line 651
    sub-int/2addr v1, v15

    .line 652
    :goto_e
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    iget-object v3, v3, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 657
    .line 658
    invoke-virtual {v3, v5}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 662
    .line 663
    .line 664
    new-array v1, v5, [Ljava/lang/String;

    .line 665
    .line 666
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    check-cast v1, [Ljava/lang/String;

    .line 671
    .line 672
    invoke-virtual {v3, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v3, v5}, Landroid/widget/NumberPicker;->setWrapSelectorWheel(Z)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    iget-wide v8, v1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->a:J

    .line 683
    .line 684
    const-wide/16 v12, -0x1

    .line 685
    .line 686
    cmp-long v1, v8, v12

    .line 687
    .line 688
    if-nez v1, :cond_14

    .line 689
    .line 690
    goto/16 :goto_17

    .line 691
    .line 692
    :cond_14
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    iget-wide v8, v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->a:J

    .line 701
    .line 702
    invoke-virtual {v1, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 703
    .line 704
    .line 705
    const/4 v3, 0x6

    .line 706
    invoke-virtual {v7, v3}, Ljava/util/Calendar;->get(I)I

    .line 707
    .line 708
    .line 709
    move-result v8

    .line 710
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    const/16 v9, 0xb

    .line 715
    .line 716
    if-ge v8, v3, :cond_16

    .line 717
    .line 718
    const/4 v15, 0x1

    .line 719
    invoke-virtual {v0, v15}, La/f2i0;->d1(Z)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, La/f2i0;->a1()Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-eqz v3, :cond_15

    .line 727
    .line 728
    invoke-virtual {v0, v15}, La/f2i0;->c1(Z)V

    .line 729
    .line 730
    .line 731
    goto :goto_f

    .line 732
    :cond_15
    invoke-virtual {v0, v5}, La/f2i0;->b1(I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0, v1}, La/f2i0;->e1(Ljava/util/Calendar;)V

    .line 736
    .line 737
    .line 738
    goto :goto_f

    .line 739
    :cond_16
    const/4 v15, 0x1

    .line 740
    invoke-virtual {v7, v9}, Ljava/util/Calendar;->get(I)I

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    invoke-virtual {v1, v9}, Ljava/util/Calendar;->get(I)I

    .line 745
    .line 746
    .line 747
    move-result v7

    .line 748
    if-ge v3, v7, :cond_17

    .line 749
    .line 750
    invoke-virtual {v0, v15}, La/f2i0;->d1(Z)V

    .line 751
    .line 752
    .line 753
    :cond_17
    :goto_f
    invoke-virtual {v0}, La/f2i0;->a1()Z

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-eqz v3, :cond_18

    .line 758
    .line 759
    invoke-virtual {v1, v9}, Ljava/util/Calendar;->get(I)I

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-virtual {v0, v9, v3}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    goto :goto_12

    .line 776
    :cond_18
    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 781
    .line 782
    .line 783
    move-result-object v7

    .line 784
    if-eqz v3, :cond_19

    .line 785
    .line 786
    goto :goto_10

    .line 787
    :cond_19
    const/4 v7, 0x0

    .line 788
    :goto_10
    if-eqz v7, :cond_1a

    .line 789
    .line 790
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    goto :goto_11

    .line 795
    :cond_1a
    move v3, v4

    .line 796
    :goto_11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-virtual {v0, v6, v3}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    :goto_12
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 809
    .line 810
    .line 811
    move-result v6

    .line 812
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 813
    .line 814
    .line 815
    move-result-object v6

    .line 816
    invoke-virtual {v0, v4, v6}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    iget-object v6, v0, La/f2i0;->n2:Ljava/util/ArrayList;

    .line 821
    .line 822
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    invoke-virtual {v0, v1}, La/f2i0;->V0(Ljava/util/Calendar;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 831
    .line 832
    .line 833
    move-result v6

    .line 834
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    iget-object v7, v7, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 839
    .line 840
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 841
    .line 842
    .line 843
    move-result-object v8

    .line 844
    iget-object v8, v8, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 845
    .line 846
    invoke-virtual {v8}, Landroid/widget/NumberPicker;->getDisplayedValues()[Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    array-length v8, v8

    .line 851
    if-gez v3, :cond_1b

    .line 852
    .line 853
    move v3, v5

    .line 854
    goto :goto_13

    .line 855
    :cond_1b
    if-le v3, v8, :cond_1c

    .line 856
    .line 857
    move v3, v8

    .line 858
    :cond_1c
    :goto_13
    invoke-virtual {v7, v3}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    iget-object v3, v3, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 866
    .line 867
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    iget-object v7, v7, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 872
    .line 873
    invoke-virtual {v7}, Landroid/widget/NumberPicker;->getDisplayedValues()[Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v7

    .line 877
    array-length v7, v7

    .line 878
    if-gez v4, :cond_1d

    .line 879
    .line 880
    move v4, v5

    .line 881
    goto :goto_14

    .line 882
    :cond_1d
    if-le v4, v7, :cond_1e

    .line 883
    .line 884
    move v4, v7

    .line 885
    :cond_1e
    :goto_14
    invoke-virtual {v3, v4}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    iget-object v3, v3, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 893
    .line 894
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    iget-object v4, v4, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 899
    .line 900
    invoke-virtual {v4}, Landroid/widget/NumberPicker;->getDisplayedValues()[Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v4

    .line 904
    array-length v4, v4

    .line 905
    if-gez v6, :cond_1f

    .line 906
    .line 907
    move v6, v5

    .line 908
    goto :goto_15

    .line 909
    :cond_1f
    if-le v6, v4, :cond_20

    .line 910
    .line 911
    move v6, v4

    .line 912
    :cond_20
    :goto_15
    invoke-virtual {v3, v6}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v0}, La/f2i0;->a1()Z

    .line 916
    .line 917
    .line 918
    move-result v3

    .line 919
    if-nez v3, :cond_23

    .line 920
    .line 921
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 922
    .line 923
    .line 924
    move-result v1

    .line 925
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    iget-object v2, v2, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 930
    .line 931
    invoke-virtual {v0}, La/f2i0;->W0()La/g2i0;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    iget-object v0, v0, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 936
    .line 937
    invoke-virtual {v0}, Landroid/widget/NumberPicker;->getDisplayedValues()[Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    array-length v0, v0

    .line 942
    if-gez v1, :cond_21

    .line 943
    .line 944
    goto :goto_16

    .line 945
    :cond_21
    if-le v1, v0, :cond_22

    .line 946
    .line 947
    move v5, v0

    .line 948
    goto :goto_16

    .line 949
    :cond_22
    move v5, v1

    .line 950
    :goto_16
    invoke-virtual {v2, v5}, Landroid/widget/NumberPicker;->setValue(I)V

    .line 951
    .line 952
    .line 953
    :cond_23
    :goto_17
    return-void

    .line 954
    :cond_24
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 955
    .line 956
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    return-void
.end method

.method public final V0(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->isToday(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const p1, 0x7f1315d0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object p0, p0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0x3c

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eq p0, v0, :cond_1

    .line 41
    .line 42
    sget-object p0, La/rdj;->a:La/rdj;

    .line 43
    .line 44
    sget-object v0, La/sdj;->h:La/sdj;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, v0, p1, v2, v1}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    sget-object p0, La/rdj;->a:La/rdj;

    .line 56
    .line 57
    sget-object v0, La/sdj;->g:La/sdj;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p0, v0, p1, v2, v1}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public final W0()La/g2i0;
    .locals 2

    .line 1
    sget-object v0, La/f2i0;->r2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/f2i0;->g2:La/nae0;

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
    check-cast p0, La/g2i0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final X0(ILjava/lang/Integer;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "%1$02d"

    .line 35
    .line 36
    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final Y0()I
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/widget/NumberPicker;->getValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, La/f2i0;->k2:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Date;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/f2i0;->a1()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p0, p0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/widget/NumberPicker;->getValue()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    const/16 v1, 0xb

    .line 50
    .line 51
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/widget/NumberPicker;->getValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    iget-object v2, p0, La/f2i0;->m2:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v1, v2}, La/dqm0;->r(ILjava/util/ArrayList;)La/vhq0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-boolean v1, v1, La/vhq0;->b:Z

    .line 72
    .line 73
    const/16 v2, 0x9

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-object p0, p0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/widget/NumberPicker;->getValue()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    const/16 v1, 0xa

    .line 89
    .line 90
    invoke-virtual {v0, v1, p0}, Ljava/util/Calendar;->set(II)V

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/util/Date;->getHours()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method

.method public final Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/f2i0;->r2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/f2i0;->h2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final a1()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/f2i0;->i2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b1(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0xb

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/f2i0;->l2:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    :goto_0
    if-gt p1, v1, :cond_1

    .line 25
    .line 26
    const/16 v2, 0xa

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const/16 v3, 0xc

    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p0, v2, v3}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {p0, v2, v3}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    new-array p1, p1, [Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, [Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final c1(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xb

    .line 12
    .line 13
    iget-object v2, p0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    move v4, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    :goto_0
    invoke-virtual {v0, v4}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 25
    .line 26
    .line 27
    const/16 v4, 0x17

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/f2i0;->l2:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 35
    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move p1, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_1
    if-gt p1, v4, :cond_2

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p0, v1, v2}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p0, p0, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 66
    .line 67
    new-array p1, v3, [Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, [Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final d1(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/f2i0;->n2:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, La/f2i0;->o2:Ljava/util/Calendar;

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    div-int/lit8 p1, p1, 0x5

    .line 33
    .line 34
    int-to-double v3, p1

    .line 35
    invoke-static {v3, v4}, La/si30;->a(D)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    mul-int/lit8 p1, p1, 0x5

    .line 40
    .line 41
    :goto_0
    const/16 v3, 0x3b

    .line 42
    .line 43
    if-gt p1, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0, v2, v3}, La/f2i0;->X0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/lit8 v2, v2, -0x1

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p0, p0, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 79
    .line 80
    new-array p1, v1, [Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, [Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final e1(Ljava/util/Calendar;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/NumberPicker;->setMinValue(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/f2i0;->m2:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    const/16 v2, 0x9

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sget-object v3, La/vhq0;->c:La/vhq0;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    move v2, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v2, v1

    .line 34
    :goto_0
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v4, v4, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 39
    .line 40
    sget-object v5, La/j2i0;->a:La/j2i0;

    .line 41
    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-static {v4, v5}, Landroid/text/format/DateUtils;->isToday(J)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    move v4, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v4, v1

    .line 61
    :goto_1
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v5, v5, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 66
    .line 67
    sget-object v6, La/j2i0;->b:La/j2i0;

    .line 68
    .line 69
    if-ne v5, v6, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iget-object v5, v5, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->b:Ljava/util/Date;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v5, p1}, La/ntb;->V(Ljava/util/Date;Ljava/util/Date;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_2

    .line 89
    .line 90
    move p1, v3

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move p1, v1

    .line 93
    :goto_2
    if-nez v2, :cond_3

    .line 94
    .line 95
    if-nez v4, :cond_3

    .line 96
    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    :cond_3
    sget-object p1, La/vhq0;->c:La/vhq0;

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_4
    sget-object p1, La/vhq0;->d:La/vhq0;

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object p0, p0, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    sub-int/2addr p1, v3

    .line 120
    invoke-virtual {p0, p1}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance p1, Ljava/util/ArrayList;

    .line 127
    .line 128
    const/16 v2, 0xa

    .line 129
    .line 130
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, La/vhq0;

    .line 152
    .line 153
    iget-object v2, v2, La/vhq0;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    new-array v0, v1, [Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, [Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method
