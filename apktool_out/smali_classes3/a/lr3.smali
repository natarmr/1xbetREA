.class public final synthetic La/lr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lr3;->a:B

    iput-object p1, p0, La/lr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/lr3;->a:B

    iput-object p1, p0, La/lr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/lr3;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    iget-object p0, p0, La/lr3;->b:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 11
    .line 12
    check-cast p1, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 24
    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    if-eq v0, v5, :cond_0

    .line 28
    .line 29
    move v0, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v4

    .line 32
    :goto_0
    and-int/2addr p2, v6

    .line 33
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v4, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->u(ILa/fet;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v4, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->v(ILa/fet;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v4, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->w(ILa/fet;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 60
    .line 61
    and-int/lit8 v0, p2, 0x3

    .line 62
    .line 63
    if-eq v0, v5, :cond_2

    .line 64
    .line 65
    move v0, v6

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v0, v4

    .line 68
    :goto_2
    and-int/2addr p2, v6

    .line 69
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget-object p2, p2, La/zu3;->a0:La/z7z;

    .line 80
    .line 81
    invoke-interface {p2}, La/z7z;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, La/fgu;

    .line 86
    .line 87
    iget-object p2, p2, La/fgu;->a:La/hru;

    .line 88
    .line 89
    iget-object p2, p2, La/hru;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, La/umx;

    .line 92
    .line 93
    iget-object p2, p2, La/umx;->b:La/p7m0;

    .line 94
    .line 95
    invoke-static {p2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2, v3, p1, v4, v2}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-nez p0, :cond_3

    .line 126
    .line 127
    if-ne v0, v1, :cond_4

    .line 128
    .line 129
    :cond_3
    new-instance v5, La/bk2;

    .line 130
    .line 131
    const/4 v11, 0x0

    .line 132
    const/16 v12, 0x13

    .line 133
    .line 134
    const/4 v6, 0x1

    .line 135
    const-class v8, La/zu3;

    .line 136
    .line 137
    const-string v9, "onInternetEmulationConnectionChanged"

    .line 138
    .line 139
    const-string v10, "onInternetEmulationConnectionChanged(Z)V"

    .line 140
    .line 141
    invoke-direct/range {v5 .. v12}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v0, v5

    .line 148
    :cond_4
    check-cast v0, La/jhy;

    .line 149
    .line 150
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 151
    .line 152
    invoke-static {v3, p2, v0, p1, v4}, La/p8a;->w(La/mm40;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 157
    .line 158
    .line 159
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    sget p2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 166
    .line 167
    invoke-static {v6}, La/x8x;->L(I)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    invoke-virtual {p0, p2, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->u(ILa/fet;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 182
    .line 183
    and-int/lit8 v0, p2, 0x3

    .line 184
    .line 185
    if-eq v0, v5, :cond_6

    .line 186
    .line 187
    move v0, v6

    .line 188
    goto :goto_4

    .line 189
    :cond_6
    move v0, v4

    .line 190
    :goto_4
    and-int/2addr p2, v6

    .line 191
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eqz p2, :cond_d

    .line 196
    .line 197
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    iget-object p2, p2, La/zu3;->m0:La/xae0;

    .line 202
    .line 203
    invoke-static {p2, v3, p1, v4, v2}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-interface {p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    check-cast p2, La/kjj;

    .line 212
    .line 213
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-nez v0, :cond_7

    .line 222
    .line 223
    if-ne v2, v1, :cond_8

    .line 224
    .line 225
    :cond_7
    new-instance v2, La/kr3;

    .line 226
    .line 227
    invoke-direct {v2, p0, v5}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 234
    .line 235
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    if-nez v0, :cond_9

    .line 244
    .line 245
    if-ne v3, v1, :cond_a

    .line 246
    .line 247
    :cond_9
    new-instance v3, La/kr3;

    .line 248
    .line 249
    const/4 v0, 0x3

    .line 250
    invoke-direct {v3, p0, v0}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 257
    .line 258
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-nez v0, :cond_b

    .line 267
    .line 268
    if-ne v4, v1, :cond_c

    .line 269
    .line 270
    :cond_b
    new-instance v4, La/kr3;

    .line 271
    .line 272
    const/4 v0, 0x4

    .line 273
    invoke-direct {v4, p0, v0}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 280
    .line 281
    const/4 v6, 0x0

    .line 282
    const/4 v0, 0x0

    .line 283
    move-object v5, p1

    .line 284
    move-object v1, p2

    .line 285
    invoke-static/range {v0 .. v6}, La/jjj;->a(La/mm40;La/kjj;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 286
    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_d
    move-object v5, p1

    .line 290
    invoke-virtual {v5}, La/fet;->X()V

    .line 291
    .line 292
    .line 293
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    sget p2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 300
    .line 301
    invoke-static {v6}, La/x8x;->L(I)I

    .line 302
    .line 303
    .line 304
    move-result p2

    .line 305
    invoke-virtual {p0, p2, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->v(ILa/fet;)V

    .line 306
    .line 307
    .line 308
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    sget p2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 315
    .line 316
    invoke-static {v6}, La/x8x;->L(I)I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    invoke-virtual {p0, p2, p1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->w(ILa/fet;)V

    .line 321
    .line 322
    .line 323
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
