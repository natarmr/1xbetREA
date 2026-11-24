.class public final La/nv5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d650;


# direct methods
.method public synthetic constructor <init>(La/d650;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nv5;->i:B

    iput-object p1, p0, La/nv5;->k:La/d650;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/nv5;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/nv5;

    .line 7
    .line 8
    iget-object p0, p0, La/nv5;->k:La/d650;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/nv5;-><init>(La/d650;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/nv5;

    .line 16
    .line 17
    iget-object p0, p0, La/nv5;->k:La/d650;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/nv5;-><init>(La/d650;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/nv5;

    .line 25
    .line 26
    iget-object p0, p0, La/nv5;->k:La/d650;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {p1, p0, p2, v0}, La/nv5;-><init>(La/d650;La/yje;B)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nv5;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nv5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nv5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nv5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nv5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nv5;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nv5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/nv5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/nv5;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/nv5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/nv5;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/nv5;->k:La/d650;

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
    iget-boolean v5, p0, La/nv5;->j:Z

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
    iget-object p1, v1, La/d650;->r:La/kd30;

    .line 32
    .line 33
    iput-boolean v3, p0, La/nv5;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1}, La/kd30;->N()Lkotlin/Unit;

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
    iget-boolean v5, p0, La/nv5;->j:Z

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
    iget-object p1, v1, La/d650;->l:La/khf0;

    .line 66
    .line 67
    sget-object v2, La/bm5;->e:La/bm5;

    .line 68
    .line 69
    iput-boolean v3, p0, La/nv5;->j:Z

    .line 70
    .line 71
    invoke-static {p1, v2, p0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_5

    .line 76
    .line 77
    move-object v4, v0

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    :goto_2
    check-cast p1, La/ql5;

    .line 80
    .line 81
    iget-object p0, v1, La/d650;->j:La/trm0;

    .line 82
    .line 83
    sget-object v0, La/bm5;->e:La/bm5;

    .line 84
    .line 85
    invoke-virtual {p0, v0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 86
    .line 87
    .line 88
    iget-wide p0, p1, La/ql5;->a:J

    .line 89
    .line 90
    iput-wide p0, v1, La/d650;->t:J

    .line 91
    .line 92
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    :goto_3
    return-object v4

    .line 95
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v5, p0, La/nv5;->j:Z

    .line 98
    .line 99
    if-eqz v5, :cond_7

    .line 100
    .line 101
    if-ne v5, v3, :cond_6

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, v1, La/d650;->k:La/ahu;

    .line 115
    .line 116
    iget-object v2, v1, La/d650;->u:La/bm5;

    .line 117
    .line 118
    iput-boolean v3, p0, La/nv5;->j:Z

    .line 119
    .line 120
    invoke-virtual {p1, v2, p0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v0, :cond_8

    .line 125
    .line 126
    move-object v4, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_8
    :goto_4
    check-cast p1, La/ql5;

    .line 129
    .line 130
    iget-object p0, v1, La/d650;->j:La/trm0;

    .line 131
    .line 132
    iget-object v0, v1, La/d650;->u:La/bm5;

    .line 133
    .line 134
    invoke-virtual {p0, v0, p1}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 135
    .line 136
    .line 137
    iget-wide v2, p1, La/ql5;->a:J

    .line 138
    .line 139
    iput-wide v2, v1, La/d650;->t:J

    .line 140
    .line 141
    invoke-virtual {v1, p1}, La/d650;->x(La/ql5;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    iget-object v0, v1, La/d650;->v:La/p7m0;

    .line 146
    .line 147
    new-instance v1, La/lv5;

    .line 148
    .line 149
    invoke-direct {v1, p1, p0}, La/lv5;-><init>(La/ql5;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_5
    return-object v4

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
