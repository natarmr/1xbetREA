.class public final La/z31;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\n\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "La/z31;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/jdk0",
        "",
        "currentLineCount",
        "",
        "currentEllipsis",
        "isEllipsized",
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
.field public static final n2:La/jdk0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/khf0;

.field public l2:La/fiu0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/z31;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;"

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
    sput-object v1, La/z31;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jdk0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/z31;->n2:La/jdk0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "PARAMS_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/z31;->k2:La/khf0;

    .line 12
    .line 13
    const-class v0, La/c41;

    .line 14
    .line 15
    sget-object v1, La/sre0;->a:La/tre0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/y31;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, La/y31;-><init>(La/z31;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/z31;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, -0x58a6c4b6

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, La/z31;->m2:La/a8z;

    .line 12
    .line 13
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, La/k3t0;

    .line 18
    .line 19
    check-cast v2, La/i3t0;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v4, v2

    .line 30
    check-cast v4, La/b41;

    .line 31
    .line 32
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v10, 0x0

    .line 37
    sget-object v3, La/ukd;->a:La/cl5;

    .line 38
    .line 39
    if-ne v2, v3, :cond_0

    .line 40
    .line 41
    invoke-static {v10}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    move-object v7, v2

    .line 49
    check-cast v7, La/cgk0;

    .line 50
    .line 51
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-ne v2, v3, :cond_1

    .line 56
    .line 57
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    move-object v6, v2

    .line 67
    check-cast v6, La/pz40;

    .line 68
    .line 69
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-ne v2, v3, :cond_2

    .line 74
    .line 75
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    move-object v8, v2

    .line 85
    check-cast v8, La/pz40;

    .line 86
    .line 87
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-ne v2, v3, :cond_3

    .line 92
    .line 93
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 94
    .line 95
    invoke-static {v2, v1}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    move-object v5, v2

    .line 103
    check-cast v5, La/vne;

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    invoke-static {v2, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    new-instance v11, La/bw5;

    .line 111
    .line 112
    new-instance v2, La/un6;

    .line 113
    .line 114
    const/16 v3, 0xa

    .line 115
    .line 116
    invoke-direct {v2, v4, v3}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    const v3, -0x56307705

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    new-instance v2, La/ri1;

    .line 127
    .line 128
    const/16 v3, 0x17

    .line 129
    .line 130
    invoke-direct {v2, v4, v0, v3}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    const v0, 0x2079e233

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    new-instance v3, La/hgs0;

    .line 141
    .line 142
    const/4 v9, 0x1

    .line 143
    invoke-direct/range {v3 .. v9}, La/hgs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const v0, 0x3ff2c7b9

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    const/16 v16, 0x2

    .line 154
    .line 155
    invoke-direct/range {v11 .. v16}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 159
    .line 160
    .line 161
    return-object v11
.end method

.method public final V(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/a41;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/a41;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/a41;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    sget-object p1, La/z31;->o2:[La/iiy;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    iget-object v0, p0, La/z31;->k2:La/khf0;

    .line 64
    .line 65
    invoke-virtual {v0, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 70
    .line 71
    iget-object v0, v1, La/a41;->b:La/cad;

    .line 72
    .line 73
    iget-object v2, v1, La/a41;->a:La/ctf0;

    .line 74
    .line 75
    iget-object v3, v1, La/a41;->c:La/grj;

    .line 76
    .line 77
    iget-object v4, v1, La/a41;->d:La/s31;

    .line 78
    .line 79
    iget-object v1, v1, La/a41;->e:La/e41;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v5, La/ywq0;

    .line 85
    .line 86
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, v5, La/ywq0;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v3, v5, La/ywq0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v1, v5, La/ywq0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v4, v5, La/ywq0;->d:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v0, v5, La/ywq0;->e:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v2, v5, La/ywq0;->f:Ljava/lang/Object;

    .line 100
    .line 101
    new-instance p1, La/t5i;

    .line 102
    .line 103
    const/16 v0, 0x12

    .line 104
    .line 105
    invoke-direct {p1, v5, v0}, La/t5i;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 109
    .line 110
    new-instance p1, La/fiu0;

    .line 111
    .line 112
    iget-object v0, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/t5i;

    .line 115
    .line 116
    const-class v1, La/c41;

    .line 117
    .line 118
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, La/z31;->l2:La/fiu0;

    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 129
    .line 130
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/z31;->m2:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/k3t0;

    .line 11
    .line 12
    sget-object p1, La/u31;->a:La/u31;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
