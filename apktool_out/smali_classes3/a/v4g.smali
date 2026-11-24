.class public final La/v4g;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/w4g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/v4g;",
        "La/stl;",
        "La/w4g;",
        "<init>",
        "()V",
        "a/kud",
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
.field public static final l2:La/kud;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public g2:La/fiu0;

.field public final h2:La/nae0;

.field public final i2:La/kiu0;

.field public final j2:La/khf0;

.field public final k2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/v4g;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarChampInfoDialogBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "ufcCalendar"

    .line 25
    .line 26
    const-string v6, "getUfcCalendar()Z"

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
    sput-object v1, La/v4g;->m2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kud;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/v4g;->l2:La/kud;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u4g;->a:La/u4g;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/v4g;->h2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/jwd;

    .line 13
    .line 14
    const/16 v1, 0x1a

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/aqe;

    .line 20
    .line 21
    const/16 v2, 0x16

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sget-object v3, La/wez;->b:La/wez;

    .line 27
    .line 28
    new-instance v4, La/aqe;

    .line 29
    .line 30
    const/16 v5, 0x17

    .line 31
    .line 32
    invoke-direct {v4, v1, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-class v3, La/x4g;

    .line 40
    .line 41
    sget-object v4, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v4, La/cce;

    .line 48
    .line 49
    invoke-direct {v4, v1, v2}, La/cce;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/cce;

    .line 53
    .line 54
    invoke-direct {v2, v1, v5}, La/cce;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/v4g;->i2:La/kiu0;

    .line 62
    .line 63
    new-instance v0, La/khf0;

    .line 64
    .line 65
    const-string v1, "CHAMP_INFO_PARAMS"

    .line 66
    .line 67
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, La/v4g;->j2:La/khf0;

    .line 71
    .line 72
    new-instance v0, La/yzn0;

    .line 73
    .line 74
    const-string v1, "UFC_KEY"

    .line 75
    .line 76
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, La/v4g;->k2:La/yzn0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/v4g;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/v4g;->h2:La/nae0;

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
    check-cast p0, La/w4g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final T0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/s4g;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/s4g;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/s4g;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/v4g;->m2:[La/iiy;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    aget-object v1, v1, v3

    .line 63
    .line 64
    iget-object v3, p0, La/v4g;->k2:La/yzn0;

    .line 65
    .line 66
    invoke-virtual {v3, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Boolean;

    .line 71
    .line 72
    iget-object v3, v2, La/s4g;->a:La/pyg;

    .line 73
    .line 74
    iget-object v4, v2, La/s4g;->b:La/ugf0;

    .line 75
    .line 76
    iget-object v5, v2, La/s4g;->c:La/oeg0;

    .line 77
    .line 78
    iget-object v2, v2, La/s4g;->d:La/kys0;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v6, La/ywq0;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v3, v6, La/ywq0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v0, v6, La/ywq0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v5, v6, La/ywq0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v1, v6, La/ywq0;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v4, v6, La/ywq0;->e:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v2, v6, La/ywq0;->f:Ljava/lang/Object;

    .line 102
    .line 103
    new-instance v0, La/uci;

    .line 104
    .line 105
    const/16 v1, 0xc

    .line 106
    .line 107
    invoke-direct {v0, v6, v1}, La/uci;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    iput-object v0, v6, La/ywq0;->g:Ljava/lang/Object;

    .line 111
    .line 112
    new-instance v0, La/fiu0;

    .line 113
    .line 114
    iget-object v1, v6, La/ywq0;->g:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, La/uci;

    .line 117
    .line 118
    const-class v2, La/x4g;

    .line 119
    .line 120
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 125
    .line 126
    .line 127
    iput-object v0, p0, La/v4g;->g2:La/fiu0;

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;
    .locals 2

    .line 1
    sget-object v0, La/v4g;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/v4g;->j2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/stl;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/v4g;->m2:[La/iiy;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    aget-object v0, p1, p2

    .line 11
    .line 12
    iget-object v1, p0, La/v4g;->h2:La/nae0;

    .line 13
    .line 14
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, La/w4g;

    .line 22
    .line 23
    iget-object v1, v0, La/w4g;->k:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;

    .line 24
    .line 25
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, La/w4g;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 35
    .line 36
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-wide v2, v2, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->g:J

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    cmp-long v2, v2, v4

    .line 45
    .line 46
    if-lez v2, :cond_0

    .line 47
    .line 48
    new-instance v2, La/t4g;

    .line 49
    .line 50
    invoke-direct {v2, p0, p2}, La/t4g;-><init>(La/v4g;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const v3, 0x7f13098a

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    new-instance v2, La/t4g;

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-direct {v2, p0, v3}, La/t4g;-><init>(La/v4g;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const v3, 0x7f130479

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object v1, v0, La/w4g;->h:Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v2, v2, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->c:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 112
    .line 113
    iget-object v2, v0, La/w4g;->d:Landroid/widget/ImageView;

    .line 114
    .line 115
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v3, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->d:Ljava/lang/String;

    .line 120
    .line 121
    const/4 v1, 0x2

    .line 122
    aget-object p1, p1, v1

    .line 123
    .line 124
    iget-object v1, p0, La/v4g;->k2:La/yzn0;

    .line 125
    .line 126
    invoke-virtual {v1, p0, p1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_1

    .line 137
    .line 138
    const p1, 0x7f080c18

    .line 139
    .line 140
    .line 141
    :goto_1
    move v4, p1

    .line 142
    goto :goto_2

    .line 143
    :cond_1
    const p1, 0x7f0808bb

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :goto_2
    const/4 v8, 0x0

    .line 148
    const/16 v9, 0x1fc

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 154
    .line 155
    .line 156
    iget-object p1, v0, La/w4g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 157
    .line 158
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    const/16 v2, 0x8

    .line 169
    .line 170
    if-lez v1, :cond_2

    .line 171
    .line 172
    move v1, p2

    .line 173
    goto :goto_3

    .line 174
    :cond_2
    move v1, v2

    .line 175
    :goto_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    iget-object p1, v0, La/w4g;->g:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->b:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, v0, La/w4g;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 190
    .line 191
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->e:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-lez v1, :cond_3

    .line 202
    .line 203
    move v1, p2

    .line 204
    goto :goto_4

    .line 205
    :cond_3
    move v1, v2

    .line 206
    :goto_4
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    iget-object p1, v0, La/w4g;->j:Landroid/widget/TextView;

    .line 210
    .line 211
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->e:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, v0, La/w4g;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 221
    .line 222
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->f:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-lez v1, :cond_4

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_4
    move p2, v2

    .line 236
    :goto_5
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 237
    .line 238
    .line 239
    iget-object p1, v0, La/w4g;->i:Landroid/widget/TextView;

    .line 240
    .line 241
    invoke-virtual {p0}, La/v4g;->V0()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->f:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    return-void
.end method
