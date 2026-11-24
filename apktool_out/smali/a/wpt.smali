.class public final La/wpt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/z220;


# direct methods
.method public synthetic constructor <init>(La/z220;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wpt;->a:La/z220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object p0, p0, La/wpt;->a:La/z220;

    .line 2
    .line 3
    iget-object p0, p0, La/z220;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/esh0;

    .line 6
    .line 7
    iget-object p0, p0, La/esh0;->a:La/us00;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x1c

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-lt v1, v2, :cond_1

    .line 23
    .line 24
    const/high16 v1, 0x8000000

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, La/x6;->c(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-static {p0}, La/x6;->A(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v1, 0x40

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 50
    .line 51
    :goto_0
    if-eqz p0, :cond_3

    .line 52
    .line 53
    array-length v1, p0

    .line 54
    const/4 v2, 0x0

    .line 55
    move v4, v2

    .line 56
    :goto_1
    if-ge v4, v1, :cond_3

    .line 57
    .line 58
    aget-object v5, p0, v4

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v6, " "

    .line 71
    .line 72
    invoke-static {v0, v6, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    :try_start_0
    const-string v6, "SHA-256"

    .line 77
    .line 78
    invoke-static {v6}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const/16 v6, 0x9

    .line 102
    .line 103
    invoke-static {v5, v2, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/4 v6, 0x3

    .line 108
    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const/16 v6, 0xb

    .line 116
    .line 117
    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v5
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    goto :goto_2

    .line 122
    :catch_0
    move-exception v5

    .line 123
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    move-object v5, v3

    .line 127
    :goto_2
    if-nez v5, :cond_2

    .line 128
    .line 129
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object v3, v5

    .line 133
    :cond_3
    if-nez v3, :cond_4

    .line 134
    .line 135
    const-string v3, ""

    .line 136
    .line 137
    :cond_4
    return-object v3
.end method
