.class public final La/dsi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/so6;


# direct methods
.method public synthetic constructor <init>(La/so6;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dsi0;->a:La/so6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/jg7;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/dsi0;->a:La/so6;

    .line 2
    .line 3
    iget-object p0, p0, La/so6;->b:La/gs6;

    .line 4
    .line 5
    iget-object p0, p0, La/gs6;->d:La/qoj0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/wne;->a:La/wne;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    :goto_0
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    :goto_1
    if-ne p0, p1, :cond_2

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public b(J)Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object p0, p0, La/dsi0;->a:La/so6;

    .line 2
    .line 3
    iget-object p0, p0, La/so6;->b:La/gs6;

    .line 4
    .line 5
    iget-object v0, p0, La/gs6;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 33
    .line 34
    iget-wide v3, v2, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 35
    .line 36
    cmp-long v3, v3, p1

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    iget-boolean v3, v2, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->h:Z

    .line 41
    .line 42
    xor-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    const/16 v4, 0x17f

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-static {v2, v5, v3, v4}, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->a(Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;Ljava/util/ArrayList;ZI)Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/gs6;->c:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    return-object v1
.end method
