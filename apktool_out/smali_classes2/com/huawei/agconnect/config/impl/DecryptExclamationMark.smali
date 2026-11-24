.class public Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/config/IDecrypt;


# instance fields
.field public final a:Lcom/huawei/agconnect/config/ConfigReader;

.field public b:Ljavax/crypto/spec/SecretKeySpec;

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/config/ConfigReader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->c:Z

    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->a:Lcom/huawei/agconnect/config/ConfigReader;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    const-string v1, "^\\[!([A-Fa-f0-9]*)]"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-object p0

    .line 25
    :cond_0
    return-object v0

    .line 26
    :catch_0
    const-string p0, "AGC_Mark"

    .line 27
    .line 28
    const-string v1, "getRawString exception"

    .line 29
    .line 30
    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "^\\[!([A-Fa-f0-9]*)]"

    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->c:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "AGC_Mark"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->a:Lcom/huawei/agconnect/config/ConfigReader;

    .line 9
    .line 10
    :try_start_0
    const-string v3, "/code/code1"

    .line 11
    .line 12
    invoke-interface {v0, v3, v1}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const-string v3, "/code/code2"

    .line 17
    .line 18
    invoke-interface {v0, v3, v1}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    const-string v3, "/code/code3"

    .line 23
    .line 24
    invoke-interface {v0, v3, v1}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    const-string v3, "/code/code4"

    .line 29
    .line 30
    invoke-interface {v0, v3, v1}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    new-instance v4, Lcom/huawei/agconnect/config/impl/AesParam;

    .line 35
    .line 36
    const-string v10, "PBKDF2WithHmacSHA1"

    .line 37
    .line 38
    const/16 v5, 0x2710

    .line 39
    .line 40
    invoke-direct/range {v4 .. v10}, Lcom/huawei/agconnect/config/impl/AesParam;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, Lcom/huawei/agconnect/config/impl/Keys;->a(Lcom/huawei/agconnect/config/impl/AesParam;)Ljavax/crypto/spec/SecretKeySpec;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b:Ljavax/crypto/spec/SecretKeySpec;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    const-string v0, "Exception when reading the \'K&I\' for \'Config\'."

    .line 51
    .line 52
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 56
    .line 57
    :goto_0
    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->c:Z

    .line 59
    .line 60
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    const-string p0, "mKey is null, return default value"

    .line 65
    .line 66
    :goto_1
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_1
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    :try_start_1
    new-instance v0, Ljava/lang/String;

    .line 77
    .line 78
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 79
    .line 80
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/Hex;->a(Ljava/lang/String;)[B

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p0, p1}, Lcom/huawei/agconnect/config/impl/Keys;->c(Ljavax/crypto/spec/SecretKeySpec;[B)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "UTF-8"

    .line 93
    .line 94
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :catch_1
    const-string p0, "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException"

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    return-object v1
.end method
