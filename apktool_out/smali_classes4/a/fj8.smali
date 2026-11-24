.class public final synthetic La/fj8;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/fj8;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/fj8;

    .line 2
    .line 3
    const-string v4, "toUiState(Lorg/xplatform/games_section/feature/bonuses_info/presentation/dialog/models/BonusesInfoBottomSheetState;)Lorg/xplatform/games_section/feature/bonuses_info/presentation/dialog/models/BonusesInfoBottomSheetUiState;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/dj8;

    .line 8
    .line 9
    const-string v3, "toUiState"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/fj8;->a:La/fj8;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/zi8;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p1, La/zi8;->a:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/bj8;->a:La/bj8;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object p0, p1, La/zi8;->b:Ljava/util/List;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/xi8;

    .line 41
    .line 42
    new-instance v1, La/yi8;

    .line 43
    .line 44
    iget-object v2, v0, La/xi8;->a:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v3, La/nan;

    .line 47
    .line 48
    iget-object v4, v0, La/xi8;->b:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v5, v0, La/xi8;->c:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v6, La/m0x;

    .line 53
    .line 54
    iget v0, v0, La/xi8;->d:I

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x6

    .line 58
    invoke-direct {v6, v0, v7, v8}, La/m0x;-><init>(ILa/bzw;I)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/mt90;

    .line 62
    .line 63
    sget-object v7, La/d4d;->a:La/d4d;

    .line 64
    .line 65
    invoke-direct {v0}, La/mt90;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-direct {v3, v4, v5, v6, v0}, La/nan;-><init>(Ljava/lang/String;Ljava/lang/String;La/m0x;La/mt90;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v2, v3}, La/yi8;-><init>(Ljava/lang/String;La/nan;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {p1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, La/aj8;

    .line 83
    .line 84
    invoke-direct {p1, p0}, La/aj8;-><init>(La/a4x;)V

    .line 85
    .line 86
    .line 87
    return-object p1
.end method
