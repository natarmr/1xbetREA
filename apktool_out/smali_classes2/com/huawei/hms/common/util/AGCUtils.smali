.class public Lcom/huawei/hms/common/util/AGCUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 130
    const-string v0, "In getMetaDataAppId, Failed to read meta data for the AppID."

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, ""

    const-string v3, "AGCUtils"

    if-nez v1, :cond_0

    .line 131
    const-string p0, "In getMetaDataAppId, Failed to get \'PackageManager\' instance."

    invoke-static {v3, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 132
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v4, 0x80

    invoke-virtual {v1, p0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p0, :cond_2

    .line 133
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_2

    .line 134
    const-string v1, "com.huawei.hms.client.appid"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 135
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 136
    const-string v1, "appid="

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x6

    .line 137
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_1
    return-object p0

    .line 138
    :cond_2
    invoke-static {v3, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/util/AndroidException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 139
    :goto_0
    invoke-static {v3, v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    .line 140
    :catch_1
    invoke-static {v3, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "AGCUtils"

    .line 2
    .line 3
    const-string v1, "Get "

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Lcom/huawei/agconnect/AGConnectOptionsBuilder;

    .line 9
    .line 10
    invoke-direct {v4}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-string v6, "agconnect-services.json"

    .line 22
    .line 23
    invoke-virtual {v5, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, v4, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->a:Ljava/io/InputStream;

    .line 28
    .line 29
    invoke-virtual {v4, p0}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->a(Landroid/content/Context;)Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_3

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_4

    .line 40
    :catch_0
    move-exception p0

    .line 41
    goto :goto_0

    .line 42
    :catch_1
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :goto_0
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, " with AGConnectServicesConfig failed: "

    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move-object p0, v2

    .line 68
    goto :goto_3

    .line 69
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, " failed: "

    .line 78
    .line 79
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_3
    invoke-static {v3}, Lcom/huawei/hms/utils/IOUtils;->closeQuietly(Ljava/io/InputStream;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_0

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v1, "The "

    .line 106
    .line 107
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string p1, " is null."

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    :goto_4
    invoke-static {v3}, Lcom/huawei/hms/utils/IOUtils;->closeQuietly(Ljava/io/InputStream;)V

    .line 127
    .line 128
    .line 129
    throw p0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "In getMetaDataCpId, Failed to read meta data for the CpId."

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const-string v3, "AGCUtils"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string p0, "In getMetaDataCpId, Failed to get \'PackageManager\' instance."

    .line 14
    .line 15
    invoke-static {v3, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/16 v4, 0x80

    .line 24
    .line 25
    invoke-virtual {v1, p0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string v1, "com.huawei.hms.client.cpid"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v1, "cpid="

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    const/4 v1, 0x5

    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-object p0

    .line 66
    :cond_2
    invoke-static {v3, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/util/AndroidException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :goto_0
    invoke-static {v3, v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :catch_1
    invoke-static {v3, v0}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v2
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/huawei/hms/utils/HMSPackageManager;->getHMSPackageNameForMultiService()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static getAppId(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "AGCUtils"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "getAppId context is null"

    .line 6
    .line 7
    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p0, ""

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {p0}, Lcom/huawei/hms/common/util/AGCUtils;->c(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-string v2, "client/app_id"

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0, v2}, Lcom/huawei/hms/common/util/AGCUtils;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :cond_2
    :try_start_0
    sget-object v3, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->d:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    const-string v3, "DEFAULT_INSTANCE"

    .line 38
    .line 39
    :cond_3
    invoke-static {v3}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->c(Ljava/lang/String;)Lcom/huawei/agconnect/AGConnectInstance;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    move-object v4, v3

    .line 44
    check-cast v4, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    .line 45
    .line 46
    iget-object v4, v4, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a:Lcom/huawei/agconnect/AGConnectOptions;

    .line 47
    .line 48
    invoke-interface {v4}, Lcom/huawei/agconnect/AGConnectOptions;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eq v4, p0, :cond_4

    .line 53
    .line 54
    new-instance v3, Lcom/huawei/agconnect/AGConnectOptionsBuilder;

    .line 55
    .line 56
    invoke-direct {v3}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p0}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->a(Landroid/content/Context;)Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {v3, v4}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a(Lcom/huawei/agconnect/AGConnectOptions;Z)Lcom/huawei/agconnect/AGConnectInstance;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_4
    check-cast v3, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    .line 69
    .line 70
    iget-object v3, v3, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a:Lcom/huawei/agconnect/AGConnectOptions;

    .line 71
    .line 72
    invoke-interface {v3, v2}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    const-string v3, "Get appId with AGConnectServicesConfig failed"

    .line 78
    .line 79
    invoke-static {v0, v3}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_5
    invoke-static {p0}, Lcom/huawei/hms/common/util/AGCUtils;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_6

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_6
    invoke-static {p0, v2}, Lcom/huawei/hms/common/util/AGCUtils;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public static getCpId(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "AGCUtils"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "getCpId context is null"

    .line 6
    .line 7
    invoke-static {v0, p0}, Lcom/huawei/hms/support/log/HMSLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p0, ""

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {p0}, Lcom/huawei/hms/common/util/AGCUtils;->c(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-string v2, "client/cp_id"

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0, v2}, Lcom/huawei/hms/common/util/AGCUtils;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->d:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    const-string v1, "DEFAULT_INSTANCE"

    .line 31
    .line 32
    :cond_2
    invoke-static {v1}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->c(Ljava/lang/String;)Lcom/huawei/agconnect/AGConnectInstance;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v3, v1

    .line 37
    check-cast v3, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    .line 38
    .line 39
    iget-object v3, v3, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a:Lcom/huawei/agconnect/AGConnectOptions;

    .line 40
    .line 41
    invoke-interface {v3}, Lcom/huawei/agconnect/AGConnectOptions;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eq v3, p0, :cond_3

    .line 46
    .line 47
    new-instance v1, Lcom/huawei/agconnect/AGConnectOptionsBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Lcom/huawei/agconnect/AGConnectOptionsBuilder;->a(Landroid/content/Context;)Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-static {v1, v3}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a(Lcom/huawei/agconnect/AGConnectOptions;Z)Lcom/huawei/agconnect/AGConnectInstance;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_3
    check-cast v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a:Lcom/huawei/agconnect/AGConnectOptions;

    .line 64
    .line 65
    invoke-interface {v1, v2}, Lcom/huawei/agconnect/AGConnectOptions;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    const-string v1, "Get cpid with AGConnectServicesConfig failed"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_4
    invoke-static {p0}, Lcom/huawei/hms/common/util/AGCUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_5

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_5
    invoke-static {p0, v2}, Lcom/huawei/hms/common/util/AGCUtils;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method
