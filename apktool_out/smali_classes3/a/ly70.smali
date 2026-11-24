.class public final La/ly70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/gz70;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/gz70;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ly70;->i:B

    iput-object p3, p0, La/ly70;->m:La/gz70;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ly70;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/ly70;

    .line 11
    .line 12
    iget-object p0, p0, La/ly70;->m:La/gz70;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p3, p0}, La/ly70;-><init>(BLa/yje;La/gz70;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/ly70;->k:La/kmq;

    .line 19
    .line 20
    iput-object p2, v0, La/ly70;->l:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/ly70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/ly70;

    .line 30
    .line 31
    iget-object p0, p0, La/ly70;->m:La/gz70;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1, p3, p0}, La/ly70;-><init>(BLa/yje;La/gz70;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/ly70;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/ly70;->l:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/ly70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/ly70;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    iget-object v3, p0, La/ly70;->m:La/gz70;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v8, p0, La/ly70;->j:Z

    .line 19
    .line 20
    if-eqz v8, :cond_1

    .line 21
    .line 22
    if-ne v8, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, La/ly70;->k:La/kmq;

    .line 36
    .line 37
    iget-object v4, p0, La/ly70;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    sget-object v8, La/gz70;->D:La/c4m0;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v8, La/fot;

    .line 51
    .line 52
    invoke-direct {v8, v5, v6, v2}, La/fot;-><init>(ILa/yje;B)V

    .line 53
    .line 54
    .line 55
    new-instance v2, La/vsg0;

    .line 56
    .line 57
    invoke-direct {v2, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 58
    .line 59
    .line 60
    new-instance v8, La/iy70;

    .line 61
    .line 62
    invoke-direct {v8, v5, v6, v3}, La/iy70;-><init>(BLa/yje;La/gz70;)V

    .line 63
    .line 64
    .line 65
    new-instance v9, La/vsg0;

    .line 66
    .line 67
    invoke-direct {v9, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    new-instance v8, La/ys8;

    .line 71
    .line 72
    const/16 v10, 0x1a

    .line 73
    .line 74
    invoke-direct {v8, v4, v3, v6, v10}, La/ys8;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    new-instance v3, La/vsg0;

    .line 78
    .line 79
    invoke-direct {v3, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 80
    .line 81
    .line 82
    new-array v1, v1, [La/gmq;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    aput-object v2, v1, v8

    .line 86
    .line 87
    aput-object v9, v1, v7

    .line 88
    .line 89
    aput-object v3, v1, v5

    .line 90
    .line 91
    invoke-static {v1}, La/aoq;->b([La/gmq;)La/ltb;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, La/tst;

    .line 96
    .line 97
    invoke-direct {v2, v1, v4, v7}, La/tst;-><init>(La/gmq;ZB)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, La/i120;->W(La/gmq;)La/gmq;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v6, p0, La/ly70;->k:La/kmq;

    .line 105
    .line 106
    iput-object v6, p0, La/ly70;->l:Ljava/lang/Object;

    .line 107
    .line 108
    iput-boolean v7, p0, La/ly70;->j:Z

    .line 109
    .line 110
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v0, :cond_2

    .line 115
    .line 116
    move-object v6, v0

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_1
    return-object v6

    .line 121
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 122
    .line 123
    iget-boolean v8, p0, La/ly70;->j:Z

    .line 124
    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    if-ne v8, v7, :cond_3

    .line 128
    .line 129
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, La/ly70;->k:La/kmq;

    .line 141
    .line 142
    iget-object v4, p0, La/ly70;->l:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v4, Lkotlin/Unit;

    .line 145
    .line 146
    sget-object v4, La/gz70;->D:La/c4m0;

    .line 147
    .line 148
    iget-object v4, v3, La/gz70;->b:La/qv;

    .line 149
    .line 150
    iget-object v4, v4, La/qv;->a:La/g45;

    .line 151
    .line 152
    iget-object v4, v4, La/g45;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v4, La/vae;

    .line 155
    .line 156
    iget-object v4, v4, La/vae;->r:La/p7m0;

    .line 157
    .line 158
    new-instance v8, La/er60;

    .line 159
    .line 160
    invoke-direct {v8, v3, v6, v2}, La/er60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 161
    .line 162
    .line 163
    new-instance v2, La/vsg0;

    .line 164
    .line 165
    invoke-direct {v2, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    new-instance v8, La/y0g;

    .line 169
    .line 170
    const/16 v9, 0x9

    .line 171
    .line 172
    invoke-direct {v8, v1, v6, v9}, La/y0g;-><init>(ILa/yje;B)V

    .line 173
    .line 174
    .line 175
    new-instance v1, La/p6d;

    .line 176
    .line 177
    invoke-direct {v1, v4, v2, v8, v7}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 178
    .line 179
    .line 180
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    new-instance v2, La/my70;

    .line 185
    .line 186
    invoke-direct {v2, v7, v6, v3}, La/my70;-><init>(BLa/yje;La/gz70;)V

    .line 187
    .line 188
    .line 189
    iput-object v6, p0, La/ly70;->k:La/kmq;

    .line 190
    .line 191
    iput-object v6, p0, La/ly70;->l:Ljava/lang/Object;

    .line 192
    .line 193
    iput-boolean v7, p0, La/ly70;->j:Z

    .line 194
    .line 195
    invoke-static {p1}, La/f7k;->J(La/kmq;)V

    .line 196
    .line 197
    .line 198
    new-instance v3, La/vnq;

    .line 199
    .line 200
    invoke-direct {v3, p1, v2, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v1, v3, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    if-ne p0, v0, :cond_5

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_2
    if-ne p0, v0, :cond_6

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    :goto_3
    if-ne p0, v0, :cond_7

    .line 218
    .line 219
    move-object v6, v0

    .line 220
    goto :goto_5

    .line 221
    :cond_7
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_5
    return-object v6

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
