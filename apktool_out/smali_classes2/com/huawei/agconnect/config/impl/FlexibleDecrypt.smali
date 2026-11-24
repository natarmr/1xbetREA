.class public Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;
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

    const-string v0, "AGC_FlexibleDecrypt"

    const-string v1, "init"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 2
    .line 3
    const-string v1, "AGC_FlexibleDecrypt"

    .line 4
    .line 5
    const-string v2, "agc_plugin_"

    .line 6
    .line 7
    iget-object v3, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->a:Landroid/content/Context;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "crypto_component"

    .line 14
    .line 15
    invoke-static {v4, v3, v2, v0}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    :try_start_0
    new-instance v5, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v6, "utf-8"

    .line 28
    .line 29
    invoke-direct {v5, v0, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v5, "rx"

    .line 38
    .line 39
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const-string v5, "ry"

    .line 44
    .line 45
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    const-string v5, "rz"

    .line 50
    .line 51
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    const-string v5, "salt"

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    const-string v5, "iterationCount"

    .line 62
    .line 63
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const-string v5, "algorithm"

    .line 68
    .line 69
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    new-instance v6, Lcom/huawei/agconnect/config/impl/AesParam;

    .line 74
    .line 75
    invoke-direct/range {v6 .. v12}, Lcom/huawei/agconnect/config/impl/AesParam;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 79
    .line 80
    invoke-direct {v0, v6}, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;-><init>(Lcom/huawei/agconnect/config/impl/AesParam;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    move-exception v0

    .line 85
    goto :goto_0

    .line 86
    :catch_1
    move-exception v0

    .line 87
    goto :goto_0

    .line 88
    :catch_2
    move-exception v0

    .line 89
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v6, "FlexibleDecrypt exception: "

    .line 92
    .line 93
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_0
    const/4 v0, 0x0

    .line 111
    :goto_1
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 112
    .line 113
    :cond_1
    if-nez v0, :cond_2

    .line 114
    .line 115
    const-string v0, "decrypt Flexible Decrypt error, use old instead"

    .line 116
    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    new-instance v0, Lcom/huawei/agconnect/config/impl/FixedDecrypt;

    .line 121
    .line 122
    invoke-direct {v0, v4, v3}, Lcom/huawei/agconnect/config/impl/FixedDecrypt;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/huawei/agconnect/config/impl/FixedDecrypt;->b()Lcom/huawei/agconnect/config/IDecrypt;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object v1, v0

    .line 130
    check-cast v1, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 131
    .line 132
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/FlexibleDecrypt;->c:Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 133
    .line 134
    :cond_2
    invoke-static {v4, v3, v2, p1}, Lcom/huawei/agconnect/config/impl/ResourcesUtils;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast v0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;

    .line 139
    .line 140
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method
