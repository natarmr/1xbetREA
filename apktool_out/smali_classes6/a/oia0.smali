.class public final synthetic La/oia0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/oia0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/oia0;

    .line 2
    .line 3
    const-string v4, "toPlayersStatisticCricketSelectorsBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/selector_dialog/PlayersStatisticCricketSelectorsBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/selector_dialog/PlayersStatisticCricketSelectorsBottomSheetUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/nia0;

    .line 8
    .line 9
    const-string v3, "toPlayersStatisticCricketSelectorsBottomSheetUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/oia0;->a:La/oia0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La/lia0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/lia0;->a:Ljava/util/List;

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
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/ljo0;

    .line 34
    .line 35
    new-instance v2, La/sha0;

    .line 36
    .line 37
    iget-object v3, v1, La/ljo0;->b:La/kjo0;

    .line 38
    .line 39
    iget v3, v3, La/kjo0;->a:I

    .line 40
    .line 41
    iget-object v1, v1, La/ljo0;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget v4, p1, La/lia0;->b:I

    .line 44
    .line 45
    if-ne v3, v4, :cond_0

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 v4, 0x0

    .line 50
    :goto_1
    invoke-direct {v2, v1, v3, v4}, La/sha0;-><init>(Ljava/lang/String;IZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, La/mia0;

    .line 62
    .line 63
    invoke-direct {p1, p0}, La/mia0;-><init>(La/a4x;)V

    .line 64
    .line 65
    .line 66
    return-object p1
.end method
