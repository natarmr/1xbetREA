.class public final synthetic La/wqp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zqp0;


# direct methods
.method public synthetic constructor <init>(La/zqp0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wqp0;->a:B

    iput-object p1, p0, La/wqp0;->b:La/zqp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/wqp0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/wqp0;->b:La/zqp0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/j1i0;->e:La/j1i0;

    .line 16
    .line 17
    sget-object v1, La/iun;->a:La/iun;

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, La/urp0;->A(La/j1i0;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 26
    .line 27
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v2, La/j1i0;->e:La/j1i0;

    .line 32
    .line 33
    sget-object v3, La/iun;->a:La/iun;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3}, La/urp0;->A(La/j1i0;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object p0, p0, La/urp0;->m:La/i1w0;

    .line 43
    .line 44
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v2, La/c8d;

    .line 49
    .line 50
    sget-object v3, La/y7d;->a:La/v7d;

    .line 51
    .line 52
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 53
    .line 54
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_0
    move-object v1, v0

    .line 62
    check-cast v1, La/paw;

    .line 63
    .line 64
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/oe50;

    .line 75
    .line 76
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 84
    .line 85
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-virtual {p0, v0}, La/urp0;->w(Z)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_2
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 97
    .line 98
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, La/urp0;->a()V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_3
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 109
    .line 110
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget-object v0, La/j1i0;->c:La/j1i0;

    .line 115
    .line 116
    sget-object v1, La/iun;->a:La/iun;

    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, La/urp0;->B(La/j1i0;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, La/hrp0;->a:La/hrp0;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, La/urp0;->D(La/lrp0;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_4
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 130
    .line 131
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0, v1}, La/urp0;->w(Z)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_5
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 142
    .line 143
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    sget-object v0, La/j1i0;->b:La/j1i0;

    .line 148
    .line 149
    sget-object v1, La/iun;->a:La/iun;

    .line 150
    .line 151
    invoke-virtual {p0, v0, v1}, La/urp0;->B(La/j1i0;Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    sget-object v0, La/irp0;->a:La/irp0;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, La/urp0;->D(La/lrp0;)V

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_6
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 163
    .line 164
    new-instance v0, La/vqp0;

    .line 165
    .line 166
    new-instance v1, La/nfj0;

    .line 167
    .line 168
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const/4 v7, 0x0

    .line 173
    const/16 v8, 0x1d

    .line 174
    .line 175
    const/4 v2, 0x2

    .line 176
    const-class v4, La/urp0;

    .line 177
    .line 178
    const-string v5, "onSelectTeam"

    .line 179
    .line 180
    const-string v6, "onSelectTeam(IZ)V"

    .line 181
    .line 182
    invoke-direct/range {v1 .. v8}, La/nfj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 183
    .line 184
    .line 185
    sget-object p0, La/ek5;->h:La/ek5;

    .line 186
    .line 187
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 188
    .line 189
    .line 190
    new-instance p0, La/zgp0;

    .line 191
    .line 192
    const/16 v2, 0x8

    .line 193
    .line 194
    invoke-direct {p0, v2}, La/zgp0;-><init>(B)V

    .line 195
    .line 196
    .line 197
    new-instance v2, La/ttn0;

    .line 198
    .line 199
    const/16 v3, 0x1d

    .line 200
    .line 201
    invoke-direct {v2, v1, v3}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 202
    .line 203
    .line 204
    new-instance v1, La/asj0;

    .line 205
    .line 206
    const/4 v3, 0x3

    .line 207
    const/16 v4, 0x1b

    .line 208
    .line 209
    invoke-direct {v1, v3, v4}, La/asj0;-><init>(IB)V

    .line 210
    .line 211
    .line 212
    sget-object v3, La/pfo0;->f:La/pfo0;

    .line 213
    .line 214
    new-instance v4, La/gbn;

    .line 215
    .line 216
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 220
    .line 221
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_7
    sget-object v0, La/zqp0;->V1:La/y2m0;

    .line 226
    .line 227
    invoke-virtual {p0}, La/zqp0;->H0()La/urp0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    sget-object v0, La/j1i0;->e:La/j1i0;

    .line 232
    .line 233
    sget-object v1, La/iun;->a:La/iun;

    .line 234
    .line 235
    invoke-virtual {p0, v0, v1}, La/urp0;->A(La/j1i0;Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_8
    new-instance v0, La/q0h0;

    .line 242
    .line 243
    iget-object p0, p0, La/zqp0;->M1:La/qwi;

    .line 244
    .line 245
    if-eqz p0, :cond_1

    .line 246
    .line 247
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 248
    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_1
    const-string p0, "viewModelFactory"

    .line 252
    .line 253
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const/4 p0, 0x0

    .line 257
    throw p0

    .line 258
    nop

    .line 259
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
