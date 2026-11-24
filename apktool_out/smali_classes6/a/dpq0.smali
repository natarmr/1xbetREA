.class public final La/dpq0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dpq0;",
        "La/yx5;",
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
.field public static final R1:La/m6m0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/s0r;

.field public final M1:La/kiu0;

.field public final N1:La/phf0;

.field public final O1:La/phf0;

.field public P1:La/spm0;

.field public Q1:La/fiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dpq0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentTirageCategoryDsBinding;"

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
    const-string v3, "totoType"

    .line 16
    .line 17
    const-string v5, "getTotoType()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "tirageCategoryResultQualifier"

    .line 25
    .line 26
    const-string v6, "getTirageCategoryResultQualifier()Ljava/lang/String;"

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
    sput-object v1, La/dpq0;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/m6m0;

    .line 45
    .line 46
    const/16 v1, 0x15

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/dpq0;->R1:La/m6m0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02f5

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
    iput-object v0, p0, La/dpq0;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/cpq0;->a:La/cpq0;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/dpq0;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/bpq0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/bpq0;-><init>(La/dpq0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/moq0;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/wez;->b:La/wez;

    .line 31
    .line 32
    new-instance v3, La/moq0;

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-direct {v3, v2, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-class v2, La/tpq0;

    .line 43
    .line 44
    sget-object v3, La/sre0;->a:La/tre0;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, La/r5p0;

    .line 51
    .line 52
    const/16 v4, 0x18

    .line 53
    .line 54
    invoke-direct {v3, v1, v4}, La/r5p0;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/r5p0;

    .line 58
    .line 59
    const/16 v5, 0x19

    .line 60
    .line 61
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/dpq0;->M1:La/kiu0;

    .line 69
    .line 70
    new-instance v0, La/phf0;

    .line 71
    .line 72
    const-string v1, "TOTO_TYPE"

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/dpq0;->N1:La/phf0;

    .line 78
    .line 79
    new-instance v0, La/phf0;

    .line 80
    .line 81
    const-string v1, "TIRAGE_NUM"

    .line 82
    .line 83
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/dpq0;->O1:La/phf0;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/z5r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/bpq0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/bpq0;-><init>(La/dpq0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/spm0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/z5r;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const v3, 0x7f07074a

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0, v2, v3, v2}, La/spm0;-><init>(La/nmo0;ZIB)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p1, La/spm0;->m:La/nmo0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, La/z5r;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/dpq0;->P1:La/spm0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p1, p1, La/z5r;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 49
    .line 50
    invoke-static {p1, v1}, La/knm0;->h(Landroid/view/View;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, La/z5r;->c:Landroid/widget/LinearLayout;

    .line 58
    .line 59
    invoke-static {p0, v1}, La/knm0;->h(Landroid/view/View;Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final C0()V
    .locals 17

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
    const-class v2, La/fpq0;

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
    instance-of v4, v1, La/fpq0;

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
    check-cast v3, La/fpq0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    sget-object v2, La/dpq0;->S1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/dpq0;->N1:La/phf0;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    const/4 v1, 0x2

    .line 69
    aget-object v1, v2, v1

    .line 70
    .line 71
    iget-object v2, v0, La/dpq0;->O1:La/phf0;

    .line 72
    .line 73
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v6, v3, La/fpq0;->a:La/cad;

    .line 91
    .line 92
    iget-object v11, v3, La/fpq0;->b:La/gii0;

    .line 93
    .line 94
    iget-object v13, v3, La/fpq0;->c:La/m1e;

    .line 95
    .line 96
    iget-object v12, v3, La/fpq0;->d:La/g2v;

    .line 97
    .line 98
    iget-object v7, v3, La/fpq0;->g:La/wsf0;

    .line 99
    .line 100
    iget-object v14, v3, La/fpq0;->e:La/ctf0;

    .line 101
    .line 102
    iget-object v15, v3, La/fpq0;->f:La/duj;

    .line 103
    .line 104
    iget-object v1, v3, La/fpq0;->h:La/knf0;

    .line 105
    .line 106
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v5, La/daf;

    .line 119
    .line 120
    move-object/from16 v16, v1

    .line 121
    .line 122
    invoke-direct/range {v5 .. v16}, La/daf;-><init>(La/cad;La/wsf0;La/i1w0;Ljava/lang/String;Ljava/lang/String;La/gii0;La/g2v;La/m1e;La/ctf0;La/duj;La/knf0;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, La/fiu0;

    .line 126
    .line 127
    iget-object v2, v5, La/daf;->m:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/xvi;

    .line 130
    .line 131
    const-class v3, La/tpq0;

    .line 132
    .line 133
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, v0, La/dpq0;->Q1:La/fiu0;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 144
    .line 145
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/dpq0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tpq0;

    .line 8
    .line 9
    iget-object v2, v0, La/tpq0;->l:La/p7m0;

    .line 10
    .line 11
    new-instance v4, La/ssl0;

    .line 12
    .line 13
    const/16 v0, 0x1c

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
    invoke-direct/range {v1 .. v6}, La/hlq0;-><init>(La/gmq;La/clz;La/ssl0;La/yje;B)V

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

.method public final G0()La/z5r;
    .locals 2

    .line 1
    sget-object v0, La/dpq0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dpq0;->L1:La/s0r;

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
    check-cast p0, La/z5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/dpq0;->G0()La/z5r;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/z5r;->e:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;->g1:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dpq0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
