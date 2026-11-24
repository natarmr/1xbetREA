.class public final La/qvp0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/qvp0;",
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
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/pvp0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/pvp0;-><init>(La/qvp0;B)V

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
    iput-object v0, p0, La/qvp0;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/cwp0;

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
    new-instance v1, La/pvp0;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/pvp0;-><init>(La/qvp0;B)V

    .line 30
    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/qvp0;->l2:La/a8z;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x64d52c6b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/qvp0;->l2:La/a8z;

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
    check-cast v1, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v3, v0

    .line 26
    check-cast v3, La/k3t0;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v4, La/ukd;->a:La/cl5;

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    :cond_0
    new-instance v2, La/nop0;

    .line 43
    .line 44
    const/4 v0, 0x6

    .line 45
    invoke-direct {v2, p0, v0}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    sget-object v0, La/or00;->a:La/zfn;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/clz;

    .line 60
    .line 61
    sget-object v5, La/lkz;->a:La/lkz;

    .line 62
    .line 63
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {p1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    or-int/2addr v2, v6

    .line 76
    const/4 v6, 0x3

    .line 77
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    or-int/2addr v2, v6

    .line 82
    invoke-virtual {p1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    or-int/2addr v2, v6

    .line 87
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    if-ne v6, v4, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    move-object v4, v0

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    new-instance v2, La/kc70;

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    const/16 v7, 0x16

    .line 102
    .line 103
    move-object v4, v0

    .line 104
    invoke-direct/range {v2 .. v7}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v6, v2

    .line 111
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    invoke-static {p1, v4, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    new-instance v2, La/bw5;

    .line 122
    .line 123
    new-instance v0, La/tft;

    .line 124
    .line 125
    const/16 v4, 0x1a

    .line 126
    .line 127
    invoke-direct {v0, v1, v4}, La/tft;-><init>(La/l7m0;B)V

    .line 128
    .line 129
    .line 130
    const v4, 0x92223c6

    .line 131
    .line 132
    .line 133
    invoke-static {v4, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-instance v0, La/nhl0;

    .line 138
    .line 139
    const/16 v5, 0x14

    .line 140
    .line 141
    invoke-direct {v0, v1, p0, v5}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    const p0, -0x6a4b702

    .line 145
    .line 146
    .line 147
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    new-instance p0, La/tft;

    .line 152
    .line 153
    const/16 v0, 0x1b

    .line 154
    .line 155
    invoke-direct {p0, v1, v0}, La/tft;-><init>(La/l7m0;B)V

    .line 156
    .line 157
    .line 158
    const v0, 0x15ddad84

    .line 159
    .line 160
    .line 161
    invoke-static {v0, p0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    const/4 v7, 0x2

    .line 166
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 167
    .line 168
    .line 169
    const/4 p0, 0x0

    .line 170
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 171
    .line 172
    .line 173
    return-object v2
.end method
