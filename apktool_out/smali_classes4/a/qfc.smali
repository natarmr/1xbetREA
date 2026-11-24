.class public final La/qfc;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/qfc;",
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
.field public final k2:La/a8z;

.field public final l2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/pfc;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/pfc;-><init>(La/qfc;B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wez;->b:La/wez;

    .line 11
    .line 12
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/qfc;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/xgc;

    .line 19
    .line 20
    sget-object v1, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/pfc;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/pfc;-><init>(La/qfc;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/qfc;->l2:La/a8z;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 12

    .line 1
    const v0, 0x71ec9518

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/qfc;->P0()La/k3t0;

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
    if-nez v0, :cond_0

    .line 22
    .line 23
    if-ne v1, v3, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v4, La/zhb;

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    const/16 v11, 0x14

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    const-class v7, La/qfc;

    .line 32
    .line 33
    const-string v8, "handleSideEffect"

    .line 34
    .line 35
    const-string v9, "handleSideEffect(Lorg/xplatform/feature/online_call/impl/presentation/ui/choose_language_dialog/ChooseLanguageViewModel$SideEffect;)V"

    .line 36
    .line 37
    move-object v6, p0

    .line 38
    invoke-direct/range {v4 .. v11}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v1, v4

    .line 45
    :cond_1
    check-cast v1, La/jhy;

    .line 46
    .line 47
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    sget-object v0, La/or00;->a:La/zfn;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/clz;

    .line 56
    .line 57
    sget-object v4, La/lkz;->a:La/lkz;

    .line 58
    .line 59
    invoke-static {v1, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    or-int/2addr v1, v5

    .line 72
    const/4 v5, 0x3

    .line 73
    invoke-virtual {p1, v5}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    or-int/2addr v1, v5

    .line 78
    invoke-virtual {p1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    or-int/2addr v1, v5

    .line 83
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    if-ne v5, v3, :cond_2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    move-object v3, v0

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    :goto_0
    new-instance v1, La/pc;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    const/16 v6, 0x9

    .line 98
    .line 99
    move-object v3, v0

    .line 100
    invoke-direct/range {v1 .. v6}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v5, v1

    .line 107
    :goto_1
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 108
    .line 109
    invoke-static {p1, v3, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, La/qfc;->P0()La/k3t0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/i3t0;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, La/bw5;

    .line 123
    .line 124
    const/4 v2, 0x1

    .line 125
    move v3, v2

    .line 126
    invoke-static {v3, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    new-instance v4, La/ofc;

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-direct {v4, v0, p0, v7}, La/ofc;-><init>(La/pz40;La/qfc;B)V

    .line 134
    .line 135
    .line 136
    const v5, -0x48e95e37

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, La/ofc;

    .line 144
    .line 145
    invoke-direct {v5, v0, p0, v3}, La/ofc;-><init>(La/pz40;La/qfc;B)V

    .line 146
    .line 147
    .line 148
    const p0, 0x17e64287

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    const/16 v6, 0xa

    .line 156
    .line 157
    move-object v3, v4

    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 163
    .line 164
    .line 165
    return-object v1
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qfc;->l2:La/a8z;

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

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/iw5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/qfc;->P0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ngc;->a:La/ngc;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/qfc;->P0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/ogc;->a:La/ogc;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/sik;->h0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
