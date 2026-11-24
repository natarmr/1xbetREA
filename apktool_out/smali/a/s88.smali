.class public La/s88;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pf00;
.implements La/gld0;


# static fields
.field public static d:La/s88;


# instance fields
.field public final synthetic a:B

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 2

    iput-byte p1, p0, La/s88;->a:B

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 89
    invoke-direct {p0, v1, p1, v0}, La/s88;-><init>(Ljava/lang/Object;ZB)V

    return-void

    .line 90
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 92
    iput-byte p1, p0, La/s88;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/jdk0;Z)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/s88;->a:B

    .line 93
    invoke-direct {p0, p1, v0}, La/s88;-><init>(Ljava/lang/Object;B)V

    .line 94
    iput-boolean p2, p0, La/s88;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/n2a;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/s88;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x22

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/b03;->b(Landroid/content/Context;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move v0, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v2

    .line 27
    :goto_0
    iput-boolean v0, p0, La/s88;->b:Z

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2}, La/n2a;->b()Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 p2, 0x0

    .line 41
    :goto_1
    const-string v0, "android.hardware.camera"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v1, "android.hardware.camera.front"

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-ne v0, v3, :cond_3

    .line 62
    .line 63
    :cond_2
    move v0, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move v0, v2

    .line 66
    :goto_2
    if-eqz p1, :cond_5

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    :cond_4
    move v2, v3

    .line 77
    :cond_5
    new-instance p1, La/x3a;

    .line 78
    .line 79
    invoke-direct {p1, v0, v2}, La/x3a;-><init>(ZZ)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    .line 83
    .line 84
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 85
    iput-byte p2, p0, La/s88;->a:B

    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;BZ)V
    .locals 0

    .line 86
    iput-byte p2, p0, La/s88;->a:B

    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, La/s88;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 87
    iput-byte p3, p0, La/s88;->a:B

    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/s88;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 88
    iput-byte p3, p0, La/s88;->a:B

    iput-boolean p2, p0, La/s88;->b:Z

    iput-object p1, p0, La/s88;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Ljava/util/Set;La/n2a;)Z
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, La/n2a;->c(Ljava/util/LinkedHashSet;)La/s0a;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :catch_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static x(Landroid/content/Intent;)Lcom/google/firebase/auth/zzc;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    .line 3
    const-string v1, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p0, v0}, La/n6x;->w([BLandroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->i:Z

    .line 21
    .line 22
    invoke-static {p0}, Lcom/google/firebase/auth/zzc;->p(Lcom/google/android/gms/internal/firebase-auth-api/zzajg;)Lcom/google/firebase/auth/zzc;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static y(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, La/s88;->d:La/s88;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, La/s88;->b:Z

    .line 5
    .line 6
    iget-object v0, v0, La/s88;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/omw0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {p0}, La/gr00;->t(Landroid/content/Context;)La/gr00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, La/s88;->d:La/s88;

    .line 17
    .line 18
    iget-object v0, v0, La/s88;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/omw0;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/gr00;->F(Landroid/content/BroadcastReceiver;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object p0, La/s88;->d:La/s88;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, La/s88;->c:Ljava/lang/Object;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a(La/fld0;I)V
    .locals 1

    .line 1
    iget-object p1, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget-boolean v0, p0, La/s88;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, La/s88;->b:Z

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, ", "

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/s88;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(II)V
    .locals 2

    .line 1
    iget-object v0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/lza;

    .line 4
    .line 5
    iget-boolean v1, p0, La/s88;->b:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/16 v1, 0xa

    .line 11
    .line 12
    if-le p2, v1, :cond_1

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, La/s88;->b:Z

    .line 16
    .line 17
    invoke-virtual {v0}, La/yge0;->g()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {v0, p1, p2}, La/yge0;->k(II)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public d(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/s88;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/lza;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yge0;->l(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e()La/jjq;
    .locals 2

    .line 1
    iget-boolean v0, p0, La/s88;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, La/s88;->b:Z

    .line 9
    .line 10
    new-instance v0, La/jjq;

    .line 11
    .line 12
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroid/util/SparseBooleanArray;

    .line 15
    .line 16
    invoke-direct {v0, p0}, La/jjq;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public f(IILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/s88;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/lza;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3}, La/yge0;->j(IILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/s88;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/lza;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yge0;->i(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La/s88;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, La/s88;->b:Z

    .line 12
    .line 13
    iget-object v0, p0, La/s88;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/os/CancellationSignal;

    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    monitor-enter p0

    .line 26
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 27
    .line 28
    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    throw v0

    .line 31
    :catchall_2
    move-exception v0

    .line 32
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    monitor-enter p0

    .line 35
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :catchall_3
    move-exception v0

    .line 41
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 42
    throw v0

    .line 43
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 44
    throw v0
.end method

.method public i()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/s88;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public k(Ljava/util/LinkedHashSet;Ljava/util/Set;)Z
    .locals 7

    .line 1
    iget-object v0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/x3a;

    .line 4
    .line 5
    iget-boolean v1, v0, La/x3a;->b:Z

    .line 6
    .line 7
    iget-boolean v0, v0, La/x3a;->a:Z

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/s88;->b:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p0, :cond_7

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    sget-object p0, La/n2a;->c:La/n2a;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p0}, La/s88;->j(Ljava/util/Set;La/n2a;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    sget-object v3, La/n2a;->b:La/n2a;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v3}, La/s88;->j(Ljava/util/Set;La/n2a;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    check-cast p2, Ljava/lang/Iterable;

    .line 42
    .line 43
    new-instance v4, Ljava/util/ArrayList;

    .line 44
    .line 45
    const/16 v5, 0xa

    .line 46
    .line 47
    invoke-static {p2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, La/h0a;

    .line 69
    .line 70
    invoke-virtual {v5}, La/h0a;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    move-object v6, v5

    .line 102
    check-cast v6, La/s0a;

    .line 103
    .line 104
    invoke-interface {v6}, La/s0a;->h()La/n0a;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v6}, La/n0a;->e()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-interface {p2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_2

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    sget-object p2, La/n2a;->c:La/n2a;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, La/s88;->j(Ljava/util/Set;La/n2a;)Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    sget-object v4, La/n2a;->b:La/n2a;

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {p1, v4}, La/s88;->j(Ljava/util/Set;La/n2a;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    const/4 v4, 0x1

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    if-eqz p0, :cond_4

    .line 148
    .line 149
    if-nez p2, :cond_4

    .line 150
    .line 151
    move p0, v4

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    move p0, v2

    .line 154
    :goto_2
    if-eqz v1, :cond_5

    .line 155
    .line 156
    if-eqz v3, :cond_5

    .line 157
    .line 158
    if-nez p1, :cond_5

    .line 159
    .line 160
    move p1, v4

    .line 161
    goto :goto_3

    .line 162
    :cond_5
    move p1, v2

    .line 163
    :goto_3
    if-nez p0, :cond_6

    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    :cond_6
    return v4

    .line 168
    :cond_7
    :goto_4
    return v2
.end method

.method public l(ILjava/lang/CharSequence;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    if-ltz p1, :cond_6

    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-int/2addr v1, p1

    .line 11
    if-ltz v1, :cond_6

    .line 12
    .line 13
    iget-object v1, p0, La/s88;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/jdk0;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/s88;->i()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 v1, 0x2

    .line 25
    move v2, v0

    .line 26
    move v3, v1

    .line 27
    :goto_0
    const/4 v4, 0x1

    .line 28
    if-ge v2, p1, :cond_3

    .line 29
    .line 30
    if-ne v3, v1, :cond_3

    .line 31
    .line 32
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v3}, Ljava/lang/Character;->getDirectionality(C)B

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sget-object v5, La/o5q0;->a:La/s88;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-eq v3, v4, :cond_1

    .line 45
    .line 46
    if-eq v3, v1, :cond_1

    .line 47
    .line 48
    packed-switch v3, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    move v3, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :pswitch_0
    move v3, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :pswitch_1
    move v3, v4

    .line 56
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    if-eqz v3, :cond_5

    .line 60
    .line 61
    if-eq v3, v4, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, La/s88;->i()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_4
    return v0

    .line 69
    :cond_5
    return v4

    .line 70
    :cond_6
    invoke-static {}, La/e9d0;->o()V

    .line 71
    .line 72
    .line 73
    return v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/s88;->b:Z

    .line 3
    .line 4
    return-void
.end method

.method public n(B)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y78;

    .line 4
    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public o(C)V
    .locals 3

    .line 1
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y78;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iget v1, p0, La/y78;->b:I

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, La/y78;->j(II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/y78;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [C

    .line 14
    .line 15
    iget v1, p0, La/y78;->b:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, La/y78;->b:I

    .line 20
    .line 21
    aput-char p1, v0, v1

    .line 22
    .line 23
    return-void
.end method

.method public p(I)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y78;

    .line 4
    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public q(J)V
    .locals 0

    .line 1
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y78;

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/y78;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public s(S)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y78;

    .line 4
    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, La/y78;->x(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/y78;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    add-int/2addr v0, v1

    .line 14
    iget v2, p0, La/y78;->b:I

    .line 15
    .line 16
    invoke-virtual {p0, v2, v0}, La/y78;->j(II)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/y78;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, [C

    .line 22
    .line 23
    iget v2, p0, La/y78;->b:I

    .line 24
    .line 25
    add-int/lit8 v3, v2, 0x1

    .line 26
    .line 27
    const/16 v4, 0x22

    .line 28
    .line 29
    aput-char v4, v0, v2

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-virtual {p1, v5, v2, v0, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 37
    .line 38
    .line 39
    add-int/2addr v2, v3

    .line 40
    move v6, v3

    .line 41
    :goto_0
    if-ge v6, v2, :cond_5

    .line 42
    .line 43
    aget-char v7, v0, v6

    .line 44
    .line 45
    sget-object v8, La/wsm0;->b:[B

    .line 46
    .line 47
    array-length v9, v8

    .line 48
    if-ge v7, v9, :cond_4

    .line 49
    .line 50
    aget-byte v7, v8, v7

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    sub-int v0, v6, v3

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :goto_1
    const/4 v3, 0x1

    .line 61
    if-ge v0, v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, v6, v1}, La/y78;->j(II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    sget-object v8, La/wsm0;->b:[B

    .line 71
    .line 72
    array-length v9, v8

    .line 73
    if-ge v7, v9, :cond_2

    .line 74
    .line 75
    aget-byte v8, v8, v7

    .line 76
    .line 77
    if-nez v8, :cond_0

    .line 78
    .line 79
    iget-object v3, p0, La/y78;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, [C

    .line 82
    .line 83
    add-int/lit8 v8, v6, 0x1

    .line 84
    .line 85
    int-to-char v7, v7

    .line 86
    aput-char v7, v3, v6

    .line 87
    .line 88
    :goto_2
    move v6, v8

    .line 89
    goto :goto_3

    .line 90
    :cond_0
    if-ne v8, v3, :cond_1

    .line 91
    .line 92
    sget-object v3, La/wsm0;->a:[Ljava/lang/String;

    .line 93
    .line 94
    aget-object v3, v3, v7

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-virtual {p0, v6, v7}, La/y78;->j(II)V

    .line 104
    .line 105
    .line 106
    iget-object v7, p0, La/y78;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v7, [C

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-virtual {v3, v5, v8, v7, v6}, Ljava/lang/String;->getChars(II[CI)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    add-int/2addr v3, v6

    .line 122
    iput v3, p0, La/y78;->b:I

    .line 123
    .line 124
    move v6, v3

    .line 125
    goto :goto_3

    .line 126
    :cond_1
    iget-object v3, p0, La/y78;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, [C

    .line 129
    .line 130
    const/16 v7, 0x5c

    .line 131
    .line 132
    aput-char v7, v3, v6

    .line 133
    .line 134
    add-int/lit8 v7, v6, 0x1

    .line 135
    .line 136
    int-to-char v8, v8

    .line 137
    aput-char v8, v3, v7

    .line 138
    .line 139
    add-int/lit8 v6, v6, 0x2

    .line 140
    .line 141
    iput v6, p0, La/y78;->b:I

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    iget-object v3, p0, La/y78;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, [C

    .line 147
    .line 148
    add-int/lit8 v8, v6, 0x1

    .line 149
    .line 150
    int-to-char v7, v7

    .line 151
    aput-char v7, v3, v6

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    invoke-virtual {p0, v6, v3}, La/y78;->j(II)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, [C

    .line 163
    .line 164
    add-int/lit8 v0, v6, 0x1

    .line 165
    .line 166
    aput-char v4, p1, v6

    .line 167
    .line 168
    iput v0, p0, La/y78;->b:I

    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_5
    add-int/lit8 p1, v2, 0x1

    .line 176
    .line 177
    aput-char v4, v0, v2

    .line 178
    .line 179
    iput p1, p0, La/y78;->b:I

    .line 180
    .line 181
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s88;->a:B

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
    iget-boolean v0, p0, La/s88;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "FALL_THROUGH"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, La/s88;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public u()V
    .locals 0

    .line 1
    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w(La/j2a;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/s88;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/x3a;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, La/s88;->b:Z

    .line 9
    .line 10
    const-string v1, "CameraValidator"

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "Virtual device with "

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, La/j2a;->c()Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p1, " cameras. Skipping validation."

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {v1, p0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "Verifying camera lens facing on "

    .line 48
    .line 49
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v1, p0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-boolean p0, v0, La/x3a;->a:Z

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    :try_start_0
    sget-object p0, La/n2a;->c:La/n2a;

    .line 69
    .line 70
    invoke-virtual {p1}, La/j2a;->c()Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {p0, v2}, La/n2a;->c(Ljava/util/LinkedHashSet;)La/s0a;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception p0

    .line 83
    const-string v2, "Camera LENS_FACING_BACK verification failed"

    .line 84
    .line 85
    invoke-static {v1, v2, p0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 90
    :goto_1
    iget-boolean v0, v0, La/x3a;->b:Z

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    :try_start_1
    sget-object v0, La/n2a;->b:La/n2a;

    .line 95
    .line 96
    invoke-virtual {p1}, La/j2a;->c()Ljava/util/LinkedHashSet;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v0, v2}, La/n2a;->c(Ljava/util/LinkedHashSet;)La/s0a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catch_1
    move-exception v0

    .line 109
    const-string v2, "Camera LENS_FACING_FRONT verification failed"

    .line 110
    .line 111
    invoke-static {v1, v2, v0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    if-nez p0, :cond_2

    .line 115
    .line 116
    move-object p0, v0

    .line 117
    :cond_2
    :goto_2
    if-nez p0, :cond_3

    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    new-instance v0, La/w3a;

    .line 121
    .line 122
    invoke-virtual {p1}, La/j2a;->c()Ljava/util/LinkedHashSet;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-direct {v0, p1, p0}, La/w3a;-><init>(ILjava/lang/RuntimeException;)V

    .line 131
    .line 132
    .line 133
    throw v0
.end method
