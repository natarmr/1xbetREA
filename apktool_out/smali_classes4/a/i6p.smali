.class public final La/i6p;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/z5p;

.field public final synthetic k:La/k6p;


# direct methods
.method public constructor <init>(La/z5p;La/k6p;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i6p;->j:La/z5p;

    .line 2
    .line 3
    iput-object p2, p0, La/i6p;->k:La/k6p;

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
    new-instance p1, La/i6p;

    .line 2
    .line 3
    iget-object v0, p0, La/i6p;->j:La/z5p;

    .line 4
    .line 5
    iget-object p0, p0, La/i6p;->k:La/k6p;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/i6p;-><init>(La/z5p;La/k6p;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/i6p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/i6p;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/i6p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/i6p;->j:La/z5p;

    .line 2
    .line 3
    iget-wide v1, v0, La/z5p;->b:J

    .line 4
    .line 5
    sget-object v3, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v4, p0, La/i6p;->i:Z

    .line 8
    .line 9
    iget-object v5, p0, La/i6p;->k:La/k6p;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    if-ne v4, v6, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget p1, v0, La/z5p;->j:I

    .line 31
    .line 32
    const/4 v4, -0x1

    .line 33
    if-eq p1, v4, :cond_2

    .line 34
    .line 35
    :goto_0
    move v12, p1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const-wide/16 v7, 0x28

    .line 38
    .line 39
    cmp-long p1, v1, v7

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 44
    .line 45
    iget-byte p1, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget-object p1, v5, La/k6p;->k:La/msu;

    .line 49
    .line 50
    iput-boolean v6, p0, La/i6p;->i:Z

    .line 51
    .line 52
    invoke-virtual {p1, v1, v2, p0}, La/msu;->b(JLa/zje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v3, :cond_4

    .line 57
    .line 58
    return-object v3

    .line 59
    :cond_4
    :goto_1
    check-cast p1, La/ril0;

    .line 60
    .line 61
    iget-boolean p0, p1, La/ril0;->e:Z

    .line 62
    .line 63
    if-eqz p0, :cond_5

    .line 64
    .line 65
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 66
    .line 67
    iget-byte p1, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 71
    .line 72
    iget-byte p1, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :goto_2
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 76
    .line 77
    iget-byte p0, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 78
    .line 79
    if-ne v12, p0, :cond_6

    .line 80
    .line 81
    iget-wide v1, v0, La/z5p;->c:J

    .line 82
    .line 83
    :cond_6
    move-wide v8, v1

    .line 84
    iget-object p0, v5, La/k6p;->c:La/hzg;

    .line 85
    .line 86
    iget-object p1, v0, La/z5p;->d:La/sgb;

    .line 87
    .line 88
    invoke-interface {p1}, La/sgb;->b()J

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    iget-object v7, v0, La/z5p;->e:Ljava/lang/String;

    .line 93
    .line 94
    sget-object p1, La/k1g;->b:La/k1g;

    .line 95
    .line 96
    move-object v6, p0

    .line 97
    check-cast v6, La/uzg;

    .line 98
    .line 99
    invoke-virtual/range {v6 .. v12}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method
