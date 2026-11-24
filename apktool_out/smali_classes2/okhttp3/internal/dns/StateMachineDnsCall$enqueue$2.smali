.class public final Lokhttp3/internal/dns/StateMachineDnsCall$enqueue$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery$Callback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "okhttp3/internal/dns/StateMachineDnsCall$enqueue$2",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
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


# instance fields
.field public final synthetic a:Lokhttp3/internal/dns/DnsQuery;


# direct methods
.method public constructor <init>(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lokhttp3/internal/dns/StateMachineDnsCall$enqueue$2;->a:Lokhttp3/internal/dns/DnsQuery;

    .line 5
    .line 6
    return-void
.end method
