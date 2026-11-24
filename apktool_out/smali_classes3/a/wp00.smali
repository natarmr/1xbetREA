.class public final La/wp00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/bq00;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/bq00;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wp00;->i:B

    iput-object p1, p0, La/wp00;->j:La/bq00;

    iput-object p2, p0, La/wp00;->k:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wp00;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/wp00;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/wp00;->j:La/bq00;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/wp00;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, La/wp00;-><init>(La/bq00;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wp00;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p0, v1, p1, v2}, La/wp00;-><init>(La/bq00;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wp00;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/wp00;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/wp00;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/wp00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/wp00;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/wp00;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/wp00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/wp00;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x1d

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget p1, La/bq00;->n0:I

    .line 18
    .line 19
    iget-object v7, p0, La/wp00;->j:La/bq00;

    .line 20
    .line 21
    iget-object p1, v7, La/bq00;->q:La/pru;

    .line 22
    .line 23
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/sff0;->R0:La/tm3;

    .line 28
    .line 29
    iget-object p1, p1, La/tm3;->d:La/qm3;

    .line 30
    .line 31
    sget-object v0, La/qm3;->d:La/qm3;

    .line 32
    .line 33
    if-ne p1, v0, :cond_0

    .line 34
    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    if-lt v0, v2, :cond_0

    .line 38
    .line 39
    move v9, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v9, v4

    .line 42
    :goto_0
    sget-object v0, La/qm3;->c:La/qm3;

    .line 43
    .line 44
    if-ne p1, v0, :cond_1

    .line 45
    .line 46
    move v10, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v10, v4

    .line 49
    :goto_1
    if-nez v9, :cond_2

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance v6, La/yp00;

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x1

    .line 58
    iget-object v8, p0, La/wp00;->k:Ljava/lang/String;

    .line 59
    .line 60
    invoke-direct/range {v6 .. v12}, La/yp00;-><init>(La/bq00;Ljava/lang/String;ZZLa/yje;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v7, v5, v5, v6, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 64
    .line 65
    .line 66
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget p1, La/bq00;->n0:I

    .line 75
    .line 76
    iget-object v7, p0, La/wp00;->j:La/bq00;

    .line 77
    .line 78
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, La/cp00;

    .line 83
    .line 84
    iget-object p1, p1, La/cp00;->c:La/hh3;

    .line 85
    .line 86
    iget-object p1, p1, La/hh3;->b:La/eh3;

    .line 87
    .line 88
    sget-object v0, La/eh3;->d:La/eh3;

    .line 89
    .line 90
    if-ne p1, v0, :cond_3

    .line 91
    .line 92
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    if-lt p1, v2, :cond_3

    .line 95
    .line 96
    move v9, v3

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    move v9, v4

    .line 99
    :goto_3
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, La/cp00;

    .line 104
    .line 105
    iget-object p1, p1, La/cp00;->c:La/hh3;

    .line 106
    .line 107
    iget-object p1, p1, La/hh3;->b:La/eh3;

    .line 108
    .line 109
    sget-object v0, La/eh3;->c:La/eh3;

    .line 110
    .line 111
    if-ne p1, v0, :cond_4

    .line 112
    .line 113
    move v10, v3

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move v10, v4

    .line 116
    :goto_4
    if-nez v9, :cond_5

    .line 117
    .line 118
    if-nez v10, :cond_5

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_5
    new-instance v6, La/yp00;

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    const/4 v12, 0x0

    .line 125
    iget-object v8, p0, La/wp00;->k:Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct/range {v6 .. v12}, La/yp00;-><init>(La/bq00;Ljava/lang/String;ZZLa/yje;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v7, v5, v5, v6, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 131
    .line 132
    .line 133
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
