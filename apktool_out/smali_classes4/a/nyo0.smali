.class public final La/nyo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pyo0;


# direct methods
.method public synthetic constructor <init>(La/pyo0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nyo0;->a:B

    iput-object p1, p0, La/nyo0;->b:La/pyo0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p2, p0, La/nyo0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nyo0;->b:La/pyo0;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    iget-object p2, p0, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 11
    .line 12
    iget-wide v0, p2, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 13
    .line 14
    invoke-static {v0, v1, p1}, La/axq;->y(JLjava/util/List;)Z

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 19
    .line 20
    iget-object p2, p1, La/ocj;->a:La/p7m0;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, La/kyo0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/16 v8, 0x5f

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static/range {v2 .. v8}, La/kyo0;->a(La/kyo0;La/jyo0;Ljava/lang/String;La/j3p0;ZZI)La/kyo0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    iget-object p2, p0, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 59
    .line 60
    iget-wide v0, p2, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 61
    .line 62
    invoke-static {v0, v1, p1}, La/axq;->y(JLjava/util/List;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 69
    .line 70
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 78
    .line 79
    move-object v2, p2

    .line 80
    check-cast v2, La/kyo0;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/16 v8, 0x3f

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static/range {v2 .. v8}, La/kyo0;->a(La/kyo0;La/jyo0;Ljava/lang/String;La/j3p0;ZZI)La/kyo0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, p2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_1

    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
