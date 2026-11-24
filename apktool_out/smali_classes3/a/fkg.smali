.class public final La/fkg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/xcz;

.field public final synthetic m:La/rdo0;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/rdo0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/fkg;->i:B

    iput-object p1, p0, La/fkg;->l:La/xcz;

    iput-object p2, p0, La/fkg;->m:La/rdo0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/fkg;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/fkg;

    .line 7
    .line 8
    iget-object v1, p0, La/fkg;->m:La/rdo0;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    iget-object p0, p0, La/fkg;->l:La/xcz;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/fkg;-><init>(La/xcz;La/rdo0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/fkg;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/fkg;

    .line 20
    .line 21
    iget-object v1, p0, La/fkg;->m:La/rdo0;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    iget-object p0, p0, La/fkg;->l:La/xcz;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2, v2}, La/fkg;-><init>(La/xcz;La/rdo0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/fkg;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La/fkg;

    .line 33
    .line 34
    iget-object v1, p0, La/fkg;->m:La/rdo0;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    iget-object p0, p0, La/fkg;->l:La/xcz;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1, p2, v2}, La/fkg;-><init>(La/xcz;La/rdo0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, La/fkg;->k:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_2
    new-instance v0, La/fkg;

    .line 46
    .line 47
    iget-object v1, p0, La/fkg;->m:La/rdo0;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    iget-object p0, p0, La/fkg;->l:La/xcz;

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, p2, v2}, La/fkg;-><init>(La/xcz;La/rdo0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, La/fkg;->k:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fkg;->i:B

    .line 2
    .line 3
    check-cast p1, La/slb0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/fkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fkg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fkg;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/fkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/fkg;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/fkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/fkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/fkg;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/fkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/fkg;->i:B

    .line 2
    .line 3
    sget-object v1, La/xlb0;->a:La/xlb0;

    .line 4
    .line 5
    iget-object v2, p0, La/fkg;->m:La/rdo0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, p0, La/fkg;->l:La/xcz;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/fkg;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/slb0;

    .line 20
    .line 21
    sget-object v8, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v9, p0, La/fkg;->j:Z

    .line 24
    .line 25
    if-eqz v9, :cond_1

    .line 26
    .line 27
    if-ne v9, v4, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {v5}, La/xcz;->c()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput-object v7, p0, La/fkg;->k:Ljava/lang/Object;

    .line 52
    .line 53
    iput-boolean v4, p0, La/fkg;->j:Z

    .line 54
    .line 55
    invoke-virtual {v5, v6, v6, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v8, :cond_4

    .line 60
    .line 61
    move-object v7, v8

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    if-eqz v2, :cond_4

    .line 64
    .line 65
    iget-object p0, v2, La/rdo0;->a:La/bco0;

    .line 66
    .line 67
    invoke-interface {p0, v1}, La/bco0;->a(La/mbo0;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_1
    return-object v7

    .line 73
    :pswitch_0
    iget-object v0, p0, La/fkg;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/slb0;

    .line 76
    .line 77
    sget-object v1, La/wne;->a:La/wne;

    .line 78
    .line 79
    iget-boolean v8, p0, La/fkg;->j:Z

    .line 80
    .line 81
    if-eqz v8, :cond_6

    .line 82
    .line 83
    if-ne v8, v4, :cond_5

    .line 84
    .line 85
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-nez v0, :cond_7

    .line 97
    .line 98
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    invoke-virtual {v5}, La/xcz;->c()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_8

    .line 106
    .line 107
    iput-object v7, p0, La/fkg;->k:Ljava/lang/Object;

    .line 108
    .line 109
    iput-boolean v4, p0, La/fkg;->j:Z

    .line 110
    .line 111
    invoke-virtual {v5, v6, v6, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v1, :cond_9

    .line 116
    .line 117
    move-object v7, v1

    .line 118
    goto :goto_3

    .line 119
    :cond_8
    if-eqz v2, :cond_9

    .line 120
    .line 121
    invoke-virtual {v2}, La/rdo0;->b()V

    .line 122
    .line 123
    .line 124
    :cond_9
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_3
    return-object v7

    .line 127
    :pswitch_1
    iget-object v0, p0, La/fkg;->k:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/slb0;

    .line 130
    .line 131
    sget-object v1, La/wne;->a:La/wne;

    .line 132
    .line 133
    iget-boolean v8, p0, La/fkg;->j:Z

    .line 134
    .line 135
    if-eqz v8, :cond_b

    .line 136
    .line 137
    if-ne v8, v4, :cond_a

    .line 138
    .line 139
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    if-nez v0, :cond_c

    .line 151
    .line 152
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_c
    invoke-virtual {v5}, La/xcz;->c()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_d

    .line 160
    .line 161
    iput-object v7, p0, La/fkg;->k:Ljava/lang/Object;

    .line 162
    .line 163
    iput-boolean v4, p0, La/fkg;->j:Z

    .line 164
    .line 165
    invoke-virtual {v5, v6, v6, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v1, :cond_e

    .line 170
    .line 171
    move-object v7, v1

    .line 172
    goto :goto_5

    .line 173
    :cond_d
    if-eqz v2, :cond_e

    .line 174
    .line 175
    invoke-virtual {v2}, La/rdo0;->b()V

    .line 176
    .line 177
    .line 178
    :cond_e
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    :goto_5
    return-object v7

    .line 181
    :pswitch_2
    iget-object v0, p0, La/fkg;->k:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, La/slb0;

    .line 184
    .line 185
    sget-object v8, La/wne;->a:La/wne;

    .line 186
    .line 187
    iget-boolean v9, p0, La/fkg;->j:Z

    .line 188
    .line 189
    if-eqz v9, :cond_10

    .line 190
    .line 191
    if-ne v9, v4, :cond_f

    .line 192
    .line 193
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    if-nez v0, :cond_11

    .line 205
    .line 206
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_11
    invoke-virtual {v5}, La/xcz;->c()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_12

    .line 214
    .line 215
    iput-object v7, p0, La/fkg;->k:Ljava/lang/Object;

    .line 216
    .line 217
    iput-boolean v4, p0, La/fkg;->j:Z

    .line 218
    .line 219
    invoke-virtual {v5, v6, v6, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    if-ne p0, v8, :cond_13

    .line 224
    .line 225
    move-object v7, v8

    .line 226
    goto :goto_7

    .line 227
    :cond_12
    if-eqz v2, :cond_13

    .line 228
    .line 229
    iget-object p0, v2, La/rdo0;->a:La/bco0;

    .line 230
    .line 231
    invoke-interface {p0, v1}, La/bco0;->a(La/mbo0;)V

    .line 232
    .line 233
    .line 234
    :cond_13
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    :goto_7
    return-object v7

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
