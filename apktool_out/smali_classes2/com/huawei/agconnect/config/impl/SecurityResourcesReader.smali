.class Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/ConfigReader;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lcom/huawei/agconnect/config/impl/ReaderStrategy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lcom/huawei/agconnect/config/impl/ReaderStrategy;

    invoke-direct {v0, p1, p2}, Lcom/huawei/agconnect/config/impl/ReaderStrategy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->b:Lcom/huawei/agconnect/config/impl/ReaderStrategy;

    return-void
.end method


# virtual methods
.method public final getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->b:Lcom/huawei/agconnect/config/impl/ReaderStrategy;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/ReaderStrategy;->a:Lcom/huawei/agconnect/config/AesDecrypt;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Lcom/huawei/agconnect/config/AesDecrypt;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    const-string p0, "SecurityResourcesReader"

    .line 23
    .line 24
    const-string p1, "value is null"

    .line 25
    .line 26
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-virtual {p2, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    const-string p0, "SecurityResourcesReader{mKey=, encrypt=true}"

    return-object p0
.end method
