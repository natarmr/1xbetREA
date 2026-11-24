.class public final La/sxs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vdo;
.implements La/lix0;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements La/xmw0;


# static fields
.field public static final synthetic b:La/sxs0;

.field public static final synthetic c:La/sxs0;

.field public static final synthetic d:La/sxs0;

.field public static final synthetic e:La/sxs0;

.field public static final synthetic f:La/sxs0;

.field public static final synthetic g:La/sxs0;

.field public static final synthetic h:La/sxs0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/sxs0;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sxs0;->b:La/sxs0;

    .line 9
    .line 10
    new-instance v0, La/sxs0;

    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/sxs0;->c:La/sxs0;

    .line 18
    .line 19
    new-instance v0, La/sxs0;

    .line 20
    .line 21
    const/16 v1, 0x19

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/sxs0;->d:La/sxs0;

    .line 27
    .line 28
    new-instance v0, La/sxs0;

    .line 29
    .line 30
    const/16 v1, 0x1a

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/sxs0;->e:La/sxs0;

    .line 36
    .line 37
    new-instance v0, La/sxs0;

    .line 38
    .line 39
    const/16 v1, 0x1b

    .line 40
    .line 41
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/sxs0;->f:La/sxs0;

    .line 45
    .line 46
    new-instance v0, La/sxs0;

    .line 47
    .line 48
    const/16 v1, 0x1c

    .line 49
    .line 50
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 51
    .line 52
    .line 53
    sput-object v0, La/sxs0;->g:La/sxs0;

    .line 54
    .line 55
    new-instance v0, La/sxs0;

    .line 56
    .line 57
    const/16 v1, 0x1d

    .line 58
    .line 59
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 60
    .line 61
    .line 62
    sput-object v0, La/sxs0;->h:La/sxs0;

    .line 63
    .line 64
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 28
    iput-byte p1, p0, La/sxs0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/r9u;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, La/sxs0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/hny;)V
    .locals 2

    .line 1
    const/16 p2, 0x13

    .line 2
    .line 3
    iput-byte p2, p0, La/sxs0;->a:B

    .line 4
    .line 5
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance p2, Landroid/view/GestureDetector;

    .line 16
    .line 17
    new-instance v0, La/g5g;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, v1}, La/g5g;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static a(La/fot0;)La/upt0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, La/oub0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object p0, La/upt0;->c:La/upt0;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of v0, p0, La/mzw;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget-object p0, La/upt0;->d:La/upt0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    instance-of v0, p0, La/jyw;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    sget-object p0, La/upt0;->e:La/upt0;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    invoke-static {p0}, La/qsm0;->v(La/fot0;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    sget-object p0, La/upt0;->f:La/upt0;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_3
    instance-of p0, p0, La/qrm0;

    .line 35
    .line 36
    if-eqz p0, :cond_4

    .line 37
    .line 38
    sget-object p0, La/upt0;->g:La/upt0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_4
    sget-object p0, La/upt0;->h:La/upt0;

    .line 42
    .line 43
    return-object p0
.end method

.method public static c(Landroidx/fragment/app/e;ZJJLjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ywu0;

    .line 5
    .line 6
    invoke-direct {v0}, La/ywu0;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/ywu0;->t2:[La/iiy;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget-object v2, v1, v2

    .line 13
    .line 14
    iget-object v3, v0, La/ywu0;->n2:La/cgx0;

    .line 15
    .line 16
    invoke-virtual {v3, v0, v2, p1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    aget-object p1, v1, p1

    .line 21
    .line 22
    iget-object v2, v0, La/ywu0;->o2:La/r34;

    .line 23
    .line 24
    invoke-virtual {v2, v0, p1, p2, p3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    aget-object p1, v1, p1

    .line 29
    .line 30
    iget-object p2, v0, La/ywu0;->p2:La/r34;

    .line 31
    .line 32
    invoke-virtual {p2, v0, p1, p4, p5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    aget-object p1, v1, p1

    .line 37
    .line 38
    iget-object p2, v0, La/ywu0;->q2:La/phf0;

    .line 39
    .line 40
    invoke-virtual {p2, v0, p1, p6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-class p1, La/ywu0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p0, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static d(Landroidx/fragment/app/e;La/yx5;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/sa4;

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    invoke-direct {v0, p2, v1}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 9
    .line 10
    .line 11
    const-string p2, "WildFreeBetFeature.FRAGMENT_RESULT_KEY"

    .line 12
    .line 13
    invoke-virtual {p0, p2, p1, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public synthetic b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/os/Bundle;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x3

    .line 15
    const-string v0, "Rpc"

    .line 16
    .line 17
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string v1, "Error making request: "

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, "SERVICE_NOT_AVAILABLE"

    .line 46
    .line 47
    invoke-static {p1, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public zza()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/sxs0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 7
    .line 8
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 11
    .line 12
    .line 13
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 14
    .line 15
    const/16 v0, 0x29

    .line 16
    .line 17
    const-wide/32 v1, 0x1b7740

    .line 18
    .line 19
    .line 20
    const-string v3, "measurement.sgtm.batch.retry_interval"

    .line 21
    .line 22
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Long;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 34
    .line 35
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 36
    .line 37
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 38
    .line 39
    .line 40
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 41
    .line 42
    const/16 v0, 0x2c

    .line 43
    .line 44
    const-string v1, "measurement.sgtm.service_upload_apps_list"

    .line 45
    .line 46
    const-string v2, ""

    .line 47
    .line 48
    invoke-virtual {p0, v0, v1, v2}, La/trm0;->v(ILjava/lang/String;Ljava/lang/String;)La/b5x0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/String;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 60
    .line 61
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 62
    .line 63
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 64
    .line 65
    .line 66
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 67
    .line 68
    const/16 v0, 0x48

    .line 69
    .line 70
    const-wide/32 v1, 0xc350

    .line 71
    .line 72
    .line 73
    const-string v3, "measurement.upload.max_public_events_per_day"

    .line 74
    .line 75
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    long-to-int p0, v0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_2
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 96
    .line 97
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 98
    .line 99
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 100
    .line 101
    .line 102
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 103
    .line 104
    const/16 v0, 0xe

    .line 105
    .line 106
    const-string v1, "measurement.edpb.events_cached_in_no_data_mode"

    .line 107
    .line 108
    const-string v2, "_f,_v,_cmp"

    .line 109
    .line 110
    invoke-virtual {p0, v0, v1, v2}, La/trm0;->v(ILjava/lang/String;Ljava/lang/String;)La/b5x0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ljava/lang/String;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_3
    sget-object p0, La/ehw0;->b:La/ehw0;

    .line 122
    .line 123
    iget-object p0, p0, La/ehw0;->a:La/oin0;

    .line 124
    .line 125
    iget-object p0, p0, La/oin0;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, La/khw0;

    .line 128
    .line 129
    sget-object p0, La/khw0;->b:La/n4x0;

    .line 130
    .line 131
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    new-instance v0, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
