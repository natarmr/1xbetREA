.class public final La/vme;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hpa0;

.field public final synthetic l:La/p5q0;


# direct methods
.method public synthetic constructor <init>(La/hpa0;La/p5q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vme;->i:B

    iput-object p1, p0, La/vme;->k:La/hpa0;

    iput-object p2, p0, La/vme;->l:La/p5q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/vme;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/vme;

    .line 7
    .line 8
    iget-object v0, p0, La/vme;->l:La/p5q0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object p0, p0, La/vme;->k:La/hpa0;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/vme;-><init>(La/hpa0;La/p5q0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/vme;

    .line 18
    .line 19
    iget-object v0, p0, La/vme;->l:La/p5q0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object p0, p0, La/vme;->k:La/hpa0;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/vme;-><init>(La/hpa0;La/p5q0;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/vme;

    .line 29
    .line 30
    iget-object v0, p0, La/vme;->l:La/p5q0;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object p0, p0, La/vme;->k:La/hpa0;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/vme;-><init>(La/hpa0;La/p5q0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vme;->i:B

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
    invoke-virtual {p0, p1, p2}, La/vme;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vme;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vme;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vme;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vme;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vme;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/vme;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/vme;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/vme;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/vme;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/vme;->k:La/hpa0;

    .line 4
    .line 5
    iget-object v2, p0, La/vme;->l:La/p5q0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v1, p0, La/vme;->j:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-ne v1, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-boolean v4, p0, La/vme;->j:Z

    .line 34
    .line 35
    new-instance v7, La/l710;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-direct {v7, v2, p1}, La/l710;-><init>(La/p5q0;B)V

    .line 39
    .line 40
    .line 41
    new-instance v8, La/m710;

    .line 42
    .line 43
    invoke-direct {v8, v2, p1}, La/m710;-><init>(La/p5q0;B)V

    .line 44
    .line 45
    .line 46
    new-instance v9, La/m710;

    .line 47
    .line 48
    invoke-direct {v9, v2, v4}, La/m710;-><init>(La/p5q0;B)V

    .line 49
    .line 50
    .line 51
    new-instance v10, La/g2z;

    .line 52
    .line 53
    const/16 p1, 0x14

    .line 54
    .line 55
    invoke-direct {v10, v2, p1}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, La/vme;->k:La/hpa0;

    .line 59
    .line 60
    move-object v11, p0

    .line 61
    invoke-static/range {v6 .. v11}, La/bel;->e(La/hpa0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v0, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_0
    if-ne p0, v0, :cond_3

    .line 71
    .line 72
    move-object v5, v0

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_2
    return-object v5

    .line 77
    :pswitch_0
    move-object v11, p0

    .line 78
    sget-object p0, La/wne;->a:La/wne;

    .line 79
    .line 80
    iget-boolean v0, v11, La/vme;->j:Z

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    if-ne v0, v4, :cond_4

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-boolean v4, v11, La/vme;->j:Z

    .line 98
    .line 99
    new-instance p1, La/wij;

    .line 100
    .line 101
    const/4 v0, 0x2

    .line 102
    invoke-direct {p1, v2, v5, v0}, La/wij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v1, p1, v11}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, p0, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_3
    if-ne p1, p0, :cond_7

    .line 115
    .line 116
    move-object v5, p0

    .line 117
    goto :goto_5

    .line 118
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    :goto_5
    return-object v5

    .line 121
    :pswitch_1
    move-object v11, p0

    .line 122
    sget-object p0, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget-boolean v0, v11, La/vme;->j:Z

    .line 125
    .line 126
    if-eqz v0, :cond_9

    .line 127
    .line 128
    if-ne v0, v4, :cond_8

    .line 129
    .line 130
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_8

    .line 138
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iput-boolean v4, v11, La/vme;->j:Z

    .line 142
    .line 143
    new-instance p1, La/khx;

    .line 144
    .line 145
    const/4 v0, 0x7

    .line 146
    invoke-direct {p1, v1, v2, v5, v0}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 147
    .line 148
    .line 149
    invoke-static {v11, p1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-ne p1, p0, :cond_a

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_a
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    :goto_6
    if-ne p1, p0, :cond_b

    .line 159
    .line 160
    move-object v5, p0

    .line 161
    goto :goto_8

    .line 162
    :cond_b
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_8
    return-object v5

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
