.class public final synthetic La/vz0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# static fields
.field public static final a:La/vz0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/vz0;

    .line 2
    .line 3
    const-string v4, "buildGameCardFavoriteUiModel(ZZ)Lorg/xplatform/uikit_aggregator/aggregatorgamecardcollection/models/GameCardFavoriteUiModel;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x2

    .line 7
    const-class v2, La/ntr;

    .line 8
    .line 9
    const-string v3, "buildGameCardFavoriteUiModel"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/vz0;->a:La/vz0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    check-cast p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const p0, 0x7f080797

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const p0, 0x7f080798

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance p2, La/mtr;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1}, La/mtr;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    return-object p2
.end method
