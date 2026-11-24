.class public abstract Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;,
        Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u00012\u00020\u0002:\n\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;",
        "La/p6t0;",
        "Landroid/os/Parcelable;",
        "All",
        "Live",
        "Line",
        "Results",
        "Teams",
        "Champs",
        "XGames",
        "Aggregator",
        "LiveCategory",
        "LineCategory",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Aggregator;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$All;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Champs;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Line;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Live;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Results;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$Teams;",
        "Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$XGames;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public p()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, ""

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract u()I
.end method

.method public abstract z()Ljava/lang/String;
.end method
