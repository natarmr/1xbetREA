.class public final La/i830;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:La/l830;


# direct methods
.method public constructor <init>(La/l830;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i830;->i:La/l830;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance p1, La/i830;

    .line 8
    .line 9
    iget-object p0, p0, La/i830;->i:La/l830;

    .line 10
    .line 11
    invoke-direct {p1, p0, p3}, La/i830;-><init>(La/l830;La/yje;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, La/i830;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/i830;->i:La/l830;

    .line 7
    .line 8
    iget-object p1, p0, La/l830;->u:La/owp0;

    .line 9
    .line 10
    sget-object v0, La/idf0;->a:La/idf0;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, La/owp0;->g(La/ldf0;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/l830;->q:La/ikt0;

    .line 16
    .line 17
    sget-object v0, La/lx7;->a:La/lx7;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, La/ikt0;->b(La/px7;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, La/m730;

    .line 35
    .line 36
    iget-object v2, v1, La/m730;->b:Ljava/util/Map;

    .line 37
    .line 38
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, La/l830;->x:Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;

    .line 44
    .line 45
    iget-wide v4, v2, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;->c:J

    .line 46
    .line 47
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v4, La/yw7;->a:La/yw7;

    .line 52
    .line 53
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/16 v9, 0xfd

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const-wide/16 v5, 0x0

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    invoke-static/range {v1 .. v9}, La/m730;->a(La/m730;Ljava/util/List;Ljava/util/LinkedHashMap;La/l9s;JLa/aw20;La/ycs;I)La/m730;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0
.end method
