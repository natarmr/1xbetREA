.class public final synthetic La/uli0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uli0;->a:B

    iput p1, p0, La/uli0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/uli0;->a:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "SELECTED_VALUE_INDEX_KEY"

    .line 5
    .line 6
    iget v3, p0, La/uli0;->b:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/x8z;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v3}, La/q8x;->e(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    new-instance v0, La/pgv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/pgv;-><init>(J)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    check-cast p1, La/x8z;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, La/q8x;->e(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    new-instance v0, La/pgv;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1}, La/pgv;-><init>(J)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    check-cast p1, La/fhl;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget-object p0, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    const/high16 p0, 0x40000000    # 2.0f

    .line 61
    .line 62
    invoke-interface {p1, p0}, La/w6k;->w0(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    neg-float v5, v0

    .line 67
    const/high16 v0, 0x40800000    # 4.0f

    .line 68
    .line 69
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    neg-float v6, v1

    .line 74
    invoke-interface {p1}, La/fhl;->d()J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    const/16 v7, 0x20

    .line 79
    .line 80
    shr-long/2addr v1, v7

    .line 81
    long-to-int v1, v1

    .line 82
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-interface {p1}, La/fhl;->d()J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    const-wide v8, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v1, v8

    .line 96
    long-to-int v1, v1

    .line 97
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    new-instance v11, Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    .line 104
    .line 105
    .line 106
    sget-wide v1, La/y3d;->f:J

    .line 107
    .line 108
    invoke-static {v1, v2}, La/fbc;->U(J)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v11, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-interface {p1, p0}, La/w6k;->w0(F)F

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    neg-float v1, v1

    .line 124
    invoke-interface {p1, p0}, La/w6k;->w0(F)F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-virtual {v11, v0, v1, p0, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 129
    .line 130
    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_2
    check-cast p1, La/vzg0;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v4, La/ikq0;

    .line 145
    .line 146
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p1, v2, p0}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    invoke-static {v3}, La/tlb;->T(I)La/xrz;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    const/4 v9, 0x0

    .line 169
    const/4 v10, -0x1

    .line 170
    invoke-direct/range {v4 .. v12}, La/ikq0;-><init>(ZZZZLa/siq0;IILa/xrz;)V

    .line 171
    .line 172
    .line 173
    return-object v4

    .line 174
    :pswitch_3
    check-cast p1, Landroid/content/Context;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance p0, La/tje;

    .line 180
    .line 181
    invoke-direct {p0, p1, v3}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 182
    .line 183
    .line 184
    new-instance p1, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    const/4 v1, 0x6

    .line 188
    invoke-direct {p1, p0, v0, v1}, Lorg/xplatform/uikit_sport/score/SportScore;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_4
    check-cast p1, La/abi0;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    const p0, 0x7f08090a

    .line 198
    .line 199
    .line 200
    if-ne v3, p0, :cond_0

    .line 201
    .line 202
    const-string p0, "Active"

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_0
    const-string p0, "Inactive"

    .line 206
    .line 207
    :goto_0
    invoke-static {p1, p0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_5
    check-cast p1, La/aqk0;

    .line 214
    .line 215
    const/4 p0, 0x1

    .line 216
    if-nez v3, :cond_2

    .line 217
    .line 218
    iget-object p1, p1, La/aqk0;->a:Ljava/lang/Integer;

    .line 219
    .line 220
    if-eqz p1, :cond_1

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_1
    const/4 p0, 0x0

    .line 224
    :cond_2
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_6
    move-object v0, p1

    .line 230
    check-cast v0, La/hcz;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    sget-object v4, La/rq8;->i:La/ugd;

    .line 236
    .line 237
    const/4 v5, 0x6

    .line 238
    iget v1, p0, La/uli0;->b:I

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    const/4 v3, 0x0

    .line 242
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 243
    .line 244
    .line 245
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_7
    move-object v0, p1

    .line 249
    check-cast v0, La/hcz;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    sget-object v4, La/jd8;->g:La/ugd;

    .line 255
    .line 256
    const/4 v5, 0x6

    .line 257
    iget v1, p0, La/uli0;->b:I

    .line 258
    .line 259
    const/4 v2, 0x0

    .line 260
    const/4 v3, 0x0

    .line 261
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_8
    check-cast p1, La/vzg0;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    new-instance v4, La/sli0;

    .line 273
    .line 274
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-static {p1, v2, p0}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    check-cast p0, Ljava/lang/Number;

    .line 283
    .line 284
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    invoke-static {v3}, La/tlb;->T(I)La/xrz;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    const/4 v5, 0x0

    .line 293
    const/4 v6, 0x0

    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x0

    .line 296
    const/4 v9, 0x0

    .line 297
    const/4 v10, -0x1

    .line 298
    invoke-direct/range {v4 .. v12}, La/sli0;-><init>(ZZZZLa/niq0;IILa/xrz;)V

    .line 299
    .line 300
    .line 301
    return-object v4

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
