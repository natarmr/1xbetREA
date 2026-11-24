.class public Lcom/huawei/agconnect/config/impl/DecryptLocalResource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/IDecrypt;


# instance fields
.field public a:Ljavax/crypto/spec/SecretKeySpec;

.field public final b:Lcom/huawei/agconnect/config/impl/AesParam;

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/config/impl/AesParam;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->c:Z

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->b:Lcom/huawei/agconnect/config/impl/AesParam;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "AGC_LocalResource"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->b:Lcom/huawei/agconnect/config/impl/AesParam;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/Keys;->a(Lcom/huawei/agconnect/config/impl/AesParam;)Ljavax/crypto/spec/SecretKeySpec;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a:Ljavax/crypto/spec/SecretKeySpec;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catch_0
    move-exception v0

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :catch_2
    move-exception v0

    .line 22
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "Exception when reading the \'K&I\' for \'Config\'. error is "

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 44
    .line 45
    :goto_1
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->c:Z

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/String;

    .line 60
    .line 61
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p0, p1}, Lcom/huawei/agconnect/config/impl/Keys;->c(Ljavax/crypto/spec/SecretKeySpec;[B)[B

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string p1, "UTF-8"

    .line 72
    .line 73
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :catch_3
    move-exception p0

    .line 78
    goto :goto_2

    .line 79
    :catch_4
    move-exception p0

    .line 80
    goto :goto_2

    .line 81
    :catch_5
    move-exception p0

    .line 82
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v0, "decrypt exception:"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_3
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_2
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v3, "decrypt exception: secretKey = "

    .line 107
    .line 108
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/DecryptLocalResource;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p0, "raw = "

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    goto :goto_3
.end method
