.class public final Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/dns/StateMachineDnsCall$State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/StateMachineDnsCall$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Running"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;",
        "Lokhttp3/internal/dns/StateMachineDnsCall$State;",
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
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p3, p4, p5}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->a:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->b:Ljava/util/List;

    .line 10
    .line 11
    iput-object p5, p0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "Check failed."

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-void
.end method
