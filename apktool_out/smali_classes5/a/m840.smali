.class public final La/m840;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/pzu;

.field public j:Z

.field public k:Z

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/pzu;

.field public final synthetic o:D

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/Integer;

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(La/pzu;DJLjava/lang/Integer;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m840;->n:La/pzu;

    .line 2
    .line 3
    iput-wide p2, p0, La/m840;->o:D

    .line 4
    .line 5
    long-to-int p1, p4

    .line 6
    iput p1, p0, La/m840;->p:I

    .line 7
    .line 8
    iput-object p6, p0, La/m840;->q:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-boolean p7, p0, La/m840;->r:Z

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/m840;

    .line 2
    .line 3
    iget v1, p0, La/m840;->p:I

    .line 4
    .line 5
    int-to-long v4, v1

    .line 6
    iget-object v6, p0, La/m840;->q:Ljava/lang/Integer;

    .line 7
    .line 8
    iget-boolean v7, p0, La/m840;->r:Z

    .line 9
    .line 10
    iget-object v1, p0, La/m840;->n:La/pzu;

    .line 11
    .line 12
    iget-wide v2, p0, La/m840;->o:D

    .line 13
    .line 14
    move-object v8, p2

    .line 15
    invoke-direct/range {v0 .. v8}, La/m840;-><init>(La/pzu;DJLjava/lang/Integer;ZLa/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/m840;->m:Ljava/lang/Object;

    .line 19
    .line 20
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/m840;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/m840;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/m840;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/m840;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v0, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v1, p0, La/m840;->l:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, La/m840;->n:La/pzu;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    iget-boolean v4, p0, La/m840;->k:Z

    .line 18
    .line 19
    iget-boolean v0, p0, La/m840;->j:Z

    .line 20
    .line 21
    iget-object p0, p0, La/m840;->i:La/pzu;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p0, v0

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-wide v7, p0, La/m840;->o:D

    .line 40
    .line 41
    iget p1, p0, La/m840;->p:I

    .line 42
    .line 43
    int-to-long v9, p1

    .line 44
    iget-object v11, p0, La/m840;->q:Ljava/lang/Integer;

    .line 45
    .line 46
    iget-boolean p1, p0, La/m840;->r:Z

    .line 47
    .line 48
    :try_start_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 49
    .line 50
    iget-object v1, v3, La/pzu;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/gsj;

    .line 53
    .line 54
    iget-object v5, v3, La/pzu;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, La/btt0;

    .line 57
    .line 58
    invoke-virtual {v5}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iput-object v2, p0, La/m840;->m:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v3, p0, La/m840;->i:La/pzu;

    .line 65
    .line 66
    iput-boolean p1, p0, La/m840;->j:Z

    .line 67
    .line 68
    iput-boolean v4, p0, La/m840;->k:Z

    .line 69
    .line 70
    iput-boolean v4, p0, La/m840;->l:Z

    .line 71
    .line 72
    invoke-virtual {v1}, La/gsj;->a()La/s840;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string v12, "application/vnd.xenvelop+json"

    .line 77
    .line 78
    move-object v13, p0

    .line 79
    invoke-interface/range {v5 .. v13}, La/s840;->e(Ljava/lang/String;DJLjava/lang/Integer;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-ne p0, v0, :cond_2

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_2
    move v0, p1

    .line 87
    move-object p1, p0

    .line 88
    move-object p0, v3

    .line 89
    :goto_0
    check-cast p1, La/dx5;

    .line 90
    .line 91
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, La/c840;

    .line 96
    .line 97
    iget-object p1, p1, La/c840;->a:Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/4 p1, 0x0

    .line 107
    :goto_1
    if-eqz v0, :cond_5

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    iget-object v0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/h840;

    .line 114
    .line 115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    .line 117
    .line 118
    move-result-wide v1

    .line 119
    iput-wide v1, v0, La/h840;->b:J

    .line 120
    .line 121
    :cond_4
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/h840;

    .line 124
    .line 125
    invoke-virtual {p0, p1}, La/h840;->a(I)V

    .line 126
    .line 127
    .line 128
    :cond_5
    new-instance p0, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 131
    .line 132
    .line 133
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :goto_2
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 137
    .line 138
    new-instance p1, La/g0g0;

    .line 139
    .line 140
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object p0, p1

    .line 144
    :goto_3
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_6

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    instance-of p0, p1, La/oqt0;

    .line 152
    .line 153
    if-nez p0, :cond_7

    .line 154
    .line 155
    iget-object p0, v3, La/pzu;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, La/h840;

    .line 158
    .line 159
    iget p0, p0, La/h840;->a:I

    .line 160
    .line 161
    new-instance p1, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 164
    .line 165
    .line 166
    move-object p0, p1

    .line 167
    :goto_4
    return-object p0

    .line 168
    :cond_7
    throw p1
.end method
