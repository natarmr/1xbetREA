.class public final La/q0a0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/r0a0;


# direct methods
.method public synthetic constructor <init>(La/r0a0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q0a0;->i:B

    iput-object p1, p0, La/q0a0;->k:La/r0a0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q0a0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q0a0;->k:La/r0a0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0a0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q0a0;-><init>(La/r0a0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/q0a0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/q0a0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/q0a0;-><init>(La/r0a0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

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
    iget-byte v0, p0, La/q0a0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/q0a0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/q0a0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/q0a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/q0a0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/q0a0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/q0a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/q0a0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/q0a0;->k:La/r0a0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, La/q0a0;->j:Z

    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/k0a0;

    .line 22
    .line 23
    iget-boolean p0, p0, La/k0a0;->b:Z

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k0a0;

    .line 32
    .line 33
    iget-boolean p0, p0, La/k0a0;->a:Z

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v1}, La/r0a0;->N()V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 44
    .line 45
    sget-object v2, La/wne;->a:La/wne;

    .line 46
    .line 47
    iget-boolean v3, p0, La/q0a0;->j:Z

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    if-ne v3, v5, :cond_2

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget p1, La/r0a0;->A:I

    .line 71
    .line 72
    iget-object p1, v0, La/ocj;->a:La/p7m0;

    .line 73
    .line 74
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-object v6, v3

    .line 82
    check-cast v6, La/k0a0;

    .line 83
    .line 84
    invoke-static {v6, v5, v4, v4}, La/k0a0;->a(La/k0a0;ZZZ)La/k0a0;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {p1, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    iget-object p1, v1, La/r0a0;->o:La/xfu;

    .line 95
    .line 96
    iget-object v3, v1, La/r0a0;->v:Ljava/lang/String;

    .line 97
    .line 98
    iput-boolean v5, p0, La/q0a0;->j:Z

    .line 99
    .line 100
    iget-object p1, p1, La/xfu;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, La/zz90;

    .line 103
    .line 104
    iget-object v6, p1, La/zz90;->c:La/sbx0;

    .line 105
    .line 106
    iget-object v6, v6, La/sbx0;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v6, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_6

    .line 115
    .line 116
    invoke-virtual {p1, v3, p0}, La/zz90;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, v2, :cond_5

    .line 121
    .line 122
    :goto_0
    move-object p1, p0

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    check-cast p0, Ljava/util/List;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    move-object p1, v6

    .line 128
    :goto_1
    if-ne p1, v2, :cond_7

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_9

    .line 138
    .line 139
    sget p0, La/r0a0;->A:I

    .line 140
    .line 141
    iget-object p0, v0, La/ocj;->a:La/p7m0;

    .line 142
    .line 143
    :cond_8
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object v0, p1

    .line 151
    check-cast v0, La/k0a0;

    .line 152
    .line 153
    invoke-static {v0, v4, v4, v5}, La/k0a0;->a(La/k0a0;ZZZ)La/k0a0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_8

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    iget-object p0, v1, La/r0a0;->r:La/u1u;

    .line 165
    .line 166
    iget-object p0, p0, La/u1u;->a:La/zz90;

    .line 167
    .line 168
    iget-object p0, p0, La/zz90;->c:La/sbx0;

    .line 169
    .line 170
    iget p0, p0, La/sbx0;->b:I

    .line 171
    .line 172
    invoke-virtual {v1, p0}, La/r0a0;->M(I)V

    .line 173
    .line 174
    .line 175
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    :goto_4
    return-object v2

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
