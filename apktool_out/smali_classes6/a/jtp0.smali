.class public final synthetic La/jtp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rtp0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/rtp0;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jtp0;->a:B

    iput-object p1, p0, La/jtp0;->b:La/rtp0;

    iput-object p2, p0, La/jtp0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/jtp0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/jtp0;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/jtp0;->b:La/rtp0;

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
    iget-object v0, p0, La/rtp0;->A:La/cge0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/gsp0;

    .line 22
    .line 23
    iget-object v2, v2, La/gsp0;->d:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    move-object v5, v3

    .line 41
    check-cast v5, La/esp0;

    .line 42
    .line 43
    iget-object v5, v5, La/esp0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v3, v4

    .line 53
    :goto_0
    check-cast v3, La/esp0;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    iget-object v4, v3, La/esp0;->e:Ljava/lang/String;

    .line 58
    .line 59
    :cond_2
    if-nez v4, :cond_3

    .line 60
    .line 61
    const-string v4, ""

    .line 62
    .line 63
    :cond_3
    iget-wide v1, p0, La/rtp0;->F:J

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    invoke-static {v4, v1, v2, p0}, La/cge0;->g(Ljava/lang/String;JZ)Lorg/xplatform/statistic/stadium/impl/stadium/screen/StadiumScreen;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, Lorg/xplatform/statistic/team/impl/team_squad/presentation/TeamSquadStatisticScreen;

    .line 83
    .line 84
    invoke-virtual {p0, v1}, La/rtp0;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object p0, p0, La/rtp0;->D:Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;

    .line 89
    .line 90
    invoke-static {p0}, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/c;->a(Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {v0, v1, p0}, Lorg/xplatform/statistic/team/impl/team_squad/presentation/TeamSquadStatisticScreen;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
