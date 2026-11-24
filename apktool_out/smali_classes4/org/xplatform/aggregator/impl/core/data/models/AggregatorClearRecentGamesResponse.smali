.class public final Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u001f\u0012\u0004\u0008!\u0010\"\u001a\u0004\u0008 \u0010\u0015\u00a8\u0006&"
    }
    d2 = {
        "Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;",
        "",
        "",
        "message",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "seen0",
        "La/ehi0;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;La/ehi0;)V",
        "self",
        "La/cld;",
        "output",
        "La/ugi0;",
        "serialDesc",
        "",
        "write$Self$impl",
        "(Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;La/cld;La/ugi0;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getMessage",
        "getMessage$annotations",
        "()V",
        "Companion",
        "a/ei0",
        "a/fi0",
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


# static fields
.field public static final $stable:I

.field public static final Companion:La/fi0;


# instance fields
.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/fi0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->Companion:La/fi0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;La/ehi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-object p2, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 18
    :cond_0
    invoke-direct {p0, p1}, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;Ljava/lang/String;ILjava/lang/Object;)Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->copy(Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$impl(Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;La/cld;La/ugi0;)V
    .locals 2

    .line 1
    invoke-interface {p1, p2}, La/cld;->u(La/ugi0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 13
    .line 14
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {p1, p2, v1, v0, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    return-object p0
.end method

.method public final copy(Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;
    .locals 0

    new-instance p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;

    invoke-direct {p0, p1}, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;

    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    iget-object p1, p1, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;->message:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "AggregatorClearRecentGamesResponse(message="

    .line 4
    .line 5
    const-string v1, ")"

    .line 6
    .line 7
    invoke-static {v0, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
