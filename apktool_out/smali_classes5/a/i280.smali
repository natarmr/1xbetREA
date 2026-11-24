.class public final synthetic La/i280;
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
    iput-byte p1, p0, La/i280;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/i280;->a:B

    .line 4
    .line 5
    sget-object v1, La/ab0;->a:La/ab0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/zw3;

    .line 18
    .line 19
    sget-object v1, La/yc90;->a:La/yc90;

    .line 20
    .line 21
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    sget-object v0, La/tvk;->a:La/rwj;

    .line 26
    .line 27
    sget-object v0, La/ys10;->a:La/vs10;

    .line 28
    .line 29
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_2
    sget-object v0, La/o890;->f2:La/jh70;

    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_3
    new-instance v0, La/y690;

    .line 44
    .line 45
    sget-object v1, La/x690;->a:La/x690;

    .line 46
    .line 47
    const-wide/16 v4, 0x0

    .line 48
    .line 49
    invoke-direct {v0, v1, v4, v5, v3}, La/y690;-><init>(La/x690;JZ)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_5
    new-instance v0, La/zw3;

    .line 57
    .line 58
    sget-object v1, La/s710;->a:La/s710;

    .line 59
    .line 60
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_6
    new-instance v0, La/zw3;

    .line 65
    .line 66
    sget-object v1, La/s710;->a:La/s710;

    .line 67
    .line 68
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_7
    new-instance v0, La/zw3;

    .line 73
    .line 74
    sget-object v1, La/s710;->a:La/s710;

    .line 75
    .line 76
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_8
    new-instance v0, La/zw3;

    .line 81
    .line 82
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 83
    .line 84
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_9
    new-instance v0, La/zw3;

    .line 89
    .line 90
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 91
    .line 92
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_a
    new-instance v0, La/y03;

    .line 97
    .line 98
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 99
    .line 100
    invoke-direct {v1}, Landroid/graphics/PathMeasure;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v1}, La/y03;-><init>(Landroid/graphics/PathMeasure;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_b
    new-instance v0, La/az80;

    .line 108
    .line 109
    sget-object v1, La/iun;->a:La/iun;

    .line 110
    .line 111
    sget-object v3, La/lun;->a:La/lun;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-direct {v0, v4, v2, v1, v3}, La/az80;-><init>(ZLa/j0g0;Ljava/util/List;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_c
    sget v0, La/rv80;->V:I

    .line 122
    .line 123
    return-object v1

    .line 124
    :pswitch_d
    sget v0, La/jt80;->s0:I

    .line 125
    .line 126
    return-object v1

    .line 127
    :pswitch_e
    return-object v2

    .line 128
    :pswitch_f
    sget-object v0, La/k6z;->a:La/k6z;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_10
    new-instance v0, La/kls0;

    .line 132
    .line 133
    sget-object v1, La/iun;->a:La/iun;

    .line 134
    .line 135
    invoke-direct {v0, v3, v1}, La/kls0;-><init>(ILjava/util/List;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    sget-object v9, La/dp00;->f:La/dp00;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v4, La/rh80;

    .line 151
    .line 152
    sget-object v5, La/gp00;->a:La/gp00;

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    invoke-direct/range {v4 .. v10}, La/rh80;-><init>(La/gp00;Ljava/util/List;IILa/dp00;La/dp00;)V

    .line 158
    .line 159
    .line 160
    return-object v4

    .line 161
    :pswitch_11
    new-instance v0, La/tf80;

    .line 162
    .line 163
    invoke-direct {v0}, La/tf80;-><init>()V

    .line 164
    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_13
    sget-object v0, La/z880;->U1:La/xi70;

    .line 171
    .line 172
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    .line 173
    .line 174
    const/16 v1, 0x19

    .line 175
    .line 176
    invoke-direct {v0, v1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_14
    sget-object v5, La/iun;->a:La/iun;

    .line 181
    .line 182
    new-instance v2, La/y780;

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    const-string v3, ""

    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    const/4 v6, 0x0

    .line 192
    const-string v7, ""

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const-string v9, ""

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    const-string v11, ""

    .line 199
    .line 200
    const-string v12, ""

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const-string v14, ""

    .line 204
    .line 205
    const/4 v15, 0x1

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    invoke-direct/range {v2 .. v18}, La/y780;-><init>(Ljava/lang/String;ILjava/util/List;La/bt9;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZ)V

    .line 209
    .line 210
    .line 211
    return-object v2

    .line 212
    :pswitch_15
    sget v0, La/v580;->u:I

    .line 213
    .line 214
    sget-object v0, La/cbv0;->a:La/cbv0;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_16
    new-instance v0, La/zw3;

    .line 218
    .line 219
    sget-object v1, La/y580;->a:La/y580;

    .line 220
    .line 221
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_17
    new-instance v0, La/zw3;

    .line 226
    .line 227
    sget-object v1, La/z280;->a:La/z280;

    .line 228
    .line 229
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_18
    new-instance v0, La/zw3;

    .line 234
    .line 235
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 236
    .line 237
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 238
    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_19
    new-instance v0, La/zw3;

    .line 242
    .line 243
    sget-object v1, La/f180;->a:La/f180;

    .line 244
    .line 245
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 250
    .line 251
    sget-object v1, La/v180;->a:La/v180;

    .line 252
    .line 253
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 254
    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_1b
    new-instance v0, La/zw3;

    .line 258
    .line 259
    sget-object v1, La/x580;->a:La/x580;

    .line 260
    .line 261
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_1c
    new-instance v0, La/zw3;

    .line 266
    .line 267
    sget-object v1, La/g180;->a:La/g180;

    .line 268
    .line 269
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 270
    .line 271
    .line 272
    return-object v0

    .line 273
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
