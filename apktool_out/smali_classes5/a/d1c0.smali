.class public final La/d1c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    iput-byte v0, p0, La/d1c0;->a:B

    .line 4
    .line 5
    sget-object v0, La/cwi0;->a:La/cwi0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/d1c0;->b:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 13
    iput-byte p2, p0, La/d1c0;->a:B

    iput-object p1, p0, La/d1c0;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/d1c0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/d1c0;->b:Ljava/util/List;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    sget-object v0, La/cwi0;->a:La/cwi0;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, v1, p0}, La/cwi0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    return-object v1

    .line 122
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :pswitch_a
    check-cast p1, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    return-object v1

    .line 142
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    return-object v1

    .line 152
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    return-object v1

    .line 182
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast p0, La/z0f0;

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    sget-object p1, La/sre0;->a:La/tre0;

    .line 199
    .line 200
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0

    .line 205
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    return-object v1

    .line 215
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    return-object v1

    .line 225
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    return-object v1

    .line 235
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    return-object v1

    .line 245
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    return-object v1

    .line 255
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    return-object p0

    .line 266
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    return-object v1

    .line 276
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    return-object v1

    .line 286
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    return-object v1

    .line 296
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    return-object v1

    .line 306
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    return-object v1

    .line 316
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    return-object v1

    .line 326
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result p1

    .line 332
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    return-object v1

    .line 336
    nop

    .line 337
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
