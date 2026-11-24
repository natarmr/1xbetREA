.class public final La/onv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qnv0;


# direct methods
.method public synthetic constructor <init>(La/qnv0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/onv0;->i:B

    iput-object p1, p0, La/onv0;->k:La/qnv0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/onv0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/onv0;->k:La/qnv0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/onv0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/onv0;-><init>(La/qnv0;La/yje;B)V

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
    iput-boolean p0, v0, La/onv0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/onv0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/onv0;-><init>(La/qnv0;La/yje;B)V

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
    iget-byte v0, p0, La/onv0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/onv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/onv0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/onv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/onv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/onv0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/onv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/onv0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/onv0;->k:La/qnv0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, La/onv0;->j:Z

    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/jnv0;

    .line 24
    .line 25
    iget-boolean v0, v0, La/jnv0;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, p1

    .line 32
    :goto_0
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/jnv0;

    .line 39
    .line 40
    iget-boolean p0, p0, La/jnv0;->b:Z

    .line 41
    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/jnv0;

    .line 49
    .line 50
    iget-boolean p0, p0, La/jnv0;->c:Z

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v2, p1

    .line 56
    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    :cond_3
    sget p0, La/qnv0;->x:I

    .line 61
    .line 62
    invoke-virtual {v1}, La/qnv0;->M()V

    .line 63
    .line 64
    .line 65
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    iget-boolean v3, p0, La/onv0;->j:Z

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v3, :cond_6

    .line 74
    .line 75
    if-ne v3, v2, :cond_5

    .line 76
    .line 77
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    move-object v0, v4

    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, v1, La/qnv0;->o:La/g2v;

    .line 92
    .line 93
    iget-object v3, v1, La/qnv0;->s:Ljava/lang/String;

    .line 94
    .line 95
    iput-boolean v2, p0, La/onv0;->j:Z

    .line 96
    .line 97
    iget-object p1, p1, La/g2v;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, La/klv0;

    .line 100
    .line 101
    iget-object v2, p1, La/klv0;->c:La/mne;

    .line 102
    .line 103
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 104
    .line 105
    new-instance v5, La/j0q0;

    .line 106
    .line 107
    const/4 v6, 0x2

    .line 108
    invoke-direct {v5, p1, v3, v4, v6}, La/j0q0;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_7

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    :goto_2
    move-object v6, p1

    .line 119
    check-cast v6, Ljava/util/List;

    .line 120
    .line 121
    sget p0, La/qnv0;->x:I

    .line 122
    .line 123
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 124
    .line 125
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 126
    .line 127
    :cond_8
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-object v2, p1

    .line 135
    check-cast v2, La/jnv0;

    .line 136
    .line 137
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    const/16 v7, 0x10

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    const/4 v4, 0x0

    .line 145
    invoke-static/range {v2 .. v7}, La/jnv0;->a(La/jnv0;ZZZLjava/util/List;I)La/jnv0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    :goto_3
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
