.class public final La/n1c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/s1c;


# direct methods
.method public constructor <init>(La/s1c;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n1c;->j:La/s1c;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/n1c;

    .line 2
    .line 3
    iget-object p0, p0, La/n1c;->j:La/s1c;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/n1c;-><init>(La/s1c;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/n1c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/n1c;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/n1c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v7, p0, La/n1c;->j:La/s1c;

    .line 2
    .line 3
    iget-object v0, v7, La/s1c;->o:La/xzb;

    .line 4
    .line 5
    sget-object v8, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v1, p0, La/n1c;->i:B

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x3

    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v5, :cond_2

    .line 16
    .line 17
    if-eq v1, v4, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object v0, p1

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v0, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object v0, p1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v7, La/s1c;->u:Lorg/xplatform/security/api/presentation/models/SendEmailIntention;

    .line 46
    .line 47
    if-eqz v1, :cond_9

    .line 48
    .line 49
    instance-of v9, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;

    .line 50
    .line 51
    if-eqz v9, :cond_5

    .line 52
    .line 53
    iget-object v1, v7, La/s1c;->y:La/swp0;

    .line 54
    .line 55
    iput-byte v5, p0, La/n1c;->i:B

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, v1, v2, p0}, La/xzb;->a(La/swp0;ZLa/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v8, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    :goto_0
    check-cast v0, La/pfi0;

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_5
    instance-of v9, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;

    .line 69
    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    iget-object v0, v7, La/s1c;->f:La/n5c;

    .line 73
    .line 74
    iget-object v1, v7, La/s1c;->y:La/swp0;

    .line 75
    .line 76
    sget-object v2, La/obk0;->c:La/obk0;

    .line 77
    .line 78
    iput-byte v4, p0, La/n1c;->i:B

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x1

    .line 82
    const-string v5, ""

    .line 83
    .line 84
    move-object v6, p0

    .line 85
    invoke-virtual/range {v0 .. v6}, La/n5c;->a(La/swp0;La/obk0;IZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-ne v0, v8, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    :goto_1
    check-cast v0, La/pfi0;

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    instance-of v1, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 96
    .line 97
    if-eqz v1, :cond_9

    .line 98
    .line 99
    iget-object v1, v7, La/s1c;->y:La/swp0;

    .line 100
    .line 101
    iput-byte v3, p0, La/n1c;->i:B

    .line 102
    .line 103
    invoke-virtual {v0, v1, v5, p0}, La/xzb;->a(La/swp0;ZLa/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-ne v0, v8, :cond_8

    .line 108
    .line 109
    :goto_2
    return-object v8

    .line 110
    :cond_8
    :goto_3
    check-cast v0, La/pfi0;

    .line 111
    .line 112
    :goto_4
    iget-object v1, v0, La/pfi0;->b:La/swp0;

    .line 113
    .line 114
    iput-object v1, v7, La/s1c;->y:La/swp0;

    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v1

    .line 120
    iget v0, v0, La/pfi0;->a:I

    .line 121
    .line 122
    int-to-long v3, v0

    .line 123
    const-wide/16 v5, 0x3e8

    .line 124
    .line 125
    mul-long/2addr v3, v5

    .line 126
    add-long/2addr v3, v1

    .line 127
    iget-object v0, v7, La/s1c;->b:La/vzg0;

    .line 128
    .line 129
    const-string v1, "SAVED_FINISH_TIME"

    .line 130
    .line 131
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0, v1, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7}, La/s1c;->E()V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 145
    .line 146
    .line 147
    return-object v2
.end method
