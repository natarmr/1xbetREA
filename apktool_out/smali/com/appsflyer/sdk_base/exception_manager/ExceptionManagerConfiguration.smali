.class public final Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;",
        "",
        "sdkVersion",
        "",
        "min",
        "",
        "expire",
        "ttl",
        "",
        "<init>",
        "(Ljava/lang/String;IIJ)V",
        "getSdkVersion",
        "()Ljava/lang/String;",
        "getMin",
        "()I",
        "getExpire",
        "getTtl",
        "()J",
        "toStringifyJSON",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "sdk_base_release"
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
.field private final expire:I

.field private final min:I

.field private final sdkVersion:Ljava/lang/String;

.field private final ttl:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IIJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    .line 8
    .line 9
    iput p2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    .line 10
    .line 11
    iput p3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    .line 12
    .line 13
    iput-wide p4, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;Ljava/lang/String;IIJILjava/lang/Object;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    :cond_3
    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->copy(Ljava/lang/String;IIJ)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    return-object p0
.end method

.method public final component2()I
    .locals 0

    iget p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    return p0
.end method

.method public final component3()I
    .locals 0

    iget p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    return p0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IIJ)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    invoke-direct/range {p0 .. p5}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;-><init>(Ljava/lang/String;IIJ)V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    iget-object v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    iget v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    iget v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    iget-wide p0, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    cmp-long p0, v3, p0

    if-eqz p0, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getExpire()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    .line 2
    .line 3
    return p0
.end method

.method public final getMin()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTtl()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    .line 4
    .line 5
    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    .line 8
    .line 9
    const-string p0, ", min="

    .line 10
    .line 11
    const-string v5, ", expire="

    .line 12
    .line 13
    const-string v6, "ExceptionManagerConfiguration(sdkVersion="

    .line 14
    .line 15
    invoke-static {v1, v6, v0, p0, v5}, La/kng0;->p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", ttl="

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final toStringifyJSON()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "sdk_ver"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "min"

    .line 14
    .line 15
    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "expire"

    .line 21
    .line 22
    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v1, "ttl"

    .line 28
    .line 29
    iget-wide v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-object p0
.end method
