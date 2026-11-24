.class public final La/wft;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wft;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/bek",
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
.field public static final n2:La/bek;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/n0o0;

.field public final l2:La/a8z;

.field public final m2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/wft;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/personal/api/presentation/model/gender_params/GenderChoiceScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/wft;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bek;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/wft;->n2:La/bek;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/wft;->p2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/uft;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/uft;-><init>(La/wft;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/wft;->k2:La/n0o0;

    .line 15
    .line 16
    const-class v0, La/cgt;

    .line 17
    .line 18
    sget-object v1, La/sre0;->a:La/tre0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/uft;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {v1, p0, v2}, La/uft;-><init>(La/wft;B)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xe

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/wft;->l2:La/a8z;

    .line 38
    .line 39
    new-instance v0, La/yzn0;

    .line 40
    .line 41
    const-string v1, "GENDER_CHOICE_SCREEN_PARAMS"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/wft;->m2:La/yzn0;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x21d37032

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/wft;->l2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/k3t0;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v4, La/ukd;->a:La/cl5;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    if-ne v2, v4, :cond_1

    .line 29
    .line 30
    :cond_0
    new-instance v5, La/h2s;

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const/16 v12, 0x1d

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const-class v8, La/wft;

    .line 37
    .line 38
    const-string v9, "handleSideEffect"

    .line 39
    .line 40
    const-string v10, "handleSideEffect(Lorg/xplatform/personal/impl/presentation/gender/models/GenderChoiceSideEffect;)V"

    .line 41
    .line 42
    move-object v7, p0

    .line 43
    invoke-direct/range {v5 .. v12}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v2, v5

    .line 50
    :cond_1
    check-cast v2, La/jhy;

    .line 51
    .line 52
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    sget-object v1, La/or00;->a:La/zfn;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La/clz;

    .line 61
    .line 62
    sget-object v5, La/lkz;->a:La/lkz;

    .line 63
    .line 64
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {p1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    or-int/2addr v2, v6

    .line 77
    const/4 v6, 0x3

    .line 78
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    or-int/2addr v2, v6

    .line 83
    invoke-virtual {p1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    or-int/2addr v2, v6

    .line 88
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    if-ne v6, v4, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-object v4, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    :goto_0
    new-instance v2, La/pc;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/16 v7, 0x14

    .line 103
    .line 104
    move-object v4, v1

    .line 105
    invoke-direct/range {v2 .. v7}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v6, v2

    .line 112
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 113
    .line 114
    invoke-static {p1, v4, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/k3t0;

    .line 122
    .line 123
    check-cast v0, La/i3t0;

    .line 124
    .line 125
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v1, La/bw5;

    .line 130
    .line 131
    const/4 v2, 0x1

    .line 132
    invoke-static {v2, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, La/tft;

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    invoke-direct {v3, v0, v7}, La/tft;-><init>(La/l7m0;B)V

    .line 140
    .line 141
    .line 142
    const v4, 0x2b2c18bf

    .line 143
    .line 144
    .line 145
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v4, La/rgh;

    .line 150
    .line 151
    const/16 v5, 0x16

    .line 152
    .line 153
    invoke-direct {v4, v0, p0, v5}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    const p0, 0x26c948fd

    .line 157
    .line 158
    .line 159
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    const/16 v6, 0xa

    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 170
    .line 171
    .line 172
    return-object v1
.end method
