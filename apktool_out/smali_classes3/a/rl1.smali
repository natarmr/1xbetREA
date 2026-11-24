.class public final La/rl1;
.super La/i1w0;
.source "SourceFile"


# instance fields
.field public final h:La/ehf0;


# direct methods
.method public constructor <init>(La/ehf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/i1w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rl1;->h:La/ehf0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(La/lr1;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/lr1;->b:La/tm1;

    .line 5
    .line 6
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 7
    .line 8
    const/4 v12, 0x0

    .line 9
    const/16 v13, 0x1ff

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    const-wide/16 v9, 0x0

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    invoke-direct/range {v0 .. v13}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/rl1;->h:La/ehf0;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v1, p1, v0, v2}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, La/asc;

    .line 33
    .line 34
    invoke-interface {p1}, La/m7h0;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, p1, v1}, La/asc;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    new-array p1, p1, [La/t7d;

    .line 43
    .line 44
    aput-object v0, p1, v2

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/i1w0;->b([La/t7d;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final h(La/lr1;Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p1

    .line 7
    .line 8
    iget-object v1, v1, La/lr1;->b:La/tm1;

    .line 9
    .line 10
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 11
    .line 12
    const/4 v14, 0x0

    .line 13
    const/16 v15, 0x1ff

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const-wide/16 v9, 0x0

    .line 22
    .line 23
    const-wide/16 v11, 0x0

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v0, La/rl1;->h:La/ehf0;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v3, v1, v2, v4}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, La/tb50;

    .line 37
    .line 38
    invoke-interface {v1}, La/m7h0;->b()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object/from16 v3, p2

    .line 43
    .line 44
    invoke-direct {v2, v3, v1}, La/tb50;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    new-array v1, v1, [La/t7d;

    .line 49
    .line 50
    aput-object v2, v1, v4

    .line 51
    .line 52
    invoke-virtual {v0, v1}, La/i1w0;->b([La/t7d;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
