.class public final Lokhttp3/Dns$Companion$SYSTEM$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Dns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Dns;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "okhttp3/Dns$Companion$SYSTEM$1",
        "Lokhttp3/Dns;",
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
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 5
    .line 6
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lokhttp3/internal/dns/InetAddressDns;->b:Lokhttp3/internal/dns/InetAddressDns;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lokhttp3/internal/dns/InetAddressDns;->a(Ljava/lang/String;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final b(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;
    .locals 2

    .line 1
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 2
    .line 3
    sget-object p0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lokhttp3/internal/dns/InetAddressDns;->b:Lokhttp3/internal/dns/InetAddressDns;

    .line 9
    .line 10
    new-instance v0, Lokhttp3/internal/dns/LookupDnsCall;

    .line 11
    .line 12
    sget-object v1, Lokhttp3/internal/concurrent/TaskRunner;->INSTANCE:Lokhttp3/internal/concurrent/TaskRunner;

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, p1}, Lokhttp3/internal/dns/LookupDnsCall;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns;Lokhttp3/Dns$Request;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dns.SYSTEM"

    .line 2
    .line 3
    return-object p0
.end method
