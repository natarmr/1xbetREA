.class public final synthetic La/sy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/sy2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/sy2;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget p0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->t:I

    .line 13
    .line 14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, La/cp;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p0, La/j9;

    .line 23
    .line 24
    const/16 v0, 0x12

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    check-cast p1, La/um3;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-boolean p0, p1, La/um3;->n:Z

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    iget-boolean p0, p1, La/um3;->o:Z

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x0

    .line 50
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_2
    check-cast p1, La/um3;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p1, La/um3;->a:La/iy3;

    .line 61
    .line 62
    iget-object p1, p1, La/um3;->d:La/oc5;

    .line 63
    .line 64
    new-instance v0, Lkotlin/Pair;

    .line 65
    .line 66
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_3
    check-cast p1, La/cp;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance p0, La/j9;

    .line 76
    .line 77
    const/16 v0, 0x11

    .line 78
    .line 79
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_4
    check-cast p1, La/jh3;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p0, p1, La/jh3;->g:La/oc5;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_5
    check-cast p1, La/jh3;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object p0, p1, La/jh3;->b:La/iy3;

    .line 102
    .line 103
    iget-object p1, p1, La/jh3;->f:La/oc5;

    .line 104
    .line 105
    new-instance v0, Lkotlin/Pair;

    .line 106
    .line 107
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_6
    check-cast p1, La/jh3;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-boolean p0, p1, La/jh3;->k:Z

    .line 117
    .line 118
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_7
    check-cast p1, La/jh3;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object p0, p1, La/jh3;->h:Ljava/lang/String;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_8
    check-cast p1, La/bcy;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iput-boolean v0, p1, La/bcy;->b:Z

    .line 137
    .line 138
    iput-boolean v0, p1, La/bcy;->d:Z

    .line 139
    .line 140
    iput-boolean v0, p1, La/bcy;->c:Z

    .line 141
    .line 142
    iput-boolean v0, p1, La/bcy;->e:Z

    .line 143
    .line 144
    iput-boolean v0, p1, La/bcy;->a:Z

    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_9
    check-cast p1, Ljava/io/File;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_b
    check-cast p1, La/s93;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance p0, La/db2;

    .line 174
    .line 175
    invoke-direct {p0, p1}, La/db2;-><init>(La/s93;)V

    .line 176
    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_c
    check-cast p1, La/f83;

    .line 180
    .line 181
    instance-of p0, p1, La/eo80;

    .line 182
    .line 183
    xor-int/2addr p0, v0

    .line 184
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_d
    check-cast p1, Landroid/animation/Animator;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_e
    check-cast p1, Landroid/animation/Animator;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_f
    check-cast p1, Landroid/animation/Animator;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_10
    check-cast p1, Landroid/animation/Animator;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_11
    check-cast p1, Landroid/view/View;

    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_12
    check-cast p1, La/ou90;

    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_13
    check-cast p1, La/abi0;

    .line 232
    .line 233
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_14
    check-cast p1, La/k33;

    .line 237
    .line 238
    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    iget-object p1, p1, La/k33;->r:La/g33;

    .line 243
    .line 244
    new-instance v0, La/fx2;

    .line 245
    .line 246
    const/4 v1, 0x4

    .line 247
    invoke-direct {v0, p1, v1}, La/fx2;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_15
    check-cast p1, La/yfu0;

    .line 257
    .line 258
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_16
    check-cast p1, La/yfu0;

    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_17
    check-cast p1, La/ou90;

    .line 267
    .line 268
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object p0

    .line 271
    :pswitch_18
    check-cast p1, Ljava/lang/Long;

    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_19
    check-cast p1, La/abi0;

    .line 280
    .line 281
    sget-object p0, La/yai0;->a:[La/iiy;

    .line 282
    .line 283
    sget-object p0, La/xai0;->x:La/zai0;

    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    invoke-interface {p1, p0, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_1a
    check-cast p1, Ljava/lang/Long;

    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_1b
    check-cast p1, Ljava/lang/Byte;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 302
    .line 303
    .line 304
    move-result p0

    .line 305
    invoke-static {p0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->a(B)Ljava/lang/CharSequence;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    return-object p0

    .line 310
    :pswitch_1c
    check-cast p1, La/abi0;

    .line 311
    .line 312
    sget-object p0, La/yai0;->a:[La/iiy;

    .line 313
    .line 314
    sget-object p0, La/xai0;->y:La/zai0;

    .line 315
    .line 316
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    invoke-interface {p1, p0, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-object v0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
