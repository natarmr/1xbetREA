.class public final La/l6g;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/l6g;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final Q1:La/kwd;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/bei;

.field public L1:La/g2v;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/khf0;

.field public final P1:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l6g;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDaysOfWeekFragmentBinding;"

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
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;"

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
    sput-object v1, La/l6g;->R1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kwd;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/l6g;->Q1:La/kwd;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d00a9

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/jwd;

    .line 8
    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/aqe;

    .line 15
    .line 16
    const/16 v3, 0x1a

    .line 17
    .line 18
    invoke-direct {v2, p0, v3}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v4, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v5, La/aqe;

    .line 24
    .line 25
    invoke-direct {v5, v2, v1}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-class v4, La/w6g;

    .line 33
    .line 34
    sget-object v5, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    new-instance v5, La/cce;

    .line 41
    .line 42
    invoke-direct {v5, v2, v3}, La/cce;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v3, La/cce;

    .line 46
    .line 47
    invoke-direct {v3, v2, v1}, La/cce;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v4, v5, v3, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/l6g;->M1:La/kiu0;

    .line 55
    .line 56
    sget-object v0, La/i6g;->a:La/i6g;

    .line 57
    .line 58
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/l6g;->N1:La/s0r;

    .line 63
    .line 64
    new-instance v0, La/khf0;

    .line 65
    .line 66
    const-string v1, "params_key"

    .line 67
    .line 68
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, La/l6g;->O1:La/khf0;

    .line 72
    .line 73
    new-instance v0, La/yzn0;

    .line 74
    .line 75
    const-string v1, "ufc_key"

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/l6g;->P1:La/yzn0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f05000f

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const v0, 0x7f07071f

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v0, 0x7f0706e0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, La/l6g;->G0()La/m6g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/m6g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarWeekView;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1, v2, v0, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/l6g;->G0()La/m6g;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, p1, La/m6g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    const/16 v6, 0xa

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    move v4, v2

    .line 61
    invoke-static/range {v1 .. v6}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/l6g;->G0()La/m6g;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, p1, La/m6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 69
    .line 70
    invoke-static/range {v1 .. v6}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La/l6g;->R1:[La/iiy;

    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    aget-object p1, p1, v0

    .line 77
    .line 78
    iget-object v0, p0, La/l6g;->O1:La/khf0;

    .line 79
    .line 80
    invoke-virtual {v0, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 85
    .line 86
    iget-object p1, p1, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;->a:La/yag;

    .line 87
    .line 88
    sget-object v0, La/yag;->c:La/yag;

    .line 89
    .line 90
    if-ne p1, v0, :cond_1

    .line 91
    .line 92
    const/4 p1, 0x7

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    const/4 p1, 0x3

    .line 95
    :goto_1
    invoke-virtual {p0}, La/l6g;->G0()La/m6g;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-object p0, p0, La/m6g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;

    .line 100
    .line 101
    iput p1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/container/CyberCalendarGridView;->a:I

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final C0()V
    .locals 12

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
    const-class v1, La/lag;

    .line 22
    .line 23
    if-eqz v0, :cond_4

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
    instance-of v3, v0, La/lag;

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
    check-cast v2, La/lag;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/l6g;->R1:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/l6g;->O1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    aget-object v1, v1, v3

    .line 70
    .line 71
    iget-object v3, p0, La/l6g;->P1:La/yzn0;

    .line 72
    .line 73
    invoke-virtual {v3, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    iget-object v4, v2, La/lag;->a:La/cad;

    .line 84
    .line 85
    iget-object v5, v2, La/lag;->b:La/iip;

    .line 86
    .line 87
    iget-object v6, v2, La/lag;->c:La/m1e;

    .line 88
    .line 89
    iget-object v7, v2, La/lag;->d:La/g2v;

    .line 90
    .line 91
    iget-object v8, v2, La/lag;->e:La/ctf0;

    .line 92
    .line 93
    iget-object v9, v2, La/lag;->f:La/oeg0;

    .line 94
    .line 95
    iget-object v10, v2, La/lag;->g:La/sjl0;

    .line 96
    .line 97
    iget-object v11, v2, La/lag;->h:La/duj;

    .line 98
    .line 99
    if-eqz v3, :cond_3

    .line 100
    .line 101
    iget-object v2, v2, La/lag;->j:La/ul9;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    iget-object v2, v2, La/lag;->i:La/ul9;

    .line 105
    .line 106
    :goto_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v3, La/ru;

    .line 125
    .line 126
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v6, v3, La/ru;->h:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v0, v3, La/ru;->a:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v1, v3, La/ru;->c:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v2, v3, La/ru;->d:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v10, v3, La/ru;->e:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v7, v3, La/ru;->f:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v4, v3, La/ru;->g:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v11, v3, La/ru;->b:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v5, v3, La/ru;->i:Ljava/lang/Object;

    .line 146
    .line 147
    new-instance v0, La/uci;

    .line 148
    .line 149
    const/16 v1, 0x12

    .line 150
    .line 151
    invoke-direct {v0, v3, v1}, La/uci;-><init>(Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, v3, La/ru;->j:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v0, v3, La/ru;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/n5d0;

    .line 163
    .line 164
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, La/bei;

    .line 169
    .line 170
    iput-object v0, p0, La/l6g;->K1:La/bei;

    .line 171
    .line 172
    iput-object v7, p0, La/l6g;->L1:La/g2v;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 176
    .line 177
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/l6g;->H0()La/w6g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/w6g;->m:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/u6g;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v2, v0, v3, v4}, La/u6g;-><init>(La/w6g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    new-instance v5, La/s6n0;

    .line 15
    .line 16
    invoke-direct {v5, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/e00;

    .line 20
    .line 21
    const/16 v2, 0x11

    .line 22
    .line 23
    invoke-direct {v1, v0, v3, v2}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    new-instance v0, La/dnq;

    .line 27
    .line 28
    invoke-direct {v0, v5, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, La/ulb;->H(La/gmq;)La/p5a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, La/lkz;->a:La/lkz;

    .line 36
    .line 37
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v5, La/b5g;

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    invoke-direct {v5, v0, v1, v3, v6}, La/b5g;-><init>(La/p5a;La/clz;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x3

    .line 56
    invoke-static {v2, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/l6g;->H0()La/w6g;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v1, v1, La/w6g;->o:La/p7m0;

    .line 64
    .line 65
    new-instance v2, La/i89;

    .line 66
    .line 67
    const/16 v5, 0x16

    .line 68
    .line 69
    invoke-direct {v2, v1, v5}, La/i89;-><init>(La/gmq;B)V

    .line 70
    .line 71
    .line 72
    new-instance v1, La/k6g;

    .line 73
    .line 74
    invoke-direct {v1, p0, v3, v4}, La/k6g;-><init>(La/l6g;La/yje;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    new-instance v6, La/fze;

    .line 90
    .line 91
    invoke-direct {v6, v2, v4, v1, v3}, La/fze;-><init>(La/i89;La/clz;La/k6g;La/yje;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v3, v3, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, La/l6g;->H0()La/w6g;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v1, v1, La/w6g;->n:La/p7m0;

    .line 102
    .line 103
    new-instance v2, La/k6g;

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    invoke-direct {v2, p0, v3, v4}, La/k6g;-><init>(La/l6g;La/yje;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    new-instance v5, La/fze;

    .line 122
    .line 123
    invoke-direct {v5, v1, p0, v2, v3}, La/fze;-><init>(La/gmq;La/clz;La/k6g;La/yje;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final G0()La/m6g;
    .locals 2

    .line 1
    sget-object v0, La/l6g;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l6g;->N1:La/s0r;

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
    check-cast p0, La/m6g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/w6g;
    .locals 0

    .line 1
    iget-object p0, p0, La/l6g;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/w6g;

    .line 8
    .line 9
    return-object p0
.end method
