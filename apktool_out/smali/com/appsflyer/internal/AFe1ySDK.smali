.class public abstract Lcom/appsflyer/internal/AFe1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/appsflyer/internal/AFe1ySDK<",
        "*>;>;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/appsflyer/internal/AFd1cSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0002\u0008\t\u0008\'\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00000\u0004B+\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0003H%\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH \u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H!\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0015H\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0011\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u000eJ\u001c\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0006\u001a\u0006\u0012\u0002\u0008\u00030\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00122\u0008\u0010\u0006\u001a\u0004\u0018\u00010!H\u0086\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\u001e\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0017\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010(R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010*R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010*R\u0014\u0010\r\u001a\u00020\u001e8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010+R\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8\u0006@BX\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010.R(\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00158\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010/\u001a\u0004\u0008\u0017\u00100R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u00101R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u00102R$\u0010\u0019\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8\u0007@BX\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010+\u001a\u0004\u0008\u001f\u0010%"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFe1ySDK;",
        "Result",
        "Ljava/util/concurrent/Callable;",
        "Lcom/appsflyer/internal/AFd1cSDK;",
        "",
        "Lcom/appsflyer/internal/AFe1zSDK;",
        "p0",
        "",
        "p1",
        "",
        "p2",
        "<init>",
        "(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V",
        "registerClient",
        "()Lcom/appsflyer/internal/AFd1cSDK;",
        "",
        "d",
        "()J",
        "",
        "AFLogger",
        "()Z",
        "",
        "",
        "AFKeystoreWrapper",
        "(Ljava/lang/Throwable;)V",
        "force",
        "()V",
        "w",
        "i",
        "v",
        "",
        "unregisterClient",
        "(Lcom/appsflyer/internal/AFe1ySDK;)I",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "Lcom/appsflyer/internal/AFe1zSDK;",
        "",
        "Ljava/util/Set;",
        "I",
        "e",
        "Ljava/lang/String;",
        "J",
        "Ljava/lang/Throwable;",
        "()Ljava/lang/Throwable;",
        "Lcom/appsflyer/internal/AFd1cSDK;",
        "Z"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public AFKeystoreWrapper:J

.field public final AFLogger:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;

.field private force:Z

.field private i:Ljava/lang/Throwable;

.field public registerClient:I

.field public final unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

.field private volatile v:I

.field public w:Lcom/appsflyer/internal/AFd1cSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 11
    .line 12
    new-instance p1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, La/w3d;->v(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1ySDK;->AFLogger:Ljava/util/Set;

    .line 21
    .line 22
    new-instance p1, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 28
    .line 29
    invoke-static {}, Lcom/appsflyer/internal/AFe1xSDK;->unregisterClient()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lcom/appsflyer/internal/AFe1ySDK;->registerClient:I

    .line 38
    .line 39
    if-nez p3, :cond_0

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    :cond_0
    iput-object p3, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Ljava/lang/Throwable;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->i:Ljava/lang/Throwable;

    return-object p0
.end method

.method public AFKeystoreWrapper(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public abstract AFLogger()Z
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->v()Lcom/appsflyer/internal/AFd1cSDK;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/appsflyer/internal/AFe1ySDK;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract d()J
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    check-cast p1, Lcom/appsflyer/internal/AFe1ySDK;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 26
    .line 27
    iget-object v2, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 28
    .line 29
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_3
    :goto_0
    return v0
.end method

.method public force()V
    .locals 0

    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->force:Z

    .line 2
    .line 3
    return p0
.end method

.method public abstract registerClient()Lcom/appsflyer/internal/AFd1cSDK;
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, "-"

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->registerClient:I

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    iget p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->registerClient:I

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    return-object v1
.end method

.method public final unregisterClient()I
    .locals 0

    .line 38
    iget p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->v:I

    return p0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/appsflyer/internal/AFe1zSDK;->AFLogger()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p1, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/appsflyer/internal/AFe1zSDK;->AFLogger()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p1, Lcom/appsflyer/internal/AFe1ySDK;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_0
    iget p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->registerClient:I

    .line 32
    .line 33
    iget p1, p1, Lcom/appsflyer/internal/AFe1ySDK;->registerClient:I

    .line 34
    .line 35
    sub-int/2addr p0, p1

    .line 36
    return p0

    .line 37
    :cond_1
    return v0
.end method

.method public final v()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 5

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFe1xSDK;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->i:Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->v:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    iput v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->v:I

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    sub-long/2addr v3, v0

    .line 34
    iput-wide v3, p0, Lcom/appsflyer/internal/AFe1ySDK;->AFKeystoreWrapper:J

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->force()V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :catchall_0
    move-exception v2

    .line 41
    :try_start_1
    iput-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->i:Ljava/lang/Throwable;

    .line 42
    .line 43
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 44
    .line 45
    iput-object v3, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/appsflyer/internal/AFe1ySDK;->AFKeystoreWrapper(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    :catchall_1
    move-exception v2

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    sub-long/2addr v3, v0

    .line 57
    iput-wide v3, p0, Lcom/appsflyer/internal/AFe1ySDK;->AFKeystoreWrapper:J

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->force()V

    .line 60
    .line 61
    .line 62
    throw v2
.end method

.method public w()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->force:Z

    .line 3
    .line 4
    return-void
.end method
