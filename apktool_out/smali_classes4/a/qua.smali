.class public final La/qua;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:La/l7m0;


# direct methods
.method public constructor <init>(La/l7m0;La/xcz;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/qua;->i:B

    .line 13
    iput-object p1, p0, La/qua;->l:La/l7m0;

    iput-object p2, p0, La/qua;->k:La/xcz;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/xcz;La/l7m0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/qua;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/qua;->k:La/xcz;

    .line 5
    .line 6
    iput-object p2, p0, La/qua;->l:La/l7m0;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/qua;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/qua;->l:La/l7m0;

    .line 4
    .line 5
    iget-object p0, p0, La/qua;->k:La/xcz;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/qua;

    .line 11
    .line 12
    invoke-direct {p1, p0, v0, p2}, La/qua;-><init>(La/xcz;La/l7m0;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, La/qua;

    .line 17
    .line 18
    invoke-direct {p1, v0, p0, p2}, La/qua;-><init>(La/l7m0;La/xcz;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qua;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qua;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qua;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qua;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qua;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/qua;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/qua;->l:La/l7m0;

    .line 5
    .line 6
    iget-object v3, p0, La/qua;->k:La/xcz;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v7, p0, La/qua;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/z3f0;->Y1:La/zie0;

    .line 35
    .line 36
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput-boolean v5, p0, La/qua;->j:Z

    .line 47
    .line 48
    sget-object v2, La/xcz;->y:La/v0h0;

    .line 49
    .line 50
    invoke-virtual {v3, p1, v1, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v0, :cond_2

    .line 55
    .line 56
    move-object v6, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    :goto_1
    return-object v6

    .line 61
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v7, p0, La/qua;->j:Z

    .line 64
    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    if-ne v7, v5, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/unr;

    .line 87
    .line 88
    iget-object p1, p1, La/unr;->h:La/dja;

    .line 89
    .line 90
    if-eqz p1, :cond_a

    .line 91
    .line 92
    invoke-virtual {v3}, La/xcz;->j()La/mcz;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iget-object v4, v4, La/mcz;->l:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_6

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    move-object v8, v7

    .line 113
    check-cast v8, La/ncz;

    .line 114
    .line 115
    iget v8, v8, La/ncz;->p:I

    .line 116
    .line 117
    if-ltz v8, :cond_5

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    move-object v7, v6

    .line 121
    :goto_2
    check-cast v7, La/ncz;

    .line 122
    .line 123
    if-eqz v7, :cond_7

    .line 124
    .line 125
    iget-object v6, v7, La/ncz;->l:Ljava/lang/Object;

    .line 126
    .line 127
    :cond_7
    iget-object v4, v3, La/xcz;->j:La/ywj;

    .line 128
    .line 129
    invoke-virtual {v4}, La/ywj;->a()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_a

    .line 134
    .line 135
    if-eq v6, p1, :cond_a

    .line 136
    .line 137
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, La/unr;

    .line 142
    .line 143
    iget-object v2, v2, La/unr;->e:La/a4x;

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move v4, v1

    .line 150
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    const/4 v7, -0x1

    .line 155
    if-eqz v6, :cond_9

    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, La/cja;

    .line 162
    .line 163
    invoke-interface {v6}, La/cja;->getType()La/dja;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    if-ne v6, p1, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    move v4, v7

    .line 174
    :goto_4
    if-eq v4, v7, :cond_a

    .line 175
    .line 176
    iput-boolean v5, p0, La/qua;->j:Z

    .line 177
    .line 178
    invoke-virtual {v3, v4, v1, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-ne p0, v0, :cond_a

    .line 183
    .line 184
    move-object v6, v0

    .line 185
    goto :goto_6

    .line 186
    :cond_a
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    :goto_6
    return-object v6

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
