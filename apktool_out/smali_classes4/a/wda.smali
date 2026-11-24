.class public final La/wda;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/t33;

.field public final synthetic k:La/t33;

.field public final synthetic l:La/t33;

.field public final synthetic m:La/t33;

.field public final synthetic n:La/t33;

.field public final synthetic o:La/t33;

.field public final synthetic p:La/iea;

.field public final synthetic q:La/t33;

.field public final synthetic r:F

.field public final synthetic s:La/t33;

.field public final synthetic t:La/pz40;


# direct methods
.method public constructor <init>(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/iea;La/t33;FLa/t33;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wda;->j:La/t33;

    .line 2
    .line 3
    iput-object p2, p0, La/wda;->k:La/t33;

    .line 4
    .line 5
    iput-object p3, p0, La/wda;->l:La/t33;

    .line 6
    .line 7
    iput-object p4, p0, La/wda;->m:La/t33;

    .line 8
    .line 9
    iput-object p5, p0, La/wda;->n:La/t33;

    .line 10
    .line 11
    iput-object p6, p0, La/wda;->o:La/t33;

    .line 12
    .line 13
    iput-object p7, p0, La/wda;->p:La/iea;

    .line 14
    .line 15
    iput-object p8, p0, La/wda;->q:La/t33;

    .line 16
    .line 17
    iput p9, p0, La/wda;->r:F

    .line 18
    .line 19
    iput-object p10, p0, La/wda;->s:La/t33;

    .line 20
    .line 21
    iput-object p11, p0, La/wda;->t:La/pz40;

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/wda;

    .line 2
    .line 3
    iget-object v10, p0, La/wda;->s:La/t33;

    .line 4
    .line 5
    iget-object v11, p0, La/wda;->t:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/wda;->j:La/t33;

    .line 8
    .line 9
    iget-object v2, p0, La/wda;->k:La/t33;

    .line 10
    .line 11
    iget-object v3, p0, La/wda;->l:La/t33;

    .line 12
    .line 13
    iget-object v4, p0, La/wda;->m:La/t33;

    .line 14
    .line 15
    iget-object v5, p0, La/wda;->n:La/t33;

    .line 16
    .line 17
    iget-object v6, p0, La/wda;->o:La/t33;

    .line 18
    .line 19
    iget-object v7, p0, La/wda;->p:La/iea;

    .line 20
    .line 21
    iget-object v8, p0, La/wda;->q:La/t33;

    .line 22
    .line 23
    iget v9, p0, La/wda;->r:F

    .line 24
    .line 25
    move-object v12, p2

    .line 26
    invoke-direct/range {v0 .. v12}, La/wda;-><init>(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/iea;La/t33;FLa/t33;La/pz40;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/wda;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/wda;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wda;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/wda;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/wda;->t:La/pz40;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :pswitch_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object v8, p0

    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :pswitch_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v8, p0

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :pswitch_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v8, p0

    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :pswitch_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v8, p0

    .line 44
    goto :goto_1

    .line 45
    :pswitch_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget p1, La/dea;->a:F

    .line 53
    .line 54
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-byte p1, p0, La/wda;->i:B

    .line 68
    .line 69
    iget-object v3, p0, La/wda;->j:La/t33;

    .line 70
    .line 71
    iget-object v4, p0, La/wda;->k:La/t33;

    .line 72
    .line 73
    iget-object v5, p0, La/wda;->l:La/t33;

    .line 74
    .line 75
    iget-object v6, p0, La/wda;->m:La/t33;

    .line 76
    .line 77
    iget-object v7, p0, La/wda;->n:La/t33;

    .line 78
    .line 79
    iget-object v8, p0, La/wda;->o:La/t33;

    .line 80
    .line 81
    move-object v9, p0

    .line 82
    invoke-static/range {v3 .. v9}, La/dea;->e(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v0, :cond_0

    .line 87
    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :cond_0
    :goto_0
    sget p0, La/dea;->a:F

    .line 91
    .line 92
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-interface {v2, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_1
    move-object v8, p0

    .line 99
    iget-object p0, v8, La/wda;->p:La/iea;

    .line 100
    .line 101
    iget-boolean p1, p0, La/iea;->c:Z

    .line 102
    .line 103
    if-nez p1, :cond_2

    .line 104
    .line 105
    iget-boolean p0, p0, La/iea;->d:Z

    .line 106
    .line 107
    if-eqz p0, :cond_7

    .line 108
    .line 109
    :cond_2
    const/4 p0, 0x2

    .line 110
    iput-byte p0, v8, La/wda;->i:B

    .line 111
    .line 112
    iget-object v3, v8, La/wda;->j:La/t33;

    .line 113
    .line 114
    iget-object v4, v8, La/wda;->k:La/t33;

    .line 115
    .line 116
    iget-object v5, v8, La/wda;->l:La/t33;

    .line 117
    .line 118
    iget-object v6, v8, La/wda;->q:La/t33;

    .line 119
    .line 120
    iget v7, v8, La/wda;->r:F

    .line 121
    .line 122
    invoke-static/range {v3 .. v8}, La/dea;->f(La/t33;La/t33;La/t33;La/t33;FLa/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_3

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_3
    :goto_1
    iget p0, v8, La/wda;->r:F

    .line 130
    .line 131
    neg-float v7, p0

    .line 132
    const/4 p0, 0x3

    .line 133
    iput-byte p0, v8, La/wda;->i:B

    .line 134
    .line 135
    iget-object v3, v8, La/wda;->m:La/t33;

    .line 136
    .line 137
    iget-object v4, v8, La/wda;->n:La/t33;

    .line 138
    .line 139
    iget-object v5, v8, La/wda;->o:La/t33;

    .line 140
    .line 141
    iget-object v6, v8, La/wda;->s:La/t33;

    .line 142
    .line 143
    invoke-static/range {v3 .. v8}, La/dea;->f(La/t33;La/t33;La/t33;La/t33;FLa/zje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-ne p0, v0, :cond_4

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_4
    :goto_2
    const/4 p0, 0x4

    .line 151
    iput-byte p0, v8, La/wda;->i:B

    .line 152
    .line 153
    const-wide/16 p0, 0x190

    .line 154
    .line 155
    invoke-static {p0, p1, v8}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-ne p0, v0, :cond_5

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_5
    :goto_3
    const/4 p0, 0x5

    .line 163
    iput-byte p0, v8, La/wda;->i:B

    .line 164
    .line 165
    iget-object p0, v8, La/wda;->k:La/t33;

    .line 166
    .line 167
    iget-object p1, v8, La/wda;->l:La/t33;

    .line 168
    .line 169
    iget-object v1, v8, La/wda;->n:La/t33;

    .line 170
    .line 171
    iget-object v2, v8, La/wda;->o:La/t33;

    .line 172
    .line 173
    invoke-static {p0, p1, v1, v2, v8}, La/dea;->d(La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-ne p0, v0, :cond_6

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_6
    :goto_4
    const/4 p0, 0x6

    .line 181
    iput-byte p0, v8, La/wda;->i:B

    .line 182
    .line 183
    iget-object p0, v8, La/wda;->j:La/t33;

    .line 184
    .line 185
    iget-object p1, v8, La/wda;->q:La/t33;

    .line 186
    .line 187
    iget-object v1, v8, La/wda;->m:La/t33;

    .line 188
    .line 189
    iget-object v2, v8, La/wda;->s:La/t33;

    .line 190
    .line 191
    invoke-static {p0, p1, v1, v2, v8}, La/dea;->g(La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, v0, :cond_7

    .line 196
    .line 197
    :goto_5
    return-object v0

    .line 198
    :cond_7
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
