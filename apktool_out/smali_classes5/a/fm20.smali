.class public final La/fm20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/nn20;

.field public final synthetic l:La/m0k0;

.field public final synthetic m:La/zxj0;


# direct methods
.method public synthetic constructor <init>(La/nn20;La/m0k0;La/zxj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fm20;->i:B

    iput-object p1, p0, La/fm20;->k:La/nn20;

    iput-object p2, p0, La/fm20;->l:La/m0k0;

    iput-object p3, p0, La/fm20;->m:La/zxj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/fm20;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/fm20;

    .line 7
    .line 8
    iget-object v3, p0, La/fm20;->m:La/zxj0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/fm20;->k:La/nn20;

    .line 12
    .line 13
    iget-object v2, p0, La/fm20;->l:La/m0k0;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/fm20;-><init>(La/nn20;La/m0k0;La/zxj0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, La/fm20;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, La/fm20;->m:La/zxj0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, La/fm20;->k:La/nn20;

    .line 28
    .line 29
    iget-object v3, p0, La/fm20;->l:La/m0k0;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, La/fm20;-><init>(La/nn20;La/m0k0;La/zxj0;La/yje;B)V

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
    iget-byte v0, p0, La/fm20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fm20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fm20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fm20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fm20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/fm20;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fm20;->m:La/zxj0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, La/fm20;->l:La/m0k0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v10, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v0, p0, La/fm20;->j:B

    .line 18
    .line 19
    iget-object v7, p0, La/fm20;->k:La/nn20;

    .line 20
    .line 21
    const/4 v8, 0x3

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-eq v0, v4, :cond_2

    .line 25
    .line 26
    if-eq v0, v5, :cond_1

    .line 27
    .line 28
    if-ne v0, v8, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v0, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v7, La/nn20;->D0:La/xzp;

    .line 51
    .line 52
    iget-object v2, v7, La/nn20;->p:La/ms2;

    .line 53
    .line 54
    invoke-static {v2}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-byte v4, p0, La/fm20;->j:B

    .line 59
    .line 60
    invoke-virtual {v0, v6, v1, v2, p0}, La/xzp;->N(La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-ne v0, v10, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    :goto_0
    check-cast v0, La/vtd;

    .line 68
    .line 69
    iput-byte v5, p0, La/fm20;->j:B

    .line 70
    .line 71
    sget v1, La/nn20;->c1:I

    .line 72
    .line 73
    invoke-virtual {v7, v0, p0}, La/nn20;->l0(La/aud;La/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-ne v0, v10, :cond_5

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    :goto_1
    iget-wide v1, v6, La/m0k0;->Y:J

    .line 81
    .line 82
    iget-wide v3, v6, La/m0k0;->a:J

    .line 83
    .line 84
    iget-wide v11, v6, La/m0k0;->B:J

    .line 85
    .line 86
    iget-wide v5, v6, La/m0k0;->z:J

    .line 87
    .line 88
    iput-byte v8, p0, La/fm20;->j:B

    .line 89
    .line 90
    sget v0, La/nn20;->c1:I

    .line 91
    .line 92
    move-object v9, p0

    .line 93
    move-object v0, v7

    .line 94
    move-wide v7, v5

    .line 95
    move-wide v5, v11

    .line 96
    invoke-virtual/range {v0 .. v9}, La/nn20;->t0(JJJJLa/zje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-ne v0, v10, :cond_6

    .line 101
    .line 102
    :goto_2
    move-object v2, v10

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_4
    return-object v2

    .line 107
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 108
    .line 109
    iget-byte v7, p0, La/fm20;->j:B

    .line 110
    .line 111
    iget-object v8, p0, La/fm20;->k:La/nn20;

    .line 112
    .line 113
    if-eqz v7, :cond_9

    .line 114
    .line 115
    if-eq v7, v4, :cond_8

    .line 116
    .line 117
    if-ne v7, v5, :cond_7

    .line 118
    .line 119
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v1, p1

    .line 131
    goto :goto_5

    .line 132
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v8, La/nn20;->C0:La/cr;

    .line 136
    .line 137
    iget-object v3, v8, La/nn20;->p:La/ms2;

    .line 138
    .line 139
    invoke-static {v3}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iput-byte v4, p0, La/fm20;->j:B

    .line 144
    .line 145
    invoke-static {v2, v6, v1, v3, p0}, La/cr;->c(La/cr;La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-ne v1, v0, :cond_a

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_a
    :goto_5
    check-cast v1, La/aud;

    .line 153
    .line 154
    iput-byte v5, p0, La/fm20;->j:B

    .line 155
    .line 156
    sget v2, La/nn20;->c1:I

    .line 157
    .line 158
    invoke-virtual {v8, v1, p0}, La/nn20;->l0(La/aud;La/zje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-ne v1, v0, :cond_b

    .line 163
    .line 164
    :goto_6
    move-object v2, v0

    .line 165
    goto :goto_8

    .line 166
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_8
    return-object v2

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
