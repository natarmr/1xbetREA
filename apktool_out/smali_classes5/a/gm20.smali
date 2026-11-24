.class public final La/gm20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/mn20;

.field public final synthetic l:La/m0k0;

.field public final synthetic m:La/zxj0;


# direct methods
.method public synthetic constructor <init>(La/mn20;La/m0k0;La/zxj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/gm20;->i:B

    iput-object p1, p0, La/gm20;->k:La/mn20;

    iput-object p2, p0, La/gm20;->l:La/m0k0;

    iput-object p3, p0, La/gm20;->m:La/zxj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/gm20;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/gm20;

    .line 7
    .line 8
    iget-object v3, p0, La/gm20;->m:La/zxj0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/gm20;->k:La/mn20;

    .line 12
    .line 13
    iget-object v2, p0, La/gm20;->l:La/m0k0;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/gm20;-><init>(La/mn20;La/m0k0;La/zxj0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, La/gm20;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, La/gm20;->m:La/zxj0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, La/gm20;->k:La/mn20;

    .line 28
    .line 29
    iget-object v3, p0, La/gm20;->l:La/m0k0;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, La/gm20;-><init>(La/mn20;La/m0k0;La/zxj0;La/yje;B)V

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
    iget-byte v0, p0, La/gm20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gm20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/gm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/gm20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/gm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/gm20;->i:B

    .line 2
    .line 3
    sget-object v1, La/hi20;->a:La/hi20;

    .line 4
    .line 5
    iget-object v2, p0, La/gm20;->m:La/zxj0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v6, p0, La/gm20;->l:La/m0k0;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v10, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v0, p0, La/gm20;->j:B

    .line 20
    .line 21
    iget-object v8, p0, La/gm20;->k:La/mn20;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v4, :cond_1

    .line 26
    .line 27
    if-ne v0, v5, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v0, p1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v8, La/mn20;->t:La/xzp;

    .line 46
    .line 47
    iget-object v3, v8, La/mn20;->h:La/ms2;

    .line 48
    .line 49
    invoke-static {v3}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iput-byte v4, p0, La/gm20;->j:B

    .line 54
    .line 55
    invoke-virtual {v0, v6, v2, v3, p0}, La/xzp;->N(La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-ne v0, v10, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    check-cast v0, La/vtd;

    .line 63
    .line 64
    iget-object v2, v8, La/mn20;->O:La/ol60;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v8, La/mn20;->R:La/p7m0;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-wide v1, v6, La/m0k0;->Y:J

    .line 78
    .line 79
    iget-wide v3, v6, La/m0k0;->a:J

    .line 80
    .line 81
    iget-wide v11, v6, La/m0k0;->B:J

    .line 82
    .line 83
    move-object v0, v8

    .line 84
    iget-wide v7, v6, La/m0k0;->z:J

    .line 85
    .line 86
    iput-byte v5, p0, La/gm20;->j:B

    .line 87
    .line 88
    move-object v9, p0

    .line 89
    move-wide v5, v11

    .line 90
    invoke-virtual/range {v0 .. v9}, La/mn20;->D(JJJJLa/zje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v10, :cond_4

    .line 95
    .line 96
    :goto_1
    move-object v7, v10

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_3
    return-object v7

    .line 101
    :pswitch_0
    sget-object v10, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget-byte v0, p0, La/gm20;->j:B

    .line 104
    .line 105
    iget-object v8, p0, La/gm20;->k:La/mn20;

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    if-eq v0, v4, :cond_6

    .line 110
    .line 111
    if-ne v0, v5, :cond_5

    .line 112
    .line 113
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v0, p1

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v8, La/mn20;->v:La/cr;

    .line 130
    .line 131
    iget-object v3, v8, La/mn20;->h:La/ms2;

    .line 132
    .line 133
    invoke-static {v3}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iput-byte v4, p0, La/gm20;->j:B

    .line 138
    .line 139
    invoke-static {v0, v6, v2, v3, p0}, La/cr;->c(La/cr;La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-ne v0, v10, :cond_8

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_8
    :goto_4
    check-cast v0, La/aud;

    .line 147
    .line 148
    iget-object v2, v8, La/mn20;->O:La/ol60;

    .line 149
    .line 150
    invoke-virtual {v2, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v8, La/mn20;->R:La/p7m0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    iget-wide v1, v6, La/m0k0;->Y:J

    .line 162
    .line 163
    iget-wide v3, v6, La/m0k0;->a:J

    .line 164
    .line 165
    iget-wide v11, v6, La/m0k0;->B:J

    .line 166
    .line 167
    iget-wide v6, v6, La/m0k0;->z:J

    .line 168
    .line 169
    iput-byte v5, p0, La/gm20;->j:B

    .line 170
    .line 171
    move-object v9, p0

    .line 172
    move-object v0, v8

    .line 173
    move-wide v7, v6

    .line 174
    move-wide v5, v11

    .line 175
    invoke-virtual/range {v0 .. v9}, La/mn20;->D(JJJJLa/zje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v10, :cond_9

    .line 180
    .line 181
    :goto_5
    move-object v7, v10

    .line 182
    goto :goto_7

    .line 183
    :cond_9
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    :goto_7
    return-object v7

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
