.class public final La/iqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x8

    iput-byte v0, p0, La/iqi;->a:B

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 106
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/csj;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/iqi;->a:B

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 122
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iqi;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, La/yip;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance p1, La/yip;

    .line 29
    .line 30
    const/16 p2, 0x1c

    .line 31
    .line 32
    invoke-direct {p1, p0, p2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance p1, La/yip;

    .line 44
    .line 45
    const/16 p2, 0x8

    .line 46
    .line 47
    invoke-direct {p1, p0, p2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, La/yip;

    .line 59
    .line 60
    const/4 p2, 0x4

    .line 61
    invoke-direct {p1, p0, p2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/hsj;La/knf0;)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 97
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/igl;La/y5s;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 75
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/jr0;La/j1q0;)V
    .locals 1

    const/16 v0, 0x1c

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 84
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/lhf0;La/j1q0;)V
    .locals 1

    const/16 v0, 0x1b

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 81
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/n4u;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/iqi;->a:B

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 112
    new-instance p1, La/ppi;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, La/ppi;-><init>(Ljava/lang/Object;B)V

    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    move-result-object p1

    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/neq;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, La/iqi;->a:B

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 103
    new-instance p1, La/sz2;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, La/sz2;-><init>(Ljava/lang/Object;B)V

    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/nhf0;La/j1q0;)V
    .locals 1

    const/16 v0, 0x15

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 87
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/nr;La/gst0;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 69
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/qq3;La/y5s;)V
    .locals 1

    const/16 v0, 0x11

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 72
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/r9u;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/iqi;->a:B

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 109
    new-instance p1, La/yxi;

    const/16 v0, 0xf

    invoke-direct {p1, p0, v0}, La/yxi;-><init>(Ljava/lang/Object;B)V

    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    move-result-object p1

    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rrd;La/gst0;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 94
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/s470;La/rkc0;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 78
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us00;La/cad;La/wti;)V
    .locals 0

    const/4 p1, 0x5

    iput-byte p1, p0, La/iqi;->a:B

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p2, p0, La/iqi;->c:Ljava/lang/Object;

    .line 100
    iput-object p3, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/v6j0;La/yk50;)V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, La/iqi;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 91
    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/16 v0, 0xe

    iput-byte v0, p0, La/iqi;->a:B

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 118
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 119
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/16 v0, 0xe

    iput-byte v0, p0, La/iqi;->a:B

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 115
    iput-object p1, p0, La/iqi;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 88
    iput-byte p3, p0, La/iqi;->a:B

    iput-object p1, p0, La/iqi;->c:Ljava/lang/Object;

    iput-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLa/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p3, La/lvt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/lvt;

    .line 7
    .line 8
    iget v1, v0, La/lvt;->l:I

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
    iput v1, v0, La/lvt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lvt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/lvt;-><init>(La/iqi;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/lvt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lvt;->l:I

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
    iget-wide p1, v0, La/lvt;->i:J

    .line 38
    .line 39
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/rrd;

    .line 55
    .line 56
    sget-object p3, La/tl5;->c:La/tl5;

    .line 57
    .line 58
    iput-wide p1, v0, La/lvt;->i:J

    .line 59
    .line 60
    iput v4, v0, La/lvt;->l:I

    .line 61
    .line 62
    invoke-virtual {p0, p3, v0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

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
    check-cast p3, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_5

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    move-object v0, p3

    .line 86
    check-cast v0, La/ql5;

    .line 87
    .line 88
    iget-wide v0, v0, La/ql5;->a:J

    .line 89
    .line 90
    cmp-long v0, v0, p1

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    move-object v3, p3

    .line 95
    :cond_5
    check-cast v3, La/ql5;

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    return-object v3

    .line 100
    :cond_6
    new-instance p0, La/ss3;

    .line 101
    .line 102
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p0
.end method

.method public varargs b([Ljava/lang/Object;)La/fuo;
    .locals 3

    .line 1
    iget-object v0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La/iqi;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :goto_0
    move-object p0, v2

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :try_start_1
    iget-object v1, p0, La/iqi;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/csj;

    .line 25
    .line 26
    invoke-virtual {v1}, La/csj;->a()Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    monitor-exit v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception p0

    .line 33
    new-instance p1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    const-string v1, "Error instantiating extension"

    .line 36
    .line 37
    invoke-direct {p1, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :catch_1
    iget-object p0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    if-nez p0, :cond_1

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/fuo;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 59
    .line 60
    return-object p0

    .line 61
    :catch_2
    move-exception p0

    .line 62
    const-string p1, "Unexpected error creating extractor"

    .line 63
    .line 64
    invoke-static {p1, p0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    throw p0
.end method

.method public c(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, La/iqi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    instance-of v3, v0, La/svo;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, La/svo;

    .line 15
    .line 16
    iget v4, v3, La/svo;->s:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/svo;->s:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/svo;

    .line 29
    .line 30
    invoke-direct {v3, v1, v0}, La/svo;-><init>(La/iqi;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v3, La/svo;->q:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/svo;->s:I

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v10, 0x1

    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    if-eq v5, v10, :cond_3

    .line 45
    .line 46
    if-eq v5, v7, :cond_2

    .line 47
    .line 48
    if-ne v5, v6, :cond_1

    .line 49
    .line 50
    iget v5, v3, La/svo;->p:I

    .line 51
    .line 52
    iget v11, v3, La/svo;->o:I

    .line 53
    .line 54
    iget-boolean v12, v3, La/svo;->l:Z

    .line 55
    .line 56
    iget-wide v13, v3, La/svo;->n:J

    .line 57
    .line 58
    const/16 p1, 0x0

    .line 59
    .line 60
    iget-wide v8, v3, La/svo;->m:J

    .line 61
    .line 62
    iget-boolean v15, v3, La/svo;->k:Z

    .line 63
    .line 64
    iget-object v6, v3, La/svo;->j:Ljava/lang/Throwable;

    .line 65
    .line 66
    iget-object v7, v3, La/svo;->i:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v7

    .line 72
    move-object v7, v3

    .line 73
    move-object v3, v0

    .line 74
    move v0, v5

    .line 75
    move v5, v15

    .line 76
    const/4 v10, 0x3

    .line 77
    move-wide/from16 v16, v8

    .line 78
    .line 79
    move-object v9, v6

    .line 80
    move v8, v11

    .line 81
    move v6, v12

    .line 82
    move-wide v11, v13

    .line 83
    move-wide/from16 v13, v16

    .line 84
    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_1
    const/16 p1, 0x0

    .line 88
    .line 89
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_2
    const/16 p1, 0x0

    .line 96
    .line 97
    iget v5, v3, La/svo;->p:I

    .line 98
    .line 99
    iget v6, v3, La/svo;->o:I

    .line 100
    .line 101
    iget-boolean v7, v3, La/svo;->l:Z

    .line 102
    .line 103
    iget-wide v8, v3, La/svo;->n:J

    .line 104
    .line 105
    iget-wide v11, v3, La/svo;->m:J

    .line 106
    .line 107
    iget-boolean v13, v3, La/svo;->k:Z

    .line 108
    .line 109
    iget-object v14, v3, La/svo;->j:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v3, La/svo;->i:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move v0, v5

    .line 117
    move v5, v13

    .line 118
    const/4 v10, 0x2

    .line 119
    move/from16 v16, v7

    .line 120
    .line 121
    move-object v7, v3

    .line 122
    move-object v3, v15

    .line 123
    move-wide/from16 v17, v8

    .line 124
    .line 125
    move v8, v6

    .line 126
    move/from16 v6, v16

    .line 127
    .line 128
    move-object v9, v14

    .line 129
    move-wide v13, v11

    .line 130
    move-wide/from16 v11, v17

    .line 131
    .line 132
    goto/16 :goto_7

    .line 133
    .line 134
    :cond_3
    const/16 p1, 0x0

    .line 135
    .line 136
    iget v5, v3, La/svo;->o:I

    .line 137
    .line 138
    iget-boolean v6, v3, La/svo;->l:Z

    .line 139
    .line 140
    iget-wide v7, v3, La/svo;->n:J

    .line 141
    .line 142
    iget-wide v11, v3, La/svo;->m:J

    .line 143
    .line 144
    iget-boolean v9, v3, La/svo;->k:Z

    .line 145
    .line 146
    iget-object v13, v3, La/svo;->j:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v3, La/svo;->i:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move-wide/from16 v16, v7

    .line 157
    .line 158
    move-object v7, v3

    .line 159
    move v8, v5

    .line 160
    move v5, v9

    .line 161
    move-object v9, v13

    .line 162
    move-object v3, v14

    .line 163
    move-wide v13, v11

    .line 164
    move-wide/from16 v11, v16

    .line 165
    .line 166
    goto/16 :goto_4

    .line 167
    .line 168
    :cond_4
    const/16 p1, 0x0

    .line 169
    .line 170
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    sget-wide v5, La/cag0;->a:J

    .line 174
    .line 175
    const-wide/16 v7, 0x3

    .line 176
    .line 177
    move-object/from16 v9, p1

    .line 178
    .line 179
    move-wide v11, v5

    .line 180
    move-wide v13, v7

    .line 181
    move v0, v10

    .line 182
    const/4 v8, 0x0

    .line 183
    move/from16 v5, p3

    .line 184
    .line 185
    move v6, v5

    .line 186
    move-object v7, v3

    .line 187
    move-object/from16 v3, p2

    .line 188
    .line 189
    :goto_1
    if-eqz v0, :cond_10

    .line 190
    .line 191
    :try_start_1
    iget-object v15, v1, La/iqi;->c:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v15, La/hsj;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 194
    .line 195
    :try_start_2
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v2}, La/knf0;->b()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-static {v1, v3, v10}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v3, v7, La/svo;->i:Ljava/lang/String;

    .line 208
    .line 209
    iput-object v9, v7, La/svo;->j:Ljava/lang/Throwable;

    .line 210
    .line 211
    iput-boolean v5, v7, La/svo;->k:Z

    .line 212
    .line 213
    iput-wide v13, v7, La/svo;->m:J

    .line 214
    .line 215
    iput-wide v11, v7, La/svo;->n:J

    .line 216
    .line 217
    iput-boolean v6, v7, La/svo;->l:Z

    .line 218
    .line 219
    iput v8, v7, La/svo;->o:I

    .line 220
    .line 221
    iput v0, v7, La/svo;->p:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 222
    .line 223
    const/4 v10, 0x1

    .line 224
    :try_start_3
    iput v10, v7, La/svo;->s:I

    .line 225
    .line 226
    iget-object v0, v15, La/hsj;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, La/ntl;

    .line 229
    .line 230
    invoke-virtual {v0}, La/ntl;->invoke()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/nvo;

    .line 235
    .line 236
    const-string v15, "application/vnd.xenvelop+json"

    .line 237
    .line 238
    invoke-interface {v0, v15, v1, v7}, La/nvo;->a(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 242
    if-ne v0, v4, :cond_5

    .line 243
    .line 244
    goto/16 :goto_a

    .line 245
    .line 246
    :cond_5
    move-wide/from16 v16, v13

    .line 247
    .line 248
    move-object v14, v3

    .line 249
    move-object v3, v7

    .line 250
    move-object v13, v9

    .line 251
    move v9, v5

    .line 252
    move v5, v8

    .line 253
    move-wide v7, v11

    .line 254
    move-wide/from16 v11, v16

    .line 255
    .line 256
    :goto_2
    :try_start_4
    check-cast v0, La/dx5;

    .line 257
    .line 258
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, La/rvo;

    .line 263
    .line 264
    new-instance v1, La/kvo;

    .line 265
    .line 266
    iget-object v15, v0, La/rvo;->b:Ljava/lang/Integer;

    .line 267
    .line 268
    if-eqz v15, :cond_6

    .line 269
    .line 270
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    goto :goto_3

    .line 275
    :cond_6
    const/4 v15, 0x0

    .line 276
    :goto_3
    iget-object v0, v0, La/rvo;->a:Ljava/util/List;

    .line 277
    .line 278
    if-nez v0, :cond_7

    .line 279
    .line 280
    sget-object v0, La/iun;->a:La/iun;

    .line 281
    .line 282
    :cond_7
    invoke-direct {v1, v15, v0}, La/kvo;-><init>(ILjava/util/List;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 283
    .line 284
    .line 285
    return-object v1

    .line 286
    :catchall_1
    move-exception v0

    .line 287
    goto :goto_4

    .line 288
    :catchall_2
    move-exception v0

    .line 289
    const/4 v10, 0x1

    .line 290
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_c

    .line 295
    .line 296
    if-nez v6, :cond_8

    .line 297
    .line 298
    new-instance v9, La/el50;

    .line 299
    .line 300
    invoke-direct {v9, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    const/4 v0, 0x0

    .line 304
    :goto_5
    move-object/from16 v1, p0

    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_8
    move-wide/from16 p2, v11

    .line 308
    .line 309
    int-to-long v10, v8

    .line 310
    cmp-long v1, v10, v13

    .line 311
    .line 312
    if-gez v1, :cond_9

    .line 313
    .line 314
    const/4 v1, 0x1

    .line 315
    goto :goto_6

    .line 316
    :cond_9
    const/4 v1, 0x0

    .line 317
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 318
    .line 319
    if-eqz v1, :cond_b

    .line 320
    .line 321
    iput-object v3, v7, La/svo;->i:Ljava/lang/String;

    .line 322
    .line 323
    iput-object v9, v7, La/svo;->j:Ljava/lang/Throwable;

    .line 324
    .line 325
    iput-boolean v5, v7, La/svo;->k:Z

    .line 326
    .line 327
    iput-wide v13, v7, La/svo;->m:J

    .line 328
    .line 329
    move-wide/from16 v11, p2

    .line 330
    .line 331
    iput-wide v11, v7, La/svo;->n:J

    .line 332
    .line 333
    iput-boolean v6, v7, La/svo;->l:Z

    .line 334
    .line 335
    iput v8, v7, La/svo;->o:I

    .line 336
    .line 337
    iput v1, v7, La/svo;->p:I

    .line 338
    .line 339
    const/4 v10, 0x2

    .line 340
    iput v10, v7, La/svo;->s:I

    .line 341
    .line 342
    invoke-static {v11, v12, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-ne v0, v4, :cond_a

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_a
    move v0, v1

    .line 350
    :goto_7
    move-object/from16 v1, p0

    .line 351
    .line 352
    const/4 v10, 0x1

    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :cond_b
    move-wide/from16 v11, p2

    .line 356
    .line 357
    const/4 v10, 0x2

    .line 358
    new-instance v9, La/el50;

    .line 359
    .line 360
    invoke-direct {v9, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    :goto_8
    move v0, v1

    .line 364
    const/4 v10, 0x1

    .line 365
    goto :goto_5

    .line 366
    :cond_c
    const/4 v10, 0x2

    .line 367
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_f

    .line 372
    .line 373
    move-wide/from16 p2, v11

    .line 374
    .line 375
    int-to-long v10, v8

    .line 376
    cmp-long v1, v10, v13

    .line 377
    .line 378
    if-gez v1, :cond_d

    .line 379
    .line 380
    const/4 v1, 0x1

    .line 381
    goto :goto_9

    .line 382
    :cond_d
    const/4 v1, 0x0

    .line 383
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 384
    .line 385
    if-eqz v1, :cond_e

    .line 386
    .line 387
    iput-object v3, v7, La/svo;->i:Ljava/lang/String;

    .line 388
    .line 389
    iput-object v9, v7, La/svo;->j:Ljava/lang/Throwable;

    .line 390
    .line 391
    iput-boolean v5, v7, La/svo;->k:Z

    .line 392
    .line 393
    iput-wide v13, v7, La/svo;->m:J

    .line 394
    .line 395
    move-wide/from16 v11, p2

    .line 396
    .line 397
    iput-wide v11, v7, La/svo;->n:J

    .line 398
    .line 399
    iput-boolean v6, v7, La/svo;->l:Z

    .line 400
    .line 401
    iput v8, v7, La/svo;->o:I

    .line 402
    .line 403
    iput v1, v7, La/svo;->p:I

    .line 404
    .line 405
    const/4 v10, 0x3

    .line 406
    iput v10, v7, La/svo;->s:I

    .line 407
    .line 408
    invoke-static {v11, v12, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    if-ne v0, v4, :cond_a

    .line 413
    .line 414
    :goto_a
    return-object v4

    .line 415
    :cond_e
    move-wide/from16 v11, p2

    .line 416
    .line 417
    const/4 v10, 0x3

    .line 418
    new-instance v9, La/dag0;

    .line 419
    .line 420
    invoke-direct {v9, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_f
    const/4 v10, 0x3

    .line 425
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 426
    .line 427
    .line 428
    move-object/from16 v1, p0

    .line 429
    .line 430
    move-object v9, v0

    .line 431
    const/4 v10, 0x1

    .line 432
    const/4 v0, 0x0

    .line 433
    goto/16 :goto_1

    .line 434
    .line 435
    :cond_10
    if-nez v9, :cond_11

    .line 436
    .line 437
    const-string v0, "Unexpected error"

    .line 438
    .line 439
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    return-object p1

    .line 443
    :cond_11
    throw v9
.end method

.method public d(ILa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/u4u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/u4u;

    .line 7
    .line 8
    iget v1, v0, La/u4u;->l:I

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
    iput v1, v0, La/u4u;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u4u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/u4u;-><init>(La/iqi;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/u4u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u4u;->l:I

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
    iget-object p0, v0, La/u4u;->i:La/iqi;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/iqi;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, La/w5z;

    .line 55
    .line 56
    iput-object p0, v0, La/u4u;->i:La/iqi;

    .line 57
    .line 58
    iput v3, v0, La/u4u;->l:I

    .line 59
    .line 60
    invoke-virtual {p2, p1, v0}, La/w5z;->v(ILa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 68
    .line 69
    iget-object p0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/esg0;

    .line 72
    .line 73
    iget-object p0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/t52;

    .line 76
    .line 77
    iget-object p0, p0, La/t52;->a:La/p7m0;

    .line 78
    .line 79
    new-instance p1, La/ewt;

    .line 80
    .line 81
    const/4 v0, 0x2

    .line 82
    invoke-direct {p1, p0, p2, v0}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    return-object p1
.end method

.method public e(JJLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, La/y2u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/y2u;

    .line 7
    .line 8
    iget v1, v0, La/y2u;->k:I

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
    iput v1, v0, La/y2u;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/y2u;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/y2u;-><init>(La/iqi;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, La/y2u;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/y2u;->k:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
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
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p5, p0, La/iqi;->c:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v1, p5

    .line 55
    check-cast v1, La/a3u;

    .line 56
    .line 57
    iput v2, v6, La/y2u;->k:I

    .line 58
    .line 59
    move-wide v2, p1

    .line 60
    move-wide v4, p3

    .line 61
    invoke-virtual/range {v1 .. v6}, La/a3u;->b(JJLa/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    if-ne p5, v0, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    :goto_2
    check-cast p5, Ljava/lang/String;

    .line 69
    .line 70
    iget-object p0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/ntu;

    .line 73
    .line 74
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const/4 p1, 0x0

    .line 79
    invoke-static {p5, p0, p1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    return-object p5

    .line 86
    :cond_4
    invoke-virtual {p0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

.method public f(La/bm5;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/rrd;

    .line 4
    .line 5
    instance-of v1, p2, La/mvt;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/mvt;

    .line 11
    .line 12
    iget v2, v1, La/mvt;->l:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/mvt;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/mvt;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, La/mvt;-><init>(La/iqi;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v1, La/mvt;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/mvt;->l:I

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eq v3, v5, :cond_2

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p2

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v6

    .line 54
    :cond_2
    iget-object p1, v1, La/mvt;->i:La/bm5;

    .line 55
    .line 56
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, La/rrd;->p(La/bm5;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    new-instance p2, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-direct {p2, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    const-wide/16 v9, 0x0

    .line 78
    .line 79
    cmp-long v3, v7, v9

    .line 80
    .line 81
    if-lez v3, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move-object p2, v6

    .line 85
    :goto_1
    if-eqz p2, :cond_e

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    iget-object p2, v0, La/rrd;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p2, La/tg5;

    .line 94
    .line 95
    invoke-virtual {p2}, La/tg5;->a()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_6

    .line 113
    .line 114
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    move-object v9, v3

    .line 119
    check-cast v9, La/ql5;

    .line 120
    .line 121
    iget-object v9, v9, La/ql5;->i:La/txs0;

    .line 122
    .line 123
    sget-object v10, La/txs0;->b:La/txs0;

    .line 124
    .line 125
    if-eq v9, v10, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    move-object v3, v0

    .line 146
    check-cast v3, La/ql5;

    .line 147
    .line 148
    iget-wide v9, v3, La/ql5;->a:J

    .line 149
    .line 150
    cmp-long v3, v9, v7

    .line 151
    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_8
    move-object v0, v6

    .line 156
    :goto_3
    check-cast v0, La/ql5;

    .line 157
    .line 158
    if-eqz v0, :cond_e

    .line 159
    .line 160
    iget-object p2, v0, La/ql5;->i:La/txs0;

    .line 161
    .line 162
    invoke-virtual {p2}, La/txs0;->a()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_a

    .line 167
    .line 168
    iget-boolean p2, v0, La/ql5;->l:Z

    .line 169
    .line 170
    if-eqz p2, :cond_9

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    move-object v0, v6

    .line 174
    :cond_a
    :goto_4
    if-eqz v0, :cond_e

    .line 175
    .line 176
    iget-object p2, v0, La/ql5;->i:La/txs0;

    .line 177
    .line 178
    invoke-virtual {p2}, La/txs0;->a()Z

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    if-eqz p2, :cond_d

    .line 183
    .line 184
    sget-object p2, La/bm5;->m:La/bm5;

    .line 185
    .line 186
    if-eq p1, p2, :cond_b

    .line 187
    .line 188
    sget-object p2, La/bm5;->k:La/bm5;

    .line 189
    .line 190
    if-ne p1, p2, :cond_d

    .line 191
    .line 192
    :cond_b
    iput-object p1, v1, La/mvt;->i:La/bm5;

    .line 193
    .line 194
    iput v5, v1, La/mvt;->l:I

    .line 195
    .line 196
    iget-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p2, La/gst0;

    .line 199
    .line 200
    iget-object p2, p2, La/gst0;->a:La/rrt0;

    .line 201
    .line 202
    invoke-virtual {p2}, La/rrt0;->a()La/krt0;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iget-wide v7, p2, La/krt0;->a:J

    .line 207
    .line 208
    invoke-virtual {p0, v7, v8, v1}, La/iqi;->a(JLa/zje;)Ljava/io/Serializable;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    if-ne p2, v2, :cond_c

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_c
    :goto_5
    move-object v0, p2

    .line 216
    check-cast v0, La/ql5;

    .line 217
    .line 218
    :cond_d
    if-eqz v0, :cond_e

    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_e
    iput-object v6, v1, La/mvt;->i:La/bm5;

    .line 222
    .line 223
    iput v4, v1, La/mvt;->l:I

    .line 224
    .line 225
    invoke-virtual {p0, p1, v1}, La/iqi;->m(La/bm5;La/zje;)Ljava/io/Serializable;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    if-ne p0, v2, :cond_f

    .line 230
    .line 231
    :goto_6
    return-object v2

    .line 232
    :cond_f
    return-object p0
.end method

.method public g(La/zje;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/iqi;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/iqi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/iqi;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/high16 v6, -0x80000000

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v2, v1, La/s8u;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/s8u;

    .line 26
    .line 27
    iget v9, v2, La/s8u;->k:I

    .line 28
    .line 29
    and-int v10, v9, v6

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v6

    .line 34
    iput v9, v2, La/s8u;->k:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/s8u;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/s8u;-><init>(La/iqi;La/zje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v0, v2, La/s8u;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v1, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v6, v2, La/s8u;->k:I

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    if-ne v6, v7, :cond_1

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_2

    .line 58
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 67
    .line 68
    check-cast v4, La/lhf0;

    .line 69
    .line 70
    check-cast v3, La/j1q0;

    .line 71
    .line 72
    iget-object v0, v3, La/j1q0;->a:La/m1q0;

    .line 73
    .line 74
    invoke-virtual {v0}, La/m1q0;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v7, v2, La/s8u;->k:I

    .line 79
    .line 80
    invoke-virtual {v4, v0, v2}, La/lhf0;->e(ZLa/zje;)Ljava/io/Serializable;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v1, :cond_3

    .line 85
    .line 86
    move-object v8, v1

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 89
    .line 90
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :goto_2
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 94
    .line 95
    new-instance v1, La/g0g0;

    .line 96
    .line 97
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v0, v1

    .line 101
    :goto_3
    nop

    .line 102
    instance-of v1, v0, La/g0g0;

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    move-object v0, v8

    .line 107
    :cond_4
    check-cast v0, Ljava/util/List;

    .line 108
    .line 109
    if-nez v0, :cond_5

    .line 110
    .line 111
    sget-object v0, La/iun;->a:La/iun;

    .line 112
    .line 113
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object v2, v1

    .line 128
    check-cast v2, La/vh0;

    .line 129
    .line 130
    iget-wide v2, v2, La/vh0;->a:J

    .line 131
    .line 132
    const-wide/16 v4, 0xaf

    .line 133
    .line 134
    cmp-long v2, v2, v4

    .line 135
    .line 136
    if-nez v2, :cond_6

    .line 137
    .line 138
    move-object v8, v1

    .line 139
    :cond_7
    check-cast v8, La/vh0;

    .line 140
    .line 141
    if-nez v8, :cond_8

    .line 142
    .line 143
    new-instance v9, La/vh0;

    .line 144
    .line 145
    sget-object v25, La/iun;->a:La/iun;

    .line 146
    .line 147
    const/16 v27, 0x0

    .line 148
    .line 149
    const-wide/16 v10, 0x0

    .line 150
    .line 151
    const-string v12, ""

    .line 152
    .line 153
    const-string v13, ""

    .line 154
    .line 155
    const-string v14, ""

    .line 156
    .line 157
    const/4 v15, 0x0

    .line 158
    const-wide/16 v16, 0x0

    .line 159
    .line 160
    const-wide/16 v18, 0x0

    .line 161
    .line 162
    const-wide/16 v20, 0x0

    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    const/16 v23, 0x0

    .line 167
    .line 168
    const-string v24, ""

    .line 169
    .line 170
    move-object/from16 v26, v25

    .line 171
    .line 172
    invoke-direct/range {v9 .. v27}, La/vh0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    .line 173
    .line 174
    .line 175
    move-object v8, v9

    .line 176
    :cond_8
    invoke-static {v8}, La/vh0;->a(La/vh0;)La/vh0;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    :goto_4
    return-object v8

    .line 181
    :pswitch_0
    instance-of v2, v1, La/wzt;

    .line 182
    .line 183
    if-eqz v2, :cond_9

    .line 184
    .line 185
    move-object v2, v1

    .line 186
    check-cast v2, La/wzt;

    .line 187
    .line 188
    iget v9, v2, La/wzt;->l:I

    .line 189
    .line 190
    and-int v10, v9, v6

    .line 191
    .line 192
    if-eqz v10, :cond_9

    .line 193
    .line 194
    sub-int/2addr v9, v6

    .line 195
    iput v9, v2, La/wzt;->l:I

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_9
    new-instance v2, La/wzt;

    .line 199
    .line 200
    invoke-direct {v2, v0, v1}, La/wzt;-><init>(La/iqi;La/zje;)V

    .line 201
    .line 202
    .line 203
    :goto_5
    iget-object v0, v2, La/wzt;->j:Ljava/lang/Object;

    .line 204
    .line 205
    sget-object v1, La/wne;->a:La/wne;

    .line 206
    .line 207
    iget v6, v2, La/wzt;->l:I

    .line 208
    .line 209
    const/4 v9, 0x2

    .line 210
    if-eqz v6, :cond_c

    .line 211
    .line 212
    if-eq v6, v7, :cond_b

    .line 213
    .line 214
    if-ne v6, v9, :cond_a

    .line 215
    .line 216
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object v8, v0

    .line 220
    goto :goto_8

    .line 221
    :cond_a
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_b
    iget-object v3, v2, La/wzt;->i:La/rpt;

    .line 226
    .line 227
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_c
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    move-object v0, v4

    .line 235
    check-cast v0, La/rpt;

    .line 236
    .line 237
    check-cast v3, La/x0u;

    .line 238
    .line 239
    iput-object v0, v2, La/wzt;->i:La/rpt;

    .line 240
    .line 241
    iput v7, v2, La/wzt;->l:I

    .line 242
    .line 243
    invoke-virtual {v3, v2}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    if-ne v3, v1, :cond_d

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_d
    move-object/from16 v28, v3

    .line 251
    .line 252
    move-object v3, v0

    .line 253
    move-object/from16 v0, v28

    .line 254
    .line 255
    :goto_6
    check-cast v0, Ljava/lang/Number;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    iput-object v8, v2, La/wzt;->i:La/rpt;

    .line 262
    .line 263
    iput v9, v2, La/wzt;->l:I

    .line 264
    .line 265
    iget-object v3, v3, La/rpt;->a:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, La/nr;

    .line 268
    .line 269
    iget-object v4, v3, La/nr;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v4, La/mne;

    .line 272
    .line 273
    iget-object v4, v4, La/mne;->b:La/dvj;

    .line 274
    .line 275
    new-instance v5, La/u52;

    .line 276
    .line 277
    const/16 v6, 0xb

    .line 278
    .line 279
    invoke-direct {v5, v3, v0, v8, v6}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 280
    .line 281
    .line 282
    invoke-static {v4, v5, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    if-ne v8, v1, :cond_e

    .line 287
    .line 288
    :goto_7
    move-object v8, v1

    .line 289
    :cond_e
    :goto_8
    return-object v8

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public h(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, La/iqi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, v2

    .line 8
    check-cast v4, La/nhf0;

    .line 9
    .line 10
    iget-object v2, v4, La/nhf0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, La/mne;

    .line 13
    .line 14
    instance-of v3, v0, La/ayt;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, La/ayt;

    .line 20
    .line 21
    iget v5, v3, La/ayt;->n:I

    .line 22
    .line 23
    const/high16 v6, -0x80000000

    .line 24
    .line 25
    and-int v7, v5, v6

    .line 26
    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    sub-int/2addr v5, v6

    .line 30
    iput v5, v3, La/ayt;->n:I

    .line 31
    .line 32
    :goto_0
    move-object v11, v3

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v3, La/ayt;

    .line 35
    .line 36
    invoke-direct {v3, v1, v0}, La/ayt;-><init>(La/iqi;La/zje;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v0, v11, La/ayt;->l:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object v13, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v3, v11, La/ayt;->n:I

    .line 45
    .line 46
    const/4 v6, 0x4

    .line 47
    const/4 v9, 0x3

    .line 48
    const/4 v5, 0x2

    .line 49
    const/4 v10, 0x1

    .line 50
    const/4 v7, 0x0

    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    if-eq v3, v10, :cond_4

    .line 54
    .line 55
    if-eq v3, v5, :cond_3

    .line 56
    .line 57
    if-eq v3, v9, :cond_2

    .line 58
    .line 59
    if-ne v3, v6, :cond_1

    .line 60
    .line 61
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast v0, La/j0g0;

    .line 65
    .line 66
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    goto/16 :goto_a

    .line 69
    .line 70
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    return-object v0

    .line 77
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :cond_3
    iget-boolean v1, v11, La/ayt;->j:Z

    .line 83
    .line 84
    iget-boolean v3, v11, La/ayt;->i:Z

    .line 85
    .line 86
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_4
    iget-boolean v3, v11, La/ayt;->j:Z

    .line 95
    .line 96
    iget-boolean v8, v11, La/ayt;->i:Z

    .line 97
    .line 98
    iget-object v12, v11, La/ayt;->k:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v15, v12

    .line 104
    move v12, v3

    .line 105
    move-object v3, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v1, La/iqi;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/j1q0;

    .line 113
    .line 114
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 115
    .line 116
    invoke-virtual {v0}, La/m1q0;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_c

    .line 121
    .line 122
    move-object/from16 v3, p2

    .line 123
    .line 124
    iput-object v3, v11, La/ayt;->k:Ljava/lang/String;

    .line 125
    .line 126
    move/from16 v8, p3

    .line 127
    .line 128
    iput-boolean v8, v11, La/ayt;->i:Z

    .line 129
    .line 130
    iput-boolean v0, v11, La/ayt;->j:Z

    .line 131
    .line 132
    iput v10, v11, La/ayt;->n:I

    .line 133
    .line 134
    iget-object v12, v2, La/mne;->b:La/dvj;

    .line 135
    .line 136
    new-instance v14, La/czb;

    .line 137
    .line 138
    invoke-direct {v14, v4, v7, v5}, La/czb;-><init>(La/nhf0;La/yje;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v12, v14, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    if-ne v12, v13, :cond_6

    .line 146
    .line 147
    goto/16 :goto_9

    .line 148
    .line 149
    :cond_6
    move-object v15, v12

    .line 150
    move v12, v0

    .line 151
    move-object v0, v15

    .line 152
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 161
    .line 162
    iput-object v7, v11, La/ayt;->k:Ljava/lang/String;

    .line 163
    .line 164
    iput-boolean v8, v11, La/ayt;->i:Z

    .line 165
    .line 166
    iput-boolean v12, v11, La/ayt;->j:Z

    .line 167
    .line 168
    iput v5, v11, La/ayt;->n:I

    .line 169
    .line 170
    iget-object v0, v2, La/mne;->b:La/dvj;

    .line 171
    .line 172
    move-object v6, v3

    .line 173
    new-instance v3, La/xj1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 174
    .line 175
    move v5, v8

    .line 176
    const/4 v8, 0x4

    .line 177
    :try_start_2
    invoke-direct/range {v3 .. v8}, La/xj1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0, v3, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 184
    if-ne v0, v13, :cond_7

    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_7
    move v3, v5

    .line 188
    move v1, v12

    .line 189
    :goto_3
    :try_start_3
    check-cast v0, La/bzb;

    .line 190
    .line 191
    sget-object v5, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    :goto_4
    move v3, v5

    .line 196
    move v1, v12

    .line 197
    goto :goto_5

    .line 198
    :catchall_2
    move-exception v0

    .line 199
    move v5, v8

    .line 200
    goto :goto_4

    .line 201
    :goto_5
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 202
    .line 203
    new-instance v5, La/g0g0;

    .line 204
    .line 205
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    move-object v0, v5

    .line 209
    :goto_6
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    if-nez v5, :cond_8

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_8
    iput-object v7, v11, La/ayt;->k:Ljava/lang/String;

    .line 217
    .line 218
    iput-boolean v3, v11, La/ayt;->i:Z

    .line 219
    .line 220
    iput-boolean v1, v11, La/ayt;->j:Z

    .line 221
    .line 222
    iput v9, v11, La/ayt;->n:I

    .line 223
    .line 224
    iget-object v0, v2, La/mne;->b:La/dvj;

    .line 225
    .line 226
    new-instance v1, La/czb;

    .line 227
    .line 228
    invoke-direct {v1, v4, v7, v10}, La/czb;-><init>(La/nhf0;La/yje;B)V

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1, v11}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-ne v0, v13, :cond_9

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_9
    :goto_7
    check-cast v0, La/bzb;

    .line 239
    .line 240
    :goto_8
    check-cast v0, La/bzb;

    .line 241
    .line 242
    return-object v0

    .line 243
    :cond_a
    move v5, v8

    .line 244
    new-instance v0, La/ni2;

    .line 245
    .line 246
    move v2, v5

    .line 247
    const/4 v5, 0x1

    .line 248
    move-object v4, v7

    .line 249
    invoke-direct/range {v0 .. v5}, La/ni2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 250
    .line 251
    .line 252
    move v5, v2

    .line 253
    iput-object v7, v11, La/ayt;->k:Ljava/lang/String;

    .line 254
    .line 255
    iput-boolean v5, v11, La/ayt;->i:Z

    .line 256
    .line 257
    iput-boolean v12, v11, La/ayt;->j:Z

    .line 258
    .line 259
    iput v6, v11, La/ayt;->n:I

    .line 260
    .line 261
    const-string v5, "getCheckBlock"

    .line 262
    .line 263
    const-wide/16 v6, 0x5

    .line 264
    .line 265
    const-wide/16 v8, 0x0

    .line 266
    .line 267
    const/16 v12, 0xc

    .line 268
    .line 269
    move-object v10, v0

    .line 270
    invoke-static/range {v5 .. v12}, La/j0x;->I(Ljava/lang/String;JJLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-ne v0, v13, :cond_b

    .line 275
    .line 276
    :goto_9
    return-object v13

    .line 277
    :cond_b
    :goto_a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    check-cast v0, La/bzb;

    .line 281
    .line 282
    return-object v0

    .line 283
    :cond_c
    new-instance v0, La/bzb;

    .line 284
    .line 285
    invoke-direct {v0, v10, v10}, La/bzb;-><init>(ZZ)V

    .line 286
    .line 287
    .line 288
    return-object v0
.end method

.method public i(La/hqn;La/ynb0;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/tqn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/tqn;

    .line 7
    .line 8
    iget v1, v0, La/tqn;->n:I

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
    iput v1, v0, La/tqn;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tqn;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/tqn;-><init>(La/iqi;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/tqn;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tqn;->n:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p3

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
    iget-object p2, v0, La/tqn;->k:La/ynb0;

    .line 51
    .line 52
    iget-object p1, v0, La/tqn;->j:La/hqn;

    .line 53
    .line 54
    iget-object p0, v0, La/tqn;->i:La/ftb;

    .line 55
    .line 56
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p3, p0, La/iqi;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p3, La/ftb;

    .line 66
    .line 67
    iget-object p0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/rou;

    .line 70
    .line 71
    iput-object p3, v0, La/tqn;->i:La/ftb;

    .line 72
    .line 73
    iput-object p1, v0, La/tqn;->j:La/hqn;

    .line 74
    .line 75
    iput-object p2, v0, La/tqn;->k:La/ynb0;

    .line 76
    .line 77
    iput v4, v0, La/tqn;->n:I

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-virtual {p0, v2, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-ne p0, v1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v6, p3

    .line 88
    move-object p3, p0

    .line 89
    move-object p0, v6

    .line 90
    :goto_1
    check-cast p3, La/m2c0;

    .line 91
    .line 92
    iput-object v5, v0, La/tqn;->i:La/ftb;

    .line 93
    .line 94
    iput-object v5, v0, La/tqn;->j:La/hqn;

    .line 95
    .line 96
    iput-object v5, v0, La/tqn;->k:La/ynb0;

    .line 97
    .line 98
    iput v3, v0, La/tqn;->n:I

    .line 99
    .line 100
    iget-object p0, p0, La/ftb;->a:La/khf0;

    .line 101
    .line 102
    invoke-virtual {p0, p1, p2, p3, v0}, La/khf0;->o(La/hqn;La/ynb0;La/m2c0;La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    return-object p0
.end method

.method public j()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xr;

    .line 4
    .line 5
    invoke-virtual {v0}, La/xr;->i()La/rl40;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/rl40;->b:La/rl40;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/jru;

    .line 16
    .line 17
    iget-object p0, p0, La/jru;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/dbv;

    .line 20
    .line 21
    iget-object p0, p0, La/dbv;->a:La/us00;

    .line 22
    .line 23
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "string"

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "gcm_defaultSenderId"

    .line 34
    .line 35
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    const-string p0, ""

    .line 48
    .line 49
    return-object p0
.end method

.method public k()Z
    .locals 4

    .line 1
    iget-object v0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j9c;

    .line 4
    .line 5
    invoke-virtual {v0}, La/j9c;->c()La/cit0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/tzf;

    .line 10
    .line 11
    iget-boolean v2, v0, La/cit0;->H:Z

    .line 12
    .line 13
    iget-boolean v0, v0, La/cit0;->I:Z

    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, La/tzf;-><init>(ZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/khf0;

    .line 21
    .line 22
    iget-object p0, p0, La/khf0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/lye;

    .line 25
    .line 26
    iget-object v3, p0, La/lye;->c:La/tzf;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, La/lye;->c:La/tzf;

    .line 32
    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-boolean p0, v3, La/tzf;->a:Z

    .line 37
    .line 38
    if-ne p0, v2, :cond_2

    .line 39
    .line 40
    iget-boolean p0, v3, La/tzf;->b:Z

    .line 41
    .line 42
    if-eq p0, v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 2

    .line 1
    iget-object v0, p0, La/iqi;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/hie0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 9
    .line 10
    const/16 p2, 0x8

    .line 11
    .line 12
    invoke-virtual {p1, p2}, La/uiv0;->u(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p1, p2}, La/uiv0;->i(I)La/pfx;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget p1, p1, La/pfx;->d:I

    .line 21
    .line 22
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 25
    .line 26
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    :goto_0
    if-eqz p0, :cond_1

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    iget-boolean p1, v0, La/hie0;->a:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 47
    .line 48
    .line 49
    :cond_1
    iput-boolean v1, v0, La/hie0;->a:Z

    .line 50
    .line 51
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 52
    .line 53
    return-object p0
.end method

.method public m(La/bm5;La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, La/nvt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nvt;

    .line 7
    .line 8
    iget v1, v0, La/nvt;->l:I

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
    iput v1, v0, La/nvt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nvt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/nvt;-><init>(La/iqi;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nvt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nvt;->l:I

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
    iget-object p1, v0, La/nvt;->i:La/bm5;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/nvt;->i:La/bm5;

    .line 53
    .line 54
    iput v3, v0, La/nvt;->l:I

    .line 55
    .line 56
    iget-object p2, p0, La/iqi;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, La/gst0;

    .line 59
    .line 60
    iget-object p2, p2, La/gst0;->a:La/rrt0;

    .line 61
    .line 62
    invoke-virtual {p2}, La/rrt0;->a()La/krt0;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget-wide v2, p2, La/krt0;->a:J

    .line 67
    .line 68
    invoke-virtual {p0, v2, v3, v0}, La/iqi;->a(JLa/zje;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-ne p2, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    check-cast p2, La/ql5;

    .line 76
    .line 77
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/rrd;

    .line 80
    .line 81
    iget-wide v0, p2, La/ql5;->a:J

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0, v1}, La/rrd;->z(La/bm5;J)V

    .line 84
    .line 85
    .line 86
    return-object p2
.end method
