.class public final La/ae1;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ae1;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gfk0",
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
.field public static final n2:La/gfk0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/es;

.field public l2:La/fiu0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ae1;

    .line 4
    .line 5
    const-string v2, "messagesBundle"

    .line 6
    .line 7
    const-string v3, "getMessagesBundle()Ljava/util/List;"

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
    sput-object v1, La/ae1;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gfk0;

    .line 21
    .line 22
    const/16 v1, 0x11

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/ae1;->n2:La/gfk0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/es;

    .line 5
    .line 6
    const-string v1, "MESSAGES_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ae1;->k2:La/es;

    .line 12
    .line 13
    const-class v0, La/ce1;

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
    new-instance v1, La/xd1;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, La/xd1;-><init>(La/ae1;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/ae1;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x3539f8ce

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/ae1;->m2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/k3t0;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v7, p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v5, La/c21;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/16 v12, 0x17

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const-class v8, La/ae1;

    .line 39
    .line 40
    const-string v9, "handleSideEffect"

    .line 41
    .line 42
    const-string v10, "handleSideEffect(Lorg/xplatform/messages/presentation/promoCodeBottom/models/PromoCodeMessageSideEffect;)V"

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    invoke-direct/range {v5 .. v12}, La/c21;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v5

    .line 52
    :goto_1
    check-cast v3, La/jhy;

    .line 53
    .line 54
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    sget-object p0, La/lkz;->a:La/lkz;

    .line 57
    .line 58
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    or-int/2addr v2, v3

    .line 71
    const/4 v3, 0x3

    .line 72
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    or-int/2addr v2, v3

    .line 77
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    or-int/2addr v2, v3

    .line 82
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    if-ne v3, v4, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v3, La/ee0;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v3, v1, v7, p0, v2}, La/ee0;-><init>(La/k3t0;La/ae1;La/pz40;La/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 100
    .line 101
    invoke-static {p1, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/k3t0;

    .line 109
    .line 110
    check-cast p0, La/i3t0;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v1, La/bw5;

    .line 122
    .line 123
    new-instance v0, La/v7i0;

    .line 124
    .line 125
    const/4 v3, 0x4

    .line 126
    invoke-direct {v0, p0, v3}, La/v7i0;-><init>(La/l7m0;B)V

    .line 127
    .line 128
    .line 129
    const v3, -0x27ec62c1

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    new-instance v0, La/ri1;

    .line 137
    .line 138
    const/16 v4, 0x19

    .line 139
    .line 140
    invoke-direct {v0, p0, v7, v4}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    const v4, -0x69962f89

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    new-instance v0, La/v7i0;

    .line 151
    .line 152
    const/4 v5, 0x5

    .line 153
    invoke-direct {v0, p0, v5}, La/v7i0;-><init>(La/l7m0;B)V

    .line 154
    .line 155
    .line 156
    const p0, 0x437e067d

    .line 157
    .line 158
    .line 159
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    const/4 v6, 0x2

    .line 164
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 165
    .line 166
    .line 167
    const/4 p0, 0x0

    .line 168
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 169
    .line 170
    .line 171
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 10

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
    const-class v0, La/be1;

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
    instance-of v2, p1, La/be1;

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
    check-cast v1, La/be1;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    sget-object p1, La/ae1;->o2:[La/iiy;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    aget-object p1, p1, v0

    .line 66
    .line 67
    iget-object v0, p0, La/ae1;->k2:La/es;

    .line 68
    .line 69
    invoke-virtual {v0, p0, p1}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v6, v1, La/be1;->e:La/ctf0;

    .line 77
    .line 78
    iget-object v4, v1, La/be1;->a:La/cad;

    .line 79
    .line 80
    iget-object v3, v1, La/be1;->c:La/d1p;

    .line 81
    .line 82
    iget-object v8, v1, La/be1;->d:La/peg0;

    .line 83
    .line 84
    iget-object v9, v1, La/be1;->b:La/b4j;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, La/rrd;

    .line 93
    .line 94
    invoke-direct/range {v2 .. v9}, La/rrd;-><init>(La/d1p;La/cad;Ljava/util/List;La/ctf0;La/i1w0;La/peg0;La/b4j;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, La/fiu0;

    .line 98
    .line 99
    iget-object v0, v2, La/rrd;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/t5i;

    .line 102
    .line 103
    const-class v1, La/ce1;

    .line 104
    .line 105
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, La/ae1;->l2:La/fiu0;

    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 116
    .line 117
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method
