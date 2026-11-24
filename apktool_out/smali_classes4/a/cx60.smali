.class public final synthetic La/cx60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gx60;


# direct methods
.method public synthetic constructor <init>(La/gx60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cx60;->a:B

    iput-object p1, p0, La/cx60;->b:La/gx60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/cx60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/cx60;->b:La/gx60;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Long;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    sget-object v0, La/gx60;->R1:La/atz;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v3, v2, La/gx60;->K1:La/phf0;

    .line 22
    .line 23
    sget-object v4, La/gx60;->S1:[La/iiy;

    .line 24
    .line 25
    aget-object v1, v4, v1

    .line 26
    .line 27
    invoke-virtual {v3, v2, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, p0, p1, v1}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, La/gx60;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/mw60;

    .line 39
    .line 40
    invoke-direct {v1, p0, p1}, La/mw60;-><init>(J)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-object p0, v2, La/gx60;->P1:La/kiu0;

    .line 50
    .line 51
    check-cast p1, La/px60;

    .line 52
    .line 53
    sget-object v0, La/gx60;->R1:La/atz;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    instance-of v0, p1, La/lx60;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/k370;

    .line 67
    .line 68
    sget-object p1, La/y270;->a:La/y270;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/k370;->y(La/a370;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    instance-of v0, p1, La/mx60;

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, La/k370;

    .line 84
    .line 85
    new-instance p1, La/z270;

    .line 86
    .line 87
    invoke-direct {p1, v3}, La/z270;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, La/k370;->y(La/a370;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    instance-of p0, p1, La/ox60;

    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    if-eqz p0, :cond_3

    .line 98
    .line 99
    iget-object v4, v2, La/gx60;->O1:La/ynb;

    .line 100
    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    sget-object v5, La/bm5;->d:La/bm5;

    .line 104
    .line 105
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const-string v9, "SELECT_BALANCE_REQUEST_KEY"

    .line 113
    .line 114
    const/16 v10, 0x1ee

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance p1, La/ex60;

    .line 126
    .line 127
    invoke-direct {p1, v2, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 131
    .line 132
    invoke-virtual {p0, v0, v2, p1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    const-string p0, "changeBalanceDialogProvider"

    .line 137
    .line 138
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :cond_3
    instance-of p0, p1, La/nx60;

    .line 143
    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    check-cast p1, La/nx60;

    .line 147
    .line 148
    iget-object p0, p1, La/nx60;->a:La/tn60;

    .line 149
    .line 150
    iget-object p1, v2, La/gx60;->M1:La/n0o0;

    .line 151
    .line 152
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, La/bii;

    .line 157
    .line 158
    iget-object p1, p1, La/bii;->q:La/bw60;

    .line 159
    .line 160
    invoke-interface {p1}, La/bw60;->b()La/afm0;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    new-instance v0, La/cx60;

    .line 168
    .line 169
    invoke-direct {v0, v2, v3}, La/cx60;-><init>(La/gx60;B)V

    .line 170
    .line 171
    .line 172
    new-instance v1, La/cx60;

    .line 173
    .line 174
    const/4 v3, 0x2

    .line 175
    invoke-direct {v1, v2, v3}, La/cx60;-><init>(La/gx60;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v2, p0, v0, v1}, La/afm0;->q(Landroidx/fragment/app/Fragment;La/tn60;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    :goto_0
    invoke-virtual {v2}, La/gx60;->G0()La/k3t0;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    sget-object p1, La/hw60;->a:La/hw60;

    .line 186
    .line 187
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 194
    .line 195
    .line 196
    :goto_1
    return-object v0

    .line 197
    :pswitch_1
    check-cast p1, La/lwk;

    .line 198
    .line 199
    sget-object v0, La/gx60;->R1:La/atz;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object v3, p0, La/cx60;->b:La/gx60;

    .line 205
    .line 206
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    new-instance v4, La/cx60;

    .line 211
    .line 212
    const/4 p0, 0x5

    .line 213
    invoke-direct {v4, v3, p0}, La/cx60;-><init>(La/gx60;B)V

    .line 214
    .line 215
    .line 216
    new-instance v5, La/dx60;

    .line 217
    .line 218
    invoke-direct {v5, v3, v1}, La/dx60;-><init>(La/gx60;B)V

    .line 219
    .line 220
    .line 221
    const/4 v6, 0x0

    .line 222
    const/16 v7, 0x12

    .line 223
    .line 224
    invoke-static/range {v2 .. v7}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 225
    .line 226
    .line 227
    new-instance p0, La/ty2;

    .line 228
    .line 229
    const/16 p1, 0x12

    .line 230
    .line 231
    invoke-direct {p0, v3, p1}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_2
    check-cast p1, La/on60;

    .line 236
    .line 237
    sget-object p0, La/gx60;->R1:La/atz;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, La/gx60;->G0()La/k3t0;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    new-instance v0, La/qw60;

    .line 247
    .line 248
    invoke-direct {v0, p1}, La/qw60;-><init>(La/on60;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_3
    check-cast p1, La/dn60;

    .line 258
    .line 259
    sget-object p0, La/gx60;->R1:La/atz;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, La/gx60;->G0()La/k3t0;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    new-instance v0, La/ax60;

    .line 269
    .line 270
    invoke-direct {v0, p1}, La/ax60;-><init>(La/dn60;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_4
    check-cast p1, La/dn60;

    .line 280
    .line 281
    sget-object p0, La/gx60;->R1:La/atz;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, La/gx60;->G0()La/k3t0;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    new-instance v0, La/ax60;

    .line 291
    .line 292
    invoke-direct {v0, p1}, La/ax60;-><init>(La/dn60;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
