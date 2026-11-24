.class public final La/zsb;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zsb;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/yk5",
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
.field public static final n2:La/yk5;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public l2:La/fiu0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/zsb;

    .line 4
    .line 5
    const-string v2, "key"

    .line 6
    .line 7
    const-string v3, "getKey()Ljava/lang/String;"

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
    sput-object v1, La/zsb;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/yk5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/zsb;->n2:La/yk5;

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
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "KEY_NAME"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/zsb;->k2:La/phf0;

    .line 12
    .line 13
    const-class v0, La/etb;

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
    new-instance v1, La/xsb;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v1, p0, v2}, La/xsb;-><init>(La/zsb;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/zsb;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x1ea2a1e0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v3, La/ukd;->a:La/cl5;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    :cond_0
    new-instance v1, La/wsb;

    .line 27
    .line 28
    invoke-direct {v1, p0, v7}, La/wsb;-><init>(La/zsb;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    sget-object v0, La/or00;->a:La/zfn;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/clz;

    .line 43
    .line 44
    sget-object v4, La/lkz;->a:La/lkz;

    .line 45
    .line 46
    invoke-static {v1, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    or-int/2addr v1, v5

    .line 59
    const/4 v5, 0x3

    .line 60
    invoke-virtual {p1, v5}, La/fet;->e(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    or-int/2addr v1, v5

    .line 65
    invoke-virtual {p1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    or-int/2addr v1, v5

    .line 70
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    if-ne v5, v3, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object v3, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    new-instance v1, La/pc;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/16 v6, 0x8

    .line 85
    .line 86
    move-object v3, v0

    .line 87
    invoke-direct/range {v1 .. v6}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v5, v1

    .line 94
    :goto_1
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    invoke-static {p1, v3, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/i3t0;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/ctb;

    .line 114
    .line 115
    new-instance v1, La/bw5;

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    move v3, v2

    .line 119
    invoke-static {v3, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    new-instance v4, La/sd8;

    .line 124
    .line 125
    const/16 v5, 0xb

    .line 126
    .line 127
    invoke-direct {v4, v0, v5}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    const v5, -0x742708f1

    .line 131
    .line 132
    .line 133
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-instance v5, La/ysb;

    .line 138
    .line 139
    invoke-direct {v5, v0, p0, v7}, La/ysb;-><init>(La/ctb;La/zsb;B)V

    .line 140
    .line 141
    .line 142
    const v6, -0x11b25f29

    .line 143
    .line 144
    .line 145
    invoke-static {v6, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    new-instance v6, La/ysb;

    .line 150
    .line 151
    invoke-direct {v6, v0, p0, v3}, La/ysb;-><init>(La/ctb;La/zsb;B)V

    .line 152
    .line 153
    .line 154
    const p0, 0x64453f11

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v6, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/xdr;La/xdr;La/ugd;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 166
    .line 167
    .line 168
    return-object v1
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zsb;->m2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 5

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
    const-class v0, La/osb;

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
    instance-of v2, p1, La/osb;

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
    check-cast v1, La/osb;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    sget-object p1, La/zsb;->o2:[La/iiy;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    iget-object v0, p0, La/zsb;->k2:La/phf0;

    .line 64
    .line 65
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, La/osb;->a:La/cad;

    .line 73
    .line 74
    iget-object v2, v1, La/osb;->b:La/ctf0;

    .line 75
    .line 76
    iget-object v3, v1, La/osb;->c:La/iw20;

    .line 77
    .line 78
    iget-object v1, v1, La/osb;->d:La/vby;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v4, La/esg0;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, v4, La/esg0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v4, La/esg0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v3, v4, La/esg0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p1, v4, La/esg0;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v1, v4, La/esg0;->e:Ljava/lang/Object;

    .line 100
    .line 101
    new-instance p1, La/pai;

    .line 102
    .line 103
    const/16 v0, 0x11

    .line 104
    .line 105
    invoke-direct {p1, v4, v0}, La/pai;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v4, La/esg0;->f:Ljava/lang/Object;

    .line 109
    .line 110
    new-instance p1, La/fiu0;

    .line 111
    .line 112
    iget-object v0, v4, La/esg0;->f:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/pai;

    .line 115
    .line 116
    const-class v1, La/etb;

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
    iput-object p1, p0, La/zsb;->l2:La/fiu0;

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
