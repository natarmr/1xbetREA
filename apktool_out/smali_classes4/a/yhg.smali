.class public final La/yhg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/aig;


# direct methods
.method public synthetic constructor <init>(La/aig;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yhg;->i:B

    iput-object p1, p0, La/yhg;->k:La/aig;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yhg;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yhg;->k:La/aig;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yhg;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/yhg;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/yhg;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_2
    new-instance v0, La/yhg;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, p1, v1}, La/yhg;-><init>(La/aig;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yhg;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/yhg;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/yhg;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/yhg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/yhg;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/yhg;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/yhg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/yhg;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/yhg;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/yhg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/yhg;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/yhg;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/yhg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/yhg;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/yhg;->k:La/aig;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/yhg;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, La/aig;->t:La/nsu;

    .line 32
    .line 33
    iput-boolean v3, p0, La/yhg;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1}, La/nsu;->a()Lkotlin/Unit;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v4, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v4

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v5, p0, La/yhg;->j:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v3, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, v1, La/aig;->s:La/soi0;

    .line 66
    .line 67
    iput-boolean v3, p0, La/yhg;->j:Z

    .line 68
    .line 69
    const-string p0, ""

    .line 70
    .line 71
    invoke-virtual {p1, p0}, La/soi0;->b(Ljava/lang/String;)Lkotlin/Unit;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v0, :cond_5

    .line 76
    .line 77
    move-object v4, v0

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_3
    return-object v4

    .line 82
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v5, p0, La/yhg;->j:Z

    .line 85
    .line 86
    if-eqz v5, :cond_7

    .line 87
    .line 88
    if-ne v5, v3, :cond_6

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, v1, La/aig;->u:La/bqc;

    .line 102
    .line 103
    iput-boolean v3, p0, La/yhg;->j:Z

    .line 104
    .line 105
    invoke-virtual {p1}, La/bqc;->a()Lkotlin/Unit;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v0, :cond_8

    .line 110
    .line 111
    move-object v4, v0

    .line 112
    goto :goto_5

    .line 113
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_5
    return-object v4

    .line 116
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget-boolean v5, p0, La/yhg;->j:Z

    .line 119
    .line 120
    if-eqz v5, :cond_a

    .line 121
    .line 122
    if-ne v5, v3, :cond_9

    .line 123
    .line 124
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, v1, La/aig;->q:La/gr00;

    .line 136
    .line 137
    iget-object v2, v1, La/aig;->p:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v5, p1, La/gr00;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v5, La/nsu;

    .line 148
    .line 149
    iget-object v5, v5, La/nsu;->a:La/cog;

    .line 150
    .line 151
    iget-object v5, v5, La/cog;->a:La/dog;

    .line 152
    .line 153
    iget-object v6, v5, La/dog;->d:La/p7m0;

    .line 154
    .line 155
    iget-object v5, p1, La/gr00;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v5, La/cqc;

    .line 158
    .line 159
    iget-object v5, v5, La/cqc;->a:La/cog;

    .line 160
    .line 161
    iget-object v5, v5, La/cog;->a:La/dog;

    .line 162
    .line 163
    iget-object v7, v5, La/dog;->b:La/p7m0;

    .line 164
    .line 165
    iget-object v5, p1, La/gr00;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v5, La/x2u;

    .line 168
    .line 169
    iget-object v5, v5, La/x2u;->a:La/cog;

    .line 170
    .line 171
    iget-object v5, v5, La/cog;->a:La/dog;

    .line 172
    .line 173
    iget-object v8, v5, La/dog;->c:La/p7m0;

    .line 174
    .line 175
    iget-object v5, p1, La/gr00;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v5, La/x2u;

    .line 178
    .line 179
    iget-object v5, v5, La/x2u;->a:La/cog;

    .line 180
    .line 181
    iget-object v5, v5, La/cog;->a:La/dog;

    .line 182
    .line 183
    iget-object v9, v5, La/dog;->a:La/p7m0;

    .line 184
    .line 185
    iget-object p1, p1, La/gr00;->e:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, La/ocl;

    .line 188
    .line 189
    sget-object v5, La/sip;->a:La/bek;

    .line 190
    .line 191
    iget-object p1, p1, La/ocl;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, La/dhg;

    .line 194
    .line 195
    iget-object p1, p1, La/dhg;->a:La/chg;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object p1, p1, La/chg;->a:La/p7m0;

    .line 201
    .line 202
    new-instance v10, La/h2c;

    .line 203
    .line 204
    invoke-direct {v10, p1}, La/h2c;-><init>(La/p7m0;)V

    .line 205
    .line 206
    .line 207
    new-instance v11, La/zcg;

    .line 208
    .line 209
    invoke-direct {v11, v2, v4}, La/zcg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/yje;)V

    .line 210
    .line 211
    .line 212
    invoke-static/range {v6 .. v11}, La/dub;->d0(La/gmq;La/gmq;La/gmq;La/gmq;La/gmq;La/aer;)La/a1g;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    new-instance v2, La/m0g;

    .line 217
    .line 218
    const/16 v4, 0x16

    .line 219
    .line 220
    invoke-direct {v2, v1, v4}, La/m0g;-><init>(Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    iput-boolean v3, p0, La/yhg;->j:Z

    .line 224
    .line 225
    invoke-virtual {p1, v2, p0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    if-ne p0, v0, :cond_b

    .line 230
    .line 231
    move-object v4, v0

    .line 232
    goto :goto_7

    .line 233
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    :goto_7
    return-object v4

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
