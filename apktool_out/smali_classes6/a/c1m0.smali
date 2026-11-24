.class public final La/c1m0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

.field public final synthetic k:La/nvu;


# direct methods
.method public constructor <init>(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;La/nvu;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c1m0;->j:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 2
    .line 3
    iput-object p2, p0, La/c1m0;->k:La/nvu;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/c1m0;

    .line 2
    .line 3
    iget-object v0, p0, La/c1m0;->j:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 4
    .line 5
    iget-object p0, p0, La/c1m0;->k:La/nvu;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/c1m0;-><init>(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;La/nvu;La/yje;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/c1m0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c1m0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c1m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/c1m0;->k:La/nvu;

    .line 2
    .line 3
    iget-object v1, v0, La/nvu;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/knf0;

    .line 6
    .line 7
    iget-object v0, v0, La/nvu;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/nw20;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v3, p0, La/c1m0;->i:B

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x1

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    if-eq v3, v6, :cond_1

    .line 21
    .line 22
    if-ne v3, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/c1m0;->j:Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 42
    .line 43
    invoke-static {p1}, Lorg/xplatform/statistic/stage/api/domain/c;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v7, p1, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 48
    .line 49
    const-string v8, "application/vnd.xenvelop+json"

    .line 50
    .line 51
    if-eqz v7, :cond_4

    .line 52
    .line 53
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v1}, La/knf0;->b()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v1, v3, p1}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-byte v6, p0, La/c1m0;->i:B

    .line 66
    .line 67
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/goi0;

    .line 70
    .line 71
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/xzl0;

    .line 76
    .line 77
    invoke-interface {v0, p1, v8, p0}, La/xzl0;->a(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v2, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :goto_0
    check-cast p1, La/dx5;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    instance-of p1, p1, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Champ;

    .line 88
    .line 89
    if-eqz p1, :cond_6

    .line 90
    .line 91
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v1}, La/knf0;->b()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {v1, v3, p1}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-byte v5, p0, La/c1m0;->i:B

    .line 104
    .line 105
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/goi0;

    .line 108
    .line 109
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/xzl0;

    .line 114
    .line 115
    invoke-interface {v0, p1, v8, p0}, La/xzl0;->b(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v2, :cond_5

    .line 120
    .line 121
    :goto_1
    return-object v2

    .line 122
    :cond_5
    :goto_2
    check-cast p1, La/dx5;

    .line 123
    .line 124
    :goto_3
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, La/f1m0;

    .line 129
    .line 130
    invoke-static {p0}, La/g8x;->Z(La/f1m0;)La/r1m0;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 136
    .line 137
    .line 138
    return-object v4
.end method
