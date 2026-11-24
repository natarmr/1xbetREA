.class public final synthetic La/yia0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/yia0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/yia0;

    .line 2
    .line 3
    const-string v4, "toPlayersStatisticInfoBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticInfoBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/ui_state/PlayersStatisticInfoBottomSheetUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/xia0;

    .line 8
    .line 9
    const-string v3, "toPlayersStatisticInfoBottomSheetUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/yia0;->a:La/yia0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/via0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/via0;->a:Ljava/util/List;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

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
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/t2u0;

    .line 34
    .line 35
    new-instance v1, La/dja0;

    .line 36
    .line 37
    iget-object v2, v0, La/t2u0;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v0, v0, La/t2u0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {v1, v2, v0}, La/dja0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, La/wia0;

    .line 53
    .line 54
    invoke-direct {p1, p0}, La/wia0;-><init>(La/a4x;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method
