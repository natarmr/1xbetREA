.class public final La/fq3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kq3;


# direct methods
.method public synthetic constructor <init>(La/kq3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fq3;->i:B

    iput-object p1, p0, La/fq3;->k:La/kq3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/fq3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fq3;->k:La/kq3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/fq3;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/fq3;-><init>(La/kq3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/fq3;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/fq3;-><init>(La/kq3;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fq3;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/fq3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fq3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fq3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fq3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fq3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fq3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/fq3;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/fq3;->k:La/kq3;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v2, La/kq3;->x:La/p7m0;

    .line 14
    .line 15
    sget-object v6, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, p0, La/fq3;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v3, :cond_1

    .line 22
    .line 23
    if-ne v7, v4, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v13, p0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p1, La/yq3;->a:La/yq3;

    .line 46
    .line 47
    invoke-virtual {v0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p1, v2, La/kq3;->q:La/mp3;

    .line 51
    .line 52
    invoke-virtual {p1}, La/mp3;->a()La/dr3;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v1, v2, La/kq3;->o:La/wti;

    .line 57
    .line 58
    iget v8, p1, La/dr3;->b:I

    .line 59
    .line 60
    iput-byte v3, p0, La/fq3;->j:B

    .line 61
    .line 62
    iget-object p1, v1, La/wti;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, La/hsj;

    .line 65
    .line 66
    iget-object v1, v1, La/wti;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, La/gmt;

    .line 69
    .line 70
    invoke-virtual {v1}, La/gmt;->a()La/ql5;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    iget-wide v9, v1, La/ql5;->a:J

    .line 77
    .line 78
    iget-object v1, p1, La/hsj;->a:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v7, v1

    .line 81
    check-cast v7, La/qq3;

    .line 82
    .line 83
    iget-object p1, p1, La/hsj;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, La/y5s;

    .line 86
    .line 87
    iget-object p1, p1, La/y5s;->a:La/s470;

    .line 88
    .line 89
    invoke-virtual {p1}, La/s470;->a()J

    .line 90
    .line 91
    .line 92
    move-result-wide v11

    .line 93
    move-object v13, p0

    .line 94
    invoke-virtual/range {v7 .. v13}, La/qq3;->c(IJJLa/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v6, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    :goto_0
    check-cast p1, La/dr3;

    .line 102
    .line 103
    new-instance p0, La/wq3;

    .line 104
    .line 105
    new-instance v1, La/cr3;

    .line 106
    .line 107
    iget-object v3, v2, La/kq3;->v:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v1, v3, p1}, La/cr3;-><init>(Ljava/lang/String;La/dr3;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, v1}, La/wq3;-><init>(La/cr3;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    iget-object p0, v2, La/kq3;->w:La/p7m0;

    .line 122
    .line 123
    sget-object v0, La/sp3;->e:La/sp3;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    iput-byte v4, v13, La/fq3;->j:B

    .line 132
    .line 133
    invoke-virtual {v2, p1, v13}, La/kq3;->F(La/dr3;La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, v6, :cond_4

    .line 138
    .line 139
    :goto_1
    move-object v5, v6

    .line 140
    goto :goto_3

    .line 141
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_3
    return-object v5

    .line 144
    :cond_5
    new-instance p0, La/ss3;

    .line 145
    .line 146
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :pswitch_0
    move-object v13, p0

    .line 151
    sget-object p0, La/wne;->a:La/wne;

    .line 152
    .line 153
    iget-byte v0, v13, La/fq3;->j:B

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    if-eq v0, v3, :cond_7

    .line 158
    .line 159
    if-ne v0, v4, :cond_6

    .line 160
    .line 161
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    sget-object p1, La/ymx;->b:La/ymx;

    .line 177
    .line 178
    iput-byte v3, v13, La/fq3;->j:B

    .line 179
    .line 180
    const-wide/16 v0, 0x1f4

    .line 181
    .line 182
    invoke-static {v0, v1, v13}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, p0, :cond_9

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    :goto_4
    iget-object p1, v2, La/kq3;->q:La/mp3;

    .line 190
    .line 191
    invoke-virtual {p1}, La/mp3;->a()La/dr3;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget-object v0, v2, La/kq3;->x:La/p7m0;

    .line 196
    .line 197
    new-instance v1, La/wq3;

    .line 198
    .line 199
    new-instance v3, La/cr3;

    .line 200
    .line 201
    iget-object v6, v2, La/kq3;->v:Ljava/lang/String;

    .line 202
    .line 203
    invoke-direct {v3, v6, p1}, La/cr3;-><init>(Ljava/lang/String;La/dr3;)V

    .line 204
    .line 205
    .line 206
    invoke-direct {v1, v3}, La/wq3;-><init>(La/cr3;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    iget-object v0, v2, La/kq3;->w:La/p7m0;

    .line 216
    .line 217
    sget-object v1, La/sp3;->e:La/sp3;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    iput-byte v4, v13, La/fq3;->j:B

    .line 226
    .line 227
    invoke-virtual {v2, p1, v13}, La/kq3;->F(La/dr3;La/zje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-ne p1, p0, :cond_a

    .line 232
    .line 233
    :goto_5
    move-object v5, p0

    .line 234
    goto :goto_7

    .line 235
    :cond_a
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_7
    return-object v5

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
