.class public final La/a0p0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/b0p0;


# direct methods
.method public synthetic constructor <init>(La/b0p0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a0p0;->i:B

    iput-object p1, p0, La/a0p0;->k:La/b0p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a0p0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a0p0;->k:La/b0p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/a0p0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/a0p0;-><init>(La/b0p0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/a0p0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/a0p0;-><init>(La/b0p0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/a0p0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a0p0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a0p0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a0p0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a0p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/a0p0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/a0p0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/a0p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/a0p0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, La/wne;->a:La/wne;

    .line 7
    .line 8
    iget-boolean v1, p0, La/a0p0;->j:Z

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, La/a0p0;->k:La/b0p0;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/b0p0;->z:La/znt;

    .line 32
    .line 33
    iput-boolean v2, p0, La/a0p0;->j:Z

    .line 34
    .line 35
    iget-object p1, p1, La/znt;->a:La/chf0;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/chf0;->D(La/yje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide p0

    .line 50
    const-wide/16 v0, 0x0

    .line 51
    .line 52
    cmp-long p0, p0, v0

    .line 53
    .line 54
    if-lez p0, :cond_3

    .line 55
    .line 56
    sget p0, La/b0p0;->I:I

    .line 57
    .line 58
    sget-object p0, La/uzo0;->a:La/uzo0;

    .line 59
    .line 60
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    sget p0, La/b0p0;->I:I

    .line 65
    .line 66
    iget-object p0, v3, La/b0p0;->A:La/i1w0;

    .line 67
    .line 68
    new-instance p1, La/zzo0;

    .line 69
    .line 70
    invoke-direct {p1, v3, v2}, La/zzo0;-><init>(La/b0p0;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_2
    return-object v0

    .line 79
    :pswitch_0
    iget-boolean v0, p0, La/a0p0;->j:Z

    .line 80
    .line 81
    sget-object v1, La/wne;->a:La/wne;

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, La/a0p0;->k:La/b0p0;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    sget p0, La/b0p0;->I:I

    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    invoke-virtual {v2, p0}, La/b0p0;->M(Z)V

    .line 94
    .line 95
    .line 96
    iget-object p0, v2, La/b0p0;->H:La/bby;

    .line 97
    .line 98
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v2, La/b0p0;->s:La/hjd;

    .line 102
    .line 103
    new-instance v6, La/ofo0;

    .line 104
    .line 105
    const/16 p0, 0xf

    .line 106
    .line 107
    invoke-direct {v6, p0}, La/ofo0;-><init>(B)V

    .line 108
    .line 109
    .line 110
    const/16 v7, 0x77

    .line 111
    .line 112
    const/4 v4, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    invoke-static/range {v2 .. v7}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iput-object p0, v2, La/b0p0;->H:La/bby;

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/szo0;

    .line 126
    .line 127
    iget-object p1, p0, La/szo0;->a:La/d0t;

    .line 128
    .line 129
    invoke-static {p1}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object p0, p0, La/szo0;->b:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez p0, :cond_5

    .line 144
    .line 145
    iget-object p0, v2, La/b0p0;->F:La/bby;

    .line 146
    .line 147
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 152
    .line 153
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 154
    .line 155
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object v0, p1

    .line 163
    check-cast v0, La/szo0;

    .line 164
    .line 165
    sget-object v3, La/izo0;->b:La/izo0;

    .line 166
    .line 167
    const/4 v5, 0x0

    .line 168
    const/16 v6, 0x2b

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    const/4 v2, 0x0

    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-static/range {v0 .. v6}, La/szo0;->a(La/szo0;La/d0t;Ljava/util/ArrayList;La/izo0;La/nzo0;ZI)La/szo0;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
