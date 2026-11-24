.class public final La/ks00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ls00;


# direct methods
.method public synthetic constructor <init>(La/ls00;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ks00;->i:B

    iput-object p1, p0, La/ks00;->k:La/ls00;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ks00;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ks00;->k:La/ls00;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ks00;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ks00;-><init>(La/ls00;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ks00;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ks00;-><init>(La/ls00;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ks00;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ks00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ks00;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ks00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ks00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ks00;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ks00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ks00;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x1f

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v8, p0, La/ks00;->k:La/ls00;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v9, p0, La/ks00;->j:Z

    .line 19
    .line 20
    if-eqz v9, :cond_1

    .line 21
    .line 22
    if-ne v9, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v8, La/ls00;->a:La/us00;

    .line 36
    .line 37
    invoke-static {p1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, v8, La/ls00;->b:La/o2z;

    .line 45
    .line 46
    iget-object v5, v5, La/o2z;->a:La/ieu;

    .line 47
    .line 48
    iget-object v5, v5, La/ieu;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, La/es00;

    .line 51
    .line 52
    iget-wide v5, v5, La/es00;->a:J

    .line 53
    .line 54
    const-wide/32 v8, 0xea60

    .line 55
    .line 56
    .line 57
    div-long/2addr v5, v8

    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v10

    .line 62
    div-long/2addr v10, v8

    .line 63
    sub-long/2addr v10, v5

    .line 64
    const-wide/16 v5, 0x1e

    .line 65
    .line 66
    sub-long/2addr v5, v10

    .line 67
    cmp-long v8, v5, v3

    .line 68
    .line 69
    if-gez v8, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-wide v3, v5

    .line 73
    :goto_0
    invoke-static {p1, v3, v4}, La/r7x;->F(La/cpv0;J)V

    .line 74
    .line 75
    .line 76
    sget-object p1, La/bfn;->f:La/bfn;

    .line 77
    .line 78
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    iput-boolean v7, p0, La/ks00;->j:Z

    .line 83
    .line 84
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, v0, :cond_3

    .line 89
    .line 90
    move-object v5, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    :goto_2
    return-object v5

    .line 95
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v9, p0, La/ks00;->j:Z

    .line 98
    .line 99
    if-eqz v9, :cond_5

    .line 100
    .line 101
    if-ne v9, v7, :cond_4

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, v8, La/ls00;->a:La/us00;

    .line 115
    .line 116
    invoke-static {p1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v3, v4}, La/r7x;->F(La/cpv0;J)V

    .line 124
    .line 125
    .line 126
    sget-object p1, La/bfn;->f:La/bfn;

    .line 127
    .line 128
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    iput-boolean v7, p0, La/ks00;->j:Z

    .line 133
    .line 134
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v0, :cond_6

    .line 139
    .line 140
    move-object v5, v0

    .line 141
    goto :goto_4

    .line 142
    :cond_6
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    :goto_4
    return-object v5

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
