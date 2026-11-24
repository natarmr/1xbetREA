.class public final La/sgn0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

.field public final p:La/tmt;

.field public final q:La/ywu;

.field public final r:La/mii0;

.field public final s:La/x20;

.field public final t:La/ctf0;

.field public final u:La/duj;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;La/tmt;La/ywu;La/mii0;La/x20;La/ctf0;La/duj;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/a7n0;

    .line 8
    .line 9
    const/16 p1, 0xf

    .line 10
    .line 11
    invoke-direct {v2, p1}, La/a7n0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/rgn0;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v3, p1}, La/rgn0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p9, La/mne;->a:La/rwj;

    .line 21
    .line 22
    iget-object p9, p9, La/mne;->b:La/dvj;

    .line 23
    .line 24
    invoke-static {p1, p9}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, v0, La/sgn0;->o:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 35
    .line 36
    iput-object p3, v0, La/sgn0;->p:La/tmt;

    .line 37
    .line 38
    iput-object p4, v0, La/sgn0;->q:La/ywu;

    .line 39
    .line 40
    iput-object p5, v0, La/sgn0;->r:La/mii0;

    .line 41
    .line 42
    iput-object p6, v0, La/sgn0;->s:La/x20;

    .line 43
    .line 44
    iput-object p7, v0, La/sgn0;->t:La/ctf0;

    .line 45
    .line 46
    iput-object p8, v0, La/sgn0;->u:La/duj;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 13

    .line 1
    check-cast p1, La/ufn0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/sfn0;->a:La/sfn0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "option"

    .line 17
    .line 18
    const-string v3, "bet_placed_success_click"

    .line 19
    .line 20
    iget-object v4, p0, La/sgn0;->s:La/x20;

    .line 21
    .line 22
    iget-object v5, p0, La/sgn0;->r:La/mii0;

    .line 23
    .line 24
    if-eqz v0, :cond_8

    .line 25
    .line 26
    iget-object p1, v5, La/mii0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, La/kt2;

    .line 29
    .line 30
    const-string v0, "history"

    .line 31
    .line 32
    invoke-static {v2, v0, p1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, La/zm7;->b:La/zm7;

    .line 36
    .line 37
    invoke-virtual {v4, p1}, La/x20;->i(La/zm7;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/sgn0;->o:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 41
    .line 42
    iget-object v0, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object p1, p1, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    :goto_0
    iget-object p0, p0, La/sgn0;->q:La/ywu;

    .line 56
    .line 57
    iget-object p1, p0, La/ywu;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, La/onv;

    .line 60
    .line 61
    iget-object p1, p1, La/onv;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/daf;

    .line 64
    .line 65
    invoke-virtual {p1}, La/daf;->f()La/c5k;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, La/c5k;->q()V

    .line 70
    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const v6, -0x42b46a0a

    .line 80
    .line 81
    .line 82
    if-eq v5, v6, :cond_5

    .line 83
    .line 84
    const v6, 0x1ed5af

    .line 85
    .line 86
    .line 87
    if-eq v5, v6, :cond_3

    .line 88
    .line 89
    const v6, 0x276236

    .line 90
    .line 91
    .line 92
    if-eq v5, v6, :cond_1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const-string v5, "TOTO"

    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    sget-object v0, La/s77;->b:La/bj5;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const-string v1, "AUTO"

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    sget-object v0, La/s77;->b:La/bj5;

    .line 117
    .line 118
    const/4 v1, 0x2

    .line 119
    goto :goto_2

    .line 120
    :cond_5
    const-string v1, "JACKPOT"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    sget-object v0, La/s77;->b:La/bj5;

    .line 130
    .line 131
    const/4 v1, 0x6

    .line 132
    goto :goto_2

    .line 133
    :cond_7
    :goto_1
    sget-object v0, La/s77;->b:La/bj5;

    .line 134
    .line 135
    move v1, v4

    .line 136
    :goto_2
    invoke-virtual {p1}, La/daf;->Y()La/lfu;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v0, v0, La/lfu;->a:La/mii0;

    .line 141
    .line 142
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, La/t47;

    .line 145
    .line 146
    iput v1, v0, La/t47;->c:I

    .line 147
    .line 148
    invoke-virtual {p1}, La/daf;->X()La/hpi0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v0, v0, La/hpi0;->a:La/mii0;

    .line 153
    .line 154
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, La/t47;

    .line 157
    .line 158
    iput-wide v2, v0, La/t47;->d:J

    .line 159
    .line 160
    invoke-virtual {p1}, La/daf;->g()La/xex;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget-object v0, La/f8w;->a:La/f8w;

    .line 165
    .line 166
    invoke-virtual {p1}, La/xex;->J()V

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, La/ywu;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p0, La/ouu;

    .line 172
    .line 173
    new-instance v5, La/za50;

    .line 174
    .line 175
    const-wide/16 v10, 0x0

    .line 176
    .line 177
    const/4 v7, 0x7

    .line 178
    const/4 v6, 0x0

    .line 179
    const-wide/16 v8, 0x0

    .line 180
    .line 181
    invoke-direct/range {v5 .. v11}, La/za50;-><init>(IIJJ)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v5, v4}, La/ouu;->q(La/cb50;Z)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    sget-object v0, La/rfn0;->a:La/rfn0;

    .line 189
    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    const-string v6, "continue"

    .line 195
    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    iget-object p0, v5, La/mii0;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p0, La/kt2;

    .line 201
    .line 202
    invoke-static {v2, v6, p0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, La/zm7;->c:La/zm7;

    .line 206
    .line 207
    invoke-virtual {v4, p0}, La/x20;->i(La/zm7;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_9
    sget-object v0, La/tfn0;->a:La/tfn0;

    .line 212
    .line 213
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    iget-object p1, v5, La/mii0;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p1, La/kt2;

    .line 222
    .line 223
    const-string v0, "share"

    .line 224
    .line 225
    invoke-static {v2, v0, p1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    sget-object p1, La/zm7;->d:La/zm7;

    .line 229
    .line 230
    invoke-virtual {v4, p1}, La/x20;->i(La/zm7;)V

    .line 231
    .line 232
    .line 233
    new-instance v5, La/ndn0;

    .line 234
    .line 235
    const/4 v11, 0x0

    .line 236
    const/16 v12, 0x8

    .line 237
    .line 238
    const/4 v6, 0x1

    .line 239
    const-class v8, La/sgn0;

    .line 240
    .line 241
    const-string v9, "processSaveBetError"

    .line 242
    .line 243
    const-string v10, "processSaveBetError(Ljava/lang/Throwable;)V"

    .line 244
    .line 245
    move-object v7, p0

    .line 246
    invoke-direct/range {v5 .. v12}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 247
    .line 248
    .line 249
    new-instance p0, La/hhb0;

    .line 250
    .line 251
    const/16 p1, 0x12

    .line 252
    .line 253
    const/4 v0, 0x0

    .line 254
    invoke-direct {p0, v7, v0, p1}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {v7, v0, v5, p0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_a
    move-object v7, p0

    .line 262
    sget-object p0, La/pfn0;->a:La/pfn0;

    .line 263
    .line 264
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    if-eqz p0, :cond_b

    .line 269
    .line 270
    iget-object p0, v5, La/mii0;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p0, La/kt2;

    .line 273
    .line 274
    invoke-static {v2, v6, p0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sget-object p0, La/zm7;->c:La/zm7;

    .line 278
    .line 279
    invoke-virtual {v4, p0}, La/x20;->i(La/zm7;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_b
    sget-object p0, La/qfn0;->a:La/qfn0;

    .line 284
    .line 285
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    if-eqz p0, :cond_c

    .line 290
    .line 291
    invoke-virtual {v7}, La/i3t0;->E()V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 296
    .line 297
    .line 298
    return-void
.end method
