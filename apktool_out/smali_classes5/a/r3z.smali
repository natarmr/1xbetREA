.class public final La/r3z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/tzi;

.field public final synthetic m:La/l4z;


# direct methods
.method public synthetic constructor <init>(La/tzi;La/l4z;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/r3z;->i:B

    iput-object p1, p0, La/r3z;->l:La/tzi;

    iput-object p2, p0, La/r3z;->m:La/l4z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/r3z;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/r3z;

    .line 7
    .line 8
    iget-object v1, p0, La/r3z;->m:La/l4z;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    iget-object p0, p0, La/r3z;->l:La/tzi;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/r3z;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/r3z;

    .line 20
    .line 21
    iget-object v1, p0, La/r3z;->m:La/l4z;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object p0, p0, La/r3z;->l:La/tzi;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2, v2}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/r3z;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La/r3z;

    .line 33
    .line 34
    iget-object v1, p0, La/r3z;->m:La/l4z;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iget-object p0, p0, La/r3z;->l:La/tzi;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1, p2, v2}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, La/r3z;->k:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r3z;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/f4z;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r3z;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/b4z;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r3z;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/x3z;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/r3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/r3z;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/r3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/r3z;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/r3z;->m:La/l4z;

    .line 4
    .line 5
    iget-object v2, p0, La/r3z;->l:La/tzi;

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
    iget-object v0, p0, La/r3z;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/f4z;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v7, p0, La/r3z;->j:Z

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v5, p0, La/r3z;->k:Ljava/lang/Object;

    .line 38
    .line 39
    iput-boolean v4, p0, La/r3z;->j:Z

    .line 40
    .line 41
    invoke-virtual {v2, v0, v1, p0}, La/tzi;->b(La/f4z;La/l4z;La/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-ne p0, v6, :cond_2

    .line 46
    .line 47
    move-object v5, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    :goto_1
    return-object v5

    .line 52
    :pswitch_0
    iget-object v0, p0, La/r3z;->k:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/b4z;

    .line 55
    .line 56
    sget-object v6, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v7, p0, La/r3z;->j:Z

    .line 59
    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    if-ne v7, v4, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast v1, La/j4z;

    .line 76
    .line 77
    iput-object v5, p0, La/r3z;->k:Ljava/lang/Object;

    .line 78
    .line 79
    iput-boolean v4, p0, La/r3z;->j:Z

    .line 80
    .line 81
    invoke-virtual {v2, v0, v1, p0}, La/tzi;->a(La/b4z;La/j4z;La/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v6, :cond_5

    .line 86
    .line 87
    move-object v5, v6

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_3
    return-object v5

    .line 92
    :pswitch_1
    iget-object v0, p0, La/r3z;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, La/x3z;

    .line 95
    .line 96
    sget-object v6, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v7, p0, La/r3z;->j:Z

    .line 99
    .line 100
    if-eqz v7, :cond_7

    .line 101
    .line 102
    if-ne v7, v4, :cond_6

    .line 103
    .line 104
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iput-object v5, p0, La/r3z;->k:Ljava/lang/Object;

    .line 116
    .line 117
    iput-boolean v4, p0, La/r3z;->j:Z

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    instance-of p0, v0, La/v3z;

    .line 123
    .line 124
    if-eqz p0, :cond_8

    .line 125
    .line 126
    new-instance p0, La/k4z;

    .line 127
    .line 128
    invoke-interface {v1}, La/l4z;->a()La/h4z;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p0, p1}, La/k4z;-><init>(La/h4z;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, v2, La/tzi;->k:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p1, La/p7m0;

    .line 138
    .line 139
    invoke-virtual {p1, v5, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_4
    if-ne p0, v6, :cond_9

    .line 148
    .line 149
    move-object v5, v6

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    :goto_6
    return-object v5

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
