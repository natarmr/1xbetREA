.class public final La/snu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/wdu;

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/yje;La/wdu;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/snu;->i:B

    iput-object p2, p0, La/snu;->m:La/wdu;

    iput-boolean p3, p0, La/snu;->n:Z

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/snu;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/snu;->n:Z

    .line 4
    .line 5
    iget-object p0, p0, La/snu;->m:La/wdu;

    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/snu;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, p3, p0, v1, v2}, La/snu;-><init>(La/yje;La/wdu;ZB)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/snu;->k:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/snu;->l:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/snu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/snu;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, p3, p0, v1, v2}, La/snu;-><init>(La/yje;La/wdu;ZB)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/snu;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/snu;->l:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/snu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/snu;->i:B

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x11

    .line 7
    .line 8
    iget-boolean v4, p0, La/snu;->n:Z

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    iget-object v6, p0, La/snu;->m:La/wdu;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v6, La/wdu;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/ort;

    .line 23
    .line 24
    iget-object v10, p0, La/snu;->k:La/kmq;

    .line 25
    .line 26
    iget-object v11, p0, La/snu;->l:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v12, La/wne;->a:La/wne;

    .line 29
    .line 30
    iget-boolean v13, p0, La/snu;->j:Z

    .line 31
    .line 32
    if-eqz v13, :cond_1

    .line 33
    .line 34
    if-ne v13, v9, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v11, Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v0}, La/ort;->a()La/p7m0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v5, La/a1t;

    .line 54
    .line 55
    invoke-direct {v5, p1, v3}, La/a1t;-><init>(La/gmq;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v3, La/vnu;

    .line 63
    .line 64
    invoke-direct {v3, v8, v6, v4}, La/vnu;-><init>(La/yje;La/wdu;Z)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0}, La/ort;->a()La/p7m0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v3, La/tnu;

    .line 76
    .line 77
    invoke-direct {v3, v11, v8, v9}, La/tnu;-><init>(Ljava/util/List;La/yje;B)V

    .line 78
    .line 79
    .line 80
    iput-object v8, p0, La/snu;->k:La/kmq;

    .line 81
    .line 82
    iput-object v8, p0, La/snu;->l:Ljava/lang/Object;

    .line 83
    .line 84
    iput-boolean v9, p0, La/snu;->j:Z

    .line 85
    .line 86
    invoke-static {v10}, La/f7k;->J(La/kmq;)V

    .line 87
    .line 88
    .line 89
    new-array v2, v2, [La/gmq;

    .line 90
    .line 91
    aput-object p1, v2, v7

    .line 92
    .line 93
    aput-object v0, v2, v9

    .line 94
    .line 95
    sget-object p1, La/pul;->j:La/pul;

    .line 96
    .line 97
    new-instance v0, La/kh1;

    .line 98
    .line 99
    invoke-direct {v0, v3, v8, v1}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v10, v0, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    sget-object p1, La/wne;->a:La/wne;

    .line 107
    .line 108
    if-ne p0, p1, :cond_2

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    :goto_0
    sget-object p1, La/wne;->a:La/wne;

    .line 114
    .line 115
    if-ne p0, p1, :cond_3

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_1
    if-ne p0, v12, :cond_4

    .line 121
    .line 122
    move-object v8, v12

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_3
    return-object v8

    .line 127
    :pswitch_0
    iget-object v0, v6, La/wdu;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/ort;

    .line 130
    .line 131
    iget-object v10, p0, La/snu;->k:La/kmq;

    .line 132
    .line 133
    iget-object v11, p0, La/snu;->l:Ljava/lang/Object;

    .line 134
    .line 135
    sget-object v12, La/wne;->a:La/wne;

    .line 136
    .line 137
    iget-boolean v13, p0, La/snu;->j:Z

    .line 138
    .line 139
    if-eqz v13, :cond_6

    .line 140
    .line 141
    if-ne v13, v9, :cond_5

    .line 142
    .line 143
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    check-cast v11, Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {v0}, La/ort;->a()La/p7m0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    new-instance v5, La/a1t;

    .line 161
    .line 162
    invoke-direct {v5, p1, v3}, La/a1t;-><init>(La/gmq;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance v3, La/vnu;

    .line 170
    .line 171
    invoke-direct {v3, v8, v6, v4}, La/vnu;-><init>(La/yje;La/wdu;Z)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {v0}, La/ort;->a()La/p7m0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v3, La/tnu;

    .line 183
    .line 184
    invoke-direct {v3, v11, v8, v7}, La/tnu;-><init>(Ljava/util/List;La/yje;B)V

    .line 185
    .line 186
    .line 187
    iput-object v8, p0, La/snu;->k:La/kmq;

    .line 188
    .line 189
    iput-object v8, p0, La/snu;->l:Ljava/lang/Object;

    .line 190
    .line 191
    iput-boolean v9, p0, La/snu;->j:Z

    .line 192
    .line 193
    invoke-static {v10}, La/f7k;->J(La/kmq;)V

    .line 194
    .line 195
    .line 196
    new-array v2, v2, [La/gmq;

    .line 197
    .line 198
    aput-object p1, v2, v7

    .line 199
    .line 200
    aput-object v0, v2, v9

    .line 201
    .line 202
    sget-object p1, La/pul;->j:La/pul;

    .line 203
    .line 204
    new-instance v0, La/kh1;

    .line 205
    .line 206
    invoke-direct {v0, v3, v8, v1}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {p0, v10, v0, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    sget-object p1, La/wne;->a:La/wne;

    .line 214
    .line 215
    if-ne p0, p1, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_4
    sget-object p1, La/wne;->a:La/wne;

    .line 221
    .line 222
    if-ne p0, p1, :cond_8

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_5
    if-ne p0, v12, :cond_9

    .line 228
    .line 229
    move-object v8, v12

    .line 230
    goto :goto_7

    .line 231
    :cond_9
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    :goto_7
    return-object v8

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
