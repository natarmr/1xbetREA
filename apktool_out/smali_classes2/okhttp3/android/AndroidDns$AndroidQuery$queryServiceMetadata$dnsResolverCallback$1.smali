.class public final Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/net/DnsResolver$Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/net/DnsResolver$Callback;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "okhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1",
        "Landroid/net/DnsResolver$Callback;",
        "",
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
.method public final onAnswer(Ljava/lang/Object;I)V
    .locals 2

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    :try_start_0
    new-instance p2, Lokhttp3/internal/dns/DnsMessageReader;

    .line 8
    .line 9
    new-instance v0, La/f99;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    array-length v1, p1

    .line 15
    invoke-virtual {v0, p1, v1}, La/f99;->U([BI)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p2, v0}, Lokhttp3/internal/dns/DnsMessageReader;-><init>(La/f99;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lokhttp3/internal/dns/DnsMessageReader;->a()Lokhttp3/internal/dns/DnsMessage;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :catch_0
    throw p0
.end method

.method public final onError(Landroid/net/DnsResolver$DnsException;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method
