.class public final La/pkw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/ukw;


# direct methods
.method public constructor <init>(La/ukw;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pkw;->j:La/ukw;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/pkw;

    .line 2
    .line 3
    iget-object p0, p0, La/pkw;->j:La/ukw;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/pkw;-><init>(La/ukw;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/pkw;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pkw;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/pkw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/pkw;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget p1, La/ukw;->X:I

    .line 26
    .line 27
    iget-object p1, p0, La/pkw;->j:La/ukw;

    .line 28
    .line 29
    invoke-virtual {p1}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/zjw;

    .line 34
    .line 35
    iget-boolean v1, v1, La/zjw;->f:Z

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-object v1, p1, La/ukw;->o:Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 40
    .line 41
    iget-object v1, v1, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 42
    .line 43
    instance-of v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance v1, La/fr2;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v1, La/jr2;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    new-instance v1, La/rq2;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v4, p1, La/ukw;->v:La/hjd;

    .line 65
    .line 66
    new-instance v5, La/cid;

    .line 67
    .line 68
    invoke-virtual {p1}, La/i3t0;->D()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, La/zjw;

    .line 73
    .line 74
    iget-boolean v6, v6, La/zjw;->f:Z

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    const-string p1, "popular_new_esports"

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    invoke-virtual {p1}, La/i3t0;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, La/zjw;

    .line 86
    .line 87
    iget-object p1, p1, La/zjw;->g:La/ekw;

    .line 88
    .line 89
    iget-object p1, p1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 90
    .line 91
    if-eqz p1, :cond_8

    .line 92
    .line 93
    instance-of v6, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 94
    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    sget-object p1, La/r1g;->k:La/r1g;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    instance-of v6, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 101
    .line 102
    if-eqz v6, :cond_6

    .line 103
    .line 104
    sget-object p1, La/r1g;->l:La/r1g;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    instance-of p1, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 108
    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    sget-object p1, La/r1g;->c:La/r1g;

    .line 112
    .line 113
    :goto_1
    iget-object p1, p1, La/r1g;->a:Ljava/lang/String;

    .line 114
    .line 115
    :goto_2
    invoke-direct {v5, p1, v1}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 116
    .line 117
    .line 118
    iput-boolean v3, p0, La/pkw;->i:Z

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v5, p0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v0, :cond_7

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    return-object v2
.end method
