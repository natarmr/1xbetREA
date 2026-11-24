.class public final synthetic La/m120;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w220;


# direct methods
.method public synthetic constructor <init>(La/w220;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m120;->a:B

    iput-object p1, p0, La/m120;->b:La/w220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/m120;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/m120;->b:La/w220;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 15
    .line 16
    new-instance v0, La/yr0;

    .line 17
    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/w220;->f0:La/ivn;

    .line 33
    .line 34
    new-instance v0, La/km00;

    .line 35
    .line 36
    const/16 v1, 0x10

    .line 37
    .line 38
    invoke-direct {v0, p1, v1}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 51
    .line 52
    new-instance v0, La/yr0;

    .line 53
    .line 54
    const/16 v1, 0xb

    .line 55
    .line 56
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, La/w220;->e0:La/duj;

    .line 69
    .line 70
    new-instance v1, La/gm10;

    .line 71
    .line 72
    const/16 v2, 0x19

    .line 73
    .line 74
    invoke-direct {v1, v2}, La/gm10;-><init>(B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/w220;->A()V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 90
    .line 91
    new-instance v0, La/gm10;

    .line 92
    .line 93
    const/16 v1, 0x1a

    .line 94
    .line 95
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 108
    .line 109
    new-instance v0, La/yr0;

    .line 110
    .line 111
    const/16 v1, 0xe

    .line 112
    .line 113
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 126
    .line 127
    new-instance v0, La/gm10;

    .line 128
    .line 129
    const/16 v1, 0x18

    .line 130
    .line 131
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 144
    .line 145
    new-instance v0, La/gm10;

    .line 146
    .line 147
    const/16 v1, 0x15

    .line 148
    .line 149
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, La/w220;->e0:La/duj;

    .line 162
    .line 163
    new-instance v2, La/gm10;

    .line 164
    .line 165
    const/16 v3, 0x16

    .line 166
    .line 167
    invoke-direct {v2, v3}, La/gm10;-><init>(B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, La/w220;->s:La/ouu;

    .line 174
    .line 175
    invoke-virtual {p1}, La/ouu;->s()La/i1w0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    new-instance v0, La/k0w0;

    .line 180
    .line 181
    invoke-direct {v0, p1}, La/k0w0;-><init>(La/i1w0;)V

    .line 182
    .line 183
    .line 184
    iget-object p0, p0, La/w220;->d0:La/lme0;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance p0, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$RealityLimitErrorScreen;

    .line 190
    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 195
    .line 196
    .line 197
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 198
    .line 199
    invoke-static {p1, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_0
    move-object v0, p0

    .line 204
    check-cast v0, La/paw;

    .line 205
    .line 206
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_0

    .line 211
    .line 212
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, La/oe50;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, La/w220;->e0:La/duj;

    .line 229
    .line 230
    new-instance v2, La/gm10;

    .line 231
    .line 232
    const/16 v3, 0x17

    .line 233
    .line 234
    invoke-direct {v2, v3}, La/gm10;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, La/w220;->s:La/ouu;

    .line 241
    .line 242
    invoke-virtual {p1}, La/ouu;->s()La/i1w0;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    new-instance v0, La/k0w0;

    .line 247
    .line 248
    invoke-direct {v0, p1}, La/k0w0;-><init>(La/i1w0;)V

    .line 249
    .line 250
    .line 251
    iget-object p0, p0, La/w220;->d0:La/lme0;

    .line 252
    .line 253
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    new-instance p0, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$RealityLimitErrorScreen;

    .line 257
    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 262
    .line 263
    .line 264
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 265
    .line 266
    invoke-static {p1, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    :goto_1
    move-object v0, p0

    .line 271
    check-cast v0, La/paw;

    .line 272
    .line 273
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_1

    .line 278
    .line 279
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, La/oe50;

    .line 284
    .line 285
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 286
    .line 287
    .line 288
    goto :goto_1

    .line 289
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget-object p0, p0, La/w220;->e0:La/duj;

    .line 296
    .line 297
    new-instance v0, La/yr0;

    .line 298
    .line 299
    const/16 v1, 0xd

    .line 300
    .line 301
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 305
    .line 306
    .line 307
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object p0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
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
