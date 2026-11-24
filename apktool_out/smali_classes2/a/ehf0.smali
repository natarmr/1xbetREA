.class public final La/ehf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/spg0;
.implements La/nae0;


# static fields
.field public static final d:Ljava/lang/Object;

.field public static e:La/oov0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ehf0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(B)V
    .locals 2

    iput-byte p1, p0, La/ehf0;->a:B

    sparse-switch p1, :sswitch_data_0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, La/x0a;

    .line 43
    invoke-direct {p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 44
    sget-object v0, La/iun;->a:La/iun;

    .line 45
    invoke-static {v0}, La/o2e;->Z(Ljava/lang/Object;)La/c14;

    move-result-object v0

    iput-object v0, p1, La/x0a;->a:La/c14;

    .line 46
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 47
    new-instance p1, La/chf0;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, La/chf0;-><init>(B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 48
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance p1, La/or30;

    invoke-direct {p1}, La/or30;-><init>()V

    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 50
    new-instance p1, La/or30;

    invoke-direct {p1}, La/or30;-><init>()V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 51
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance p1, Lkotlin/Pair;

    const/high16 v0, -0x80000000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    move-result-object p1

    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 53
    new-instance v0, La/h2c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La/h2c;-><init>(La/p7m0;B)V

    .line 54
    iput-object v0, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x16 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 57
    iput-byte p1, p0, La/ehf0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/ane0;La/chf0;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/btt0;La/fvt0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/dn0;La/mne;)V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 0

    iput-byte p2, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sparse-switch p2, :sswitch_data_0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 25
    new-instance p1, La/zo4;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, La/zo4;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 26
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 28
    new-instance p1, La/e8g;

    const/16 p2, 0xd

    invoke-direct {p1, p0, p2}, La/e8g;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 29
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 31
    new-instance p1, La/jwd;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 32
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 34
    new-instance p1, La/h8a;

    const/16 p2, 0x19

    invoke-direct {p1, p0, p2}, La/h8a;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    .line 35
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 37
    new-instance p1, La/h8a;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, La/h8a;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_3
        0x15 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/gr00;La/gst0;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m1e;La/gii0;La/xzp;La/xk0;La/r9s0;La/btt0;La/mne;La/xex;La/khf0;La/j1q0;La/q7d0;La/ort;La/a9s0;La/uqe;La/j51;La/knf0;La/ntu;La/vby;La/wsf0;La/x2c0;La/ctf0;La/xmt;La/pru;La/gst0;La/h0q0;La/b3c0;La/pmi;La/bnt;La/wsf0;La/kuy;La/ocl;La/r9u;La/x0u;La/ap0;La/z41;)V
    .locals 29

    move-object/from16 v0, p0

    const/4 v1, 0x3

    iput-byte v1, v0, La/ehf0;->a:B

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p21 .. p21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p26 .. p26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p30 .. p30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p32 .. p32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p34 .. p34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p35 .. p35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, La/i7i;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move-object/from16 v15, p11

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v3, p19

    move-object/from16 v19, p20

    move-object/from16 v20, p21

    move-object/from16 v21, p23

    move-object/from16 v22, p24

    move-object/from16 v23, p25

    move-object/from16 v24, p27

    move-object/from16 v4, p29

    move-object/from16 v25, p30

    move-object/from16 v26, p33

    move-object/from16 v27, p34

    move-object/from16 v28, p35

    invoke-direct/range {v2 .. v28}, La/i7i;-><init>(La/wsf0;La/wsf0;La/m1e;La/gii0;La/xzp;La/xk0;La/r9s0;La/btt0;La/mne;La/xex;La/khf0;La/j1q0;La/q7d0;La/j51;La/knf0;La/ntu;La/x2c0;La/ctf0;La/pru;La/gst0;La/h0q0;La/pmi;La/kuy;La/x0u;La/ap0;La/z41;)V

    .line 3
    iput-object v2, v0, La/ehf0;->b:Ljava/lang/Object;

    move-object/from16 v1, p13

    .line 4
    iput-object v1, v0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/udg0;La/spg0;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/ehf0;->a:B

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ehf0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/uf3;La/gle0;La/q5j;La/pru;)V
    .locals 0

    const/4 p2, 0x4

    iput-byte p2, p0, La/ehf0;->a:B

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 40
    iput-object p4, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wyu;)V
    .locals 1

    const/16 v0, 0x1d

    iput-byte v0, p0, La/ehf0;->a:B

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 60
    new-instance p1, La/ugi;

    const/16 v0, 0x17

    invoke-direct {p1, p0, v0}, La/ugi;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ym40;La/n660;)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zx6;La/zlt0;)V
    .locals 1

    const/16 v0, 0xb

    iput-byte v0, p0, La/ehf0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ehf0;->a:B

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 63
    new-instance p1, La/ew3;

    invoke-direct {p1, v0}, La/ew3;-><init>(B)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/ehf0;->a:B

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 69
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 5
    iput-byte p3, p0, La/ehf0;->a:B

    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, La/ehf0;->a:B

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static c(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "FirebaseMessaging"

    .line 11
    .line 12
    const-string v1, "Binding to service"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v0, La/ehf0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    sget-object v1, La/ehf0;->e:La/oov0;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    new-instance v1, La/oov0;

    .line 25
    .line 26
    invoke-direct {v1, p0}, La/oov0;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, La/ehf0;->e:La/oov0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_4

    .line 34
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v0, 0x1

    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    invoke-static {}, La/mii0;->u()La/mii0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2, p0}, La/mii0;->z(Landroid/content/Context;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    sget-object p2, La/qjj;->h:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter p2

    .line 51
    :try_start_1
    invoke-static {p0}, La/qjj;->O(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    const-string p0, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {p1, p0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    const-string v2, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 62
    .line 63
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    if-nez p0, :cond_2

    .line 67
    .line 68
    sget-object p0, La/qjj;->i:La/pvu0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/pvu0;->a()V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    :goto_1
    invoke-virtual {v1, p1}, La/oov0;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v1, La/ytt0;

    .line 81
    .line 82
    invoke-direct {v1, p1, v0}, La/ytt0;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    monitor-exit p2

    .line 89
    goto :goto_3

    .line 90
    :goto_2
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    throw p0

    .line 92
    :cond_3
    invoke-virtual {v1, p1}, La/oov0;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 93
    .line 94
    .line 95
    :goto_3
    const/4 p0, -0x1

    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_4
    invoke-virtual {v1, p1}, La/oov0;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance p1, La/ew3;

    .line 110
    .line 111
    invoke-direct {p1, v0}, La/ew3;-><init>(B)V

    .line 112
    .line 113
    .line 114
    new-instance p2, La/udk;

    .line 115
    .line 116
    const/16 v0, 0x11

    .line 117
    .line 118
    invoke-direct {p2, v0}, La/udk;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)La/qpg0;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/udg0;

    .line 7
    .line 8
    const-string v1, ":memory:"

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v0, La/udg0;->c:La/rcj;

    .line 17
    .line 18
    iget-object v2, v2, La/rcj;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :cond_0
    new-instance v2, La/xjo;

    .line 32
    .line 33
    iget-boolean v3, v0, La/udg0;->a:Z

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iget-boolean v3, v0, La/udg0;->b:Z

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    move v1, v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v1, v5

    .line 52
    :goto_0
    invoke-direct {v2, p1, v1}, La/xjo;-><init>(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v2, La/xjo;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 58
    .line 59
    .line 60
    iget-object v2, v2, La/xjo;->b:La/jtj;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v2}, La/jtj;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    move v4, v5

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    :goto_1
    const/4 v3, 0x0

    .line 73
    :try_start_1
    iget-boolean v6, v0, La/udg0;->b:Z

    .line 74
    .line 75
    if-nez v6, :cond_7

    .line 76
    .line 77
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/spg0;

    .line 80
    .line 81
    invoke-interface {p0, p1}, La/spg0;->a(Ljava/lang/String;)La/qpg0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    iget-boolean v6, v0, La/udg0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 86
    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    :try_start_2
    iput-boolean v4, v0, La/udg0;->b:Z

    .line 90
    .line 91
    invoke-virtual {v0, p0}, La/udg0;->b(La/qpg0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    .line 93
    .line 94
    :try_start_3
    iput-boolean v5, v0, La/udg0;->b:Z

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    iput-boolean v5, v0, La/udg0;->b:Z

    .line 99
    .line 100
    throw p0

    .line 101
    :cond_3
    iget-object v5, v0, La/udg0;->c:La/rcj;

    .line 102
    .line 103
    iget-object v5, v5, La/rcj;->g:La/ydg0;

    .line 104
    .line 105
    sget-object v6, La/ydg0;->b:La/ydg0;

    .line 106
    .line 107
    if-ne v5, v6, :cond_4

    .line 108
    .line 109
    const-string v5, "PRAGMA synchronous = NORMAL"

    .line 110
    .line 111
    invoke-static {p0, v5}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    const-string v5, "PRAGMA synchronous = FULL"

    .line 116
    .line 117
    invoke-static {p0, v5}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-static {p0}, La/udg0;->a(La/qpg0;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, La/udg0;->d:La/pa80;

    .line 124
    .line 125
    invoke-virtual {v0, p0}, La/pa80;->t(La/qpg0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 126
    .line 127
    .line 128
    :goto_3
    if-eqz v2, :cond_6

    .line 129
    .line 130
    :try_start_4
    iget-object v0, v2, La/jtj;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Ljava/nio/channels/FileChannel;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    :try_start_5
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 138
    .line 139
    .line 140
    :try_start_6
    iput-object v3, v2, La/jtj;->c:Ljava/lang/Object;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :catchall_2
    move-exception p0

    .line 144
    iput-object v3, v2, La/jtj;->c:Ljava/lang/Object;

    .line 145
    .line 146
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 147
    :cond_6
    :goto_4
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_7
    :try_start_7
    const-string p0, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    .line 152
    .line 153
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 159
    :catchall_3
    move-exception p0

    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    :try_start_8
    iget-object v0, v2, La/jtj;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Ljava/nio/channels/FileChannel;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 165
    .line 166
    if-nez v0, :cond_8

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    :try_start_9
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 170
    .line 171
    .line 172
    :try_start_a
    iput-object v3, v2, La/jtj;->c:Ljava/lang/Object;

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :catchall_4
    move-exception p0

    .line 176
    iput-object v3, v2, La/jtj;->c:Ljava/lang/Object;

    .line 177
    .line 178
    throw p0

    .line 179
    :cond_9
    :goto_5
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 180
    :catchall_5
    move-exception p0

    .line 181
    :goto_6
    if-eqz v4, :cond_a

    .line 182
    .line 183
    :try_start_b
    throw p0

    .line 184
    :catchall_6
    move-exception p0

    .line 185
    goto :goto_7

    .line 186
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v3, "Unable to open database \'"

    .line 191
    .line 192
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string p1, "\'. Was a proper path / name used in Room\'s database builder?"

    .line 199
    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-direct {v0, p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 211
    :goto_7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public d(La/p2d0;La/h950;)La/u83;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p1, La/p2d0;->c:I

    .line 8
    .line 9
    invoke-static {p2, v0}, La/ydx;->K(La/h950;I)La/qlc;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/ym40;

    .line 16
    .line 17
    iget-object v2, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La/n660;

    .line 20
    .line 21
    invoke-static {v1, v0, v2}, La/obb;->X(La/ym40;La/qlc;La/n660;)La/wm40;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, La/lun;->a:La/lun;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, La/p2d0;->d:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_7

    .line 37
    .line 38
    invoke-static {v0}, La/f2o;->f(La/vjj;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_7

    .line 43
    .line 44
    sget v2, La/oek;->a:I

    .line 45
    .line 46
    sget-object v2, La/slc;->e:La/slc;

    .line 47
    .line 48
    invoke-static {v0, v2}, La/oek;->m(La/vjj;La/slc;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_7

    .line 53
    .line 54
    invoke-virtual {v0}, La/wm40;->g()Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast v2, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->w0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, La/flc;

    .line 68
    .line 69
    if-eqz v2, :cond_7

    .line 70
    .line 71
    invoke-virtual {v2}, La/oer;->z()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/16 v2, 0xa

    .line 79
    .line 80
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-static {v2}, La/wp20;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    const/16 v3, 0x10

    .line 89
    .line 90
    if-ge v2, v3, :cond_0

    .line 91
    .line 92
    move v2, v3

    .line 93
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    move-object v4, v2

    .line 113
    check-cast v4, La/k3u0;

    .line 114
    .line 115
    invoke-virtual {v4}, La/wjj;->getName()La/g950;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    iget-object p1, p1, La/p2d0;->d:Ljava/util/List;

    .line 124
    .line 125
    invoke-static {p1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/n2d0;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget v4, v2, La/n2d0;->c:I

    .line 149
    .line 150
    invoke-interface {p2, v4}, La/h950;->getString(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v4}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, La/k3u0;

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    new-instance v6, Lkotlin/Pair;

    .line 169
    .line 170
    iget v7, v2, La/n2d0;->c:I

    .line 171
    .line 172
    invoke-interface {p2, v7}, La/h950;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-static {v7}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v4}, La/s3u0;->getType()La/wsy;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object v2, v2, La/n2d0;->d:La/m2d0;

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v4, v2, p2}, La/ehf0;->t(La/wsy;La/m2d0;La/h950;)La/r2e;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-virtual {p0, v8, v4, v2}, La/ehf0;->e(La/r2e;La/wsy;La/m2d0;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_4

    .line 201
    .line 202
    move-object v5, v8

    .line 203
    :cond_4
    if-nez v5, :cond_5

    .line 204
    .line 205
    new-instance v5, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v8, "Unexpected argument value: actual type "

    .line 208
    .line 209
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v2, La/m2d0;->c:La/l2d0;

    .line 213
    .line 214
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v2, " != expected type "

    .line 218
    .line 219
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    new-instance v5, La/g2o;

    .line 230
    .line 231
    invoke-direct {v5, v2}, La/g2o;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_5
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    move-object v5, v6

    .line 238
    :goto_2
    if-eqz v5, :cond_2

    .line 239
    .line 240
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_6
    invoke-static {v1}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    :cond_7
    new-instance p0, La/u83;

    .line 249
    .line 250
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    sget-object p2, La/gmk0;->x0:La/gne0;

    .line 255
    .line 256
    invoke-direct {p0, p1, v1, p2}, La/u83;-><init>(La/kzj0;Ljava/util/Map;La/gmk0;)V

    .line 257
    .line 258
    .line 259
    return-object p0
.end method

.method public e(La/r2e;La/wsy;La/m2d0;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ym40;

    .line 4
    .line 5
    iget-object v1, p3, La/m2d0;->c:La/l2d0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v2, La/v83;->a:[I

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aget v1, v2, v1

    .line 18
    .line 19
    :goto_0
    const/16 v2, 0xa

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-eq v1, v2, :cond_6

    .line 23
    .line 24
    const/16 v2, 0xd

    .line 25
    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/r2e;->a(La/ym40;)La/wsy;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_1
    instance-of v1, p1, La/mx3;

    .line 38
    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    check-cast v1, La/mx3;

    .line 43
    .line 44
    iget-object v1, v1, La/r2e;->a:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v2, v1

    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v4, p3, La/m2d0;->k:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ne v2, v4, :cond_5

    .line 60
    .line 61
    invoke-interface {v0}, La/ym40;->c()La/ary;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1, p2}, La/ary;->g(La/wsy;)La/wsy;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move-object p2, v1

    .line 73
    check-cast p2, Ljava/util/Collection;

    .line 74
    .line 75
    invoke-static {p2}, La/q3d;->h(Ljava/util/Collection;)Lkotlin/ranges/IntRange;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    instance-of v0, p2, Ljava/util/Collection;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, Ljava/util/Collection;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-virtual {p2}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :cond_4
    move-object v0, p2

    .line 98
    check-cast v0, La/kkx;

    .line 99
    .line 100
    iget-boolean v0, v0, La/kkx;->c:Z

    .line 101
    .line 102
    if-eqz v0, :cond_9

    .line 103
    .line 104
    move-object v0, p2

    .line 105
    check-cast v0, La/bkx;

    .line 106
    .line 107
    invoke-virtual {v0}, La/bkx;->nextInt()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    move-object v2, v1

    .line 112
    check-cast v2, Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, La/r2e;

    .line 119
    .line 120
    iget-object v4, p3, La/m2d0;->k:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/m2d0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v2, p1, v0}, La/ehf0;->e(La/r2e;La/wsy;La/m2d0;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const-string p0, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    .line 139
    .line 140
    invoke-static {p1, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return v3

    .line 144
    :cond_6
    invoke-virtual {p2}, La/wsy;->S()La/iys0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, La/iys0;->n()La/foc;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    instance-of p1, p0, La/wm40;

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    check-cast p0, La/wm40;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_7
    const/4 p0, 0x0

    .line 160
    :goto_1
    if-eqz p0, :cond_9

    .line 161
    .line 162
    sget-object p1, La/ary;->e:La/g950;

    .line 163
    .line 164
    sget-object p1, La/i4m0;->Q:La/twq;

    .line 165
    .line 166
    invoke-static {p0, p1}, La/ary;->b(La/wm40;La/twq;)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-eqz p0, :cond_8

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    :goto_2
    return v3

    .line 174
    :cond_9
    :goto_3
    const/4 p0, 0x1

    .line 175
    return p0
.end method

.method public f(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/ff;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ff;

    .line 7
    .line 8
    iget v1, v0, La/ff;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ff;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ff;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ff;-><init>(La/ehf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ff;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ff;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/fvt0;

    .line 53
    .line 54
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput v4, v0, La/ff;->k:I

    .line 63
    .line 64
    iget-object p1, p1, La/fvt0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/ze;

    .line 67
    .line 68
    new-instance v2, La/jf;

    .line 69
    .line 70
    invoke-direct {v2}, La/jf;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, p0, v2, v0}, La/ze;->a(Ljava/lang/String;La/jf;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    check-cast p1, La/mf;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object p0, p1, La/mf;->b:La/pf;

    .line 86
    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    iget-object p0, p0, La/pf;->a:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_4
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v3
.end method

.method public g()La/hsj;
    .locals 5

    .line 1
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/i7i;

    .line 4
    .line 5
    new-instance v0, La/hsj;

    .line 6
    .line 7
    new-instance v1, La/lhf0;

    .line 8
    .line 9
    iget-object v2, p0, La/i7i;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/khf0;

    .line 12
    .line 13
    iget-object v3, p0, La/i7i;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, La/knf0;

    .line 16
    .line 17
    iget-object v4, p0, La/i7i;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, La/mne;

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, La/lhf0;-><init>(La/khf0;La/knf0;La/mne;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/i7i;->s:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/j1q0;

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, La/hsj;-><init>(La/lhf0;La/j1q0;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public h()La/jtj;
    .locals 2

    .line 1
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/i7i;

    .line 4
    .line 5
    new-instance v0, La/jtj;

    .line 6
    .line 7
    iget-object v1, p0, La/i7i;->B:La/n5d0;

    .line 8
    .line 9
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/dn0;

    .line 14
    .line 15
    iget-object p0, p0, La/i7i;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/mne;

    .line 18
    .line 19
    invoke-direct {v0, v1, p0}, La/jtj;-><init>(La/dn0;La/mne;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/j4h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/j4h;

    .line 7
    .line 8
    iget v1, v0, La/j4h;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/j4h;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/j4h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/j4h;-><init>(La/ehf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/j4h;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/j4h;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/e8g;

    .line 53
    .line 54
    invoke-virtual {p0}, La/e8g;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/y2h;

    .line 59
    .line 60
    iput v3, v0, La/j4h;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, p3, v0}, La/y2h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    if-ne p4, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p4, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p4}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Landroid/os/Parcelable;

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, p2

    .line 28
    :goto_0
    iput-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    const-string p0, "Returning value can not be null. Please, specify non null default value"

    .line 34
    .line 35
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-object p2
.end method

.method public k(JLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/cv3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/cv3;

    .line 7
    .line 8
    iget v1, v0, La/cv3;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cv3;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cv3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/cv3;-><init>(La/ehf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/cv3;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cv3;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v4, 0x0

    .line 51
    .line 52
    cmp-long p3, p1, v4

    .line 53
    .line 54
    if-eqz p3, :cond_4

    .line 55
    .line 56
    iget-object p3, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p3, La/nrt;

    .line 59
    .line 60
    iput v3, v0, La/cv3;->k:I

    .line 61
    .line 62
    invoke-static {p3, p1, p2, v0}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, La/ql5;

    .line 70
    .line 71
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, La/ot;

    .line 74
    .line 75
    sget-object p1, La/bm5;->c:La/bm5;

    .line 76
    .line 77
    invoke-virtual {p0, p1, p3}, La/ot;->a(La/bm5;La/ql5;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0
.end method

.method public l(La/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/ehf0;->a:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/isc;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, La/isc;

    .line 23
    .line 24
    iget v8, v2, La/isc;->k:I

    .line 25
    .line 26
    and-int v9, v8, v5

    .line 27
    .line 28
    if-eqz v9, :cond_0

    .line 29
    .line 30
    sub-int/2addr v8, v5

    .line 31
    iput v8, v2, La/isc;->k:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v2, La/isc;

    .line 35
    .line 36
    invoke-direct {v2, v0, v1}, La/isc;-><init>(La/ehf0;La/zje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v1, v2, La/isc;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v5, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v8, v2, La/isc;->k:I

    .line 44
    .line 45
    if-eqz v8, :cond_3

    .line 46
    .line 47
    if-eq v8, v6, :cond_2

    .line 48
    .line 49
    if-ne v8, v7, :cond_1

    .line 50
    .line 51
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, La/y3v;

    .line 69
    .line 70
    iput v6, v2, La/isc;->k:I

    .line 71
    .line 72
    iget-object v3, v1, La/y3v;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, La/y9n0;

    .line 75
    .line 76
    iget-object v3, v3, La/y9n0;->a:La/p7m0;

    .line 77
    .line 78
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/util/Set;

    .line 83
    .line 84
    check-cast v3, Ljava/lang/Iterable;

    .line 85
    .line 86
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v3, v2}, La/y3v;->x(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-ne v1, v5, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_1
    if-ne v1, v5, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    iget-object v0, v0, La/ehf0;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/nvu;

    .line 105
    .line 106
    iput v7, v2, La/isc;->k:I

    .line 107
    .line 108
    invoke-virtual {v0, v2}, La/nvu;->E(La/zje;)Ljava/io/Serializable;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-ne v0, v5, :cond_6

    .line 113
    .line 114
    :goto_3
    move-object v3, v5

    .line 115
    goto :goto_5

    .line 116
    :cond_6
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_5
    return-object v3

    .line 119
    :pswitch_0
    iget-object v2, v0, La/ehf0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v10, v2

    .line 122
    check-cast v10, La/m0o0;

    .line 123
    .line 124
    instance-of v2, v1, La/dhf0;

    .line 125
    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    move-object v2, v1

    .line 129
    check-cast v2, La/dhf0;

    .line 130
    .line 131
    iget v8, v2, La/dhf0;->l:I

    .line 132
    .line 133
    and-int v9, v8, v5

    .line 134
    .line 135
    if-eqz v9, :cond_7

    .line 136
    .line 137
    sub-int/2addr v8, v5

    .line 138
    iput v8, v2, La/dhf0;->l:I

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    new-instance v2, La/dhf0;

    .line 142
    .line 143
    invoke-direct {v2, v0, v1}, La/dhf0;-><init>(La/ehf0;La/zje;)V

    .line 144
    .line 145
    .line 146
    :goto_6
    iget-object v1, v2, La/dhf0;->j:Ljava/lang/Object;

    .line 147
    .line 148
    sget-object v5, La/wne;->a:La/wne;

    .line 149
    .line 150
    iget v8, v2, La/dhf0;->l:I

    .line 151
    .line 152
    const-class v9, La/ehf0;

    .line 153
    .line 154
    const/4 v11, 0x3

    .line 155
    if-eqz v8, :cond_b

    .line 156
    .line 157
    if-eq v8, v6, :cond_a

    .line 158
    .line 159
    if-eq v8, v7, :cond_9

    .line 160
    .line 161
    if-eq v8, v11, :cond_8

    .line 162
    .line 163
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_e

    .line 167
    .line 168
    :cond_8
    iget-object v0, v2, La/dhf0;->i:La/n7p;

    .line 169
    .line 170
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_c

    .line 174
    .line 175
    :cond_9
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_d

    .line 179
    .line 180
    :catchall_0
    move-exception v0

    .line 181
    move-object v3, v9

    .line 182
    move v1, v11

    .line 183
    goto :goto_9

    .line 184
    :cond_a
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_b
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :try_start_1
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, La/phf0;

    .line 194
    .line 195
    iput v6, v2, La/dhf0;->l:I

    .line 196
    .line 197
    invoke-virtual {v0, v2}, La/phf0;->e(La/zje;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-ne v0, v5, :cond_c

    .line 202
    .line 203
    goto :goto_b

    .line 204
    :cond_c
    :goto_7
    iput v7, v2, La/dhf0;->l:I

    .line 205
    .line 206
    new-instance v8, La/qye0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    .line 208
    move v1, v11

    .line 209
    :try_start_2
    const-class v11, La/m0o0;

    .line 210
    .line 211
    const-string v12, "updateFavoritesFromRemote"

    .line 212
    .line 213
    const-string v13, "updateFavoritesFromRemote(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/16 v15, 0x1c

    .line 217
    .line 218
    move-object v3, v9

    .line 219
    const/4 v9, 0x1

    .line 220
    :try_start_3
    invoke-direct/range {v8 .. v15}, La/qye0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 221
    .line 222
    .line 223
    invoke-static {v8, v3, v2}, La/iom0;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Class;La/yje;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    if-ne v0, v5, :cond_d

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 231
    .line 232
    :goto_8
    if-ne v0, v5, :cond_11

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    goto :goto_9

    .line 237
    :catchall_2
    move-exception v0

    .line 238
    move-object v3, v9

    .line 239
    :goto_9
    instance-of v4, v0, La/n7p;

    .line 240
    .line 241
    if-eqz v4, :cond_10

    .line 242
    .line 243
    move-object v4, v0

    .line 244
    check-cast v4, La/n7p;

    .line 245
    .line 246
    iput-object v4, v2, La/dhf0;->i:La/n7p;

    .line 247
    .line 248
    iput v1, v2, La/dhf0;->l:I

    .line 249
    .line 250
    new-instance v8, La/qye0;

    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const/16 v15, 0x1c

    .line 254
    .line 255
    const/4 v9, 0x1

    .line 256
    const-class v11, La/m0o0;

    .line 257
    .line 258
    const-string v12, "updateFavoritesFromRemote"

    .line 259
    .line 260
    const-string v13, "updateFavoritesFromRemote(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 261
    .line 262
    invoke-direct/range {v8 .. v15}, La/qye0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 263
    .line 264
    .line 265
    invoke-static {v8, v3, v2}, La/iom0;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Class;La/yje;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    sget-object v2, La/wne;->a:La/wne;

    .line 270
    .line 271
    if-ne v1, v2, :cond_e

    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_e
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    :goto_a
    if-ne v1, v5, :cond_f

    .line 277
    .line 278
    :goto_b
    move-object v3, v5

    .line 279
    goto :goto_e

    .line 280
    :cond_f
    :goto_c
    throw v0

    .line 281
    :cond_10
    instance-of v1, v0, La/ozn0;

    .line 282
    .line 283
    if-eqz v1, :cond_12

    .line 284
    .line 285
    :cond_11
    :goto_d
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    :goto_e
    return-object v3

    .line 288
    :cond_12
    throw v0

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;ILa/ynb0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p5, La/e48;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/e48;

    .line 7
    .line 8
    iget v1, v0, La/e48;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/e48;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e48;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/e48;-><init>(La/ehf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/e48;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e48;->n:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p5

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    iget p3, v0, La/e48;->k:I

    .line 51
    .line 52
    iget-object p4, v0, La/e48;->j:La/ynb0;

    .line 53
    .line 54
    iget-object p2, v0, La/e48;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p5, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p5, La/ikt0;

    .line 66
    .line 67
    iput-object p2, v0, La/e48;->i:Ljava/lang/String;

    .line 68
    .line 69
    iput-object p4, v0, La/e48;->j:La/ynb0;

    .line 70
    .line 71
    iput p3, v0, La/e48;->k:I

    .line 72
    .line 73
    iput v4, v0, La/e48;->n:I

    .line 74
    .line 75
    invoke-virtual {p5, p1, p2, v0}, La/ikt0;->a(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v1, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    iget-object p0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, La/fvt0;

    .line 85
    .line 86
    iput-object v5, v0, La/e48;->i:Ljava/lang/String;

    .line 87
    .line 88
    iput-object v5, v0, La/e48;->j:La/ynb0;

    .line 89
    .line 90
    iput p3, v0, La/e48;->k:I

    .line 91
    .line 92
    iput v3, v0, La/e48;->n:I

    .line 93
    .line 94
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, La/kd30;

    .line 97
    .line 98
    invoke-virtual {p0, p2, p3, p4, v0}, La/kd30;->w(Ljava/lang/String;ILa/ynb0;La/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-ne p0, v1, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object v1

    .line 105
    :cond_5
    return-object p0
.end method

.method public bridge synthetic n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public o()V
    .locals 4

    .line 1
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ag3;

    .line 4
    .line 5
    iget-object v0, v0, La/ag3;->a:La/kt2;

    .line 6
    .line 7
    const-string v1, "call_back_history_cancel_querry"

    .line 8
    .line 9
    const-string v2, "option"

    .line 10
    .line 11
    const-string v3, "queue"

    .line 12
    .line 13
    invoke-static {v2, v3, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/x20;

    .line 19
    .line 20
    iget-object p0, p0, La/x20;->a:La/s1p;

    .line 21
    .line 22
    const-wide/16 v0, 0x2a70

    .line 23
    .line 24
    invoke-static {v3, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ag3;

    .line 4
    .line 5
    iget-object v0, v0, La/ag3;->a:La/kt2;

    .line 6
    .line 7
    const-string v1, "call_back_history_cancel_querry_action"

    .line 8
    .line 9
    const-string v2, "option"

    .line 10
    .line 11
    invoke-static {v2, p1, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/x20;

    .line 17
    .line 18
    iget-object p0, p0, La/x20;->a:La/s1p;

    .line 19
    .line 20
    const-wide/16 v0, 0x2a72

    .line 21
    .line 22
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public q(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    const-string v0, "gcm.rawData64"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v3, "rawData"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/content/Context;

    .line 25
    .line 26
    iget-object p0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, La/ew3;

    .line 29
    .line 30
    invoke-static {}, La/ufx;->F()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 42
    .line 43
    const/16 v4, 0x1a

    .line 44
    .line 45
    if-lt v1, v4, :cond_1

    .line 46
    .line 47
    move v1, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v1, v2

    .line 50
    :goto_0
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/high16 v5, 0x10000000

    .line 55
    .line 56
    and-int/2addr v4, v5

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    move v2, v3

    .line 60
    :cond_2
    if-eqz v1, :cond_3

    .line 61
    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    invoke-static {v0, p1, v2}, La/ehf0;->c(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_3
    new-instance v1, La/ird;

    .line 70
    .line 71
    invoke-direct {v1, v0, p1, v3}, La/ird;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v3, La/bgp;

    .line 79
    .line 80
    invoke-direct {v3, v0, p1, v2}, La/bgp;-><init>(Landroid/content/Context;Landroid/content/Intent;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p0, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/chf0;

    .line 4
    .line 5
    iget-object v0, v0, La/chf0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/jwd;

    .line 8
    .line 9
    iget-object v1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/ane0;

    .line 12
    .line 13
    instance-of v2, p4, La/wwf;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, p4

    .line 18
    check-cast v2, La/wwf;

    .line 19
    .line 20
    iget v3, v2, La/wwf;->k:I

    .line 21
    .line 22
    const/high16 v4, -0x80000000

    .line 23
    .line 24
    and-int v5, v3, v4

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    sub-int/2addr v3, v4

    .line 29
    iput v3, v2, La/wwf;->k:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v2, La/wwf;

    .line 33
    .line 34
    invoke-direct {v2, p0, p4}, La/wwf;-><init>(La/ehf0;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p0, v2, La/wwf;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p4, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v3, v2, La/wwf;->k:I

    .line 42
    .line 43
    const-string v4, "CUSTOM_REFERRAL_TAG"

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    const/4 v6, 0x1

    .line 47
    const-string v7, ""

    .line 48
    .line 49
    if-eqz v3, :cond_3

    .line 50
    .line 51
    if-eq v3, v6, :cond_2

    .line 52
    .line 53
    if-ne v3, v5, :cond_1

    .line 54
    .line 55
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, La/ane0;->a()La/aoe0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p0, p0, La/aoe0;->d:Ljava/lang/String;

    .line 79
    .line 80
    if-nez p0, :cond_4

    .line 81
    .line 82
    move-object p0, v7

    .line 83
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-lez p0, :cond_5

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-lez p0, :cond_6

    .line 95
    .line 96
    iget-object p0, v1, La/ane0;->b:La/vwb0;

    .line 97
    .line 98
    invoke-virtual {p0, v4, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-lez p0, :cond_9

    .line 107
    .line 108
    iput v6, v2, La/wwf;->k:I

    .line 109
    .line 110
    invoke-virtual {v0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, La/vwf;

    .line 115
    .line 116
    invoke-interface {p0, p2, v2}, La/vwf;->a(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, p4, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    :goto_1
    check-cast p0, La/lb5;

    .line 124
    .line 125
    iget-object p0, p0, La/lb5;->a:Ljava/lang/String;

    .line 126
    .line 127
    if-nez p0, :cond_8

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    move-object v7, p0

    .line 131
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object p0, v1, La/ane0;->b:La/vwb0;

    .line 135
    .line 136
    invoke-virtual {p0, v4, v7}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_9
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-lez p0, :cond_c

    .line 145
    .line 146
    iput v5, v2, La/wwf;->k:I

    .line 147
    .line 148
    invoke-virtual {v0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, La/vwf;

    .line 153
    .line 154
    invoke-interface {p0, p3, v2}, La/vwf;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, p4, :cond_a

    .line 159
    .line 160
    :goto_3
    return-object p4

    .line 161
    :cond_a
    :goto_4
    check-cast p0, La/lb5;

    .line 162
    .line 163
    iget-object p0, p0, La/lb5;->a:Ljava/lang/String;

    .line 164
    .line 165
    if-nez p0, :cond_b

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_b
    move-object v7, p0

    .line 169
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object p0, v1, La/ane0;->b:La/vwb0;

    .line 173
    .line 174
    invoke-virtual {p0, v4, v7}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_c
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0
.end method

.method public s(La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p1, La/cz6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cz6;

    .line 7
    .line 8
    iget v1, v0, La/cz6;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cz6;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cz6;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/cz6;-><init>(La/ehf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/cz6;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cz6;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p1, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/zlt0;

    .line 57
    .line 58
    iput v3, v0, La/cz6;->k:I

    .line 59
    .line 60
    iget-object p1, p1, La/zlt0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, La/lkr0;

    .line 63
    .line 64
    invoke-virtual {p1}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, La/sv6;

    .line 69
    .line 70
    invoke-interface {p1, v0}, La/sv6;->a(La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    check-cast p1, La/wx90;

    .line 78
    .line 79
    invoke-static {p1}, La/uvw;->Y(La/wx90;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :goto_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 87
    .line 88
    new-instance v0, La/g0g0;

    .line 89
    .line 90
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v0

    .line 94
    :goto_3
    sget-object v0, La/iun;->a:La/iun;

    .line 95
    .line 96
    instance-of v1, p1, La/g0g0;

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    move-object p1, v0

    .line 101
    :cond_4
    move-object v0, p1

    .line 102
    check-cast v0, Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_5

    .line 109
    .line 110
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, La/zx6;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, La/zx6;->a:Ljava/util/List;

    .line 118
    .line 119
    :cond_5
    check-cast p1, Ljava/io/Serializable;

    .line 120
    .line 121
    return-object p1
.end method

.method public t(La/wsy;La/m2d0;La/h950;)La/r2e;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, La/njq;->U:La/kjq;

    .line 11
    .line 12
    iget v1, p2, La/m2d0;->m:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p2, La/m2d0;->c:La/l2d0;

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, -0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object v2, La/v83;->a:[I

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    aget v1, v2, v1

    .line 35
    .line 36
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    iget-object p2, p2, La/m2d0;->c:La/l2d0;

    .line 42
    .line 43
    new-instance p3, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, "Unsupported annotation argument type: "

    .line 46
    .line 47
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p2, " (expected "

    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/16 p1, 0x29

    .line 62
    .line 63
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :pswitch_0
    iget-object p2, p2, La/m2d0;->k:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    invoke-static {p2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, La/m2d0;

    .line 109
    .line 110
    iget-object v2, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, La/ym40;

    .line 113
    .line 114
    invoke-interface {v2}, La/ym40;->c()La/ary;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, La/ary;->e()La/kzj0;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2, v1, p3}, La/ehf0;->t(La/wsy;La/m2d0;La/h950;)La/r2e;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    new-instance p0, La/h0t0;

    .line 134
    .line 135
    invoke-direct {p0, v0, p1}, La/h0t0;-><init>(Ljava/util/List;La/wsy;)V

    .line 136
    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_1
    new-instance p1, La/e93;

    .line 140
    .line 141
    iget-object p2, p2, La/m2d0;->j:La/p2d0;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p2, p3}, La/ehf0;->d(La/p2d0;La/h950;)La/u83;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-direct {p1, p0}, La/r2e;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :pswitch_2
    new-instance p0, La/h0o;

    .line 155
    .line 156
    iget p1, p2, La/m2d0;->h:I

    .line 157
    .line 158
    invoke-static {p3, p1}, La/ydx;->K(La/h950;I)La/qlc;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget p2, p2, La/m2d0;->i:I

    .line 163
    .line 164
    invoke-interface {p3, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-static {p2}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-direct {p0, p1, p2}, La/h0o;-><init>(La/qlc;La/g950;)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_3
    new-instance p0, La/ehy;

    .line 177
    .line 178
    iget p1, p2, La/m2d0;->h:I

    .line 179
    .line 180
    invoke-static {p3, p1}, La/ydx;->K(La/h950;I)La/qlc;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget p2, p2, La/m2d0;->l:I

    .line 185
    .line 186
    invoke-direct {p0, p1, p2}, La/ehy;-><init>(La/qlc;I)V

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_4
    new-instance p0, La/htm0;

    .line 191
    .line 192
    iget p1, p2, La/m2d0;->g:I

    .line 193
    .line 194
    invoke-interface {p3, p1}, La/h950;->getString(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-direct {p0, p1}, La/r2e;-><init>(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_5
    new-instance p0, La/vm8;

    .line 206
    .line 207
    iget-wide p1, p2, La/m2d0;->d:J

    .line 208
    .line 209
    const-wide/16 v0, 0x0

    .line 210
    .line 211
    cmp-long p1, p1, v0

    .line 212
    .line 213
    if-eqz p1, :cond_2

    .line 214
    .line 215
    const/4 p1, 0x1

    .line 216
    goto :goto_2

    .line 217
    :cond_2
    const/4 p1, 0x0

    .line 218
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p0, p1}, La/vm8;-><init>(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_6
    new-instance p0, La/vm8;

    .line 227
    .line 228
    iget-wide p1, p2, La/m2d0;->f:D

    .line 229
    .line 230
    invoke-direct {p0, p1, p2}, La/vm8;-><init>(D)V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_7
    new-instance p0, La/vm8;

    .line 235
    .line 236
    iget p1, p2, La/m2d0;->e:F

    .line 237
    .line 238
    invoke-direct {p0, p1}, La/vm8;-><init>(F)V

    .line 239
    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_8
    iget-wide p0, p2, La/m2d0;->d:J

    .line 243
    .line 244
    if-eqz v0, :cond_3

    .line 245
    .line 246
    new-instance p2, La/u1t0;

    .line 247
    .line 248
    invoke-direct {p2, p0, p1}, La/u1t0;-><init>(J)V

    .line 249
    .line 250
    .line 251
    return-object p2

    .line 252
    :cond_3
    new-instance p2, La/x710;

    .line 253
    .line 254
    invoke-direct {p2, p0, p1}, La/x710;-><init>(J)V

    .line 255
    .line 256
    .line 257
    return-object p2

    .line 258
    :pswitch_9
    iget-wide p0, p2, La/m2d0;->d:J

    .line 259
    .line 260
    long-to-int p0, p0

    .line 261
    if-eqz v0, :cond_4

    .line 262
    .line 263
    new-instance p1, La/u1t0;

    .line 264
    .line 265
    invoke-direct {p1, p0}, La/u1t0;-><init>(I)V

    .line 266
    .line 267
    .line 268
    return-object p1

    .line 269
    :cond_4
    new-instance p1, La/vkx;

    .line 270
    .line 271
    invoke-direct {p1, p0}, La/vkx;-><init>(I)V

    .line 272
    .line 273
    .line 274
    return-object p1

    .line 275
    :pswitch_a
    iget-wide p0, p2, La/m2d0;->d:J

    .line 276
    .line 277
    long-to-int p0, p0

    .line 278
    int-to-short p0, p0

    .line 279
    if-eqz v0, :cond_5

    .line 280
    .line 281
    new-instance p1, La/u1t0;

    .line 282
    .line 283
    invoke-direct {p1, p0}, La/u1t0;-><init>(S)V

    .line 284
    .line 285
    .line 286
    return-object p1

    .line 287
    :cond_5
    new-instance p1, La/bsj0;

    .line 288
    .line 289
    invoke-direct {p1, p0}, La/bsj0;-><init>(S)V

    .line 290
    .line 291
    .line 292
    return-object p1

    .line 293
    :pswitch_b
    new-instance p0, La/svb;

    .line 294
    .line 295
    iget-wide p1, p2, La/m2d0;->d:J

    .line 296
    .line 297
    long-to-int p1, p1

    .line 298
    int-to-char p1, p1

    .line 299
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-direct {p0, p1}, La/r2e;-><init>(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_c
    iget-wide p0, p2, La/m2d0;->d:J

    .line 308
    .line 309
    long-to-int p0, p0

    .line 310
    int-to-byte p0, p0

    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    new-instance p1, La/u1t0;

    .line 314
    .line 315
    invoke-direct {p1, p0}, La/u1t0;-><init>(B)V

    .line 316
    .line 317
    .line 318
    return-object p1

    .line 319
    :cond_6
    new-instance p1, La/rg9;

    .line 320
    .line 321
    invoke-direct {p1, p0}, La/rg9;-><init>(B)V

    .line 322
    .line 323
    .line 324
    return-object p1

    .line 325
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/p7m0;

    .line 7
    .line 8
    new-instance v0, Lkotlin/Pair;

    .line 9
    .line 10
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lkotlin/Pair;

    .line 15
    .line 16
    iget-object v1, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public v(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p2, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    iput-object p3, p0, La/ehf0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v3, v1, La/jm1;

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPromoScreen;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    sget-object v1, La/bvc0;->a:La/bvc0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    check-cast v1, La/jm1;

    .line 22
    .line 23
    iget-object v1, v1, La/jm1;->a:La/fvc0;

    .line 24
    .line 25
    :goto_0
    invoke-direct {v0, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPromoScreen;-><init>(La/fvc0;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    instance-of v3, v1, La/cm1;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorFavoritesScreen;

    .line 34
    .line 35
    check-cast v1, La/cm1;

    .line 36
    .line 37
    iget-object v1, v1, La/cm1;->a:La/mdp;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorFavoritesScreen;-><init>(La/mdp;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    instance-of v3, v1, La/sm1;

    .line 44
    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentsScreen;

    .line 50
    .line 51
    if-eqz p3, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    check-cast v1, La/sm1;

    .line 55
    .line 56
    iget-wide v4, v1, La/sm1;->a:J

    .line 57
    .line 58
    :goto_1
    invoke-direct {v0, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentsScreen;-><init>(J)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_4
    instance-of v3, v1, La/qm1;

    .line 63
    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    new-instance v6, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;

    .line 67
    .line 68
    move-object v0, v1

    .line 69
    check-cast v0, La/qm1;

    .line 70
    .line 71
    iget-wide v7, v0, La/qm1;->a:J

    .line 72
    .line 73
    iget-object v9, v0, La/qm1;->b:La/s9s0;

    .line 74
    .line 75
    iget-object v10, v0, La/qm1;->c:Ljava/lang/String;

    .line 76
    .line 77
    iget-boolean v11, v0, La/qm1;->d:Z

    .line 78
    .line 79
    invoke-direct/range {v6 .. v11}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentFullInfoScreen;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    return-object v6

    .line 83
    :cond_5
    instance-of v3, v1, La/km1;

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesWithProvidersListScreen;

    .line 88
    .line 89
    const-wide/16 v1, -0x1

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-direct {v0, v3, v1, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesWithProvidersListScreen;-><init>(ZJ)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_6
    instance-of v3, v1, La/zl1;

    .line 97
    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesWithProvidersListScreen;

    .line 101
    .line 102
    check-cast v1, La/zl1;

    .line 103
    .line 104
    iget-wide v2, v1, La/zl1;->a:J

    .line 105
    .line 106
    iget-boolean v1, v1, La/zl1;->b:Z

    .line 107
    .line 108
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesWithProvidersListScreen;-><init>(ZJ)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_7
    instance-of v3, v1, La/fm1;

    .line 113
    .line 114
    if-eqz v3, :cond_b

    .line 115
    .line 116
    iget-object v0, v0, La/ehf0;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, La/pru;

    .line 119
    .line 120
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 125
    .line 126
    iget-boolean v0, v0, La/hl1;->P:Z

    .line 127
    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    if-eqz p3, :cond_8

    .line 131
    .line 132
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorScreen;

    .line 133
    .line 134
    invoke-direct {v0, v4, v5, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorScreen;-><init>(JJ)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_8
    if-eqz v0, :cond_9

    .line 139
    .line 140
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorScreen;

    .line 141
    .line 142
    check-cast v1, La/fm1;

    .line 143
    .line 144
    iget-wide v2, v1, La/fm1;->a:J

    .line 145
    .line 146
    iget-wide v4, v1, La/fm1;->b:J

    .line 147
    .line 148
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorScreen;-><init>(JJ)V

    .line 149
    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_9
    if-eqz p3, :cond_a

    .line 153
    .line 154
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorOldScreen;

    .line 155
    .line 156
    invoke-direct {v0, v4, v5, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorOldScreen;-><init>(JJ)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_a
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorOldScreen;

    .line 161
    .line 162
    check-cast v1, La/fm1;

    .line 163
    .line 164
    iget-wide v2, v1, La/fm1;->a:J

    .line 165
    .line 166
    iget-wide v4, v1, La/fm1;->b:J

    .line 167
    .line 168
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$MyAggregatorOldScreen;-><init>(JJ)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_b
    instance-of v3, v1, La/am1;

    .line 173
    .line 174
    if-eqz v3, :cond_d

    .line 175
    .line 176
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesScreen;

    .line 177
    .line 178
    if-eqz p3, :cond_c

    .line 179
    .line 180
    new-instance v2, La/fs80;

    .line 181
    .line 182
    const/4 v10, 0x0

    .line 183
    const/16 v11, 0x7f

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    const-wide/16 v4, 0x0

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    const/4 v7, 0x0

    .line 190
    const-wide/16 v8, 0x0

    .line 191
    .line 192
    invoke-direct/range {v2 .. v11}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_c
    move-object v2, v1

    .line 197
    check-cast v2, La/am1;

    .line 198
    .line 199
    iget-object v2, v2, La/am1;->a:La/fs80;

    .line 200
    .line 201
    :goto_2
    check-cast v1, La/am1;

    .line 202
    .line 203
    iget-object v1, v1, La/am1;->b:La/q91;

    .line 204
    .line 205
    invoke-direct {v0, v2, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorCategoriesScreen;-><init>(La/fs80;La/q91;)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_d
    instance-of v3, v1, La/hm1;

    .line 210
    .line 211
    if-eqz v3, :cond_e

    .line 212
    .line 213
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 214
    .line 215
    invoke-direct {v0, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;-><init>(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 216
    .line 217
    .line 218
    return-object v0

    .line 219
    :cond_e
    instance-of v3, v1, La/vl1;

    .line 220
    .line 221
    if-eqz v3, :cond_f

    .line 222
    .line 223
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorSearchScreen;

    .line 224
    .line 225
    iget-object v1, v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->e:La/wgh0;

    .line 226
    .line 227
    iget-object v1, v1, La/wgh0;->a:Ljava/lang/String;

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorSearchScreen;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_f
    instance-of v3, v1, La/lm1;

    .line 234
    .line 235
    if-eqz v3, :cond_10

    .line 236
    .line 237
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$RecommendedScreen;

    .line 238
    .line 239
    iget-object v1, v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    check-cast v1, La/lm1;

    .line 245
    .line 246
    iget-wide v1, v1, La/lm1;->a:J

    .line 247
    .line 248
    invoke-direct {v0, v1, v2}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$RecommendedScreen;-><init>(J)V

    .line 249
    .line 250
    .line 251
    return-object v0

    .line 252
    :cond_10
    instance-of v3, v1, La/im1;

    .line 253
    .line 254
    if-eqz v3, :cond_11

    .line 255
    .line 256
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeTwoGamesScreen;

    .line 257
    .line 258
    check-cast v1, La/im1;

    .line 259
    .line 260
    iget-boolean v3, v1, La/im1;->a:Z

    .line 261
    .line 262
    iget-boolean v1, v1, La/im1;->b:Z

    .line 263
    .line 264
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeTwoGamesScreen;-><init>(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;ZZ)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :cond_11
    instance-of v2, v1, La/dm1;

    .line 269
    .line 270
    if-eqz v2, :cond_12

    .line 271
    .line 272
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorGiftsFragmentScreen;

    .line 273
    .line 274
    check-cast v1, La/dm1;

    .line 275
    .line 276
    iget v2, v1, La/dm1;->a:I

    .line 277
    .line 278
    iget v3, v1, La/dm1;->b:I

    .line 279
    .line 280
    iget v4, v1, La/dm1;->c:I

    .line 281
    .line 282
    iget-boolean v1, v1, La/dm1;->d:Z

    .line 283
    .line 284
    invoke-direct {v0, v2, v3, v4, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorGiftsFragmentScreen;-><init>(IIIZ)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :cond_12
    instance-of v2, v1, La/mm1;

    .line 289
    .line 290
    const/4 v3, 0x0

    .line 291
    if-eqz v2, :cond_13

    .line 292
    .line 293
    new-instance v5, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 294
    .line 295
    const-string v0, "rule_casino"

    .line 296
    .line 297
    const/16 v1, 0xe

    .line 298
    .line 299
    invoke-direct {v5, v0, v1, v3, v3}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    new-instance v4, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 303
    .line 304
    const v6, 0x7f1311a1

    .line 305
    .line 306
    .line 307
    const/4 v7, 0x1

    .line 308
    const/4 v8, 0x0

    .line 309
    const/4 v9, 0x1

    .line 310
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 311
    .line 312
    .line 313
    return-object v4

    .line 314
    :cond_13
    instance-of v2, v1, La/em1;

    .line 315
    .line 316
    const/4 v4, 0x1

    .line 317
    if-eqz v2, :cond_14

    .line 318
    .line 319
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, La/uf3;

    .line 322
    .line 323
    iget-object v0, v0, La/uf3;->d:La/onv;

    .line 324
    .line 325
    iget-object v0, v0, La/onv;->a:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, La/mii0;

    .line 328
    .line 329
    invoke-virtual {v0}, La/mii0;->w()La/xzt;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v1, Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;

    .line 334
    .line 335
    invoke-direct {v1, v4}, Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;-><init>(Z)V

    .line 336
    .line 337
    .line 338
    new-instance v2, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;

    .line 339
    .line 340
    invoke-direct {v2, v0, v1}, Lorg/xplatform/aggregator/loyalty_program/impl/navigation/LoyaltyProgramScreenFactoryImpl$getLoyaltyProgramScreen$1;-><init>(La/xzt;Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;)V

    .line 341
    .line 342
    .line 343
    return-object v2

    .line 344
    :cond_14
    instance-of v0, v1, La/bm1;

    .line 345
    .line 346
    if-eqz v0, :cond_15

    .line 347
    .line 348
    new-instance v0, Lorg/xplatform/aggregator/daily_tasks/impl/di/DailyTasksScreenFactoryImpl$dailyTasksScreen$1;

    .line 349
    .line 350
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 351
    .line 352
    .line 353
    return-object v0

    .line 354
    :cond_15
    instance-of v0, v1, La/nm1;

    .line 355
    .line 356
    if-eqz v0, :cond_16

    .line 357
    .line 358
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentPrizesAltDesignScreen;

    .line 359
    .line 360
    check-cast v1, La/nm1;

    .line 361
    .line 362
    iget-wide v2, v1, La/nm1;->a:J

    .line 363
    .line 364
    iget-object v1, v1, La/nm1;->b:Ljava/lang/String;

    .line 365
    .line 366
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentPrizesAltDesignScreen;-><init>(JLjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :cond_16
    instance-of v0, v1, La/om1;

    .line 371
    .line 372
    if-eqz v0, :cond_17

    .line 373
    .line 374
    new-instance v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;

    .line 375
    .line 376
    move-object v0, v1

    .line 377
    check-cast v0, La/om1;

    .line 378
    .line 379
    iget-wide v6, v0, La/om1;->a:J

    .line 380
    .line 381
    iget-object v10, v0, La/om1;->b:Ljava/lang/String;

    .line 382
    .line 383
    iget-wide v8, v0, La/om1;->c:J

    .line 384
    .line 385
    invoke-direct/range {v5 .. v10}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentStagePrizesAltDesignScreen;-><init>(JJLjava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return-object v5

    .line 389
    :cond_17
    instance-of v0, v1, La/pm1;

    .line 390
    .line 391
    if-eqz v0, :cond_18

    .line 392
    .line 393
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentsStageAltDesignScreen;

    .line 394
    .line 395
    check-cast v1, La/pm1;

    .line 396
    .line 397
    iget-wide v2, v1, La/pm1;->a:J

    .line 398
    .line 399
    iget-object v1, v1, La/pm1;->b:Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorTournamentsStageAltDesignScreen;-><init>(JLjava/lang/String;)V

    .line 402
    .line 403
    .line 404
    return-object v0

    .line 405
    :cond_18
    instance-of v0, v1, La/rm1;

    .line 406
    .line 407
    if-eqz v0, :cond_19

    .line 408
    .line 409
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$TournamentsProvidersAltDesignScreen;

    .line 410
    .line 411
    check-cast v1, La/rm1;

    .line 412
    .line 413
    iget-wide v2, v1, La/rm1;->a:J

    .line 414
    .line 415
    iget-object v1, v1, La/rm1;->b:Ljava/lang/String;

    .line 416
    .line 417
    invoke-direct {v0, v2, v3, v1}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$TournamentsProvidersAltDesignScreen;-><init>(JLjava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v0

    .line 421
    :cond_19
    instance-of v0, v1, La/xl1;

    .line 422
    .line 423
    if-eqz v0, :cond_1a

    .line 424
    .line 425
    new-instance v5, La/uc0;

    .line 426
    .line 427
    move-object v0, v1

    .line 428
    check-cast v0, La/xl1;

    .line 429
    .line 430
    iget-wide v7, v0, La/xl1;->a:J

    .line 431
    .line 432
    iget-wide v9, v0, La/xl1;->b:J

    .line 433
    .line 434
    iget-object v11, v0, La/xl1;->c:Ljava/lang/String;

    .line 435
    .line 436
    iget-object v12, v0, La/xl1;->d:Ljava/lang/String;

    .line 437
    .line 438
    iget-short v6, v0, La/xl1;->e:S

    .line 439
    .line 440
    iget-boolean v15, v0, La/xl1;->h:Z

    .line 441
    .line 442
    sget-object v1, La/gz8;->a:La/gz8;

    .line 443
    .line 444
    iget-object v14, v0, La/xl1;->f:Ljava/util/List;

    .line 445
    .line 446
    iget-object v13, v0, La/xl1;->g:Ljava/lang/String;

    .line 447
    .line 448
    iget-boolean v0, v0, La/xl1;->i:Z

    .line 449
    .line 450
    move/from16 v16, v0

    .line 451
    .line 452
    invoke-direct/range {v5 .. v16}, La/uc0;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 453
    .line 454
    .line 455
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;

    .line 456
    .line 457
    invoke-direct {v0, v5}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;-><init>(La/uc0;)V

    .line 458
    .line 459
    .line 460
    return-object v0

    .line 461
    :cond_1a
    instance-of v0, v1, La/yl1;

    .line 462
    .line 463
    if-eqz v0, :cond_1b

    .line 464
    .line 465
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandInfoFragmentScreen;

    .line 466
    .line 467
    check-cast v1, La/yl1;

    .line 468
    .line 469
    iget-object v2, v1, La/yl1;->a:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v1, v1, La/yl1;->b:Ljava/lang/String;

    .line 472
    .line 473
    invoke-direct {v0, v2, v1, v4}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandInfoFragmentScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 474
    .line 475
    .line 476
    return-object v0

    .line 477
    :cond_1b
    instance-of v0, v1, La/wl1;

    .line 478
    .line 479
    if-eqz v0, :cond_1c

    .line 480
    .line 481
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AvailableGamesFragmentScreen;

    .line 482
    .line 483
    check-cast v1, La/wl1;

    .line 484
    .line 485
    iget v2, v1, La/wl1;->a:I

    .line 486
    .line 487
    iget-wide v3, v1, La/wl1;->b:J

    .line 488
    .line 489
    invoke-direct {v0, v2, v3, v4}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AvailableGamesFragmentScreen;-><init>(IJ)V

    .line 490
    .line 491
    .line 492
    return-object v0

    .line 493
    :cond_1c
    instance-of v0, v1, La/ul1;

    .line 494
    .line 495
    if-eqz v0, :cond_1d

    .line 496
    .line 497
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublishersFragmentScreen;

    .line 498
    .line 499
    move-object v0, v1

    .line 500
    check-cast v0, La/ul1;

    .line 501
    .line 502
    iget-wide v6, v0, La/ul1;->a:J

    .line 503
    .line 504
    iget v5, v0, La/ul1;->b:I

    .line 505
    .line 506
    iget-wide v8, v0, La/ul1;->c:J

    .line 507
    .line 508
    sget-object v0, La/rj1;->a:La/rj1;

    .line 509
    .line 510
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublishersFragmentScreen;-><init>(IJJ)V

    .line 511
    .line 512
    .line 513
    return-object v4

    .line 514
    :cond_1d
    instance-of v0, v1, La/gm1;

    .line 515
    .line 516
    if-eqz v0, :cond_1e

    .line 517
    .line 518
    const-string v0, "No screen for AggregatorScreenType.None"

    .line 519
    .line 520
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    return-object v3

    .line 524
    :cond_1e
    const-string v0, "No screen for unexpected type "

    .line 525
    .line 526
    invoke-static {v1, v0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    return-object v3
.end method

.method public x(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/zx6;

    .line 4
    .line 5
    iget-object v0, v0, La/zx6;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ehf0;->s(La/zje;)Ljava/io/Serializable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    return-object v0
.end method
