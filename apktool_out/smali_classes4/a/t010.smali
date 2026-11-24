.class public final synthetic La/t010;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/t010;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/t010;)V
    .locals 0

    .line 1
    const/16 p1, 0x17

    iput-byte p1, p0, La/t010;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, La/t010;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_0
    new-instance p0, La/zw3;

    .line 11
    .line 12
    sget-object v1, La/xc10;->a:La/xc10;

    .line 13
    .line 14
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    new-instance p0, La/zw3;

    .line 19
    .line 20
    sget-object v1, La/s710;->a:La/s710;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    new-instance p0, La/uua0;

    .line 27
    .line 28
    const-class v1, La/kuw;

    .line 29
    .line 30
    sget-object v2, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-array v0, v0, [Ljava/lang/annotation/Annotation;

    .line 37
    .line 38
    invoke-direct {p0, v1, v0}, La/uua0;-><init>(La/sgy;[Ljava/lang/annotation/Annotation;)V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_3
    new-instance p0, La/zw3;

    .line 43
    .line 44
    sget-object v1, La/kc10;->a:La/kc10;

    .line 45
    .line 46
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_4
    sget p0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 51
    .line 52
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object v0, La/tvk;->a:La/rwj;

    .line 57
    .line 58
    sget-object v0, La/ys10;->a:La/vs10;

    .line 59
    .line 60
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p0, v0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_5
    sget-object p0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->j:[F

    .line 74
    .line 75
    sget-object p0, La/r810;->P1:[La/iiy;

    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_6
    sget-object p0, La/r810;->P1:[La/iiy;

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_7
    new-instance p0, La/e7z;

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    invoke-direct {p0, v0}, La/e7z;-><init>(I)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_8
    new-instance p0, La/dms;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_9
    sget p0, La/u610;->e0:I

    .line 99
    .line 100
    sget-object p0, La/ius;->a:La/ius;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_a
    new-instance p0, La/zw3;

    .line 104
    .line 105
    sget-object v1, La/g410;->a:La/g410;

    .line 106
    .line 107
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_b
    new-instance p0, La/zw3;

    .line 112
    .line 113
    sget-object v1, La/t410;->a:La/t410;

    .line 114
    .line 115
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_c
    new-instance p0, La/zw3;

    .line 120
    .line 121
    sget-object v1, La/k410;->a:La/k410;

    .line 122
    .line 123
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_d
    new-instance p0, La/zw3;

    .line 128
    .line 129
    sget-object v1, La/w410;->a:La/w410;

    .line 130
    .line 131
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 132
    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_e
    new-instance p0, La/zw3;

    .line 136
    .line 137
    sget-object v1, La/p410;->a:La/p410;

    .line 138
    .line 139
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_f
    new-instance p0, La/zw3;

    .line 144
    .line 145
    sget-object v1, La/e510;->a:La/e510;

    .line 146
    .line 147
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_10
    new-instance p0, La/zw3;

    .line 152
    .line 153
    sget-object v1, La/d410;->a:La/d410;

    .line 154
    .line 155
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_11
    new-instance p0, La/zw3;

    .line 160
    .line 161
    sget-object v1, La/s310;->a:La/s310;

    .line 162
    .line 163
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 164
    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_12
    new-instance p0, La/zw3;

    .line 168
    .line 169
    sget-object v1, La/s310;->a:La/s310;

    .line 170
    .line 171
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 172
    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_13
    sget-object p0, La/z310;->Companion:La/y310;

    .line 176
    .line 177
    invoke-virtual {p0}, La/y310;->serializer()La/jiy;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :pswitch_14
    sget-object p0, La/c410;->Companion:La/b410;

    .line 183
    .line 184
    invoke-virtual {p0}, La/b410;->serializer()La/jiy;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0

    .line 189
    :pswitch_15
    invoke-static {}, La/c410;->values()[La/c410;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    const-string v0, "BARON_NASHOR"

    .line 194
    .line 195
    const-string v1, "ATAKHAN"

    .line 196
    .line 197
    const-string v2, "HORDE"

    .line 198
    .line 199
    const-string v3, "DRAGON"

    .line 200
    .line 201
    const-string v4, "RIFTHERALD"

    .line 202
    .line 203
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const/4 v1, 0x0

    .line 208
    filled-new-array {v1, v1, v1, v1, v1}, [[Ljava/lang/annotation/Annotation;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v2, "org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchObjectKillsObjectTypeResponse"

    .line 213
    .line 214
    invoke-static {v2, p0, v0, v1}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_16
    invoke-static {}, La/z310;->values()[La/z310;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    const-string v5, "HEXTECH_DRAGON"

    .line 224
    .line 225
    const-string v6, "ELDER_DRAGON"

    .line 226
    .line 227
    const-string v0, "CHEMTECH_DRAGON"

    .line 228
    .line 229
    const-string v1, "FIRE_DRAGON"

    .line 230
    .line 231
    const-string v2, "EARTH_DRAGON"

    .line 232
    .line 233
    const-string v3, "WATER_DRAGON"

    .line 234
    .line 235
    const-string v4, "AIR_DRAGON"

    .line 236
    .line 237
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const/4 v6, 0x0

    .line 242
    const/4 v7, 0x0

    .line 243
    const/4 v1, 0x0

    .line 244
    const/4 v2, 0x0

    .line 245
    const/4 v3, 0x0

    .line 246
    const/4 v4, 0x0

    .line 247
    const/4 v5, 0x0

    .line 248
    filled-new-array/range {v1 .. v7}, [[Ljava/lang/annotation/Annotation;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    const-string v2, "org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchObjectKillsObjectSubTypeResponse"

    .line 253
    .line 254
    invoke-static {v2, p0, v0, v1}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_17
    new-instance p0, La/zw3;

    .line 260
    .line 261
    sget-object v1, La/g4h;->a:La/g4h;

    .line 262
    .line 263
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 264
    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_18
    new-instance p0, La/zw3;

    .line 268
    .line 269
    sget-object v1, La/d010;->a:La/d010;

    .line 270
    .line 271
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 272
    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_19
    new-instance p0, La/zw3;

    .line 276
    .line 277
    sget-object v1, La/d610;->a:La/d610;

    .line 278
    .line 279
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 280
    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 284
    .line 285
    sget-object v1, La/k610;->a:La/k610;

    .line 286
    .line 287
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 288
    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 292
    .line 293
    sget-object v1, La/cxb0;->a:La/cxb0;

    .line 294
    .line 295
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 296
    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 300
    .line 301
    sget-object v1, La/hz00;->a:La/hz00;

    .line 302
    .line 303
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 304
    .line 305
    .line 306
    return-object p0

    .line 307
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
