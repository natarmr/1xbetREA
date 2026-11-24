.class public final La/p0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/tzi;

.field public final synthetic k:I

.field public final synthetic l:Z

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(La/tzi;IZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p0v;->j:La/tzi;

    .line 2
    .line 3
    iput p2, p0, La/p0v;->k:I

    .line 4
    .line 5
    iput-boolean p3, p0, La/p0v;->l:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/p0v;->m:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/p0v;

    .line 2
    .line 3
    iget-boolean v3, p0, La/p0v;->l:Z

    .line 4
    .line 5
    iget-boolean v4, p0, La/p0v;->m:Z

    .line 6
    .line 7
    iget-object v1, p0, La/p0v;->j:La/tzi;

    .line 8
    .line 9
    iget v2, p0, La/p0v;->k:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/p0v;-><init>(La/tzi;IZZLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/p0v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/p0v;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/p0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v1, p0, La/p0v;->j:La/tzi;

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, p0, La/p0v;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 28
    .line 29
    iget-object p1, v1, La/tzi;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/x4v;

    .line 32
    .line 33
    invoke-virtual {p1}, La/x4v;->a()La/krt0;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 41
    .line 42
    new-instance v0, La/g0g0;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object p1, v0

    .line 48
    :goto_0
    new-instance v4, La/krt0;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const-wide/16 v9, 0x0

    .line 52
    .line 53
    const-wide/16 v5, 0x0

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-direct/range {v4 .. v10}, La/krt0;-><init>(JZZD)V

    .line 57
    .line 58
    .line 59
    instance-of v0, p1, La/g0g0;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    move-object p1, v4

    .line 64
    :cond_2
    check-cast p1, La/krt0;

    .line 65
    .line 66
    iget-object v0, v1, La/tzi;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/zri;

    .line 69
    .line 70
    iget-boolean v9, p0, La/p0v;->l:Z

    .line 71
    .line 72
    if-eqz v9, :cond_3

    .line 73
    .line 74
    iget-boolean v4, p1, La/krt0;->c:Z

    .line 75
    .line 76
    :goto_1
    move v6, v4

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    iget-boolean v4, p1, La/krt0;->b:Z

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :goto_2
    iget-wide v7, p1, La/krt0;->a:J

    .line 82
    .line 83
    iget-object p1, v1, La/tzi;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, La/yiu;

    .line 86
    .line 87
    invoke-virtual {p1}, La/yiu;->a()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_5

    .line 92
    .line 93
    iget-object p1, v1, La/tzi;->k:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, La/n0o0;

    .line 96
    .line 97
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, La/sff0;

    .line 102
    .line 103
    iget-boolean p1, p1, La/sff0;->O1:Z

    .line 104
    .line 105
    if-eqz p1, :cond_4

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    const/4 p1, 0x0

    .line 109
    move v12, p1

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    :goto_3
    move v12, v3

    .line 112
    :goto_4
    iput-boolean v3, p0, La/p0v;->i:Z

    .line 113
    .line 114
    iget-object p1, v0, La/zri;->b:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v4, p1

    .line 117
    check-cast v4, La/uii;

    .line 118
    .line 119
    iget-object p1, v0, La/zri;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, La/j1q0;

    .line 122
    .line 123
    iget-object p1, p1, La/j1q0;->a:La/m1q0;

    .line 124
    .line 125
    invoke-virtual {p1}, La/m1q0;->j()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    iget v5, p0, La/p0v;->k:I

    .line 130
    .line 131
    iget-boolean v11, p0, La/p0v;->m:Z

    .line 132
    .line 133
    move-object v13, p0

    .line 134
    invoke-virtual/range {v4 .. v13}, La/uii;->l(IZJZZZZLa/zje;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v2, :cond_6

    .line 139
    .line 140
    return-object v2

    .line 141
    :cond_6
    :goto_5
    check-cast p1, Ljava/lang/Iterable;

    .line 142
    .line 143
    const/16 p0, 0x32

    .line 144
    .line 145
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0
.end method
