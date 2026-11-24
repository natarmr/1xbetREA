.class public final La/rsu0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/rsu0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/sxs0",
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
.field public static final O1:La/sxs0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public final M1:La/a8z;

.field public final N1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/rsu0;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;"

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
    sput-object v1, La/rsu0;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/sxs0;

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/rsu0;->O1:La/sxs0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/rsu0;->K1:Z

    .line 9
    .line 10
    const-class v0, La/ztu0;

    .line 11
    .line 12
    sget-object v1, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/rbt0;

    .line 19
    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/rsu0;->M1:La/a8z;

    .line 30
    .line 31
    new-instance v0, La/khf0;

    .line 32
    .line 33
    const-string v1, "screen_params"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/rsu0;->N1:La/khf0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 10

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
    const-class v1, La/ssu0;

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
    instance-of v3, v0, La/ssu0;

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
    check-cast v2, La/ssu0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/rsu0;->P1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/rsu0;->N1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 67
    .line 68
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v3, v2, La/ssu0;->a:La/cad;

    .line 76
    .line 77
    iget-object v4, v2, La/ssu0;->b:La/vby;

    .line 78
    .line 79
    iget-object v5, v2, La/ssu0;->c:La/ctf0;

    .line 80
    .line 81
    iget-object v6, v2, La/ssu0;->d:La/gii0;

    .line 82
    .line 83
    iget-object v7, v2, La/ssu0;->e:La/m1e;

    .line 84
    .line 85
    iget-object v8, v2, La/ssu0;->f:La/g2v;

    .line 86
    .line 87
    iget-object v2, v2, La/ssu0;->g:La/knf0;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v9, La/ru;

    .line 105
    .line 106
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v1, v9, La/ru;->a:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v0, v9, La/ru;->b:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v5, v9, La/ru;->e:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v7, v9, La/ru;->h:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v3, v9, La/ru;->c:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v8, v9, La/ru;->d:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v4, v9, La/ru;->f:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v6, v9, La/ru;->g:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v2, v9, La/ru;->i:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v0, La/yxi;

    .line 128
    .line 129
    const/16 v1, 0x18

    .line 130
    .line 131
    invoke-direct {v0, v9, v1}, La/yxi;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    iput-object v0, v9, La/ru;->j:Ljava/lang/Object;

    .line 135
    .line 136
    new-instance v0, La/fiu0;

    .line 137
    .line 138
    iget-object v1, v9, La/ru;->j:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, La/yxi;

    .line 141
    .line 142
    const-class v2, La/ztu0;

    .line 143
    .line 144
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 149
    .line 150
    .line 151
    iput-object v0, p0, La/rsu0;->L1:La/fiu0;

    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

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
    const/4 p3, 0x0

    .line 11
    const/4 v0, 0x6

    .line 12
    invoke-direct {p1, p2, p3, v0}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    new-instance p3, La/ggt0;

    .line 21
    .line 22
    const/16 v0, 0xc

    .line 23
    .line 24
    invoke-direct {p3, p0, v0}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const v0, -0x79740bee

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {p0, v0, v1, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/rsu0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
