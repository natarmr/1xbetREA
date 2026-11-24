.class Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/JsonProcessingFactory$JsonProcessor;


# virtual methods
.method public final a(Lcom/huawei/agconnect/AGConnectOptions;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/huawei/agconnect/AGConnectOptions;->b()Lcom/huawei/agconnect/AGCRoutePolicy;

    move-result-object p0

    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->c:Lcom/huawei/agconnect/AGCRoutePolicy;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/AGCRoutePolicy;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "/agcgw_all/CN"

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1}, Lcom/huawei/agconnect/AGConnectOptions;->b()Lcom/huawei/agconnect/AGCRoutePolicy;

    move-result-object p0

    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->e:Lcom/huawei/agconnect/AGCRoutePolicy;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/AGCRoutePolicy;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "/agcgw_all/RU"

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p1}, Lcom/huawei/agconnect/AGConnectOptions;->b()Lcom/huawei/agconnect/AGCRoutePolicy;

    move-result-object p0

    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->d:Lcom/huawei/agconnect/AGCRoutePolicy;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/AGCRoutePolicy;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "/agcgw_all/DE"

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p1}, Lcom/huawei/agconnect/AGConnectOptions;->b()Lcom/huawei/agconnect/AGCRoutePolicy;

    move-result-object p0

    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->f:Lcom/huawei/agconnect/AGCRoutePolicy;

    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/AGCRoutePolicy;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "/agcgw_all/SG"

    invoke-interface {p1, p0}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string p0, "AGC_Instance"

    const-string p1, "region is error, please check region"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0
.end method
