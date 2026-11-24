.class public final La/b9g;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/b9g;",
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
.field public static final R1:La/qud;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/xai;

.field public final L1:La/s0r;

.field public final M1:La/yzn0;

.field public final N1:La/yzn0;

.field public final O1:La/kiu0;

.field public P1:La/nl9;

.field public Q1:La/y8g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/b9g;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarPagesFragmentBinding;"

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
    const-string v3, "segmentType"

    .line 16
    .line 17
    const-string v5, "getSegmentType()Lorg/xplatform/cyber/calendar/api/domain/model/CyberCalendarType;"

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
    sput-object v1, La/b9g;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/qud;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/b9g;->R1:La/qud;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d00b1

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/z8g;->a:La/z8g;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/b9g;->L1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/yzn0;

    .line 16
    .line 17
    const-string v1, "PARAMS_BUNDLE_KEY"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/b9g;->M1:La/yzn0;

    .line 23
    .line 24
    new-instance v0, La/yzn0;

    .line 25
    .line 26
    const-string v1, "PARAMS_UFC_KEY"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/b9g;->N1:La/yzn0;

    .line 32
    .line 33
    new-instance v0, La/e8g;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, p0, v1}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/q7g;

    .line 40
    .line 41
    const/4 v2, 0x6

    .line 42
    invoke-direct {v1, p0, v2}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    sget-object v3, La/wez;->b:La/wez;

    .line 46
    .line 47
    new-instance v4, La/q7g;

    .line 48
    .line 49
    const/4 v5, 0x7

    .line 50
    invoke-direct {v4, v1, v5}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-class v3, La/g9g;

    .line 58
    .line 59
    sget-object v4, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, La/r7g;

    .line 66
    .line 67
    invoke-direct {v4, v1, v2}, La/r7g;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/r7g;

    .line 71
    .line 72
    invoke-direct {v2, v1, v5}, La/r7g;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/b9g;->O1:La/kiu0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/b9g;->G0()La/c9g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/c9g;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v2, La/nl9;

    .line 14
    .line 15
    invoke-virtual {p0}, La/b9g;->H0()La/yag;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v1, La/b9g;->S1:[La/iiy;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    aget-object v1, v1, v4

    .line 23
    .line 24
    iget-object v4, p0, La/b9g;->N1:La/yzn0;

    .line 25
    .line 26
    invoke-virtual {v4, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, La/n6r;->b()V

    .line 48
    .line 49
    .line 50
    iget-object v6, v1, La/n6r;->c:La/glz;

    .line 51
    .line 52
    sget-object v7, La/iun;->a:La/iun;

    .line 53
    .line 54
    new-instance v8, La/e8g;

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-direct {v8, p1, v1}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v2 .. v8}, La/nl9;-><init>(La/yag;ZLandroidx/fragment/app/e;La/glz;La/iun;La/e8g;)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, La/b9g;->P1:La/nl9;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 70
    .line 71
    .line 72
    new-instance v1, La/a9g;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v1, p0, p1, v2}, La/a9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 79
    .line 80
    .line 81
    :cond_0
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
    const-class v1, La/ol9;

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
    instance-of v3, v0, La/ol9;

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
    check-cast v2, La/ol9;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, La/b9g;->H0()La/yag;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    sget-object v0, La/b9g;->S1:[La/iiy;

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    aget-object v0, v0, v1

    .line 63
    .line 64
    iget-object v1, p0, La/b9g;->N1:La/yzn0;

    .line 65
    .line 66
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v6, v0

    .line 71
    check-cast v6, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v4, v2, La/ol9;->a:La/cad;

    .line 78
    .line 79
    iget-object v1, v2, La/ol9;->b:La/m1e;

    .line 80
    .line 81
    iget-object v7, v2, La/ol9;->c:La/g2v;

    .line 82
    .line 83
    iget-object v3, v2, La/ol9;->d:La/ctf0;

    .line 84
    .line 85
    iget-object v8, v2, La/ol9;->e:La/oeg0;

    .line 86
    .line 87
    iget-object v9, v2, La/ol9;->f:La/sjl0;

    .line 88
    .line 89
    move-object v10, v8

    .line 90
    iget-object v8, v2, La/ol9;->g:La/duj;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, v2, La/ol9;->i:La/ul9;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iget-object v0, v2, La/ol9;->h:La/ul9;

    .line 98
    .line 99
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v3, La/qgd;

    .line 115
    .line 116
    move-object v9, v0

    .line 117
    invoke-direct/range {v3 .. v9}, La/qgd;-><init>(La/cad;La/yag;Ljava/lang/Boolean;La/g2v;La/duj;La/ul9;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v3, La/qgd;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La/n5d0;

    .line 123
    .line 124
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/xai;

    .line 129
    .line 130
    iput-object v0, p0, La/b9g;->K1:La/xai;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/b9g;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/g9g;

    .line 8
    .line 9
    iget-object v2, v1, La/g9g;->j:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/f9g;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v3, v1, v8, v4}, La/f9g;-><init>(La/g9g;La/yje;B)V

    .line 16
    .line 17
    .line 18
    new-instance v5, La/s6n0;

    .line 19
    .line 20
    invoke-direct {v5, v2, v3}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/e00;

    .line 24
    .line 25
    const/16 v3, 0x15

    .line 26
    .line 27
    invoke-direct {v2, v1, v8, v3}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/dnq;

    .line 31
    .line 32
    invoke-direct {v1, v5, v2, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 33
    .line 34
    .line 35
    sget-object v2, La/lkz;->a:La/lkz;

    .line 36
    .line 37
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    new-instance v4, La/b1f;

    .line 50
    .line 51
    invoke-direct {v4, v1, v2, v8}, La/b1f;-><init>(La/dnq;La/clz;La/yje;)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    invoke-static {v3, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/g9g;

    .line 63
    .line 64
    iget-object v5, v0, La/g9g;->k:La/p7m0;

    .line 65
    .line 66
    new-instance v7, La/fob;

    .line 67
    .line 68
    const/16 v0, 0x1d

    .line 69
    .line 70
    invoke-direct {v7, p0, v8, v0}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v4, La/g8g;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-direct/range {v4 .. v9}, La/g8g;-><init>(La/gmq;La/clz;La/fob;La/yje;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final G0()La/c9g;
    .locals 2

    .line 1
    sget-object v0, La/b9g;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b9g;->L1:La/s0r;

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
    check-cast p0, La/c9g;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/yag;
    .locals 2

    .line 1
    sget-object v0, La/b9g;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b9g;->M1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/yag;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Y()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/b9g;->O1:La/kiu0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/g9g;

    .line 11
    .line 12
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, La/vlf;

    .line 17
    .line 18
    const/16 v3, 0xe

    .line 19
    .line 20
    invoke-direct {v2, v3}, La/vlf;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v5, La/f9g;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v5, p0, v3, v0}, La/f9g;-><init>(La/g9g;La/yje;B)V

    .line 27
    .line 28
    .line 29
    const/16 v6, 0xe

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final e0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/b9g;->H0()La/yag;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/yag;->b:La/yag;

    .line 6
    .line 7
    if-ne v0, v1, :cond_6

    .line 8
    .line 9
    iget-object v0, p0, La/b9g;->Q1:La/y8g;

    .line 10
    .line 11
    instance-of v1, v0, La/w8g;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, La/w8g;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    iget-object v1, p0, La/b9g;->O1:La/kiu0;

    .line 21
    .line 22
    invoke-virtual {v1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/g9g;

    .line 27
    .line 28
    iget-object v1, v1, La/g9g;->k:La/p7m0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/y8g;

    .line 35
    .line 36
    instance-of v3, v1, La/w8g;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    check-cast v1, La/w8g;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v1, v2

    .line 44
    :goto_1
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, v0, La/w8g;->a:Ljava/util/List;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget-wide v5, v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-wide v5, v3

    .line 64
    :goto_2
    const-wide/16 v7, 0x2710

    .line 65
    .line 66
    div-long/2addr v5, v7

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget-object v0, v1, La/w8g;->a:Ljava/util/List;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget-wide v3, v0, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 82
    .line 83
    :cond_3
    div-long/2addr v3, v7

    .line 84
    cmp-long v0, v3, v5

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, La/b9g;->G0()La/c9g;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v1, v1, La/c9g;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, La/b9g;->P1:La/nl9;

    .line 98
    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object v2, v1, La/zx5;->n:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, La/yge0;->g()V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {p0}, La/b9g;->G0()La/c9g;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v1, v1, La/c9g;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    const/4 v0, 0x4

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    const/4 v0, 0x0

    .line 122
    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    invoke-super {p0}, La/yx5;->e0()V

    .line 126
    .line 127
    .line 128
    return-void
.end method
