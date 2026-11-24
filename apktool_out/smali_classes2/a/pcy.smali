.class public final synthetic La/pcy;
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
    iput-byte p1, p0, La/pcy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/pcy;->a:B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance v0, La/erz;

    .line 12
    .line 13
    sget-object v4, La/iun;->a:La/iun;

    .line 14
    .line 15
    invoke-direct {v0, v4, v2, v1, v3}, La/erz;-><init>(Ljava/util/List;La/d7i0;ZZ)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_2
    new-instance v0, La/jqz;

    .line 26
    .line 27
    new-instance v4, La/qiq0;

    .line 28
    .line 29
    sget-object v5, Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;->c:Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;

    .line 30
    .line 31
    sget-object v6, La/liq0;->a:La/liq0;

    .line 32
    .line 33
    sget-object v15, La/nrz;->d:La/nrz;

    .line 34
    .line 35
    sget-object v16, La/iun;->a:La/iun;

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    const-string v9, ""

    .line 42
    .line 43
    const-wide/16 v10, 0x0

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    invoke-direct/range {v4 .. v17}, La/qiq0;-><init>(Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;La/vrz;JLjava/lang/String;JZZZLa/nrz;Ljava/util/List;Z)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v4, v2, v3}, La/jqz;-><init>(La/qiq0;La/y85;Z)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_4
    new-instance v0, La/opz;

    .line 59
    .line 60
    new-instance v4, La/piq0;

    .line 61
    .line 62
    sget-object v5, Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;->b:Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;

    .line 63
    .line 64
    sget-object v6, La/kiq0;->a:La/kiq0;

    .line 65
    .line 66
    sget-object v15, La/mrz;->d:La/mrz;

    .line 67
    .line 68
    sget-object v16, La/iun;->a:La/iun;

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const-wide/16 v7, 0x0

    .line 73
    .line 74
    const-string v9, ""

    .line 75
    .line 76
    const-wide/16 v10, 0x0

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v13, 0x0

    .line 80
    const/4 v14, 0x0

    .line 81
    invoke-direct/range {v4 .. v17}, La/piq0;-><init>(Lorg/xplatform/limits_ee/api/domain/LimitGroupEnum;La/urz;JLjava/lang/String;JZZZLa/mrz;Ljava/util/List;Z)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v0, v4, v2, v3}, La/opz;-><init>(La/piq0;La/x85;Z)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_6
    new-instance v0, La/uoz;

    .line 92
    .line 93
    new-instance v3, La/oiq0;

    .line 94
    .line 95
    sget-object v4, Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;->c:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 96
    .line 97
    sget-object v5, La/miq0;->a:La/miq0;

    .line 98
    .line 99
    sget-object v14, La/qrz;->d:La/qrz;

    .line 100
    .line 101
    sget-object v15, La/iun;->a:La/iun;

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const-wide/16 v6, 0x0

    .line 106
    .line 107
    const-string v8, ""

    .line 108
    .line 109
    const-wide/16 v9, 0x0

    .line 110
    .line 111
    const/4 v11, 0x0

    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    invoke-direct/range {v3 .. v16}, La/oiq0;-><init>(Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;La/trz;JLjava/lang/String;JZZZLa/qrz;Ljava/util/List;Z)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v0, v3, v2}, La/uoz;-><init>(La/oiq0;La/w85;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_7
    new-instance v0, La/mez;

    .line 122
    .line 123
    filled-new-array {v3}, [I

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    filled-new-array {v3}, [I

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-direct {v0, v1, v2}, La/mez;-><init>([I[I)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_8
    new-instance v0, La/pdz;

    .line 136
    .line 137
    sget-object v1, La/iun;->a:La/iun;

    .line 138
    .line 139
    invoke-direct {v0, v1}, La/pdz;-><init>(Ljava/util/List;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_9
    new-instance v0, La/d9z;

    .line 144
    .line 145
    invoke-direct {v0, v3, v3}, La/d9z;-><init>(II)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_a
    new-instance v0, La/e7z;

    .line 150
    .line 151
    const/4 v1, 0x3

    .line 152
    invoke-direct {v0, v1}, La/e7z;-><init>(I)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_b
    sget-object v0, La/b3z;->a:La/b3z;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_c
    const/4 v0, 0x2

    .line 160
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_d
    new-instance v0, La/rzy;

    .line 166
    .line 167
    sget-object v2, La/iun;->a:La/iun;

    .line 168
    .line 169
    invoke-direct {v0, v2, v1, v3, v3}, La/rzy;-><init>(Ljava/util/List;ZZZ)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_e
    sget-object v0, La/k6z;->a:La/k6z;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_f
    new-instance v0, La/zw3;

    .line 177
    .line 178
    sget-object v1, La/whp0;->a:La/whp0;

    .line 179
    .line 180
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 181
    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_10
    new-instance v0, La/zw3;

    .line 185
    .line 186
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 187
    .line 188
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 189
    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_11
    invoke-static {}, La/wuy;->values()[La/wuy;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v1, La/g0o;

    .line 200
    .line 201
    const-string v2, "org.xplatform.feature.online_call.api.domain.language_selector_block_status.model.LanguageSelectorClickStatus"

    .line 202
    .line 203
    invoke-direct {v1, v2, v0}, La/g0o;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_12
    new-instance v0, La/zw3;

    .line 208
    .line 209
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 210
    .line 211
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_13
    new-instance v0, La/zw3;

    .line 216
    .line 217
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 218
    .line 219
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 220
    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_14
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 224
    .line 225
    const-string v1, "google"

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0

    .line 236
    :pswitch_15
    new-instance v0, La/zw3;

    .line 237
    .line 238
    sget-object v1, La/moa;->a:La/moa;

    .line 239
    .line 240
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_16
    new-instance v0, La/zw3;

    .line 245
    .line 246
    sget-object v1, La/moa;->a:La/moa;

    .line 247
    .line 248
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_17
    new-instance v0, La/zw3;

    .line 253
    .line 254
    sget-object v1, La/gjy;->a:La/gjy;

    .line 255
    .line 256
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_18
    new-instance v0, La/zw3;

    .line 261
    .line 262
    sget-object v1, La/o9a0;->a:La/o9a0;

    .line 263
    .line 264
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_19
    new-instance v0, La/zw3;

    .line 269
    .line 270
    sget-object v1, La/whp0;->a:La/whp0;

    .line 271
    .line 272
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 273
    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 277
    .line 278
    sget-object v1, La/xiy;->a:La/xiy;

    .line 279
    .line 280
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_1b
    sget-object v0, La/acy;->b:La/zby;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_1c
    sget-object v0, La/gdy;->b:La/fdy;

    .line 288
    .line 289
    return-object v0

    .line 290
    nop

    .line 291
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
