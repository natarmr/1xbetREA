.class public final La/j92;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/n92;


# direct methods
.method public synthetic constructor <init>(La/n92;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j92;->i:B

    iput-object p1, p0, La/j92;->k:La/n92;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/j92;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/j92;->k:La/n92;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/j92;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/j92;-><init>(La/n92;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/j92;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/j92;-><init>(La/n92;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j92;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/j92;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/j92;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/j92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/j92;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/j92;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/j92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/j92;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/j92;->k:La/n92;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v3, La/n92;->X:La/sff0;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/j92;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v7, v3, La/n92;->V:La/pwi;

    .line 34
    .line 35
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, La/d92;

    .line 40
    .line 41
    iget-object p1, p1, La/d92;->b:La/b92;

    .line 42
    .line 43
    iget v8, p1, La/b92;->a:I

    .line 44
    .line 45
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    iget-boolean v10, v0, La/sff0;->J1:Z

    .line 50
    .line 51
    iget-object p1, v3, La/n92;->W:La/yiu;

    .line 52
    .line 53
    invoke-virtual {p1}, La/yiu;->a()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iget-boolean p1, v0, La/sff0;->O1:Z

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/4 p1, 0x0

    .line 65
    move v11, p1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    move v11, v4

    .line 68
    :goto_1
    iput-boolean v4, p0, La/j92;->j:Z

    .line 69
    .line 70
    const/4 v12, 0x1

    .line 71
    move-object v13, p0

    .line 72
    invoke-virtual/range {v7 .. v13}, La/pwi;->n(ILa/bvc;ZZZLa/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v5, :cond_4

    .line 77
    .line 78
    move-object v1, v5

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_3
    return-object v1

    .line 83
    :pswitch_0
    move-object v7, p0

    .line 84
    sget-object p0, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-boolean v0, v7, La/j92;->j:Z

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    if-ne v0, v4, :cond_5

    .line 91
    .line 92
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v2, v3, La/n92;->t:La/yhi;

    .line 104
    .line 105
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/d92;

    .line 110
    .line 111
    iget-object p1, p1, La/d92;->b:La/b92;

    .line 112
    .line 113
    iget p1, p1, La/b92;->a:I

    .line 114
    .line 115
    move v0, v4

    .line 116
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    sget-object v5, La/n0w;->a:La/n0w;

    .line 121
    .line 122
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, La/d92;

    .line 127
    .line 128
    iget-object v1, v1, La/d92;->b:La/b92;

    .line 129
    .line 130
    iget-boolean v6, v1, La/b92;->g:Z

    .line 131
    .line 132
    iput-boolean v0, v7, La/j92;->j:Z

    .line 133
    .line 134
    move v3, p1

    .line 135
    invoke-virtual/range {v2 .. v7}, La/yhi;->e(ILa/bvc;La/n0w;ZLa/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, p0, :cond_7

    .line 140
    .line 141
    move-object v1, p0

    .line 142
    goto :goto_5

    .line 143
    :cond_7
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_5
    return-object v1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
