.class public final La/jo3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Z

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:Z

.field public final synthetic o:La/dz5;


# direct methods
.method public synthetic constructor <init>(La/dz5;ZJJJZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p11, p0, La/jo3;->i:B

    iput-object p1, p0, La/jo3;->o:La/dz5;

    iput-boolean p2, p0, La/jo3;->j:Z

    iput-wide p3, p0, La/jo3;->k:J

    iput-wide p5, p0, La/jo3;->l:J

    iput-wide p7, p0, La/jo3;->m:J

    iput-boolean p9, p0, La/jo3;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jo3;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/jo3;->o:La/dz5;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/jo3;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesSmallProvider;

    .line 14
    .line 15
    iget-boolean v12, v0, La/jo3;->n:Z

    .line 16
    .line 17
    const/4 v14, 0x2

    .line 18
    iget-boolean v5, v0, La/jo3;->j:Z

    .line 19
    .line 20
    iget-wide v6, v0, La/jo3;->k:J

    .line 21
    .line 22
    iget-wide v8, v0, La/jo3;->l:J

    .line 23
    .line 24
    iget-wide v10, v0, La/jo3;->m:J

    .line 25
    .line 26
    move-object/from16 v13, p2

    .line 27
    .line 28
    invoke-direct/range {v3 .. v14}, La/jo3;-><init>(La/dz5;ZJJJZLa/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :pswitch_0
    new-instance v4, La/jo3;

    .line 33
    .line 34
    move-object v5, v2

    .line 35
    check-cast v5, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesLargeProvider;

    .line 36
    .line 37
    iget-boolean v13, v0, La/jo3;->n:Z

    .line 38
    .line 39
    const/4 v15, 0x1

    .line 40
    iget-boolean v6, v0, La/jo3;->j:Z

    .line 41
    .line 42
    iget-wide v7, v0, La/jo3;->k:J

    .line 43
    .line 44
    iget-wide v9, v0, La/jo3;->l:J

    .line 45
    .line 46
    iget-wide v11, v0, La/jo3;->m:J

    .line 47
    .line 48
    move-object/from16 v14, p2

    .line 49
    .line 50
    invoke-direct/range {v4 .. v15}, La/jo3;-><init>(La/dz5;ZJJJZLa/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :pswitch_1
    new-instance v4, La/jo3;

    .line 55
    .line 56
    move-object v5, v2

    .line 57
    check-cast v5, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesDefaultProvider;

    .line 58
    .line 59
    iget-boolean v13, v0, La/jo3;->n:Z

    .line 60
    .line 61
    const/4 v15, 0x0

    .line 62
    iget-boolean v6, v0, La/jo3;->j:Z

    .line 63
    .line 64
    iget-wide v7, v0, La/jo3;->k:J

    .line 65
    .line 66
    iget-wide v9, v0, La/jo3;->l:J

    .line 67
    .line 68
    iget-wide v11, v0, La/jo3;->m:J

    .line 69
    .line 70
    move-object/from16 v14, p2

    .line 71
    .line 72
    invoke-direct/range {v4 .. v15}, La/jo3;-><init>(La/dz5;ZJJJZLa/yje;B)V

    .line 73
    .line 74
    .line 75
    return-object v4

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jo3;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jo3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jo3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jo3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jo3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jo3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jo3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/jo3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/jo3;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/jo3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/jo3;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "widgetFavoritesAnalyticsUseCase"

    .line 5
    .line 6
    iget-object v3, p0, La/jo3;->o:La/dz5;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    check-cast v3, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesSmallProvider;

    .line 17
    .line 18
    iget-object v4, v3, La/dz5;->c:La/afm0;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    iget-wide v9, p0, La/jo3;->m:J

    .line 23
    .line 24
    iget-boolean v12, p0, La/jo3;->n:Z

    .line 25
    .line 26
    iget-wide v5, p0, La/jo3;->k:J

    .line 27
    .line 28
    iget-wide v7, p0, La/jo3;->l:J

    .line 29
    .line 30
    iget-boolean v11, p0, La/jo3;->j:Z

    .line 31
    .line 32
    invoke-virtual/range {v4 .. v12}, La/afm0;->o(JJJZZ)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v3, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesLargeProvider;

    .line 48
    .line 49
    iget-object v4, v3, La/dz5;->c:La/afm0;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    iget-wide v9, p0, La/jo3;->m:J

    .line 54
    .line 55
    iget-boolean v12, p0, La/jo3;->n:Z

    .line 56
    .line 57
    iget-wide v5, p0, La/jo3;->k:J

    .line 58
    .line 59
    iget-wide v7, p0, La/jo3;->l:J

    .line 60
    .line 61
    iget-boolean v11, p0, La/jo3;->j:Z

    .line 62
    .line 63
    invoke-virtual/range {v4 .. v12}, La/afm0;->o(JJJZZ)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    check-cast v3, Lorg/xplatform/widget/impl/presentation/favorites/AppWidgetFavoritesDefaultProvider;

    .line 79
    .line 80
    iget-object v4, v3, La/dz5;->c:La/afm0;

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    iget-wide v9, p0, La/jo3;->m:J

    .line 85
    .line 86
    iget-boolean v12, p0, La/jo3;->n:Z

    .line 87
    .line 88
    iget-wide v5, p0, La/jo3;->k:J

    .line 89
    .line 90
    iget-wide v7, p0, La/jo3;->l:J

    .line 91
    .line 92
    iget-boolean v11, p0, La/jo3;->j:Z

    .line 93
    .line 94
    invoke-virtual/range {v4 .. v12}, La/afm0;->o(JJJZZ)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
