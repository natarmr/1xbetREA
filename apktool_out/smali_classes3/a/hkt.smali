.class public final La/hkt;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hkt;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek",
        "blocking"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Z1:La/pek;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/yzn0;

.field public final P1:La/cgx0;

.field public Q1:J

.field public R1:Landroid/location/Geocoder;

.field public S1:Landroid/location/LocationManager;

.field public final U1:La/n0o0;

.field public final V1:La/n0o0;

.field public final W1:La/ywq;

.field public final X1:La/ywq;

.field public Y1:Landroid/os/CancellationSignal;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/hkt;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/blocking/databinding/GeoblockingLayoutBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "currentState"

    .line 16
    .line 17
    const-string v5, "getCurrentState()Lorg/xplatform/onexuser/data/user/model/GeoState;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "needGeo"

    .line 25
    .line 26
    const-string v6, "getNeedGeo()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/hkt;->a2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/pek;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/hkt;->Z1:La/pek;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d031c

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/dkt;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, v1}, La/dkt;-><init>(La/hkt;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/t7t;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v3, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v4, La/t7t;

    .line 22
    .line 23
    const/4 v5, 0x5

    .line 24
    invoke-direct {v4, v1, v5}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v3, La/mkt;

    .line 32
    .line 33
    sget-object v4, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, La/r6p;

    .line 40
    .line 41
    const/16 v6, 0x14

    .line 42
    .line 43
    invoke-direct {v4, v1, v6}, La/r6p;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v6, La/r6p;

    .line 47
    .line 48
    const/16 v7, 0x15

    .line 49
    .line 50
    invoke-direct {v6, v1, v7}, La/r6p;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v3, v4, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/hkt;->M1:La/kiu0;

    .line 58
    .line 59
    sget-object v0, La/gkt;->a:La/gkt;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/hkt;->N1:La/s0r;

    .line 66
    .line 67
    new-instance v0, La/yzn0;

    .line 68
    .line 69
    const-string v1, "BUNDLE_STATE"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/hkt;->O1:La/yzn0;

    .line 75
    .line 76
    new-instance v0, La/cgx0;

    .line 77
    .line 78
    const-string v1, "BUNDLE_NEED_GEO"

    .line 79
    .line 80
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, La/hkt;->P1:La/cgx0;

    .line 84
    .line 85
    const-wide/16 v0, -0x1

    .line 86
    .line 87
    iput-wide v0, p0, La/hkt;->Q1:J

    .line 88
    .line 89
    new-instance v0, La/dkt;

    .line 90
    .line 91
    invoke-direct {v0, p0, v2}, La/dkt;-><init>(La/hkt;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, La/hkt;->U1:La/n0o0;

    .line 99
    .line 100
    new-instance v0, La/dkt;

    .line 101
    .line 102
    invoke-direct {v0, p0, v5}, La/dkt;-><init>(La/hkt;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/hkt;->V1:La/n0o0;

    .line 110
    .line 111
    new-instance v0, La/xn;

    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 115
    .line 116
    .line 117
    new-instance v1, La/bkt;

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    invoke-direct {v1, p0, v3}, La/bkt;-><init>(La/hkt;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p0, La/hkt;->W1:La/ywq;

    .line 128
    .line 129
    new-instance v0, La/xn;

    .line 130
    .line 131
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 132
    .line 133
    .line 134
    new-instance v1, La/bkt;

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-direct {v1, p0, v2}, La/bkt;-><init>(La/hkt;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p0, La/hkt;->X1:La/ywq;

    .line 145
    .line 146
    return-void
.end method

.method public static J0(Landroid/content/Context;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "location"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroid/location/LocationManager;

    .line 13
    .line 14
    const-string v0, "network"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "gps"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method


# virtual methods
.method public final C0()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/akt;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/akt;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/akt;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v6, v3, La/akt;->a:La/xak;

    .line 65
    .line 66
    iget-object v7, v3, La/akt;->b:La/a6u;

    .line 67
    .line 68
    iget-object v8, v3, La/akt;->c:La/wyu;

    .line 69
    .line 70
    iget-object v9, v3, La/akt;->d:La/y3v;

    .line 71
    .line 72
    iget-object v5, v3, La/akt;->f:La/ii;

    .line 73
    .line 74
    iget-object v11, v3, La/akt;->e:La/evz;

    .line 75
    .line 76
    iget-object v12, v3, La/akt;->g:La/mne;

    .line 77
    .line 78
    iget-object v13, v3, La/akt;->h:La/s64;

    .line 79
    .line 80
    iget-object v14, v3, La/akt;->i:La/wgu;

    .line 81
    .line 82
    iget-object v15, v3, La/akt;->j:La/dpc;

    .line 83
    .line 84
    iget-object v1, v3, La/akt;->k:La/ani0;

    .line 85
    .line 86
    iget-object v2, v3, La/akt;->l:La/duj;

    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v4, La/qv2;

    .line 98
    .line 99
    move-object/from16 v16, v1

    .line 100
    .line 101
    move-object/from16 v17, v2

    .line 102
    .line 103
    invoke-direct/range {v4 .. v17}, La/qv2;-><init>(La/ii;La/xak;La/a6u;La/wyu;La/y3v;La/i1w0;La/evz;La/mne;La/s64;La/wgu;La/dpc;La/ani0;La/duj;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, La/fiu0;

    .line 107
    .line 108
    iget-object v2, v4, La/qv2;->n:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, La/ugi;

    .line 111
    .line 112
    const-class v3, La/mkt;

    .line 113
    .line 114
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 119
    .line 120
    .line 121
    iput-object v1, v0, La/hkt;->K1:La/fiu0;

    .line 122
    .line 123
    iput-object v5, v0, La/hkt;->L1:La/ii;

    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 127
    .line 128
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/hkt;->I0()La/mkt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/mkt;->m:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/j0s;

    .line 8
    .line 9
    const/16 v2, 0xd

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p0, v3, v2}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v4, La/fns;

    .line 30
    .line 31
    invoke-direct {v4, v0, p0, v1, v3}, La/fns;-><init>(La/gmq;La/clz;La/j0s;La/yje;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 6
    .line 7
    invoke-static {v0, v1}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 12
    .line 13
    if-nez v0, :cond_a

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, v2}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_a

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/hkt;->J0(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, La/hkt;->K0()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object v0, La/j3c0;->f2:La/rl70;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/j3c0;

    .line 52
    .line 53
    invoke-direct {v0}, La/j3c0;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v2, La/j3c0;->h2:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/hkt;->I0()La/mkt;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, v0, La/mkt;->n:La/bby;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-interface {v1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    iput-object v2, v0, La/mkt;->n:La/bby;

    .line 74
    .line 75
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iget-object v1, v0, La/mkt;->g:La/mne;

    .line 80
    .line 81
    iget-object v7, v1, La/mne;->b:La/dvj;

    .line 82
    .line 83
    sget-object v8, La/lkt;->a:La/lkt;

    .line 84
    .line 85
    new-instance v9, La/gkr;

    .line 86
    .line 87
    const/16 v1, 0x9

    .line 88
    .line 89
    invoke-direct {v9, v0, v2, v1}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 90
    .line 91
    .line 92
    const/16 v10, 0x20

    .line 93
    .line 94
    const-wide/16 v4, 0x1

    .line 95
    .line 96
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 97
    .line 98
    invoke-static/range {v3 .. v10}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iput-object v1, v0, La/mkt;->n:La/bby;

    .line 103
    .line 104
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    .line 106
    const/16 v1, 0x1e

    .line 107
    .line 108
    const-string v3, "passive"

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    const-string v5, "location"

    .line 112
    .line 113
    const-string v6, "network"

    .line 114
    .line 115
    const-string v7, "locationManager"

    .line 116
    .line 117
    if-lt v0, v1, :cond_6

    .line 118
    .line 119
    iget-object v0, p0, La/hkt;->Y1:Landroid/os/CancellationSignal;

    .line 120
    .line 121
    if-eqz v0, :cond_2

    .line 122
    .line 123
    return-void

    .line 124
    :cond_2
    new-instance v0, Landroid/os/CancellationSignal;

    .line 125
    .line 126
    invoke-direct {v0}, Landroid/os/CancellationSignal;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, La/hkt;->Y1:Landroid/os/CancellationSignal;

    .line 130
    .line 131
    iget-object v0, p0, La/hkt;->S1:Landroid/location/LocationManager;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-eqz v1, :cond_3

    .line 140
    .line 141
    invoke-virtual {v1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast v1, Landroid/location/LocationManager;

    .line 149
    .line 150
    invoke-virtual {v1, v6}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    :cond_3
    if-eqz v4, :cond_4

    .line 155
    .line 156
    move-object v3, v6

    .line 157
    :cond_4
    iget-object v1, p0, La/hkt;->Y1:Landroid/os/CancellationSignal;

    .line 158
    .line 159
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {v2}, La/uvk;->k(La/kxq;)Ljava/util/concurrent/Executor;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget-object p0, p0, La/hkt;->U1:La/n0o0;

    .line 168
    .line 169
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Ljava/util/function/Consumer;

    .line 174
    .line 175
    invoke-static {v0, v3, v1, v2, p0}, La/a7;->s(Landroid/location/LocationManager;Ljava/lang/String;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v2

    .line 183
    :cond_6
    iget-object v0, p0, La/hkt;->S1:Landroid/location/LocationManager;

    .line 184
    .line 185
    if-eqz v0, :cond_9

    .line 186
    .line 187
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    invoke-virtual {v1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    check-cast v1, Landroid/location/LocationManager;

    .line 201
    .line 202
    invoke-virtual {v1, v6}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    :cond_7
    if-eqz v4, :cond_8

    .line 207
    .line 208
    move-object v3, v6

    .line 209
    :cond_8
    iget-object p0, p0, La/hkt;->V1:La/n0o0;

    .line 210
    .line 211
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, Landroid/location/LocationListener;

    .line 216
    .line 217
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v0, v3, p0, v1}, Landroid/location/LocationManager;->requestSingleUpdate(Ljava/lang/String;Landroid/location/LocationListener;Landroid/os/Looper;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_9
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v2

    .line 229
    :cond_a
    iget-object p0, p0, La/hkt;->W1:La/ywq;

    .line 230
    .line 231
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {p0, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final H0()La/tlt;
    .locals 2

    .line 1
    sget-object v0, La/hkt;->a2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hkt;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/tlt;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/mkt;
    .locals 0

    .line 1
    iget-object p0, p0, La/hkt;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mkt;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0()V
    .locals 13

    .line 1
    iget-object v0, p0, La/hkt;->L1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f130162

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f13096d

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const v4, 0x7f130ec2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v5, 0x7f13032f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sget-object v10, La/n12;->a:La/n12;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x5d0

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const-string v7, "LOCATION_SETTINGS_RESULT"

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string p0, "actionDialogManager"

    .line 63
    .line 64
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method

.method public final L0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/tlt;->b:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/j3c0;->f2:La/rl70;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, La/j3c0;->h2:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    instance-of v0, p0, La/j3c0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    check-cast p0, La/j3c0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hkt;->W1:La/ywq;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ywq;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/hkt;->X1:La/ywq;

    .line 7
    .line 8
    invoke-virtual {v0}, La/ywq;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/hkt;->Y1:Landroid/os/CancellationSignal;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, La/hkt;->Y1:Landroid/os/CancellationSignal;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 23
    .line 24
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-static {p2, v0}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance p2, La/yhb;

    .line 24
    .line 25
    invoke-direct {p2, p1}, La/yhb;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-static {p1, p2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, La/hkt;->a2:[La/iiy;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    aget-object v1, p1, p2

    .line 37
    .line 38
    iget-object v2, p0, La/hkt;->O1:La/yzn0;

    .line 39
    .line 40
    invoke-virtual {v2, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/rlt;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x2

    .line 51
    const/16 v3, 0x8

    .line 52
    .line 53
    const v4, 0x7f13096b

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_6

    .line 57
    .line 58
    if-eq v1, p2, :cond_2

    .line 59
    .line 60
    if-ne v1, v2, :cond_1

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    aget-object v1, p1, v2

    .line 69
    .line 70
    iget-object v5, p0, La/hkt;->P1:La/cgx0;

    .line 71
    .line 72
    invoke-virtual {v5, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    const-string v6, "location"

    .line 89
    .line 90
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v1, Landroid/location/LocationManager;

    .line 98
    .line 99
    iput-object v1, p0, La/hkt;->S1:Landroid/location/LocationManager;

    .line 100
    .line 101
    :cond_3
    invoke-virtual {p0}, La/hkt;->G0()V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v1, v1, La/tlt;->f:Landroid/widget/TextView;

    .line 109
    .line 110
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, La/tlt;->b:Lcom/google/android/material/button/MaterialButton;

    .line 118
    .line 119
    aget-object p1, p1, v2

    .line 120
    .line 121
    invoke-virtual {v5, p0, p1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_5

    .line 130
    .line 131
    move p1, v0

    .line 132
    goto :goto_0

    .line 133
    :cond_5
    move p1, v3

    .line 134
    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, La/tlt;->d:Lcom/google/android/material/button/MaterialButton;

    .line 142
    .line 143
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p1, p1, La/tlt;->e:Lcom/google/android/material/button/MaterialButton;

    .line 151
    .line 152
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_6
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, La/tlt;->f:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object p1, p1, La/tlt;->b:Lcom/google/android/material/button/MaterialButton;

    .line 170
    .line 171
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object p1, p1, La/tlt;->d:Lcom/google/android/material/button/MaterialButton;

    .line 179
    .line 180
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object p1, p1, La/tlt;->e:Lcom/google/android/material/button/MaterialButton;

    .line 188
    .line 189
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    :goto_1
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object p1, p1, La/tlt;->d:Lcom/google/android/material/button/MaterialButton;

    .line 197
    .line 198
    new-instance v1, La/fkt;

    .line 199
    .line 200
    invoke-direct {v1, p0, v0}, La/fkt;-><init>(La/hkt;B)V

    .line 201
    .line 202
    .line 203
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    iget-object p1, p1, La/tlt;->e:Lcom/google/android/material/button/MaterialButton;

    .line 211
    .line 212
    new-instance v1, La/fkt;

    .line 213
    .line 214
    invoke-direct {v1, p0, p2}, La/fkt;-><init>(La/hkt;B)V

    .line 215
    .line 216
    .line 217
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, La/hkt;->H0()La/tlt;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iget-object p1, p1, La/tlt;->b:Lcom/google/android/material/button/MaterialButton;

    .line 225
    .line 226
    new-instance v1, La/fkt;

    .line 227
    .line 228
    invoke-direct {v1, p0, v2}, La/fkt;-><init>(La/hkt;B)V

    .line 229
    .line 230
    .line 231
    invoke-static {p1, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 232
    .line 233
    .line 234
    new-instance p1, La/dkt;

    .line 235
    .line 236
    invoke-direct {p1, p0, v2}, La/dkt;-><init>(La/hkt;B)V

    .line 237
    .line 238
    .line 239
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 240
    .line 241
    .line 242
    new-instance p1, La/dkt;

    .line 243
    .line 244
    invoke-direct {p1, p0, v0}, La/dkt;-><init>(La/hkt;B)V

    .line 245
    .line 246
    .line 247
    const-string v0, "LOCATION_SETTINGS_RESULT"

    .line 248
    .line 249
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 250
    .line 251
    .line 252
    new-instance p1, La/dkt;

    .line 253
    .line 254
    invoke-direct {p1, p0, p2}, La/dkt;-><init>(La/hkt;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 258
    .line 259
    .line 260
    return-void
.end method
