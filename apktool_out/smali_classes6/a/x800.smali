.class public final synthetic La/x800;
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
    iput-byte p1, p0, La/x800;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/cp00;)V
    .locals 0

    .line 1
    const/16 p1, 0xb

    iput-byte p1, p0, La/x800;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte p0, p0, La/x800;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/zw3;

    .line 9
    .line 10
    sget-object v0, La/g010;->a:La/g010;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    invoke-static {}, La/lz00;->values()[La/lz00;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "jun"

    .line 21
    .line 22
    const-string v2, "adc"

    .line 23
    .line 24
    const-string v3, "top"

    .line 25
    .line 26
    const-string v4, "mid"

    .line 27
    .line 28
    const-string v5, "sup"

    .line 29
    .line 30
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    filled-new-array {v0, v0, v0, v0, v0}, [[Ljava/lang/annotation/Annotation;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v2, "org.xplatform.special_event.impl.cyber_info.lol.data.model.LolChampionRoleResponse"

    .line 39
    .line 40
    invoke-static {v2, p0, v1, v0}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_1
    sget-object p0, La/lz00;->Companion:La/kz00;

    .line 46
    .line 47
    invoke-virtual {p0}, La/kz00;->serializer()La/jiy;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_2
    return-object v0

    .line 53
    :pswitch_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 56
    .line 57
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :pswitch_4
    sget-object p0, La/wr00;->a:La/zfn;

    .line 62
    .line 63
    sget-object p0, La/rv00;->p:La/rv00;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_5
    return-object v0

    .line 67
    :pswitch_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v0, "Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op."

    .line 70
    .line 71
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :pswitch_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "CompositionLocal LocalLifecycleOwner not present"

    .line 78
    .line 79
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :pswitch_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string v0, "LocalFragmentHost \u043d\u0435 \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u043b\u0435\u043d"

    .line 86
    .line 87
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :pswitch_9
    sget-object p0, La/jr00;->a:La/n0o0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/cwk;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_a
    new-instance v0, La/bwk;

    .line 101
    .line 102
    sget-object v2, La/la80;->a:La/la80;

    .line 103
    .line 104
    new-instance v5, La/z6k;

    .line 105
    .line 106
    const/high16 p0, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-direct {v5, p0, p0}, La/z6k;-><init>(FF)V

    .line 109
    .line 110
    .line 111
    new-instance v6, La/t9o0;

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    move v8, v7

    .line 115
    move v9, v7

    .line 116
    move v10, v7

    .line 117
    move v11, v7

    .line 118
    move v12, v7

    .line 119
    move v13, v7

    .line 120
    move v14, v7

    .line 121
    invoke-direct/range {v6 .. v14}, La/t9o0;-><init>(FFFFFFFF)V

    .line 122
    .line 123
    .line 124
    new-instance v9, La/sly;

    .line 125
    .line 126
    const/4 p0, 0x0

    .line 127
    invoke-direct {v9, p0, p0, v1}, La/sly;-><init>(FFZ)V

    .line 128
    .line 129
    .line 130
    sget-object v1, La/vhk;->a:La/vhk;

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    move-object v8, v6

    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    move v4, v3

    .line 138
    move v10, v3

    .line 139
    invoke-direct/range {v0 .. v10}, La/bwk;-><init>(La/zhk;La/la80;FFLa/w6k;FLa/erq;La/t9o0;La/sly;F)V

    .line 140
    .line 141
    .line 142
    new-instance p0, La/n8m0;

    .line 143
    .line 144
    invoke-direct {p0, v0}, La/n8m0;-><init>(La/bwk;)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_b
    sget-object p0, La/pz3;->a:La/pz3;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_c
    sget-object p0, La/fz3;->a:La/fz3;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_d
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_e
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_f
    new-instance p0, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v0, "static/img/android/loadscreen/1357/block/block.webp"

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_0

    .line 178
    .line 179
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_0
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v0, v2, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_3

    .line 190
    .line 191
    const-string v2, "https://"

    .line 192
    .line 193
    invoke-static {v0, v2, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_1

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    const/16 v3, 0x2f

    .line 205
    .line 206
    if-lez v2, :cond_2

    .line 207
    .line 208
    const-string v2, "/"

    .line 209
    .line 210
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_2

    .line 215
    .line 216
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    :cond_2
    const/4 v2, 0x1

    .line 220
    new-array v2, v2, [C

    .line 221
    .line 222
    aput-char v3, v2, v1

    .line 223
    .line 224
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_3
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    :goto_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_10
    new-instance p0, La/zw3;

    .line 244
    .line 245
    sget-object v0, La/ln7;->a:La/ln7;

    .line 246
    .line 247
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 248
    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_11
    new-instance p0, La/zw3;

    .line 252
    .line 253
    new-instance v0, La/zw3;

    .line 254
    .line 255
    sget-object v2, La/okx;->a:La/okx;

    .line 256
    .line 257
    invoke-direct {v0, v2, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 258
    .line 259
    .line 260
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 261
    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_12
    new-instance p0, La/zw3;

    .line 265
    .line 266
    sget-object v0, La/kwe;->a:La/kwe;

    .line 267
    .line 268
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 269
    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_13
    new-instance p0, La/zw3;

    .line 273
    .line 274
    sget-object v0, La/co2;->a:La/co2;

    .line 275
    .line 276
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 277
    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_14
    new-instance p0, La/zw3;

    .line 281
    .line 282
    sget-object v0, La/gdo;->a:La/gdo;

    .line 283
    .line 284
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 285
    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_15
    new-instance p0, La/zw3;

    .line 289
    .line 290
    sget-object v0, La/rj00;->a:La/rj00;

    .line 291
    .line 292
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 293
    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_16
    new-instance p0, La/zw3;

    .line 297
    .line 298
    sget-object v0, La/ti00;->a:La/ti00;

    .line 299
    .line 300
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 301
    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_17
    sget p0, La/qi00;->I:I

    .line 305
    .line 306
    sget-object p0, La/bid;->a:La/bid;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_19
    new-instance p0, La/zw3;

    .line 313
    .line 314
    sget-object v0, La/w830;->a:La/w830;

    .line 315
    .line 316
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 317
    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 321
    .line 322
    sget-object v0, La/n800;->a:La/n800;

    .line 323
    .line 324
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 325
    .line 326
    .line 327
    return-object p0

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
