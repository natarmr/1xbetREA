.class final Lokhttp3/internal/dns/MemoryCache$NewestFirst;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/MemoryCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NewestFirst"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lkotlin/Pair<",
        "+",
        "La/wcd;",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c2\u0002\u0018\u00002&\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u00030\u00020\u0001j\u0012\u0012\u000e\u0012\u000c\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u00030\u0002`\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/internal/dns/MemoryCache$NewestFirst;",
        "Ljava/util/Comparator;",
        "Lkotlin/Pair;",
        "La/wcd;",
        "Lkotlin/Comparator;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Pair;

    .line 2
    .line 3
    check-cast p2, Lkotlin/Pair;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/wcd;

    .line 14
    .line 15
    iget-object p1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, La/wcd;

    .line 18
    .line 19
    invoke-interface {p0, p1}, La/wcd;->h(La/wcd;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method
