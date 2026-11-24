.class final Lcom/appsflyer/internal/AFf1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

.field final AFLogger:Ljava/lang/String;

.field final d:Lcom/appsflyer/internal/AFd1fSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;"
        }
    .end annotation
.end field

.field final e:Ljava/lang/String;

.field final registerClient:J

.field final unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

.field final v:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFh1aSDK;",
            "Lcom/appsflyer/internal/AFh1dSDK;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p2, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 10
    .line 11
    iput-object p4, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/appsflyer/internal/AFf1xSDK;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/appsflyer/internal/AFf1xSDK;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 25
    .line 26
    iget-wide v5, p1, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 34
    .line 35
    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 45
    .line 46
    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 56
    .line 57
    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 58
    .line 59
    if-eq v1, v3, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_8

    .line 82
    .line 83
    return v2

    .line 84
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFd1fSDK;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_0
    add-int/2addr v0, v2

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    move v2, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2}, Lcom/appsflyer/internal/AFh1aSDK;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_1
    add-int/2addr v0, v2

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :goto_2
    add-int/2addr v0, v2

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    move v2, v3

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_3
    add-int/2addr v0, v2

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 66
    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    :goto_4
    add-int/2addr v0, v3

    .line 75
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    .line 4
    .line 5
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 10
    .line 11
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    .line 14
    .line 15
    const-string v7, "SaveMetadataParams(cdnToken="

    .line 16
    .line 17
    const-string v8, ", updateStartTime="

    .line 18
    .line 19
    invoke-static {v1, v2, v7, v0, v8}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, ", response="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", config="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", signatureStatus="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", cdnCacheStatus="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", error="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
