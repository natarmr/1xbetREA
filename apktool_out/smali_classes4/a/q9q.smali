.class public final La/q9q;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/q9q;",
        "La/iw5;",
        "<init>",
        "()V",
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
.field public static final synthetic m2:I


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/x9q;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/yip;

    .line 13
    .line 14
    const/16 v2, 0x9

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/q9q;->l2:La/a8z;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, 0x1f97c485

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    iget-object v9, v2, La/q9q;->l2:La/a8z;

    .line 12
    .line 13
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v10, v0

    .line 18
    check-cast v10, La/k3t0;

    .line 19
    .line 20
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v11, La/ukd;->a:La/cl5;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    if-ne v1, v11, :cond_1

    .line 33
    .line 34
    :cond_0
    new-instance v0, La/pop;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/16 v7, 0xc

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const-class v3, La/q9q;

    .line 41
    .line 42
    const-string v4, "handleSideEffects"

    .line 43
    .line 44
    const-string v5, "handleSideEffects(Lorg/xplatform/feature/fin_bet/impl/presentation/dialogs/FinBetsInstrumentsDialogSideEffect;)V"

    .line 45
    .line 46
    invoke-direct/range {v0 .. v7}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v0

    .line 53
    :cond_1
    check-cast v1, La/jhy;

    .line 54
    .line 55
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    sget-object v0, La/lkz;->a:La/lkz;

    .line 58
    .line 59
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v8, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    or-int/2addr v1, v3

    .line 72
    const/4 v3, 0x3

    .line 73
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    or-int/2addr v1, v3

    .line 78
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    or-int/2addr v1, v3

    .line 83
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    if-ne v3, v11, :cond_3

    .line 90
    .line 91
    :cond_2
    new-instance v3, La/g6g;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-direct {v3, v10, v2, v0, v1}, La/g6g;-><init>(La/k3t0;La/q9q;La/pz40;La/yje;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 101
    .line 102
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/k3t0;

    .line 110
    .line 111
    check-cast v0, La/i3t0;

    .line 112
    .line 113
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, La/bw5;

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    invoke-static {v3, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    const-wide/16 v14, 0x0

    .line 125
    .line 126
    const/16 v16, 0x3b

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x1

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    invoke-static/range {v9 .. v16}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v4, v3

    .line 137
    sget-object v3, La/eeq;->h:La/ugd;

    .line 138
    .line 139
    new-instance v5, La/rgh;

    .line 140
    .line 141
    const/16 v6, 0xe

    .line 142
    .line 143
    invoke-direct {v5, v0, v2, v6}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const v0, -0x52e1028c

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v5, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    const/16 v6, 0xa

    .line 154
    .line 155
    move-object v2, v4

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 162
    .line 163
    .line 164
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

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
    const-class v0, La/o9q;

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
    instance-of v2, p1, La/o9q;

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
    check-cast v1, La/o9q;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v1, p1}, La/o9q;->a(La/i1w0;)La/tai;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, La/fiu0;

    .line 67
    .line 68
    iget-object p1, p1, La/tai;->G:La/n5d0;

    .line 69
    .line 70
    check-cast p1, La/dci;

    .line 71
    .line 72
    const-class v1, La/x9q;

    .line 73
    .line 74
    invoke-static {v1, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {v0, p1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/q9q;->k2:La/fiu0;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 85
    .line 86
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
