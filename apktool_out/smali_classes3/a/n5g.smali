.class public final La/n5g;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n5g;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qud",
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
.field public static final S1:La/qud;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/wdi;

.field public L1:La/g2v;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/a8z;

.field public final P1:La/l5g;

.field public final Q1:La/ejd;

.field public final R1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n5g;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDayFragmentBinding;"

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
    const-string v5, "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/n5g;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/qud;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/n5g;->S1:La/qud;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d00a5

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/i5g;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/i5g;-><init>(La/n5g;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/aqe;

    .line 14
    .line 15
    const/16 v2, 0x18

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v3, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v4, La/aqe;

    .line 23
    .line 24
    const/16 v5, 0x19

    .line 25
    .line 26
    invoke-direct {v4, v1, v5}, La/aqe;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-class v4, La/h6g;

    .line 34
    .line 35
    sget-object v6, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v6, La/cce;

    .line 42
    .line 43
    invoke-direct {v6, v1, v2}, La/cce;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v2, La/cce;

    .line 47
    .line 48
    invoke-direct {v2, v1, v5}, La/cce;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v4, v6, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/n5g;->M1:La/kiu0;

    .line 56
    .line 57
    sget-object v0, La/j5g;->a:La/j5g;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/n5g;->N1:La/s0r;

    .line 64
    .line 65
    new-instance v0, La/dpf;

    .line 66
    .line 67
    const/16 v1, 0x1a

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/dpf;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/n5g;->O1:La/a8z;

    .line 77
    .line 78
    new-instance v0, La/l5g;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {v0, p0, v2}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/n5g;->P1:La/l5g;

    .line 85
    .line 86
    new-instance v0, La/ejd;

    .line 87
    .line 88
    invoke-direct {v0, p0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/n5g;->Q1:La/ejd;

    .line 92
    .line 93
    new-instance v0, La/khf0;

    .line 94
    .line 95
    const-string v1, "PARAMS_KEY"

    .line 96
    .line 97
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, La/n5g;->R1:La/khf0;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/o5g;->b:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;

    .line 6
    .line 7
    new-instance v0, La/i5g;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/i5g;-><init>(La/n5g;B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/i5g;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p0, v3}, La/i5g;-><init>(La/n5g;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, v2}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDaySwitcher;->v(La/i5g;La/i5g;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/o5g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v2, La/k5g;

    .line 33
    .line 34
    invoke-direct {v2, p0, v0}, La/k5g;-><init>(La/n5g;Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p1, p1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 45
    .line 46
    new-instance v0, La/a1d;

    .line 47
    .line 48
    const/4 v2, 0x5

    .line 49
    invoke-direct {v0, p0, v2}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;->setOnDayEventListener(La/h5g;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p1, p1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p1, p1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 70
    .line 71
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object p1, p1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 88
    .line 89
    invoke-virtual {p0}, La/n5g;->H0()La/e5g;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object p1, p1, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 101
    .line 102
    new-instance v0, La/qpm0;

    .line 103
    .line 104
    iget-object v2, p0, La/n5g;->Q1:La/ejd;

    .line 105
    .line 106
    invoke-direct {v0, v2}, La/qpm0;-><init>(La/ejd;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-object p0, p0, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 117
    .line 118
    const/4 p1, 0x3

    .line 119
    invoke-static {p0, v1, p1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final C0()V
    .locals 11

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
    const-class v1, La/f5g;

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
    instance-of v3, v0, La/f5g;

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
    check-cast v2, La/f5g;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    sget-object v0, La/n5g;->U1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/n5g;->R1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 67
    .line 68
    iget-object v1, v2, La/f5g;->a:La/cad;

    .line 69
    .line 70
    iget-object v3, v2, La/f5g;->b:La/iip;

    .line 71
    .line 72
    iget-object v4, v2, La/f5g;->c:La/m1e;

    .line 73
    .line 74
    iget-object v5, v2, La/f5g;->d:La/g2v;

    .line 75
    .line 76
    iget-object v6, v2, La/f5g;->e:La/ctf0;

    .line 77
    .line 78
    iget-object v7, v2, La/f5g;->f:La/oeg0;

    .line 79
    .line 80
    iget-object v8, v2, La/f5g;->g:La/sjl0;

    .line 81
    .line 82
    iget-object v9, v2, La/f5g;->h:La/duj;

    .line 83
    .line 84
    iget-boolean v10, v0, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 85
    .line 86
    if-eqz v10, :cond_3

    .line 87
    .line 88
    iget-object v2, v2, La/f5g;->j:La/ul9;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    iget-object v2, v2, La/f5g;->i:La/ul9;

    .line 92
    .line 93
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v4, La/g45;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v0, v4, La/g45;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v4, La/g45;->b:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v8, v4, La/g45;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, v4, La/g45;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v5, v4, La/g45;->e:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v1, v4, La/g45;->f:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v9, v4, La/g45;->g:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v6, v4, La/g45;->h:Ljava/lang/Object;

    .line 131
    .line 132
    new-instance v0, La/uci;

    .line 133
    .line 134
    const/16 v1, 0xd

    .line 135
    .line 136
    invoke-direct {v0, v4, v1}, La/uci;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, v4, La/g45;->i:Ljava/lang/Object;

    .line 144
    .line 145
    iget-object v0, v4, La/g45;->i:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, La/n5d0;

    .line 148
    .line 149
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, La/wdi;

    .line 154
    .line 155
    iput-object v0, p0, La/n5g;->K1:La/wdi;

    .line 156
    .line 157
    iput-object v5, p0, La/n5g;->L1:La/g2v;

    .line 158
    .line 159
    return-void

    .line 160
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 161
    .line 162
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/n5g;->I0()La/h6g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/h6g;->m:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/wib;

    .line 8
    .line 9
    const/16 v3, 0xe

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    invoke-direct {v2, v0, v8, v3}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/s6n0;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/e00;

    .line 21
    .line 22
    const/16 v2, 0x10

    .line 23
    .line 24
    invoke-direct {v1, v0, v8, v2}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/dnq;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, La/ulb;->H(La/gmq;)La/p5a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, La/lkz;->a:La/lkz;

    .line 38
    .line 39
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, La/b5g;

    .line 52
    .line 53
    const/4 v5, 0x1

    .line 54
    invoke-direct {v4, v0, v1, v8, v5}, La/b5g;-><init>(La/p5a;La/clz;La/yje;B)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {v3, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/n5g;->I0()La/h6g;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v1, v1, La/h6g;->n:La/p7m0;

    .line 66
    .line 67
    new-instance v3, La/m5g;

    .line 68
    .line 69
    invoke-direct {v3, p0, v8, v2}, La/m5g;-><init>(La/n5g;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    new-instance v6, La/fze;

    .line 85
    .line 86
    invoke-direct {v6, v1, v2, v3, v8}, La/fze;-><init>(La/gmq;La/clz;La/m5g;La/yje;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v4, v8, v8, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/n5g;->I0()La/h6g;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v1, v1, La/h6g;->o:La/p7m0;

    .line 97
    .line 98
    new-instance v7, La/m5g;

    .line 99
    .line 100
    invoke-direct {v7, p0, v8, v5}, La/m5g;-><init>(La/n5g;La/yje;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    new-instance v4, La/fze;

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    move-object v5, v1

    .line 119
    invoke-direct/range {v4 .. v9}, La/fze;-><init>(La/gmq;La/clz;La/m5g;La/yje;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final G0()La/o5g;
    .locals 2

    .line 1
    sget-object v0, La/n5g;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/n5g;->N1:La/s0r;

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
    check-cast p0, La/o5g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/e5g;
    .locals 0

    .line 1
    iget-object p0, p0, La/n5g;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e5g;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0()La/h6g;
    .locals 0

    .line 1
    iget-object p0, p0, La/n5g;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/h6g;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/n5g;->G0()La/o5g;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/n5g;->H0()La/e5g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object p0, p0, La/n5g;->P1:La/l5g;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, La/yge0;->y(La/ahe0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/n5g;->H0()La/e5g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object p0, p0, La/n5g;->P1:La/l5g;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, La/yge0;->v(La/ahe0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
