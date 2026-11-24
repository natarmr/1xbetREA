.class public final La/w82;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/f3d;

.field public final synthetic l:La/l7m0;

.field public final synthetic m:La/qno0;


# direct methods
.method public synthetic constructor <init>(La/f3d;La/l7m0;La/qno0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/w82;->i:B

    iput-object p1, p0, La/w82;->k:La/f3d;

    iput-object p2, p0, La/w82;->l:La/l7m0;

    iput-object p3, p0, La/w82;->m:La/qno0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/w82;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/w82;

    .line 7
    .line 8
    iget-object v3, p0, La/w82;->m:La/qno0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/w82;->k:La/f3d;

    .line 12
    .line 13
    iget-object v2, p0, La/w82;->l:La/l7m0;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/w82;-><init>(La/f3d;La/l7m0;La/qno0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, La/w82;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, La/w82;->m:La/qno0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, La/w82;->k:La/f3d;

    .line 28
    .line 29
    iget-object v3, p0, La/w82;->l:La/l7m0;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, La/w82;-><init>(La/f3d;La/l7m0;La/qno0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/w82;->i:B

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
    invoke-virtual {p0, p1, p2}, La/w82;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w82;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/w82;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/w82;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/w82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/w82;->i:B

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    iget-object v4, p0, La/w82;->m:La/qno0;

    .line 8
    .line 9
    iget-object v5, p0, La/w82;->l:La/l7m0;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-object v7, p0, La/w82;->k:La/f3d;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v11, p0, La/w82;->j:Z

    .line 24
    .line 25
    if-eqz v11, :cond_1

    .line 26
    .line 27
    if-ne v11, v10, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, La/s82;

    .line 41
    .line 42
    const/4 v6, 0x7

    .line 43
    invoke-direct {p1, v7, v6}, La/s82;-><init>(La/f3d;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v8, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v6, La/f7f0;

    .line 51
    .line 52
    const/16 v11, 0x13

    .line 53
    .line 54
    invoke-direct {v6, v5, v11}, La/f7f0;-><init>(La/l7m0;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v8, v6}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance v6, La/v82;

    .line 62
    .line 63
    invoke-direct {v6, v8, v4, v10}, La/v82;-><init>(La/yje;La/qno0;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, La/i120;->W(La/gmq;)La/gmq;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v5, La/t82;

    .line 75
    .line 76
    const/4 v6, 0x5

    .line 77
    invoke-direct {v5, v3, v8, v6}, La/t82;-><init>(ILa/yje;B)V

    .line 78
    .line 79
    .line 80
    new-instance v3, La/u82;

    .line 81
    .line 82
    invoke-direct {v3, v7, v10}, La/u82;-><init>(La/f3d;B)V

    .line 83
    .line 84
    .line 85
    iput-boolean v10, p0, La/w82;->j:Z

    .line 86
    .line 87
    new-array v2, v2, [La/gmq;

    .line 88
    .line 89
    aput-object p1, v2, v9

    .line 90
    .line 91
    aput-object v4, v2, v10

    .line 92
    .line 93
    sget-object p1, La/pul;->j:La/pul;

    .line 94
    .line 95
    new-instance v4, La/kh1;

    .line 96
    .line 97
    invoke-direct {v4, v5, v8, v1}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v3, v4, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget-object p1, La/wne;->a:La/wne;

    .line 105
    .line 106
    if-ne p0, p1, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_0
    if-ne p0, v0, :cond_3

    .line 112
    .line 113
    move-object v8, v0

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    :goto_1
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_2
    return-object v8

    .line 118
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 119
    .line 120
    iget-boolean v11, p0, La/w82;->j:Z

    .line 121
    .line 122
    if-eqz v11, :cond_5

    .line 123
    .line 124
    if-ne v11, v10, :cond_4

    .line 125
    .line 126
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance p1, La/s82;

    .line 138
    .line 139
    invoke-direct {p1, v7, v9}, La/s82;-><init>(La/f3d;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v8, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v6, La/jb;

    .line 147
    .line 148
    const/16 v11, 0x11

    .line 149
    .line 150
    invoke-direct {v6, v5, v11}, La/jb;-><init>(La/l7m0;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v8, v6}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v6, La/v82;

    .line 158
    .line 159
    invoke-direct {v6, v8, v4, v9}, La/v82;-><init>(La/yje;La/qno0;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v4}, La/i120;->W(La/gmq;)La/gmq;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    new-instance v5, La/t82;

    .line 171
    .line 172
    invoke-direct {v5, v3, v8, v9}, La/t82;-><init>(ILa/yje;B)V

    .line 173
    .line 174
    .line 175
    new-instance v3, La/u82;

    .line 176
    .line 177
    invoke-direct {v3, v7, v9}, La/u82;-><init>(La/f3d;B)V

    .line 178
    .line 179
    .line 180
    iput-boolean v10, p0, La/w82;->j:Z

    .line 181
    .line 182
    new-array v2, v2, [La/gmq;

    .line 183
    .line 184
    aput-object p1, v2, v9

    .line 185
    .line 186
    aput-object v4, v2, v10

    .line 187
    .line 188
    sget-object p1, La/pul;->j:La/pul;

    .line 189
    .line 190
    new-instance v4, La/kh1;

    .line 191
    .line 192
    invoke-direct {v4, v5, v8, v1}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {p0, v3, v4, p1, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    sget-object p1, La/wne;->a:La/wne;

    .line 200
    .line 201
    if-ne p0, p1, :cond_6

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    :goto_3
    if-ne p0, v0, :cond_7

    .line 207
    .line 208
    move-object v8, v0

    .line 209
    goto :goto_5

    .line 210
    :cond_7
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_5
    return-object v8

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
