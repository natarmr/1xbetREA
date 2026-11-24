.class public final La/g0l;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/l0l;


# direct methods
.method public synthetic constructor <init>(La/l0l;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g0l;->i:B

    iput-object p1, p0, La/g0l;->k:La/l0l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/g0l;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g0l;->k:La/l0l;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/g0l;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/g0l;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/g0l;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g0l;->i:B

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
    invoke-virtual {p0, p1, p2}, La/g0l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g0l;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g0l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g0l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/g0l;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/g0l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/g0l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/g0l;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/g0l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/g0l;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/g0l;->k:La/l0l;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/g0l;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v4, :cond_1

    .line 20
    .line 21
    if-ne v6, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v3, La/l0l;->n:La/g1u;

    .line 39
    .line 40
    iput-byte v4, p0, La/g0l;->j:B

    .line 41
    .line 42
    invoke-virtual {p1}, La/g1u;->a()La/n0l;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    check-cast p1, La/n0l;

    .line 50
    .line 51
    iget-object v1, v3, La/l0l;->m:La/bto0;

    .line 52
    .line 53
    iget-object v2, p1, La/n0l;->b:Ljava/lang/String;

    .line 54
    .line 55
    iget p1, p1, La/n0l;->c:I

    .line 56
    .line 57
    iput-byte v5, p0, La/g0l;->j:B

    .line 58
    .line 59
    iget-object v1, v1, La/bto0;->a:La/v0l;

    .line 60
    .line 61
    invoke-virtual {v1, p1, p0, v2}, La/v0l;->f(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    :goto_1
    move-object v1, v0

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    check-cast p1, La/n0l;

    .line 70
    .line 71
    iget-object p0, v3, La/l0l;->o:La/ooi0;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/ooi0;->a(La/n0l;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, La/zzk;

    .line 77
    .line 78
    invoke-direct {p0, p1}, La/zzk;-><init>(La/n0l;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p0}, La/l0l;->B(La/b0l;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    return-object v1

    .line 87
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-byte v6, p0, La/g0l;->j:B

    .line 90
    .line 91
    if-eqz v6, :cond_7

    .line 92
    .line 93
    if-eq v6, v4, :cond_6

    .line 94
    .line 95
    if-ne v6, v5, :cond_5

    .line 96
    .line 97
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v3, La/l0l;->n:La/g1u;

    .line 113
    .line 114
    iput-byte v4, p0, La/g0l;->j:B

    .line 115
    .line 116
    invoke-virtual {p1}, La/g1u;->a()La/n0l;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v0, :cond_8

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    :goto_4
    check-cast p1, La/n0l;

    .line 124
    .line 125
    iget-object v1, v3, La/l0l;->h:La/y7k0;

    .line 126
    .line 127
    iget-object v2, p1, La/n0l;->b:Ljava/lang/String;

    .line 128
    .line 129
    iget p1, p1, La/n0l;->c:I

    .line 130
    .line 131
    iput-byte v5, p0, La/g0l;->j:B

    .line 132
    .line 133
    iget-object v1, v1, La/y7k0;->a:La/v0l;

    .line 134
    .line 135
    invoke-virtual {v1, p1, p0, v2}, La/v0l;->e(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v0, :cond_9

    .line 140
    .line 141
    :goto_5
    move-object v1, v0

    .line 142
    goto :goto_7

    .line 143
    :cond_9
    :goto_6
    check-cast p1, La/n0l;

    .line 144
    .line 145
    iget-object p0, v3, La/l0l;->o:La/ooi0;

    .line 146
    .line 147
    invoke-virtual {p0, p1}, La/ooi0;->a(La/n0l;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, p1}, La/l0l;->y(La/n0l;)V

    .line 151
    .line 152
    .line 153
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_7
    return-object v1

    .line 156
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-byte v6, p0, La/g0l;->j:B

    .line 159
    .line 160
    if-eqz v6, :cond_c

    .line 161
    .line 162
    if-eq v6, v4, :cond_b

    .line 163
    .line 164
    if-ne v6, v5, :cond_a

    .line 165
    .line 166
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_b

    .line 174
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, v3, La/l0l;->n:La/g1u;

    .line 182
    .line 183
    iput-byte v4, p0, La/g0l;->j:B

    .line 184
    .line 185
    invoke-virtual {p1}, La/g1u;->a()La/n0l;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-ne p1, v0, :cond_d

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_d
    :goto_8
    check-cast p1, La/n0l;

    .line 193
    .line 194
    iget-object v1, v3, La/l0l;->j:La/xuc;

    .line 195
    .line 196
    iget-object v2, p1, La/n0l;->b:Ljava/lang/String;

    .line 197
    .line 198
    iget p1, p1, La/n0l;->c:I

    .line 199
    .line 200
    iput-byte v5, p0, La/g0l;->j:B

    .line 201
    .line 202
    iget-object v1, v1, La/xuc;->a:La/v0l;

    .line 203
    .line 204
    invoke-virtual {v1, p1, p0, v2}, La/v0l;->a(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    if-ne p1, v0, :cond_e

    .line 209
    .line 210
    :goto_9
    move-object v1, v0

    .line 211
    goto :goto_b

    .line 212
    :cond_e
    :goto_a
    check-cast p1, La/n0l;

    .line 213
    .line 214
    iget-object p0, v3, La/l0l;->o:La/ooi0;

    .line 215
    .line 216
    invoke-virtual {p0, p1}, La/ooi0;->a(La/n0l;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, p1}, La/l0l;->y(La/n0l;)V

    .line 220
    .line 221
    .line 222
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    :goto_b
    return-object v1

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
