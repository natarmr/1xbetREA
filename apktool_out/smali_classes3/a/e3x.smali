.class public final synthetic La/e3x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/bg5;


# direct methods
.method public synthetic constructor <init>(La/cp;La/bg5;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e3x;->a:B

    iput-object p1, p0, La/e3x;->b:La/cp;

    iput-object p2, p0, La/e3x;->c:La/bg5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e3x;->a:B

    .line 4
    .line 5
    const/16 v2, 0xf8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x4

    .line 9
    const/16 v5, 0x8

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/e3x;->c:La/bg5;

    .line 13
    .line 14
    iget-object v0, v0, La/e3x;->b:La/cp;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 27
    .line 28
    check-cast v1, La/e2k;

    .line 29
    .line 30
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, La/ydi0;

    .line 35
    .line 36
    iget-object v8, v8, La/ydi0;->g:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7, v8}, La/zz3;->A(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    iget-object v7, v1, La/e2k;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    check-cast v8, La/ydi0;

    .line 48
    .line 49
    iget v8, v8, La/ydi0;->e:I

    .line 50
    .line 51
    invoke-virtual {v7, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 52
    .line 53
    .line 54
    iget-object v7, v1, La/e2k;->e:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 55
    .line 56
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, La/ydi0;

    .line 61
    .line 62
    iget-object v8, v8, La/ydi0;->c:Landroid/text/SpannableString;

    .line 63
    .line 64
    invoke-virtual {v8}, Landroid/text/SpannableString;->length()I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-lez v8, :cond_0

    .line 69
    .line 70
    move v5, v6

    .line 71
    :cond_0
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, La/ydi0;

    .line 79
    .line 80
    iget-object v5, v5, La/ydi0;->c:Landroid/text/SpannableString;

    .line 81
    .line 82
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    iget-object v5, v1, La/e2k;->b:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, La/ydi0;

    .line 92
    .line 93
    iget-boolean v7, v7, La/ydi0;->h:Z

    .line 94
    .line 95
    if-nez v7, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move v4, v6

    .line 99
    :goto_0
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, La/e2k;->g:Landroid/widget/TextView;

    .line 103
    .line 104
    sget-object v4, La/rdj;->a:La/rdj;

    .line 105
    .line 106
    iget-object v4, v0, La/xhe0;->a:Landroid/view/View;

    .line 107
    .line 108
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/ydi0;

    .line 121
    .line 122
    iget-object v0, v0, La/ydi0;->f:Ljava/util/Date;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    sget-object v0, La/ykq0;->c:La/ykq0;

    .line 129
    .line 130
    new-instance v7, La/ynq0;

    .line 131
    .line 132
    invoke-direct {v7, v5, v6}, La/ynq0;-><init>(J)V

    .line 133
    .line 134
    .line 135
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v7, v0, v4, v3, v2}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_0
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, Ljava/util/List;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 157
    .line 158
    move-object v8, v1

    .line 159
    check-cast v8, La/d2k;

    .line 160
    .line 161
    iget-object v9, v8, La/d2k;->g:Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    check-cast v10, La/sde0;

    .line 168
    .line 169
    iget-object v10, v10, La/sde0;->g:La/dtt0;

    .line 170
    .line 171
    iget-object v10, v10, La/dtt0;->b:Ljava/lang/CharSequence;

    .line 172
    .line 173
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 177
    .line 178
    iget-object v10, v8, La/d2k;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 179
    .line 180
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, La/sde0;

    .line 185
    .line 186
    iget-object v8, v8, La/sde0;->g:La/dtt0;

    .line 187
    .line 188
    iget-object v11, v8, La/dtt0;->d:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, La/sde0;

    .line 195
    .line 196
    iget-object v8, v8, La/sde0;->g:La/dtt0;

    .line 197
    .line 198
    iget v12, v8, La/dtt0;->c:I

    .line 199
    .line 200
    sget-object v8, La/g2x;->a:La/g2x;

    .line 201
    .line 202
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x1ec

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const/4 v15, 0x0

    .line 212
    invoke-static/range {v10 .. v17}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 213
    .line 214
    .line 215
    check-cast v1, La/d2k;

    .line 216
    .line 217
    iget-object v8, v1, La/d2k;->h:Landroid/widget/TextView;

    .line 218
    .line 219
    iget-object v9, v1, La/d2k;->e:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 220
    .line 221
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    check-cast v10, La/sde0;

    .line 226
    .line 227
    iget-boolean v10, v10, La/sde0;->f:Z

    .line 228
    .line 229
    if-eqz v10, :cond_2

    .line 230
    .line 231
    move v10, v6

    .line 232
    goto :goto_1

    .line 233
    :cond_2
    move v10, v5

    .line 234
    :goto_1
    invoke-virtual {v8, v10}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    check-cast v8, La/sde0;

    .line 242
    .line 243
    iget-object v8, v8, La/sde0;->b:Landroid/text/SpannableString;

    .line 244
    .line 245
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    check-cast v8, La/sde0;

    .line 253
    .line 254
    iget-object v8, v8, La/sde0;->e:Ljava/util/ArrayList;

    .line 255
    .line 256
    invoke-virtual {v7, v8}, La/zz3;->A(Ljava/util/List;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    check-cast v7, La/sde0;

    .line 264
    .line 265
    iget-object v7, v7, La/sde0;->b:Landroid/text/SpannableString;

    .line 266
    .line 267
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-lez v7, :cond_3

    .line 272
    .line 273
    move v5, v6

    .line 274
    :cond_3
    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 275
    .line 276
    .line 277
    iget-object v5, v1, La/d2k;->c:Landroid/widget/ImageView;

    .line 278
    .line 279
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    check-cast v7, La/sde0;

    .line 284
    .line 285
    iget-boolean v7, v7, La/sde0;->h:Z

    .line 286
    .line 287
    if-nez v7, :cond_4

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_4
    move v4, v6

    .line 291
    :goto_2
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 292
    .line 293
    .line 294
    iget-object v1, v1, La/d2k;->i:Landroid/widget/TextView;

    .line 295
    .line 296
    sget-object v4, La/rdj;->a:La/rdj;

    .line 297
    .line 298
    iget-object v4, v0, La/xhe0;->a:Landroid/view/View;

    .line 299
    .line 300
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-static {v4}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/sde0;

    .line 313
    .line 314
    iget-object v0, v0, La/sde0;->d:Ljava/util/Date;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 317
    .line 318
    .line 319
    move-result-wide v5

    .line 320
    sget-object v0, La/ykq0;->c:La/ykq0;

    .line 321
    .line 322
    new-instance v7, La/ynq0;

    .line 323
    .line 324
    invoke-direct {v7, v5, v6}, La/ynq0;-><init>(J)V

    .line 325
    .line 326
    .line 327
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-static {v7, v0, v4, v3, v2}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
    .line 337
    .line 338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
