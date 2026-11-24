.class public final La/fck0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cfr;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# static fields
.field public static d:La/fck0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    iput-byte p1, p0, La/fck0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 129
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    .line 130
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance p1, La/xz40;

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/ref/Reference;

    invoke-direct {p1, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 132
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 133
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 123
    iput-byte p1, p0, La/fck0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/ea70;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/fck0;->a:B

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 135
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/epi0;La/knf0;)V
    .locals 1

    const/16 v0, 0x8

    iput-byte v0, p0, La/fck0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 119
    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/fck0;->a:B

    const/16 v0, 0x14

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 105
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 107
    new-instance p1, La/goi0;

    invoke-direct {p1, p0, v0}, La/goi0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    .line 108
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 110
    new-instance p1, La/qir0;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    .line 111
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 113
    new-instance p1, La/nxo0;

    invoke-direct {p1, p0, v0}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    .line 114
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 116
    new-instance p1, La/nxo0;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/ilp0;La/btt0;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, La/fck0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 104
    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/itt0;)V
    .locals 1

    const/16 p1, 0x14

    iput-byte p1, p0, La/fck0;->a:B

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    .line 126
    new-instance p1, Ljava/util/ArrayDeque;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/q700;La/aja;)V
    .locals 1

    const/16 v0, 0xe

    iput-byte v0, p0, La/fck0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 101
    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/q7d0;La/zoq0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/fck0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 122
    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/s88;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0x17

    iput-byte p1, p0, La/fck0;->a:B

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/fck0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    iput-byte v0, p0, La/fck0;->a:B

    .line 4
    .line 5
    const-string v0, "android-keystore://firebear_master_key_id."

    .line 6
    .line 7
    const-string v1, "com.google.firebase.auth.api.crypto."

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, La/fck0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    :try_start_0
    invoke-static {}, La/v0x0;->a()V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/sd60;

    .line 18
    .line 19
    const/16 v3, 0xe

    .line 20
    .line 21
    invoke-direct {v2, v3}, La/sd60;-><init>(B)V

    .line 22
    .line 23
    .line 24
    const-string v3, "GenericIdpKeyset"

    .line 25
    .line 26
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iput-object p1, v2, La/sd60;->b:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v3, v2, La/sd60;->c:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v1, v2, La/sd60;->d:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p1, La/e1x0;->a:La/bfx0;

    .line 39
    .line 40
    iput-object p1, v2, La/sd60;->h:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "android-keystore://"

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    iput-object p1, v2, La/sd60;->e:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v2}, La/sd60;->u()La/ok50;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_0

    .line 63
    :catch_1
    move-exception p1

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string p2, "key URI must start with android-keystore://"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    const-string p2, "need an Android context"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const-string p2, "Exception encountered during crypto setup:\n"

    .line 86
    .line 87
    const-string v0, "FirebearCryptoHelper"

    .line 88
    .line 89
    invoke-static {p2, p1, v0}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    :goto_1
    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;La/qlo;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/fck0;->a:B

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 138
    :goto_0
    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 139
    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 96
    iput-byte p3, p0, La/fck0;->a:B

    iput-object p1, p0, La/fck0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/fck0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 97
    iput-byte p4, p0, La/fck0;->a:B

    iput-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/fck0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static B(I)Z
    .locals 2

    .line 1
    sget-object v0, La/jnw0;->a:[I

    .line 2
    .line 3
    invoke-static {p0}, La/hne;->E(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq p0, v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_0
    return v0
.end method

.method public static b(Ljava/util/List;)La/ays0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/ays0;->c:La/ays0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, La/ays0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, La/ays0;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static final k(La/drm0;La/g4x0;[B)La/fck0;
    .locals 4

    .line 1
    iget-object p0, p0, La/drm0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/io/ByteArrayInputStream;

    .line 4
    .line 5
    :try_start_0
    sget-object v0, La/dkw0;->b:La/dkw0;

    .line 6
    .line 7
    invoke-static {p0, v0}, La/idx0;->t(Ljava/io/ByteArrayInputStream;La/dkw0;)La/idx0;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, La/idx0;->x()La/sjw0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, La/sjw0;->e()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 v2, 0x0

    .line 23
    const-string v3, "empty keyset"

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :try_start_1
    invoke-virtual {v1}, La/idx0;->x()La/sjw0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, La/sjw0;->r()[B

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0, p2}, La/g4x0;->b([B[B)[B

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0, v0}, La/mfx0;->v([BLa/dkw0;)La/mfx0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, La/mfx0;->t()I

    .line 46
    .line 47
    .line 48
    move-result p1
    :try_end_1
    .catch La/qkw0; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    if-lez p1, :cond_0

    .line 50
    .line 51
    invoke-static {p0}, La/fck0;->m(La/mfx0;)La/fck0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_0
    :try_start_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 57
    .line 58
    invoke-direct {p0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0
    :try_end_2
    .catch La/qkw0; {:try_start_2 .. :try_end_2} :catch_0

    .line 62
    :catch_0
    const-string p0, "invalid keyset, corrupted key material"

    .line 63
    .line 64
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_1
    invoke-static {v3}, La/hny;->o(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public static final l(La/w4p0;)La/fck0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/w4p0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, La/fpw0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    instance-of v0, v1, La/t5x0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, v1

    .line 16
    check-cast v0, La/t5x0;

    .line 17
    .line 18
    iget-object v0, v0, La/t5x0;->a:La/x4w0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    goto/16 :goto_b

    .line 23
    .line 24
    :cond_1
    sget-object v0, La/k6x0;->b:La/k6x0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/k6x0;->a(La/fpw0;)La/x4w0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-static {}, La/bfx0;->t()La/zex0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, v0, La/x4w0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, La/zex0;->g(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, La/x4w0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, La/sjw0;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, La/zex0;->f(La/sjw0;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, La/x4w0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/lpw0;

    .line 51
    .line 52
    invoke-static {v0}, La/bcm0;->D(La/lpw0;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {v2, v0}, La/zex0;->h(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, La/hkw0;->c()La/jkw0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/bfx0;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    invoke-virtual {v0}, La/ojw0;->c()[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, La/ktt0;->E([B)La/fpw0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_1
    new-instance v0, La/cgx0;

    .line 74
    .line 75
    const/16 v2, 0x10

    .line 76
    .line 77
    invoke-direct {v0, v2}, La/cgx0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    iget-object v3, v0, La/cgx0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v3, Ljava/util/ArrayList;

    .line 83
    .line 84
    new-instance v4, La/aow0;

    .line 85
    .line 86
    invoke-direct {v4, v1}, La/aow0;-><init>(La/fpw0;)V

    .line 87
    .line 88
    .line 89
    sget-object v1, La/rek0;->j:La/rek0;

    .line 90
    .line 91
    iput-object v1, v4, La/aow0;->c:La/rek0;

    .line 92
    .line 93
    const/4 v5, 0x1

    .line 94
    iput-boolean v5, v4, La/aow0;->a:Z

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    const/4 v8, 0x0

    .line 105
    if-eqz v7, :cond_2

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, La/aow0;

    .line 112
    .line 113
    iput-boolean v8, v7, La/aow0;->a:Z

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    iget-boolean v4, v0, La/cgx0;->b:Z

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    if-nez v4, :cond_11

    .line 123
    .line 124
    iput-boolean v5, v0, La/cgx0;->b:Z

    .line 125
    .line 126
    new-instance v4, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    move v7, v8

    .line 136
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    sub-int/2addr v9, v5

    .line 141
    if-ge v7, v9, :cond_5

    .line 142
    .line 143
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, La/aow0;

    .line 148
    .line 149
    iget-object v9, v9, La/aow0;->c:La/rek0;

    .line 150
    .line 151
    if-ne v9, v1, :cond_4

    .line 152
    .line 153
    add-int/lit8 v9, v7, 0x1

    .line 154
    .line 155
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    check-cast v9, La/aow0;

    .line 160
    .line 161
    iget-object v9, v9, La/aow0;->c:La/rek0;

    .line 162
    .line 163
    if-ne v9, v1, :cond_3

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_3
    const-string v0, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    .line 167
    .line 168
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v6

    .line 172
    :cond_4
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    new-instance v7, Ljava/util/HashSet;

    .line 176
    .line 177
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    move-object v9, v6

    .line 185
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    const/16 v11, 0x18

    .line 190
    .line 191
    if-eqz v10, :cond_f

    .line 192
    .line 193
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    check-cast v10, La/aow0;

    .line 198
    .line 199
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object v12, v10, La/aow0;->b:La/fpw0;

    .line 203
    .line 204
    iget-object v13, v10, La/aow0;->c:La/rek0;

    .line 205
    .line 206
    if-eqz v13, :cond_e

    .line 207
    .line 208
    if-ne v13, v1, :cond_9

    .line 209
    .line 210
    move v13, v8

    .line 211
    :cond_6
    if-eqz v13, :cond_8

    .line 212
    .line 213
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-virtual {v7, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    if-eqz v14, :cond_7

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_7
    move/from16 v17, v13

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_8
    :goto_6
    sget-object v13, La/x7x0;->a:Ljava/nio/charset/Charset;

    .line 228
    .line 229
    move v13, v8

    .line 230
    :goto_7
    if-nez v13, :cond_6

    .line 231
    .line 232
    const/4 v13, 0x4

    .line 233
    invoke-static {v13}, La/s7x0;->a(I)[B

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    aget-byte v14, v13, v8

    .line 238
    .line 239
    and-int/lit16 v14, v14, 0xff

    .line 240
    .line 241
    shl-int/2addr v14, v11

    .line 242
    aget-byte v15, v13, v5

    .line 243
    .line 244
    and-int/lit16 v15, v15, 0xff

    .line 245
    .line 246
    shl-int/2addr v15, v2

    .line 247
    or-int/2addr v14, v15

    .line 248
    const/4 v15, 0x2

    .line 249
    aget-byte v15, v13, v15

    .line 250
    .line 251
    and-int/lit16 v15, v15, 0xff

    .line 252
    .line 253
    shl-int/lit8 v15, v15, 0x8

    .line 254
    .line 255
    or-int/2addr v14, v15

    .line 256
    const/4 v15, 0x3

    .line 257
    aget-byte v13, v13, v15

    .line 258
    .line 259
    and-int/lit16 v13, v13, 0xff

    .line 260
    .line 261
    or-int/2addr v13, v14

    .line 262
    goto :goto_7

    .line 263
    :cond_9
    move/from16 v17, v8

    .line 264
    .line 265
    :goto_8
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-virtual {v7, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    if-nez v11, :cond_d

    .line 274
    .line 275
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, La/fpw0;->a()Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-eqz v11, :cond_a

    .line 287
    .line 288
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    goto :goto_9

    .line 293
    :cond_a
    move-object v11, v6

    .line 294
    :goto_9
    sget-object v13, La/b6x0;->b:La/b6x0;

    .line 295
    .line 296
    invoke-virtual {v13, v12, v11}, La/b6x0;->b(La/fpw0;Ljava/lang/Integer;)La/atm0;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    new-instance v14, La/dow0;

    .line 301
    .line 302
    iget-boolean v11, v10, La/aow0;->a:Z

    .line 303
    .line 304
    const/16 v19, 0x0

    .line 305
    .line 306
    const/16 v16, 0x2

    .line 307
    .line 308
    move/from16 v18, v11

    .line 309
    .line 310
    invoke-direct/range {v14 .. v19}, La/dow0;-><init>(La/atm0;IIZZ)V

    .line 311
    .line 312
    .line 313
    move/from16 v13, v17

    .line 314
    .line 315
    iget-boolean v10, v10, La/aow0;->a:Z

    .line 316
    .line 317
    if-eqz v10, :cond_c

    .line 318
    .line 319
    if-nez v9, :cond_b

    .line 320
    .line 321
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    goto :goto_a

    .line 326
    :cond_b
    const-string v0, "Two primaries were set"

    .line 327
    .line 328
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-object v6

    .line 332
    :cond_c
    :goto_a
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto/16 :goto_5

    .line 336
    .line 337
    :cond_d
    move/from16 v13, v17

    .line 338
    .line 339
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 340
    .line 341
    const-string v1, "Id "

    .line 342
    .line 343
    const-string v2, " is used twice in the keyset"

    .line 344
    .line 345
    invoke-static {v13, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v0

    .line 353
    :cond_e
    const-string v0, "No ID was set (with withFixedId or withRandomId)"

    .line 354
    .line 355
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return-object v6

    .line 359
    :cond_f
    if-eqz v9, :cond_10

    .line 360
    .line 361
    new-instance v1, La/fck0;

    .line 362
    .line 363
    iget-object v0, v0, La/cgx0;->d:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, Ljava/util/HashMap;

    .line 366
    .line 367
    invoke-direct {v1, v4, v0, v11}, La/fck0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, La/fck0;->x()V

    .line 371
    .line 372
    .line 373
    return-object v1

    .line 374
    :cond_10
    const-string v0, "No primary was set"

    .line 375
    .line 376
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    return-object v6

    .line 380
    :cond_11
    const-string v0, "KeysetHandle.Builder#build must only be called once"

    .line 381
    .line 382
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    return-object v6

    .line 386
    :goto_b
    new-instance v2, La/tiu0;

    .line 387
    .line 388
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    const-string v3, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "

    .line 393
    .line 394
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    const/4 v3, 0x5

    .line 399
    invoke-direct {v2, v1, v0, v3}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 400
    .line 401
    .line 402
    throw v2
.end method

.method public static final m(La/mfx0;)La/fck0;
    .locals 17

    .line 1
    sget-object v1, La/jar0;->g:La/fqw0;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, La/mfx0;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v0, :cond_17

    .line 9
    .line 10
    sget-object v3, La/gfk0;->h:La/gfk0;

    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p0}, La/mfx0;->t()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, La/mfx0;->A()La/mkw0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const-class v6, La/gqw0;

    .line 34
    .line 35
    const-class v7, La/qpw0;

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x0

    .line 39
    if-eqz v0, :cond_e

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v10, v0

    .line 46
    check-cast v10, La/jfx0;

    .line 47
    .line 48
    invoke-virtual {v10}, La/jfx0;->u()I

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    :try_start_0
    invoke-static {v10}, La/fck0;->o(La/jfx0;)La/vkr0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v7, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_0

    .line 61
    .line 62
    invoke-virtual {v7, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    goto :goto_2

    .line 67
    :cond_0
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-eqz v11, :cond_2

    .line 72
    .line 73
    sget-object v11, La/jyw0;->a:La/y04;

    .line 74
    .line 75
    iget-object v11, v11, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-eqz v11, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance v11, La/gqw0;

    .line 85
    .line 86
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7, v11}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    :goto_1
    move-object v11, v2

    .line 95
    :goto_2
    check-cast v11, La/qpw0;

    .line 96
    .line 97
    if-eqz v11, :cond_3

    .line 98
    .line 99
    invoke-interface {v11, v0}, La/qpw0;->c(La/vkr0;)La/atm0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move/from16 v16, v9

    .line 104
    .line 105
    :goto_3
    move-object v12, v0

    .line 106
    goto :goto_7

    .line 107
    :catch_0
    move-exception v0

    .line 108
    goto :goto_4

    .line 109
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 110
    .line 111
    const-string v11, "Passed in configuration cannot be used to serialize into proto keyset format."

    .line 112
    .line 113
    invoke-direct {v0, v11}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :goto_4
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-eqz v11, :cond_4

    .line 122
    .line 123
    invoke-virtual {v6, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    goto :goto_6

    .line 128
    :cond_4
    invoke-virtual {v6, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v11

    .line 132
    if-eqz v11, :cond_6

    .line 133
    .line 134
    sget-object v11, La/jyw0;->a:La/y04;

    .line 135
    .line 136
    iget-object v11, v11, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_5

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    new-instance v11, La/gqw0;

    .line 146
    .line 147
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v11}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    goto :goto_6

    .line 155
    :cond_6
    :goto_5
    move-object v11, v2

    .line 156
    :goto_6
    if-eqz v11, :cond_d

    .line 157
    .line 158
    new-instance v0, La/o5x0;

    .line 159
    .line 160
    invoke-static {v10}, La/fck0;->o(La/jfx0;)La/vkr0;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-direct {v0, v11, v3}, La/o5x0;-><init>(La/vkr0;La/gfk0;)V

    .line 165
    .line 166
    .line 167
    move/from16 v16, v8

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :goto_7
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    invoke-virtual {v6, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_9

    .line 181
    :cond_7
    invoke-virtual {v6, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_9

    .line 186
    .line 187
    sget-object v0, La/jyw0;->a:La/y04;

    .line 188
    .line 189
    iget-object v0, v0, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_8

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_8
    new-instance v0, La/gqw0;

    .line 199
    .line 200
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    goto :goto_9

    .line 208
    :cond_9
    :goto_8
    move-object v0, v2

    .line 209
    :goto_9
    if-nez v0, :cond_b

    .line 210
    .line 211
    invoke-virtual {v10}, La/jfx0;->A()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-static {v0}, La/fck0;->B(I)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_a

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_a
    const-string v0, "Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets."

    .line 223
    .line 224
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-object v2

    .line 228
    :cond_b
    :goto_a
    new-instance v11, La/dow0;

    .line 229
    .line 230
    invoke-virtual {v10}, La/jfx0;->A()I

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    invoke-virtual/range {p0 .. p0}, La/mfx0;->y()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-ne v14, v0, :cond_c

    .line 239
    .line 240
    move v15, v8

    .line 241
    goto :goto_b

    .line 242
    :cond_c
    move v15, v9

    .line 243
    :goto_b
    invoke-direct/range {v11 .. v16}, La/dow0;-><init>(La/atm0;IIZZ)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_d
    throw v0

    .line 252
    :cond_e
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_f

    .line 261
    .line 262
    invoke-virtual {v6, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    goto :goto_d

    .line 267
    :cond_f
    invoke-virtual {v6, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_11

    .line 272
    .line 273
    sget-object v1, La/jyw0;->a:La/y04;

    .line 274
    .line 275
    iget-object v1, v1, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_10

    .line 282
    .line 283
    goto :goto_c

    .line 284
    :cond_10
    new-instance v1, La/gqw0;

    .line 285
    .line 286
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    goto :goto_d

    .line 294
    :cond_11
    :goto_c
    move-object v1, v2

    .line 295
    :goto_d
    if-nez v1, :cond_16

    .line 296
    .line 297
    new-instance v1, Ljava/util/HashSet;

    .line 298
    .line 299
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    :cond_12
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-eqz v4, :cond_14

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, La/dow0;

    .line 317
    .line 318
    iget v5, v4, La/dow0;->d:I

    .line 319
    .line 320
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-nez v6, :cond_13

    .line 329
    .line 330
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    iget-boolean v4, v4, La/dow0;->e:Z

    .line 338
    .line 339
    if-eqz v4, :cond_12

    .line 340
    .line 341
    move v9, v8

    .line 342
    goto :goto_e

    .line 343
    :cond_13
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 344
    .line 345
    const-string v1, "KeyID "

    .line 346
    .line 347
    const-string v2, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."

    .line 348
    .line 349
    invoke-static {v5, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :cond_14
    if-eqz v9, :cond_15

    .line 358
    .line 359
    goto :goto_f

    .line 360
    :cond_15
    const-string v0, "Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."

    .line 361
    .line 362
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    return-object v2

    .line 366
    :cond_16
    :goto_f
    new-instance v1, La/fck0;

    .line 367
    .line 368
    new-instance v2, Ljava/util/HashMap;

    .line 369
    .line 370
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 371
    .line 372
    .line 373
    const/16 v3, 0x18

    .line 374
    .line 375
    invoke-direct {v1, v0, v2, v3}, La/fck0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :cond_17
    const-string v0, "empty keyset"

    .line 380
    .line 381
    invoke-static {v0}, La/hny;->o(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-object v2
.end method

.method public static n(Landroid/content/Context;Ljava/lang/String;)La/fck0;
    .locals 1

    .line 1
    sget-object v0, La/fck0;->d:La/fck0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/fck0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, La/fck0;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, La/fck0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, La/fck0;->d:La/fck0;

    .line 21
    .line 22
    :cond_1
    sget-object p0, La/fck0;->d:La/fck0;

    .line 23
    .line 24
    return-object p0
.end method

.method public static o(La/jfx0;)La/vkr0;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/jfx0;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, La/jfx0;->C()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-virtual {p0}, La/jfx0;->z()La/wex0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, La/wex0;->A()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, La/jfx0;->z()La/wex0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, La/wex0;->z()La/sjw0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p0}, La/jfx0;->z()La/wex0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, La/wex0;->x()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, La/bcm0;->E(I)La/hbb;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p0}, La/jfx0;->C()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, La/bcm0;->G(I)La/lpw0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {v1, v2, v3, p0, v0}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static t(La/nfq;La/biw0;)Lcom/google/firebase/auth/internal/zzad;
    .locals 9

    .line 1
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lcom/google/firebase/auth/internal/zzz;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "firebase"

    .line 18
    .line 19
    invoke-static {v2}, La/s0x;->E(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p1, La/biw0;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v3}, La/s0x;->E(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v3, v1, Lcom/google/firebase/auth/internal/zzz;->a:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v2, v1, Lcom/google/firebase/auth/internal/zzz;->b:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p1, La/biw0;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v2, v1, Lcom/google/firebase/auth/internal/zzz;->e:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p1, La/biw0;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v2, v1, Lcom/google/firebase/auth/internal/zzz;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p1, La/biw0;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x0

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v2, v4

    .line 54
    :goto_0
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, v1, Lcom/google/firebase/auth/internal/zzz;->d:Ljava/lang/String;

    .line 61
    .line 62
    :cond_1
    iget-boolean v2, p1, La/biw0;->c:Z

    .line 63
    .line 64
    iput-boolean v2, v1, Lcom/google/firebase/auth/internal/zzz;->g:Z

    .line 65
    .line 66
    iput-object v4, v1, Lcom/google/firebase/auth/internal/zzz;->h:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v2, p1, La/biw0;->g:Ljava/lang/String;

    .line 69
    .line 70
    iput-object v2, v1, Lcom/google/firebase/auth/internal/zzz;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v1, p1, La/biw0;->f:La/owp0;

    .line 76
    .line 77
    iget-object v1, v1, La/owp0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Ljava/util/List;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_4

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    move v3, v2

    .line 91
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-ge v3, v5, :cond_4

    .line 96
    .line 97
    new-instance v5, Lcom/google/firebase/auth/internal/zzz;

    .line 98
    .line 99
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, La/niw0;

    .line 104
    .line 105
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-static {v6}, La/s0x;->H(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v7, v6, La/niw0;->a:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->a:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v7, v6, La/niw0;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v7}, La/s0x;->E(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->b:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v7, v6, La/niw0;->b:Ljava/lang/String;

    .line 123
    .line 124
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v7, v6, La/niw0;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-nez v8, :cond_2

    .line 133
    .line 134
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    goto :goto_2

    .line 139
    :cond_2
    move-object v7, v4

    .line 140
    :goto_2
    if-eqz v7, :cond_3

    .line 141
    .line 142
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->d:Ljava/lang/String;

    .line 147
    .line 148
    :cond_3
    iget-object v7, v6, La/niw0;->g:Ljava/lang/String;

    .line 149
    .line 150
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->e:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v7, v6, La/niw0;->f:Ljava/lang/String;

    .line 153
    .line 154
    iput-object v7, v5, Lcom/google/firebase/auth/internal/zzz;->f:Ljava/lang/String;

    .line 155
    .line 156
    iput-boolean v2, v5, Lcom/google/firebase/auth/internal/zzz;->g:Z

    .line 157
    .line 158
    iget-object v6, v6, La/niw0;->e:Ljava/lang/String;

    .line 159
    .line 160
    iput-object v6, v5, Lcom/google/firebase/auth/internal/zzz;->h:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    new-instance v1, Lcom/google/firebase/auth/internal/zzad;

    .line 169
    .line 170
    invoke-direct {v1, p0, v0}, Lcom/google/firebase/auth/internal/zzad;-><init>(La/nfq;Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    new-instance p0, Lcom/google/firebase/auth/internal/zzaf;

    .line 174
    .line 175
    iget-wide v2, p1, La/biw0;->i:J

    .line 176
    .line 177
    iget-wide v4, p1, La/biw0;->h:J

    .line 178
    .line 179
    invoke-direct {p0, v2, v3, v4, v5}, Lcom/google/firebase/auth/internal/zzaf;-><init>(JJ)V

    .line 180
    .line 181
    .line 182
    iput-object p0, v1, Lcom/google/firebase/auth/internal/zzad;->i:Lcom/google/firebase/auth/internal/zzaf;

    .line 183
    .line 184
    iget-boolean p0, p1, La/biw0;->j:Z

    .line 185
    .line 186
    iput-boolean p0, v1, Lcom/google/firebase/auth/internal/zzad;->j:Z

    .line 187
    .line 188
    iget-object p0, p1, La/biw0;->k:Lcom/google/firebase/auth/zzc;

    .line 189
    .line 190
    iput-object p0, v1, Lcom/google/firebase/auth/internal/zzad;->k:Lcom/google/firebase/auth/zzc;

    .line 191
    .line 192
    iget-object p0, p1, La/biw0;->l:Ljava/util/List;

    .line 193
    .line 194
    invoke-static {p0}, La/rsm0;->z(Ljava/util/List;)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {v1, p0}, Lcom/google/firebase/auth/internal/zzad;->s(Ljava/util/ArrayList;)V

    .line 199
    .line 200
    .line 201
    iget-object p0, p1, La/biw0;->m:La/hhw0;

    .line 202
    .line 203
    if-nez p0, :cond_5

    .line 204
    .line 205
    new-instance p0, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    :cond_5
    iput-object p0, v1, Lcom/google/firebase/auth/internal/zzad;->m:Ljava/util/List;

    .line 211
    .line 212
    return-object v1
.end method


# virtual methods
.method public A(Ljava/lang/Enum;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public C()La/fck0;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_6

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La/dow0;

    .line 29
    .line 30
    iget-object v3, v2, La/dow0;->a:La/atm0;

    .line 31
    .line 32
    instance-of v4, v3, La/i1x0;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    check-cast v3, La/i1x0;

    .line 38
    .line 39
    invoke-virtual {v3}, La/i1x0;->u()La/atm0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    move-object v7, v3

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_0
    instance-of v4, v3, La/o5x0;

    .line 47
    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    check-cast v3, La/o5x0;

    .line 51
    .line 52
    iget-object v3, v3, La/o5x0;->a:La/vkr0;

    .line 53
    .line 54
    iget-object v4, v3, La/vkr0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    sget-object v6, La/a5x0;->d:La/a5x0;

    .line 59
    .line 60
    invoke-virtual {v6, v4}, La/a5x0;->e(Ljava/lang/String;)La/l5x0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    instance-of v7, v6, La/q5x0;

    .line 65
    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    check-cast v6, La/q5x0;

    .line 69
    .line 70
    iget-object v4, v3, La/vkr0;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, La/sjw0;

    .line 73
    .line 74
    iget-object v7, v6, La/l5x0;->a:Ljava/lang/String;

    .line 75
    .line 76
    iget v6, v6, La/l5x0;->c:I

    .line 77
    .line 78
    invoke-static {v6}, La/bcm0;->E(I)La/hbb;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const/4 v8, 0x4

    .line 83
    invoke-static {v8}, La/bcm0;->G(I)La/lpw0;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-static {v7, v4, v6, v8, v5}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    sget-object v6, La/k6x0;->b:La/k6x0;

    .line 92
    .line 93
    iget-object v7, v6, La/k6x0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    check-cast v7, La/u7x0;

    .line 100
    .line 101
    invoke-virtual {v7, v4}, La/u7x0;->c(La/vkr0;)La/atm0;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    instance-of v7, v4, La/i1x0;

    .line 106
    .line 107
    if-eqz v7, :cond_3

    .line 108
    .line 109
    check-cast v4, La/i1x0;

    .line 110
    .line 111
    invoke-virtual {v4}, La/i1x0;->u()La/atm0;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    iget-object v6, v6, La/k6x0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, La/u7x0;

    .line 122
    .line 123
    invoke-virtual {v6, v4}, La/u7x0;->a(La/atm0;)La/vkr0;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {}, La/wex0;->t()La/vex0;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    iget-object v7, v4, La/vkr0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v6}, La/hkw0;->d()V

    .line 136
    .line 137
    .line 138
    iget-object v8, v6, La/hkw0;->b:La/jkw0;

    .line 139
    .line 140
    check-cast v8, La/wex0;

    .line 141
    .line 142
    invoke-static {v8, v7}, La/wex0;->w(La/wex0;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v7, v4, La/vkr0;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v7, La/sjw0;

    .line 148
    .line 149
    invoke-virtual {v6}, La/hkw0;->d()V

    .line 150
    .line 151
    .line 152
    iget-object v8, v6, La/hkw0;->b:La/jkw0;

    .line 153
    .line 154
    check-cast v8, La/wex0;

    .line 155
    .line 156
    invoke-static {v8, v7}, La/wex0;->v(La/wex0;La/sjw0;)V

    .line 157
    .line 158
    .line 159
    iget-object v4, v4, La/vkr0;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, La/hbb;

    .line 162
    .line 163
    invoke-static {v4}, La/bcm0;->C(La/hbb;)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-virtual {v6}, La/hkw0;->d()V

    .line 168
    .line 169
    .line 170
    iget-object v7, v6, La/hkw0;->b:La/jkw0;

    .line 171
    .line 172
    check-cast v7, La/wex0;

    .line 173
    .line 174
    invoke-static {v7, v4}, La/wex0;->u(La/wex0;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, La/hkw0;->c()La/jkw0;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, La/wex0;

    .line 182
    .line 183
    invoke-virtual {v4}, La/wex0;->A()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v4}, La/wex0;->z()La/sjw0;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v4}, La/wex0;->x()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-static {v4}, La/bcm0;->E(I)La/hbb;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    iget-object v8, v3, La/vkr0;->e:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, La/lpw0;

    .line 202
    .line 203
    iget-object v3, v3, La/vkr0;->f:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v3, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-static {v6, v7, v4, v8, v3}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    new-instance v4, La/o5x0;

    .line 212
    .line 213
    invoke-direct {v4, v3, v5}, La/o5x0;-><init>(La/vkr0;La/gfk0;)V

    .line 214
    .line 215
    .line 216
    move-object v7, v4

    .line 217
    :goto_1
    new-instance v6, La/dow0;

    .line 218
    .line 219
    iget v8, v2, La/dow0;->b:I

    .line 220
    .line 221
    iget v9, v2, La/dow0;->d:I

    .line 222
    .line 223
    iget-boolean v10, v2, La/dow0;->e:Z

    .line 224
    .line 225
    const/4 v11, 0x0

    .line 226
    invoke-direct/range {v6 .. v11}, La/dow0;-><init>(La/atm0;IIZZ)V

    .line 227
    .line 228
    .line 229
    iget v2, v2, La/dow0;->d:I

    .line 230
    .line 231
    invoke-virtual {v7}, La/atm0;->t()Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    if-eqz v3, :cond_2

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-ne v3, v2, :cond_1

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_1
    const-string p0, "Wrong ID set for key with ID requirement"

    .line 245
    .line 246
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object v5

    .line 250
    :cond_2
    :goto_2
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_3
    const-string p0, "Key not private key"

    .line 256
    .line 257
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-object v5

    .line 261
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 262
    .line 263
    const-string v0, "manager for key type "

    .line 264
    .line 265
    const-string v1, " is not a PrivateKeyManager"

    .line 266
    .line 267
    invoke-static {v0, v4, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p0

    .line 275
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 276
    .line 277
    iget-object v0, v2, La/dow0;->a:La/atm0;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const-string v1, "Cannot get Public Key for key of type "

    .line 288
    .line 289
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p0

    .line 297
    :cond_6
    new-instance v1, La/fck0;

    .line 298
    .line 299
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p0, Ljava/util/HashMap;

    .line 302
    .line 303
    const/16 v2, 0x18

    .line 304
    .line 305
    invoke-direct {v1, v0, p0, v2}, La/fck0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, La/fck0;->x()V

    .line 309
    .line 310
    .line 311
    return-object v1
.end method

.method public D()La/dow0;
    .locals 3

    .line 1
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/dow0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-boolean v2, v0, La/dow0;->e:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object p0, v0, La/dow0;->c:La/pfw;

    .line 29
    .line 30
    sget-object v2, La/pfw;->g:La/pfw;

    .line 31
    .line 32
    if-ne p0, v2, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const-string p0, "Keyset has primary which isn\'t enabled"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    const-string p0, "Keyset has no valid primary"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public E()La/mfx0;
    .locals 11

    .line 1
    const-class v0, La/qpw0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {}, La/mfx0;->z()La/kfx0;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_7

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, La/dow0;

    .line 27
    .line 28
    iget-object v4, v3, La/dow0;->a:La/atm0;

    .line 29
    .line 30
    iget v5, v3, La/dow0;->d:I

    .line 31
    .line 32
    iget v6, v3, La/dow0;->b:I

    .line 33
    .line 34
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    sget-object v7, La/jar0;->g:La/fqw0;

    .line 41
    .line 42
    invoke-virtual {v0, v7}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-class v7, La/gqw0;

    .line 48
    .line 49
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    sget-object v7, La/jyw0;->a:La/y04;

    .line 56
    .line 57
    iget-object v7, v7, La/y04;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    :cond_2
    move-object v7, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance v7, La/gqw0;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v7}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    :goto_1
    check-cast v7, La/qpw0;

    .line 77
    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    invoke-interface {v7, v4}, La/qpw0;->a(La/atm0;)La/vkr0;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v4}, La/atm0;->t()Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ne v4, v5, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 98
    .line 99
    const-string v0, "Wrong ID set for key with ID requirement"

    .line 100
    .line 101
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_5
    :goto_2
    invoke-static {}, La/jfx0;->B()La/ifx0;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {}, La/wex0;->t()La/vex0;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    iget-object v9, v7, La/vkr0;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v9, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v8}, La/hkw0;->d()V

    .line 118
    .line 119
    .line 120
    iget-object v10, v8, La/hkw0;->b:La/jkw0;

    .line 121
    .line 122
    check-cast v10, La/wex0;

    .line 123
    .line 124
    invoke-static {v10, v9}, La/wex0;->w(La/wex0;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v9, v7, La/vkr0;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v9, La/sjw0;

    .line 130
    .line 131
    invoke-virtual {v8}, La/hkw0;->d()V

    .line 132
    .line 133
    .line 134
    iget-object v10, v8, La/hkw0;->b:La/jkw0;

    .line 135
    .line 136
    check-cast v10, La/wex0;

    .line 137
    .line 138
    invoke-static {v10, v9}, La/wex0;->v(La/wex0;La/sjw0;)V

    .line 139
    .line 140
    .line 141
    iget-object v9, v7, La/vkr0;->d:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v9, La/hbb;

    .line 144
    .line 145
    invoke-static {v9}, La/bcm0;->C(La/hbb;)I

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    invoke-virtual {v8}, La/hkw0;->d()V

    .line 150
    .line 151
    .line 152
    iget-object v10, v8, La/hkw0;->b:La/jkw0;

    .line 153
    .line 154
    check-cast v10, La/wex0;

    .line 155
    .line 156
    invoke-static {v10, v9}, La/wex0;->u(La/wex0;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, La/hkw0;->d()V

    .line 160
    .line 161
    .line 162
    iget-object v9, v4, La/hkw0;->b:La/jkw0;

    .line 163
    .line 164
    check-cast v9, La/jfx0;

    .line 165
    .line 166
    invoke-virtual {v8}, La/hkw0;->c()La/jkw0;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, La/wex0;

    .line 171
    .line 172
    invoke-static {v9, v8}, La/jfx0;->w(La/jfx0;La/wex0;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, La/hkw0;->d()V

    .line 176
    .line 177
    .line 178
    iget-object v8, v4, La/hkw0;->b:La/jkw0;

    .line 179
    .line 180
    check-cast v8, La/jfx0;

    .line 181
    .line 182
    invoke-static {v8, v6}, La/jfx0;->y(La/jfx0;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, La/hkw0;->d()V

    .line 186
    .line 187
    .line 188
    iget-object v6, v4, La/hkw0;->b:La/jkw0;

    .line 189
    .line 190
    check-cast v6, La/jfx0;

    .line 191
    .line 192
    invoke-static {v6, v5}, La/jfx0;->v(La/jfx0;I)V

    .line 193
    .line 194
    .line 195
    iget-object v6, v7, La/vkr0;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v6, La/lpw0;

    .line 198
    .line 199
    invoke-static {v6}, La/bcm0;->D(La/lpw0;)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-virtual {v4}, La/hkw0;->d()V

    .line 204
    .line 205
    .line 206
    iget-object v7, v4, La/hkw0;->b:La/jkw0;

    .line 207
    .line 208
    check-cast v7, La/jfx0;

    .line 209
    .line 210
    invoke-static {v7, v6}, La/jfx0;->x(La/jfx0;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, La/hkw0;->c()La/jkw0;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, La/jfx0;

    .line 218
    .line 219
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 220
    .line 221
    .line 222
    iget-object v6, v2, La/hkw0;->b:La/jkw0;

    .line 223
    .line 224
    check-cast v6, La/mfx0;

    .line 225
    .line 226
    invoke-static {v6, v4}, La/mfx0;->x(La/mfx0;La/jfx0;)V

    .line 227
    .line 228
    .line 229
    iget-boolean v3, v3, La/dow0;->e:Z

    .line 230
    .line 231
    if-eqz v3, :cond_0

    .line 232
    .line 233
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 234
    .line 235
    .line 236
    iget-object v3, v2, La/hkw0;->b:La/jkw0;

    .line 237
    .line 238
    check-cast v3, La/mfx0;

    .line 239
    .line 240
    invoke-static {v3, v5}, La/mfx0;->w(La/mfx0;I)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :catch_0
    move-exception p0

    .line 246
    goto :goto_3

    .line 247
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 248
    .line 249
    const-string v0, "Passed in configuration cannot be used to parse and serialize proto keysets."

    .line 250
    .line 251
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p0

    .line 255
    :cond_7
    invoke-virtual {v2}, La/hkw0;->c()La/jkw0;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, La/mfx0;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    return-object p0

    .line 262
    :goto_3
    invoke-static {p0}, La/itt0;->s(Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    return-object v1
.end method

.method public a(La/xov0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/ea70;

    .line 7
    .line 8
    iget-object p0, p0, La/ea70;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public d(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    monitor-enter v0

    .line 22
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :goto_0
    monitor-exit v0

    .line 53
    return p0

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public e(IILa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/lqq0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/lqq0;

    .line 11
    .line 12
    iget v3, v2, La/lqq0;->s:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/lqq0;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/lqq0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/lqq0;-><init>(La/fck0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/lqq0;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/lqq0;->s:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/lqq0;->m:I

    .line 47
    .line 48
    iget v10, v2, La/lqq0;->l:I

    .line 49
    .line 50
    iget v11, v2, La/lqq0;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/lqq0;->o:J

    .line 53
    .line 54
    iget-wide v14, v2, La/lqq0;->n:J

    .line 55
    .line 56
    const/16 p3, 0x0

    .line 57
    .line 58
    iget v7, v2, La/lqq0;->j:I

    .line 59
    .line 60
    iget-byte v8, v2, La/lqq0;->i:B

    .line 61
    .line 62
    iget-object v5, v2, La/lqq0;->p:Ljava/lang/Throwable;

    .line 63
    .line 64
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move v0, v4

    .line 68
    move v4, v7

    .line 69
    move v7, v10

    .line 70
    const/4 v1, 0x3

    .line 71
    move-object/from16 v16, v5

    .line 72
    .line 73
    move-object v5, v2

    .line 74
    move v2, v8

    .line 75
    move v8, v11

    .line 76
    move-wide v10, v12

    .line 77
    move-wide v12, v14

    .line 78
    move-object/from16 v14, v16

    .line 79
    .line 80
    move v15, v6

    .line 81
    goto/16 :goto_9

    .line 82
    .line 83
    :cond_1
    const/16 p3, 0x0

    .line 84
    .line 85
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object p3

    .line 91
    :cond_2
    const/16 p3, 0x0

    .line 92
    .line 93
    iget v4, v2, La/lqq0;->m:I

    .line 94
    .line 95
    iget v5, v2, La/lqq0;->l:I

    .line 96
    .line 97
    iget v7, v2, La/lqq0;->k:I

    .line 98
    .line 99
    iget-wide v10, v2, La/lqq0;->o:J

    .line 100
    .line 101
    iget-wide v12, v2, La/lqq0;->n:J

    .line 102
    .line 103
    iget v8, v2, La/lqq0;->j:I

    .line 104
    .line 105
    iget-byte v14, v2, La/lqq0;->i:B

    .line 106
    .line 107
    iget-object v15, v2, La/lqq0;->p:Ljava/lang/Throwable;

    .line 108
    .line 109
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move v0, v4

    .line 113
    move v4, v8

    .line 114
    move v8, v7

    .line 115
    move v7, v5

    .line 116
    move-object v5, v2

    .line 117
    move v2, v14

    .line 118
    move-object v14, v15

    .line 119
    move v15, v6

    .line 120
    goto/16 :goto_5

    .line 121
    .line 122
    :cond_3
    const/16 p3, 0x0

    .line 123
    .line 124
    iget v4, v2, La/lqq0;->l:I

    .line 125
    .line 126
    iget v5, v2, La/lqq0;->k:I

    .line 127
    .line 128
    iget-wide v7, v2, La/lqq0;->o:J

    .line 129
    .line 130
    iget-wide v10, v2, La/lqq0;->n:J

    .line 131
    .line 132
    iget v12, v2, La/lqq0;->j:I

    .line 133
    .line 134
    iget-byte v13, v2, La/lqq0;->i:B

    .line 135
    .line 136
    iget-object v14, v2, La/lqq0;->p:Ljava/lang/Throwable;

    .line 137
    .line 138
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto/16 :goto_2

    .line 142
    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move/from16 v16, v5

    .line 145
    .line 146
    move-object v5, v2

    .line 147
    move v2, v13

    .line 148
    move-wide/from16 v17, v7

    .line 149
    .line 150
    move v7, v4

    .line 151
    move/from16 v8, v16

    .line 152
    .line 153
    move v4, v12

    .line 154
    move-wide v12, v10

    .line 155
    move-wide/from16 v10, v17

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_4
    const/16 p3, 0x0

    .line 159
    .line 160
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-wide v4, La/cag0;->a:J

    .line 164
    .line 165
    const-wide/16 v7, 0x3

    .line 166
    .line 167
    move-object/from16 v14, p3

    .line 168
    .line 169
    move-wide v10, v4

    .line 170
    move-wide v12, v7

    .line 171
    move v0, v9

    .line 172
    const/4 v7, 0x0

    .line 173
    const/4 v8, 0x0

    .line 174
    move/from16 v4, p2

    .line 175
    .line 176
    move-object v5, v2

    .line 177
    move/from16 v2, p1

    .line 178
    .line 179
    :goto_1
    if-eqz v0, :cond_f

    .line 180
    .line 181
    :try_start_1
    iget-object v15, v1, La/fck0;->b:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v15, La/epi0;

    .line 184
    .line 185
    iget-object v6, v1, La/fck0;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v6, La/knf0;

    .line 188
    .line 189
    invoke-virtual {v6}, La/knf0;->c()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    iput-object v14, v5, La/lqq0;->p:Ljava/lang/Throwable;

    .line 194
    .line 195
    iput-byte v2, v5, La/lqq0;->i:B

    .line 196
    .line 197
    iput v4, v5, La/lqq0;->j:I

    .line 198
    .line 199
    iput-wide v12, v5, La/lqq0;->n:J

    .line 200
    .line 201
    iput-wide v10, v5, La/lqq0;->o:J

    .line 202
    .line 203
    iput v8, v5, La/lqq0;->k:I

    .line 204
    .line 205
    iput v7, v5, La/lqq0;->l:I

    .line 206
    .line 207
    iput v0, v5, La/lqq0;->m:I

    .line 208
    .line 209
    iput v9, v5, La/lqq0;->s:I

    .line 210
    .line 211
    iget-object v0, v15, La/epi0;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, La/enj0;

    .line 214
    .line 215
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, La/iqq0;

    .line 220
    .line 221
    invoke-interface {v0, v6, v4, v2, v5}, La/iqq0;->a(Ljava/lang/String;IILa/yje;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    if-ne v0, v3, :cond_5

    .line 226
    .line 227
    goto/16 :goto_8

    .line 228
    .line 229
    :cond_5
    move-wide/from16 v16, v12

    .line 230
    .line 231
    move v13, v2

    .line 232
    move v12, v4

    .line 233
    move-object v2, v5

    .line 234
    move v4, v7

    .line 235
    move v5, v8

    .line 236
    move-wide v7, v10

    .line 237
    move-wide/from16 v10, v16

    .line 238
    .line 239
    :goto_2
    :try_start_2
    check-cast v0, La/dx5;

    .line 240
    .line 241
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, La/oqq0;

    .line 246
    .line 247
    invoke-static {v0}, La/cvm0;->o(La/oqq0;)La/kqq0;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 251
    return-object v0

    .line 252
    :catchall_1
    move-exception v0

    .line 253
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_a

    .line 258
    .line 259
    if-nez v8, :cond_6

    .line 260
    .line 261
    new-instance v14, La/el50;

    .line 262
    .line 263
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    const/4 v6, 0x2

    .line 268
    goto :goto_1

    .line 269
    :cond_6
    move-wide/from16 p1, v10

    .line 270
    .line 271
    int-to-long v9, v7

    .line 272
    cmp-long v9, v9, v12

    .line 273
    .line 274
    if-gez v9, :cond_7

    .line 275
    .line 276
    const/4 v9, 0x1

    .line 277
    goto :goto_4

    .line 278
    :cond_7
    const/4 v9, 0x0

    .line 279
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 280
    .line 281
    if-eqz v9, :cond_8

    .line 282
    .line 283
    iput-object v14, v5, La/lqq0;->p:Ljava/lang/Throwable;

    .line 284
    .line 285
    iput-byte v2, v5, La/lqq0;->i:B

    .line 286
    .line 287
    iput v4, v5, La/lqq0;->j:I

    .line 288
    .line 289
    iput-wide v12, v5, La/lqq0;->n:J

    .line 290
    .line 291
    move-wide/from16 v10, p1

    .line 292
    .line 293
    iput-wide v10, v5, La/lqq0;->o:J

    .line 294
    .line 295
    iput v8, v5, La/lqq0;->k:I

    .line 296
    .line 297
    iput v7, v5, La/lqq0;->l:I

    .line 298
    .line 299
    iput v9, v5, La/lqq0;->m:I

    .line 300
    .line 301
    const/4 v15, 0x2

    .line 302
    iput v15, v5, La/lqq0;->s:I

    .line 303
    .line 304
    invoke-static {v10, v11, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-ne v0, v3, :cond_9

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :goto_5
    move v6, v15

    .line 312
    :goto_6
    const/4 v9, 0x1

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_8
    move-wide/from16 v10, p1

    .line 316
    .line 317
    const/4 v15, 0x2

    .line 318
    new-instance v14, La/el50;

    .line 319
    .line 320
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :cond_9
    move v0, v9

    .line 324
    goto :goto_5

    .line 325
    :cond_a
    const/4 v15, 0x2

    .line 326
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    if-eqz v9, :cond_e

    .line 331
    .line 332
    move-object/from16 p1, v0

    .line 333
    .line 334
    int-to-long v0, v7

    .line 335
    cmp-long v0, v0, v12

    .line 336
    .line 337
    if-gez v0, :cond_b

    .line 338
    .line 339
    const/4 v0, 0x1

    .line 340
    goto :goto_7

    .line 341
    :cond_b
    const/4 v0, 0x0

    .line 342
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 343
    .line 344
    if-eqz v0, :cond_d

    .line 345
    .line 346
    iput-object v14, v5, La/lqq0;->p:Ljava/lang/Throwable;

    .line 347
    .line 348
    iput-byte v2, v5, La/lqq0;->i:B

    .line 349
    .line 350
    iput v4, v5, La/lqq0;->j:I

    .line 351
    .line 352
    iput-wide v12, v5, La/lqq0;->n:J

    .line 353
    .line 354
    iput-wide v10, v5, La/lqq0;->o:J

    .line 355
    .line 356
    iput v8, v5, La/lqq0;->k:I

    .line 357
    .line 358
    iput v7, v5, La/lqq0;->l:I

    .line 359
    .line 360
    iput v0, v5, La/lqq0;->m:I

    .line 361
    .line 362
    const/4 v1, 0x3

    .line 363
    iput v1, v5, La/lqq0;->s:I

    .line 364
    .line 365
    invoke-static {v10, v11, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    if-ne v9, v3, :cond_c

    .line 370
    .line 371
    :goto_8
    return-object v3

    .line 372
    :cond_c
    :goto_9
    move-object/from16 v1, p0

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_d
    const/4 v1, 0x3

    .line 376
    new-instance v14, La/dag0;

    .line 377
    .line 378
    move-object/from16 v9, p1

    .line 379
    .line 380
    invoke-direct {v14, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_e
    move-object v9, v0

    .line 385
    const/4 v1, 0x3

    .line 386
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 387
    .line 388
    .line 389
    move-object/from16 v1, p0

    .line 390
    .line 391
    move-object v14, v9

    .line 392
    move v6, v15

    .line 393
    const/4 v0, 0x0

    .line 394
    goto :goto_6

    .line 395
    :cond_f
    if-nez v14, :cond_10

    .line 396
    .line 397
    const-string v0, "Unexpected error"

    .line 398
    .line 399
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-object p3

    .line 403
    :cond_10
    throw v14
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    instance-of v0, p3, La/gfs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/gfs0;

    .line 7
    .line 8
    iget v1, v0, La/gfs0;->k:I

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
    iput v1, v0, La/gfs0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/gfs0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/gfs0;-><init>(La/fck0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, La/gfs0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/gfs0;->k:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, La/fck0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p3, La/ilp0;

    .line 55
    .line 56
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/btt0;

    .line 59
    .line 60
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iput v2, v6, La/gfs0;->k:I

    .line 65
    .line 66
    iget-object p3, p3, La/ilp0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v1, p3

    .line 69
    check-cast v1, La/d57;

    .line 70
    .line 71
    const-string v5, "application/vnd.xenvelop+json"

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move-object v3, p1

    .line 75
    move-object v4, p2

    .line 76
    invoke-interface/range {v1 .. v6}, La/d57;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-ne p3, v0, :cond_3

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    :goto_2
    check-cast p3, La/dx5;

    .line 84
    .line 85
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/Iterable;

    .line 90
    .line 91
    new-instance p1, Ljava/util/ArrayList;

    .line 92
    .line 93
    const/16 p2, 0xa

    .line 94
    .line 95
    invoke-static {p0, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_7

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, La/k7w;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/l7w;

    .line 122
    .line 123
    iget-object p3, p2, La/k7w;->a:Ljava/lang/Long;

    .line 124
    .line 125
    if-eqz p3, :cond_4

    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    :goto_4
    move-wide v5, v1

    .line 132
    goto :goto_5

    .line 133
    :cond_4
    const-wide/16 v1, 0x0

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :goto_5
    iget-object p3, p2, La/k7w;->b:Ljava/lang/Double;

    .line 137
    .line 138
    const-wide/16 v1, 0x0

    .line 139
    .line 140
    if-eqz p3, :cond_5

    .line 141
    .line 142
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 143
    .line 144
    .line 145
    move-result-wide v3

    .line 146
    goto :goto_6

    .line 147
    :cond_5
    move-wide v3, v1

    .line 148
    :goto_6
    iget-object p2, p2, La/k7w;->c:Ljava/lang/Double;

    .line 149
    .line 150
    if-eqz p2, :cond_6

    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    :cond_6
    move-wide v7, v3

    .line 157
    move-wide v3, v1

    .line 158
    move-wide v1, v7

    .line 159
    invoke-direct/range {v0 .. v6}, La/l7w;-><init>(DDJ)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    return-object p1
.end method

.method public g(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/aja;

    .line 4
    .line 5
    instance-of v1, p2, La/dlt0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/dlt0;

    .line 11
    .line 12
    iget v2, v1, La/dlt0;->l:I

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
    iput v2, v1, La/dlt0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/dlt0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, La/dlt0;-><init>(La/fck0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v1, La/dlt0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/dlt0;->l:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    iget-object v0, v1, La/dlt0;->i:La/aja;

    .line 42
    .line 43
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, v0, La/aja;->a:La/rfs;

    .line 57
    .line 58
    iget-object p2, p2, La/rfs;->a:La/p7m0;

    .line 59
    .line 60
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    instance-of v3, p2, La/bgs;

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    check-cast p2, La/bgs;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object p2, v5

    .line 72
    :goto_1
    if-eqz p2, :cond_4

    .line 73
    .line 74
    iget-object p2, p2, La/bgs;->e:La/p700;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object p2, v5

    .line 78
    :goto_2
    if-nez p2, :cond_8

    .line 79
    .line 80
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, La/q700;

    .line 83
    .line 84
    iput-object v0, v1, La/dlt0;->i:La/aja;

    .line 85
    .line 86
    iput v4, v1, La/dlt0;->l:I

    .line 87
    .line 88
    iget-object p2, p0, La/q700;->c:La/mne;

    .line 89
    .line 90
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 91
    .line 92
    new-instance v3, La/juy;

    .line 93
    .line 94
    const/16 v4, 0xa

    .line 95
    .line 96
    invoke-direct {v3, p0, p1, v5, v4}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p2, v3, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-ne p2, v2, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    :goto_3
    move-object v6, p2

    .line 107
    check-cast v6, La/p700;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p0, v0, La/aja;->a:La/rfs;

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object p0, p0, La/rfs;->a:La/p7m0;

    .line 121
    .line 122
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    move-object p2, p1

    .line 127
    check-cast p2, La/egs;

    .line 128
    .line 129
    instance-of v0, p2, La/bgs;

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    move-object v1, p2

    .line 134
    check-cast v1, La/bgs;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/16 v9, 0x6f

    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-static/range {v1 .. v9}, La/bgs;->a(La/bgs;La/l9s;Ljava/util/List;Ljava/util/List;La/zvl0;La/p700;Ljava/util/List;ZI)La/bgs;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    :cond_7
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0
.end method

.method public h(La/xov0;)La/h6m0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/ea70;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/ea70;->c(La/xov0;)La/h6m0;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method

.method public i(La/xov0;)La/h6m0;
    .locals 1

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/ea70;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/ea70;->e(La/xov0;)La/h6m0;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
.end method

.method public j(La/qfu0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, La/qaq0;

    .line 8
    .line 9
    const/16 v2, 0xf

    .line 10
    .line 11
    invoke-direct {v1, p0, p1, v2}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 36
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 37
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, La/s88;->y(Landroid/content/Context;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cmn0;

    .line 4
    .line 5
    iget p0, p0, La/cmn0;->f:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    const-string v1, "SurfaceProcessorNode"

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string p0, "Downstream VideoCapture failed to provide Surface."

    .line 17
    .line 18
    invoke-static {v1, p0}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {p0}, La/ohm0;->m(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "Downstream node failed to provide Surface. Target: "

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v1, p0, p1}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/imn0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/cyu;

    .line 9
    .line 10
    iget-object p0, p0, La/cyu;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/txj;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/txj;->a(La/imn0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p()La/okt0;
    .locals 2

    .line 1
    new-instance v0, La/okt0;

    .line 2
    .line 3
    iget-object v1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, v1, p0}, La/okt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public q(I)La/dow0;
    .locals 4

    .line 1
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/List;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-ltz p1, :cond_2

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ge p1, v1, :cond_2

    .line 13
    .line 14
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/dow0;

    .line 19
    .line 20
    iget v2, v1, La/dow0;->b:I

    .line 21
    .line 22
    invoke-static {v2}, La/fck0;->B(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "Keyset-Entry at position "

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-boolean v1, v1, La/dow0;->f:Z

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/dow0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_0
    const-string p0, " didn\'t parse correctly"

    .line 42
    .line 43
    invoke-static {p1, v3, p0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const-string p0, " has wrong status"

    .line 52
    .line 53
    invoke-static {p1, v3, p0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    const-string v1, "Invalid index "

    .line 66
    .line 67
    const-string v2, " for keyset of size "

    .line 68
    .line 69
    invoke-static {p1, v1, p0, v2}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, La/v4i0;->m(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method

.method public r(La/nfq;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/AuthCredential;Ljava/lang/String;La/iow0;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p5}, La/s0x;->H(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    move-object v0, p2

    .line 14
    check-cast v0, Lcom/google/firebase/auth/internal/zzad;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/firebase/auth/internal/zzad;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/google/firebase/auth/AuthCredential;->m()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 31
    .line 32
    const/16 p1, 0x4277

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-direct {p0, p1, p2, p2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, La/jfw0;->a(Lcom/google/android/gms/common/api/Status;)La/c44;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    instance-of v0, p3, Lcom/google/firebase/auth/EmailAuthCredential;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    check-cast p3, Lcom/google/firebase/auth/EmailAuthCredential;

    .line 52
    .line 53
    iget-object v0, p3, Lcom/google/firebase/auth/EmailAuthCredential;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    new-instance v0, La/new0;

    .line 62
    .line 63
    invoke-direct {v0, p3, p4}, La/new0;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v0, La/dgw0;->c:La/nfq;

    .line 67
    .line 68
    iput-object p2, v0, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 69
    .line 70
    move-object p1, p5

    .line 71
    check-cast p1, La/lyw0;

    .line 72
    .line 73
    check-cast p1, La/lyw0;

    .line 74
    .line 75
    iput-object p1, v0, La/dgw0;->e:La/lyw0;

    .line 76
    .line 77
    check-cast p5, La/amw0;

    .line 78
    .line 79
    iput-object p5, v0, La/dgw0;->f:La/amw0;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_1
    new-instance p4, La/cew0;

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    invoke-direct {p4, p3, v0}, La/cew0;-><init>(Lcom/google/firebase/auth/AuthCredential;B)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p4, La/dgw0;->c:La/nfq;

    .line 93
    .line 94
    iput-object p2, p4, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 95
    .line 96
    move-object p1, p5

    .line 97
    check-cast p1, La/lyw0;

    .line 98
    .line 99
    check-cast p1, La/lyw0;

    .line 100
    .line 101
    iput-object p1, p4, La/dgw0;->e:La/lyw0;

    .line 102
    .line 103
    check-cast p5, La/amw0;

    .line 104
    .line 105
    iput-object p5, p4, La/dgw0;->f:La/amw0;

    .line 106
    .line 107
    invoke-virtual {p0, p4}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_2
    instance-of p4, p3, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 113
    .line 114
    if-eqz p4, :cond_3

    .line 115
    .line 116
    check-cast p3, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 117
    .line 118
    sget-object p4, La/qgw0;->a:La/gx3;

    .line 119
    .line 120
    invoke-virtual {p4}, La/nuj0;->clear()V

    .line 121
    .line 122
    .line 123
    new-instance p4, La/cew0;

    .line 124
    .line 125
    const/4 v0, 0x2

    .line 126
    invoke-direct {p4, p3, v0}, La/cew0;-><init>(Lcom/google/firebase/auth/AuthCredential;B)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p4, La/dgw0;->c:La/nfq;

    .line 130
    .line 131
    iput-object p2, p4, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 132
    .line 133
    move-object p1, p5

    .line 134
    check-cast p1, La/lyw0;

    .line 135
    .line 136
    check-cast p1, La/lyw0;

    .line 137
    .line 138
    iput-object p1, p4, La/dgw0;->e:La/lyw0;

    .line 139
    .line 140
    check-cast p5, La/amw0;

    .line 141
    .line 142
    iput-object p5, p4, La/dgw0;->f:La/amw0;

    .line 143
    .line 144
    invoke-virtual {p0, p4}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_3
    new-instance p4, La/few0;

    .line 150
    .line 151
    invoke-direct {p4, p3}, La/few0;-><init>(Lcom/google/firebase/auth/AuthCredential;)V

    .line 152
    .line 153
    .line 154
    iput-object p1, p4, La/dgw0;->c:La/nfq;

    .line 155
    .line 156
    iput-object p2, p4, La/dgw0;->d:Lcom/google/firebase/auth/FirebaseUser;

    .line 157
    .line 158
    move-object p1, p5

    .line 159
    check-cast p1, La/lyw0;

    .line 160
    .line 161
    check-cast p1, La/lyw0;

    .line 162
    .line 163
    iput-object p1, p4, La/dgw0;->e:La/lyw0;

    .line 164
    .line 165
    check-cast p5, La/amw0;

    .line 166
    .line 167
    iput-object p5, p4, La/dgw0;->f:La/amw0;

    .line 168
    .line 169
    invoke-virtual {p0, p4}, La/fck0;->s(La/dgw0;)Lcom/google/android/gms/tasks/Task;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0
.end method

.method public s(La/dgw0;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/fck0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    new-instance v2, La/hf5;

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v2, v3}, La/hf5;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object p0, v2, La/hf5;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p1, v2, La/hf5;->c:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v0, v2, La/hf5;->d:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fck0;->a:B

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
    invoke-virtual {p0}, La/fck0;->E()La/mfx0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/iqw0;->a(La/mfx0;)La/sfx0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, La/jkw0;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public u(La/anw0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0}, La/fck0;->E()La/mfx0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget v2, La/iqw0;->a:I

    .line 10
    .line 11
    invoke-virtual {v1}, La/mfx0;->y()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1}, La/mfx0;->A()La/mkw0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    move v5, v4

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/4 v7, 0x0

    .line 31
    if-eqz v6, :cond_6

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, La/jfx0;

    .line 38
    .line 39
    invoke-virtual {v6}, La/jfx0;->A()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    const/4 v9, 0x2

    .line 44
    if-ne v8, v9, :cond_0

    .line 45
    .line 46
    invoke-virtual {v6}, La/jfx0;->t()Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_5

    .line 51
    .line 52
    invoke-virtual {v6}, La/jfx0;->C()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    const/4 v9, 0x1

    .line 57
    if-eq v8, v9, :cond_4

    .line 58
    .line 59
    invoke-virtual {v6}, La/jfx0;->A()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eq v8, v9, :cond_3

    .line 64
    .line 65
    invoke-virtual {v6}, La/jfx0;->u()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-ne v6, v2, :cond_2

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    move v5, v9

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const-string p0, "keyset contains multiple primary keys"

    .line 76
    .line 77
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v7

    .line 81
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 85
    .line 86
    invoke-virtual {v6}, La/jfx0;->u()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string p2, "key %d has unknown status"

    .line 99
    .line 100
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 109
    .line 110
    invoke-virtual {v6}, La/jfx0;->u()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string p2, "key %d has unknown prefix"

    .line 123
    .line 124
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 133
    .line 134
    invoke-virtual {v6}, La/jfx0;->u()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const-string p2, "key %d has no key data"

    .line 147
    .line 148
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_6
    if-eqz v4, :cond_b

    .line 157
    .line 158
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-ge v3, v1, :cond_a

    .line 163
    .line 164
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, La/dow0;

    .line 169
    .line 170
    iget-boolean v1, v1, La/dow0;->f:Z

    .line 171
    .line 172
    if-nez v1, :cond_8

    .line 173
    .line 174
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, La/dow0;

    .line 179
    .line 180
    iget v1, v1, La/dow0;->b:I

    .line 181
    .line 182
    invoke-static {v1}, La/fck0;->B(I)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_7

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    :goto_3
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, La/dow0;

    .line 197
    .line 198
    iget-object p0, p0, La/dow0;->a:La/atm0;

    .line 199
    .line 200
    instance-of p1, p0, La/o5x0;

    .line 201
    .line 202
    if-eqz p1, :cond_9

    .line 203
    .line 204
    check-cast p0, La/o5x0;

    .line 205
    .line 206
    sget-object p1, La/gfk0;->h:La/gfk0;

    .line 207
    .line 208
    iget-object p0, p0, La/o5x0;->a:La/vkr0;

    .line 209
    .line 210
    invoke-static {p0, p1}, La/o5x0;->u(La/vkr0;La/gfk0;)V

    .line 211
    .line 212
    .line 213
    iget-object p0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, Ljava/lang/String;

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_9
    const-string p0, "(unknown)"

    .line 219
    .line 220
    :goto_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 221
    .line 222
    const-string p2, " and type_url "

    .line 223
    .line 224
    const-string v0, " failed, unable to get primitive"

    .line 225
    .line 226
    const-string v1, "Key parsing of key with index "

    .line 227
    .line 228
    invoke-static {v3, v1, p2, p0, v0}, Lc;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :cond_a
    invoke-interface {p1, p0, p2}, La/anw0;->f(La/fck0;Ljava/lang/Class;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :cond_b
    const-string p0, "keyset must contain at least one ENABLED key"

    .line 242
    .line 243
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-object v7
.end method

.method public v()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ok50;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "FirebearCryptoHelper"

    .line 9
    .line 10
    const-string v0, "KeysetManager failed to initialize - unable to get Public key"

    .line 11
    .line 12
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/nmt0;

    .line 22
    .line 23
    invoke-direct {v2, v0}, La/nmt0;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object v3, p0, La/fck0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/ok50;

    .line 29
    .line 30
    monitor-enter v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/ok50;

    .line 34
    .line 35
    invoke-virtual {p0}, La/ok50;->p()La/fck0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, La/fck0;->C()La/fck0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, v2}, La/fck0;->z(La/nmt0;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    :try_start_3
    throw p0
    :try_end_3
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    goto :goto_0

    .line 63
    :catch_1
    move-exception p0

    .line 64
    :goto_0
    const-string v0, "FirebearCryptoHelper"

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string v2, "Exception encountered when attempting to get Public Key:\n"

    .line 71
    .line 72
    invoke-static {v2, p0, v0}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public w(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ok50;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "FirebearCryptoHelper"

    .line 9
    .line 10
    const-string p1, "KeysetManager failed to initialize - unable to decrypt payload"

    .line 11
    .line 12
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    :try_start_1
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/ok50;

    .line 20
    .line 21
    invoke-virtual {p0}, La/ok50;->p()La/fck0;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :try_start_2
    invoke-static {}, La/pyw0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    sget-object v2, La/t0x0;->a:La/qow0;
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    :try_start_3
    const-class v3, La/dnw0;

    .line 34
    .line 35
    invoke-virtual {p0, v2, v3}, La/fck0;->u(La/anw0;Ljava/lang/Class;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/dnw0;

    .line 40
    .line 41
    new-instance v2, Ljava/lang/String;

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p0, p1, v1}, La/dnw0;->b([B[B)[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 54
    .line 55
    invoke-direct {v2, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    return-object v2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    :try_start_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string p1, "Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    :catch_0
    move-exception p0

    .line 71
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :goto_0
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 78
    :try_start_6
    throw p0
    :try_end_6
    .catch Ljava/security/GeneralSecurityException; {:try_start_6 .. :try_end_6} :catch_1

    .line 79
    :catch_1
    move-exception p0

    .line 80
    const-string p1, "FirebearCryptoHelper"

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string v0, "Exception encountered while decrypting bytes:\n"

    .line 87
    .line 88
    invoke-static {v0, p0, p1}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v1
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/HashMap;

    .line 4
    .line 5
    const-class v0, La/s5x0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {}, La/hny;->b()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public y(La/fuj0;La/g4x0;[B)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fck0;->E()La/mfx0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/ojw0;->c()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p2, v0, p3}, La/g4x0;->c([B[B)[B

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {}, La/idx0;->w()La/hdx0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/4 v0, 0x0

    .line 18
    array-length v1, p2

    .line 19
    invoke-static {p2, v0, v1}, La/sjw0;->h([BII)La/vjw0;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p3}, La/hkw0;->d()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p3, La/hkw0;->b:La/jkw0;

    .line 27
    .line 28
    check-cast v0, La/idx0;

    .line 29
    .line 30
    invoke-static {v0, p2}, La/idx0;->u(La/idx0;La/vjw0;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, La/iqw0;->a(La/mfx0;)La/sfx0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p3}, La/hkw0;->d()V

    .line 38
    .line 39
    .line 40
    iget-object p2, p3, La/hkw0;->b:La/jkw0;

    .line 41
    .line 42
    check-cast p2, La/idx0;

    .line 43
    .line 44
    invoke-static {p2, p0}, La/idx0;->v(La/idx0;La/sfx0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, La/hkw0;->c()La/jkw0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/idx0;

    .line 52
    .line 53
    iget-object p2, p1, La/fuj0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    iget-object p1, p1, La/fuj0;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0}, La/ojw0;->c()[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, La/zcm0;->s([B)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p2, p1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    const-string p0, "Failed to write to SharedPreferences"

    .line 81
    .line 82
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public z(La/nmt0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/fck0;->E()La/mfx0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/mfx0;->A()La/mkw0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, La/jfx0;

    .line 25
    .line 26
    invoke-virtual {v1}, La/jfx0;->z()La/wex0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, La/wex0;->x()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v3, v4, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, La/jfx0;->z()La/wex0;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, La/wex0;->x()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x2

    .line 46
    if-eq v3, v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, La/jfx0;->z()La/wex0;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, La/wex0;->x()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x3

    .line 57
    if-eq v3, v4, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 61
    .line 62
    invoke-virtual {v1}, La/jfx0;->z()La/wex0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, La/wex0;->x()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    packed-switch p1, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    throw v2

    .line 74
    :pswitch_0
    const-string p1, "UNRECOGNIZED"

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_1
    const-string p1, "REMOTE"

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    const-string p1, "ASYMMETRIC_PUBLIC"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_3
    const-string p1, "ASYMMETRIC_PRIVATE"

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :pswitch_4
    const-string p1, "SYMMETRIC"

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :pswitch_5
    const-string p1, "UNKNOWN_KEYMATERIAL"

    .line 90
    .line 91
    :goto_1
    invoke-virtual {v1}, La/jfx0;->z()La/wex0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, La/wex0;->A()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "keyset contains key material of type "

    .line 100
    .line 101
    const-string v2, " for type url "

    .line 102
    .line 103
    invoke-static {v1, p1, v2, v0}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_1
    iget-object p1, p1, La/nmt0;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Ljava/io/ByteArrayOutputStream;

    .line 114
    .line 115
    :try_start_0
    check-cast p0, La/jkw0;

    .line 116
    .line 117
    invoke-virtual {p0, v2}, La/jkw0;->b(La/dlw0;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/16 v1, 0x1000

    .line 122
    .line 123
    if-le v0, v1, :cond_2

    .line 124
    .line 125
    move v0, v1

    .line 126
    :cond_2
    new-instance v1, La/ckw0;

    .line 127
    .line 128
    invoke-direct {v1, p1, v0}, La/ckw0;-><init>(Ljava/io/ByteArrayOutputStream;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v1}, La/jkw0;->k(La/p4;)V

    .line 132
    .line 133
    .line 134
    iget p0, v1, La/ckw0;->e:I

    .line 135
    .line 136
    if-lez p0, :cond_3

    .line 137
    .line 138
    invoke-virtual {v1}, La/ckw0;->o1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
