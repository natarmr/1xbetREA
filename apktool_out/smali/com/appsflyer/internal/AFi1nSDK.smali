.class public Lcom/appsflyer/internal/AFi1nSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field private static enableTCFDataCollection:Ljava/lang/Object;

.field private static getInstance:[B

.field public static final getLevel:Ljava/util/Map;

.field public static final getSdkVersion:Ljava/util/Map;

.field private static onPause:[B

.field private static setAndroidIdData:I

.field private static setDebugLog:I

.field private static setImeiData:I

.field private static setOaidData:J

.field private static setUserFirstName:I

.field private static stop:Ljava/lang/Object;

.field private static updateServerUninstallToken:J


# direct methods
.method private static $$c(SII)Ljava/lang/String;
    .locals 6

    rsub-int/lit8 p1, p1, 0x31

    rsub-int p0, p0, 0x46c

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    rsub-int/lit8 p2, p2, 0x77

    new-array v1, p1, [B

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget v3, Lcom/appsflyer/internal/AFi1nSDK;->$12:I

    add-int/lit8 v3, v3, 0x7

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1nSDK;->$13:I

    move v3, p1

    move v4, v2

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_0
    add-int/lit8 v4, v3, 0x1

    int-to-byte v5, p2

    aput-byte v5, v1, v3

    if-ne v4, p1, :cond_1

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    return-object p0

    :cond_1
    aget-byte v3, v0, p0

    sget v5, Lcom/appsflyer/internal/AFi1nSDK;->$12:I

    add-int/lit8 v5, v5, 0x6b

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$13:I

    :goto_1
    add-int/lit8 p0, p0, 0x1

    add-int/2addr p2, v3

    add-int/lit8 p2, p2, -0x3

    move v3, v4

    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 72

    const-class v1, Lcom/appsflyer/internal/AFi1nSDK;

    const-class v2, Ljava/lang/Throwable;

    const-class v3, Ljava/lang/Class;

    const/4 v4, 0x0

    .line 1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2
    invoke-static {}, Lcom/appsflyer/internal/AFi1nSDK;->init$0()V

    const/16 v0, 0xa5

    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v7, 0xcf

    aget-byte v8, v6, v7

    int-to-byte v8, v8

    const/16 v9, 0x54

    aget-byte v10, v6, v9

    int-to-byte v10, v10

    const/16 v11, 0x468

    invoke-static {v11, v8, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v10, 0x2bc

    aget-byte v11, v6, v10

    int-to-byte v11, v11

    const/4 v12, 0x4

    aget-byte v13, v6, v12

    int-to-byte v13, v13

    const/16 v14, 0x453

    invoke-static {v14, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v8, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_73

    not-int v8, v0

    const v13, -0x2976fca3

    or-int/2addr v13, v8

    not-int v13, v13

    const v14, 0x589cf2e0

    xor-int v15, v14, v0

    and-int/2addr v14, v0

    or-int/2addr v14, v15

    not-int v14, v14

    xor-int v15, v13, v14

    and-int/2addr v13, v14

    or-int/2addr v13, v15

    mul-int/lit16 v13, v13, 0xd2

    const v14, -0x1f941ced

    or-int v15, v14, v13

    move/from16 v16, v4

    const/4 v4, 0x1

    shl-int/2addr v15, v4

    xor-int/2addr v13, v14

    sub-int/2addr v15, v13

    const v13, 0x589cf2e0

    xor-int v14, v13, v8

    and-int/2addr v8, v13

    or-int/2addr v8, v14

    const v13, 0x2976fca2

    or-int/2addr v8, v13

    not-int v8, v8

    const v13, -0x814f0a1

    xor-int v14, v13, v0

    and-int/2addr v0, v13

    or-int/2addr v0, v14

    not-int v0, v0

    or-int/2addr v0, v8

    mul-int/lit16 v8, v0, 0xd2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    const v14, 0x20328

    mul-int/2addr v0, v14

    mul-int/lit16 v14, v15, 0x274

    neg-int v14, v14

    neg-int v14, v14

    and-int v17, v0, v14

    or-int/2addr v0, v14

    add-int v17, v17, v0

    xor-int v0, v15, v13

    and-int v14, v15, v13

    or-int/2addr v0, v14

    not-int v14, v8

    xor-int v18, v0, v14

    and-int/2addr v0, v14

    or-int v0, v18, v0

    mul-int/lit16 v0, v0, -0x273

    xor-int v14, v17, v0

    and-int v0, v17, v0

    shl-int/2addr v0, v4

    add-int/2addr v14, v0

    not-int v0, v15

    xor-int v17, v0, v13

    and-int/2addr v0, v13

    or-int v0, v17, v0

    not-int v0, v0

    xor-int v17, v8, v0

    and-int/2addr v0, v8

    or-int v0, v17, v0

    mul-int/lit16 v0, v0, -0x273

    add-int/2addr v0, v14

    not-int v14, v13

    xor-int v17, v14, v15

    and-int/2addr v14, v15

    or-int v14, v17, v14

    not-int v14, v14

    xor-int v15, v8, v13

    and-int/2addr v8, v13

    or-int/2addr v8, v15

    not-int v8, v8

    xor-int v13, v14, v8

    and-int/2addr v8, v14

    or-int/2addr v8, v13

    mul-int/lit16 v8, v8, 0x273

    neg-int v8, v8

    neg-int v8, v8

    xor-int v13, v0, v8

    and-int/2addr v0, v8

    shl-int/2addr v0, v4

    add-int/2addr v13, v0

    if-nez v13, :cond_0

    goto/16 :goto_73

    :cond_0
    const v0, -0x3e6d836b

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->setDebugLog:I

    const v0, 0x94aeb9

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->setUserFirstName:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->getLevel:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->getSdkVersion:Ljava/util/Map;

    :try_start_1
    aget-byte v0, v6, v12

    int-to-byte v0, v0

    const/16 v8, 0x56

    aget-byte v13, v6, v8

    int-to-byte v13, v13

    const/16 v14, 0x44f

    invoke-static {v14, v0, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v13

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/16 v0, 0x15e

    aget-byte v0, v6, v0

    int-to-byte v0, v0

    aget-byte v14, v6, v8

    int-to-byte v14, v14

    const/16 v15, 0x42f

    invoke-static {v15, v0, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_17

    goto :goto_0

    :cond_1
    move-object v0, v11

    :goto_0
    const/16 v14, 0x5d

    .line 4
    :try_start_2
    aget-byte v14, v6, v14

    int-to-byte v14, v14

    aget-byte v15, v6, v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    int-to-byte v15, v15

    move/from16 v17, v7

    const/16 v7, 0x423

    :try_start_3
    invoke-static {v7, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v14, 0x147

    aget-byte v14, v6, v14

    int-to-byte v14, v14

    aget-byte v6, v6, v8

    int-to-byte v6, v6

    const/16 v15, 0x40a

    invoke-static {v15, v14, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v6, :cond_2

    :catch_0
    move/from16 v18, v9

    goto :goto_1

    :catch_1
    move/from16 v17, v7

    :catch_2
    move-object v6, v11

    :cond_2
    :try_start_4
    sget-object v7, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v14, v7, v17

    int-to-byte v14, v14

    aget-byte v15, v7, v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    int-to-byte v15, v15

    move/from16 v18, v9

    const/16 v9, 0x3f9

    :try_start_5
    invoke-static {v9, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v14, v7, v16

    int-to-byte v14, v14

    aget-byte v7, v7, v12

    int-to-byte v7, v7

    const/16 v15, 0x3e4

    invoke-static {v15, v14, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :goto_1
    const/4 v9, 0x2

    if-eqz v6, :cond_4

    .line 5
    sget v14, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v15, v14, 0x23

    or-int/lit8 v14, v14, 0x23

    add-int/2addr v15, v14

    rem-int/lit16 v14, v15, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/2addr v15, v9

    if-eqz v15, :cond_3

    :try_start_6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    sget-object v15, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    const/16 v19, 0x31

    const/16 v20, 0x35

    :try_start_7
    aget-byte v7, v15, v19

    int-to-byte v7, v7

    aget-byte v15, v15, v12
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    int-to-byte v15, v15

    move/from16 v19, v10

    const/16 v10, 0x1093

    :try_start_8
    invoke-static {v10, v7, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    :goto_2
    invoke-virtual {v7, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_4

    :catch_4
    move/from16 v19, v10

    goto :goto_3

    :cond_3
    move/from16 v19, v10

    const/16 v20, 0x35

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    sget-object v10, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v14, v10, v20

    int-to-byte v14, v14

    aget-byte v10, v10, v12

    int-to-byte v10, v10

    const/16 v15, 0x3d0

    invoke-static {v15, v14, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_2

    :catch_5
    :goto_3
    move-object v7, v11

    goto :goto_4

    :catch_6
    :cond_4
    move/from16 v19, v10

    const/16 v20, 0x35

    goto :goto_3

    :goto_4
    if-eqz v6, :cond_5

    :try_start_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    sget-object v14, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v15, 0x265

    aget-byte v15, v14, v15

    int-to-byte v15, v15

    aget-byte v14, v14, v12
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    int-to-byte v14, v14

    move/from16 v21, v12

    const/16 v12, 0x3c6

    :try_start_a
    invoke-static {v12, v15, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_6

    :catch_7
    :goto_5
    move-object v10, v11

    goto :goto_6

    :catch_8
    :cond_5
    move/from16 v21, v12

    goto :goto_5

    :goto_6
    if-eqz v6, :cond_6

    :try_start_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    sget-object v14, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v15, v14, v20

    int-to-byte v15, v15

    aget-byte v14, v14, v21
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    int-to-byte v14, v14

    move/from16 v22, v4

    const/16 v4, 0x3b8

    :try_start_c
    invoke-static {v4, v15, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    goto :goto_8

    :catch_9
    :goto_7
    move-object v4, v11

    goto :goto_8

    :catch_a
    :cond_6
    move/from16 v22, v4

    goto :goto_7

    :goto_8
    const/16 v6, 0x3a4

    const-class v12, Ljava/lang/String;

    if-eqz v7, :cond_7

    move/from16 v25, v8

    :goto_9
    const/16 v24, 0x55

    const/16 v26, 0x5e

    goto :goto_a

    :cond_7
    if-nez v0, :cond_8

    move/from16 v25, v8

    move-object v7, v11

    goto :goto_9

    :cond_8
    :try_start_d
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v23, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v24, 0x55

    aget-byte v14, v23, v20

    int-to-byte v14, v14

    const/16 v25, 0x292

    const/16 v26, 0x5e

    aget-byte v15, v23, v25

    int-to-byte v15, v15

    move/from16 v25, v8

    const/16 v8, 0x3ae

    invoke-static {v8, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_17

    :try_start_e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v7, v23, v24

    int-to-byte v7, v7

    aget-byte v8, v23, v26

    int-to-byte v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_72

    :goto_a
    const/16 v8, 0x235

    if-eqz v4, :cond_9

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v14, v0, 0x31

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v0, v0, 0x31

    sub-int/2addr v14, v0

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    move/from16 v23, v8

    goto :goto_b

    :cond_9
    :try_start_f
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v4, v0, v8

    neg-int v4, v4

    int-to-byte v4, v4

    aget-byte v14, v0, v26

    int-to-byte v14, v14

    const/16 v15, 0x399

    invoke-static {v15, v4, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_17

    :try_start_10
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const/16 v14, 0xad

    aget-byte v14, v0, v14

    int-to-byte v14, v14

    aget-byte v15, v0, v26

    int-to-byte v15, v15

    move/from16 v23, v8

    const/16 v8, 0x38c

    invoke-static {v8, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v14, v0, v20

    int-to-byte v14, v14

    aget-byte v15, v0, v21

    int-to-byte v15, v15

    const/16 v9, 0x37d

    invoke-static {v9, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v8, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v11, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_71

    :try_start_11
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v0, v0, v26

    int-to-byte v0, v0

    invoke-static {v6, v8, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_70

    :goto_b
    if-nez v10, :cond_b

    if-eqz v7, :cond_b

    :try_start_12
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v8, 0x18e

    aget-byte v8, v0, v8

    neg-int v8, v8

    int-to-byte v8, v8

    aget-byte v9, v0, v25

    int-to-byte v9, v9

    const/16 v10, 0x373

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_17

    const/4 v9, 0x2

    :try_start_13
    new-array v10, v9, [Ljava/lang/Object;

    aput-object v8, v10, v22

    aput-object v7, v10, v16

    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v9, v0, v26

    int-to-byte v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v24

    int-to-byte v9, v9

    aget-byte v0, v0, v26

    int-to-byte v0, v0

    invoke-static {v6, v9, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v12}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception v0

    :try_start_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_a

    throw v1

    :cond_a
    throw v0

    :cond_b
    :goto_c
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v9, v0, v26

    int-to-byte v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/4 v9, 0x7

    invoke-static {v8, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    aput-object v11, v8, v16

    aput-object v10, v8, v22

    const/16 v27, 0x2

    aput-object v7, v8, v27

    const/4 v14, 0x3

    aput-object v4, v8, v14

    aput-object v10, v8, v21

    const/4 v10, 0x5

    aput-object v7, v8, v10

    const/4 v7, 0x6

    aput-object v4, v8, v7

    const/4 v4, 0x7

    new-array v4, v4, [Z

    fill-array-data v4, :array_0

    const/4 v15, 0x7

    new-array v15, v15, [Z

    fill-array-data v15, :array_1

    move/from16 v28, v7

    new-array v7, v9, [Z

    aput-boolean v16, v7, v16

    aput-boolean v16, v7, v22

    const/16 v27, 0x2

    aput-boolean v22, v7, v27

    aput-boolean v22, v7, v14

    aput-boolean v16, v7, v21

    aput-boolean v22, v7, v10

    aput-boolean v22, v7, v28
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_17

    const/16 v29, 0x1ac

    const/16 v30, 0x1e8

    move/from16 v31, v9

    :try_start_15
    aget-byte v9, v0, v30

    int-to-byte v9, v9

    aget-byte v14, v0, v18

    int-to-byte v14, v14

    const/16 v10, 0x36a

    invoke-static {v10, v9, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v29

    int-to-byte v10, v10

    const/16 v14, 0x15e

    aget-byte v0, v0, v14

    int-to-byte v0, v0

    const/16 v14, 0x353

    invoke-static {v14, v10, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_15
    .catch Ljava/lang/ClassNotFoundException; {:try_start_15 .. :try_end_15} :catch_b
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_17

    const/16 v9, 0x22

    if-lt v0, v9, :cond_c

    move/from16 v9, v22

    goto :goto_d

    :cond_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move/from16 v9, v16

    :goto_d
    const/16 v10, 0x1d

    if-ne v0, v10, :cond_d

    goto :goto_e

    :cond_d
    const/16 v10, 0x1a

    if-lt v0, v10, :cond_e

    move/from16 v10, v22

    goto :goto_f

    :cond_e
    :goto_e
    move/from16 v10, v16

    :goto_f
    :try_start_16
    aput-boolean v10, v7, v16

    const/16 v10, 0x15

    if-lt v0, v10, :cond_f

    move/from16 v10, v22

    goto :goto_10

    :cond_f
    move/from16 v10, v16

    :goto_10
    aput-boolean v10, v7, v22

    const/16 v10, 0x15

    if-lt v0, v10, :cond_10

    move/from16 v0, v22

    goto :goto_11

    :cond_10
    move/from16 v0, v16

    :goto_11
    aput-boolean v0, v7, v21
    :try_end_16
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_17

    goto :goto_12

    :catch_b
    move/from16 v9, v16

    :catch_c
    :goto_12
    move/from16 v10, v16

    move v14, v10

    :goto_13
    if-nez v10, :cond_5d

    const/16 v0, 0x9

    if-ge v14, v0, :cond_5d

    :try_start_17
    aget-boolean v0, v7, v14
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    if-eqz v0, :cond_5c

    const/16 v35, 0x69

    const/16 v36, 0x2e4

    const/16 v37, 0x122

    :try_start_18
    aget-boolean v38, v4, v14

    aget-object v0, v8, v14

    aget-boolean v39, v15, v14
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6e

    const/16 v40, 0x2cf

    const/16 v41, 0x196

    if-eqz v38, :cond_15

    if-eqz v0, :cond_12

    sget v42, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v43, v42, 0x23

    and-int/lit8 v42, v42, 0x23

    shl-int/lit8 v42, v42, 0x1

    add-int v11, v43, v42

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 6
    :try_start_19
    sget-object v11, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v6, v11, v24
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    int-to-byte v6, v6

    move-object/from16 v43, v4

    :try_start_1a
    aget-byte v4, v11, v26
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    int-to-byte v4, v4

    move-object/from16 v44, v7

    const/16 v7, 0x3a4

    :try_start_1b
    invoke-static {v7, v6, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v6, 0xea

    aget-byte v6, v11, v6

    int-to-byte v6, v6

    aget-byte v7, v11, v25

    int-to-byte v7, v7

    const/16 v11, 0x34d

    invoke-static {v11, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    if-eqz v4, :cond_13

    :goto_14
    move-object v11, v8

    goto/16 :goto_1a

    :catchall_1
    move-exception v0

    goto :goto_16

    :catchall_2
    move-exception v0

    :goto_15
    move-object/from16 v44, v7

    goto :goto_16

    :catchall_3
    move-exception v0

    move-object/from16 v43, v4

    goto :goto_15

    :goto_16
    :try_start_1c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_11

    throw v4

    :catchall_4
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    :goto_17
    move-object/from16 v50, v8

    move/from16 v47, v9

    move/from16 v54, v10

    :goto_18
    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    move-object v10, v3

    goto/16 :goto_6f

    :cond_11
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    :cond_12
    move-object/from16 v43, v4

    move-object/from16 v44, v7

    :cond_13
    :try_start_1d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v6, v19

    int-to-byte v7, v7

    aget-byte v11, v6, v35

    int-to-byte v11, v11

    move-object/from16 v38, v6

    const/16 v6, 0x346

    invoke-static {v6, v7, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v0, v38, v41

    int-to-byte v0, v0

    aget-byte v6, v38, v40
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    move-object v11, v8

    :try_start_1e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    mul-int/lit16 v8, v6, 0x364

    add-int/lit16 v8, v8, -0x364

    move/from16 v39, v8

    not-int v8, v7

    not-int v8, v8

    move/from16 v40, v8

    not-int v8, v6

    move/from16 v41, v8

    not-int v8, v7

    xor-int v45, v41, v8

    and-int v46, v41, v8

    move/from16 v47, v8

    or-int v8, v45, v46

    not-int v8, v8

    or-int v8, v40, v8

    mul-int/lit16 v8, v8, -0x363

    not-int v8, v8

    sub-int v8, v39, v8

    add-int/lit8 v8, v8, -0x1

    move/from16 v39, v8

    not-int v8, v6

    move/from16 v40, v6

    not-int v6, v8

    move/from16 v45, v6

    not-int v6, v7

    xor-int v46, v45, v6

    and-int v6, v45, v6

    or-int v6, v46, v6

    xor-int v45, v41, v7

    and-int v46, v41, v7

    move/from16 v48, v6

    or-int v6, v45, v46

    not-int v6, v6

    xor-int v45, v48, v6

    and-int v6, v48, v6

    or-int v6, v45, v6

    mul-int/lit16 v6, v6, -0x6c6

    xor-int v45, v39, v6

    and-int v6, v39, v6

    shl-int/lit8 v6, v6, 0x1

    add-int v45, v45, v6

    xor-int v6, v41, v47

    and-int v39, v41, v47

    or-int v6, v6, v39

    not-int v6, v6

    xor-int v39, v40, v7

    and-int v40, v40, v7

    move/from16 v41, v6

    or-int v6, v39, v40

    not-int v6, v6

    or-int v6, v41, v6

    xor-int/lit8 v39, v8, -0x1

    or-int v8, v39, v8

    xor-int v39, v8, v7

    and-int/2addr v7, v8

    or-int v7, v39, v7

    not-int v7, v7

    xor-int v8, v6, v7

    and-int/2addr v6, v7

    or-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x363

    neg-int v6, v6

    neg-int v6, v6

    xor-int v7, v45, v6

    and-int v6, v45, v6

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v7, v6

    int-to-byte v6, v7

    const/16 v7, 0x342

    invoke-static {v7, v0, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    :try_start_1f
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v4, v38, v37

    int-to-byte v4, v4

    aget-byte v6, v38, v26

    int-to-byte v6, v6

    const/16 v7, 0x342

    invoke-static {v7, v4, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_20
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_14

    throw v4

    :catchall_6
    move-exception v0

    :goto_19
    move-object v6, v1

    move-object v1, v2

    move/from16 v47, v9

    move/from16 v54, v10

    move-object/from16 v50, v11

    goto/16 :goto_18

    :cond_14
    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    :catchall_7
    move-exception v0

    move-object v11, v8

    goto :goto_19

    :cond_15
    move-object/from16 v43, v4

    move-object/from16 v44, v7

    goto/16 :goto_14

    :goto_1a
    if-eqz v38, :cond_29

    :try_start_21
    new-instance v7, Ljava/util/Random;

    invoke-direct {v7}, Ljava/util/Random;-><init>()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_13

    .line 7
    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v45, v8, 0x33

    or-int/lit8 v8, v8, 0x33

    add-int v8, v45, v8

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 8
    :try_start_22
    sget-object v8, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v45, 0xad

    const/16 v46, 0x3b

    aget-byte v4, v8, v45

    int-to-byte v4, v4

    aget-byte v6, v8, v26

    int-to-byte v6, v6

    move-object/from16 v47, v8

    const/16 v8, 0x38c

    invoke-static {v8, v4, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v6, 0x1e9

    aget-byte v6, v47, v6

    int-to-byte v6, v6

    aget-byte v8, v47, v25
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_12

    int-to-byte v8, v8

    move/from16 v47, v9

    const/16 v9, 0x330

    :try_start_23
    invoke-static {v9, v6, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_11

    const-wide/32 v48, -0x52c064e4

    xor-long v8, v8, v48

    :try_start_24
    invoke-virtual {v7, v8, v9}, Ljava/util/Random;->setSeed(J)V

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1b
    if-nez v4, :cond_27

    if-nez v6, :cond_16

    move-object/from16 v48, v4

    move-object/from16 v49, v6

    move/from16 v4, v28

    goto :goto_1c

    :cond_16
    if-nez v8, :cond_17

    move-object/from16 v48, v4

    move-object/from16 v49, v6

    const/4 v4, 0x5

    goto :goto_1c

    :cond_17
    if-nez v9, :cond_18

    move-object/from16 v48, v4

    move-object/from16 v49, v6

    move/from16 v4, v21

    goto :goto_1c

    :cond_18
    move-object/from16 v48, v4

    move-object/from16 v49, v6

    const/4 v4, 0x3

    :goto_1c
    new-instance v6, Ljava/lang/StringBuilder;

    and-int/lit8 v50, v4, 0x1

    or-int/lit8 v51, v4, 0x1

    move-object/from16 v52, v8

    add-int v8, v50, v51

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v8, 0x2e

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move/from16 v8, v16

    :goto_1d
    if-ge v8, v4, :cond_1b

    if-eqz v39, :cond_1a

    move/from16 v50, v4

    const/16 v4, 0x1a

    invoke-virtual {v7, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    invoke-virtual {v7}, Ljava/util/Random;->nextBoolean()Z

    move-result v51

    if-eqz v51, :cond_19

    move/from16 v53, v8

    move-object/from16 v51, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    long-to-int v8, v8

    mul-int/lit16 v9, v4, 0x1e3

    move/from16 v54, v10

    xor-int/lit16 v10, v9, 0x3d72

    and-int/lit16 v9, v9, 0x3d72

    shl-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v9

    not-int v9, v4

    xor-int/lit8 v55, v9, -0x42

    and-int/lit8 v56, v9, -0x42

    move/from16 v57, v9

    or-int v9, v55, v56

    not-int v9, v9

    move/from16 v55, v9

    not-int v9, v8

    xor-int v56, v57, v9

    and-int v9, v57, v9

    or-int v9, v56, v9

    not-int v9, v9

    xor-int v56, v55, v9

    and-int v9, v55, v9

    or-int v9, v56, v9

    mul-int/lit16 v9, v9, -0xf1

    not-int v9, v9

    sub-int/2addr v10, v9

    add-int/lit8 v10, v10, -0x1

    xor-int/lit8 v9, v4, 0x41

    and-int/lit8 v55, v4, 0x41

    or-int v9, v9, v55

    mul-int/lit16 v9, v9, -0x1e2

    neg-int v9, v9

    neg-int v9, v9

    xor-int v55, v10, v9

    and-int/2addr v9, v10

    shl-int/lit8 v9, v9, 0x1

    add-int v55, v55, v9

    const/16 v9, -0x42

    or-int/2addr v9, v4

    not-int v9, v9

    not-int v4, v4

    not-int v8, v8

    or-int/2addr v4, v8

    xor-int/lit8 v8, v4, 0x41

    and-int/lit8 v4, v4, 0x41

    or-int/2addr v4, v8

    not-int v4, v4

    xor-int v8, v9, v4

    and-int/2addr v4, v9

    or-int/2addr v4, v8

    mul-int/lit16 v4, v4, 0xf1

    neg-int v4, v4

    neg-int v4, v4

    not-int v4, v4

    sub-int v55, v55, v4

    add-int/lit8 v55, v55, -0x1

    :goto_1e
    move/from16 v4, v55

    goto :goto_23

    :catchall_8
    move-exception v0

    :goto_1f
    move/from16 v54, v10

    :goto_20
    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v50, v11

    :goto_21
    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    :goto_22
    const/16 v32, 0x3

    const/16 v33, 0x5

    goto/16 :goto_6f

    :cond_19
    move/from16 v53, v8

    move-object/from16 v51, v9

    move/from16 v54, v10

    or-int/lit8 v8, v4, 0x60

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit8 v4, v4, 0x60

    sub-int v55, v8, v4

    goto :goto_1e

    :goto_23
    int-to-char v4, v4

    :try_start_25
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_24

    :catchall_9
    move-exception v0

    goto :goto_20

    :cond_1a
    move/from16 v50, v4

    move/from16 v53, v8

    move-object/from16 v51, v9

    move/from16 v54, v10

    const/16 v4, 0xc

    invoke-virtual {v7, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    xor-int/lit16 v8, v4, 0x2000

    and-int/lit16 v4, v4, 0x2000

    shl-int/lit8 v4, v4, 0x1

    add-int/2addr v8, v4

    int-to-char v4, v8

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_24
    add-int/lit8 v8, v53, 0x1

    move/from16 v4, v50

    move-object/from16 v9, v51

    move/from16 v10, v54

    goto/16 :goto_1d

    :cond_1b
    move-object/from16 v51, v9

    move/from16 v54, v10

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    if-nez v49, :cond_1e

    .line 9
    sget v6, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v8, v6, 0x3b

    and-int/lit8 v6, v6, 0x3b

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v8, v6

    rem-int/lit16 v6, v8, 0x80

    sput v6, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/4 v9, 0x2

    rem-int/2addr v8, v9

    if-eqz v8, :cond_1d

    .line 10
    :try_start_26
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v4, v6, v22

    aput-object v0, v6, v16

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v4, v24

    int-to-byte v8, v8

    aget-byte v9, v4, v26

    int-to-byte v9, v9

    const/16 v10, 0x3a4

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v24

    int-to-byte v9, v9

    aget-byte v4, v4, v26

    int-to-byte v4, v4

    invoke-static {v10, v9, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v12}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_a

    move-object v6, v4

    move-object/from16 v53, v7

    move-object/from16 v4, v48

    :goto_25
    move-object/from16 v9, v51

    :goto_26
    move-object/from16 v8, v52

    goto/16 :goto_27

    :catchall_a
    move-exception v0

    :try_start_27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1c

    throw v4

    :cond_1c
    throw v0

    :cond_1d
    const/16 v34, 0x0

    .line 11
    throw v34
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_9

    :cond_1e
    if-nez v52, :cond_20

    const/4 v9, 0x2

    .line 12
    :try_start_28
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v4, v6, v22

    aput-object v0, v6, v16

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v4, v24

    int-to-byte v8, v8

    aget-byte v9, v4, v26

    int-to-byte v9, v9

    const/16 v10, 0x3a4

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v24

    int-to-byte v9, v9

    aget-byte v4, v4, v26

    int-to-byte v4, v4

    invoke-static {v10, v9, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v12}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_b

    move-object v8, v4

    move-object/from16 v53, v7

    move-object/from16 v4, v48

    move-object/from16 v6, v49

    move-object/from16 v9, v51

    goto/16 :goto_27

    :catchall_b
    move-exception v0

    :try_start_29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1f

    throw v4

    :cond_1f
    throw v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_9

    :cond_20
    if-nez v51, :cond_22

    const/4 v9, 0x2

    :try_start_2a
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v4, v6, v22

    aput-object v0, v6, v16

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v4, v24

    int-to-byte v8, v8

    aget-byte v9, v4, v26

    int-to-byte v9, v9

    const/16 v10, 0x3a4

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v24

    int-to-byte v9, v9

    aget-byte v4, v4, v26

    int-to-byte v4, v4

    invoke-static {v10, v9, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v12}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_c

    move-object v9, v4

    move-object/from16 v53, v7

    move-object/from16 v4, v48

    move-object/from16 v6, v49

    goto/16 :goto_26

    :catchall_c
    move-exception v0

    :try_start_2b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_21

    throw v4

    :cond_21
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_9

    :cond_22
    const/4 v9, 0x2

    :try_start_2c
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v4, v6, v22

    aput-object v0, v6, v16

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v4, v24

    int-to-byte v8, v8

    aget-byte v9, v4, v26

    int-to-byte v9, v9

    const/16 v10, 0x3a4

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v4, v24

    int-to-byte v9, v9

    aget-byte v10, v4, v26

    int-to-byte v10, v10

    move-object/from16 v48, v4

    const/16 v4, 0x3a4

    invoke-static {v4, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v4, v12}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_10

    :try_start_2d
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v48, v30

    int-to-byte v8, v8

    aget-byte v9, v48, v26

    int-to-byte v9, v9

    const/16 v10, 0x320

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v48, v24

    int-to-byte v9, v9

    aget-byte v10, v48, v26

    int-to-byte v10, v10

    move-object/from16 v53, v7

    const/16 v7, 0x3a4

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_e

    .line 13
    sget v7, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v7, v7, 0x35

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 14
    :try_start_2e
    aget-byte v7, v48, v30

    int-to-byte v7, v7

    aget-byte v8, v48, v26

    int-to-byte v8, v8

    const/16 v9, 0x320

    invoke-static {v9, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v48, v19

    int-to-byte v8, v8

    aget-byte v9, v48, v25

    int-to-byte v9, v9

    const/16 v10, 0x309

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_d

    move-object/from16 v6, v49

    goto/16 :goto_25

    :goto_27
    move-object/from16 v7, v53

    move/from16 v10, v54

    goto/16 :goto_1b

    :catchall_d
    move-exception v0

    :try_start_2f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_23

    throw v6

    :catch_d
    move-exception v0

    goto :goto_28

    :cond_23
    throw v0

    :catchall_e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_24

    throw v6

    :cond_24
    throw v0
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_d
    .catchall {:try_start_2f .. :try_end_2f} :catchall_9

    :goto_28
    :try_start_30
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v7, v19

    int-to-byte v8, v8

    aget-byte v9, v7, v35

    int-to-byte v9, v9

    const/16 v10, 0x305

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v4, v7, v41

    int-to-byte v4, v4

    aget-byte v8, v7, v40

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v9, v9

    mul-int/lit16 v10, v8, -0x1c0

    not-int v10, v10

    rsub-int v10, v10, -0x1c3

    move-object/from16 v38, v7

    not-int v7, v8

    move/from16 v39, v7

    not-int v7, v8

    xor-int/lit8 v40, v7, -0x1

    or-int v40, v40, v7

    xor-int v41, v40, v9

    and-int v40, v40, v9

    move/from16 v45, v7

    or-int v7, v41, v40

    not-int v7, v7

    xor-int v40, v39, v7

    and-int v7, v39, v7

    or-int v7, v40, v7

    mul-int/lit16 v7, v7, 0x1c1

    add-int/2addr v7, v10

    not-int v10, v8

    mul-int/lit16 v10, v10, -0x543

    or-int v39, v7, v10

    shl-int/lit8 v39, v39, 0x1

    xor-int/2addr v7, v10

    sub-int v39, v39, v7

    not-int v7, v8

    not-int v8, v9

    or-int v8, v45, v8

    xor-int/lit8 v9, v8, -0x1

    or-int/2addr v8, v9

    not-int v8, v8

    or-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x1c1

    xor-int v8, v39, v7

    and-int v7, v39, v7

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v8, v7

    int-to-byte v7, v8

    const/16 v8, 0x342

    invoke-static {v8, v4, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_9

    const/4 v9, 0x2

    :try_start_31
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v0, v6, v22

    aput-object v4, v6, v16

    aget-byte v0, v38, v37

    int-to-byte v0, v0

    aget-byte v4, v38, v26

    int-to-byte v4, v4

    const/16 v7, 0x342

    invoke-static {v7, v0, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v12, v2}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_f

    :catchall_f
    move-exception v0

    :try_start_32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_25

    throw v4

    :cond_25
    throw v0

    :catchall_10
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_26

    throw v4

    :cond_26
    throw v0

    :cond_27
    move-object/from16 v48, v4

    move-object/from16 v49, v6

    move-object/from16 v52, v8

    move-object/from16 v51, v9

    move-object/from16 v7, v52

    :goto_29
    move/from16 v54, v10

    goto :goto_2c

    :catchall_11
    move-exception v0

    :goto_2a
    move/from16 v54, v10

    goto :goto_2b

    :catchall_12
    move-exception v0

    move/from16 v47, v9

    goto :goto_2a

    :goto_2b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_28

    throw v4

    :cond_28
    throw v0

    :catchall_13
    move-exception v0

    move/from16 v47, v9

    goto/16 :goto_1f

    :cond_29
    move/from16 v47, v9

    const/16 v46, 0x3b

    const/4 v7, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v51, 0x0

    goto :goto_29

    :goto_2c
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v4, 0x1e

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    const/16 v6, 0x292

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v8, 0x301

    invoke-static {v8, v4, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_9

    :try_start_33
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v0, v20

    int-to-byte v8, v8

    aget-byte v9, v0, v21

    int-to-byte v9, v9

    const/16 v10, 0x2d2

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_6d

    :try_start_34
    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v9, v0, v26

    int-to-byte v9, v9

    const/16 v10, 0x2c8

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v29

    int-to-byte v9, v9

    aget-byte v10, v0, v21

    int-to-byte v10, v10

    move-object/from16 v39, v7

    const/16 v7, 0x2bd

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v8, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_6c

    :try_start_35
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v9, v8, 0x234

    int-to-short v9, v9

    aget-byte v10, v0, v41
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_9

    int-to-byte v10, v10

    move-object/from16 v50, v11

    move/from16 v11, v25

    :try_start_36
    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_6b

    :try_start_37
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_69

    const/4 v9, 0x5

    :try_start_38
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_6a

    :try_start_39
    new-instance v7, Ljava/util/zip/ZipFile;

    invoke-direct {v7, v6}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_69

    const/16 v6, 0x1a70

    :try_start_3a
    new-array v6, v6, [B

    move/from16 v9, v22

    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_66

    .line 15
    sget v9, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v9, v9, 0x1d

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 16
    :try_start_3b
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v9, v8, 0x234

    int-to-short v9, v9

    aget-byte v10, v0, v18

    int-to-byte v10, v10

    aget-byte v11, v0, v26

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v37

    int-to-byte v10, v10

    aget-byte v11, v0, v26

    int-to-byte v11, v11

    move-object/from16 v52, v6

    const/16 v6, 0x29d

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_65

    :try_start_3c
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v9, v8, 0x208

    int-to-short v9, v9

    aget-byte v10, v0, v36

    int-to-byte v10, v10

    aget-byte v11, v0, v26

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v37

    int-to-byte v10, v10

    aget-byte v11, v0, v26

    int-to-byte v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_64

    :try_start_3d
    filled-new-array/range {v52 .. v52}, [Ljava/lang/Object;

    move-result-object v9

    xor-int/lit16 v10, v8, 0x208

    and-int/lit16 v11, v8, 0x208

    or-int/2addr v10, v11

    int-to-short v10, v10

    aget-byte v11, v0, v36

    int-to-byte v11, v11

    aget-byte v6, v0, v26

    int-to-byte v6, v6

    invoke-static {v10, v11, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v10, 0x82

    aget-byte v11, v0, v10

    int-to-byte v11, v11

    const/16 v55, 0xae

    move/from16 v56, v10

    aget-byte v10, v0, v55
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_63

    int-to-byte v10, v10

    move-object/from16 v57, v13

    const/16 v13, 0x275

    :try_start_3e
    invoke-static {v13, v11, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    const-class v11, [B

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v6, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_62

    .line 17
    sget v6, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit8 v9, v6, 0x2f

    and-int/lit8 v6, v6, 0x2f

    const/16 v22, 0x1

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v9, v6

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit16 v6, v8, 0x208

    and-int/lit16 v8, v8, 0x208

    or-int/2addr v6, v8

    int-to-short v6, v6

    .line 18
    :try_start_3f
    aget-byte v8, v0, v36

    int-to-byte v8, v8

    aget-byte v9, v0, v26

    int-to-byte v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v0, v19
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_60

    int-to-byte v8, v8

    const/16 v25, 0x56

    :try_start_40
    aget-byte v0, v0, v25
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_61

    int-to-byte v0, v0

    const/16 v10, 0x309

    :try_start_41
    invoke-static {v10, v8, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v6, v0, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_60

    const/16 v0, 0x14

    const/16 v4, 0x1a4a

    move v6, v4

    move v4, v0

    move v0, v6

    move-object/from16 v6, v52

    move-object/from16 v9, v57

    const/4 v8, 0x0

    .line 19
    :goto_2d
    :try_start_42
    array-length v10, v6
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_14

    const-wide/16 v58, 0x1

    move/from16 v11, v16

    :goto_2e
    if-ge v11, v10, :cond_2b

    .line 20
    sget v52, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v60, 0x10

    add-int/lit8 v13, v52, 0x7

    move/from16 v52, v10

    rem-int/lit16 v10, v13, 0x80

    sput v10, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/16 v27, 0x2

    rem-int/lit8 v13, v13, 0x2

    if-eqz v13, :cond_2a

    :try_start_43
    aget-byte v10, v6, v11

    move v13, v11

    int-to-long v10, v10

    const/16 v60, 0x4d

    shr-long v60, v58, v60

    div-long v10, v10, v60

    const/16 v60, 0x4b

    shr-long v60, v58, v60

    add-long v10, v10, v60

    rem-long v58, v10, v58

    add-int/lit8 v11, v13, 0x5f

    :goto_2f
    move/from16 v10, v52

    goto :goto_2e

    :catchall_14
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    :goto_30
    move/from16 v59, v14

    :goto_31
    move-object/from16 v52, v15

    :goto_32
    const/16 v25, 0x56

    const/16 v32, 0x3

    const/16 v33, 0x5

    :goto_33
    move-object v2, v0

    goto/16 :goto_6d

    :cond_2a
    move v13, v11

    .line 21
    aget-byte v10, v6, v13

    int-to-long v10, v10

    shl-long v61, v58, v28

    add-long v10, v10, v61

    shl-long v60, v58, v60

    add-long v10, v10, v60

    sub-long v58, v10, v58

    and-int/lit8 v10, v13, -0x7d

    or-int/lit8 v11, v13, -0x7d

    add-int/2addr v10, v11

    and-int/lit8 v11, v10, 0x7e

    or-int/lit8 v10, v10, 0x7e

    add-int/2addr v11, v10

    goto :goto_2f

    :cond_2b
    const/16 v60, 0x10

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    long-to-int v10, v10

    mul-int/lit16 v11, v4, 0xfd

    const v13, 0x4fae2

    xor-int v52, v13, v11

    and-int/2addr v11, v13

    const/16 v22, 0x1

    shl-int/lit8 v11, v11, 0x1

    add-int v52, v52, v11

    not-int v11, v4

    const/16 v13, -0x50b

    xor-int v61, v13, v11

    and-int/2addr v13, v11

    or-int v13, v61, v13

    not-int v13, v13

    move/from16 v61, v11

    not-int v11, v10

    move/from16 v62, v10

    or-int v10, v61, v11

    not-int v10, v10

    xor-int v63, v13, v10

    and-int/2addr v10, v13

    or-int v10, v63, v10

    or-int/lit16 v13, v4, 0x50a

    or-int v13, v13, v62

    not-int v13, v13

    xor-int v63, v10, v13

    and-int/2addr v10, v13

    or-int v10, v63, v10

    mul-int/lit16 v10, v10, -0xfc

    add-int v10, v10, v52

    xor-int/lit16 v13, v4, 0x50a

    move/from16 v52, v10

    and-int/lit16 v10, v4, 0x50a

    or-int/2addr v10, v13

    mul-int/lit16 v13, v10, -0xfc

    xor-int v63, v52, v13

    and-int v13, v52, v13

    const/16 v22, 0x1

    shl-int/lit8 v13, v13, 0x1

    add-int v63, v63, v13

    xor-int v13, v61, v11

    and-int v11, v61, v11

    or-int/2addr v11, v13

    xor-int/lit16 v13, v11, 0x50a

    and-int/lit16 v11, v11, 0x50a

    or-int/2addr v11, v13

    not-int v11, v11

    xor-int v13, v10, v62

    and-int v10, v10, v62

    or-int/2addr v10, v13

    not-int v10, v10

    or-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0xfc

    neg-int v10, v10

    neg-int v10, v10

    or-int v11, v63, v10

    const/16 v22, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int v10, v63, v10

    sub-int/2addr v11, v10

    move v13, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    long-to-int v10, v10

    mul-int/lit16 v11, v4, -0x1ee

    const v52, -0x1dc832

    add-int v11, v11, v52

    move/from16 v52, v11

    xor-int/lit16 v11, v4, 0xf6f

    move/from16 v62, v11

    and-int/lit16 v11, v4, 0xf6f

    or-int v11, v62, v11

    not-int v11, v11

    mul-int/lit16 v11, v11, -0x1ef

    neg-int v11, v11

    neg-int v11, v11

    or-int v62, v52, v11

    const/16 v22, 0x1

    shl-int/lit8 v62, v62, 0x1

    xor-int v11, v52, v11

    sub-int v62, v62, v11

    not-int v11, v10

    move/from16 v52, v13

    xor-int/lit16 v13, v11, 0xf6f

    and-int/lit16 v11, v11, 0xf6f

    or-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x1ef

    neg-int v11, v11

    neg-int v11, v11

    or-int v13, v62, v11

    const/16 v22, 0x1

    shl-int/lit8 v13, v13, 0x1

    xor-int v11, v62, v11

    sub-int/2addr v13, v11

    const/16 v11, -0xf70

    xor-int v62, v11, v61

    and-int v11, v11, v61

    or-int v11, v62, v11

    not-int v11, v11

    not-int v10, v10

    move/from16 v61, v11

    xor-int/lit16 v11, v10, 0xf6f

    and-int/lit16 v10, v10, 0xf6f

    or-int/2addr v10, v11

    not-int v10, v10

    xor-int v11, v61, v10

    and-int v10, v61, v10

    or-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x1ef

    add-int/2addr v10, v13

    aget-byte v10, v6, v10
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_14

    move v11, v14

    :try_start_44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    mul-int/lit16 v14, v10, 0x1b2

    neg-int v14, v14

    neg-int v14, v14

    not-int v14, v14

    const v61, -0xc8d1

    sub-int v61, v61, v14

    not-int v14, v13

    const/16 v62, -0x78

    xor-int v63, v62, v14

    and-int v14, v62, v14

    or-int v14, v63, v14

    or-int/2addr v14, v10

    not-int v14, v14

    mul-int/lit16 v14, v14, 0x1b1

    or-int v63, v61, v14

    const/16 v22, 0x1

    shl-int/lit8 v63, v63, 0x1

    xor-int v14, v61, v14

    sub-int v63, v63, v14

    not-int v14, v10

    or-int/2addr v14, v13

    not-int v14, v14

    const/16 v61, -0x78

    or-int v14, v61, v14

    mul-int/lit16 v14, v14, -0x1b1

    not-int v14, v14

    sub-int v63, v63, v14

    const/16 v22, 0x1

    add-int/lit8 v63, v63, -0x1

    xor-int v14, v62, v13

    and-int v13, v62, v13

    or-int/2addr v13, v14

    not-int v13, v13

    xor-int/lit8 v14, v10, 0x77

    and-int/lit8 v10, v10, 0x77

    or-int/2addr v10, v14

    not-int v10, v10

    xor-int v14, v13, v10

    and-int/2addr v10, v13

    or-int/2addr v10, v14

    mul-int/lit16 v10, v10, 0x1b1

    add-int v10, v10, v63

    int-to-byte v10, v10

    aput-byte v10, v6, v52

    array-length v10, v6
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_5f

    neg-int v13, v4

    move-object/from16 v52, v15

    :try_start_45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_5c

    long-to-int v14, v14

    mul-int/lit16 v15, v13, -0x1f4

    move/from16 v61, v4

    mul-int/lit16 v4, v10, -0x1f4

    and-int v62, v15, v4

    or-int/2addr v4, v15

    add-int v62, v62, v4

    not-int v4, v10

    xor-int v15, v4, v13

    and-int/2addr v4, v13

    or-int/2addr v4, v15

    not-int v4, v4

    not-int v13, v13

    xor-int v15, v13, v10

    and-int v63, v13, v10

    or-int v15, v15, v63

    xor-int v63, v15, v14

    and-int/2addr v15, v14

    or-int v15, v63, v15

    not-int v15, v15

    or-int/2addr v4, v15

    mul-int/lit16 v4, v4, 0x1f5

    neg-int v4, v4

    neg-int v4, v4

    and-int v15, v62, v4

    or-int v4, v62, v4

    add-int/2addr v15, v4

    not-int v4, v10

    xor-int v62, v13, v4

    and-int/2addr v4, v13

    or-int v4, v62, v4

    not-int v4, v4

    mul-int/lit16 v4, v4, 0x3ea

    neg-int v4, v4

    neg-int v4, v4

    or-int v62, v15, v4

    const/16 v22, 0x1

    shl-int/lit8 v62, v62, 0x1

    xor-int/2addr v4, v15

    sub-int v62, v62, v4

    not-int v4, v14

    or-int/2addr v4, v13

    xor-int v13, v4, v10

    and-int/2addr v4, v10

    or-int/2addr v4, v13

    not-int v4, v4

    mul-int/lit16 v4, v4, 0x1f5

    neg-int v4, v4

    neg-int v4, v4

    xor-int v10, v62, v4

    and-int v4, v62, v4

    const/16 v22, 0x1

    shl-int/lit8 v4, v4, 0x1

    add-int/2addr v10, v4

    const/4 v4, 0x3

    :try_start_46
    new-array v13, v4, [Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_5e

    :try_start_47
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v27, 0x2

    aput-object v4, v13, v27

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v13, v22

    aput-object v6, v13, v16

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v6, 0x33

    aget-byte v6, v4, v6

    int-to-byte v6, v6

    aget-byte v10, v4, v26

    int-to-byte v10, v10

    const/16 v14, 0x26d

    invoke-static {v14, v6, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-class v10, [B

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v6, v15}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_5d

    :try_start_48
    sget-object v13, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_5c

    if-nez v13, :cond_2d

    :try_start_49
    sput-wide v58, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v62

    const/16 v13, 0x30

    shr-long v62, v62, v13

    const-wide v64, 0x3d58aa5daa3eed8aL    # 3.505177192383821E-13

    add-long v62, v62, v64

    move-object/from16 v64, v14

    xor-long v13, v58, v62

    long-to-int v13, v13

    sget-wide v58, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v62

    const/16 v14, 0x30

    shr-long v62, v62, v14

    const-wide v65, -0x3d58aa5dbc7e367eL    # -1.2828280996068754E13

    add-long v62, v62, v65

    move/from16 v65, v13

    xor-long v13, v58, v62

    long-to-int v13, v13

    sget-wide v58, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v62

    const/16 v14, 0x30

    shr-long v62, v62, v14

    const-wide v66, 0x3d58aa5d8616b9e6L    # 3.5051768861217966E-13

    add-long v62, v62, v66

    move/from16 v66, v13

    xor-long v13, v58, v62

    long-to-int v13, v13

    sget v14, Lcom/appsflyer/internal/AFi1nSDK;->setDebugLog:I

    sget v58, Lcom/appsflyer/internal/AFi1nSDK;->setUserFirstName:I
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_18

    .line 23
    sget v59, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v68, 0x12

    add-int/lit8 v15, v59, 0x77

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    move-object/from16 v69, v4

    move/from16 v15, v28

    .line 24
    :try_start_4a
    new-array v4, v15, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_16

    const/16 v33, 0x5

    :try_start_4b
    aput-object v13, v4, v33

    invoke-static/range {v58 .. v58}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v4, v21

    invoke-static/range {v66 .. v66}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v13

    const/16 v32, 0x3

    aput-object v13, v4, v32

    invoke-static/range {v65 .. v65}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v27, 0x2

    aput-object v13, v4, v27

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v22, 0x1

    aput-object v13, v4, v22

    aput-object v6, v4, v16

    const/16 v6, 0xe

    aget-byte v6, v69, v6

    int-to-byte v6, v6

    const/16 v25, 0x56

    aget-byte v13, v69, v25

    int-to-byte v13, v13

    const/16 v14, 0x252

    invoke-static {v14, v6, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v13, v69, v37

    int-to-byte v13, v13

    aget-byte v14, v69, v26

    int-to-byte v14, v14

    const/16 v15, 0x29d

    invoke-static {v15, v13, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v62

    sget-object v65, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    move-object/from16 v63, v64

    move-object/from16 v64, v63

    move-object/from16 v66, v63

    move-object/from16 v67, v63

    filled-new-array/range {v62 .. v67}, [Ljava/lang/Class;

    move-result-object v13

    move-object/from16 v14, v63

    invoke-virtual {v6, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_15

    move-object/from16 v58, v7

    move-object/from16 v62, v8

    move/from16 v59, v11

    const/16 v32, 0x3

    goto/16 :goto_37

    :catchall_15
    move-exception v0

    goto :goto_34

    :catchall_16
    move-exception v0

    const/16 v33, 0x5

    :goto_34
    :try_start_4c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2c

    throw v4

    :catchall_17
    move-exception v0

    :goto_35
    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    :goto_36
    move/from16 v59, v11

    const/16 v25, 0x56

    const/16 v28, 0x6

    const/16 v32, 0x3

    goto/16 :goto_33

    :cond_2c
    throw v0

    :catchall_18
    move-exception v0

    const/16 v33, 0x5

    goto :goto_35

    :cond_2d
    move-object/from16 v69, v4

    const/16 v33, 0x5

    const/16 v68, 0x12

    sput-wide v58, Lcom/appsflyer/internal/AFi1nSDK;->updateServerUninstallToken:J
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_17

    move/from16 v4, v60

    :try_start_4d
    new-array v15, v4, [B

    fill-array-data v15, :array_2
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_5b

    :try_start_4e
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v62
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_17

    const/16 v4, 0x20

    shr-long v62, v62, v4

    const-wide v64, -0x62be3626cc0b7f5dL    # -9.426946271110411E-168

    sub-long v64, v64, v62

    move-object/from16 v62, v6

    move-object v4, v7

    xor-long v6, v58, v64

    long-to-int v6, v6

    :try_start_4f
    sget-wide v58, Lcom/appsflyer/internal/AFi1nSDK;->updateServerUninstallToken:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v63
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_5a

    const/16 v7, 0x3c

    shr-long v63, v63, v7

    const-wide v65, 0x62be3626fa68f28cL    # 4.453796388435189E167

    sub-long v65, v65, v63

    move/from16 v63, v6

    xor-long v6, v58, v65

    long-to-int v6, v6

    int-to-byte v6, v6

    move-object/from16 v58, v4

    move/from16 v7, v21

    :try_start_50
    new-array v4, v7, [Ljava/lang/Object;
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_59

    :try_start_51
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_58

    const/16 v32, 0x3

    :try_start_52
    aput-object v6, v4, v32

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v27, 0x2

    aput-object v6, v4, v27

    const/16 v22, 0x1

    aput-object v15, v4, v22

    aput-object v62, v4, v16
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_55

    const/16 v21, 0x4

    :try_start_53
    aget-byte v6, v69, v21
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_57

    int-to-byte v6, v6

    const/16 v25, 0x56

    :try_start_54
    aget-byte v7, v69, v25
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_56

    int-to-byte v7, v7

    const/16 v15, 0x234

    :try_start_55
    invoke-static {v15, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    check-cast v7, Ljava/lang/ClassLoader;

    const/4 v15, 0x1

    invoke-static {v6, v15, v7}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v69, v41

    int-to-byte v7, v7

    aget-byte v15, v69, v68
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_55

    int-to-byte v15, v15

    move/from16 v59, v11

    const/16 v11, 0x214

    :try_start_56
    invoke-static {v11, v7, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    aget-byte v11, v69, v37

    int-to-byte v11, v11

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    move-object/from16 v62, v8

    const/16 v8, 0x29d

    invoke-static {v8, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v8, v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v13, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_54

    :goto_37
    :try_start_57
    aget-byte v6, v69, v37

    int-to-byte v6, v6

    aget-byte v7, v69, v26

    int-to-byte v7, v7

    const/16 v8, 0x29d

    invoke-static {v8, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v7, 0x20f

    aget-byte v8, v69, v7

    neg-int v8, v8

    int-to-byte v8, v8

    const/16 v60, 0x10

    aget-byte v11, v69, v60

    int-to-byte v11, v11

    const/16 v13, 0x214

    invoke-static {v13, v8, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v6, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/16 v60, 0x10

    invoke-static/range {v60 .. v60}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_19

    if-eqz v38, :cond_3d

    .line 25
    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v11, v8, 0x25

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 26
    :try_start_58
    sget-object v11, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_31

    if-nez v11, :cond_2f

    add-int/lit8 v13, v8, 0x49

    .line 27
    rem-int/lit16 v15, v13, 0x80

    sput v15, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v27, 0x2

    rem-int/lit8 v13, v13, 0x2

    if-eqz v13, :cond_2e

    move-object/from16 v13, v49

    goto :goto_3c

    :cond_2e
    const/16 v34, 0x0

    :try_start_59
    throw v34
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_19

    :catchall_19
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    :goto_38
    move-object v10, v3

    move-object/from16 v4, v58

    :goto_39
    const/16 v21, 0x4

    :goto_3a
    const/16 v25, 0x56

    :goto_3b
    const/16 v28, 0x6

    goto/16 :goto_33

    :cond_2f
    move-object/from16 v13, v39

    :goto_3c
    if-nez v11, :cond_30

    add-int/lit8 v8, v8, 0x55

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    move-object/from16 v8, v51

    goto :goto_3d

    :cond_30
    move-object/from16 v8, v48

    .line 28
    :goto_3d
    :try_start_5a
    aget-byte v11, v69, v37

    int-to-byte v11, v11

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    move/from16 v63, v7

    const/16 v7, 0x29d

    invoke-static {v7, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v11, v69, v63

    neg-int v11, v11

    int-to-byte v11, v11

    aget-byte v15, v69, v55

    int-to-byte v15, v15

    const/16 v6, 0x211

    invoke-static {v6, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v7, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    aget-byte v7, v69, v30

    int-to-byte v7, v7

    aget-byte v11, v69, v26

    int-to-byte v11, v11

    const/16 v15, 0x320

    invoke-static {v15, v7, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_31

    :try_start_5b
    aget-byte v11, v69, v24

    int-to-byte v11, v11

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    move-object/from16 v65, v9

    const/16 v9, 0x3a4

    invoke-static {v9, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_5b
    .catch Ljava/lang/Exception; {:try_start_5b .. :try_end_5b} :catch_f
    .catchall {:try_start_5b .. :try_end_5b} :catchall_28

    if-eqz v47, :cond_32

    :try_start_5c
    aget-byte v11, v69, v24

    int-to-byte v11, v11

    aget-byte v15, v69, v26
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_1c

    int-to-byte v15, v15

    move-object/from16 v66, v2

    const/16 v2, 0x3a4

    :try_start_5d
    invoke-static {v2, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v11, v69, v20

    int-to-byte v11, v11

    const/16 v60, 0x10

    aget-byte v15, v69, v60
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_1b

    int-to-byte v15, v15

    move-object/from16 v67, v1

    const/16 v1, 0x20e

    :try_start_5e
    invoke-static {v1, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v2, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_1a

    goto :goto_3f

    :catchall_1a
    move-exception v0

    goto :goto_3e

    :catchall_1b
    move-exception v0

    move-object/from16 v67, v1

    goto :goto_3e

    :catchall_1c
    move-exception v0

    move-object/from16 v67, v1

    move-object/from16 v66, v2

    :goto_3e
    :try_start_5f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_31

    throw v1

    :catchall_1d
    move-exception v0

    move-object/from16 v1, v66

    move-object/from16 v2, v67

    goto/16 :goto_47

    :catch_e
    move-exception v0

    move-object/from16 v2, v67

    goto/16 :goto_45

    :cond_31
    throw v0
    :try_end_5f
    .catch Ljava/lang/Exception; {:try_start_5f .. :try_end_5f} :catch_e
    .catchall {:try_start_5f .. :try_end_5f} :catchall_1d

    :cond_32
    move-object/from16 v67, v1

    move-object/from16 v66, v2

    :goto_3f
    const/16 v1, 0x400

    :try_start_60
    new-array v2, v1, [B

    aget-byte v11, v69, v19

    int-to-byte v11, v11

    aget-byte v15, v69, v31

    int-to-byte v15, v15

    const/16 v1, 0x200

    invoke-static {v1, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v7, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_24

    :goto_40
    if-lez v0, :cond_33

    const/16 v10, 0x400

    :try_start_61
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v2, v5, v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_33

    filled-new-array {v2, v5, v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v1, v9, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_1d

    neg-int v11, v14

    not-int v11, v11

    sub-int/2addr v0, v11

    const/16 v22, 0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_40

    :cond_33
    :try_start_62
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v1, v0, v19

    int-to-byte v1, v1

    const/16 v21, 0x4

    aget-byte v2, v0, v21

    int-to-byte v2, v2

    const/16 v4, 0x1fc

    invoke-static {v4, v1, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v7, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-byte v2, v0, v17

    int-to-byte v2, v2

    aget-byte v4, v0, v26

    int-to-byte v4, v4

    const/16 v6, 0x1f8

    invoke-static {v6, v2, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sget v4, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    xor-int/lit16 v6, v4, 0x160

    and-int/lit16 v10, v4, 0x160

    or-int/2addr v6, v10

    int-to-short v6, v6

    aget-byte v10, v0, v63

    neg-int v10, v10

    int-to-byte v10, v10

    const/16 v60, 0x10

    aget-byte v11, v0, v60

    int-to-byte v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-virtual {v2, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v19

    int-to-byte v1, v1

    const/16 v25, 0x56

    aget-byte v2, v0, v25

    int-to-byte v2, v2

    const/16 v10, 0x309

    invoke-static {v10, v1, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v16

    int-to-byte v1, v1

    aget-byte v2, v0, v68

    int-to-byte v2, v2

    const/16 v6, 0x1e0

    invoke-static {v6, v1, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v0, v29

    int-to-byte v2, v2

    aget-byte v6, v0, v46

    int-to-byte v6, v6

    const/16 v7, 0x1cc

    invoke-static {v7, v2, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v12, v12, v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_24

    :try_start_63
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v6, v0, v26

    int-to-byte v6, v6

    const/16 v10, 0x3a4

    invoke-static {v10, v2, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v6, 0x265

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v21, 0x4

    aget-byte v7, v0, v21

    int-to-byte v7, v7

    const/16 v9, 0x1c6

    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-virtual {v2, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_27

    :try_start_64
    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v7, v0, v26

    int-to-byte v7, v7

    const/16 v10, 0x3a4

    invoke-static {v10, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v7, 0x265

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    const/16 v21, 0x4

    aget-byte v10, v0, v21

    int-to-byte v10, v10

    invoke-static {v9, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v6, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_25

    :try_start_65
    filled-new-array {v2, v6, v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v11, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_24

    :try_start_66
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v6, v0, v26

    int-to-byte v6, v6

    const/16 v10, 0x3a4

    invoke-static {v10, v2, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v6, 0x9e

    aget-byte v6, v0, v6

    neg-int v6, v6

    int-to-byte v6, v6

    aget-byte v7, v0, v68

    int-to-byte v7, v7

    const/16 v9, 0x1b8

    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-virtual {v2, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_23

    :try_start_67
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v6, v0, v26

    int-to-byte v6, v6

    const/16 v10, 0x3a4

    invoke-static {v10, v2, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v6, 0x9e

    aget-byte v6, v0, v6

    neg-int v6, v6

    int-to-byte v6, v6

    aget-byte v7, v0, v68

    int-to-byte v7, v7

    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-virtual {v2, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_22

    :try_start_68
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_21

    if-nez v2, :cond_35

    xor-int/lit16 v2, v4, 0x130

    and-int/lit16 v4, v4, 0x130

    or-int/2addr v2, v4

    int-to-short v2, v2

    :try_start_69
    aget-byte v4, v0, v23

    neg-int v4, v4

    int-to-byte v4, v4

    const/16 v21, 0x4

    aget-byte v0, v0, v21

    int-to-byte v0, v0

    invoke-static {v2, v4, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-virtual {v3, v0, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_20

    move-object/from16 v2, v67

    :try_start_6a
    invoke-virtual {v0, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_1f

    :try_start_6b
    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    goto :goto_43

    :catchall_1e
    move-exception v0

    :goto_41
    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    goto/16 :goto_39

    :catchall_1f
    move-exception v0

    goto :goto_42

    :catchall_20
    move-exception v0

    move-object/from16 v2, v67

    :goto_42
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_34

    throw v1

    :cond_34
    throw v0

    :cond_35
    move-object/from16 v2, v67

    :goto_43
    move-object/from16 v69, v2

    move-object v10, v3

    const/16 v28, 0x6

    goto/16 :goto_51

    :catchall_21
    move-exception v0

    move-object/from16 v2, v67

    goto :goto_41

    :catchall_22
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_36

    throw v1

    :cond_36
    throw v0

    :catchall_23
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_37

    throw v1

    :cond_37
    throw v0
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_1e

    :catchall_24
    move-exception v0

    move-object/from16 v2, v67

    :goto_44
    move-object/from16 v1, v66

    goto/16 :goto_47

    :catchall_25
    move-exception v0

    move-object/from16 v2, v67

    :try_start_6c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_38

    throw v1

    :catchall_26
    move-exception v0

    goto :goto_44

    :cond_38
    throw v0

    :catchall_27
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_39

    throw v1

    :cond_39
    throw v0

    :catchall_28
    move-exception v0

    move-object/from16 v66, v2

    move-object v2, v1

    goto :goto_44

    :catch_f
    move-exception v0

    move-object/from16 v66, v2

    move-object v2, v1

    :goto_45
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v6, v4, v19

    int-to-byte v6, v6

    aget-byte v7, v4, v35

    int-to-byte v7, v7

    const/16 v9, 0x204

    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v6, v4, v41

    int-to-byte v6, v6

    aget-byte v7, v4, v40

    xor-int/lit8 v9, v7, -0x1

    const/16 v22, 0x1

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v9, v7

    int-to-byte v7, v9

    const/16 v9, 0x342

    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_26

    const/4 v9, 0x2

    :try_start_6d
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v0, v6, v22

    aput-object v1, v6, v16

    aget-byte v0, v4, v37

    int-to-byte v0, v0

    aget-byte v1, v4, v26

    int-to-byte v1, v1

    const/16 v7, 0x342

    invoke-static {v7, v0, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_2a

    move-object/from16 v1, v66

    :try_start_6e
    filled-new-array {v12, v1}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_29

    :catchall_29
    move-exception v0

    goto :goto_46

    :catchall_2a
    move-exception v0

    move-object/from16 v1, v66

    :goto_46
    :try_start_6f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_3a

    throw v4

    :catchall_2b
    move-exception v0

    goto :goto_47

    :cond_3a
    throw v0
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_2b

    :goto_47
    :try_start_70
    sget-object v4, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v6, v4, v24

    int-to-byte v6, v6

    aget-byte v7, v4, v26
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_2f

    int-to-byte v7, v7

    const/16 v10, 0x3a4

    :try_start_71
    invoke-static {v10, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_30

    :try_start_72
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v7, 0x9e

    aget-byte v7, v4, v7

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v9, v4, v68

    int-to-byte v9, v9

    const/16 v10, 0x1b8

    invoke-static {v10, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v6, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_2f

    :try_start_73
    aget-byte v6, v4, v24

    int-to-byte v6, v6

    aget-byte v7, v4, v26
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_2e

    int-to-byte v7, v7

    const/16 v9, 0x3a4

    :try_start_74
    invoke-static {v9, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v7, 0x9e

    aget-byte v7, v4, v7

    neg-int v7, v7

    int-to-byte v7, v7

    aget-byte v4, v4, v68

    int-to-byte v4, v4

    invoke-static {v10, v7, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    invoke-virtual {v6, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_2d

    :try_start_75
    throw v0

    :catchall_2c
    move-exception v0

    :goto_48
    move-object v6, v2

    goto/16 :goto_38

    :catchall_2d
    move-exception v0

    goto :goto_49

    :catchall_2e
    move-exception v0

    const/16 v9, 0x3a4

    :goto_49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_3b

    throw v4

    :cond_3b
    throw v0

    :catchall_2f
    move-exception v0

    const/16 v9, 0x3a4

    goto :goto_4a

    :catchall_30
    move-exception v0

    move v9, v10

    :goto_4a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_3c

    throw v4

    :cond_3c
    throw v0

    :catchall_31
    move-exception v0

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    const/16 v9, 0x3a4

    goto :goto_48

    :cond_3d
    move-object/from16 v63, v2

    move-object v2, v1

    move-object/from16 v1, v63

    move/from16 v63, v7

    move-object/from16 v65, v9

    const/16 v9, 0x3a4

    const/16 v0, 0x33

    .line 29
    aget-byte v0, v69, v0

    int-to-byte v0, v0

    aget-byte v6, v69, v26

    int-to-byte v6, v6

    const/16 v7, 0x1a6

    invoke-static {v7, v0, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    aget-byte v6, v69, v37

    int-to-byte v6, v6

    aget-byte v7, v69, v26

    int-to-byte v7, v7

    const/16 v8, 0x29d

    invoke-static {v8, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget v7, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v8, v7, 0x108

    int-to-short v8, v8

    aget-byte v11, v69, v24
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_2c

    int-to-byte v11, v11

    const/16 v21, 0x4

    :try_start_76
    aget-byte v13, v69, v21
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_53

    int-to-byte v13, v13

    :try_start_77
    invoke-static {v8, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v0, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aget-byte v8, v69, v17

    int-to-byte v8, v8

    aget-byte v11, v69, v26

    int-to-byte v11, v11

    const/16 v13, 0x180

    invoke-static {v13, v8, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v11, v69, v29
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_2c

    int-to-byte v11, v11

    const/16 v21, 0x4

    :try_start_78
    aget-byte v13, v69, v21
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_53

    int-to-byte v13, v13

    const/16 v15, 0x16b

    :try_start_79
    invoke-static {v15, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    invoke-virtual {v8, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    aget-byte v11, v69, v63

    neg-int v11, v11

    int-to-byte v11, v11

    aget-byte v13, v69, v55

    int-to-byte v13, v13

    const/16 v15, 0x211

    invoke-static {v15, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v6, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_2c

    .line 30
    sget v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v13, v11, 0x13

    or-int/lit8 v11, v11, 0x13

    add-int/2addr v13, v11

    rem-int/lit16 v13, v13, 0x80

    sput v13, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 31
    :try_start_7a
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v11, v7, 0x234

    int-to-short v11, v11

    aget-byte v13, v69, v18

    int-to-byte v13, v13

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v11, v13, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v13, v69, v37

    int-to-byte v13, v13

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    const/16 v9, 0x29d

    invoke-static {v9, v13, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_52

    .line 32
    sget v9, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    or-int/lit8 v11, v9, 0x1b

    const/16 v22, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v9, v9, 0x1b

    sub-int/2addr v11, v9

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit16 v9, v7, 0x130

    and-int/lit16 v7, v7, 0x130

    or-int/2addr v7, v9

    int-to-short v7, v7

    .line 33
    :try_start_7b
    aget-byte v9, v69, v23
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_50

    neg-int v9, v9

    int-to-byte v9, v9

    const/16 v21, 0x4

    :try_start_7c
    aget-byte v11, v69, v21
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_51

    int-to-byte v11, v11

    :try_start_7d
    invoke-static {v7, v9, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v3, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_50

    const/16 v25, 0x56

    :try_start_7e
    aget-byte v9, v69, v25
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_4f

    int-to-byte v9, v9

    :try_start_7f
    aget-byte v11, v69, v26

    int-to-byte v11, v11

    const/16 v13, 0x165

    invoke-static {v13, v9, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v9, v11}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    aget-byte v11, v69, v19

    int-to-byte v11, v11

    aget-byte v15, v69, v31
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_2c

    int-to-byte v15, v15

    move-object/from16 v66, v1

    const/16 v1, 0x200

    :try_start_80
    invoke-static {v1, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    aget-byte v10, v69, v20

    int-to-byte v10, v10

    const/16 v11, 0x1b

    aget-byte v11, v69, v11

    int-to-byte v11, v11

    const/16 v14, 0x149

    invoke-static {v14, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    const/16 v10, 0x1e9

    aget-byte v10, v69, v10

    int-to-byte v10, v10

    aget-byte v11, v69, v26

    int-to-byte v11, v11

    const/16 v14, 0x13f

    invoke-static {v14, v10, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v11, v69, v19
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_1e

    int-to-byte v11, v11

    const/16 v25, 0x56

    :try_start_81
    aget-byte v14, v69, v25
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_4e

    int-to-byte v14, v14

    const/16 v15, 0x309

    :try_start_82
    invoke-static {v15, v11, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    invoke-virtual {v10, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    const/16 v11, 0x400

    new-array v11, v11, [B

    move/from16 v14, v16

    :goto_4b
    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v6, v4, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v60
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_1e

    if-lez v60, :cond_3f

    move-object/from16 v69, v2

    move-object/from16 v67, v3

    int-to-long v2, v14

    move-wide/from16 v70, v2

    const/4 v2, 0x0

    :try_start_83
    invoke-virtual {v8, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v70, v2

    if-gez v2, :cond_3e

    filled-new-array {v11, v5, v15}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v13, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_32

    xor-int v2, v14, v60

    and-int v3, v14, v60

    const/16 v22, 0x1

    shl-int/lit8 v3, v3, 0x1

    add-int v14, v2, v3

    move-object/from16 v3, v67

    move-object/from16 v2, v69

    goto :goto_4b

    :catchall_32
    move-exception v0

    move-object v2, v0

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v67

    move-object/from16 v6, v69

    const/16 v21, 0x4

    const/16 v25, 0x56

    const/16 v28, 0x6

    goto/16 :goto_6d

    :cond_3e
    :goto_4c
    const/4 v11, 0x0

    goto :goto_4d

    :cond_3f
    move-object/from16 v69, v2

    move-object/from16 v67, v3

    goto :goto_4c

    :goto_4d
    :try_start_84
    invoke-virtual {v9, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_4c

    :try_start_85
    invoke-virtual {v10, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10, v13, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_85} :catch_10
    .catchall {:try_start_85 .. :try_end_85} :catchall_32

    :catch_10
    :try_start_86
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v2, v1, v26

    int-to-byte v2, v2

    aget-byte v3, v1, v68

    int-to-byte v3, v3

    const/16 v4, 0x12f

    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v37

    int-to-byte v3, v3

    aget-byte v4, v1, v26

    int-to-byte v4, v4

    const/16 v6, 0x10c

    invoke-static {v6, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v4, v1, v16

    int-to-byte v4, v4

    aget-byte v8, v1, v26

    int-to-byte v8, v8

    const/16 v9, 0xfa

    invoke-static {v9, v4, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2
    :try_end_86
    .catchall {:try_start_86 .. :try_end_86} :catchall_4c

    :try_start_87
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v1, v37

    int-to-byte v3, v3

    aget-byte v4, v1, v26

    int-to-byte v4, v4

    invoke-static {v6, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v4, v1, v63

    neg-int v4, v4

    int-to-byte v4, v4

    aget-byte v6, v1, v31

    int-to-byte v6, v6

    const/16 v8, 0xe6

    invoke-static {v8, v4, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const-class v6, [B

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_4d

    :try_start_88
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_88
    .catchall {:try_start_88 .. :try_end_88} :catchall_4c

    :try_start_89
    sget v2, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_89} :catch_16
    .catchall {:try_start_89 .. :try_end_89} :catchall_46

    xor-int/lit8 v3, v2, 0x60

    and-int/lit8 v2, v2, 0x60

    or-int/2addr v2, v3

    int-to-short v2, v2

    const/16 v28, 0x6

    :try_start_8a
    aget-byte v3, v1, v28

    int-to-byte v3, v3

    aget-byte v4, v1, v68

    int-to-byte v4, v4

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xea

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    const/16 v4, 0xfd

    aget-byte v4, v1, v4

    int-to-byte v4, v4

    const/16 v6, 0xc4

    invoke-static {v6, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v9, 0x1

    invoke-virtual {v2, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aget-byte v6, v1, v30

    int-to-byte v6, v6

    const/16 v8, 0x25

    aget-byte v8, v1, v8

    int-to-byte v8, v8

    const/16 v9, 0xbd

    invoke-static {v9, v6, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v8, 0x14

    aget-byte v8, v1, v8

    int-to-byte v8, v8

    const/16 v9, 0x25

    aget-byte v9, v1, v9

    int-to-byte v9, v9

    const/16 v10, 0xa6

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v9, 0x1

    invoke-virtual {v4, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v9, Ljava/util/ArrayList;

    check-cast v8, Ljava/util/List;

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8
    :try_end_8a
    .catch Ljava/lang/Exception; {:try_start_8a .. :try_end_8a} :catch_15
    .catchall {:try_start_8a .. :try_end_8a} :catchall_45

    const/16 v10, 0xad

    :try_start_8b
    aget-byte v10, v1, v10

    int-to-byte v10, v10

    const/16 v21, 0x4

    aget-byte v1, v1, v21

    int-to-byte v1, v1

    const/16 v11, 0x8e

    invoke-static {v11, v10, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_44

    move-object/from16 v10, v67

    const/4 v11, 0x0

    :try_start_8c
    invoke-virtual {v10, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_43

    :try_start_8d
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v8

    invoke-static {v1, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_8d
    .catch Ljava/lang/Exception; {:try_start_8d .. :try_end_8d} :catch_11
    .catchall {:try_start_8d .. :try_end_8d} :catchall_42

    move/from16 v11, v16

    :goto_4e
    if-ge v11, v8, :cond_40

    .line 34
    sget v13, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit8 v14, v13, 0x3d

    and-int/lit8 v13, v13, 0x3d

    const/16 v22, 0x1

    shl-int/lit8 v13, v13, 0x1

    add-int/2addr v14, v13

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 35
    :try_start_8e
    invoke-static {v3, v11}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v1, v11, v13}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_8e
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_8e} :catch_11
    .catchall {:try_start_8e .. :try_end_8e} :catchall_33

    and-int/lit8 v13, v11, 0x54

    or-int/lit8 v11, v11, 0x54

    add-int/2addr v13, v11

    or-int/lit8 v11, v13, -0x53

    const/16 v22, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v13, v13, -0x53

    sub-int/2addr v11, v13

    goto :goto_4e

    :catchall_33
    move-exception v0

    move-object v2, v0

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    move-object/from16 v6, v69

    :goto_4f
    const/16 v21, 0x4

    const/16 v25, 0x56

    goto/16 :goto_6d

    :catch_11
    move-exception v0

    move-object/from16 v4, v58

    :goto_50
    move-object/from16 v6, v69

    const/16 v25, 0x56

    goto/16 :goto_5d

    :cond_40
    :try_start_8f
    invoke-virtual {v6, v2, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8f
    .catch Ljava/lang/Exception; {:try_start_8f .. :try_end_8f} :catch_11
    .catchall {:try_start_8f .. :try_end_8f} :catchall_42

    .line 36
    sget v1, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 37
    :try_start_90
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_90
    .catchall {:try_start_90 .. :try_end_90} :catchall_42

    if-nez v1, :cond_41

    :try_start_91
    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_33

    :cond_41
    move-object v1, v0

    :goto_51
    if-eqz v38, :cond_44

    .line 38
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v0, v0, 0x47

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 39
    :try_start_92
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v2, v0, v16

    int-to-byte v2, v2

    aget-byte v3, v0, v68

    int-to-byte v3, v3

    const/16 v4, 0x1e0

    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v56

    int-to-byte v3, v3

    aget-byte v4, v0, v46

    int-to-byte v4, v4

    const/16 v6, 0x7b

    invoke-static {v6, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    aget-byte v4, v0, v16

    int-to-byte v4, v4

    aget-byte v6, v0, v26

    int-to-byte v6, v6

    const/16 v7, 0xfa

    invoke-static {v7, v4, v6}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v12, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v9, 0x1

    invoke-virtual {v3, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_37

    :try_start_93
    sget v4, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v4, v4, 0x130

    int-to-short v4, v4

    aget-byte v6, v0, v23

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v21, 0x4

    aget-byte v7, v0, v21

    int-to-byte v7, v7

    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    invoke-virtual {v10, v4, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_36

    move-object/from16 v6, v69

    :try_start_94
    invoke-virtual {v4, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_35

    move-object/from16 v7, v65

    :try_start_95
    filled-new-array {v7, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_42

    aget-byte v4, v0, v19

    int-to-byte v4, v4

    const/16 v25, 0x56

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    const/16 v15, 0x309

    invoke-static {v15, v4, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-virtual {v2, v0, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_34

    goto :goto_53

    :catchall_34
    move-exception v0

    :goto_52
    move-object v2, v0

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    goto/16 :goto_4f

    .line 40
    :cond_42
    :goto_53
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v0, v0, 0x27

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    move-object v0, v3

    goto :goto_55

    :catchall_35
    move-exception v0

    goto :goto_54

    :catchall_36
    move-exception v0

    move-object/from16 v6, v69

    .line 41
    :goto_54
    :try_start_96
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_43

    throw v1

    :cond_43
    throw v0
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_34

    :catchall_37
    move-exception v0

    move-object/from16 v6, v69

    goto :goto_52

    :cond_44
    move-object/from16 v7, v65

    move-object/from16 v6, v69

    :try_start_97
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v2, v0, v16

    int-to-byte v2, v2

    aget-byte v3, v0, v26

    int-to-byte v3, v3

    const/16 v4, 0xfa

    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v56

    int-to-byte v3, v3

    aget-byte v0, v0, v46

    int-to-byte v0, v0

    const/16 v4, 0x7b

    invoke-static {v4, v3, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_3f

    const/4 v9, 0x1

    :try_start_98
    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_98
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_98 .. :try_end_98} :catch_12
    .catchall {:try_start_98 .. :try_end_98} :catchall_34

    goto :goto_55

    :catch_12
    move-exception v0

    :try_start_99
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_99
    .catch Ljava/lang/ClassNotFoundException; {:try_start_99 .. :try_end_99} :catch_13
    .catchall {:try_start_99 .. :try_end_99} :catchall_34

    :catch_13
    const/4 v0, 0x0

    :goto_55
    if-eqz v0, :cond_49

    :try_start_9a
    move-object v8, v0

    check-cast v8, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v21, 0x4

    aget-byte v2, v0, v21
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_3f

    int-to-byte v2, v2

    const/16 v25, 0x56

    :try_start_9b
    aget-byte v3, v0, v25
    :try_end_9b
    .catchall {:try_start_9b .. :try_end_9b} :catchall_40

    int-to-byte v3, v3

    const/16 v4, 0x73

    :try_start_9c
    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    const-class v2, Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v3, v38, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    const/16 v1, 0xf84

    new-array v1, v1, [B

    aget-byte v2, v0, v31

    int-to-byte v2, v2

    const/16 v3, 0x292

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0x53

    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_3f

    move-object/from16 v4, v58

    :try_start_9d
    invoke-virtual {v4, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_3e

    :try_start_9e
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    sget v3, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v7, v3, 0x234

    int-to-short v7, v7

    aget-byte v11, v0, v18

    int-to-byte v11, v11

    aget-byte v13, v0, v26

    int-to-byte v13, v13

    invoke-static {v7, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v11, v0, v37

    int-to-byte v11, v11

    aget-byte v13, v0, v26

    int-to-byte v13, v13

    const/16 v15, 0x29d

    invoke-static {v15, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_3d

    :try_start_9f
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v7, v3, 0x208

    int-to-short v7, v7

    aget-byte v11, v0, v36

    int-to-byte v11, v11

    aget-byte v13, v0, v26

    int-to-byte v13, v13

    invoke-static {v7, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v11, v0, v37

    int-to-byte v11, v11

    aget-byte v13, v0, v26

    int-to-byte v13, v13

    const/16 v15, 0x29d

    invoke-static {v15, v11, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_3c

    .line 42
    sget v7, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    and-int/lit8 v11, v7, 0x5b

    or-int/lit8 v7, v7, 0x5b

    add-int/2addr v11, v7

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 43
    :try_start_a0
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v7

    xor-int/lit16 v11, v3, 0x208

    and-int/lit16 v13, v3, 0x208

    or-int/2addr v11, v13

    int-to-short v11, v11

    aget-byte v13, v0, v36

    int-to-byte v13, v13

    aget-byte v14, v0, v26

    int-to-byte v14, v14

    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v13, v0, v56

    int-to-byte v13, v13

    aget-byte v14, v0, v55

    int-to-byte v14, v14

    const/16 v15, 0x275

    invoke-static {v15, v13, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v13

    const-class v14, [B

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v11, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_3b

    xor-int/lit16 v7, v3, 0x208

    and-int/lit16 v3, v3, 0x208

    or-int/2addr v3, v7

    int-to-short v3, v3

    :try_start_a1
    aget-byte v7, v0, v36

    int-to-byte v7, v7

    aget-byte v11, v0, v26

    int-to-byte v11, v11

    invoke-static {v3, v7, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v0, v19
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_3a

    int-to-byte v7, v7

    const/16 v25, 0x56

    :try_start_a2
    aget-byte v0, v0, v25

    int-to-byte v0, v0

    const/16 v15, 0x309

    invoke-static {v15, v7, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    invoke-virtual {v3, v0, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a2
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_39

    :try_start_a3
    invoke-static/range {v61 .. v61}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v2, 0xf58

    move-object v3, v6

    move-object v6, v1

    move-object v1, v3

    move-object v7, v4

    move-object v3, v10

    move-object/from16 v15, v52

    move/from16 v14, v59

    const/16 v21, 0x4

    move v4, v0

    move v0, v2

    move-object/from16 v2, v66

    goto/16 :goto_2d

    :catchall_38
    move-exception v0

    :goto_56
    move-object v2, v0

    move-object/from16 v1, v66

    const/16 v21, 0x4

    goto/16 :goto_6d

    :catchall_39
    move-exception v0

    goto :goto_57

    :catchall_3a
    move-exception v0

    const/16 v25, 0x56

    :goto_57
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0

    :catchall_3b
    move-exception v0

    const/16 v25, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_46

    throw v1

    :cond_46
    throw v0

    :catchall_3c
    move-exception v0

    const/16 v25, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_47

    throw v1

    :cond_47
    throw v0

    :catchall_3d
    move-exception v0

    const/16 v25, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :cond_48
    throw v0

    :catchall_3e
    move-exception v0

    :goto_58
    const/16 v25, 0x56

    goto :goto_56

    :catchall_3f
    move-exception v0

    move-object/from16 v4, v58

    goto :goto_58

    :catchall_40
    move-exception v0

    move-object/from16 v4, v58

    goto :goto_56

    :cond_49
    move-object/from16 v4, v58

    const/16 v25, 0x56

    const-class v0, Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v2}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v8, v62

    invoke-virtual {v8, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_a3
    .catchall {:try_start_a3 .. :try_end_a3} :catchall_38

    if-nez v38, :cond_4a

    .line 44
    sget v2, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    and-int/lit8 v3, v2, 0x1b

    or-int/lit8 v2, v2, 0x1b

    add-int/2addr v3, v2

    rem-int/lit16 v2, v3, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v27, 0x2

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_4b

    :cond_4a
    move/from16 v2, v16

    goto :goto_59

    :cond_4b
    const/4 v2, 0x1

    .line 45
    :goto_59
    :try_start_a4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_a4
    .catchall {:try_start_a4 .. :try_end_a4} :catchall_38

    :try_start_a5
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a5
    .catchall {:try_start_a5 .. :try_end_a5} :catchall_41

    move/from16 v3, v31

    move/from16 v11, v59

    move-object/from16 v1, v66

    const/4 v9, 0x2

    const/16 v21, 0x4

    const/16 v34, 0x0

    const/16 v54, 0x1

    goto/16 :goto_72

    :catchall_41
    move-exception v0

    move-object/from16 v1, v66

    const/16 v21, 0x4

    goto/16 :goto_6f

    :catchall_42
    move-exception v0

    move-object/from16 v4, v58

    :goto_5a
    move-object/from16 v6, v69

    goto :goto_58

    :catchall_43
    move-exception v0

    move-object/from16 v4, v58

    :goto_5b
    move-object/from16 v6, v69

    const/16 v25, 0x56

    goto :goto_5c

    :catchall_44
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v10, v67

    goto :goto_5b

    .line 46
    :goto_5c
    :try_start_a6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4c

    throw v1

    :catch_14
    move-exception v0

    goto :goto_5d

    :cond_4c
    throw v0
    :try_end_a6
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_a6} :catch_14
    .catchall {:try_start_a6 .. :try_end_a6} :catchall_38

    :catchall_45
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v10, v67

    goto :goto_5a

    :catch_15
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v10, v67

    goto/16 :goto_50

    :catchall_46
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v10, v67

    move-object/from16 v6, v69

    const/16 v25, 0x56

    const/16 v28, 0x6

    goto/16 :goto_56

    :catch_16
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v10, v67

    move-object/from16 v6, v69

    const/16 v25, 0x56

    const/16 v28, 0x6

    :goto_5d
    :try_start_a7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I
    :try_end_a7
    .catchall {:try_start_a7 .. :try_end_a7} :catchall_4b

    const/16 v21, 0x4

    add-int/lit8 v2, v2, -0x4

    int-to-short v2, v2

    :try_start_a8
    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v8, v3, v19

    int-to-byte v8, v8

    aget-byte v9, v3, v35

    int-to-byte v9, v9

    invoke-static {v2, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v2, v3, v41

    int-to-byte v2, v2

    aget-byte v7, v3, v40

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v7, -0x29b

    const/16 v11, 0x537

    or-int v13, v11, v9

    const/16 v22, 0x1

    shl-int/lit8 v13, v13, 0x1

    xor-int/2addr v9, v11

    sub-int/2addr v13, v9

    not-int v7, v7

    const/16 v64, -0x1

    xor-int v9, v64, v8

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v7, v8

    and-int/2addr v7, v8

    or-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x29c

    neg-int v7, v7

    neg-int v7, v7

    xor-int v8, v13, v7

    and-int/2addr v7, v13

    const/16 v22, 0x1

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v8, v7

    add-int/lit16 v8, v8, -0x538

    or-int/lit16 v7, v8, -0x29c

    shl-int/lit8 v7, v7, 0x1

    xor-int/lit16 v8, v8, -0x29c

    sub-int/2addr v7, v8

    int-to-byte v7, v7

    const/16 v8, 0x342

    invoke-static {v8, v2, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a8
    .catchall {:try_start_a8 .. :try_end_a8} :catchall_4a

    const/4 v9, 0x2

    :try_start_a9
    new-array v2, v9, [Ljava/lang/Object;

    const/16 v22, 0x1

    aput-object v0, v2, v22

    aput-object v1, v2, v16

    aget-byte v0, v3, v37

    int-to-byte v0, v0

    aget-byte v1, v3, v26

    int-to-byte v1, v1

    const/16 v7, 0x342

    invoke-static {v7, v0, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_a9
    .catchall {:try_start_a9 .. :try_end_a9} :catchall_48

    move-object/from16 v1, v66

    :try_start_aa
    filled-new-array {v12, v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_aa
    .catchall {:try_start_aa .. :try_end_aa} :catchall_47

    :catchall_47
    move-exception v0

    goto :goto_5e

    :catchall_48
    move-exception v0

    move-object/from16 v1, v66

    :goto_5e
    :try_start_ab
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :catchall_49
    move-exception v0

    goto/16 :goto_33

    :cond_4d
    throw v0

    :catchall_4a
    move-exception v0

    move-object/from16 v1, v66

    goto/16 :goto_33

    :catchall_4b
    move-exception v0

    move-object/from16 v1, v66

    const/16 v21, 0x4

    goto/16 :goto_33

    :catchall_4c
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v67

    move-object/from16 v6, v69

    goto/16 :goto_39

    :catchall_4d
    move-exception v0

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v67

    move-object/from16 v6, v69

    const/16 v21, 0x4

    const/16 v25, 0x56

    const/16 v28, 0x6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v0

    :catchall_4e
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    move-object/from16 v1, v66

    :goto_5f
    const/16 v21, 0x4

    goto/16 :goto_3b

    :catchall_4f
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    goto :goto_5f

    :catchall_50
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    const/16 v21, 0x4

    :goto_60
    const/16 v25, 0x56

    const/16 v28, 0x6

    goto :goto_61

    :catchall_51
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    goto :goto_60

    :goto_61
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4f

    throw v2

    :cond_4f
    throw v0

    :catchall_52
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    const/16 v21, 0x4

    const/16 v25, 0x56

    const/16 v28, 0x6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_50

    throw v2

    :cond_50
    throw v0

    :catchall_53
    move-exception v0

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v4, v58

    goto/16 :goto_3a

    :catchall_54
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    :goto_62
    move-object/from16 v4, v58

    const/16 v21, 0x4

    :goto_63
    const/16 v25, 0x56

    :goto_64
    const/16 v28, 0x6

    goto :goto_66

    :catchall_55
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v59, v11

    goto :goto_62

    :catchall_56
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v59, v11

    move-object/from16 v4, v58

    const/16 v21, 0x4

    goto :goto_64

    :catchall_57
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v59, v11

    move-object/from16 v4, v58

    goto :goto_63

    :catchall_58
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v59, v11

    move-object/from16 v4, v58

    const/16 v21, 0x4

    :goto_65
    const/16 v25, 0x56

    const/16 v28, 0x6

    const/16 v32, 0x3

    goto :goto_66

    :catchall_59
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v21, v7

    move/from16 v59, v11

    move-object/from16 v4, v58

    goto :goto_65

    .line 47
    :goto_66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_51

    throw v2

    :cond_51
    throw v0

    :catchall_5a
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    goto/16 :goto_36

    :catchall_5b
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    goto/16 :goto_36

    :catchall_5c
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move/from16 v59, v11

    goto/16 :goto_32

    :catchall_5d
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move/from16 v59, v11

    const/16 v25, 0x56

    const/16 v32, 0x3

    :goto_67
    const/16 v33, 0x5

    goto :goto_68

    :catchall_5e
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v32, v4

    move-object v4, v7

    move/from16 v59, v11

    const/16 v25, 0x56

    goto :goto_67

    :goto_68
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_52

    throw v2

    :cond_52
    throw v0

    :catchall_5f
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move/from16 v59, v11

    goto/16 :goto_31

    :catchall_60
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    :goto_69
    const/16 v32, 0x3

    const/16 v33, 0x5

    goto :goto_6a

    :catchall_61
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move/from16 v59, v14

    move-object/from16 v52, v15

    goto :goto_69

    :goto_6a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_53

    throw v2

    :cond_53
    throw v0

    :catchall_62
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    :goto_6b
    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    const/16 v32, 0x3

    const/16 v33, 0x5

    goto :goto_6c

    :catchall_63
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move-object/from16 v57, v13

    goto :goto_6b

    :goto_6c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_54

    throw v2

    :cond_54
    throw v0

    :catchall_64
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    const/16 v32, 0x3

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_55

    throw v2

    :cond_55
    throw v0

    :catchall_65
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    const/16 v32, 0x3

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_56

    throw v2

    :cond_56
    throw v0
    :try_end_ab
    .catchall {:try_start_ab .. :try_end_ab} :catchall_49

    :catchall_66
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object v4, v7

    move-object/from16 v57, v13

    goto/16 :goto_30

    :goto_6d
    :try_start_ac
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->close()V
    :try_end_ac
    .catchall {:try_start_ac .. :try_end_ac} :catchall_67

    goto :goto_6e

    :catchall_67
    move-exception v0

    :try_start_ad
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6e
    throw v2

    :catchall_68
    move-exception v0

    goto/16 :goto_6f

    :catchall_69
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    goto/16 :goto_22

    :catchall_6a
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v33, v9

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v25, 0x56

    const/16 v32, 0x3

    goto :goto_6f

    :catchall_6b
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move/from16 v25, v11

    goto/16 :goto_21

    :catchall_6c
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v50, v11

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_57

    throw v2

    :cond_57
    throw v0

    :catchall_6d
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v50, v11

    move-object/from16 v57, v13

    move/from16 v59, v14

    move-object/from16 v52, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_58

    throw v2

    :cond_58
    throw v0
    :try_end_ad
    .catchall {:try_start_ad .. :try_end_ad} :catchall_68

    :catchall_6e
    move-exception v0

    move-object v6, v1

    move-object v1, v2

    move-object/from16 v43, v4

    move-object/from16 v44, v7

    goto/16 :goto_17

    .line 48
    :goto_6f
    :try_start_ae
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v11, v59

    mul-int/lit16 v14, v11, 0x2c9

    neg-int v3, v14

    neg-int v3, v3

    not-int v3, v3

    rsub-int v3, v3, -0x2c8

    not-int v4, v11

    xor-int/lit8 v7, v4, 0x1

    and-int/lit8 v8, v4, 0x1

    or-int/2addr v7, v8

    not-int v7, v7

    not-int v8, v2

    or-int/lit8 v9, v8, 0x1

    not-int v9, v9

    xor-int v13, v7, v9

    and-int/2addr v7, v9

    or-int/2addr v7, v13

    mul-int/lit16 v7, v7, -0x2c8

    xor-int v9, v3, v7

    and-int/2addr v3, v7

    const/16 v22, 0x1

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v9, v3

    xor-int v3, v4, v8

    and-int v7, v4, v8

    or-int/2addr v3, v7

    xor-int/lit8 v7, v3, 0x1

    and-int/lit8 v3, v3, 0x1

    or-int/2addr v3, v7

    not-int v3, v3

    xor-int/lit8 v7, v11, 0x1

    and-int/lit8 v8, v11, 0x1

    or-int/2addr v7, v8

    xor-int v8, v7, v2

    and-int/2addr v7, v2

    or-int/2addr v7, v8

    not-int v7, v7

    xor-int v8, v3, v7

    and-int/2addr v3, v7

    or-int/2addr v3, v8

    mul-int/lit16 v3, v3, -0x2c8

    neg-int v3, v3

    neg-int v3, v3

    and-int v7, v9, v3

    or-int/2addr v3, v9

    add-int/2addr v7, v3

    not-int v2, v2

    xor-int/lit8 v3, v2, 0x1

    const/16 v22, 0x1

    and-int/lit8 v2, v2, 0x1

    or-int/2addr v2, v3

    not-int v2, v2

    xor-int v3, v4, v2

    and-int/2addr v2, v4

    or-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x2c8

    add-int/2addr v2, v7

    move/from16 v3, v31

    :goto_70
    if-ge v2, v3, :cond_5a

    aget-boolean v4, v44, v2

    if-eqz v4, :cond_59

    const/16 v34, 0x0

    sput-object v34, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    sput-object v34, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    :goto_71
    const/4 v9, 0x2

    goto/16 :goto_72

    :cond_59
    const/16 v34, 0x0

    add-int/lit8 v2, v2, 0x1

    goto :goto_70

    :cond_5a
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v3, v2, v23

    neg-int v3, v3

    int-to-short v3, v3

    aget-byte v4, v2, v36

    int-to-byte v4, v4

    aget-byte v5, v2, v35

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3
    :try_end_ae
    .catch Ljava/lang/Exception; {:try_start_ae .. :try_end_ae} :catch_17

    sget v4, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v4, v4, 0x2b

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v5, v4, 0x29

    const/16 v22, 0x1

    shl-int/lit8 v5, v5, 0x1

    xor-int/lit8 v4, v4, 0x29

    sub-int/2addr v5, v4

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/4 v9, 0x2

    :try_start_af
    new-array v4, v9, [Ljava/lang/Object;

    aput-object v0, v4, v22

    aput-object v3, v4, v16

    aget-byte v0, v2, v37

    int-to-byte v0, v0

    aget-byte v2, v2, v26

    int-to-byte v2, v2

    const/16 v7, 0x342

    invoke-static {v7, v0, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v12, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_af
    .catchall {:try_start_af .. :try_end_af} :catchall_6f

    :catchall_6f
    move-exception v0

    :try_start_b0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5b

    throw v1

    :cond_5b
    throw v0

    :cond_5c
    move-object v6, v1

    move-object v1, v2

    move-object/from16 v43, v4

    move-object/from16 v44, v7

    move-object/from16 v50, v8

    move/from16 v47, v9

    move/from16 v54, v10

    move-object/from16 v34, v11

    move-object/from16 v57, v13

    move v11, v14

    move-object/from16 v52, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    move-object v10, v3

    move/from16 v3, v31

    goto :goto_71

    :goto_72
    or-int/lit8 v0, v11, 0x1

    const/16 v22, 0x1

    shl-int/lit8 v0, v0, 0x1

    xor-int/lit8 v2, v11, 0x1

    sub-int v14, v0, v2

    move-object v2, v1

    move/from16 v31, v3

    move-object v1, v6

    move-object v3, v10

    move-object/from16 v11, v34

    move-object/from16 v4, v43

    move-object/from16 v7, v44

    move/from16 v9, v47

    move-object/from16 v8, v50

    move-object/from16 v15, v52

    move/from16 v10, v54

    move-object/from16 v13, v57

    const/16 v6, 0x3a4

    goto/16 :goto_13

    :cond_5d
    :goto_73
    return-void

    :catchall_70
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5e

    throw v1

    :cond_5e
    throw v0

    :catchall_71
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5f

    throw v1

    :cond_5f
    throw v0

    :catchall_72
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_60

    throw v1

    :cond_60
    throw v0
    :try_end_b0
    .catch Ljava/lang/Exception; {:try_start_b0 .. :try_end_b0} :catch_17

    :catch_17
    move-exception v0

    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    return-void

    :catchall_73
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_61

    throw v1

    :cond_61
    throw v0

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_2
    .array-data 1
        -0x69t
        -0x14t
        -0x7ct
        -0x3ft
        0x5dt
        -0x5et
        -0x60t
        -0xct
        -0x6ct
        0x29t
        -0x29t
        -0x57t
        -0x68t
        -0x3et
        0x7ct
        0x72t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static AFKeystoreWrapper(IIC)Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x23

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 10
    .line 11
    or-int/lit8 v2, v0, 0x5b

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    shl-int/2addr v2, v3

    .line 15
    xor-int/lit8 v0, v0, 0x5b

    .line 16
    .line 17
    sub-int/2addr v2, v0

    .line 18
    rem-int/lit16 v2, v2, 0x80

    .line 19
    .line 20
    sput v2, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v2, 0x2

    .line 30
    aput-object p2, v0, v2

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    aput-object p1, v0, v3

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 p1, 0x0

    .line 43
    aput-object p0, v0, p1

    .line 44
    .line 45
    sget-object p0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    .line 46
    .line 47
    const/4 p1, 0x4

    .line 48
    aget-byte p1, p0, p1

    .line 49
    .line 50
    int-to-byte p1, p1

    .line 51
    const/16 p2, 0x56

    .line 52
    .line 53
    aget-byte p2, p0, p2

    .line 54
    .line 55
    int-to-byte p2, p2

    .line 56
    const/16 v2, 0x234

    .line 57
    .line 58
    invoke-static {v2, p1, p2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object p2, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/ClassLoader;

    .line 65
    .line 66
    invoke-static {p1, v3, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/16 p2, 0x5e

    .line 71
    .line 72
    aget-byte p2, p0, p2

    .line 73
    .line 74
    int-to-short p2, p2

    .line 75
    const/16 v2, 0x235

    .line 76
    .line 77
    aget-byte v2, p0, v2

    .line 78
    .line 79
    neg-int v2, v2

    .line 80
    int-to-byte v2, v2

    .line 81
    const/16 v3, 0xae

    .line 82
    .line 83
    aget-byte p0, p0, v3

    .line 84
    .line 85
    int-to-byte p0, p0

    .line 86
    invoke-static {p2, v2, p0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    filled-new-array {p2, p2, v2}, [Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1, p0, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    return-object p0

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_0

    .line 113
    .line 114
    throw p1

    .line 115
    :cond_0
    throw p0
.end method

.method public static d(I)I
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x5b

    .line 4
    .line 5
    or-int/lit8 v0, v0, 0x5b

    .line 6
    .line 7
    add-int/2addr v1, v0

    .line 8
    rem-int/lit16 v0, v1, 0x80

    .line 9
    .line 10
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 11
    .line 12
    rem-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/16 v1, 0x41

    .line 19
    .line 20
    div-int/lit8 v1, v1, 0x0

    .line 21
    .line 22
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    aget-byte v2, v1, v2

    .line 34
    .line 35
    int-to-byte v2, v2

    .line 36
    const/16 v3, 0x56

    .line 37
    .line 38
    aget-byte v3, v1, v3

    .line 39
    .line 40
    int-to-byte v3, v3

    .line 41
    const/16 v4, 0x234

    .line 42
    .line 43
    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Ljava/lang/ClassLoader;

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v3, 0x7

    .line 57
    aget-byte v3, v1, v3

    .line 58
    .line 59
    int-to-short v3, v3

    .line 60
    const/16 v4, 0x1e9

    .line 61
    .line 62
    aget-byte v4, v1, v4

    .line 63
    .line 64
    int-to-byte v4, v4

    .line 65
    const/16 v5, 0x40

    .line 66
    .line 67
    aget-byte v1, v1, v5

    .line 68
    .line 69
    int-to-byte v1, v1

    .line 70
    invoke-static {v3, v4, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x3f

    .line 97
    .line 98
    rem-int/lit16 v1, v0, 0x80

    .line 99
    .line 100
    sput v1, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 101
    .line 102
    rem-int/lit8 v0, v0, 0x2

    .line 103
    .line 104
    if-nez v0, :cond_1

    .line 105
    .line 106
    return p0

    .line 107
    :cond_1
    const/4 p0, 0x0

    .line 108
    throw p0

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    throw v0

    .line 117
    :cond_2
    throw p0
.end method

.method public static init$0()V
    .locals 5

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v1, v0, 0x5f

    shl-int/lit8 v1, v1, 0x1

    xor-int/lit8 v0, v0, 0x5f

    sub-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    const-string v0, "ISO-8859-1"

    const-string v2, "\u001c5\u00e1A\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd<\u000e\u00f2\u0012\u00fb\u0004\u00fd\u0013\u00be\u0018/\u0000\u0006\u0006\u000e\u00f6\u0003\u000c\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008&\u00cb>\u00ea\u00f4\n\u000b\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\u0008\u00de\u0017\r\u00f6\u00ff\u0006\u0015\u0000\u0003\u00f6\u000c\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\u000c\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\u0008\u0000\u00e2(\u000c\u0001\u0012\u00d2!\u0005\u0008\u0000\u00e2(\u000c8\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\u0008\u000c\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\u0008\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\u0008\u0000\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00f4\n\u0017\u00ed\u0008\t\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00ee\t\u00ed\u000b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u0015\u0000\u0003\u00f6\u000c\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000c\u0006\u0007\u00f5\u00ee\u0006\u00f0\u000b5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\t\u0000\u0008\u0002/\u00d9\u00013\u00ff\u00d8\u0005\u00ff\u00030\u0002\u0005\u00cd\u0001\u0012\u00e1\u0016\u0011\u00ff\t\u0000\u00f4\u0005\u00fa\u0018\u00ee\u00d0C\u00fa\u0012\u00bd*\u0000\u00fd\u0001\u0012\u00df\u0014\u0016\u00f7\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008(\u00c9K\u00dd\u00f4\n\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008&\u00cb>\u00ea\u00f4\n\u000b\u0003\u00fb\u0001\n\u00f6\u00ff\u0006\u00f5\u0012\u00e1\u0016\u00ff\u0006\u00ee\"\u0001\u0010\u00ee\u0007\u00ef\u000b\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d5\u0001\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\t\u00f8\u00f8\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u0006\u00f5\u0006\u00e3$\u0016\u0001\u0012\u00d0$\u0014\u00ff\u0000\u000c\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00dc(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0012\u00dd\u001a\u0016\u00ff\u00d4,\t\u0001\n\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00d8,\t\u0001\n\u0001\u0012\u00e2\u0019\u0014\u00ee\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0018,\u0006\u0007\u00f5\u00ff\u0004\r\u00fc\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fe\u00f2\u0012\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f4\u0016\u00f7\u00e7 \r\u0004\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\u000c\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\u000c\t\u0002\u0001\u0012\u00d2/\u0001\u0006\u0002\u0002\u00fa\u000c\t\u00e3(\u00fa\u00f8\u00ee\u000b\u00eb\u000b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008&\u00cb@\u00e8\u00f4\n\u00dcK5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u000c\u0001\u0003\u0004\u0005.\u00d5\u0005\u00fd3\u00d8\u0004\u0004\u0002\u0001\u00fe6\u00cc\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u00f6\u0005\u0005\r\u0004\u00f4\u0010\u00d4,\u0000\u00ff\u000c\t\u0008\u0008\u001d\u0017\u00fd\u0004\u00fe\u0006\u00f6\u00f5\u001e\u00f2\u0012\u0003\u00f8\u0010"

    const/4 v3, 0x0

    const/16 v4, 0x47c

    if-eqz v1, :cond_0

    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v0, 0x588a

    :goto_0
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    goto :goto_1

    :cond_0
    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v0, 0x83

    goto :goto_0

    :goto_1
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v1, v0, 0x23

    and-int/lit8 v0, v0, 0x23

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method public static registerClient(Ljava/lang/Object;)I
    .locals 5

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x75

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 10
    .line 11
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    aget-byte v2, v0, v2

    .line 19
    .line 20
    int-to-byte v2, v2

    .line 21
    const/16 v3, 0x56

    .line 22
    .line 23
    aget-byte v3, v0, v3

    .line 24
    .line 25
    int-to-byte v3, v3

    .line 26
    const/16 v4, 0x234

    .line 27
    .line 28
    invoke-static {v4, v2, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/lang/ClassLoader;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/16 v3, 0x196

    .line 42
    .line 43
    aget-byte v3, v0, v3

    .line 44
    .line 45
    int-to-byte v3, v3

    .line 46
    const/16 v4, 0x12

    .line 47
    .line 48
    aget-byte v0, v0, v4

    .line 49
    .line 50
    int-to-byte v0, v0

    .line 51
    const/16 v4, 0x214

    .line 52
    .line 53
    invoke-static {v4, v3, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-class v3, Ljava/lang/Object;

    .line 58
    .line 59
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x57

    .line 80
    .line 81
    rem-int/lit16 v0, v0, 0x80

    .line 82
    .line 83
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 84
    .line 85
    return p0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    throw v0

    .line 94
    :cond_0
    throw p0
.end method

.method private static unregisterClient(II)V
    .locals 0

    .line 1
    sget p0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    .line 2
    .line 3
    xor-int/lit8 p1, p0, 0x1f

    .line 4
    .line 5
    and-int/lit8 p0, p0, 0x1f

    .line 6
    .line 7
    shl-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    add-int/2addr p1, p0

    .line 10
    rem-int/lit16 p0, p1, 0x80

    .line 11
    .line 12
    sput p0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    .line 13
    .line 14
    rem-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/16 p0, 0x2c

    .line 19
    .line 20
    div-int/lit8 p0, p0, 0x0

    .line 21
    .line 22
    :cond_0
    return-void
.end method
