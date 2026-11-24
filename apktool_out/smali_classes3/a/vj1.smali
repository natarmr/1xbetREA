.class public final La/vj1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bk1;


# direct methods
.method public synthetic constructor <init>(La/bk1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vj1;->i:B

    iput-object p1, p0, La/vj1;->k:La/bk1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vj1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vj1;->k:La/bk1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/vj1;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/vj1;-><init>(La/bk1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/vj1;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/vj1;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/vj1;-><init>(La/bk1;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/vj1;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/vj1;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/vj1;-><init>(La/bk1;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/vj1;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vj1;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/vj1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vj1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vj1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/f2j;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/vj1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/vj1;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/vj1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/vj1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/vj1;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/vj1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/vj1;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/vj1;->k:La/bk1;

    .line 4
    .line 5
    iget-object p0, p0, La/vj1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, La/sw00;

    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p0, La/bk1;->D:I

    .line 19
    .line 20
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v2, p0, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object v3, p0

    .line 32
    check-cast v3, La/j8d0;

    .line 33
    .line 34
    iget-boolean v4, v0, La/sw00;->a:Z

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/16 v8, 0xff7

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-static/range {v3 .. v8}, La/j8d0;->a(La/j8d0;ZLa/e8d0;Ljava/util/Set;La/fk80;I)La/j8d0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v2, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    iget-boolean p0, v0, La/sw00;->a:Z

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1}, La/bk1;->M()V

    .line 56
    .line 57
    .line 58
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    check-cast p0, La/f2j;

    .line 62
    .line 63
    sget-object v0, La/wne;->a:La/wne;

    .line 64
    .line 65
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    instance-of p0, p0, La/f2j;

    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    const-class p0, La/qj1;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget v0, La/bk1;->D:I

    .line 82
    .line 83
    sget-object v0, La/a4j;->c:La/usd;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, La/usd;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget-object v0, v1, La/bk1;->y:La/b4j;

    .line 93
    .line 94
    invoke-virtual {v0, p0}, La/b4j;->k(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v1, La/bk1;->A:La/je;

    .line 98
    .line 99
    invoke-virtual {v0, p0}, La/je;->k(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, La/f8d0;->a:La/f8d0;

    .line 103
    .line 104
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, v1, La/bk1;->z:La/j2j;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, La/j2j;->o:La/bby;

    .line 113
    .line 114
    if-eqz p0, :cond_2

    .line 115
    .line 116
    invoke-interface {p0, p1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 123
    .line 124
    .line 125
    :goto_0
    return-object p1

    .line 126
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 127
    .line 128
    sget-object v0, La/wne;->a:La/wne;

    .line 129
    .line 130
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, La/bo0;

    .line 134
    .line 135
    const/4 v0, 0x5

    .line 136
    invoke-direct {p1, p0, v0}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 137
    .line 138
    .line 139
    sget p0, La/bk1;->D:I

    .line 140
    .line 141
    invoke-virtual {v1, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
