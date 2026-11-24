.class public final synthetic La/zrh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dsh;


# direct methods
.method public synthetic constructor <init>(La/dsh;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zrh;->a:B

    iput-object p1, p0, La/zrh;->b:La/dsh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/zrh;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zrh;->b:La/dsh;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xrh;

    .line 9
    .line 10
    iget-object v1, p0, La/dsh;->R1:La/ash;

    .line 11
    .line 12
    iget-object v2, p0, La/dsh;->S1:La/ash;

    .line 13
    .line 14
    new-instance v3, La/t9f;

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    invoke-direct {v3, v4}, La/t9f;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v5, La/oye;

    .line 21
    .line 22
    invoke-virtual {p0}, La/dsh;->H0()La/rsh;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const/4 v11, 0x0

    .line 27
    const/16 v12, 0x19

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const-class v8, La/rsh;

    .line 31
    .line 32
    const-string v9, "onPrizeDistributionClick"

    .line 33
    .line 34
    const-string v10, "onPrizeDistributionClick()V"

    .line 35
    .line 36
    invoke-direct/range {v5 .. v12}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p0, La/xrh;->f:La/ek5;

    .line 46
    .line 47
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, La/nhe0;

    .line 51
    .line 52
    invoke-direct {p0}, La/nhe0;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v6, La/d930;

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    invoke-direct {v6, v7}, La/d930;-><init>(B)V

    .line 59
    .line 60
    .line 61
    new-instance v8, La/s3t;

    .line 62
    .line 63
    const/16 v9, 0x14

    .line 64
    .line 65
    invoke-direct {v8, v9}, La/s3t;-><init>(B)V

    .line 66
    .line 67
    .line 68
    new-instance v9, La/iok;

    .line 69
    .line 70
    invoke-direct {v9, v2, v7}, La/iok;-><init>(La/wyg;B)V

    .line 71
    .line 72
    .line 73
    new-instance v7, La/pkv;

    .line 74
    .line 75
    const/4 v10, 0x6

    .line 76
    invoke-direct {v7, v4, v10}, La/pkv;-><init>(IB)V

    .line 77
    .line 78
    .line 79
    sget-object v10, La/btv;->b:La/btv;

    .line 80
    .line 81
    new-instance v11, La/gbn;

    .line 82
    .line 83
    invoke-direct {v11, v8, v7, v9, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    iget-object v7, v0, La/zz3;->d:La/dp;

    .line 87
    .line 88
    invoke-virtual {v7, v11}, La/dp;->b(La/gbn;)V

    .line 89
    .line 90
    .line 91
    new-instance v8, La/efr0;

    .line 92
    .line 93
    const/16 v9, 0xd

    .line 94
    .line 95
    invoke-direct {v8, v9}, La/efr0;-><init>(B)V

    .line 96
    .line 97
    .line 98
    new-instance v10, La/lcr0;

    .line 99
    .line 100
    const/4 v11, 0x7

    .line 101
    invoke-direct {v10, v1, v11}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    new-instance v1, La/d8q0;

    .line 105
    .line 106
    const/16 v11, 0x9

    .line 107
    .line 108
    invoke-direct {v1, v4, v11}, La/d8q0;-><init>(IB)V

    .line 109
    .line 110
    .line 111
    sget-object v12, La/pfo0;->r:La/pfo0;

    .line 112
    .line 113
    new-instance v13, La/gbn;

    .line 114
    .line 115
    invoke-direct {v13, v8, v1, v10, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v13}, La/dp;->b(La/gbn;)V

    .line 119
    .line 120
    .line 121
    new-instance v1, La/efr0;

    .line 122
    .line 123
    const/16 v8, 0x12

    .line 124
    .line 125
    invoke-direct {v1, v8}, La/efr0;-><init>(B)V

    .line 126
    .line 127
    .line 128
    new-instance v8, La/m8s0;

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    invoke-direct {v8, v3, p0, v6, v10}, La/m8s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    new-instance p0, La/d8q0;

    .line 135
    .line 136
    const/16 v3, 0xe

    .line 137
    .line 138
    invoke-direct {p0, v4, v3}, La/d8q0;-><init>(IB)V

    .line 139
    .line 140
    .line 141
    sget-object v6, La/pfo0;->w:La/pfo0;

    .line 142
    .line 143
    new-instance v12, La/gbn;

    .line 144
    .line 145
    invoke-direct {v12, v1, p0, v8, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v12}, La/dp;->b(La/gbn;)V

    .line 149
    .line 150
    .line 151
    new-instance p0, La/efr0;

    .line 152
    .line 153
    invoke-direct {p0, v3}, La/efr0;-><init>(B)V

    .line 154
    .line 155
    .line 156
    new-instance v1, La/iok;

    .line 157
    .line 158
    const/4 v3, 0x4

    .line 159
    invoke-direct {v1, v2, v3}, La/iok;-><init>(La/wyg;B)V

    .line 160
    .line 161
    .line 162
    new-instance v3, La/d8q0;

    .line 163
    .line 164
    const/16 v6, 0xa

    .line 165
    .line 166
    invoke-direct {v3, v4, v6}, La/d8q0;-><init>(IB)V

    .line 167
    .line 168
    .line 169
    sget-object v6, La/pfo0;->s:La/pfo0;

    .line 170
    .line 171
    new-instance v8, La/gbn;

    .line 172
    .line 173
    invoke-direct {v8, p0, v3, v1, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v8}, La/dp;->b(La/gbn;)V

    .line 177
    .line 178
    .line 179
    new-instance p0, La/efr0;

    .line 180
    .line 181
    invoke-direct {p0, v11}, La/efr0;-><init>(B)V

    .line 182
    .line 183
    .line 184
    new-instance v1, La/iok;

    .line 185
    .line 186
    invoke-direct {v1, v2, v4}, La/iok;-><init>(La/wyg;B)V

    .line 187
    .line 188
    .line 189
    new-instance v2, La/d8q0;

    .line 190
    .line 191
    const/16 v3, 0x8

    .line 192
    .line 193
    invoke-direct {v2, v4, v3}, La/d8q0;-><init>(IB)V

    .line 194
    .line 195
    .line 196
    sget-object v3, La/pfo0;->q:La/pfo0;

    .line 197
    .line 198
    new-instance v6, La/gbn;

    .line 199
    .line 200
    invoke-direct {v6, p0, v2, v1, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v6}, La/dp;->b(La/gbn;)V

    .line 204
    .line 205
    .line 206
    new-instance p0, La/efr0;

    .line 207
    .line 208
    const/16 v1, 0x10

    .line 209
    .line 210
    invoke-direct {p0, v1}, La/efr0;-><init>(B)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La/g4s0;

    .line 214
    .line 215
    invoke-direct {v1, v9}, La/g4s0;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance v2, La/d8q0;

    .line 219
    .line 220
    const/16 v3, 0xc

    .line 221
    .line 222
    invoke-direct {v2, v4, v3}, La/d8q0;-><init>(IB)V

    .line 223
    .line 224
    .line 225
    sget-object v3, La/pfo0;->u:La/pfo0;

    .line 226
    .line 227
    new-instance v6, La/gbn;

    .line 228
    .line 229
    invoke-direct {v6, p0, v2, v1, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v6}, La/dp;->b(La/gbn;)V

    .line 233
    .line 234
    .line 235
    new-instance p0, La/efr0;

    .line 236
    .line 237
    const/16 v1, 0xf

    .line 238
    .line 239
    invoke-direct {p0, v1}, La/efr0;-><init>(B)V

    .line 240
    .line 241
    .line 242
    new-instance v1, La/b8s0;

    .line 243
    .line 244
    invoke-direct {v1, v5, v10}, La/b8s0;-><init>(La/oye;B)V

    .line 245
    .line 246
    .line 247
    new-instance v2, La/d8q0;

    .line 248
    .line 249
    const/16 v3, 0xb

    .line 250
    .line 251
    invoke-direct {v2, v4, v3}, La/d8q0;-><init>(IB)V

    .line 252
    .line 253
    .line 254
    sget-object v3, La/pfo0;->t:La/pfo0;

    .line 255
    .line 256
    new-instance v4, La/gbn;

    .line 257
    .line 258
    invoke-direct {v4, p0, v2, v1, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v4}, La/dp;->b(La/gbn;)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_0
    sget-object v0, La/dsh;->V1:La/usd;

    .line 266
    .line 267
    iget-object p0, p0, La/dsh;->L1:La/fiu0;

    .line 268
    .line 269
    if-eqz p0, :cond_0

    .line 270
    .line 271
    return-object p0

    .line 272
    :cond_0
    const-string p0, "viewModelFactory"

    .line 273
    .line 274
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const/4 p0, 0x0

    .line 278
    throw p0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
