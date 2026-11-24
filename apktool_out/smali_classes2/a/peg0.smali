.class public La/peg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mx30;
.implements La/zf60;
.implements La/ns2;
.implements La/t29;
.implements La/xro;


# static fields
.field public static c:La/peg0;

.field public static final d:Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

.field public static final e:La/peg0;

.field public static final f:La/xit;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;-><init>(IIIZZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/peg0;->d:Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    new-array v0, v0, [F

    .line 16
    .line 17
    fill-array-data v0, :array_0

    .line 18
    .line 19
    .line 20
    new-instance v1, La/peg0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v0, v2}, La/peg0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sput-object v1, La/peg0;->e:La/peg0;

    .line 27
    .line 28
    new-instance v0, La/xit;

    .line 29
    .line 30
    invoke-direct {v0, v2}, La/xit;-><init>(B)V

    .line 31
    .line 32
    .line 33
    sput-object v0, La/peg0;->f:La/xit;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :array_0
    .array-data 4
        0x3f652546    # 0.8951f
        -0x40bff2e5    # -0.7502f
        0x3d1f559b    # 0.0389f
        0x3e886595    # 0.2664f
        0x3fdb53f8    # 1.7135f
        -0x4273b646    # -0.0685f
        -0x41dab9f5    # -0.1614f
        0x3d1652bd    # 0.0367f
        0x3f83c9ef    # 1.0296f
    .end array-data
.end method

.method public constructor <init>(B)V
    .locals 4

    .line 1
    iput-byte p1, p0, La/peg0;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/co20;

    .line 7
    .line 8
    sget-object v0, La/c5d0;->c:La/c5d0;

    .line 9
    .line 10
    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getInstance"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/z440;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    sget-object v0, La/peg0;->f:La/xit;

    .line 31
    .line 32
    :goto_0
    const/4 v1, 0x2

    .line 33
    new-array v1, v1, [La/z440;

    .line 34
    .line 35
    sget-object v2, La/xit;->b:La/xit;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    aput-object v2, v1, v3

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    aput-object v0, v1, v2

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v1, p1, La/co20;->a:[La/z440;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v0, La/fmx;->a:Ljava/nio/charset/Charset;

    .line 52
    .line 53
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    return-void

    .line 77
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 120
    iput-byte p1, p0, La/peg0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/cad;La/eg3;La/us3;La/ntu;La/us00;La/ie5;La/ie5;)V
    .locals 0

    const/16 p4, 0xc

    iput-byte p4, p0, La/peg0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance p3, La/gr00;

    .line 113
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p5, p3, La/gr00;->a:Ljava/lang/Object;

    .line 115
    iput-object p2, p3, La/gr00;->b:Ljava/lang/Object;

    .line 116
    iput-object p1, p3, La/gr00;->c:Ljava/lang/Object;

    .line 117
    iput-object p7, p3, La/gr00;->d:Ljava/lang/Object;

    .line 118
    iput-object p6, p3, La/gr00;->e:Ljava/lang/Object;

    .line 119
    iput-object p3, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/dn0;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 100
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance p2, La/zm;

    const/16 v0, 0xb

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/peg0;->b:Ljava/lang/Object;

    return-void

    .line 102
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance p2, La/zm;

    const/16 v0, 0x1a

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/peg0;->b:Ljava/lang/Object;

    return-void

    .line 104
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance p2, La/zm;

    const/16 v0, 0x13

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/peg0;->b:Ljava/lang/Object;

    return-void

    .line 106
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    new-instance p2, La/zm;

    const/16 v0, 0xd

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/peg0;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/gl5;La/us00;)V
    .locals 0

    const/16 p1, 0x12

    iput-byte p1, p0, La/peg0;->a:B

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance p1, La/m73;

    invoke-direct {p1, p2}, La/m73;-><init>(La/us00;)V

    .line 90
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/j1q0;La/btt0;La/knf0;La/gii0;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    new-instance p1, La/xex;

    invoke-direct {p1, p2, p4}, La/xex;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/j1q0;La/ii;)V
    .locals 1

    const/16 v0, 0x15

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance p1, La/yzn0;

    .line 95
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p2, p1, La/yzn0;->a:Ljava/lang/Object;

    .line 97
    new-instance p2, La/pai;

    const/16 v0, 0xd

    invoke-direct {p2, p1, v0}, La/pai;-><init>(Ljava/lang/Object;B)V

    .line 98
    invoke-static {p2}, La/mbl;->b(La/n5d0;)La/n5d0;

    move-result-object p2

    iput-object p2, p1, La/yzn0;->b:Ljava/lang/Object;

    .line 99
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us3;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vf3;)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vgf;)V
    .locals 1

    const/16 v0, 0x1c

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/y6j0;)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/peg0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 77
    iput-byte p2, p0, La/peg0;->a:B

    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized m()La/peg0;
    .locals 4

    .line 1
    const-class v0, La/peg0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/peg0;->c:La/peg0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/peg0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v2, v3}, La/peg0;-><init>(BZ)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/peg0;->c:La/peg0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;
    .locals 16

    .line 1
    and-int/lit8 v0, p5, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/hm1;

    .line 6
    .line 7
    sget-object v1, La/iun;->a:La/iun;

    .line 8
    .line 9
    invoke-direct {v0, v1, v1}, La/hm1;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    move-object v7, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v7, p4

    .line 15
    .line 16
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 23
    .line 24
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    const/16 v15, 0x190

    .line 28
    .line 29
    const-string v4, ""

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const-wide/16 v9, -0x1

    .line 33
    .line 34
    const-wide/16 v11, -0x1

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    move-object/from16 v3, p1

    .line 38
    .line 39
    move-wide/from16 v5, p2

    .line 40
    .line 41
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;-><init>(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static synthetic r(La/peg0;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;
    .locals 4

    .line 1
    new-instance v0, La/hr1;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static s(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p0, "name"

    .line 40
    .line 41
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string p0, "parameters"

    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method


# virtual methods
.method public a(La/ox30;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->u:La/drm0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/drm0;->a(La/ox30;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public b()La/wy40;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public c(La/i8f;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/peg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const-string p0, "FirebaseCrashlytics"

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-string p1, "Registered Firebase Analytics event receiver for breadcrumbs"

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p0, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "$A$:"

    .line 2
    .line 3
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/i8f;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, La/peg0;->s(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p0, p0, La/i8f;->a:La/j8f;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iget-wide v2, p0, La/j8f;->d:J

    .line 35
    .line 36
    sub-long/2addr v0, v2

    .line 37
    iget-object p2, p0, La/j8f;->o:La/cu;

    .line 38
    .line 39
    iget-object p2, p2, La/cu;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, La/aaf;

    .line 42
    .line 43
    new-instance v2, La/h8f;

    .line 44
    .line 45
    invoke-direct {v2, p0, v0, v1, p1}, La/h8f;-><init>(La/j8f;JLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2}, La/aaf;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    const/4 p0, 0x0

    .line 53
    const-string p1, "FirebaseCrashlytics"

    .line 54
    .line 55
    const-string p2, "Unable to serialize Firebase Analytics event to breadcrumb."

    .line 56
    .line 57
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public f(La/ox30;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->z:La/bj;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    check-cast p0, La/ani0;

    .line 11
    .line 12
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar;->j1:La/ywu;

    .line 17
    .line 18
    iget-object v0, v0, La/ywu;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/l1r;

    .line 38
    .line 39
    iget-object v1, v1, La/l1r;->a:Landroidx/fragment/app/e;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/e;->s()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    move p0, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->l1:La/hwq0;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-interface {p0, p2}, La/hwq0;->onMenuItemClick(Landroid/view/MenuItem;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move p0, p1

    .line 59
    :goto_0
    if-eqz p0, :cond_3

    .line 60
    .line 61
    return v2

    .line 62
    :cond_3
    return p1
.end method

.method public g(La/ar20;Ljava/util/ArrayList;)La/zkd;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/wb;->n:La/ar20;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p0, La/wb;->o:La/ar20;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    :goto_0
    if-eqz p0, :cond_1

    .line 21
    .line 22
    new-instance p0, La/xc00;

    .line 23
    .line 24
    invoke-direct {p0, p1, p2}, La/xc00;-><init>(La/ar20;Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    sget-object p0, La/wb;->p:La/ar20;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance p1, La/id00;

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, La/zkd;-><init>(La/ar20;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    new-instance p0, La/zkd;

    .line 43
    .line 44
    invoke-direct {p0, p1, p2}, La/zkd;-><init>(La/ar20;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public h(La/ar20;II)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/cy2;->j0:La/fr20;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-ge p2, p3, :cond_4

    .line 18
    .line 19
    iget-object v1, p0, La/peg0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, p3, -0x1

    .line 27
    .line 28
    const/4 v3, -0x1

    .line 29
    if-gt p2, v2, :cond_1

    .line 30
    .line 31
    move v4, p2

    .line 32
    :goto_1
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/16 v6, 0xa

    .line 37
    .line 38
    if-ne v5, v6, :cond_0

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    if-eq v4, v2, :cond_1

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v4, v3

    .line 47
    :goto_2
    if-ne v4, v3, :cond_2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    if-le v4, p2, :cond_3

    .line 51
    .line 52
    new-instance v1, La/fiz;

    .line 53
    .line 54
    invoke-direct {v1, v0, p2, v4}, La/fiz;-><init>(La/ar20;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    new-instance p2, La/fiz;

    .line 61
    .line 62
    sget-object v1, La/cy2;->M:La/ar20;

    .line 63
    .line 64
    add-int/lit8 v2, v4, 0x1

    .line 65
    .line 66
    invoke-direct {p2, v1, v4, v2}, La/fiz;-><init>(La/ar20;II)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move p2, v2

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    :goto_3
    if-le p3, p2, :cond_5

    .line 75
    .line 76
    new-instance p0, La/fiz;

    .line 77
    .line 78
    invoke-direct {p0, v0, p2, p3}, La/fiz;-><init>(La/ar20;II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_5
    return-object p1

    .line 85
    :cond_6
    new-instance p0, La/fiz;

    .line 86
    .line 87
    invoke-direct {p0, p1, p2, p3}, La/j;-><init>(La/ar20;II)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public i()V
    .locals 0

    .line 1
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/us3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLa/vc0;Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/uc0;

    .line 8
    .line 9
    sget-object p0, La/gz8;->a:La/gz8;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    move-wide v4, p1

    .line 15
    move-object v6, p3

    .line 16
    move-object/from16 v9, p4

    .line 17
    .line 18
    move-object/from16 v8, p5

    .line 19
    .line 20
    move/from16 v10, p6

    .line 21
    .line 22
    move/from16 v11, p7

    .line 23
    .line 24
    move-object/from16 v7, p9

    .line 25
    .line 26
    invoke-direct/range {v0 .. v11}, La/uc0;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;-><init>(La/uc0;)V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public k()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;
    .locals 17

    .line 1
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 2
    .line 3
    new-instance v1, La/jr1;

    .line 4
    .line 5
    sget-object v2, La/avc0;->a:La/avc0;

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 11
    .line 12
    const/4 v15, 0x0

    .line 13
    const/16 v16, 0x1f7

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    sget-object v8, La/bm1;->a:La/bm1;

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    const-wide/16 v10, 0x0

    .line 23
    .line 24
    const-wide/16 v12, 0x0

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    invoke-direct/range {v3 .. v16}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, v3}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/peg0;->a:B

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v1, v1, La/xiv0;->a:La/uiv0;

    .line 17
    .line 18
    invoke-virtual {v1, v5}, La/uiv0;->i(I)La/pfx;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v2, v2, La/pfx;->b:I

    .line 23
    .line 24
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/hgb;

    .line 27
    .line 28
    sget-object v6, La/hgb;->c2:La/kl5;

    .line 29
    .line 30
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v6, v6, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 35
    .line 36
    const/16 v7, 0xd

    .line 37
    .line 38
    invoke-static {v2, v4, v7, v6}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0x8

    .line 42
    .line 43
    invoke-virtual {v1, v2}, La/uiv0;->i(I)La/pfx;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget v6, v6, La/pfx;->d:I

    .line 48
    .line 49
    invoke-virtual {v1, v3}, La/uiv0;->i(I)La/pfx;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v1, v1, La/pfx;->d:I

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const v7, 0x7f070074

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    sub-int/2addr v6, v1

    .line 67
    sub-int/2addr v6, v3

    .line 68
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-lez v1, :cond_0

    .line 73
    .line 74
    move v3, v5

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    move v3, v4

    .line 77
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const v7, 0x7f07070c

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const v8, 0x7f070718

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move v7, v4

    .line 103
    :goto_1
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget-object v8, v8, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 108
    .line 109
    add-int/2addr v6, v1

    .line 110
    add-int/2addr v6, v7

    .line 111
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v8}, Landroid/view/View;->getPaddingTop()I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-virtual {v8, v7, v9, v10, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    iget-object v6, v0, La/hgb;->X1:La/jk3;

    .line 127
    .line 128
    if-eqz v6, :cond_3

    .line 129
    .line 130
    iget-object v6, v6, La/jk3;->e:Landroid/view/View;

    .line 131
    .line 132
    check-cast v6, Landroid/widget/FrameLayout;

    .line 133
    .line 134
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-nez v6, :cond_2

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    move v5, v4

    .line 142
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    goto :goto_3

    .line 147
    :cond_3
    const/4 v5, 0x0

    .line 148
    :goto_3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    const v7, 0x7f07072d

    .line 153
    .line 154
    .line 155
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    iget-object v7, v0, La/hgb;->X1:La/jk3;

    .line 160
    .line 161
    if-eqz v7, :cond_5

    .line 162
    .line 163
    iget-object v7, v7, La/jk3;->e:Landroid/view/View;

    .line 164
    .line 165
    check-cast v7, Landroid/widget/FrameLayout;

    .line 166
    .line 167
    if-eqz v3, :cond_4

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_4
    move v4, v2

    .line 171
    :goto_4
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    :cond_5
    iget-object v2, v0, La/hgb;->X1:La/jk3;

    .line 175
    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    iget-object v2, v2, La/jk3;->e:Landroid/view/View;

    .line 179
    .line 180
    check-cast v2, Landroid/widget/FrameLayout;

    .line 181
    .line 182
    add-int/2addr v1, v6

    .line 183
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-virtual {v2, v4, v6, v7, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 196
    .line 197
    .line 198
    :cond_6
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-object v1, v1, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 203
    .line 204
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setCursorOnSearchFiledVisible(Z)V

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_8

    .line 216
    .line 217
    invoke-virtual {v0}, La/hgb;->H0()La/jgb;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput-boolean v3, v1, La/jgb;->q:Z

    .line 222
    .line 223
    iget-object v2, v1, La/jgb;->k:La/p7m0;

    .line 224
    .line 225
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    instance-of v4, v4, La/o26;

    .line 230
    .line 231
    if-nez v4, :cond_7

    .line 232
    .line 233
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    instance-of v2, v2, La/n26;

    .line 238
    .line 239
    if-eqz v2, :cond_8

    .line 240
    .line 241
    :cond_7
    invoke-virtual {v1}, La/jgb;->y()V

    .line 242
    .line 243
    .line 244
    :cond_8
    if-nez v3, :cond_a

    .line 245
    .line 246
    iget-object v0, v0, La/hgb;->R1:La/zfb;

    .line 247
    .line 248
    if-eqz v0, :cond_a

    .line 249
    .line 250
    iget-object v0, v0, La/zfb;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    if-nez v0, :cond_9

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_9
    new-instance v1, La/w23;

    .line 256
    .line 257
    const/4 v2, 0x5

    .line 258
    invoke-direct {v1, v0, v2}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 262
    .line 263
    .line 264
    :cond_a
    :goto_5
    sget-object v0, La/xiv0;->b:La/xiv0;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_0
    invoke-virtual {v1}, La/xiv0;->d()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 272
    .line 273
    move-object v6, v0

    .line 274
    check-cast v6, La/pd3;

    .line 275
    .line 276
    invoke-virtual {v1}, La/xiv0;->d()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    iget-object v0, v6, La/pd3;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 281
    .line 282
    if-eqz v0, :cond_13

    .line 283
    .line 284
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 289
    .line 290
    if-eqz v0, :cond_13

    .line 291
    .line 292
    iget-object v0, v6, La/pd3;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 293
    .line 294
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    move-object v8, v0

    .line 299
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 300
    .line 301
    iget-object v0, v6, La/pd3;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_12

    .line 308
    .line 309
    iget-object v0, v6, La/pd3;->B1:Landroid/graphics/Rect;

    .line 310
    .line 311
    if-nez v0, :cond_b

    .line 312
    .line 313
    new-instance v0, Landroid/graphics/Rect;

    .line 314
    .line 315
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 316
    .line 317
    .line 318
    iput-object v0, v6, La/pd3;->B1:Landroid/graphics/Rect;

    .line 319
    .line 320
    new-instance v0, Landroid/graphics/Rect;

    .line 321
    .line 322
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 323
    .line 324
    .line 325
    iput-object v0, v6, La/pd3;->C1:Landroid/graphics/Rect;

    .line 326
    .line 327
    :cond_b
    iget-object v9, v6, La/pd3;->B1:Landroid/graphics/Rect;

    .line 328
    .line 329
    iget-object v10, v6, La/pd3;->C1:Landroid/graphics/Rect;

    .line 330
    .line 331
    invoke-virtual {v1}, La/xiv0;->b()I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    invoke-virtual {v1}, La/xiv0;->d()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    invoke-virtual {v1}, La/xiv0;->c()I

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    invoke-virtual {v1}, La/xiv0;->a()I

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    invoke-virtual {v9, v0, v11, v12, v13}, Landroid/graphics/Rect;->set(IIII)V

    .line 348
    .line 349
    .line 350
    iget-object v0, v1, La/xiv0;->a:La/uiv0;

    .line 351
    .line 352
    invoke-virtual {v0, v3}, La/uiv0;->i(I)La/pfx;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    iget-object v0, v6, La/pd3;->z:Landroid/view/ViewGroup;

    .line 357
    .line 358
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 359
    .line 360
    const/16 v13, 0x1d

    .line 361
    .line 362
    if-lt v12, v13, :cond_c

    .line 363
    .line 364
    sget-boolean v3, La/cmu0;->a:Z

    .line 365
    .line 366
    invoke-static {v9, v10, v0}, La/sf3;->c(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_c
    sget-boolean v12, La/cmu0;->a:Z

    .line 371
    .line 372
    const-string v13, "ViewUtils"

    .line 373
    .line 374
    if-nez v12, :cond_d

    .line 375
    .line 376
    sput-boolean v5, La/cmu0;->a:Z

    .line 377
    .line 378
    :try_start_0
    const-class v12, Landroid/view/View;

    .line 379
    .line 380
    const-string v14, "computeFitSystemWindows"

    .line 381
    .line 382
    new-array v3, v3, [Ljava/lang/Class;

    .line 383
    .line 384
    const-class v15, Landroid/graphics/Rect;

    .line 385
    .line 386
    aput-object v15, v3, v4

    .line 387
    .line 388
    aput-object v15, v3, v5

    .line 389
    .line 390
    invoke-virtual {v12, v14, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    sput-object v3, La/cmu0;->b:Ljava/lang/reflect/Method;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-nez v3, :cond_d

    .line 401
    .line 402
    sget-object v3, La/cmu0;->b:Ljava/lang/reflect/Method;

    .line 403
    .line 404
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :catch_0
    const-string v3, "Could not find method computeFitSystemWindows. Oh well."

    .line 409
    .line 410
    invoke-static {v13, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 411
    .line 412
    .line 413
    :cond_d
    :goto_6
    sget-object v3, La/cmu0;->b:Ljava/lang/reflect/Method;

    .line 414
    .line 415
    if-eqz v3, :cond_e

    .line 416
    .line 417
    :try_start_1
    filled-new-array {v9, v10}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v12

    .line 421
    invoke-virtual {v3, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 422
    .line 423
    .line 424
    goto :goto_7

    .line 425
    :catch_1
    move-exception v0

    .line 426
    const-string v3, "Could not invoke computeFitSystemWindows"

    .line 427
    .line 428
    invoke-static {v13, v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 429
    .line 430
    .line 431
    :cond_e
    :goto_7
    iget v0, v10, Landroid/graphics/Rect;->left:I

    .line 432
    .line 433
    iget v3, v10, Landroid/graphics/Rect;->top:I

    .line 434
    .line 435
    iget v12, v10, Landroid/graphics/Rect;->right:I

    .line 436
    .line 437
    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    .line 438
    .line 439
    iget v13, v11, La/pfx;->a:I

    .line 440
    .line 441
    sub-int/2addr v13, v0

    .line 442
    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    iget v13, v11, La/pfx;->b:I

    .line 447
    .line 448
    sub-int/2addr v13, v3

    .line 449
    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    iget v13, v11, La/pfx;->c:I

    .line 454
    .line 455
    sub-int/2addr v13, v12

    .line 456
    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    .line 457
    .line 458
    .line 459
    move-result v12

    .line 460
    iget v11, v11, La/pfx;->d:I

    .line 461
    .line 462
    sub-int/2addr v11, v10

    .line 463
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    invoke-static {v0, v3, v12, v10}, La/pfx;->c(IIII)La/pfx;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    iget v3, v0, La/pfx;->c:I

    .line 472
    .line 473
    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 474
    .line 475
    iget v0, v0, La/pfx;->a:I

    .line 476
    .line 477
    if-ne v10, v0, :cond_10

    .line 478
    .line 479
    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 480
    .line 481
    if-eq v10, v3, :cond_f

    .line 482
    .line 483
    goto :goto_8

    .line 484
    :cond_f
    move v5, v4

    .line 485
    goto :goto_9

    .line 486
    :cond_10
    :goto_8
    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 487
    .line 488
    iput v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 489
    .line 490
    :goto_9
    iget-object v10, v6, La/pd3;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 491
    .line 492
    iget v11, v9, Landroid/graphics/Rect;->left:I

    .line 493
    .line 494
    sub-int/2addr v11, v0

    .line 495
    iget v0, v9, Landroid/graphics/Rect;->top:I

    .line 496
    .line 497
    iget v12, v9, Landroid/graphics/Rect;->right:I

    .line 498
    .line 499
    sub-int/2addr v12, v3

    .line 500
    iput v11, v10, Landroidx/appcompat/widget/ActionBarContextView;->u:I

    .line 501
    .line 502
    iput v0, v10, Landroidx/appcompat/widget/ActionBarContextView;->v:I

    .line 503
    .line 504
    iput v12, v10, Landroidx/appcompat/widget/ActionBarContextView;->w:I

    .line 505
    .line 506
    invoke-virtual {v10}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    .line 507
    .line 508
    .line 509
    iget-boolean v0, v6, La/pd3;->g1:Z

    .line 510
    .line 511
    if-nez v0, :cond_11

    .line 512
    .line 513
    iget v0, v9, Landroid/graphics/Rect;->top:I

    .line 514
    .line 515
    if-lez v0, :cond_11

    .line 516
    .line 517
    move v7, v4

    .line 518
    :cond_11
    move v4, v5

    .line 519
    :cond_12
    if-eqz v4, :cond_13

    .line 520
    .line 521
    iget-object v0, v6, La/pd3;->u:Landroidx/appcompat/widget/ActionBarContextView;

    .line 522
    .line 523
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 524
    .line 525
    .line 526
    :cond_13
    if-eq v2, v7, :cond_14

    .line 527
    .line 528
    invoke-virtual {v1}, La/xiv0;->b()I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    invoke-virtual {v1}, La/xiv0;->c()I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-virtual {v1}, La/xiv0;->a()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    invoke-virtual {v1, v0, v7, v2, v3}, La/xiv0;->f(IIII)La/xiv0;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    :goto_a
    move-object/from16 v1, p1

    .line 545
    .line 546
    goto :goto_b

    .line 547
    :cond_14
    move-object v0, v1

    .line 548
    goto :goto_a

    .line 549
    :goto_b
    invoke-static {v1, v0}, La/rgu0;->j(Landroid/view/View;La/xiv0;)La/xiv0;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    return-object v0

    .line 554
    nop

    .line 555
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public o()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;
    .locals 19

    .line 1
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 2
    .line 3
    new-instance v1, La/hr1;

    .line 4
    .line 5
    const-wide/16 v2, -0xa

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    invoke-direct {v1, v2, v3, v4}, La/hr1;-><init>(JI)V

    .line 9
    .line 10
    .line 11
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 12
    .line 13
    const/16 v17, 0x0

    .line 14
    .line 15
    const/16 v18, 0x1f7

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const-wide/16 v8, 0x0

    .line 20
    .line 21
    sget-object v10, La/em1;->a:La/em1;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const-wide/16 v12, 0x0

    .line 25
    .line 26
    const-wide/16 v14, 0x0

    .line 27
    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public p(La/bnn0;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/a7p;->a:La/a7p;

    .line 2
    .line 3
    iget-object p0, p0, La/peg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/dn0;

    .line 6
    .line 7
    const/16 v1, 0x2009

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1, p1}, La/dn0;->b(La/a7p;ILa/zje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, La/fr1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, La/fr1;

    .line 13
    .line 14
    iget-object v3, v1, La/fr1;->c:La/fs80;

    .line 15
    .line 16
    invoke-virtual {v3}, La/fs80;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    iget-object v6, v3, La/fs80;->a:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v4, :cond_5

    .line 23
    .line 24
    move-object/from16 v4, p0

    .line 25
    .line 26
    iget-object v0, v4, La/peg0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/wsf0;

    .line 29
    .line 30
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/ctf0;

    .line 33
    .line 34
    iget-wide v4, v3, La/fs80;->b:J

    .line 35
    .line 36
    iget-boolean v7, v3, La/fs80;->f:Z

    .line 37
    .line 38
    iget-object v8, v3, La/fs80;->d:Ljava/util/List;

    .line 39
    .line 40
    iget-object v9, v3, La/fs80;->c:Ljava/util/List;

    .line 41
    .line 42
    sget-object v10, La/nw80;->a:La/nw80;

    .line 43
    .line 44
    invoke-virtual {v10}, La/nw80;->getId()J

    .line 45
    .line 46
    .line 47
    move-result-wide v10

    .line 48
    cmp-long v10, v4, v10

    .line 49
    .line 50
    const v11, 0x7f1303d0

    .line 51
    .line 52
    .line 53
    if-nez v10, :cond_0

    .line 54
    .line 55
    new-instance v12, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 56
    .line 57
    new-array v4, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    const v5, 0x7f130b3c

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    new-array v2, v2, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v0, v11, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    iget-wide v2, v3, La/fs80;->b:J

    .line 73
    .line 74
    new-instance v0, La/hm1;

    .line 75
    .line 76
    invoke-direct {v0, v9, v8}, La/hm1;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    const/16 v24, 0x0

    .line 80
    .line 81
    const/16 v25, 0x1f0

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    const-wide/16 v19, 0x0

    .line 86
    .line 87
    const-wide/16 v21, 0x0

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    move-object/from16 v17, v0

    .line 92
    .line 93
    move-wide v15, v2

    .line 94
    invoke-direct/range {v12 .. v25}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :cond_0
    sget-object v10, La/nw80;->b:La/nw80;

    .line 100
    .line 101
    invoke-virtual {v10}, La/nw80;->getId()J

    .line 102
    .line 103
    .line 104
    move-result-wide v12

    .line 105
    cmp-long v10, v4, v12

    .line 106
    .line 107
    if-nez v10, :cond_1

    .line 108
    .line 109
    new-instance v12, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 110
    .line 111
    new-array v4, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    const v5, 0x7f13015a

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    new-array v2, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v0, v11, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    iget-wide v2, v3, La/fs80;->b:J

    .line 127
    .line 128
    new-instance v0, La/hm1;

    .line 129
    .line 130
    invoke-direct {v0, v9, v8}, La/hm1;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    const/16 v24, 0x0

    .line 134
    .line 135
    const/16 v25, 0x1f0

    .line 136
    .line 137
    const/16 v18, 0x0

    .line 138
    .line 139
    const-wide/16 v19, 0x0

    .line 140
    .line 141
    const-wide/16 v21, 0x0

    .line 142
    .line 143
    const/16 v23, 0x0

    .line 144
    .line 145
    move-object/from16 v17, v0

    .line 146
    .line 147
    move-wide v15, v2

    .line 148
    invoke-direct/range {v12 .. v25}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_1
    sget-object v8, La/nw80;->i:La/nw80;

    .line 153
    .line 154
    invoke-virtual {v8}, La/nw80;->getId()J

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    cmp-long v4, v4, v8

    .line 159
    .line 160
    if-nez v4, :cond_2

    .line 161
    .line 162
    new-instance v8, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 163
    .line 164
    new-array v4, v2, [Ljava/lang/Object;

    .line 165
    .line 166
    const v5, 0x7f131694

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    iget-wide v11, v3, La/fs80;->b:J

    .line 174
    .line 175
    new-instance v13, La/im1;

    .line 176
    .line 177
    invoke-direct {v13, v2, v7}, La/im1;-><init>(ZZ)V

    .line 178
    .line 179
    .line 180
    const/16 v20, 0x0

    .line 181
    .line 182
    const/16 v21, 0x1f2

    .line 183
    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    const-wide/16 v15, 0x0

    .line 187
    .line 188
    const-wide/16 v17, 0x0

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    invoke-direct/range {v8 .. v21}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 193
    .line 194
    .line 195
    move-object v12, v8

    .line 196
    goto :goto_0

    .line 197
    :cond_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-lez v0, :cond_3

    .line 202
    .line 203
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 204
    .line 205
    iget-wide v8, v3, La/fs80;->b:J

    .line 206
    .line 207
    new-instance v10, La/im1;

    .line 208
    .line 209
    invoke-direct {v10, v2, v7}, La/im1;-><init>(ZZ)V

    .line 210
    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v18, 0x1f2

    .line 215
    .line 216
    const/4 v7, 0x0

    .line 217
    const/4 v11, 0x0

    .line 218
    const-wide/16 v12, 0x0

    .line 219
    .line 220
    const-wide/16 v14, 0x0

    .line 221
    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 225
    .line 226
    .line 227
    move-object v12, v5

    .line 228
    goto :goto_0

    .line 229
    :cond_3
    new-instance v6, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    const/16 v19, 0x1ff

    .line 234
    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    const-wide/16 v9, 0x0

    .line 238
    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const-wide/16 v13, 0x0

    .line 242
    .line 243
    const-wide/16 v15, 0x0

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    invoke-direct/range {v6 .. v19}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 248
    .line 249
    .line 250
    move-object v12, v6

    .line 251
    :goto_0
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 252
    .line 253
    new-instance v13, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 254
    .line 255
    const/16 v25, 0x0

    .line 256
    .line 257
    const/16 v26, 0x1ff

    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/4 v15, 0x0

    .line 261
    const-wide/16 v16, 0x0

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    const/16 v19, 0x0

    .line 266
    .line 267
    const-wide/16 v20, 0x0

    .line 268
    .line 269
    const-wide/16 v22, 0x0

    .line 270
    .line 271
    const/16 v24, 0x0

    .line 272
    .line 273
    invoke-direct/range {v13 .. v26}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v13}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_4

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_4
    new-instance v1, La/fr1;

    .line 284
    .line 285
    const/4 v2, 0x3

    .line 286
    const/4 v3, 0x0

    .line 287
    invoke-direct {v1, v3, v3, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 288
    .line 289
    .line 290
    :goto_1
    invoke-direct {v0, v1, v12}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_5
    instance-of v1, v0, La/kr1;

    .line 295
    .line 296
    const/4 v3, 0x1

    .line 297
    if-eqz v1, :cond_9

    .line 298
    .line 299
    move-object v1, v0

    .line 300
    check-cast v1, La/kr1;

    .line 301
    .line 302
    iget-object v1, v1, La/kr1;->c:La/uc0;

    .line 303
    .line 304
    iget-wide v4, v1, La/uc0;->a:J

    .line 305
    .line 306
    sget-object v6, La/nw80;->t:La/nw80;

    .line 307
    .line 308
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    cmp-long v4, v4, v6

    .line 313
    .line 314
    if-nez v4, :cond_6

    .line 315
    .line 316
    iget-object v4, v1, La/uc0;->c:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    if-nez v4, :cond_6

    .line 323
    .line 324
    iget-wide v4, v1, La/uc0;->b:J

    .line 325
    .line 326
    const-wide/high16 v6, -0x8000000000000000L

    .line 327
    .line 328
    cmp-long v4, v4, v6

    .line 329
    .line 330
    if-nez v4, :cond_6

    .line 331
    .line 332
    iget-object v4, v1, La/uc0;->g:Ljava/util/List;

    .line 333
    .line 334
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    if-eqz v4, :cond_6

    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_6
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 342
    .line 343
    new-instance v4, La/kr1;

    .line 344
    .line 345
    invoke-direct {v4}, La/kr1;-><init>()V

    .line 346
    .line 347
    .line 348
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 349
    .line 350
    iget-wide v8, v1, La/uc0;->a:J

    .line 351
    .line 352
    iget-wide v10, v1, La/uc0;->b:J

    .line 353
    .line 354
    iget-object v12, v1, La/uc0;->c:Ljava/lang/String;

    .line 355
    .line 356
    iget-short v7, v1, La/uc0;->e:S

    .line 357
    .line 358
    iget-object v15, v1, La/uc0;->g:Ljava/util/List;

    .line 359
    .line 360
    iget-object v14, v1, La/uc0;->h:Ljava/lang/String;

    .line 361
    .line 362
    iget-boolean v6, v1, La/uc0;->f:Z

    .line 363
    .line 364
    if-nez v6, :cond_7

    .line 365
    .line 366
    sget-object v3, La/gz8;->a:La/gz8;

    .line 367
    .line 368
    sget-object v3, La/gz8;->a:La/gz8;

    .line 369
    .line 370
    move/from16 v16, v2

    .line 371
    .line 372
    goto :goto_2

    .line 373
    :cond_7
    move/from16 v16, v3

    .line 374
    .line 375
    :goto_2
    iget-boolean v2, v1, La/uc0;->i:Z

    .line 376
    .line 377
    iget-object v1, v1, La/uc0;->d:Ljava/lang/String;

    .line 378
    .line 379
    if-nez v1, :cond_8

    .line 380
    .line 381
    const-string v1, ""

    .line 382
    .line 383
    :cond_8
    move-object v13, v1

    .line 384
    new-instance v6, La/xl1;

    .line 385
    .line 386
    move/from16 v17, v2

    .line 387
    .line 388
    invoke-direct/range {v6 .. v17}, La/xl1;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 389
    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    const/16 v18, 0x1f7

    .line 394
    .line 395
    move-object v10, v6

    .line 396
    const/4 v6, 0x0

    .line 397
    const/4 v7, 0x0

    .line 398
    const-wide/16 v8, 0x0

    .line 399
    .line 400
    const/4 v11, 0x0

    .line 401
    const-wide/16 v12, 0x0

    .line 402
    .line 403
    const-wide/16 v14, 0x0

    .line 404
    .line 405
    const/16 v16, 0x0

    .line 406
    .line 407
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 408
    .line 409
    .line 410
    invoke-direct {v0, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :cond_9
    :goto_3
    instance-of v1, v0, La/jr1;

    .line 415
    .line 416
    if-eqz v1, :cond_b

    .line 417
    .line 418
    move-object v4, v0

    .line 419
    check-cast v4, La/jr1;

    .line 420
    .line 421
    iget-object v4, v4, La/jr1;->c:La/fvc0;

    .line 422
    .line 423
    instance-of v5, v4, La/evc0;

    .line 424
    .line 425
    if-eqz v5, :cond_b

    .line 426
    .line 427
    check-cast v4, La/evc0;

    .line 428
    .line 429
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 430
    .line 431
    new-instance v1, La/jr1;

    .line 432
    .line 433
    invoke-direct {v1}, La/jr1;-><init>()V

    .line 434
    .line 435
    .line 436
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 437
    .line 438
    new-instance v10, La/sm1;

    .line 439
    .line 440
    iget-wide v6, v4, La/evc0;->a:J

    .line 441
    .line 442
    invoke-direct {v10, v6, v7}, La/sm1;-><init>(J)V

    .line 443
    .line 444
    .line 445
    iget-boolean v4, v4, La/evc0;->b:Z

    .line 446
    .line 447
    if-ne v4, v3, :cond_a

    .line 448
    .line 449
    move/from16 v17, v3

    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_a
    move/from16 v17, v2

    .line 453
    .line 454
    :goto_4
    const/16 v18, 0xf7

    .line 455
    .line 456
    const/4 v6, 0x0

    .line 457
    const/4 v7, 0x0

    .line 458
    const-wide/16 v8, 0x0

    .line 459
    .line 460
    const/4 v11, 0x0

    .line 461
    const-wide/16 v12, 0x0

    .line 462
    .line 463
    const-wide/16 v14, 0x0

    .line 464
    .line 465
    const/16 v16, 0x0

    .line 466
    .line 467
    invoke-direct/range {v5 .. v18}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 468
    .line 469
    .line 470
    invoke-direct {v0, v1, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 471
    .line 472
    .line 473
    return-object v0

    .line 474
    :cond_b
    if-eqz v1, :cond_c

    .line 475
    .line 476
    move-object v1, v0

    .line 477
    check-cast v1, La/jr1;

    .line 478
    .line 479
    iget-object v1, v1, La/jr1;->c:La/fvc0;

    .line 480
    .line 481
    instance-of v1, v1, La/avc0;

    .line 482
    .line 483
    if-eqz v1, :cond_c

    .line 484
    .line 485
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 486
    .line 487
    new-instance v1, La/jr1;

    .line 488
    .line 489
    invoke-direct {v1}, La/jr1;-><init>()V

    .line 490
    .line 491
    .line 492
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const/16 v15, 0x1f7

    .line 496
    .line 497
    const/4 v3, 0x0

    .line 498
    const/4 v4, 0x0

    .line 499
    const-wide/16 v5, 0x0

    .line 500
    .line 501
    sget-object v7, La/bm1;->a:La/bm1;

    .line 502
    .line 503
    const/4 v8, 0x0

    .line 504
    const-wide/16 v9, 0x0

    .line 505
    .line 506
    const-wide/16 v11, 0x0

    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 510
    .line 511
    .line 512
    invoke-direct {v0, v1, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 513
    .line 514
    .line 515
    return-object v0

    .line 516
    :cond_c
    instance-of v1, v0, La/hr1;

    .line 517
    .line 518
    if-eqz v1, :cond_d

    .line 519
    .line 520
    move-object v1, v0

    .line 521
    check-cast v1, La/hr1;

    .line 522
    .line 523
    iget-wide v2, v1, La/hr1;->c:J

    .line 524
    .line 525
    sget-object v4, La/s0s;->b:La/s0s;

    .line 526
    .line 527
    const-wide/16 v4, -0x1

    .line 528
    .line 529
    cmp-long v2, v2, v4

    .line 530
    .line 531
    if-nez v2, :cond_d

    .line 532
    .line 533
    iget-wide v0, v1, La/hr1;->d:J

    .line 534
    .line 535
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 536
    .line 537
    sget-object v3, La/nw80;->t:La/nw80;

    .line 538
    .line 539
    invoke-virtual {v3}, La/nw80;->getId()J

    .line 540
    .line 541
    .line 542
    sget-object v3, La/mr1;->a:La/mr1;

    .line 543
    .line 544
    new-instance v3, La/hr1;

    .line 545
    .line 546
    const-wide/16 v4, 0x0

    .line 547
    .line 548
    invoke-direct {v3, v4, v5, v0, v1}, La/hr1;-><init>(JJ)V

    .line 549
    .line 550
    .line 551
    new-instance v6, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 552
    .line 553
    new-instance v11, La/lm1;

    .line 554
    .line 555
    invoke-direct {v11}, La/lm1;-><init>()V

    .line 556
    .line 557
    .line 558
    const/16 v18, 0x0

    .line 559
    .line 560
    const/16 v19, 0x1f7

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const/4 v8, 0x0

    .line 564
    const-wide/16 v9, 0x0

    .line 565
    .line 566
    const/4 v12, 0x0

    .line 567
    const-wide/16 v13, 0x0

    .line 568
    .line 569
    const-wide/16 v15, 0x0

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    invoke-direct/range {v6 .. v19}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 574
    .line 575
    .line 576
    invoke-direct {v2, v3, v6}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 577
    .line 578
    .line 579
    return-object v2

    .line 580
    :cond_d
    new-instance v1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 581
    .line 582
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 583
    .line 584
    const/4 v14, 0x0

    .line 585
    const/16 v15, 0x1ff

    .line 586
    .line 587
    const/4 v3, 0x0

    .line 588
    const/4 v4, 0x0

    .line 589
    const-wide/16 v5, 0x0

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const/4 v8, 0x0

    .line 593
    const-wide/16 v9, 0x0

    .line 594
    .line 595
    const-wide/16 v11, 0x0

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 599
    .line 600
    .line 601
    invoke-direct {v1, v0, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 602
    .line 603
    .line 604
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/peg0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "Bradford"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
