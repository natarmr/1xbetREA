.class public final La/c1e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/g1e;


# direct methods
.method public synthetic constructor <init>(La/g1e;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c1e;->i:B

    iput-object p1, p0, La/c1e;->k:La/g1e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/c1e;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/c1e;->k:La/g1e;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/c1e;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/c1e;-><init>(La/g1e;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/c1e;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/c1e;-><init>(La/g1e;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/c1e;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/c1e;-><init>(La/g1e;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c1e;->i:B

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
    invoke-virtual {p0, p1, p2}, La/c1e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/c1e;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/c1e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/c1e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/c1e;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/c1e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/c1e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/c1e;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/c1e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/c1e;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/c1e;->k:La/g1e;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v6, p0, La/c1e;->j:Z

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    if-ne v6, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v4, La/g1e;->o:La/qgd;

    .line 33
    .line 34
    sget-object v2, La/ckk0;->f:La/ckk0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v6, La/zm70;

    .line 40
    .line 41
    const/16 v7, 0x8

    .line 42
    .line 43
    invoke-direct {v6, p1, v2, v5, v7}, La/zm70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    new-instance p1, La/vsg0;

    .line 47
    .line 48
    invoke-direct {p1, v6}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/jtb;

    .line 52
    .line 53
    const/16 v6, 0xf

    .line 54
    .line 55
    invoke-direct {v2, v4, v5, v6}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-boolean v3, p0, La/c1e;->j:Z

    .line 59
    .line 60
    new-instance v3, La/vnq;

    .line 61
    .line 62
    sget-object v4, La/h660;->a:La/h660;

    .line 63
    .line 64
    invoke-direct {v3, v4, v2, v1}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v3, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, v0, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_0
    if-ne p0, v0, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    if-ne p0, v0, :cond_4

    .line 82
    .line 83
    move-object v5, v0

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_3
    return-object v5

    .line 88
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 89
    .line 90
    iget-boolean v6, p0, La/c1e;->j:Z

    .line 91
    .line 92
    if-eqz v6, :cond_6

    .line 93
    .line 94
    if-ne v6, v3, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, v4, La/g1e;->l:La/yuu;

    .line 108
    .line 109
    invoke-virtual {p1}, La/yuu;->n()La/omi0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v2, La/jz6;

    .line 114
    .line 115
    invoke-direct {v2, v4, v1}, La/jz6;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    iput-boolean v3, p0, La/c1e;->j:Z

    .line 119
    .line 120
    invoke-virtual {p1, v2, p0}, La/omi0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-ne p0, v0, :cond_7

    .line 125
    .line 126
    move-object v5, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_5
    return-object v5

    .line 131
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 132
    .line 133
    iget-boolean v1, p0, La/c1e;->j:Z

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    if-ne v1, v3, :cond_8

    .line 138
    .line 139
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, v4, La/g1e;->m:La/suk;

    .line 151
    .line 152
    iput-boolean v3, p0, La/c1e;->j:Z

    .line 153
    .line 154
    invoke-virtual {p1}, La/suk;->a()Lkotlin/Unit;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, v0, :cond_a

    .line 159
    .line 160
    move-object v5, v0

    .line 161
    goto :goto_7

    .line 162
    :cond_a
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_7
    return-object v5

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
