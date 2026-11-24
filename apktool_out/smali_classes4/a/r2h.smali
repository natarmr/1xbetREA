.class public final La/r2h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/o3c;

.field public final synthetic m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic n:La/sip;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:J


# direct methods
.method public constructor <init>(La/yje;La/o3c;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;J)V
    .locals 0

    .line 1
    iput-object p2, p0, La/r2h;->l:La/o3c;

    .line 2
    .line 3
    iput-object p3, p0, La/r2h;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 4
    .line 5
    iput-object p4, p0, La/r2h;->n:La/sip;

    .line 6
    .line 7
    iput-object p5, p0, La/r2h;->o:Ljava/util/List;

    .line 8
    .line 9
    iput-wide p6, p0, La/r2h;->p:J

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/r2h;

    .line 7
    .line 8
    iget-object v5, p0, La/r2h;->o:Ljava/util/List;

    .line 9
    .line 10
    iget-wide v6, p0, La/r2h;->p:J

    .line 11
    .line 12
    iget-object v2, p0, La/r2h;->l:La/o3c;

    .line 13
    .line 14
    iget-object v3, p0, La/r2h;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 15
    .line 16
    iget-object v4, p0, La/r2h;->n:La/sip;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, La/r2h;-><init>(La/yje;La/o3c;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;J)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/r2h;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/r2h;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/r2h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/r2h;->i:Z

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
    goto :goto_2

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/r2h;->j:La/kmq;

    .line 25
    .line 26
    iget-object v1, p0, La/r2h;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget-object v1, p0, La/r2h;->l:La/o3c;

    .line 35
    .line 36
    iget-object v4, v1, La/o3c;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, La/cqc;

    .line 39
    .line 40
    iget-object v4, v4, La/cqc;->a:La/cog;

    .line 41
    .line 42
    iget-object v4, v4, La/cog;->a:La/dog;

    .line 43
    .line 44
    iget-object v12, v4, La/dog;->a:La/p7m0;

    .line 45
    .line 46
    iget-object v1, v1, La/o3c;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/bwl;

    .line 49
    .line 50
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/cog;

    .line 53
    .line 54
    iget-object v1, v1, La/cog;->a:La/dog;

    .line 55
    .line 56
    iget-object v1, v1, La/dog;->b:La/p7m0;

    .line 57
    .line 58
    new-instance v4, La/p2h;

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    iget-object v5, p0, La/r2h;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 62
    .line 63
    iget-object v6, p0, La/r2h;->n:La/sip;

    .line 64
    .line 65
    iget-object v7, p0, La/r2h;->o:Ljava/util/List;

    .line 66
    .line 67
    iget-wide v9, p0, La/r2h;->p:J

    .line 68
    .line 69
    invoke-direct/range {v4 .. v11}, La/p2h;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;Ljava/util/List;IJLa/yje;)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, La/r2h;->j:La/kmq;

    .line 73
    .line 74
    iput-object v2, p0, La/r2h;->k:Ljava/lang/Object;

    .line 75
    .line 76
    iput-boolean v3, p0, La/r2h;->i:Z

    .line 77
    .line 78
    invoke-static {p1}, La/f7k;->J(La/kmq;)V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x2

    .line 82
    new-array v5, v5, [La/gmq;

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    aput-object v12, v5, v6

    .line 86
    .line 87
    aput-object v1, v5, v3

    .line 88
    .line 89
    sget-object v1, La/pul;->j:La/pul;

    .line 90
    .line 91
    new-instance v3, La/kh1;

    .line 92
    .line 93
    const/16 v6, 0x9

    .line 94
    .line 95
    invoke-direct {v3, v4, v2, v6}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p1, v3, v1, v5}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object p1, La/wne;->a:La/wne;

    .line 103
    .line 104
    if-ne p0, p1, :cond_2

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_0
    sget-object p1, La/wne;->a:La/wne;

    .line 110
    .line 111
    if-ne p0, p1, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    :goto_1
    if-ne p0, v0, :cond_4

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0
.end method
