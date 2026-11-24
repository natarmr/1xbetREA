.class public final synthetic La/oac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oac;->a:B

    iput-object p1, p0, La/oac;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/oac;->a:B

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    iget-object v0, v0, La/oac;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/ymd0;

    .line 14
    .line 15
    sget-object v2, La/ymd0;->o2:La/fl70;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/ymd0;->j2:La/kiu0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v6, v0

    .line 27
    check-cast v6, La/tod0;

    .line 28
    .line 29
    iget-object v8, v6, La/tod0;->b:La/mne;

    .line 30
    .line 31
    iget-object v9, v6, La/tod0;->m:La/p7m0;

    .line 32
    .line 33
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v0, La/mod0;

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    check-cast v0, La/mod0;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v0, v10

    .line 46
    :goto_0
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-wide v11, v0, La/mod0;->g:D

    .line 49
    .line 50
    iget-wide v13, v0, La/mod0;->f:D

    .line 51
    .line 52
    iget-object v2, v6, La/tod0;->d:La/yk50;

    .line 53
    .line 54
    invoke-virtual {v2}, La/yk50;->g()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v15, 0x1

    .line 59
    if-eq v2, v1, :cond_1

    .line 60
    .line 61
    cmpl-double v2, v13, v11

    .line 62
    .line 63
    if-ltz v2, :cond_1

    .line 64
    .line 65
    move v2, v15

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v2, v7

    .line 68
    :goto_1
    const-wide/16 v3, 0x0

    .line 69
    .line 70
    const/16 v5, 0x79

    .line 71
    .line 72
    invoke-static/range {v0 .. v5}, La/mod0;->a(La/mod0;ZZDI)La/mod0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v9, v10, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    cmpg-double v1, v13, v11

    .line 82
    .line 83
    if-gez v1, :cond_2

    .line 84
    .line 85
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    iget-object v1, v8, La/mne;->b:La/dvj;

    .line 90
    .line 91
    new-instance v2, La/znd0;

    .line 92
    .line 93
    invoke-direct {v2, v6, v15}, La/znd0;-><init>(La/tod0;B)V

    .line 94
    .line 95
    .line 96
    new-instance v3, La/s9c0;

    .line 97
    .line 98
    const/16 v4, 0x11

    .line 99
    .line 100
    invoke-direct {v3, v6, v0, v10, v4}, La/s9c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 101
    .line 102
    .line 103
    const/16 v21, 0xa

    .line 104
    .line 105
    const/16 v18, 0x0

    .line 106
    .line 107
    move-object/from16 v19, v1

    .line 108
    .line 109
    move-object/from16 v17, v2

    .line 110
    .line 111
    move-object/from16 v20, v3

    .line 112
    .line 113
    invoke-static/range {v16 .. v21}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget-object v7, v8, La/mne;->b:La/dvj;

    .line 122
    .line 123
    new-instance v5, La/znd0;

    .line 124
    .line 125
    const/4 v1, 0x2

    .line 126
    invoke-direct {v5, v6, v1}, La/znd0;-><init>(La/tod0;B)V

    .line 127
    .line 128
    .line 129
    new-instance v8, La/pnd0;

    .line 130
    .line 131
    invoke-direct {v8, v6, v0, v10, v15}, La/pnd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 132
    .line 133
    .line 134
    const/16 v9, 0xa

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 138
    .line 139
    .line 140
    :cond_3
    :goto_2
    return-void

    .line 141
    :pswitch_0
    check-cast v0, La/h6d0;

    .line 142
    .line 143
    sget-object v1, La/h6d0;->Q1:La/nh70;

    .line 144
    .line 145
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, La/h6d0;->J0()La/r6d0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v8, v0, La/r6d0;->k:La/p7m0;

    .line 153
    .line 154
    :cond_4
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    move-object v10, v9

    .line 159
    check-cast v10, La/o6d0;

    .line 160
    .line 161
    iget-object v0, v10, La/o6d0;->a:La/j6d0;

    .line 162
    .line 163
    iget-object v2, v0, La/j6d0;->b:La/u6d0;

    .line 164
    .line 165
    iget-object v3, v0, La/j6d0;->c:Ljava/lang/String;

    .line 166
    .line 167
    iget v4, v0, La/j6d0;->d:I

    .line 168
    .line 169
    iget-object v5, v0, La/j6d0;->e:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v6, v0, La/j6d0;->f:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v0, La/j6d0;

    .line 183
    .line 184
    move/from16 v1, p2

    .line 185
    .line 186
    invoke-direct/range {v0 .. v6}, La/j6d0;-><init>(ZLa/u6d0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const/16 v2, 0xe

    .line 190
    .line 191
    invoke-static {v10, v0, v7, v7, v2}, La/o6d0;->a(La/o6d0;La/j6d0;ZZI)La/o6d0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v8, v9, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_1
    check-cast v0, Lorg/xplatform/uikit/components/radio_button/DsRadioButton;

    .line 203
    .line 204
    sget v2, Lorg/xplatform/uikit/components/radio_button/DsRadioButton;->h:I

    .line 205
    .line 206
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    check-cast v0, Landroid/view/View;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_2
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 223
    .line 224
    sget v2, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->g1:I

    .line 225
    .line 226
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    check-cast v0, Landroid/view/View;

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_3
    check-cast v0, La/o0g;

    .line 243
    .line 244
    sget-object v2, La/o0g;->k2:La/usd;

    .line 245
    .line 246
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, La/o0g;->U0()La/g1g;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    new-instance v2, La/rh;

    .line 254
    .line 255
    invoke-direct {v2, v1}, La/rh;-><init>(Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, La/g1g;->y(La/sh;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :pswitch_4
    check-cast v0, Lcom/google/android/material/chip/Chip;

    .line 263
    .line 264
    sget-object v2, Lcom/google/android/material/chip/Chip;->x:Landroid/graphics/Rect;

    .line 265
    .line 266
    iget-object v2, v0, Lcom/google/android/material/chip/Chip;->j:La/gi30;

    .line 267
    .line 268
    if-eqz v2, :cond_6

    .line 269
    .line 270
    check-cast v2, La/ok50;

    .line 271
    .line 272
    iget-object v2, v2, La/ok50;->a:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v2, La/m9c;

    .line 275
    .line 276
    if-eqz v1, :cond_5

    .line 277
    .line 278
    invoke-virtual {v2, v0}, La/m9c;->a(La/hi30;)Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-eqz v3, :cond_6

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_5
    iget-boolean v3, v2, La/m9c;->b:Z

    .line 286
    .line 287
    invoke-virtual {v2, v0, v3}, La/m9c;->g(La/hi30;Z)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_6

    .line 292
    .line 293
    :goto_3
    invoke-virtual {v2}, La/m9c;->d()V

    .line 294
    .line 295
    .line 296
    :cond_6
    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->i:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 297
    .line 298
    if-eqz v0, :cond_7

    .line 299
    .line 300
    move-object/from16 v2, p1

    .line 301
    .line 302
    invoke-interface {v0, v2, v1}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 303
    .line 304
    .line 305
    :cond_7
    return-void

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
