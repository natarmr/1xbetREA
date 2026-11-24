.class public final synthetic La/jzg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzg;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La/uzg;JJLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/jzg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jzg;->b:La/uzg;

    iput-wide p2, p0, La/jzg;->d:J

    iput-wide p4, p0, La/jzg;->e:J

    iput-object p6, p0, La/jzg;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(La/uzg;Ljava/lang/String;JJB)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/jzg;->a:B

    iput-object p1, p0, La/jzg;->b:La/uzg;

    iput-object p2, p0, La/jzg;->c:Ljava/lang/String;

    iput-wide p3, p0, La/jzg;->d:J

    iput-wide p5, p0, La/jzg;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/jzg;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/jzg;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/jzg;->b:La/uzg;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v2, La/uzg;->e:La/yfm0;

    .line 16
    .line 17
    check-cast v0, La/zfm0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, La/zfm0;->a:La/nai;

    .line 23
    .line 24
    new-instance v3, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 25
    .line 26
    invoke-direct {v3, v1}, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v4, 0x28

    .line 30
    .line 31
    iget-wide v6, p0, La/jzg;->d:J

    .line 32
    .line 33
    iget-wide v8, p0, La/jzg;->e:J

    .line 34
    .line 35
    invoke-virtual/range {v2 .. v9}, La/nai;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, v2, La/uzg;->e:La/yfm0;

    .line 49
    .line 50
    check-cast v0, La/zfm0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v2, v0, La/zfm0;->a:La/nai;

    .line 56
    .line 57
    new-instance v3, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 58
    .line 59
    invoke-direct {v3, v1}, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v4, 0x28

    .line 63
    .line 64
    iget-wide v6, p0, La/jzg;->d:J

    .line 65
    .line 66
    iget-wide v8, p0, La/jzg;->e:J

    .line 67
    .line 68
    invoke-virtual/range {v2 .. v9}, La/nai;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v0, v2, La/uzg;->b:La/vqc;

    .line 82
    .line 83
    new-instance v1, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 84
    .line 85
    iget-wide v2, p0, La/jzg;->d:J

    .line 86
    .line 87
    iget-wide v4, p0, La/jzg;->e:J

    .line 88
    .line 89
    iget-object v6, p0, La/jzg;->c:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;

    .line 95
    .line 96
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
