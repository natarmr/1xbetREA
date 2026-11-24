.class public Lcom/huawei/agconnect/config/impl/FixedDecrypt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/AesDecrypt;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "AGC_FixedDecrypt"

    const-string v1, "init"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->b()Lcom/huawei/agconnect/config/IDecrypt;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 11
    .line 12
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->b:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "agc_"

    .line 17
    .line 18
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {p0, v1, v2, p1}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast v0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final b()Lcom/huawei/agconnect/config/IDecrypt;
    .locals 10

    .line 1
    const-string v0, "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"

    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->a:Landroid/content/Context;

    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->b:Ljava/lang/String;

    const-string v2, "agc_"

    invoke-static {v1, p0, v2, v0}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"

    invoke-static {v1, p0, v2, v0}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"

    invoke-static {v1, p0, v2, v0}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"

    invoke-static {v1, p0, v2, v0}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v3, Lcom/huawei/agconnect/config/impl/AesParam;

    const-string v9, "PBKDF2WithHmacSHA1"

    const/16 v4, 0x1388

    invoke-direct/range {v3 .. v9}, Lcom/huawei/agconnect/config/impl/AesParam;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    invoke-direct {p0, v3}, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;-><init>(Lcom/huawei/agconnect/config/impl/AesParam;)V

    return-object p0
.end method
