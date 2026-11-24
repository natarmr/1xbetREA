.class public final La/v2r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/sip;

.field public j:La/jvn;

.field public k:La/jtj;

.field public l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

.field public m:B

.field public final synthetic n:La/z2r0;

.field public final synthetic o:La/sip;

.field public final synthetic p:La/jvn;


# direct methods
.method public constructor <init>(La/z2r0;La/sip;La/jvn;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v2r0;->n:La/z2r0;

    .line 2
    .line 3
    iput-object p2, p0, La/v2r0;->o:La/sip;

    .line 4
    .line 5
    iput-object p3, p0, La/v2r0;->p:La/jvn;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/v2r0;

    .line 2
    .line 3
    iget-object v0, p0, La/v2r0;->o:La/sip;

    .line 4
    .line 5
    iget-object v1, p0, La/v2r0;->p:La/jvn;

    .line 6
    .line 7
    iget-object p0, p0, La/v2r0;->n:La/z2r0;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/v2r0;-><init>(La/z2r0;La/sip;La/jvn;La/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/v2r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/v2r0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/v2r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/v2r0;->m:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/v2r0;->i:La/sip;

    .line 15
    .line 16
    check-cast p0, La/z2r0;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_1
    iget-object v1, p0, La/v2r0;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 29
    .line 30
    iget-object v3, p0, La/v2r0;->k:La/jtj;

    .line 31
    .line 32
    iget-object v5, p0, La/v2r0;->j:La/jvn;

    .line 33
    .line 34
    iget-object v6, p0, La/v2r0;->i:La/sip;

    .line 35
    .line 36
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    move-object v7, v1

    .line 40
    :goto_0
    move-object v9, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/v2r0;->n:La/z2r0;

    .line 46
    .line 47
    iget-object v6, p0, La/v2r0;->o:La/sip;

    .line 48
    .line 49
    iget-object v5, p0, La/v2r0;->p:La/jvn;

    .line 50
    .line 51
    :try_start_2
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 52
    .line 53
    iget-object v1, p1, La/z2r0;->d:La/jtj;

    .line 54
    .line 55
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 56
    .line 57
    iput-object v6, p0, La/v2r0;->i:La/sip;

    .line 58
    .line 59
    iput-object v5, p0, La/v2r0;->j:La/jvn;

    .line 60
    .line 61
    iput-object v1, p0, La/v2r0;->k:La/jtj;

    .line 62
    .line 63
    iput-object v7, p0, La/v2r0;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 64
    .line 65
    iput-byte v3, p0, La/v2r0;->m:B

    .line 66
    .line 67
    invoke-virtual {p1, p0}, La/z2r0;->a(La/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v3, v1

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    iput-object v4, p0, La/v2r0;->i:La/sip;

    .line 83
    .line 84
    iput-object v4, p0, La/v2r0;->j:La/jvn;

    .line 85
    .line 86
    iput-object v4, p0, La/v2r0;->k:La/jtj;

    .line 87
    .line 88
    iput-object v4, p0, La/v2r0;->l:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 89
    .line 90
    iput-byte v2, p0, La/v2r0;->m:B

    .line 91
    .line 92
    iget-object p1, v3, La/jtj;->b:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, p1

    .line 95
    check-cast v5, La/sb6;

    .line 96
    .line 97
    iget-object p1, v3, La/jtj;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, La/gst0;

    .line 100
    .line 101
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    move-object v11, p0

    .line 106
    invoke-virtual/range {v5 .. v11}, La/sb6;->a(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;ILa/jvn;ZLa/zje;)Ljava/io/Serializable;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_4

    .line 111
    .line 112
    :goto_2
    return-object v0

    .line 113
    :cond_4
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 114
    .line 115
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    move-object p0, v0

    .line 120
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 121
    .line 122
    new-instance p1, La/g0g0;

    .line 123
    .line 124
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    new-instance p0, La/j0g0;

    .line 128
    .line 129
    invoke-direct {p0, p1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-object p0
.end method
