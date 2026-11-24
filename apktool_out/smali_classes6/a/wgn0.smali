.class public final La/wgn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:F

.field public i:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

.field public j:Landroid/widget/FrameLayout;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f070705

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, La/wgn0;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v1, 0x7f07072d

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, La/wgn0;->b:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v1, 0x7f0706ea

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, La/wgn0;->c:I

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const v1, 0x7f070633

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, La/wgn0;->d:I

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const v1, 0x7f070747

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, La/wgn0;->e:I

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v1, 0x7f07074a

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iput v0, p0, La/wgn0;->f:I

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const v1, 0x7f07074b

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput v0, p0, La/wgn0;->g:I

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const v1, 0x7f0705c3

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iput v0, p0, La/wgn0;->h:F

    .line 112
    .line 113
    new-instance v0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, La/wgn0;->k:Ljava/util/ArrayList;

    .line 119
    .line 120
    new-instance v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/wgn0;->l:Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance v0, La/o0k0;

    .line 128
    .line 129
    const/16 v1, 0x12

    .line 130
    .line 131
    invoke-direct {v0, p1, p0, v1}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, La/wgn0;->m:La/n0o0;

    .line 139
    .line 140
    return-void
.end method

.method public static d(Landroid/widget/TextView;II)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final getContentBackground()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/wgn0;->m:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;Lkotlin/jvm/functions/Function0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    iget-object v3, v3, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v1, v0, La/wgn0;->i:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, La/wgn0;->k:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, La/wgn0;->l:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    iput-object v6, v0, La/wgn0;->j:Landroid/widget/FrameLayout;

    .line 34
    .line 35
    invoke-virtual {v0}, La/wgn0;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    invoke-direct {v0}, La/wgn0;->getContentBackground()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v7, v0, La/wgn0;->i:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v7, v6

    .line 56
    :goto_0
    if-eqz v7, :cond_9

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-nez v7, :cond_2

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_2
    iget-object v7, v0, La/wgn0;->i:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 66
    .line 67
    if-eqz v7, :cond_3

    .line 68
    .line 69
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v7, v6

    .line 73
    :goto_1
    if-eqz v7, :cond_9

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_4

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const-string v7, ""

    .line 83
    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-nez v8, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    new-instance v8, La/bhn0;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-direct {v8, v9}, La/bhn0;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    if-nez v2, :cond_6

    .line 106
    .line 107
    move-object v2, v7

    .line 108
    :cond_6
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    move-object/from16 v9, p3

    .line 113
    .line 114
    invoke-virtual {v8, v2, v7, v3, v9}, La/bhn0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    :goto_2
    new-instance v8, La/vgn0;

    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-direct {v8, v3}, La/vgn0;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    if-nez v2, :cond_8

    .line 131
    .line 132
    move-object v2, v7

    .line 133
    :cond_8
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v8, v2, v3}, La/vgn0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    iput-object v8, v0, La/wgn0;->j:Landroid/widget/FrameLayout;

    .line 141
    .line 142
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    :cond_9
    :goto_4
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 146
    .line 147
    new-instance v2, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    :cond_a
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_d

    .line 161
    .line 162
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    move-object v7, v3

    .line 167
    check-cast v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 168
    .line 169
    if-eqz v7, :cond_c

    .line 170
    .line 171
    instance-of v8, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 172
    .line 173
    if-eqz v8, :cond_b

    .line 174
    .line 175
    check-cast v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 176
    .line 177
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-lez v7, :cond_a

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_b
    instance-of v8, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 187
    .line 188
    if-eqz v8, :cond_c

    .line 189
    .line 190
    check-cast v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 191
    .line 192
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-lez v7, :cond_a

    .line 199
    .line 200
    :goto_6
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const/4 v3, 0x0

    .line 213
    move v7, v3

    .line 214
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-eqz v8, :cond_18

    .line 219
    .line 220
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    add-int/lit8 v9, v7, 0x1

    .line 225
    .line 226
    if-ltz v7, :cond_17

    .line 227
    .line 228
    check-cast v8, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 229
    .line 230
    new-instance v10, Landroidx/appcompat/widget/AppCompatTextView;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-direct {v10, v11}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, La/jmu0;->d()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    invoke-virtual {v10, v11}, Landroid/view/View;->setId(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    new-instance v12, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    const-string v13, "itemName_"

    .line 253
    .line 254
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-virtual {v10, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    const v11, 0x7f1404a4

    .line 268
    .line 269
    .line 270
    invoke-static {v11, v10}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 271
    .line 272
    .line 273
    const/4 v11, 0x2

    .line 274
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 275
    .line 276
    .line 277
    sget-object v12, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 278
    .line 279
    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 280
    .line 281
    .line 282
    iget v13, v0, La/wgn0;->f:I

    .line 283
    .line 284
    iget v14, v0, La/wgn0;->g:I

    .line 285
    .line 286
    iget v15, v0, La/wgn0;->e:I

    .line 287
    .line 288
    invoke-static {v10, v13, v14, v15, v3}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 292
    .line 293
    .line 294
    if-eqz v8, :cond_16

    .line 295
    .line 296
    instance-of v6, v8, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 297
    .line 298
    const-string v11, "itemValue_"

    .line 299
    .line 300
    if-eqz v6, :cond_e

    .line 301
    .line 302
    move-object v3, v8

    .line 303
    check-cast v3, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 304
    .line 305
    iget v3, v3, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->c:I

    .line 306
    .line 307
    move-object/from16 v16, v1

    .line 308
    .line 309
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 310
    .line 311
    move-object/from16 v17, v2

    .line 312
    .line 313
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-direct {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    invoke-static {}, La/jmu0;->d()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    move/from16 v18, v6

    .line 332
    .line 333
    new-instance v6, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    const v2, 0x7f140492

    .line 349
    .line 350
    .line 351
    invoke-static {v2, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 355
    .line 356
    .line 357
    const/4 v2, 0x2

    .line 358
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 362
    .line 363
    .line 364
    const/4 v2, 0x0

    .line 365
    invoke-static {v1, v13, v14, v15, v2}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 369
    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_e
    move-object/from16 v16, v1

    .line 373
    .line 374
    move-object/from16 v17, v2

    .line 375
    .line 376
    move/from16 v18, v6

    .line 377
    .line 378
    instance-of v1, v8, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 379
    .line 380
    if-eqz v1, :cond_16

    .line 381
    .line 382
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-direct {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 389
    .line 390
    .line 391
    invoke-static {}, La/jmu0;->d()I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    new-instance v3, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    const v2, 0x7f140497

    .line 418
    .line 419
    .line 420
    invoke-static {v2, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 421
    .line 422
    .line 423
    const/4 v2, 0x2

    .line 424
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 428
    .line 429
    .line 430
    const/4 v2, 0x0

    .line 431
    invoke-static {v1, v13, v14, v15, v2}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 435
    .line 436
    .line 437
    :goto_8
    if-eqz v18, :cond_f

    .line 438
    .line 439
    move-object v2, v8

    .line 440
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 441
    .line 442
    iget-object v3, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-lez v3, :cond_f

    .line 449
    .line 450
    iget v2, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->c:I

    .line 451
    .line 452
    new-instance v3, Landroidx/appcompat/widget/AppCompatTextView;

    .line 453
    .line 454
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    invoke-direct {v3, v6}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 459
    .line 460
    .line 461
    invoke-static {}, La/jmu0;->d()I

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    invoke-virtual {v3, v6}, Landroid/view/View;->setId(I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    new-instance v11, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    const-string v12, "itemCurrency_"

    .line 475
    .line 476
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v3, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    const v6, 0x7f140492

    .line 490
    .line 491
    .line 492
    invoke-static {v6, v3}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 496
    .line 497
    .line 498
    const/4 v2, 0x0

    .line 499
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_f
    const/4 v3, 0x0

    .line 504
    :goto_9
    instance-of v2, v8, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 505
    .line 506
    if-eqz v2, :cond_11

    .line 507
    .line 508
    move-object v2, v8

    .line 509
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 510
    .line 511
    iget-object v6, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 512
    .line 513
    iget-object v2, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->a:Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    .line 517
    .line 518
    const-string v2, "0"

    .line 519
    .line 520
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    if-eqz v2, :cond_10

    .line 525
    .line 526
    const-string v6, "SP"

    .line 527
    .line 528
    :cond_10
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    .line 530
    .line 531
    const/4 v2, 0x3

    .line 532
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextDirection(I)V

    .line 533
    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_11
    if-eqz v18, :cond_15

    .line 537
    .line 538
    move-object v2, v8

    .line 539
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 540
    .line 541
    iget-object v6, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->a:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    iget-object v6, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    .line 550
    .line 551
    if-eqz v3, :cond_12

    .line 552
    .line 553
    iget-object v2, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    .line 557
    .line 558
    :cond_12
    :goto_a
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 562
    .line 563
    .line 564
    if-eqz v3, :cond_13

    .line 565
    .line 566
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 567
    .line 568
    .line 569
    :cond_13
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    add-int/lit8 v2, v2, -0x1

    .line 574
    .line 575
    if-ge v7, v2, :cond_14

    .line 576
    .line 577
    new-instance v2, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 578
    .line 579
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    const/4 v7, 0x6

    .line 587
    const/4 v11, 0x0

    .line 588
    const/4 v12, 0x0

    .line 589
    invoke-direct {v2, v6, v12, v7, v11}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 590
    .line 591
    .line 592
    invoke-static {}, La/jmu0;->d()I

    .line 593
    .line 594
    .line 595
    move-result v6

    .line 596
    invoke-virtual {v2, v6}, Landroid/view/View;->setId(I)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 600
    .line 601
    .line 602
    move-result v6

    .line 603
    new-instance v7, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const-string v12, "separator_"

    .line 606
    .line 607
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    invoke-virtual {v2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    const v7, 0x7f040b17

    .line 628
    .line 629
    .line 630
    invoke-static {v7, v6}, La/m5d;->b(ILandroid/content/Context;)I

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    goto :goto_b

    .line 644
    :cond_14
    const/4 v11, 0x0

    .line 645
    :goto_b
    new-instance v2, La/mb7;

    .line 646
    .line 647
    invoke-direct {v2, v10, v1, v3, v8}, La/mb7;-><init>(Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move v7, v9

    .line 654
    move v3, v11

    .line 655
    move-object/from16 v1, v16

    .line 656
    .line 657
    move-object/from16 v2, v17

    .line 658
    .line 659
    const/4 v6, 0x0

    .line 660
    goto/16 :goto_7

    .line 661
    .line 662
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 667
    .line 668
    .line 669
    return-void

    .line 670
    :cond_17
    invoke-static {}, La/q3d;->p()V

    .line 671
    .line 672
    .line 673
    const/4 v12, 0x0

    .line 674
    throw v12

    .line 675
    :cond_18
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/wgn0;->i:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v1, 0x1

    .line 15
    xor-int/2addr p0, v1

    .line 16
    if-ne p0, v1, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    return v0
.end method

.method public final c()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final onLayout(ZIIII)V
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/wgn0;->j:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iget v6, v5, La/wgn0;->b:I

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0, v7, v7, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v6

    .line 26
    move v8, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v8, v7

    .line 29
    :goto_0
    invoke-virtual {v5}, La/wgn0;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_f

    .line 34
    .line 35
    iget v9, v5, La/wgn0;->c:I

    .line 36
    .line 37
    add-int v0, v8, v9

    .line 38
    .line 39
    iget-object v10, v5, La/wgn0;->k:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    move v12, v0

    .line 46
    move v13, v7

    .line 47
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_e

    .line 52
    .line 53
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    add-int/lit8 v14, v13, 0x1

    .line 58
    .line 59
    if-ltz v13, :cond_d

    .line 60
    .line 61
    check-cast v0, La/mb7;

    .line 62
    .line 63
    iget-object v1, v0, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 64
    .line 65
    iget-object v15, v0, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 66
    .line 67
    iget-object v4, v0, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 68
    .line 69
    iget-object v0, v0, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 70
    .line 71
    instance-of v2, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    sub-int v2, v1, v2

    .line 92
    .line 93
    div-int/lit8 v2, v2, 0x2

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    sub-int/2addr v1, v3

    .line 100
    div-int/lit8 v15, v1, 0x2

    .line 101
    .line 102
    add-int v1, v12, v2

    .line 103
    .line 104
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    add-int/2addr v3, v12

    .line 109
    add-int/2addr v3, v2

    .line 110
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v2, v9

    .line 115
    move-object/from16 v16, v0

    .line 116
    .line 117
    iget v0, v5, La/wgn0;->c:I

    .line 118
    .line 119
    move-object/from16 p1, v16

    .line 120
    .line 121
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 122
    .line 123
    .line 124
    add-int v0, v12, v15

    .line 125
    .line 126
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/2addr v1, v12

    .line 131
    add-int/2addr v1, v15

    .line 132
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_1

    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    sub-int/2addr v2, v3

    .line 147
    sub-int/2addr v2, v9

    .line 148
    goto :goto_2

    .line 149
    :cond_1
    move v2, v9

    .line 150
    :goto_2
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_2

    .line 155
    .line 156
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    sub-int/2addr v3, v9

    .line 161
    :goto_3
    move-object/from16 v15, p1

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    add-int/2addr v3, v9

    .line 169
    goto :goto_3

    .line 170
    :goto_4
    invoke-virtual {v15, v2, v0, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v15, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    :goto_5
    add-int/2addr v12, v0

    .line 189
    goto/16 :goto_d

    .line 190
    .line 191
    :cond_3
    move-object/from16 v16, v0

    .line 192
    .line 193
    instance-of v0, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 194
    .line 195
    if-eqz v0, :cond_a

    .line 196
    .line 197
    if-nez v15, :cond_4

    .line 198
    .line 199
    move-object/from16 p1, v4

    .line 200
    .line 201
    move-object/from16 v4, v16

    .line 202
    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->getMeasuredHeight()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    sub-int v17, v3, v0

    .line 226
    .line 227
    div-int/lit8 v17, v17, 0x2

    .line 228
    .line 229
    sub-int v18, v3, v1

    .line 230
    .line 231
    div-int/lit8 v18, v18, 0x2

    .line 232
    .line 233
    sub-int/2addr v3, v2

    .line 234
    div-int/lit8 v19, v3, 0x2

    .line 235
    .line 236
    move v3, v1

    .line 237
    add-int v1, v12, v17

    .line 238
    .line 239
    add-int/2addr v0, v12

    .line 240
    add-int v0, v0, v17

    .line 241
    .line 242
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 243
    .line 244
    .line 245
    move-result v17

    .line 246
    add-int v17, v17, v9

    .line 247
    .line 248
    move/from16 v20, v3

    .line 249
    .line 250
    move v3, v0

    .line 251
    iget v0, v5, La/wgn0;->c:I

    .line 252
    .line 253
    move-object/from16 p1, v16

    .line 254
    .line 255
    move/from16 v16, v2

    .line 256
    .line 257
    move/from16 v2, v17

    .line 258
    .line 259
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 260
    .line 261
    .line 262
    add-int v0, v12, v18

    .line 263
    .line 264
    add-int v1, v12, v20

    .line 265
    .line 266
    add-int v1, v1, v18

    .line 267
    .line 268
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    iget v3, v5, La/wgn0;->a:I

    .line 273
    .line 274
    if-eqz v2, :cond_5

    .line 275
    .line 276
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 281
    .line 282
    .line 283
    move-result v17

    .line 284
    sub-int v2, v2, v17

    .line 285
    .line 286
    sub-int/2addr v2, v3

    .line 287
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 288
    .line 289
    .line 290
    move-result v17

    .line 291
    sub-int v2, v2, v17

    .line 292
    .line 293
    sub-int/2addr v2, v9

    .line 294
    goto :goto_6

    .line 295
    :cond_5
    move v2, v9

    .line 296
    :goto_6
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 297
    .line 298
    .line 299
    move-result v17

    .line 300
    if-eqz v17, :cond_6

    .line 301
    .line 302
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 303
    .line 304
    .line 305
    move-result v17

    .line 306
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 307
    .line 308
    .line 309
    move-result v18

    .line 310
    sub-int v17, v17, v18

    .line 311
    .line 312
    sub-int v17, v17, v9

    .line 313
    .line 314
    sub-int v17, v17, v3

    .line 315
    .line 316
    :goto_7
    move-object/from16 v18, v4

    .line 317
    .line 318
    move-object/from16 v4, p1

    .line 319
    .line 320
    move-object/from16 p1, v18

    .line 321
    .line 322
    move/from16 v18, v3

    .line 323
    .line 324
    move/from16 v3, v17

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 328
    .line 329
    .line 330
    move-result v17

    .line 331
    add-int v17, v17, v9

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :goto_8
    invoke-virtual {v4, v2, v0, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 338
    .line 339
    .line 340
    add-int v0, v12, v19

    .line 341
    .line 342
    add-int v2, v12, v16

    .line 343
    .line 344
    add-int v2, v2, v19

    .line 345
    .line 346
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_7

    .line 351
    .line 352
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    sub-int/2addr v1, v3

    .line 361
    sub-int/2addr v1, v9

    .line 362
    goto :goto_9

    .line 363
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    add-int/2addr v1, v9

    .line 368
    add-int v1, v1, v18

    .line 369
    .line 370
    :goto_9
    invoke-virtual {v5}, La/wgn0;->c()Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v3, :cond_8

    .line 375
    .line 376
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    sub-int/2addr v3, v9

    .line 381
    goto :goto_a

    .line 382
    :cond_8
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 387
    .line 388
    .line 389
    move-result v16

    .line 390
    add-int v16, v16, v3

    .line 391
    .line 392
    add-int v16, v16, v9

    .line 393
    .line 394
    add-int v3, v16, v18

    .line 395
    .line 396
    :goto_a
    invoke-virtual {v15, v1, v0, v3, v2}, Landroid/view/View;->layout(IIII)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v15, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 400
    .line 401
    .line 402
    :goto_b
    if-eqz v15, :cond_9

    .line 403
    .line 404
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    goto :goto_c

    .line 409
    :cond_9
    move v0, v7

    .line 410
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    goto/16 :goto_5

    .line 427
    .line 428
    :cond_a
    :goto_d
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    add-int/lit8 v0, v0, -0x1

    .line 433
    .line 434
    if-ge v13, v0, :cond_c

    .line 435
    .line 436
    add-int v1, v12, v6

    .line 437
    .line 438
    iget-object v0, v5, La/wgn0;->l:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-static {v13, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    move-object v4, v0

    .line 445
    check-cast v4, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 446
    .line 447
    if-eqz v4, :cond_b

    .line 448
    .line 449
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    sub-int v2, v0, v9

    .line 454
    .line 455
    iget v0, v5, La/wgn0;->d:I

    .line 456
    .line 457
    add-int v3, v1, v0

    .line 458
    .line 459
    iget v0, v5, La/wgn0;->c:I

    .line 460
    .line 461
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 462
    .line 463
    .line 464
    move v1, v3

    .line 465
    :cond_b
    add-int/2addr v1, v6

    .line 466
    move v12, v1

    .line 467
    :cond_c
    move-object/from16 v5, p0

    .line 468
    .line 469
    move v13, v14

    .line 470
    goto/16 :goto_1

    .line 471
    .line 472
    :cond_d
    invoke-static {}, La/q3d;->p()V

    .line 473
    .line 474
    .line 475
    const/4 v0, 0x0

    .line 476
    throw v0

    .line 477
    :cond_e
    add-int v3, v12, v9

    .line 478
    .line 479
    invoke-direct/range {p0 .. p0}, La/wgn0;->getContentBackground()Landroid/view/View;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    const/4 v0, 0x0

    .line 484
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    move-object/from16 v5, p0

    .line 489
    .line 490
    move v1, v8

    .line 491
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 492
    .line 493
    .line 494
    :cond_f
    return-void
.end method

.method public final onMeasure(II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget v3, v0, La/wgn0;->c:I

    .line 10
    .line 11
    mul-int/lit8 v4, v3, 0x2

    .line 12
    .line 13
    sub-int v4, v2, v4

    .line 14
    .line 15
    int-to-double v5, v4

    .line 16
    const-wide v7, 0x3fe3333333333333L    # 0.6

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    mul-double/2addr v5, v7

    .line 22
    double-to-int v5, v5

    .line 23
    iget-object v6, v0, La/wgn0;->j:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    const/high16 v7, -0x80000000

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    if-gez v2, :cond_0

    .line 31
    .line 32
    move v9, v8

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v9, v2

    .line 35
    :goto_0
    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    invoke-virtual {v6, v9, v1}, Landroid/view/View;->measure(II)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v6, v0, La/wgn0;->k:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    iget v11, v0, La/wgn0;->b:I

    .line 53
    .line 54
    if-eqz v10, :cond_7

    .line 55
    .line 56
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    check-cast v10, La/mb7;

    .line 61
    .line 62
    iget-object v12, v10, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 63
    .line 64
    iget-object v13, v10, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 65
    .line 66
    iget-object v14, v10, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 67
    .line 68
    if-eqz v12, :cond_6

    .line 69
    .line 70
    instance-of v15, v12, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 71
    .line 72
    if-eqz v15, :cond_3

    .line 73
    .line 74
    invoke-static {v13, v4, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-le v10, v5, :cond_2

    .line 82
    .line 83
    move v10, v5

    .line 84
    :cond_2
    invoke-static {v13, v10, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 85
    .line 86
    .line 87
    sub-int v10, v4, v10

    .line 88
    .line 89
    sub-int/2addr v10, v11

    .line 90
    invoke-static {v14, v10, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    instance-of v12, v12, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 95
    .line 96
    if-eqz v12, :cond_6

    .line 97
    .line 98
    iget-object v10, v10, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 99
    .line 100
    if-nez v10, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-static {v13, v4, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 104
    .line 105
    .line 106
    invoke-static {v10, v4, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    if-le v12, v5, :cond_5

    .line 114
    .line 115
    move v12, v5

    .line 116
    :cond_5
    invoke-static {v13, v12, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 117
    .line 118
    .line 119
    sub-int v12, v4, v12

    .line 120
    .line 121
    sub-int/2addr v12, v11

    .line 122
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    sub-int/2addr v12, v10

    .line 127
    iget v10, v0, La/wgn0;->a:I

    .line 128
    .line 129
    sub-int/2addr v12, v10

    .line 130
    invoke-static {v14, v12, v1}, La/wgn0;->d(Landroid/widget/TextView;II)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_7
    iget-object v5, v0, La/wgn0;->l:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eqz v9, :cond_9

    .line 149
    .line 150
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    check-cast v9, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 155
    .line 156
    if-gez v4, :cond_8

    .line 157
    .line 158
    move v10, v8

    .line 159
    goto :goto_3

    .line 160
    :cond_8
    move v10, v4

    .line 161
    :goto_3
    invoke-static {v10, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    invoke-virtual {v9, v10, v1}, Landroid/view/View;->measure(II)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_9
    iget-object v4, v0, La/wgn0;->j:Landroid/widget/FrameLayout;

    .line 170
    .line 171
    if-eqz v4, :cond_a

    .line 172
    .line 173
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    add-int/2addr v4, v11

    .line 178
    goto :goto_4

    .line 179
    :cond_a
    move v4, v8

    .line 180
    :goto_4
    invoke-virtual {v0}, La/wgn0;->b()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_11

    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    move v9, v8

    .line 191
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_e

    .line 196
    .line 197
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    check-cast v10, La/mb7;

    .line 202
    .line 203
    iget-object v12, v10, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 204
    .line 205
    iget-object v13, v10, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 206
    .line 207
    iget-object v14, v10, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 208
    .line 209
    instance-of v15, v12, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 210
    .line 211
    if-eqz v15, :cond_b

    .line 212
    .line 213
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    goto :goto_7

    .line 226
    :cond_b
    instance-of v12, v12, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 227
    .line 228
    if-eqz v12, :cond_d

    .line 229
    .line 230
    iget-object v10, v10, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 231
    .line 232
    if-eqz v10, :cond_c

    .line 233
    .line 234
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    goto :goto_6

    .line 239
    :cond_c
    move v10, v8

    .line 240
    :goto_6
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    invoke-static {v13, v10}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    goto :goto_7

    .line 257
    :cond_d
    move v10, v8

    .line 258
    :goto_7
    add-int/2addr v9, v10

    .line 259
    goto :goto_5

    .line 260
    :cond_e
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    const/4 v10, 0x1

    .line 265
    if-le v5, v10, :cond_f

    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    sub-int/2addr v5, v10

    .line 272
    iget v12, v0, La/wgn0;->d:I

    .line 273
    .line 274
    mul-int/2addr v5, v12

    .line 275
    goto :goto_8

    .line 276
    :cond_f
    move v5, v8

    .line 277
    :goto_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    if-le v12, v10, :cond_10

    .line 282
    .line 283
    mul-int/lit8 v11, v11, 0x2

    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    sub-int/2addr v6, v10

    .line 290
    mul-int/2addr v6, v11

    .line 291
    goto :goto_9

    .line 292
    :cond_10
    move v6, v8

    .line 293
    :goto_9
    add-int/2addr v9, v3

    .line 294
    add-int/2addr v9, v5

    .line 295
    add-int/2addr v9, v6

    .line 296
    add-int/2addr v9, v3

    .line 297
    goto :goto_a

    .line 298
    :cond_11
    move v9, v8

    .line 299
    :goto_a
    add-int/2addr v4, v9

    .line 300
    invoke-virtual {v0}, La/wgn0;->b()Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_13

    .line 305
    .line 306
    invoke-direct {v0}, La/wgn0;->getContentBackground()Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    if-gez v2, :cond_12

    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_12
    move v8, v2

    .line 314
    :goto_b
    invoke-static {v8, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    invoke-virtual {v3, v5, v9}, Landroid/view/View;->measure(II)V

    .line 319
    .line 320
    .line 321
    :cond_13
    move/from16 v3, p1

    .line 322
    .line 323
    invoke-static {v2, v3}, Landroid/view/View;->resolveSize(II)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    invoke-static {v4, v1}, Landroid/view/View;->resolveSize(II)I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 332
    .line 333
    .line 334
    const-string v1, "SUCCESS_BET_INFO_PRIMARY_VIEW"

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    return-void
.end method
