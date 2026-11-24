.class public final synthetic La/bb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u2e;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(La/u2e;FB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bb3;->a:B

    iput-object p1, p0, La/bb3;->b:La/u2e;

    iput p2, p0, La/bb3;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/bb3;->a:B

    .line 2
    .line 3
    sget-object v1, La/ouu0;->b:La/ouu0;

    .line 4
    .line 5
    sget-object v2, La/ouu0;->c:La/ouu0;

    .line 6
    .line 7
    const/high16 v3, 0x41000000    # 8.0f

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    iget v5, p0, La/bb3;->c:F

    .line 11
    .line 12
    iget-object p0, p0, La/bb3;->b:La/u2e;

    .line 13
    .line 14
    check-cast p1, La/t2e;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 23
    .line 24
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 25
    .line 26
    sget-object v1, La/qmk;->a:La/zcl;

    .line 27
    .line 28
    add-float/2addr v3, v5

    .line 29
    invoke-static {v0, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 45
    .line 46
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 47
    .line 48
    sget-object v0, La/qmk;->a:La/zcl;

    .line 49
    .line 50
    add-float/2addr v3, v5

    .line 51
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 64
    .line 65
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 66
    .line 67
    invoke-static {p1, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 80
    .line 81
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 82
    .line 83
    invoke-static {p1, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 96
    .line 97
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 98
    .line 99
    invoke-static {p1, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 112
    .line 113
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 114
    .line 115
    invoke-static {p1, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 125
    .line 126
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 127
    .line 128
    invoke-static {v0, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 132
    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 141
    .line 142
    iget-object p0, p0, La/u2e;->e:La/b3e;

    .line 143
    .line 144
    neg-float v1, v5

    .line 145
    invoke-static {v0, p0, v1, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 161
    .line 162
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 163
    .line 164
    sget-object v0, La/qmk;->a:La/zcl;

    .line 165
    .line 166
    add-float/2addr v3, v5

    .line 167
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 168
    .line 169
    .line 170
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 180
    .line 181
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 182
    .line 183
    sget-object v0, La/qmk;->a:La/zcl;

    .line 184
    .line 185
    add-float/2addr v3, v5

    .line 186
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 196
    .line 197
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 198
    .line 199
    invoke-static {v0, p0, v5, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 212
    .line 213
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 214
    .line 215
    sget-object v1, La/qmk;->a:La/zcl;

    .line 216
    .line 217
    add-float/2addr v3, v5

    .line 218
    invoke-static {v0, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 222
    .line 223
    .line 224
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 231
    .line 232
    .line 233
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 234
    .line 235
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 236
    .line 237
    sget-object v0, La/qmk;->a:La/zcl;

    .line 238
    .line 239
    add-float/2addr v3, v5

    .line 240
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 253
    .line 254
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 255
    .line 256
    sget-object v0, La/qmk;->a:La/zcl;

    .line 257
    .line 258
    add-float/2addr v3, v5

    .line 259
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 260
    .line 261
    .line 262
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 269
    .line 270
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 271
    .line 272
    sget-object v1, La/qmk;->a:La/zcl;

    .line 273
    .line 274
    add-float/2addr v3, v5

    .line 275
    invoke-static {v0, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v0, p1, La/t2e;->i:La/yzn0;

    .line 288
    .line 289
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 290
    .line 291
    sget-object v1, La/qmk;->a:La/zcl;

    .line 292
    .line 293
    add-float/2addr v3, v5

    .line 294
    invoke-static {v0, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v2}, La/t2e;->d(La/ouu0;)V

    .line 298
    .line 299
    .line 300
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, v1}, La/t2e;->d(La/ouu0;)V

    .line 307
    .line 308
    .line 309
    iget-object p1, p1, La/t2e;->i:La/yzn0;

    .line 310
    .line 311
    iget-object p0, p0, La/u2e;->h:La/b3e;

    .line 312
    .line 313
    sget-object v0, La/qmk;->a:La/zcl;

    .line 314
    .line 315
    add-float/2addr v3, v5

    .line 316
    invoke-static {p1, p0, v3, v4}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 317
    .line 318
    .line 319
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object p0

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
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
