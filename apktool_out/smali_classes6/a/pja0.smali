.class public final synthetic La/pja0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/pja0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/pja0;

    .line 2
    .line 3
    const-string v4, "toPlayersStatisticSelectorsBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticSelectorsBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/ui_state/PlayersStatisticSelectorsBottomSheetUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/oja0;

    .line 8
    .line 9
    const-string v3, "toPlayersStatisticSelectorsBottomSheetUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/pja0;->a:La/pja0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/mja0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/mja0;->a:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    if-ltz v3, :cond_2

    .line 38
    .line 39
    check-cast v4, La/m5i0;

    .line 40
    .line 41
    new-instance v6, La/ria0;

    .line 42
    .line 43
    iget v7, v4, La/m5i0;->a:I

    .line 44
    .line 45
    iget-object v8, v4, La/m5i0;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/4 v10, 0x1

    .line 52
    sub-int/2addr v9, v10

    .line 53
    if-eq v3, v9, :cond_0

    .line 54
    .line 55
    move v3, v10

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move v3, v2

    .line 58
    :goto_1
    iget v4, v4, La/m5i0;->a:I

    .line 59
    .line 60
    iget v9, p1, La/mja0;->b:I

    .line 61
    .line 62
    if-ne v4, v9, :cond_1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move v10, v2

    .line 66
    :goto_2
    invoke-direct {v6, v3, v10, v8, v7}, La/ria0;-><init>(ZZLjava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move v3, v5

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    throw p0

    .line 79
    :cond_3
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    new-instance p1, La/nja0;

    .line 84
    .line 85
    invoke-direct {p1, p0}, La/nja0;-><init>(La/a4x;)V

    .line 86
    .line 87
    .line 88
    return-object p1
.end method
