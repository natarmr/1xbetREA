.class public final synthetic La/czv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/izv;


# direct methods
.method public synthetic constructor <init>(La/izv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/czv;->a:B

    iput-object p1, p0, La/czv;->b:La/izv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/czv;->a:B

    .line 2
    .line 3
    const-string v1, "bet_history_details"

    .line 4
    .line 5
    iget-object p0, p0, La/czv;->b:La/izv;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/izv;->d2:La/rqt;

    .line 11
    .line 12
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, La/jzv;->e:La/q5w;

    .line 17
    .line 18
    iget-object v0, p0, La/q5w;->q:La/upt;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, La/upt;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/q5w;->r:La/k9u;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/k9u;->a(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/q5w;->x()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    sget-object v0, La/izv;->d2:La/rqt;

    .line 36
    .line 37
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object p0, p0, La/jzv;->e:La/q5w;

    .line 42
    .line 43
    iget-object p0, p0, La/q5w;->A:La/nhf0;

    .line 44
    .line 45
    iget-object v0, p0, La/nhf0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/b4j;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, La/b4j;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/nhf0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/au0;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, La/au0;->m(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    sget-object v0, La/izv;->d2:La/rqt;

    .line 63
    .line 64
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, La/jzv;->e:La/q5w;

    .line 69
    .line 70
    iget-object v0, v0, La/q5w;->A:La/nhf0;

    .line 71
    .line 72
    iget-object v2, v0, La/nhf0;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, La/b4j;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, La/b4j;->p(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/au0;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/au0;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/izv;->a2:La/ywq;

    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_2
    sget-object v0, La/izv;->d2:La/rqt;

    .line 95
    .line 96
    new-instance v0, La/ma7;

    .line 97
    .line 98
    new-instance v1, La/ezv;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    invoke-direct {v1, p0, v2}, La/ezv;-><init>(La/izv;B)V

    .line 102
    .line 103
    .line 104
    new-instance v3, La/vft;

    .line 105
    .line 106
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const/4 v9, 0x0

    .line 111
    const/16 v10, 0x12

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    const-class v6, La/jzv;

    .line 115
    .line 116
    const-string v7, "onAlternativeInfoClick"

    .line 117
    .line 118
    const-string v8, "onAlternativeInfoClick(J)V"

    .line 119
    .line 120
    invoke-direct/range {v3 .. v10}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v0}, La/i26;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, La/dp;

    .line 129
    .line 130
    sget-object v2, La/oa7;->a:Ljava/util/List;

    .line 131
    .line 132
    new-instance v2, La/i87;

    .line 133
    .line 134
    const/4 v4, 0x3

    .line 135
    invoke-direct {v2, v4}, La/i87;-><init>(B)V

    .line 136
    .line 137
    .line 138
    new-instance v5, La/qo5;

    .line 139
    .line 140
    const/16 v6, 0x19

    .line 141
    .line 142
    invoke-direct {v5, v1, v3, v6}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 143
    .line 144
    .line 145
    new-instance v1, La/lq4;

    .line 146
    .line 147
    const/16 v3, 0xa

    .line 148
    .line 149
    invoke-direct {v1, v4, v3}, La/lq4;-><init>(IB)V

    .line 150
    .line 151
    .line 152
    sget-object v3, La/zx3;->t:La/zx3;

    .line 153
    .line 154
    new-instance v4, La/gbn;

    .line 155
    .line 156
    invoke-direct {v4, v2, v1, v5, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_3
    new-instance v0, La/q0h0;

    .line 164
    .line 165
    iget-object p0, p0, La/izv;->U1:La/nii;

    .line 166
    .line 167
    if-eqz p0, :cond_0

    .line 168
    .line 169
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :cond_0
    const-string p0, "viewModelFactory"

    .line 174
    .line 175
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 p0, 0x0

    .line 179
    throw p0

    .line 180
    :pswitch_4
    sget-object v0, La/izv;->d2:La/rqt;

    .line 181
    .line 182
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    iget-object p0, p0, La/jzv;->d:La/z4w;

    .line 187
    .line 188
    invoke-virtual {p0}, La/z4w;->B()V

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_5
    sget-object v0, La/izv;->d2:La/rqt;

    .line 195
    .line 196
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    iget-object p0, p0, La/jzv;->d:La/z4w;

    .line 201
    .line 202
    invoke-virtual {p0}, La/z4w;->y()V

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_6
    sget-object v0, La/izv;->d2:La/rqt;

    .line 209
    .line 210
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iget-object v0, v0, La/jzv;->c:La/r2w;

    .line 215
    .line 216
    iget-object v0, v0, La/r2w;->y:La/p7m0;

    .line 217
    .line 218
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move-object v2, v1

    .line 223
    check-cast v2, La/d3w;

    .line 224
    .line 225
    const/4 v9, 0x0

    .line 226
    const/16 v10, 0xef

    .line 227
    .line 228
    const/4 v3, 0x0

    .line 229
    const/4 v4, 0x0

    .line 230
    const/4 v5, 0x0

    .line 231
    const/4 v6, 0x0

    .line 232
    const-wide/16 v7, 0x0

    .line 233
    .line 234
    invoke-static/range {v2 .. v10}, La/d3w;->a(La/d3w;La/n3w;Ljava/util/List;ZZJZI)La/d3w;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_1

    .line 243
    .line 244
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    iget-object p0, p0, La/jzv;->e:La/q5w;

    .line 249
    .line 250
    invoke-virtual {p0}, La/q5w;->x()V

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_7
    sget-object v0, La/izv;->d2:La/rqt;

    .line 257
    .line 258
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0}, La/jzv;->w()V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_8
    sget-object v0, La/izv;->d2:La/rqt;

    .line 269
    .line 270
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {p0}, La/izv;->H0()J

    .line 275
    .line 276
    .line 277
    move-result-wide v1

    .line 278
    iget-object p0, v0, La/jzv;->d:La/z4w;

    .line 279
    .line 280
    invoke-virtual {p0, v1, v2}, La/z4w;->x(J)V

    .line 281
    .line 282
    .line 283
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object p0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
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
