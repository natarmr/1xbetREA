.class public Lcom/huawei/agconnect/config/impl/ReaderStrategy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/huawei/agconnect/config/AesDecrypt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "agc_plugin_"

    .line 5
    .line 6
    const-string v1, "crypto"

    .line 7
    .line 8
    invoke-static {p1, p2, v0, v1}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "utf-8"

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_0

    .line 28
    :catch_1
    move-exception v0

    .line 29
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "UnsupportedEncodingException"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "ReaderStrategy"

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    :cond_0
    const/4 v1, 0x0

    .line 53
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v1, 0x1a

    .line 62
    .line 63
    if-ge v0, v1, :cond_1

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_1
    new-instance v0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;

    .line 67
    .line 68
    invoke-direct {v0, p1, p2}, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/ReaderStrategy;->a:Lcom/huawei/agconnect/config/AesDecrypt;

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_2
    :goto_3
    new-instance v0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;

    .line 75
    .line 76
    invoke-direct {v0, p1, p2}, Lcom/huawei/agconnect/config/impl/FixedDecrypt;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :goto_4
    return-void
.end method
