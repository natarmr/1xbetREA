.class public final synthetic La/t32;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/t32;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, La/t32;->a:B

    .line 2
    .line 3
    sget-object v0, La/u1g0;->a:La/u1g0;

    .line 4
    .line 5
    sget-object v1, La/bid;->a:La/bid;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, La/r23;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, La/tvk;->a:La/rwj;

    .line 36
    .line 37
    sget-object v0, La/ys10;->a:La/vs10;

    .line 38
    .line 39
    new-instance v1, La/p23;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-direct {v1, v4, v3, v2}, La/p23;-><init>(ILa/yje;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, La/eeq;->U(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/view/Choreographer;

    .line 50
    .line 51
    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, La/thb;->y(Landroid/os/Looper;)Landroid/os/Handler;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {p0, v0, v1}, La/r23;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/r23;->l:La/t23;

    .line 63
    .line 64
    invoke-static {p0, v0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_2
    const-string p0, "DEFAULT_TEST_TAG"

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_5
    const-string p0, "LocalView"

    .line 83
    .line 84
    invoke-static {p0}, La/dy2;->a(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v3

    .line 88
    :pswitch_6
    const-string p0, "LocalResourceIdCache"

    .line 89
    .line 90
    invoke-static {p0}, La/dy2;->a(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v3

    .line 94
    :pswitch_7
    const-string p0, "LocalImageVectorCache"

    .line 95
    .line 96
    invoke-static {p0}, La/dy2;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v3

    .line 100
    :pswitch_8
    const-string p0, "LocalContext"

    .line 101
    .line 102
    invoke-static {p0}, La/dy2;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v3

    .line 106
    :pswitch_9
    const-string p0, "LocalConfiguration"

    .line 107
    .line 108
    invoke-static {p0}, La/dy2;->a(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v3

    .line 112
    :pswitch_a
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 113
    .line 114
    const-string v0, "HH:mm:ss dd.MM.yyyy"

    .line 115
    .line 116
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {p0, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_b
    new-instance p0, La/uua0;

    .line 125
    .line 126
    const-class v0, La/kuw;

    .line 127
    .line 128
    sget-object v1, La/sre0;->a:La/tre0;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-array v1, v2, [Ljava/lang/annotation/Annotation;

    .line 135
    .line 136
    invoke-direct {p0, v0, v1}, La/uua0;-><init>(La/sgy;[Ljava/lang/annotation/Annotation;)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_c
    new-instance p0, La/zw3;

    .line 141
    .line 142
    sget-object v0, La/nd6;->a:La/nd6;

    .line 143
    .line 144
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_d
    sget-object p0, La/qo2;->R1:La/jdk0;

    .line 149
    .line 150
    new-instance p0, La/mo2;

    .line 151
    .line 152
    invoke-direct {p0}, La/i26;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, La/i26;->e:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, La/dp;

    .line 158
    .line 159
    new-instance v1, La/ma2;

    .line 160
    .line 161
    const/16 v2, 0x14

    .line 162
    .line 163
    invoke-direct {v1, v2}, La/ma2;-><init>(B)V

    .line 164
    .line 165
    .line 166
    new-instance v2, La/m51;

    .line 167
    .line 168
    const/16 v3, 0x18

    .line 169
    .line 170
    invoke-direct {v2, p0, v3}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    new-instance v3, La/l9;

    .line 174
    .line 175
    const/4 v4, 0x3

    .line 176
    const/16 v5, 0x13

    .line 177
    .line 178
    invoke-direct {v3, v4, v5}, La/l9;-><init>(IB)V

    .line 179
    .line 180
    .line 181
    sget-object v4, La/m9;->u:La/m9;

    .line 182
    .line 183
    new-instance v5, La/gbn;

    .line 184
    .line 185
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v5}, La/dp;->b(La/gbn;)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_e
    new-instance p0, La/zw3;

    .line 193
    .line 194
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 195
    .line 196
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 197
    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_f
    new-instance p0, La/zw3;

    .line 201
    .line 202
    sget-object v0, La/okx;->a:La/okx;

    .line 203
    .line 204
    invoke-direct {p0, v0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_10
    sget p0, La/yn2;->g0:I

    .line 209
    .line 210
    return-object v1

    .line 211
    :pswitch_11
    new-instance p0, La/zl2;

    .line 212
    .line 213
    sget-object v0, La/iun;->a:La/iun;

    .line 214
    .line 215
    sget-object v1, La/ih2;->b:La/ih2;

    .line 216
    .line 217
    invoke-direct {p0, v0, v1}, La/zl2;-><init>(Ljava/util/List;La/ih2;)V

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_12
    sget p0, La/ul2;->S:I

    .line 222
    .line 223
    return-object v1

    .line 224
    :pswitch_13
    new-instance v2, La/ei2;

    .line 225
    .line 226
    const/4 v8, 0x1

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v3, 0x0

    .line 229
    const/4 v4, 0x1

    .line 230
    sget-object v5, La/dqp0;->a:La/dqp0;

    .line 231
    .line 232
    const/4 v6, 0x0

    .line 233
    const/4 v7, 0x0

    .line 234
    invoke-direct/range {v2 .. v9}, La/ei2;-><init>(La/wh2;ZLa/fqp0;ZZZLjava/util/List;)V

    .line 235
    .line 236
    .line 237
    return-object v2

    .line 238
    :pswitch_14
    sget p0, La/hh2;->O:I

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_15
    sget p0, La/hh2;->O:I

    .line 242
    .line 243
    return-object v1

    .line 244
    :pswitch_16
    sget-object p0, La/ef2;->V1:La/hfk0;

    .line 245
    .line 246
    new-instance p0, La/qdz;

    .line 247
    .line 248
    invoke-direct {p0}, La/qdz;-><init>()V

    .line 249
    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_17
    sget p0, La/le2;->F:I

    .line 253
    .line 254
    return-object v1

    .line 255
    :pswitch_18
    sget-object p0, La/vd2;->R1:La/gfk0;

    .line 256
    .line 257
    new-instance p0, La/qdz;

    .line 258
    .line 259
    invoke-direct {p0}, La/qdz;-><init>()V

    .line 260
    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_19
    sget p0, La/hb2;->E:I

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_1a
    sget-object p0, La/ia2;->Q1:La/rek0;

    .line 267
    .line 268
    new-instance p0, La/qdz;

    .line 269
    .line 270
    invoke-direct {p0}, La/qdz;-><init>()V

    .line 271
    .line 272
    .line 273
    return-object p0

    .line 274
    :pswitch_1b
    sget-object p0, La/w62;->Q1:La/pek0;

    .line 275
    .line 276
    new-instance p0, La/qdz;

    .line 277
    .line 278
    invoke-direct {p0}, La/qdz;-><init>()V

    .line 279
    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_1c
    sget p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 283
    .line 284
    return-object v1

    .line 285
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
