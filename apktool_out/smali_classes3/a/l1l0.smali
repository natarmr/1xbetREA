.class public final La/l1l0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/m1l0;


# direct methods
.method public synthetic constructor <init>(La/m1l0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l1l0;->i:B

    iput-object p1, p0, La/l1l0;->k:La/m1l0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l1l0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l1l0;->k:La/m1l0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/l1l0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/l1l0;-><init>(La/m1l0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/l1l0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/l1l0;-><init>(La/m1l0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/l1l0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/l1l0;-><init>(La/m1l0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/l1l0;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l1l0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/l1l0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l1l0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l1l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/l1l0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/l1l0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/l1l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/l1l0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/l1l0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/l1l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/l1l0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/l1l0;->k:La/m1l0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/l1l0;->j:Z

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
    move-object p1, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v4, La/m1l0;->s:La/f4u;

    .line 33
    .line 34
    iput-boolean v3, p0, La/l1l0;->j:Z

    .line 35
    .line 36
    iget-object p1, p1, La/f4u;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, La/c5k;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/c5k;->l(La/zje;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    move-object p1, v0

    .line 47
    :cond_2
    :goto_0
    return-object p1

    .line 48
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 49
    .line 50
    iget-boolean v5, p0, La/l1l0;->j:Z

    .line 51
    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    if-ne v5, v3, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object p1, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, v4, La/m1l0;->r:La/cmt;

    .line 69
    .line 70
    iput-boolean v3, p0, La/l1l0;->j:Z

    .line 71
    .line 72
    iget-object p1, p1, La/cmt;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, La/c5k;

    .line 75
    .line 76
    invoke-virtual {p1, p0}, La/c5k;->e(La/zje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_5

    .line 81
    .line 82
    move-object p1, v0

    .line 83
    :cond_5
    :goto_1
    return-object p1

    .line 84
    :pswitch_1
    iget-boolean v12, p0, La/l1l0;->j:Z

    .line 85
    .line 86
    sget-object p0, La/wne;->a:La/wne;

    .line 87
    .line 88
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget p0, La/m1l0;->z:I

    .line 92
    .line 93
    iget-object p0, v4, La/i3t0;->i:La/ocj;

    .line 94
    .line 95
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 96
    .line 97
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-object v5, v0

    .line 105
    check-cast v5, La/c1l0;

    .line 106
    .line 107
    const/4 v11, 0x0

    .line 108
    const/16 v13, 0xff

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-static/range {v5 .. v13}, La/c1l0;->a(La/c1l0;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZI)La/c1l0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    if-eqz v12, :cond_7

    .line 126
    .line 127
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, La/c1l0;

    .line 132
    .line 133
    iget-boolean p1, p1, La/c1l0;->e:Z

    .line 134
    .line 135
    if-nez p1, :cond_7

    .line 136
    .line 137
    invoke-virtual {v4}, La/m1l0;->P()V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 142
    .line 143
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object v1, p0

    .line 151
    check-cast v1, La/c1l0;

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    const/16 v9, 0x1df

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    const/4 v3, 0x0

    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    const/4 v7, 0x0

    .line 162
    invoke-static/range {v1 .. v9}, La/c1l0;->a(La/c1l0;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZI)La/c1l0;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
