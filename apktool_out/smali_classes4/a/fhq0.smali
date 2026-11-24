.class public final La/fhq0;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/ssh;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/fhq0;",
        "La/nw5;",
        "La/ssh;",
        "<init>",
        "()V",
        "a/m6m0",
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
.field public static final q2:La/m6m0;

.field public static final synthetic r2:[La/iiy;

.field public static final s2:Ljava/lang/String;


# instance fields
.field public final e2:La/yg40;

.field public final f2:La/zz2;

.field public final g2:La/r34;

.field public final h2:La/r34;

.field public final i2:La/cgx0;

.field public final j2:La/cgx0;

.field public final k2:La/cgx0;

.field public final l2:La/cgx0;

.field public m2:J

.field public n2:La/ygq0;

.field public o2:Lkotlin/Pair;

.field public final p2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/fhq0;

    .line 4
    .line 5
    const-string v2, "selectedTimeFilter"

    .line 6
    .line 7
    const-string v3, "getSelectedTimeFilter()I"

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
    const-string v3, "startTime"

    .line 16
    .line 17
    const-string v5, "getStartTime()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "endTime"

    .line 25
    .line 26
    const-string v6, "getEndTime()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "isDayFilter"

    .line 34
    .line 35
    const-string v7, "isDayFilter()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "isAscendingDate"

    .line 43
    .line 44
    const-string v8, "isAscendingDate()Z"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "cyber"

    .line 52
    .line 53
    const-string v9, "getCyber()Z"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "fromChamps"

    .line 61
    .line 62
    const-string v10, "getFromChamps()Z"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v9, La/j0d0;

    .line 68
    .line 69
    const-string v10, "binding"

    .line 70
    .line 71
    const-string v11, "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergameBottomSheetTimeFilterDialogBinding;"

    .line 72
    .line 73
    invoke-direct {v9, v1, v10, v11, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    const/16 v10, 0x8

    .line 77
    .line 78
    new-array v10, v10, [La/iiy;

    .line 79
    .line 80
    aput-object v0, v10, v4

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    aput-object v2, v10, v0

    .line 84
    .line 85
    const/4 v0, 0x2

    .line 86
    aput-object v3, v10, v0

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    aput-object v5, v10, v0

    .line 90
    .line 91
    const/4 v0, 0x4

    .line 92
    aput-object v6, v10, v0

    .line 93
    .line 94
    const/4 v0, 0x5

    .line 95
    aput-object v7, v10, v0

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    aput-object v8, v10, v0

    .line 99
    .line 100
    const/4 v0, 0x7

    .line 101
    aput-object v9, v10, v0

    .line 102
    .line 103
    sput-object v10, La/fhq0;->r2:[La/iiy;

    .line 104
    .line 105
    new-instance v0, La/m6m0;

    .line 106
    .line 107
    const/16 v2, 0x14

    .line 108
    .line 109
    invoke-direct {v0, v2}, La/m6m0;-><init>(B)V

    .line 110
    .line 111
    .line 112
    sput-object v0, La/fhq0;->q2:La/m6m0;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, La/fhq0;->s2:Ljava/lang/String;

    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/yg40;->c:La/yg40;

    .line 5
    .line 6
    iput-object v0, p0, La/fhq0;->e2:La/yg40;

    .line 7
    .line 8
    new-instance v0, La/zz2;

    .line 9
    .line 10
    const-string v1, "KEY_TIME_FILTER"

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/fhq0;->f2:La/zz2;

    .line 16
    .line 17
    new-instance v0, La/r34;

    .line 18
    .line 19
    const-string v1, "KEY_START_TIME_FILTER"

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/fhq0;->g2:La/r34;

    .line 25
    .line 26
    new-instance v0, La/r34;

    .line 27
    .line 28
    const-string v1, "KEY_END_TIME_FILTER"

    .line 29
    .line 30
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/fhq0;->h2:La/r34;

    .line 34
    .line 35
    new-instance v0, La/cgx0;

    .line 36
    .line 37
    const-string v1, "KEY_IS_DAY_FILTER"

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/fhq0;->i2:La/cgx0;

    .line 43
    .line 44
    new-instance v0, La/cgx0;

    .line 45
    .line 46
    const-string v1, "KEY_IS_ASCENDING_DATE"

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/fhq0;->j2:La/cgx0;

    .line 52
    .line 53
    new-instance v0, La/cgx0;

    .line 54
    .line 55
    const-string v1, "KEY_CYBER"

    .line 56
    .line 57
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/fhq0;->k2:La/cgx0;

    .line 61
    .line 62
    new-instance v0, La/cgx0;

    .line 63
    .line 64
    const-string v1, "KEY_FROM_CHAMPS"

    .line 65
    .line 66
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, La/fhq0;->l2:La/cgx0;

    .line 70
    .line 71
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/16 v1, 0xc

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    int-to-double v2, v2

    .line 82
    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    .line 83
    .line 84
    div-double/2addr v2, v4

    .line 85
    invoke-static {v2, v3}, La/si30;->a(D)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    mul-int/lit8 v2, v2, 0x5

    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 92
    .line 93
    .line 94
    const/16 v1, 0xd

    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 98
    .line 99
    .line 100
    const/16 v1, 0xe

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    iput-wide v0, p0, La/fhq0;->m2:J

    .line 110
    .line 111
    sget-object v0, La/ygq0;->c:La/ygq0;

    .line 112
    .line 113
    iput-object v0, p0, La/fhq0;->n2:La/ygq0;

    .line 114
    .line 115
    new-instance v0, Lkotlin/Pair;

    .line 116
    .line 117
    new-instance v1, La/ynq0;

    .line 118
    .line 119
    const-wide/16 v2, -0x1

    .line 120
    .line 121
    invoke-direct {v1, v2, v3}, La/ynq0;-><init>(J)V

    .line 122
    .line 123
    .line 124
    new-instance v4, La/ynq0;

    .line 125
    .line 126
    invoke-direct {v4, v2, v3}, La/ynq0;-><init>(J)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v0, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/fhq0;->o2:Lkotlin/Pair;

    .line 133
    .line 134
    sget-object v0, La/ehq0;->a:La/ehq0;

    .line 135
    .line 136
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, La/fhq0;->p2:La/nae0;

    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/fhq0;->r2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/fhq0;->p2:La/nae0;

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
    check-cast p0, La/ssh;

    .line 16
    .line 17
    return-object p0
.end method

.method public final O0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/fhq0;->V0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, La/b0l0;

    .line 9
    .line 10
    const/16 v2, 0x12

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v2, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 16
    .line 17
    invoke-virtual {v0, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f1315ae

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final T0(La/ygq0;)V
    .locals 10

    .line 1
    iget-byte v0, p1, La/ygq0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/fhq0;->r2:[La/iiy;

    .line 5
    .line 6
    aget-object v1, v2, v1

    .line 7
    .line 8
    iget-object v3, p0, La/fhq0;->f2:La/zz2;

    .line 9
    .line 10
    invoke-virtual {v3, p0, v1, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/fhq0;->n2:La/ygq0;

    .line 14
    .line 15
    new-instance v4, La/hhq0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aget-object v0, v2, v0

    .line 19
    .line 20
    iget-object v1, p0, La/fhq0;->g2:La/r34;

    .line 21
    .line 22
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v6

    .line 30
    const/4 v0, 0x2

    .line 31
    aget-object v0, v2, v0

    .line 32
    .line 33
    iget-object v1, p0, La/fhq0;->h2:La/r34;

    .line 34
    .line 35
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v8

    .line 43
    move-object v5, p1

    .line 44
    invoke-direct/range {v4 .. v9}, La/hhq0;-><init>(La/ygq0;JJ)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lkotlin/Pair;

    .line 48
    .line 49
    const-string v0, "REQUEST_TIME_FILTER"

    .line 50
    .line 51
    invoke-direct {p1, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final U0()V
    .locals 13

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, La/fhq0;->m2:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 8
    .line 9
    .line 10
    new-instance v5, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-static {v1, v2, v0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 21
    .line 22
    const/16 v3, 0xb

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/16 v4, 0xc

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-direct {v2, v3, v0}, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;-><init>(II)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v5, v1, v2}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {v0, v1, v1}, Ljava/util/Calendar;->add(II)V

    .line 46
    .line 47
    .line 48
    new-instance v6, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3, v0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-direct {v6, v0, v2}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, La/xej;->l2:La/nwd;

    .line 63
    .line 64
    const v3, 0x7f13030f

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v3, La/fhq0;->r2:[La/iiy;

    .line 75
    .line 76
    aget-object v1, v3, v1

    .line 77
    .line 78
    iget-object v7, p0, La/fhq0;->g2:La/r34;

    .line 79
    .line 80
    invoke-virtual {v7, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    const-wide/16 v9, 0x0

    .line 89
    .line 90
    cmp-long v7, v7, v9

    .line 91
    .line 92
    if-lez v7, :cond_0

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    move-object v1, v2

    .line 96
    :goto_0
    if-eqz v1, :cond_1

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    iget-wide v7, p0, La/fhq0;->m2:J

    .line 104
    .line 105
    :goto_1
    const/4 v1, 0x2

    .line 106
    aget-object v1, v3, v1

    .line 107
    .line 108
    iget-object v3, p0, La/fhq0;->h2:La/r34;

    .line 109
    .line 110
    invoke-virtual {v3, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v11

    .line 118
    cmp-long v3, v11, v9

    .line 119
    .line 120
    if-lez v3, :cond_2

    .line 121
    .line 122
    move-object v10, v1

    .line 123
    :goto_2
    move-wide v1, v7

    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move-object v10, v2

    .line 126
    goto :goto_2

    .line 127
    :goto_3
    sget-object v7, La/ulq0;->a:La/ulq0;

    .line 128
    .line 129
    new-instance v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 130
    .line 131
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    iget-object v8, p0, La/fhq0;->e2:La/yg40;

    .line 136
    .line 137
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;La/ulq0;La/yg40;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {v3, p0}, La/nwd;->f(Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;Landroidx/fragment/app/e;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final V0()V
    .locals 21

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    new-instance v8, Lkotlin/Pair;

    .line 4
    .line 5
    sget-object v0, La/fhq0;->r2:[La/iiy;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    aget-object v1, v0, v9

    .line 9
    .line 10
    iget-object v3, v2, La/fhq0;->g2:La/r34;

    .line 11
    .line 12
    invoke-virtual {v3, v2, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    new-instance v1, La/ynq0;

    .line 21
    .line 22
    invoke-direct {v1, v3, v4}, La/ynq0;-><init>(J)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    aget-object v3, v0, v3

    .line 27
    .line 28
    iget-object v4, v2, La/fhq0;->h2:La/r34;

    .line 29
    .line 30
    invoke-virtual {v4, v2, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    new-instance v5, La/ynq0;

    .line 39
    .line 40
    invoke-direct {v5, v3, v4}, La/ynq0;-><init>(J)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v8, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    aget-object v1, v0, v1

    .line 48
    .line 49
    iget-object v5, v2, La/fhq0;->p2:La/nae0;

    .line 50
    .line 51
    invoke-interface {v5, v1, v2}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v1, La/ssh;

    .line 59
    .line 60
    iget-object v10, v1, La/ssh;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    iget-object v1, v2, La/fhq0;->n2:La/ygq0;

    .line 63
    .line 64
    sget-object v5, La/ygq0;->p:La/ygq0;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    iget-object v7, v2, La/fhq0;->f2:La/zz2;

    .line 68
    .line 69
    if-ne v1, v5, :cond_0

    .line 70
    .line 71
    const-wide/16 v11, -0x1

    .line 72
    .line 73
    cmp-long v1, v3, v11

    .line 74
    .line 75
    if-nez v1, :cond_0

    .line 76
    .line 77
    sget-object v1, La/ygq0;->c:La/ygq0;

    .line 78
    .line 79
    iput-object v1, v2, La/fhq0;->n2:La/ygq0;

    .line 80
    .line 81
    invoke-static {v1}, La/ipm0;->i(La/ygq0;)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    aget-object v3, v0, v6

    .line 86
    .line 87
    invoke-virtual {v7, v2, v3, v1}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    sget-object v1, La/ygq0;->b:La/j6m0;

    .line 92
    .line 93
    aget-object v3, v0, v6

    .line 94
    .line 95
    invoke-virtual {v7, v2, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, La/j6m0;->a(I)La/ygq0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, v2, La/fhq0;->n2:La/ygq0;

    .line 111
    .line 112
    :goto_0
    iput-object v8, v2, La/fhq0;->o2:Lkotlin/Pair;

    .line 113
    .line 114
    new-instance v20, La/zgq0;

    .line 115
    .line 116
    iget-object v1, v2, La/fhq0;->n2:La/ygq0;

    .line 117
    .line 118
    const/4 v3, 0x6

    .line 119
    aget-object v3, v0, v3

    .line 120
    .line 121
    iget-object v4, v2, La/fhq0;->l2:La/cgx0;

    .line 122
    .line 123
    invoke-virtual {v4, v2, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_1

    .line 132
    .line 133
    sget-object v0, La/ygq0;->b:La/j6m0;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {}, La/j6m0;->d()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_1
    move-object v11, v0

    .line 143
    goto :goto_2

    .line 144
    :cond_1
    const/4 v3, 0x5

    .line 145
    aget-object v3, v0, v3

    .line 146
    .line 147
    iget-object v4, v2, La/fhq0;->k2:La/cgx0;

    .line 148
    .line 149
    invoke-virtual {v4, v2, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_2

    .line 158
    .line 159
    sget-object v0, La/ygq0;->b:La/j6m0;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    sget-object v11, La/ygq0;->c:La/ygq0;

    .line 165
    .line 166
    sget-object v12, La/ygq0;->d:La/ygq0;

    .line 167
    .line 168
    sget-object v13, La/ygq0;->e:La/ygq0;

    .line 169
    .line 170
    sget-object v14, La/ygq0;->f:La/ygq0;

    .line 171
    .line 172
    sget-object v15, La/ygq0;->g:La/ygq0;

    .line 173
    .line 174
    sget-object v16, La/ygq0;->h:La/ygq0;

    .line 175
    .line 176
    sget-object v17, La/ygq0;->i:La/ygq0;

    .line 177
    .line 178
    sget-object v18, La/ygq0;->j:La/ygq0;

    .line 179
    .line 180
    move-object/from16 v19, v5

    .line 181
    .line 182
    filled-new-array/range {v11 .. v19}, [La/ygq0;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    goto :goto_1

    .line 191
    :cond_2
    sget-object v3, La/ygq0;->b:La/j6m0;

    .line 192
    .line 193
    const/4 v4, 0x3

    .line 194
    aget-object v0, v0, v4

    .line 195
    .line 196
    iget-object v4, v2, La/fhq0;->i2:La/cgx0;

    .line 197
    .line 198
    invoke-virtual {v4, v2, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {v0}, La/j6m0;->c(Z)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    goto :goto_1

    .line 214
    :goto_2
    new-instance v0, La/w6q0;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    const/16 v7, 0xb

    .line 218
    .line 219
    move-object v3, v1

    .line 220
    const/4 v1, 0x1

    .line 221
    move-object v4, v3

    .line 222
    const-class v3, La/fhq0;

    .line 223
    .line 224
    move-object v5, v4

    .line 225
    const-string v4, "onFilterSelected"

    .line 226
    .line 227
    move-object v12, v5

    .line 228
    const-string v5, "onFilterSelected(Lorg/xplatform/feed/domain/models/TimeFilter;)V"

    .line 229
    .line 230
    invoke-direct/range {v0 .. v7}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 231
    .line 232
    .line 233
    move-object v13, v0

    .line 234
    new-instance v0, La/cym0;

    .line 235
    .line 236
    const/16 v7, 0xd

    .line 237
    .line 238
    const/4 v1, 0x0

    .line 239
    const-string v4, "onSelectTimePeriod"

    .line 240
    .line 241
    const-string v5, "onSelectTimePeriod()V"

    .line 242
    .line 243
    move-object/from16 v2, p0

    .line 244
    .line 245
    invoke-direct/range {v0 .. v7}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 246
    .line 247
    .line 248
    move-object v14, v0

    .line 249
    new-instance v0, La/cym0;

    .line 250
    .line 251
    const/16 v7, 0xe

    .line 252
    .line 253
    const-string v4, "onSelectTimePeriod"

    .line 254
    .line 255
    const-string v5, "onSelectTimePeriod()V"

    .line 256
    .line 257
    invoke-direct/range {v0 .. v7}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 258
    .line 259
    .line 260
    move-object v15, v0

    .line 261
    new-instance v0, La/cym0;

    .line 262
    .line 263
    const/16 v7, 0xf

    .line 264
    .line 265
    const-string v4, "onSelectTimeTitleClick"

    .line 266
    .line 267
    const-string v5, "onSelectTimeTitleClick()V"

    .line 268
    .line 269
    invoke-direct/range {v0 .. v7}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 270
    .line 271
    .line 272
    move-object v7, v0

    .line 273
    move-object v6, v8

    .line 274
    move-object v2, v11

    .line 275
    move-object v1, v12

    .line 276
    move-object v3, v13

    .line 277
    move-object v4, v14

    .line 278
    move-object v5, v15

    .line 279
    move-object/from16 v0, v20

    .line 280
    .line 281
    invoke-direct/range {v0 .. v7}, La/zgq0;-><init>(La/ygq0;Ljava/util/List;La/w6q0;La/cym0;La/cym0;Lkotlin/Pair;La/cym0;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 285
    .line 286
    .line 287
    new-instance v0, La/wn8;

    .line 288
    .line 289
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    const v2, 0x7f08048e

    .line 294
    .line 295
    .line 296
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-direct {v0, v1, v9}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/nw5;->J0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/fhq0;->n2:La/ygq0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/fhq0;->T0(La/ygq0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
