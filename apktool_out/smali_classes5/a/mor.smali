.class public final La/mor;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/spr;

.field public final synthetic l:La/u3z;

.field public final synthetic m:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(La/spr;La/u3z;Ljava/lang/Long;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/mor;->i:B

    iput-object p1, p0, La/mor;->k:La/spr;

    iput-object p2, p0, La/mor;->l:La/u3z;

    iput-object p3, p0, La/mor;->m:Ljava/lang/Long;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/mor;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/mor;

    .line 7
    .line 8
    iget-object v3, p0, La/mor;->m:Ljava/lang/Long;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/mor;->k:La/spr;

    .line 12
    .line 13
    iget-object v2, p0, La/mor;->l:La/u3z;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/mor;-><init>(La/spr;La/u3z;Ljava/lang/Long;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, La/mor;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, La/mor;->m:Ljava/lang/Long;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, La/mor;->k:La/spr;

    .line 28
    .line 29
    iget-object v3, p0, La/mor;->l:La/u3z;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, La/mor;-><init>(La/spr;La/u3z;Ljava/lang/Long;La/yje;B)V

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
    iget-byte v0, p0, La/mor;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mor;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mor;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mor;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mor;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mor;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mor;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/mor;->i:B

    .line 2
    .line 3
    const/4 v7, 0x3

    .line 4
    const/4 v8, 0x4

    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v9, p0, La/mor;->k:La/spr;

    .line 8
    .line 9
    const/4 v10, 0x2

    .line 10
    const/4 v11, 0x0

    .line 11
    const/4 v12, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v13, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v0, p0, La/mor;->j:B

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-eq v0, v12, :cond_1

    .line 22
    .line 23
    if-ne v0, v10, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v0, p1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v9, La/spr;->E:La/tzi;

    .line 42
    .line 43
    invoke-virtual {v9}, La/spr;->M()La/sff0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-boolean v2, v1, La/sff0;->D0:Z

    .line 48
    .line 49
    invoke-virtual {v9}, La/spr;->M()La/sff0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v1, v1, La/sff0;->I1:La/oxk0;

    .line 54
    .line 55
    iget-byte v4, v1, La/oxk0;->a:B

    .line 56
    .line 57
    invoke-virtual {v9}, La/spr;->M()La/sff0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-boolean v5, v1, La/sff0;->K1:Z

    .line 62
    .line 63
    iput-byte v12, p0, La/mor;->j:B

    .line 64
    .line 65
    iget-object v1, p0, La/mor;->l:La/u3z;

    .line 66
    .line 67
    iget-object v3, p0, La/mor;->m:Ljava/lang/Long;

    .line 68
    .line 69
    move-object v6, p0

    .line 70
    invoke-virtual/range {v0 .. v6}, La/tzi;->o(La/u3z;ZLjava/lang/Long;IZLa/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v13, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :goto_0
    check-cast v0, La/gmq;

    .line 78
    .line 79
    new-instance v1, La/lor;

    .line 80
    .line 81
    invoke-direct {v1, v9, v11, v12}, La/lor;-><init>(La/spr;La/yje;B)V

    .line 82
    .line 83
    .line 84
    new-instance v2, La/fnq;

    .line 85
    .line 86
    invoke-direct {v2, v0, v1, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 87
    .line 88
    .line 89
    new-instance v0, La/lo3;

    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    invoke-direct {v0, v7, v11, v1}, La/lo3;-><init>(ILa/yje;B)V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/dnq;

    .line 97
    .line 98
    invoke-direct {v1, v2, v0, v12}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 99
    .line 100
    .line 101
    iput-byte v10, p0, La/mor;->j:B

    .line 102
    .line 103
    invoke-static {v1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-ne v0, v13, :cond_4

    .line 108
    .line 109
    :goto_1
    move-object v11, v13

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    :goto_2
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    :goto_3
    return-object v11

    .line 114
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 115
    .line 116
    iget-byte v2, p0, La/mor;->j:B

    .line 117
    .line 118
    if-eqz v2, :cond_7

    .line 119
    .line 120
    if-eq v2, v12, :cond_6

    .line 121
    .line 122
    if-ne v2, v10, :cond_5

    .line 123
    .line 124
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object v1, p1

    .line 136
    goto :goto_4

    .line 137
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v9, La/spr;->F:La/wdu;

    .line 141
    .line 142
    iput-byte v12, p0, La/mor;->j:B

    .line 143
    .line 144
    iget-object v2, p0, La/mor;->l:La/u3z;

    .line 145
    .line 146
    iget-object v3, p0, La/mor;->m:Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v1, v2, v3, p0}, La/wdu;->w(La/u3z;Ljava/lang/Long;La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-ne v1, v0, :cond_8

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    :goto_4
    check-cast v1, La/gmq;

    .line 156
    .line 157
    new-instance v2, La/lor;

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-direct {v2, v9, v11, v3}, La/lor;-><init>(La/spr;La/yje;B)V

    .line 161
    .line 162
    .line 163
    new-instance v3, La/fnq;

    .line 164
    .line 165
    invoke-direct {v3, v1, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 166
    .line 167
    .line 168
    new-instance v1, La/lo3;

    .line 169
    .line 170
    const/16 v2, 0xc

    .line 171
    .line 172
    invoke-direct {v1, v7, v11, v2}, La/lo3;-><init>(ILa/yje;B)V

    .line 173
    .line 174
    .line 175
    new-instance v2, La/dnq;

    .line 176
    .line 177
    invoke-direct {v2, v3, v1, v12}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 178
    .line 179
    .line 180
    iput-byte v10, p0, La/mor;->j:B

    .line 181
    .line 182
    invoke-static {v2, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-ne v1, v0, :cond_9

    .line 187
    .line 188
    :goto_5
    move-object v11, v0

    .line 189
    goto :goto_7

    .line 190
    :cond_9
    :goto_6
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_7
    return-object v11

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
