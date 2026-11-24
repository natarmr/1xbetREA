.class public final La/sqq0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/sqq0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final S1:La/g9m0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/f9o0;

.field public final M1:La/s0r;

.field public N1:La/fiu0;

.field public final O1:La/kiu0;

.field public final P1:La/zz2;

.field public final Q1:La/zz2;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/sqq0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_bet/impl/databinding/TirageParametersTableFragmentBinding;"

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
    const-string v3, "tirageNum"

    .line 16
    .line 17
    const-string v5, "getTirageNum()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "totoType"

    .line 25
    .line 26
    const-string v6, "getTotoType()I"

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
    sput-object v1, La/sqq0;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/g9m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/sqq0;->S1:La/g9m0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0605

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/sqq0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/f9o0;

    .line 12
    .line 13
    const v1, 0x7f040ae3

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/sqq0;->L1:La/f9o0;

    .line 20
    .line 21
    sget-object v0, La/rqq0;->a:La/rqq0;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/sqq0;->M1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/qqq0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, p0, v1}, La/qqq0;-><init>(La/sqq0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/moq0;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-direct {v1, p0, v2}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    sget-object v2, La/wez;->b:La/wez;

    .line 42
    .line 43
    new-instance v3, La/moq0;

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    invoke-direct {v3, v1, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-class v2, La/yqq0;

    .line 54
    .line 55
    sget-object v3, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, La/r5p0;

    .line 62
    .line 63
    const/16 v4, 0x1a

    .line 64
    .line 65
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 66
    .line 67
    .line 68
    new-instance v4, La/r5p0;

    .line 69
    .line 70
    const/16 v5, 0x1b

    .line 71
    .line 72
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/sqq0;->O1:La/kiu0;

    .line 80
    .line 81
    new-instance v0, La/zz2;

    .line 82
    .line 83
    const-string v1, "tirage_num"

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/sqq0;->P1:La/zz2;

    .line 89
    .line 90
    new-instance v0, La/zz2;

    .line 91
    .line 92
    const-string v1, "toto_type"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/sqq0;->Q1:La/zz2;

    .line 98
    .line 99
    new-instance v0, La/qqq0;

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-direct {v0, p0, v1}, La/qqq0;-><init>(La/sqq0;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/sqq0;->R1:La/n0o0;

    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/sqq0;->G0()La/tqq0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/tqq0;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/qqq0;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p0, v1}, La/qqq0;-><init>(La/sqq0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/sqq0;->G0()La/tqq0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/tqq0;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 21
    .line 22
    iget-object v0, p0, La/sqq0;->R1:La/n0o0;

    .line 23
    .line 24
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/pqq0;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/sqq0;->G0()La/tqq0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/tqq0;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-static {p1, v0}, La/knm0;->h(Landroid/view/View;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/sqq0;->G0()La/tqq0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/tqq0;->c:Landroid/widget/LinearLayout;

    .line 48
    .line 49
    invoke-static {p0, v0}, La/knm0;->h(Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final C0()V
    .locals 14

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
    const-class v1, La/jqq0;

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
    instance-of v3, v0, La/jqq0;

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
    check-cast v2, La/jqq0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const/4 v0, 0x1

    .line 60
    sget-object v1, La/sqq0;->U1:[La/iiy;

    .line 61
    .line 62
    aget-object v0, v1, v0

    .line 63
    .line 64
    iget-object v3, p0, La/sqq0;->P1:La/zz2;

    .line 65
    .line 66
    invoke-virtual {v3, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    sget-object v0, La/ulr0;->b:La/g9m0;

    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    aget-object v1, v1, v3

    .line 74
    .line 75
    iget-object v3, p0, La/sqq0;->Q1:La/zz2;

    .line 76
    .line 77
    invoke-virtual {v3, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, La/g9m0;->b(I)La/ulr0;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v4, v2, La/jqq0;->a:La/cad;

    .line 96
    .line 97
    iget-object v8, v2, La/jqq0;->b:La/duj;

    .line 98
    .line 99
    iget-object v9, v2, La/jqq0;->c:La/gii0;

    .line 100
    .line 101
    iget-object v10, v2, La/jqq0;->d:La/m1e;

    .line 102
    .line 103
    iget-object v0, v2, La/jqq0;->e:La/wyu;

    .line 104
    .line 105
    iget-object v11, v2, La/jqq0;->f:La/knf0;

    .line 106
    .line 107
    iget-object v12, v2, La/jqq0;->g:La/g2v;

    .line 108
    .line 109
    iget-object v13, v2, La/jqq0;->h:La/ctf0;

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v3, La/pwi;

    .line 127
    .line 128
    invoke-direct/range {v3 .. v13}, La/pwi;-><init>(La/cad;Ljava/lang/Integer;La/ulr0;La/i1w0;La/duj;La/gii0;La/m1e;La/knf0;La/g2v;La/ctf0;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, La/fiu0;

    .line 132
    .line 133
    iget-object v1, v3, La/pwi;->k:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, La/xvi;

    .line 136
    .line 137
    const-class v2, La/yqq0;

    .line 138
    .line 139
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p0, La/sqq0;->N1:La/fiu0;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 150
    .line 151
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/sqq0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/yqq0;

    .line 8
    .line 9
    iget-object v2, v0, La/yqq0;->j:La/p7m0;

    .line 10
    .line 11
    new-instance v4, La/ssl0;

    .line 12
    .line 13
    const/16 v0, 0x1d

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v4, p0, v5, v0}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v0, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, La/hlq0;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-direct/range {v1 .. v6}, La/hlq0;-><init>(La/gmq;La/clz;La/ssl0;La/yje;C)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final G0()La/tqq0;
    .locals 2

    .line 1
    sget-object v0, La/sqq0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/sqq0;->M1:La/s0r;

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
    check-cast p0, La/tqq0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sqq0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sqq0;->L1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
