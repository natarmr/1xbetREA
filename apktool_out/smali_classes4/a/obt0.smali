.class public final La/obt0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/obt0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wxs0",
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
.field public static final R1:La/wxs0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:Z

.field public M1:La/fiu0;

.field public N1:La/wdk0;

.field public final O1:La/a8z;

.field public final P1:La/qdz;

.field public final Q1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/obt0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/obt0;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/wxs0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, v1}, La/wxs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/obt0;->R1:La/wxs0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/obt0;->K1:La/e9o0;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, La/obt0;->L1:Z

    .line 24
    .line 25
    const-class v0, La/wbt0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/nbt0;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/nbt0;-><init>(La/obt0;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/obt0;->O1:La/a8z;

    .line 44
    .line 45
    new-instance v0, La/qdz;

    .line 46
    .line 47
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/obt0;->P1:La/qdz;

    .line 51
    .line 52
    new-instance v0, La/khf0;

    .line 53
    .line 54
    const-string v1, "UNIVERSAL_CHAMP_PARAMS"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/obt0;->Q1:La/khf0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 21

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
    const-class v2, La/pbt0;

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
    instance-of v4, v1, La/pbt0;

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
    check-cast v3, La/pbt0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/obt0;->S1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/obt0;->Q1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v12, v1

    .line 69
    check-cast v12, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 70
    .line 71
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v5, v3, La/pbt0;->a:La/cad;

    .line 79
    .line 80
    iget-object v6, v3, La/pbt0;->b:La/pyg;

    .line 81
    .line 82
    iget-object v7, v3, La/pbt0;->c:La/roi0;

    .line 83
    .line 84
    iget-object v8, v3, La/pbt0;->d:La/rrc;

    .line 85
    .line 86
    iget-object v9, v3, La/pbt0;->e:La/epi0;

    .line 87
    .line 88
    iget-object v11, v3, La/pbt0;->f:La/ctf0;

    .line 89
    .line 90
    iget-object v13, v3, La/pbt0;->g:La/g2v;

    .line 91
    .line 92
    iget-object v14, v3, La/pbt0;->h:La/m1e;

    .line 93
    .line 94
    iget-object v15, v3, La/pbt0;->i:La/wdk0;

    .line 95
    .line 96
    iget-object v1, v3, La/pbt0;->j:La/pmi;

    .line 97
    .line 98
    iget-object v2, v3, La/pbt0;->k:La/wiu;

    .line 99
    .line 100
    iget-object v4, v3, La/pbt0;->l:La/pru;

    .line 101
    .line 102
    move-object/from16 v16, v1

    .line 103
    .line 104
    iget-object v1, v3, La/pbt0;->m:La/knf0;

    .line 105
    .line 106
    iget-object v3, v3, La/pbt0;->n:La/gii0;

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-object/from16 v18, v4

    .line 127
    .line 128
    new-instance v4, La/cr;

    .line 129
    .line 130
    move-object/from16 v19, v1

    .line 131
    .line 132
    move-object/from16 v17, v2

    .line 133
    .line 134
    move-object/from16 v20, v3

    .line 135
    .line 136
    invoke-direct/range {v4 .. v20}, La/cr;-><init>(La/cad;La/pyg;La/roi0;La/rrc;La/epi0;La/i1w0;La/ctf0;Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;La/g2v;La/m1e;La/wdk0;La/pmi;La/wiu;La/pru;La/knf0;La/gii0;)V

    .line 137
    .line 138
    .line 139
    new-instance v1, La/fiu0;

    .line 140
    .line 141
    iget-object v2, v4, La/cr;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, La/msi;

    .line 144
    .line 145
    const-class v3, La/wbt0;

    .line 146
    .line 147
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    iput-object v1, v0, La/obt0;->M1:La/fiu0;

    .line 155
    .line 156
    iput-object v15, v0, La/obt0;->N1:La/wdk0;

    .line 157
    .line 158
    return-void

    .line 159
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 160
    .line 161
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/obt0;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/p6r0;

    .line 21
    .line 22
    const/16 v1, 0x1d

    .line 23
    .line 24
    invoke-direct {p3, p0, v1}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const v1, -0x19488fe

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/obt0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/obt0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
