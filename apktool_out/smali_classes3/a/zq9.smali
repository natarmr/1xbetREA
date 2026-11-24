.class public final synthetic La/zq9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/br9;


# direct methods
.method public synthetic constructor <init>(La/br9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zq9;->a:B

    iput-object p1, p0, La/zq9;->b:La/br9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zq9;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/zq9;->b:La/br9;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/br9;->S1:La/kl5;

    .line 10
    .line 11
    invoke-virtual {p0}, La/br9;->H0()La/mr9;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/mr9;->i:La/ehf0;

    .line 16
    .line 17
    const-string v1, "no"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/ehf0;->p(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/mr9;->l:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    move-object v1, p0

    .line 29
    check-cast v1, La/es9;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x7

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v1 .. v6}, La/es9;->a(La/es9;Ljava/util/List;La/ds9;ZLa/sp9;I)La/es9;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    sget-object v0, La/br9;->S1:La/kl5;

    .line 50
    .line 51
    invoke-virtual {p0}, La/br9;->H0()La/mr9;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object p0, v0, La/mr9;->i:La/ehf0;

    .line 56
    .line 57
    const-string v2, "yes"

    .line 58
    .line 59
    invoke-virtual {p0, v2}, La/ehf0;->p(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, La/mr9;->l:La/p7m0;

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    move-object v3, p0

    .line 69
    check-cast v3, La/es9;

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    const/16 v8, 0xb

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x1

    .line 77
    invoke-static/range {v3 .. v8}, La/es9;->a(La/es9;Ljava/util/List;La/ds9;ZLa/sp9;I)La/es9;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v2, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget-object p0, v0, La/mr9;->e:La/mne;

    .line 92
    .line 93
    iget-object v6, p0, La/mne;->c:La/vs10;

    .line 94
    .line 95
    new-instance v4, La/cr9;

    .line 96
    .line 97
    const/4 p0, 0x1

    .line 98
    invoke-direct {v4, v0, p0}, La/cr9;-><init>(La/mr9;B)V

    .line 99
    .line 100
    .line 101
    new-instance v5, La/dr9;

    .line 102
    .line 103
    invoke-direct {v5, v0, p0}, La/dr9;-><init>(La/mr9;B)V

    .line 104
    .line 105
    .line 106
    new-instance v7, La/fr9;

    .line 107
    .line 108
    const/4 p0, 0x0

    .line 109
    invoke-direct {v7, v0, v1, p0}, La/fr9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 110
    .line 111
    .line 112
    const/16 v8, 0x8

    .line 113
    .line 114
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_1
    sget-object v0, La/br9;->S1:La/kl5;

    .line 121
    .line 122
    new-instance v0, La/cyv;

    .line 123
    .line 124
    new-instance v1, La/li8;

    .line 125
    .line 126
    invoke-virtual {p0}, La/br9;->H0()La/mr9;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/4 v7, 0x0

    .line 131
    const/16 v8, 0x14

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    const-class v4, La/mr9;

    .line 135
    .line 136
    const-string v5, "onDeleteClicked"

    .line 137
    .line 138
    const-string v6, "onDeleteClicked(J)V"

    .line 139
    .line 140
    invoke-direct/range {v1 .. v8}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 144
    .line 145
    .line 146
    new-instance p0, La/s3t;

    .line 147
    .line 148
    const/16 v2, 0x17

    .line 149
    .line 150
    invoke-direct {p0, v2}, La/s3t;-><init>(B)V

    .line 151
    .line 152
    .line 153
    new-instance v3, La/umu;

    .line 154
    .line 155
    const/16 v4, 0x15

    .line 156
    .line 157
    invoke-direct {v3, v4}, La/umu;-><init>(B)V

    .line 158
    .line 159
    .line 160
    new-instance v4, La/pkv;

    .line 161
    .line 162
    const/16 v5, 0x9

    .line 163
    .line 164
    const/4 v6, 0x3

    .line 165
    invoke-direct {v4, v6, v5}, La/pkv;-><init>(IB)V

    .line 166
    .line 167
    .line 168
    sget-object v5, La/btv;->e:La/btv;

    .line 169
    .line 170
    new-instance v7, La/gbn;

    .line 171
    .line 172
    invoke-direct {v7, p0, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 176
    .line 177
    invoke-virtual {p0, v7}, La/dp;->b(La/gbn;)V

    .line 178
    .line 179
    .line 180
    new-instance v3, La/x2w;

    .line 181
    .line 182
    const/4 v4, 0x4

    .line 183
    invoke-direct {v3, v4}, La/x2w;-><init>(B)V

    .line 184
    .line 185
    .line 186
    new-instance v4, La/umu;

    .line 187
    .line 188
    const/16 v5, 0x1d

    .line 189
    .line 190
    invoke-direct {v4, v5}, La/umu;-><init>(B)V

    .line 191
    .line 192
    .line 193
    new-instance v7, La/pkv;

    .line 194
    .line 195
    const/16 v8, 0x10

    .line 196
    .line 197
    invoke-direct {v7, v6, v8}, La/pkv;-><init>(IB)V

    .line 198
    .line 199
    .line 200
    sget-object v8, La/btv;->l:La/btv;

    .line 201
    .line 202
    new-instance v9, La/gbn;

    .line 203
    .line 204
    invoke-direct {v9, v3, v7, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, v9}, La/dp;->b(La/gbn;)V

    .line 208
    .line 209
    .line 210
    new-instance v3, La/s3t;

    .line 211
    .line 212
    invoke-direct {v3, v5}, La/s3t;-><init>(B)V

    .line 213
    .line 214
    .line 215
    new-instance v4, La/t3t;

    .line 216
    .line 217
    invoke-direct {v4, v1, v2}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 218
    .line 219
    .line 220
    new-instance v1, La/pkv;

    .line 221
    .line 222
    const/16 v2, 0xc

    .line 223
    .line 224
    invoke-direct {v1, v6, v2}, La/pkv;-><init>(IB)V

    .line 225
    .line 226
    .line 227
    sget-object v2, La/btv;->h:La/btv;

    .line 228
    .line 229
    new-instance v5, La/gbn;

    .line 230
    .line 231
    invoke-direct {v5, v3, v1, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_2
    iget-object p0, p0, La/br9;->K1:La/fiu0;

    .line 239
    .line 240
    if-eqz p0, :cond_2

    .line 241
    .line 242
    return-object p0

    .line 243
    :cond_2
    const-string p0, "viewModelFactory"

    .line 244
    .line 245
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v1

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
