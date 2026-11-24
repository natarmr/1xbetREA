.class public final La/job;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/que;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/job;",
        "La/stl;",
        "La/que;",
        "<init>",
        "()V",
        "a/yk5",
        "impl"
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
.field public static final o2:La/yk5;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final g2:La/phf0;

.field public final h2:La/zz2;

.field public final i2:La/zz2;

.field public final j2:La/r34;

.field public final k2:La/nae0;

.field public l2:La/fiu0;

.field public final m2:La/kiu0;

.field public final n2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/job;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "currentBlockId"

    .line 25
    .line 26
    const-string v6, "getCurrentBlockId()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "eventId"

    .line 34
    .line 35
    const-string v7, "getEventId()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "binding"

    .line 43
    .line 44
    const-string v8, "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponChangeBlockDialogBinding;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/job;->p2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/yk5;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/job;->o2:La/yk5;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/job;->g2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/zz2;

    .line 14
    .line 15
    const-string v1, "EXTRA_TITLE"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/job;->h2:La/zz2;

    .line 21
    .line 22
    new-instance v0, La/zz2;

    .line 23
    .line 24
    const-string v1, "EXTRA_CURRENT_BOCK_ID"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/job;->i2:La/zz2;

    .line 30
    .line 31
    new-instance v0, La/r34;

    .line 32
    .line 33
    const-string v1, "EXTRA_EVENT_ID"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/job;->j2:La/r34;

    .line 39
    .line 40
    sget-object v0, La/iob;->a:La/iob;

    .line 41
    .line 42
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/job;->k2:La/nae0;

    .line 47
    .line 48
    new-instance v0, La/hob;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, p0, v1}, La/hob;-><init>(La/job;B)V

    .line 52
    .line 53
    .line 54
    new-instance v1, La/h79;

    .line 55
    .line 56
    const/16 v2, 0xe

    .line 57
    .line 58
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    sget-object v2, La/wez;->b:La/wez;

    .line 62
    .line 63
    new-instance v3, La/h79;

    .line 64
    .line 65
    const/16 v4, 0xf

    .line 66
    .line 67
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const-class v3, La/nob;

    .line 75
    .line 76
    sget-object v4, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v4, La/rt6;

    .line 83
    .line 84
    const/16 v5, 0x1c

    .line 85
    .line 86
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 87
    .line 88
    .line 89
    new-instance v5, La/rt6;

    .line 90
    .line 91
    const/16 v6, 0x1d

    .line 92
    .line 93
    invoke-direct {v5, v1, v6}, La/rt6;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/job;->m2:La/kiu0;

    .line 101
    .line 102
    new-instance v0, La/hob;

    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    invoke-direct {v0, p0, v1}, La/hob;-><init>(La/job;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, La/job;->n2:La/a8z;

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/job;->p2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/job;->k2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/que;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()V
    .locals 5

    .line 1
    new-instance v0, La/kp8;

    .line 2
    .line 3
    sget-object v1, La/job;->p2:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v3, v1, v2

    .line 7
    .line 8
    iget-object v4, p0, La/job;->h2:La/zz2;

    .line 9
    .line 10
    invoke-virtual {v4, p0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v0, v3, v4}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, La/stl;->I0(La/kp8;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    aget-object v0, v1, v0

    .line 34
    .line 35
    iget-object v1, p0, La/job;->k2:La/nae0;

    .line 36
    .line 37
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast v0, La/que;

    .line 45
    .line 46
    iget-object v0, v0, La/que;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/job;->n2:La/a8z;

    .line 61
    .line 62
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/oue;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, La/job;->m2:La/kiu0;

    .line 72
    .line 73
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/nob;

    .line 78
    .line 79
    iget-object v0, v0, La/nob;->e:La/p7m0;

    .line 80
    .line 81
    new-instance v1, La/fob;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v1, p0, v3, v2}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    sget-object v2, La/lkz;->a:La/lkz;

    .line 88
    .line 89
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v4, La/yxa;

    .line 102
    .line 103
    invoke-direct {v4, v0, p0, v1, v3}, La/yxa;-><init>(La/gmq;La/clz;La/fob;La/yje;)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x3

    .line 107
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final T0()V
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
    const-class v2, La/kob;

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
    instance-of v4, v1, La/kob;

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
    check-cast v3, La/kob;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    sget-object v2, La/job;->p2:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/job;->i2:La/zz2;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const/4 v1, 0x3

    .line 69
    aget-object v1, v2, v1

    .line 70
    .line 71
    iget-object v2, v0, La/job;->j2:La/r34;

    .line 72
    .line 73
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    iget-object v8, v3, La/kob;->a:La/mne;

    .line 78
    .line 79
    iget-object v9, v3, La/kob;->b:La/ctf0;

    .line 80
    .line 81
    iget-object v10, v3, La/kob;->c:La/lye;

    .line 82
    .line 83
    iget-object v11, v3, La/kob;->d:La/m0f;

    .line 84
    .line 85
    iget-object v12, v3, La/kob;->e:La/ave;

    .line 86
    .line 87
    iget-object v13, v3, La/kob;->f:La/us3;

    .line 88
    .line 89
    iget-object v14, v3, La/kob;->g:La/knf0;

    .line 90
    .line 91
    iget-object v15, v3, La/kob;->h:La/vwb0;

    .line 92
    .line 93
    iget-object v1, v3, La/kob;->i:La/q7d0;

    .line 94
    .line 95
    iget-object v2, v3, La/kob;->j:La/gii0;

    .line 96
    .line 97
    iget-object v3, v3, La/kob;->k:La/vby;

    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v5, La/qv2;

    .line 130
    .line 131
    move-object/from16 v16, v1

    .line 132
    .line 133
    move-object/from16 v17, v2

    .line 134
    .line 135
    invoke-direct/range {v5 .. v17}, La/qv2;-><init>(Ljava/lang/Integer;Ljava/lang/Long;La/mne;La/ctf0;La/lye;La/m0f;La/ave;La/us3;La/knf0;La/vwb0;La/q7d0;La/gii0;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, La/fiu0;

    .line 139
    .line 140
    iget-object v2, v5, La/qv2;->n:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/pai;

    .line 143
    .line 144
    const-class v3, La/nob;

    .line 145
    .line 146
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, v0, La/job;->l2:La/fiu0;

    .line 154
    .line 155
    return-void

    .line 156
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 157
    .line 158
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method
